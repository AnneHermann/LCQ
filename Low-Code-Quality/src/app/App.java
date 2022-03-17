package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import BspKnotensystem.BspKnotensystemFactory;
import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.DocumentRoot;
import BspKnotensystem.impl.BspKnotensystemFactoryImpl;
import BspKnotensystem.impl.BspKnotensystemPackageImpl;

public class App {

	public static void main(String[] args) {
		URI sourceUri = URI.createFileURI("C:\\Users\\hermanne\\eclipse-workspace\\test\\BspKnotensystem.xml");
//		// generate EPackages from schemas
//		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
//		Collection generatedPackages = xsdEcoreBuilder.generate(schemaURI);
//
//		// register the packages loaded from XSD
//		for (EObject generatedEObject : generatedPackages) {
//		    if (generatedEObject instanceof EPackage) {
//		        EPackage generatedPackage = (EPackage) generatedEObject;
//		        EPackage.Registry.INSTANCE.put(generatedPackage.getNsURI(),
//		            generatedPackage);
//		    }
//		}
//
//		// add file extension to registry
//		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
//		    .put(MY_FILE_EXTENSION, new GenericXMLResourceFactoryImpl());
		
		App.setupAndSaveEMFInstanceResource();
		
		BspKnotensystemPackage pack = BspKnotensystemPackageImpl.init();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(pack.getNsURI(), pack);
		System.out.println(pack.getNsURI());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		XMLResourceImpl resource = new XMLResourceImpl();
		try {
			resource.load(new FileInputStream(new File("C:\\Users\\hermanne\\eclipse-workspace - Kopie\\Low-Code-Quality\\BspKnotensystemLowerCase.xml")), Collections.EMPTY_MAP);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		Resource lowCodeProgram = resourceSet.getResource(sourceUri, true);
//		try {
//			lowCodeProgram.load(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			System.out.println("No");
//		}
	    DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
	    var nodeSystem = root.getNodeSystem();
	    var numberOfFunctionalNodes = nodeSystem.getNodes().get(0).getNode().size();
	    var numberOfSources = nodeSystem.getSources().get(0).getSource().size();
	    var numberOfResults = nodeSystem.getResults().get(0).getResult().size();
	    var numberOfNodes = numberOfFunctionalNodes + numberOfSources + numberOfResults;
	    
	    
	    System.out.println("Anzahl Knoten:" + numberOfNodes);
	}

	public static void setupAndSaveEMFInstanceResource() {
		ResourceSet rs = new ResourceSetImpl();
		// Here the resource is created, with fileextensions "gast" and "xml" (adapt
		// this to use your own file extension).
		Resource gastResource = createAndAddResource("C:\\\\Users\\\\hermanne\\\\eclipse-workspace - Kopie\\\\Low-Code-Quality\\\\Bsp.xml", new String[] {"xml" }, rs);
		// The root object is created by using (adapt this to create your own root
		// object)
		var root = BspKnotensystemFactory.eINSTANCE.createDocumentRoot();
		gastResource.getContents().add(root);
		var nst = BspKnotensystemFactory.eINSTANCE.createNodeSystemType();
		nst.setId("123");
		root.setNodeSystem(nst);
		saveResource(gastResource);
	}

	public static Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		}
		URI uri = URI.createFileURI(outputFile);
		Resource resource = rs.createResource(uri);
		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap());
		return resource;
	}

	public static void saveResource(Resource resource) {
		Map saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
