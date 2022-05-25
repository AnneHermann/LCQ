package app;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.util.AlleKnotenFormartiertResourceFactoryImpl;

public class XMLConverter {

	private static final String RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML = "transformedInput.xml";

	public static DocumentRoot ConvertLowCodeXML(URI sourceUri) {

		XMLPreprocessor.PrepareXML(sourceUri.path());

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new AlleKnotenFormartiertResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(AlleKnotenFormartiertPackage.eNS_URI,
				AlleKnotenFormartiertPackage.eINSTANCE);

		File file = new File(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML);

		try {

			Resource resource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);
			return (DocumentRoot) resource.getContents().get(0);

		} catch (RuntimeException exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}

		return null;
	}
	

}
