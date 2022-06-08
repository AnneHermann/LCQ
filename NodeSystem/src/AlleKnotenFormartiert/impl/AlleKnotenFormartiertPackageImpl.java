/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.ANodeType;
import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.ColumnDecorationsType;
import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.FunctionResultColumnType;
import AlleKnotenFormartiert.FunctionResultType;
import AlleKnotenFormartiert.FunctionResultsType;
import AlleKnotenFormartiert.InputType;
import AlleKnotenFormartiert.InputsType;
import AlleKnotenFormartiert.ItemType;
import AlleKnotenFormartiert.NewDataSetType;
import AlleKnotenFormartiert.NewEClass148;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.NodeType;
import AlleKnotenFormartiert.NodesType;
import AlleKnotenFormartiert.NotFunctionalNodeType;
import AlleKnotenFormartiert.NullNodeType;
import AlleKnotenFormartiert.OutputType;
import AlleKnotenFormartiert.ResultType;
import AlleKnotenFormartiert.ResultsType;
import AlleKnotenFormartiert.SourceColumnType;
import AlleKnotenFormartiert.SourceColumnsType;
import AlleKnotenFormartiert.SourceType;
import AlleKnotenFormartiert.SourcesType;
import AlleKnotenFormartiert.ViewOptionsType;
import AlleKnotenFormartiert.VisibleColumnsType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlleKnotenFormartiertPackageImpl extends EPackageImpl implements AlleKnotenFormartiertPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionResultColumnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionResultsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newDataSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnDecorationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceColumnsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceColumnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass148EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibleColumnsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewOptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFunctionalNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNodeTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlleKnotenFormartiertPackageImpl() {
		super(eNS_URI, AlleKnotenFormartiertFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlleKnotenFormartiertPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlleKnotenFormartiertPackage init() {
		if (isInited) return (AlleKnotenFormartiertPackage)EPackage.Registry.INSTANCE.getEPackage(AlleKnotenFormartiertPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlleKnotenFormartiertPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlleKnotenFormartiertPackageImpl theAlleKnotenFormartiertPackage = registeredAlleKnotenFormartiertPackage instanceof AlleKnotenFormartiertPackageImpl ? (AlleKnotenFormartiertPackageImpl)registeredAlleKnotenFormartiertPackage : new AlleKnotenFormartiertPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAlleKnotenFormartiertPackage.createPackageContents();

		// Initialize created meta-data
		theAlleKnotenFormartiertPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlleKnotenFormartiertPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlleKnotenFormartiertPackage.eNS_URI, theAlleKnotenFormartiertPackage);
		return theAlleKnotenFormartiertPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FunctionResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Inputs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewDataSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeSystem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Source() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionResultColumnType() {
		return functionResultColumnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_Id() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_ResultRank() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_Column() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_ValueType() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionResultColumnType_ColumnDecorations() {
		return (EReference)functionResultColumnTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_Nullable() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_ResultDeleted() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_ColumnDisplayName() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_Name() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_ResultDisplayName() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultColumnType_Missing() {
		return (EAttribute)functionResultColumnTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionResultsType() {
		return functionResultsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionResultsType_FunctionResult() {
		return (EReference)functionResultsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionResultType() {
		return functionResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionResultType_FunctionResultColumn() {
		return (EReference)functionResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionResultType_FunctionResult() {
		return (EReference)functionResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultType_ShowUsedColumnsOnly() {
		return (EAttribute)functionResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionResultType_Collapsed() {
		return (EAttribute)functionResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionResultType_Outputs() {
		return (EReference)functionResultTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputsType() {
		return inputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputsType_Input() {
		return (EReference)inputsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputType() {
		return inputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputType_Source() {
		return (EReference)inputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Parameter() {
		return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewDataSetType() {
		return newDataSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewDataSetType_Group() {
		return (EAttribute)newDataSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewDataSetType_Source() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewDataSetType_Inputs() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewDataSetType_FunctionResult() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewDataSetType_NodeSystem() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_NodeClassId() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_NodeName() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Collapsed() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Inputs() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Outputs() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSystemType() {
		return nodeSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Sources() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Nodes() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_FunctionResults() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Results() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_ExpressionLanguageName() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_Id() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_RuntimeVersion() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_Version() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_ViewOptions() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullNodeType() {
		return nullNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullNodeType_Id() {
		return (EAttribute)nullNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullNodeType_Location() {
		return (EAttribute)nullNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullNodeType_NodeClassId() {
		return (EAttribute)nullNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullNodeType_NodeName() {
		return (EAttribute)nullNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsType() {
		return resultsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultsType_Id() {
		return (EAttribute)resultsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultsType_Location() {
		return (EAttribute)resultsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsType_Result() {
		return (EReference)resultsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcesType() {
		return sourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcesType_Source() {
		return (EReference)sourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Node() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Value() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_TableName() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_SourceColumns() {
		return (EReference)sourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Rank() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_VisibleColumns() {
		return (EReference)sourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Collapsed() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Expanded() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_Outputs() {
		return (EReference)sourceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnDecorationsType() {
		return columnDecorationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_ForeColor() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_BackColor() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_Alignment() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_DisplayFormat() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_Category() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDecorationsType_Description() {
		return (EAttribute)columnDecorationsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceColumnsType() {
		return sourceColumnsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceColumnsType_SourceColumn() {
		return (EReference)sourceColumnsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceColumnType() {
		return sourceColumnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumnType_Id() {
		return (EAttribute)sourceColumnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumnType_Column() {
		return (EAttribute)sourceColumnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumnType_ValueType() {
		return (EAttribute)sourceColumnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumnType_Nullable() {
		return (EAttribute)sourceColumnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumnType_Rank() {
		return (EAttribute)sourceColumnTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass148() {
		return newEClass148EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleColumnsType() {
		return visibleColumnsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibleColumnsType_Item() {
		return (EReference)visibleColumnsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Value() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewOptionsType() {
		return viewOptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewOptionsType_ConnectionStyle() {
		return (EAttribute)viewOptionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodesType() {
		return nodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesType_Node() {
		return (EReference)nodesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		return outputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_NodeId() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotFunctionalNodeType() {
		return notFunctionalNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotFunctionalNodeType_Input() {
		return (EReference)notFunctionalNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANodeType() {
		return aNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANodeType_AdjacencyList() {
		return (EAttribute)aNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANodeType_Id() {
		return (EAttribute)aNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANodeType_Name() {
		return (EAttribute)aNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANodeType_Description() {
		return (EAttribute)aNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANodeType_Location() {
		return (EAttribute)aNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleKnotenFormartiertFactory getAlleKnotenFormartiertFactory() {
		return (AlleKnotenFormartiertFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FUNCTION_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INPUTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_DATA_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NODE_SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE);

		functionResultColumnTypeEClass = createEClass(FUNCTION_RESULT_COLUMN_TYPE);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__ID);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__COLUMN);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE);
		createEReference(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__NULLABLE);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__NAME);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME);
		createEAttribute(functionResultColumnTypeEClass, FUNCTION_RESULT_COLUMN_TYPE__MISSING);

		functionResultsTypeEClass = createEClass(FUNCTION_RESULTS_TYPE);
		createEReference(functionResultsTypeEClass, FUNCTION_RESULTS_TYPE__FUNCTION_RESULT);

		functionResultTypeEClass = createEClass(FUNCTION_RESULT_TYPE);
		createEReference(functionResultTypeEClass, FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN);
		createEReference(functionResultTypeEClass, FUNCTION_RESULT_TYPE__FUNCTION_RESULT);
		createEAttribute(functionResultTypeEClass, FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY);
		createEAttribute(functionResultTypeEClass, FUNCTION_RESULT_TYPE__COLLAPSED);
		createEReference(functionResultTypeEClass, FUNCTION_RESULT_TYPE__OUTPUTS);

		inputsTypeEClass = createEClass(INPUTS_TYPE);
		createEReference(inputsTypeEClass, INPUTS_TYPE__INPUT);

		inputTypeEClass = createEClass(INPUT_TYPE);
		createEReference(inputTypeEClass, INPUT_TYPE__SOURCE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__PARAMETER);

		newDataSetTypeEClass = createEClass(NEW_DATA_SET_TYPE);
		createEAttribute(newDataSetTypeEClass, NEW_DATA_SET_TYPE__GROUP);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__SOURCE);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__INPUTS);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__FUNCTION_RESULT);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__NODE_SYSTEM);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEAttribute(nodeTypeEClass, NODE_TYPE__NODE_CLASS_ID);
		createEAttribute(nodeTypeEClass, NODE_TYPE__NODE_NAME);
		createEAttribute(nodeTypeEClass, NODE_TYPE__COLLAPSED);
		createEReference(nodeTypeEClass, NODE_TYPE__INPUTS);
		createEReference(nodeTypeEClass, NODE_TYPE__OUTPUTS);

		nodeSystemTypeEClass = createEClass(NODE_SYSTEM_TYPE);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__SOURCES);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__NODES);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__FUNCTION_RESULTS);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__RESULTS);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__ID);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__RUNTIME_VERSION);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__VERSION);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__VIEW_OPTIONS);

		nullNodeTypeEClass = createEClass(NULL_NODE_TYPE);
		createEAttribute(nullNodeTypeEClass, NULL_NODE_TYPE__ID);
		createEAttribute(nullNodeTypeEClass, NULL_NODE_TYPE__LOCATION);
		createEAttribute(nullNodeTypeEClass, NULL_NODE_TYPE__NODE_CLASS_ID);
		createEAttribute(nullNodeTypeEClass, NULL_NODE_TYPE__NODE_NAME);

		resultsTypeEClass = createEClass(RESULTS_TYPE);
		createEAttribute(resultsTypeEClass, RESULTS_TYPE__ID);
		createEAttribute(resultsTypeEClass, RESULTS_TYPE__LOCATION);
		createEReference(resultsTypeEClass, RESULTS_TYPE__RESULT);

		sourcesTypeEClass = createEClass(SOURCES_TYPE);
		createEReference(sourcesTypeEClass, SOURCES_TYPE__SOURCE);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__NODE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__VALUE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__TABLE_NAME);
		createEReference(sourceTypeEClass, SOURCE_TYPE__SOURCE_COLUMNS);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__RANK);
		createEReference(sourceTypeEClass, SOURCE_TYPE__VISIBLE_COLUMNS);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__COLLAPSED);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__EXPANDED);
		createEReference(sourceTypeEClass, SOURCE_TYPE__OUTPUTS);

		columnDecorationsTypeEClass = createEClass(COLUMN_DECORATIONS_TYPE);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__FORE_COLOR);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__BACK_COLOR);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__ALIGNMENT);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__CATEGORY);
		createEAttribute(columnDecorationsTypeEClass, COLUMN_DECORATIONS_TYPE__DESCRIPTION);

		sourceColumnsTypeEClass = createEClass(SOURCE_COLUMNS_TYPE);
		createEReference(sourceColumnsTypeEClass, SOURCE_COLUMNS_TYPE__SOURCE_COLUMN);

		sourceColumnTypeEClass = createEClass(SOURCE_COLUMN_TYPE);
		createEAttribute(sourceColumnTypeEClass, SOURCE_COLUMN_TYPE__ID);
		createEAttribute(sourceColumnTypeEClass, SOURCE_COLUMN_TYPE__COLUMN);
		createEAttribute(sourceColumnTypeEClass, SOURCE_COLUMN_TYPE__VALUE_TYPE);
		createEAttribute(sourceColumnTypeEClass, SOURCE_COLUMN_TYPE__NULLABLE);
		createEAttribute(sourceColumnTypeEClass, SOURCE_COLUMN_TYPE__RANK);

		resultTypeEClass = createEClass(RESULT_TYPE);

		newEClass148EClass = createEClass(NEW_ECLASS148);

		visibleColumnsTypeEClass = createEClass(VISIBLE_COLUMNS_TYPE);
		createEReference(visibleColumnsTypeEClass, VISIBLE_COLUMNS_TYPE__ITEM);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__VALUE);

		viewOptionsTypeEClass = createEClass(VIEW_OPTIONS_TYPE);
		createEAttribute(viewOptionsTypeEClass, VIEW_OPTIONS_TYPE__CONNECTION_STYLE);

		nodesTypeEClass = createEClass(NODES_TYPE);
		createEReference(nodesTypeEClass, NODES_TYPE__NODE);

		outputTypeEClass = createEClass(OUTPUT_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__NODE_ID);

		aNodeTypeEClass = createEClass(ANODE_TYPE);
		createEAttribute(aNodeTypeEClass, ANODE_TYPE__ADJACENCY_LIST);
		createEAttribute(aNodeTypeEClass, ANODE_TYPE__ID);
		createEAttribute(aNodeTypeEClass, ANODE_TYPE__NAME);
		createEAttribute(aNodeTypeEClass, ANODE_TYPE__DESCRIPTION);
		createEAttribute(aNodeTypeEClass, ANODE_TYPE__LOCATION);

		notFunctionalNodeTypeEClass = createEClass(NOT_FUNCTIONAL_NODE_TYPE);
		createEReference(notFunctionalNodeTypeEClass, NOT_FUNCTIONAL_NODE_TYPE__INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionResultTypeEClass.getESuperTypes().add(this.getNotFunctionalNodeType());
		nodeTypeEClass.getESuperTypes().add(this.getANodeType());
		sourceTypeEClass.getESuperTypes().add(this.getANodeType());
		resultTypeEClass.getESuperTypes().add(this.getNotFunctionalNodeType());
		notFunctionalNodeTypeEClass.getESuperTypes().add(this.getANodeType());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FunctionResult(), this.getFunctionResultType(), null, "functionResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Inputs(), this.getInputsType(), null, "inputs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewDataSet(), this.getNewDataSetType(), null, "newDataSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NodeSystem(), this.getNodeSystemType(), null, "nodeSystem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Source(), this.getSourceType(), null, "source", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionResultColumnTypeEClass, FunctionResultColumnType.class, "FunctionResultColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionResultColumnType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_ResultRank(), theXMLTypePackage.getString(), "resultRank", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_Column(), theXMLTypePackage.getString(), "column", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_ValueType(), theXMLTypePackage.getString(), "valueType", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionResultColumnType_ColumnDecorations(), this.getColumnDecorationsType(), null, "columnDecorations", null, 0, -1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_Nullable(), theXMLTypePackage.getString(), "nullable", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_ResultDeleted(), theXMLTypePackage.getString(), "resultDeleted", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_ColumnDisplayName(), theXMLTypePackage.getString(), "columnDisplayName", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_ResultDisplayName(), theXMLTypePackage.getString(), "resultDisplayName", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultColumnType_Missing(), theXMLTypePackage.getString(), "missing", null, 0, 1, FunctionResultColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionResultsTypeEClass, FunctionResultsType.class, "FunctionResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionResultsType_FunctionResult(), this.getFunctionResultType(), null, "functionResult", null, 0, -1, FunctionResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionResultTypeEClass, FunctionResultType.class, "FunctionResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionResultType_FunctionResultColumn(), this.getFunctionResultColumnType(), null, "functionResultColumn", null, 0, -1, FunctionResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionResultType_FunctionResult(), this.getFunctionResultType(), null, "functionResult", null, 0, -1, FunctionResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultType_ShowUsedColumnsOnly(), theXMLTypePackage.getString(), "showUsedColumnsOnly", null, 0, 1, FunctionResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionResultType_Collapsed(), theXMLTypePackage.getString(), "collapsed", null, 0, 1, FunctionResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionResultType_Outputs(), this.getOutputType(), null, "outputs", null, 0, -1, FunctionResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputsTypeEClass, InputsType.class, "InputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputsType_Input(), this.getInputType(), null, "input", null, 0, -1, InputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputType_Source(), this.getSourceType(), null, "source", null, 0, -1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_Parameter(), theXMLTypePackage.getString(), "parameter", null, 0, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newDataSetTypeEClass, NewDataSetType.class, "NewDataSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewDataSetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NewDataSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_Source(), this.getSourceType(), null, "source", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_Inputs(), this.getInputsType(), null, "inputs", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_FunctionResult(), this.getFunctionResultType(), null, "functionResult", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_NodeSystem(), this.getNodeSystemType(), null, "nodeSystem", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeType_NodeClassId(), theXMLTypePackage.getString(), "nodeClassId", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_NodeName(), theXMLTypePackage.getString(), "nodeName", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Collapsed(), theXMLTypePackage.getString(), "collapsed", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_Inputs(), this.getInputsType(), null, "inputs", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_Outputs(), this.getOutputType(), null, "outputs", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSystemTypeEClass, NodeSystemType.class, "NodeSystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSystemType_Sources(), this.getSourcesType(), null, "sources", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_Nodes(), this.getNodesType(), null, "nodes", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_FunctionResults(), this.getFunctionResultsType(), null, "functionResults", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_Results(), this.getResultsType(), null, "results", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_ExpressionLanguageName(), theXMLTypePackage.getString(), "expressionLanguageName", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_RuntimeVersion(), theXMLTypePackage.getString(), "runtimeVersion", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_ViewOptions(), this.getViewOptionsType(), null, "viewOptions", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullNodeTypeEClass, NullNodeType.class, "NullNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullNodeType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, NullNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullNodeType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, NullNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullNodeType_NodeClassId(), theXMLTypePackage.getString(), "nodeClassId", null, 0, 1, NullNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullNodeType_NodeName(), theXMLTypePackage.getString(), "nodeName", null, 0, 1, NullNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsTypeEClass, ResultsType.class, "ResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultsType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultsType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, ResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultsType_Result(), this.getResultType(), null, "result", null, 0, -1, ResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcesTypeEClass, SourcesType.class, "SourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourcesType_Source(), this.getSourceType(), null, "source", null, 0, -1, SourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SourceType.class, "SourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceType_Node(), theXMLTypePackage.getString(), "node", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_TableName(), theXMLTypePackage.getString(), "tableName", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceType_SourceColumns(), this.getSourceColumnsType(), null, "sourceColumns", null, 0, -1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Rank(), theXMLTypePackage.getString(), "rank", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceType_VisibleColumns(), this.getVisibleColumnsType(), null, "visibleColumns", null, 0, -1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Collapsed(), theXMLTypePackage.getString(), "collapsed", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Expanded(), theXMLTypePackage.getString(), "expanded", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceType_Outputs(), this.getOutputType(), null, "outputs", null, 0, -1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnDecorationsTypeEClass, ColumnDecorationsType.class, "ColumnDecorationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnDecorationsType_ForeColor(), theXMLTypePackage.getString(), "foreColor", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDecorationsType_BackColor(), theXMLTypePackage.getString(), "backColor", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDecorationsType_Alignment(), theXMLTypePackage.getString(), "alignment", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDecorationsType_DisplayFormat(), theXMLTypePackage.getString(), "displayFormat", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDecorationsType_Category(), theXMLTypePackage.getString(), "category", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDecorationsType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ColumnDecorationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceColumnsTypeEClass, SourceColumnsType.class, "SourceColumnsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceColumnsType_SourceColumn(), this.getSourceColumnType(), null, "sourceColumn", null, 0, -1, SourceColumnsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceColumnTypeEClass, SourceColumnType.class, "SourceColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceColumnType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, SourceColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumnType_Column(), theXMLTypePackage.getString(), "column", null, 0, 1, SourceColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumnType_ValueType(), theXMLTypePackage.getString(), "valueType", null, 0, 1, SourceColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumnType_Nullable(), theXMLTypePackage.getString(), "nullable", null, 0, 1, SourceColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumnType_Rank(), theXMLTypePackage.getString(), "rank", null, 0, 1, SourceColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newEClass148EClass, NewEClass148.class, "NewEClass148", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visibleColumnsTypeEClass, VisibleColumnsType.class, "VisibleColumnsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibleColumnsType_Item(), this.getItemType(), null, "item", null, 0, -1, VisibleColumnsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewOptionsTypeEClass, ViewOptionsType.class, "ViewOptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewOptionsType_ConnectionStyle(), theXMLTypePackage.getString(), "connectionStyle", null, 0, 1, ViewOptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesTypeEClass, NodesType.class, "NodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodesType_Node(), this.getNodeType(), null, "node", null, 0, -1, NodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputType_NodeId(), theXMLTypePackage.getString(), "nodeId", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aNodeTypeEClass, ANodeType.class, "ANodeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANodeType_AdjacencyList(), theXMLTypePackage.getString(), "adjacencyList", null, 0, -1, ANodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANodeType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ANodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANodeType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ANodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANodeType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ANodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANodeType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, ANodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notFunctionalNodeTypeEClass, NotFunctionalNodeType.class, "NotFunctionalNodeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotFunctionalNodeType_Input(), this.getInputType(), null, "input", null, 0, -1, NotFunctionalNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// urn:schemas-microsoft-com:xml-msdata
		createUrnschemasmicrosoftcomxmlmsdataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_FunctionResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResult",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Inputs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_NewDataSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NewDataSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_NodeSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeSystem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (functionResultColumnTypeEClass,
		   source,
		   new String[] {
			   "name", "functionResultColumn_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getFunctionResultColumnType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFunctionResultColumnType_ResultRank(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resultRank",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (functionResultsTypeEClass,
		   source,
		   new String[] {
			   "name", "functionResults_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionResultsType_FunctionResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResult",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (functionResultTypeEClass,
		   source,
		   new String[] {
			   "name", "functionResult_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionResultType_FunctionResultColumn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResultColumn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFunctionResultType_FunctionResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResult",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputsTypeEClass,
		   source,
		   new String[] {
			   "name", "inputs_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputsType_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputTypeEClass,
		   source,
		   new String[] {
			   "name", "input_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInputType_Parameter(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (newDataSetTypeEClass,
		   source,
		   new String[] {
			   "name", "NewDataSet_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNewDataSetType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_Inputs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputs",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_FunctionResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResult",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_NodeSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeSystem",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (nodeTypeEClass,
		   source,
		   new String[] {
			   "name", "nodes_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getNodeType_NodeClassId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeClassId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeType_NodeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nodeSystemTypeEClass,
		   source,
		   new String[] {
			   "name", "nodeSystem_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodeSystemType_Sources(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sources",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Nodes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_FunctionResults(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionResults",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Results(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "results",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_ExpressionLanguageName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguageName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_RuntimeVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "runtimeVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nullNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "nullNode_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getNullNodeType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNullNodeType_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNullNodeType_NodeClassId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeClassId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNullNodeType_NodeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resultsTypeEClass,
		   source,
		   new String[] {
			   "name", "results_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getResultsType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultsType_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sourcesTypeEClass,
		   source,
		   new String[] {
			   "name", "sources_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSourcesType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sourceTypeEClass,
		   source,
		   new String[] {
			   "name", "source_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSourceType_Node(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "node",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:schemas-microsoft-com:xml-msdata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnschemasmicrosoftcomxmlmsdataAnnotations() {
		String source = "urn:schemas-microsoft-com:xml-msdata";
		addAnnotation
		  (getDocumentRoot_NewDataSet(),
		   source,
		   new String[] {
			   "IsDataSet", "true",
			   "UseCurrentLocale", "true"
		   });
	}

} //AlleKnotenFormartiertPackageImpl
