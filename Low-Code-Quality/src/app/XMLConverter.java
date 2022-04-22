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

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.DocumentRoot;
import BspKnotensystem.impl.BspKnotensystemPackageImpl;

public class XMLConverter {

	private static final String RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML = "transformedNodeSystem.xml";
	private static final String RELATIVE_PATH_TO_TRANSFORM_NODES_XSL = "TransformNodes.xsl";
	private static final String RELATIVE_PATH_LOWER_CASE_XSL = "lowerCase.xsl";

	public static DocumentRoot convertLowCodeXML(URI sourceUri) {

		prepareXML(sourceUri.path());

		BspKnotensystemPackage pack = BspKnotensystemPackageImpl.init();

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
			System.out.println("Datei konnte nicht gelesen werden.");
			e1.printStackTrace();
		}

		return (DocumentRoot) resource.getContents().get(0);

	}

	private static void prepareXML(String sourceUri) {
		Source nodeSystemXml = new StreamSource(new File(sourceUri));
		Source lowerCaseXsl = new StreamSource(new File(RELATIVE_PATH_LOWER_CASE_XSL).getAbsolutePath());
		Source transformNodesXsl = new StreamSource(new File(RELATIVE_PATH_TO_TRANSFORM_NODES_XSL).getAbsolutePath());
		Result transformedXml = new StreamResult(new File(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML));

		tryTransformXML(lowerCaseXsl, nodeSystemXml, transformedXml);
		tryTransformXML(transformNodesXsl, nodeSystemXml, transformedXml);

	}

	private static void tryTransformXML(Source xsl, Source xmlInput, Result xmlOutput) {
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
			transformer.transform(xmlInput, xmlOutput);
		} catch (TransformerException e) {
			System.out.println("Die Knotensystem-XML konnte nicht ins richtige Format transformiert werden.");
			e.printStackTrace();
		}
	}

}
