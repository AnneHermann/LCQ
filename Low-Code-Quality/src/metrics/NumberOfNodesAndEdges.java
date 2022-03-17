package metrics;

import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;


public class NumberOfNodesAndEdges implements IMetric {

	public void setUp() {
		org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup(); // *.ocl
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup(); // *.essentialocl
		org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup.doSetup(); // *.ecore, *.oclinecore
		org.eclipse.ocl.xtext.oclstdlib.OCLstdlibStandaloneSetup.doSetup(); // *.oclstdlib#
		
		
		org.eclipse.ocl.pivot.OCL.initialize(resourceSet);
		org.eclipse.ocl.pivot.model.OCLstdlib.install(); 
		
		//XText parsers?

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int calculate() {
		
		OCL ocl = OCL.newInstance();
		
		OCLHelper helper = ocl.createOCLHelper(EXTLibraryPackage.Literals.LIBRARY);
		ExpressionInOCL invariant = helper.createInvariant("books->forAll(b1, b2 | b1 <> b2 implies b1.title <> b2.title)");
		ExpressionInOCL query = helper.createQuery("books->collect(b : Book | b.category)->asSet()");

		// create a Query to evaluate our query expression
		Query queryEval = ocl.createQuery(query);
		// create another to check our constraint
		Query constraintEval = ocl.createQuery(invariant);
		return 0;
	}

}
