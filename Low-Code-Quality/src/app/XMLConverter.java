package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl;

public class XMLConverter {

	private static final String RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML = "transformedInput.xml";
	private static final String RELATIVE_PATH_TO_TRANSFORM_NODES_XSL = "transformNodes.xsl";
	private static final String RELATIVE_PATH_LOWER_CASE_XSL = "lowerCase.xsl";
	private static final String RELATIVE_PATH_TRANSFORMED_NODES_XML = "transformedNodes.xml";
	private static Object lock = new Object();

	public static DocumentRoot ConvertLowCodeXML(URI sourceUri) {

		PrepareXML(sourceUri.path());

		AlleKnotenFormartiertPackage pack = AlleKnotenFormartiertPackageImpl.init();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(pack.getNsURI(), pack);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		XMLResourceImpl resource = new XMLResourceImpl();

		try {
			resource.load(new FileInputStream(new File(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML).getAbsolutePath()),
					Collections.EMPTY_MAP);
		} catch (FileNotFoundException e1) {
			System.out.println("Datei konnte nicht gefunden werden.");
			e1.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Datei konnte nicht eingelesen werden.");
			e1.printStackTrace();
		}

		return (DocumentRoot) resource.getContents().get(0);

	}

	private static void PrepareXML(String sourceUri) {
		var inputXml = new StreamSource(new File(sourceUri));
		var lowerCaseXsl = new StreamSource(new File(RELATIVE_PATH_LOWER_CASE_XSL).getAbsolutePath());
		var transformNodesXsl = new StreamSource(new File(RELATIVE_PATH_TO_TRANSFORM_NODES_XSL).getAbsolutePath());
		var transformedNodesXml = new StreamResult(new File(RELATIVE_PATH_TRANSFORMED_NODES_XML));

		synchronized (lock) {
			TryTransformXML(transformNodesXsl, inputXml, transformedNodesXml);
		}

		var tempTransformedXml = new StreamSource(new File(RELATIVE_PATH_TRANSFORMED_NODES_XML).getAbsolutePath());
		var transformedXml = new StreamResult(new File(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML));

		TryTransformXML(lowerCaseXsl, tempTransformedXml, transformedXml);

	}

	private static void TryTransformXML(Source xsl, Source xmlInput, Result xmlOutput) {
		try {
			var transformer = TransformerFactory.newInstance().newTransformer(xsl);
			transformer.transform(xmlInput, xmlOutput);
		} catch (TransformerException e) {
			System.out.println("Die Knotensystem-XML konnte nicht ins richtige Format transformiert werden.");
			e.printStackTrace();
		}
	}

}
