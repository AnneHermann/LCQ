/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemFactory;
import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.DocumentRoot;
import BspKnotensystem.InputType;
import BspKnotensystem.InputsType;
import BspKnotensystem.NewDataSetType;
import BspKnotensystem.NodeSystemType;
import BspKnotensystem.NodeType;
import BspKnotensystem.NodesType;
import BspKnotensystem.ResultType;
import BspKnotensystem.ResultsType;
import BspKnotensystem.SourceType;
import BspKnotensystem.SourcesType;

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
public class BspKnotensystemPackageImpl extends EPackageImpl implements BspKnotensystemPackage {
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
	private EClass nodesTypeEClass = null;

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
	private EClass nodeTypeEClass = null;

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
	private EClass resultTypeEClass = null;

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
	 * @see BspKnotensystem.BspKnotensystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BspKnotensystemPackageImpl() {
		super(eNS_URI, BspKnotensystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BspKnotensystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BspKnotensystemPackage init() {
		if (isInited) return (BspKnotensystemPackage)EPackage.Registry.INSTANCE.getEPackage(BspKnotensystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBspKnotensystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BspKnotensystemPackageImpl theBspKnotensystemPackage = registeredBspKnotensystemPackage instanceof BspKnotensystemPackageImpl ? (BspKnotensystemPackageImpl)registeredBspKnotensystemPackage : new BspKnotensystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBspKnotensystemPackage.createPackageContents();

		// Initialize created meta-data
		theBspKnotensystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBspKnotensystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BspKnotensystemPackage.eNS_URI, theBspKnotensystemPackage);
		return theBspKnotensystemPackage;
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
	public EReference getDocumentRoot_Input() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewDataSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeSystem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Source() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
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
	public EReference getNewDataSetType_Input() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewDataSetType_NodeSystem() {
		return (EReference)newDataSetTypeEClass.getEStructuralFeatures().get(3);
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
	public EClass getNodeSystemType() {
		return nodeSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_ViewOptions() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_ParameterDefinitions() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_FunctionResults() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Sources() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Nodes() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSystemType_Results() {
		return (EReference)nodeSystemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_ExpressionLanguageName() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_Id() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_RuntimeVersion() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSystemType_Version() {
		return (EAttribute)nodeSystemTypeEClass.getEStructuralFeatures().get(9);
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
	public EReference getNodeType_Inputs() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Id() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Location() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_NodeClassId() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_NodeName() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getResultsType_Result() {
		return (EReference)resultsTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getResultType_Input() {
		return (EReference)resultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Id() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Location() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSourceType_SourceColumns() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_VisibleColumns() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Id() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Location() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Node() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BspKnotensystemFactory getBspKnotensystemFactory() {
		return (BspKnotensystemFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_DATA_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NODE_SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE);

		inputsTypeEClass = createEClass(INPUTS_TYPE);
		createEReference(inputsTypeEClass, INPUTS_TYPE__INPUT);

		inputTypeEClass = createEClass(INPUT_TYPE);
		createEReference(inputTypeEClass, INPUT_TYPE__SOURCE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__PARAMETER);

		newDataSetTypeEClass = createEClass(NEW_DATA_SET_TYPE);
		createEAttribute(newDataSetTypeEClass, NEW_DATA_SET_TYPE__GROUP);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__SOURCE);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__INPUT);
		createEReference(newDataSetTypeEClass, NEW_DATA_SET_TYPE__NODE_SYSTEM);

		nodesTypeEClass = createEClass(NODES_TYPE);
		createEReference(nodesTypeEClass, NODES_TYPE__NODE);

		nodeSystemTypeEClass = createEClass(NODE_SYSTEM_TYPE);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__VIEW_OPTIONS);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__FUNCTION_RESULTS);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__SOURCES);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__NODES);
		createEReference(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__RESULTS);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__ID);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__RUNTIME_VERSION);
		createEAttribute(nodeSystemTypeEClass, NODE_SYSTEM_TYPE__VERSION);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEReference(nodeTypeEClass, NODE_TYPE__INPUTS);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ID);
		createEAttribute(nodeTypeEClass, NODE_TYPE__LOCATION);
		createEAttribute(nodeTypeEClass, NODE_TYPE__NODE_CLASS_ID);
		createEAttribute(nodeTypeEClass, NODE_TYPE__NODE_NAME);

		resultsTypeEClass = createEClass(RESULTS_TYPE);
		createEReference(resultsTypeEClass, RESULTS_TYPE__RESULT);

		resultTypeEClass = createEClass(RESULT_TYPE);
		createEReference(resultTypeEClass, RESULT_TYPE__INPUT);
		createEAttribute(resultTypeEClass, RESULT_TYPE__ID);
		createEAttribute(resultTypeEClass, RESULT_TYPE__LOCATION);

		sourcesTypeEClass = createEClass(SOURCES_TYPE);
		createEReference(sourcesTypeEClass, SOURCES_TYPE__SOURCE);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__SOURCE_COLUMNS);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__VISIBLE_COLUMNS);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__ID);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__LOCATION);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__NODE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Input(), this.getInputType(), null, "input", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewDataSet(), this.getNewDataSetType(), null, "newDataSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NodeSystem(), this.getNodeSystemType(), null, "nodeSystem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Source(), this.getSourceType(), null, "source", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inputsTypeEClass, InputsType.class, "InputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputsType_Input(), this.getInputType(), null, "input", null, 0, -1, InputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputType_Source(), this.getSourceType(), null, "source", null, 0, -1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_Parameter(), theXMLTypePackage.getString(), "parameter", null, 0, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newDataSetTypeEClass, NewDataSetType.class, "NewDataSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewDataSetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NewDataSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_Source(), this.getSourceType(), null, "source", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_Input(), this.getInputType(), null, "input", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNewDataSetType_NodeSystem(), this.getNodeSystemType(), null, "nodeSystem", null, 0, -1, NewDataSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nodesTypeEClass, NodesType.class, "NodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodesType_Node(), this.getNodeType(), null, "node", null, 0, -1, NodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSystemTypeEClass, NodeSystemType.class, "NodeSystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeSystemType_ViewOptions(), theXMLTypePackage.getString(), "viewOptions", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_ParameterDefinitions(), theXMLTypePackage.getString(), "parameterDefinitions", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_FunctionResults(), theXMLTypePackage.getString(), "functionResults", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_Sources(), this.getSourcesType(), null, "sources", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_Nodes(), this.getNodesType(), null, "nodes", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSystemType_Results(), this.getResultsType(), null, "results", null, 0, -1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_ExpressionLanguageName(), theXMLTypePackage.getString(), "expressionLanguageName", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_RuntimeVersion(), theXMLTypePackage.getString(), "runtimeVersion", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSystemType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, NodeSystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeType_Inputs(), this.getInputsType(), null, "inputs", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_NodeClassId(), theXMLTypePackage.getString(), "nodeClassId", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_NodeName(), theXMLTypePackage.getString(), "nodeName", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsTypeEClass, ResultsType.class, "ResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsType_Result(), this.getResultType(), null, "result", null, 0, -1, ResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultType_Input(), this.getInputType(), null, "input", null, 0, -1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcesTypeEClass, SourcesType.class, "SourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourcesType_Source(), this.getSourceType(), null, "source", null, 0, -1, SourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SourceType.class, "SourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceType_SourceColumns(), theXMLTypePackage.getString(), "sourceColumns", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_VisibleColumns(), theXMLTypePackage.getString(), "visibleColumns", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Node(), theXMLTypePackage.getString(), "node", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
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
			   "name", "NodeSystem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputsTypeEClass,
		   source,
		   new String[] {
			   "name", "Inputs_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputsType_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputTypeEClass,
		   source,
		   new String[] {
			   "name", "Input_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInputType_Parameter(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Parameter",
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
			   "name", "Source",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getNewDataSetType_NodeSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NodeSystem",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (nodesTypeEClass,
		   source,
		   new String[] {
			   "name", "Nodes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodesType_Node(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Node",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nodeSystemTypeEClass,
		   source,
		   new String[] {
			   "name", "NodeSystem_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodeSystemType_ViewOptions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViewOptions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_ParameterDefinitions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ParameterDefinitions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_FunctionResults(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FunctionResults",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Sources(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sources",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Nodes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nodes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Results(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Results",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_ExpressionLanguageName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ExpressionLanguageName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_RuntimeVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RuntimeVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeSystemType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nodeTypeEClass,
		   source,
		   new String[] {
			   "name", "Node_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNodeType_Inputs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inputs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeType_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeType_NodeClassId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "NodeClassId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNodeType_NodeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "NodeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resultsTypeEClass,
		   source,
		   new String[] {
			   "name", "Results_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResultsType_Result(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Result",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resultTypeEClass,
		   source,
		   new String[] {
			   "name", "Result_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResultType_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultType_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sourcesTypeEClass,
		   source,
		   new String[] {
			   "name", "Sources_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSourcesType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sourceTypeEClass,
		   source,
		   new String[] {
			   "name", "Source_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSourceType_SourceColumns(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SourceColumns",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_VisibleColumns(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VisibleColumns",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Node(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Node",
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
		addAnnotation
		  (getNodeSystemType_ViewOptions(),
		   source,
		   new String[] {
			   "Ordinal", "0"
		   });
		addAnnotation
		  (getNodeSystemType_ParameterDefinitions(),
		   source,
		   new String[] {
			   "Ordinal", "1"
		   });
		addAnnotation
		  (getNodeSystemType_FunctionResults(),
		   source,
		   new String[] {
			   "Ordinal", "3"
		   });
		addAnnotation
		  (getSourceType_SourceColumns(),
		   source,
		   new String[] {
			   "Ordinal", "0"
		   });
		addAnnotation
		  (getSourceType_VisibleColumns(),
		   source,
		   new String[] {
			   "Ordinal", "1"
		   });
	}

} //BspKnotensystemPackageImpl
