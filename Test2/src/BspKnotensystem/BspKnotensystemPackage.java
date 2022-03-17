/**
 */
package BspKnotensystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BspKnotensystem.BspKnotensystemFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface BspKnotensystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BspKnotensystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/hermanne/Documents/Bachelorarbeit/BspKnotensystem.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BspKnotensystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BspKnotensystemPackage eINSTANCE = BspKnotensystem.impl.BspKnotensystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.DocumentRootImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INPUT = 3;

	/**
	 * The feature id for the '<em><b>New Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_DATA_SET = 4;

	/**
	 * The feature id for the '<em><b>Node System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.InputsTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getInputsType()
	 * @generated
	 */
	int INPUTS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Inputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.InputTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.NewDataSetTypeImpl <em>New Data Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.NewDataSetTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNewDataSetType()
	 * @generated
	 */
	int NEW_DATA_SET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Node System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__NODE_SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>New Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>New Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.NodesTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodesType()
	 * @generated
	 */
	int NODES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TYPE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Nodes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.NodeSystemTypeImpl <em>Node System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.NodeSystemTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodeSystemType()
	 * @generated
	 */
	int NODE_SYSTEM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>View Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__VIEW_OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Parameter Definitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Function Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__FUNCTION_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__SOURCES = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__NODES = 4;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__RESULTS = 5;

	/**
	 * The feature id for the '<em><b>Expression Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__RUNTIME_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Node System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Node System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.NodeTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Node Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_CLASS_ID = 3;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.ResultsTypeImpl <em>Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.ResultsTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getResultsType()
	 * @generated
	 */
	int RESULTS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE__RESULT = 0;

	/**
	 * The number of structural features of the '<em>Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.ResultTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.SourcesTypeImpl <em>Sources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.SourcesTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getSourcesType()
	 * @generated
	 */
	int SOURCES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_TYPE__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Sources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BspKnotensystem.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BspKnotensystem.impl.SourceTypeImpl
	 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Source Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SOURCE_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Visible Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__VISIBLE_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__NODE = 4;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link BspKnotensystem.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see BspKnotensystem.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link BspKnotensystem.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see BspKnotensystem.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link BspKnotensystem.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see BspKnotensystem.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link BspKnotensystem.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see BspKnotensystem.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link BspKnotensystem.DocumentRoot#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see BspKnotensystem.DocumentRoot#getInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Input();

	/**
	 * Returns the meta object for the containment reference '{@link BspKnotensystem.DocumentRoot#getNewDataSet <em>New Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Data Set</em>'.
	 * @see BspKnotensystem.DocumentRoot#getNewDataSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewDataSet();

	/**
	 * Returns the meta object for the containment reference '{@link BspKnotensystem.DocumentRoot#getNodeSystem <em>Node System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node System</em>'.
	 * @see BspKnotensystem.DocumentRoot#getNodeSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NodeSystem();

	/**
	 * Returns the meta object for the containment reference '{@link BspKnotensystem.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see BspKnotensystem.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type</em>'.
	 * @see BspKnotensystem.InputsType
	 * @generated
	 */
	EClass getInputsType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.InputsType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see BspKnotensystem.InputsType#getInput()
	 * @see #getInputsType()
	 * @generated
	 */
	EReference getInputsType_Input();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see BspKnotensystem.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.InputType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see BspKnotensystem.InputType#getSource()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Source();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.InputType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see BspKnotensystem.InputType#getParameter()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Parameter();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.NewDataSetType <em>New Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Data Set Type</em>'.
	 * @see BspKnotensystem.NewDataSetType
	 * @generated
	 */
	EClass getNewDataSetType();

	/**
	 * Returns the meta object for the attribute list '{@link BspKnotensystem.NewDataSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see BspKnotensystem.NewDataSetType#getGroup()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EAttribute getNewDataSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NewDataSetType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see BspKnotensystem.NewDataSetType#getSource()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NewDataSetType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see BspKnotensystem.NewDataSetType#getInput()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NewDataSetType#getNodeSystem <em>Node System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node System</em>'.
	 * @see BspKnotensystem.NewDataSetType#getNodeSystem()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_NodeSystem();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Type</em>'.
	 * @see BspKnotensystem.NodesType
	 * @generated
	 */
	EClass getNodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NodesType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see BspKnotensystem.NodesType#getNode()
	 * @see #getNodesType()
	 * @generated
	 */
	EReference getNodesType_Node();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.NodeSystemType <em>Node System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node System Type</em>'.
	 * @see BspKnotensystem.NodeSystemType
	 * @generated
	 */
	EClass getNodeSystemType();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getViewOptions <em>View Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Options</em>'.
	 * @see BspKnotensystem.NodeSystemType#getViewOptions()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_ViewOptions();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Definitions</em>'.
	 * @see BspKnotensystem.NodeSystemType#getParameterDefinitions()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_ParameterDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getFunctionResults <em>Function Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Results</em>'.
	 * @see BspKnotensystem.NodeSystemType#getFunctionResults()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_FunctionResults();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NodeSystemType#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see BspKnotensystem.NodeSystemType#getSources()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NodeSystemType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see BspKnotensystem.NodeSystemType#getNodes()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NodeSystemType#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see BspKnotensystem.NodeSystemType#getResults()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Results();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language Name</em>'.
	 * @see BspKnotensystem.NodeSystemType#getExpressionLanguageName()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_ExpressionLanguageName();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BspKnotensystem.NodeSystemType#getId()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_Id();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Version</em>'.
	 * @see BspKnotensystem.NodeSystemType#getRuntimeVersion()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_RuntimeVersion();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeSystemType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see BspKnotensystem.NodeSystemType#getVersion()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_Version();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see BspKnotensystem.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.NodeType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see BspKnotensystem.NodeType#getInputs()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BspKnotensystem.NodeType#getId()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see BspKnotensystem.NodeType#getLocation()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Location();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeType#getNodeClassId <em>Node Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Class Id</em>'.
	 * @see BspKnotensystem.NodeType#getNodeClassId()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_NodeClassId();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.NodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see BspKnotensystem.NodeType#getNodeName()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_NodeName();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.ResultsType <em>Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Type</em>'.
	 * @see BspKnotensystem.ResultsType
	 * @generated
	 */
	EClass getResultsType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.ResultsType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see BspKnotensystem.ResultsType#getResult()
	 * @see #getResultsType()
	 * @generated
	 */
	EReference getResultsType_Result();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see BspKnotensystem.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.ResultType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see BspKnotensystem.ResultType#getInput()
	 * @see #getResultType()
	 * @generated
	 */
	EReference getResultType_Input();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.ResultType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BspKnotensystem.ResultType#getId()
	 * @see #getResultType()
	 * @generated
	 */
	EAttribute getResultType_Id();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.ResultType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see BspKnotensystem.ResultType#getLocation()
	 * @see #getResultType()
	 * @generated
	 */
	EAttribute getResultType_Location();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.SourcesType <em>Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources Type</em>'.
	 * @see BspKnotensystem.SourcesType
	 * @generated
	 */
	EClass getSourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link BspKnotensystem.SourcesType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see BspKnotensystem.SourcesType#getSource()
	 * @see #getSourcesType()
	 * @generated
	 */
	EReference getSourcesType_Source();

	/**
	 * Returns the meta object for class '{@link BspKnotensystem.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see BspKnotensystem.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.SourceType#getSourceColumns <em>Source Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Columns</em>'.
	 * @see BspKnotensystem.SourceType#getSourceColumns()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_SourceColumns();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.SourceType#getVisibleColumns <em>Visible Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Columns</em>'.
	 * @see BspKnotensystem.SourceType#getVisibleColumns()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_VisibleColumns();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.SourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BspKnotensystem.SourceType#getId()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Id();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.SourceType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see BspKnotensystem.SourceType#getLocation()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Location();

	/**
	 * Returns the meta object for the attribute '{@link BspKnotensystem.SourceType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see BspKnotensystem.SourceType#getNode()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Node();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BspKnotensystemFactory getBspKnotensystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.DocumentRootImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INPUT = eINSTANCE.getDocumentRoot_Input();

		/**
		 * The meta object literal for the '<em><b>New Data Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_DATA_SET = eINSTANCE.getDocumentRoot_NewDataSet();

		/**
		 * The meta object literal for the '<em><b>Node System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NODE_SYSTEM = eINSTANCE.getDocumentRoot_NodeSystem();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.InputsTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getInputsType()
		 * @generated
		 */
		EClass INPUTS_TYPE = eINSTANCE.getInputsType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUTS_TYPE__INPUT = eINSTANCE.getInputsType_Input();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.InputTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_TYPE__SOURCE = eINSTANCE.getInputType_Source();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__PARAMETER = eINSTANCE.getInputType_Parameter();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.NewDataSetTypeImpl <em>New Data Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.NewDataSetTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNewDataSetType()
		 * @generated
		 */
		EClass NEW_DATA_SET_TYPE = eINSTANCE.getNewDataSetType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_DATA_SET_TYPE__GROUP = eINSTANCE.getNewDataSetType_Group();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__SOURCE = eINSTANCE.getNewDataSetType_Source();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__INPUT = eINSTANCE.getNewDataSetType_Input();

		/**
		 * The meta object literal for the '<em><b>Node System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__NODE_SYSTEM = eINSTANCE.getNewDataSetType_NodeSystem();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.NodesTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodesType()
		 * @generated
		 */
		EClass NODES_TYPE = eINSTANCE.getNodesType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TYPE__NODE = eINSTANCE.getNodesType_Node();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.NodeSystemTypeImpl <em>Node System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.NodeSystemTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodeSystemType()
		 * @generated
		 */
		EClass NODE_SYSTEM_TYPE = eINSTANCE.getNodeSystemType();

		/**
		 * The meta object literal for the '<em><b>View Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__VIEW_OPTIONS = eINSTANCE.getNodeSystemType_ViewOptions();

		/**
		 * The meta object literal for the '<em><b>Parameter Definitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS = eINSTANCE.getNodeSystemType_ParameterDefinitions();

		/**
		 * The meta object literal for the '<em><b>Function Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__FUNCTION_RESULTS = eINSTANCE.getNodeSystemType_FunctionResults();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SYSTEM_TYPE__SOURCES = eINSTANCE.getNodeSystemType_Sources();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SYSTEM_TYPE__NODES = eINSTANCE.getNodeSystemType_Nodes();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SYSTEM_TYPE__RESULTS = eINSTANCE.getNodeSystemType_Results();

		/**
		 * The meta object literal for the '<em><b>Expression Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME = eINSTANCE.getNodeSystemType_ExpressionLanguageName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__ID = eINSTANCE.getNodeSystemType_Id();

		/**
		 * The meta object literal for the '<em><b>Runtime Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__RUNTIME_VERSION = eINSTANCE.getNodeSystemType_RuntimeVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SYSTEM_TYPE__VERSION = eINSTANCE.getNodeSystemType_Version();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.NodeTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__INPUTS = eINSTANCE.getNodeType_Inputs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__ID = eINSTANCE.getNodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__LOCATION = eINSTANCE.getNodeType_Location();

		/**
		 * The meta object literal for the '<em><b>Node Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__NODE_CLASS_ID = eINSTANCE.getNodeType_NodeClassId();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__NODE_NAME = eINSTANCE.getNodeType_NodeName();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.ResultsTypeImpl <em>Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.ResultsTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getResultsType()
		 * @generated
		 */
		EClass RESULTS_TYPE = eINSTANCE.getResultsType();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_TYPE__RESULT = eINSTANCE.getResultsType_Result();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.ResultTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TYPE__INPUT = eINSTANCE.getResultType_Input();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE__ID = eINSTANCE.getResultType_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE__LOCATION = eINSTANCE.getResultType_Location();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.SourcesTypeImpl <em>Sources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.SourcesTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getSourcesType()
		 * @generated
		 */
		EClass SOURCES_TYPE = eINSTANCE.getSourcesType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES_TYPE__SOURCE = eINSTANCE.getSourcesType_Source();

		/**
		 * The meta object literal for the '{@link BspKnotensystem.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BspKnotensystem.impl.SourceTypeImpl
		 * @see BspKnotensystem.impl.BspKnotensystemPackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Source Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__SOURCE_COLUMNS = eINSTANCE.getSourceType_SourceColumns();

		/**
		 * The meta object literal for the '<em><b>Visible Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__VISIBLE_COLUMNS = eINSTANCE.getSourceType_VisibleColumns();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__ID = eINSTANCE.getSourceType_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__LOCATION = eINSTANCE.getSourceType_Location();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__NODE = eINSTANCE.getSourceType_Node();

	}

} //BspKnotensystemPackage
