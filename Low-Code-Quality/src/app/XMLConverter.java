package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.DocumentRoot;
import BspKnotensystem.impl.BspKnotensystemPackageImpl;

public class XMLConverter {

	public static DocumentRoot convertLowCodeXML(URI sourceUri) {

		BspKnotensystemPackage pack = BspKnotensystemPackageImpl.init();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(pack.getNsURI(), pack);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		
		XMLResourceImpl resource = new XMLResourceImpl();
		try {
			resource.load(new FileInputStream(new File(sourceUri.path())), Collections.EMPTY_MAP);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return (DocumentRoot) resource.getContents().get(0);

	}

}
