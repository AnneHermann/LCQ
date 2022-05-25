package app;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLPreprocessor {

	private static final String RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML = "transformedInput.xml";
	private static final String RELATIVE_PATH_LOWER_CASE_XSL = "lowerCase.xsl";

	public static void PrepareXML(String sourceUri) {
		var inputXml = new StreamSource(new File(sourceUri));
		var lowerCaseXsl = new StreamSource(new File(RELATIVE_PATH_LOWER_CASE_XSL).getAbsolutePath());
		var transformedXml = new StreamResult(new File(RELATIVE_PATH_TO_TRANSFORMED_NODE_SYSTEM_XML));

		TryTransformXML(lowerCaseXsl, inputXml, transformedXml);

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
