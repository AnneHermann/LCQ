/**
 */
package AlleKnotenFormartiert;

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
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface AlleKnotenFormartiertPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AlleKnotenFormartiert";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/hermanne/eclipse-workspace%20-%20Kopie/alleKnotenFormartiert.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AlleKnotenFormartiert";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlleKnotenFormartiertPackage eINSTANCE = AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl.init();

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.DocumentRootImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Function Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNCTION_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INPUTS = 4;

	/**
	 * The feature id for the '<em><b>New Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_DATA_SET = 5;

	/**
	 * The feature id for the '<em><b>Node System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl <em>Function Result Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultColumnType()
	 * @generated
	 */
	int FUNCTION_RESULT_COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Result Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Column Decorations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS = 4;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__NULLABLE = 5;

	/**
	 * The feature id for the '<em><b>Result Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED = 6;

	/**
	 * The feature id for the '<em><b>Column Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Result Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME = 9;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE__MISSING = 10;

	/**
	 * The number of structural features of the '<em>Function Result Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Function Result Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.FunctionResultsTypeImpl <em>Function Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.FunctionResultsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultsType()
	 * @generated
	 */
	int FUNCTION_RESULTS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Function Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULTS_TYPE__FUNCTION_RESULT = 0;

	/**
	 * The number of structural features of the '<em>Function Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl <em>Function Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.FunctionResultTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultType()
	 * @generated
	 */
	int FUNCTION_RESULT_TYPE = 3;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.InputsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getInputsType()
	 * @generated
	 */
	int INPUTS_TYPE = 4;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.InputTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 5;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl <em>New Data Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NewDataSetTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNewDataSetType()
	 * @generated
	 */
	int NEW_DATA_SET_TYPE = 6;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NodeTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 7;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl <em>Node System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NodeSystemTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodeSystemType()
	 * @generated
	 */
	int NODE_SYSTEM_TYPE = 8;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl <em>Null Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NullNodeTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNullNodeType()
	 * @generated
	 */
	int NULL_NODE_TYPE = 9;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ResultsTypeImpl <em>Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ResultsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getResultsType()
	 * @generated
	 */
	int RESULTS_TYPE = 10;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.SourcesTypeImpl <em>Sources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.SourcesTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourcesType()
	 * @generated
	 */
	int SOURCES_TYPE = 11;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.SourceTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 12;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl <em>Column Decorations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getColumnDecorationsType()
	 * @generated
	 */
	int COLUMN_DECORATIONS_TYPE = 13;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.SourceColumnsTypeImpl <em>Source Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.SourceColumnsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceColumnsType()
	 * @generated
	 */
	int SOURCE_COLUMNS_TYPE = 14;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.SourceColumnTypeImpl <em>Source Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.SourceColumnTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceColumnType()
	 * @generated
	 */
	int SOURCE_COLUMN_TYPE = 15;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ResultTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 16;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NewEClass148Impl <em>New EClass148</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NewEClass148Impl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNewEClass148()
	 * @generated
	 */
	int NEW_ECLASS148 = 17;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.VisibleColumnsTypeImpl <em>Visible Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.VisibleColumnsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getVisibleColumnsType()
	 * @generated
	 */
	int VISIBLE_COLUMNS_TYPE = 18;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ItemTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 19;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ViewOptionsTypeImpl <em>View Options Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ViewOptionsTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getViewOptionsType()
	 * @generated
	 */
	int VIEW_OPTIONS_TYPE = 20;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NodesTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodesType()
	 * @generated
	 */
	int NODES_TYPE = 21;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.OutputTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 22;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.NotFunctionalNodeTypeImpl <em>Not Functional Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.NotFunctionalNodeTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNotFunctionalNodeType()
	 * @generated
	 */
	int NOT_FUNCTIONAL_NODE_TYPE = 24;

	/**
	 * The meta object id for the '{@link AlleKnotenFormartiert.impl.ANodeTypeImpl <em>ANode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AlleKnotenFormartiert.impl.ANodeTypeImpl
	 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getANodeType()
	 * @generated
	 */
	int ANODE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE__ADJACENCY_LIST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE__LOCATION = 4;

	/**
	 * The number of structural features of the '<em>ANode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>ANode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__ADJACENCY_LIST = ANODE_TYPE__ADJACENCY_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__ID = ANODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__NAME = ANODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__DESCRIPTION = ANODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__LOCATION = ANODE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE__INPUT = ANODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Functional Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT = ANODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Functional Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FUNCTIONAL_NODE_TYPE_OPERATION_COUNT = ANODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__ADJACENCY_LIST = NOT_FUNCTIONAL_NODE_TYPE__ADJACENCY_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__ID = NOT_FUNCTIONAL_NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__NAME = NOT_FUNCTIONAL_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__DESCRIPTION = NOT_FUNCTIONAL_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__LOCATION = NOT_FUNCTIONAL_NODE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__INPUT = NOT_FUNCTIONAL_NODE_TYPE__INPUT;

	/**
	 * The feature id for the '<em><b>Function Result Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__FUNCTION_RESULT = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Used Columns Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__COLLAPSED = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE__OUTPUTS = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE_FEATURE_COUNT = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_TYPE_OPERATION_COUNT = NOT_FUNCTIONAL_NODE_TYPE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Function Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__FUNCTION_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Node System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE__NODE_SYSTEM = 4;

	/**
	 * The number of structural features of the '<em>New Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>New Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ADJACENCY_LIST = ANODE_TYPE__ADJACENCY_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ID = ANODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NAME = ANODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DESCRIPTION = ANODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__LOCATION = ANODE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Node Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_CLASS_ID = ANODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_NAME = ANODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__COLLAPSED = ANODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__INPUTS = ANODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__OUTPUTS = ANODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = ANODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = ANODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__SOURCES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__NODES = 1;

	/**
	 * The feature id for the '<em><b>Function Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__FUNCTION_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__RESULTS = 3;

	/**
	 * The feature id for the '<em><b>Expression Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__RUNTIME_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__VERSION = 7;

	/**
	 * The feature id for the '<em><b>View Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE__VIEW_OPTIONS = 8;

	/**
	 * The number of structural features of the '<em>Node System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Node System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SYSTEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Node Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE__NODE_CLASS_ID = 2;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE__NODE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Null Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Null Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_NODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE__RESULT = 2;

	/**
	 * The number of structural features of the '<em>Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__ADJACENCY_LIST = ANODE_TYPE__ADJACENCY_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__ID = ANODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__NAME = ANODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__DESCRIPTION = ANODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__LOCATION = ANODE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__NODE = ANODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__VALUE = ANODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__TABLE_NAME = ANODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SOURCE_COLUMNS = ANODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__RANK = ANODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visible Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__VISIBLE_COLUMNS = ANODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__COLLAPSED = ANODE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__EXPANDED = ANODE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__OUTPUTS = ANODE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = ANODE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = ANODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fore Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__FORE_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Back Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__BACK_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__ALIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Display Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Column Decorations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Column Decorations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DECORATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Source Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMNS_TYPE__SOURCE_COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Source Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMNS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMNS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE__VALUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE__RANK = 4;

	/**
	 * The number of structural features of the '<em>Source Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Source Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Adjacency List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__ADJACENCY_LIST = NOT_FUNCTIONAL_NODE_TYPE__ADJACENCY_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__ID = NOT_FUNCTIONAL_NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__NAME = NOT_FUNCTIONAL_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__DESCRIPTION = NOT_FUNCTIONAL_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__LOCATION = NOT_FUNCTIONAL_NODE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__INPUT = NOT_FUNCTIONAL_NODE_TYPE__INPUT;

	/**
	 * The number of structural features of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_FEATURE_COUNT = NOT_FUNCTIONAL_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_OPERATION_COUNT = NOT_FUNCTIONAL_NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New EClass148</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS148_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass148</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS148_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_COLUMNS_TYPE__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Visible Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_COLUMNS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Visible Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_COLUMNS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Connection Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPTIONS_TYPE__CONNECTION_STYLE = 0;

	/**
	 * The number of structural features of the '<em>View Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPTIONS_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__NODE_ID = 0;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link AlleKnotenFormartiert.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link AlleKnotenFormartiert.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link AlleKnotenFormartiert.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link AlleKnotenFormartiert.DocumentRoot#getFunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Result</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getFunctionResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FunctionResult();

	/**
	 * Returns the meta object for the containment reference '{@link AlleKnotenFormartiert.DocumentRoot#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getInputs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link AlleKnotenFormartiert.DocumentRoot#getNewDataSet <em>New Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Data Set</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getNewDataSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewDataSet();

	/**
	 * Returns the meta object for the containment reference '{@link AlleKnotenFormartiert.DocumentRoot#getNodeSystem <em>Node System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node System</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getNodeSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NodeSystem();

	/**
	 * Returns the meta object for the containment reference '{@link AlleKnotenFormartiert.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see AlleKnotenFormartiert.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.FunctionResultColumnType <em>Function Result Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Result Column Type</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType
	 * @generated
	 */
	EClass getFunctionResultColumnType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getId()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultRank <em>Result Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Rank</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getResultRank()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_ResultRank();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getColumn()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_Column();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getValueType()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_ValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumnDecorations <em>Column Decorations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Decorations</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getColumnDecorations()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EReference getFunctionResultColumnType_ColumnDecorations();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getNullable()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDeleted <em>Result Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Deleted</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getResultDeleted()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_ResultDeleted();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumnDisplayName <em>Column Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Display Name</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getColumnDisplayName()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_ColumnDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getName()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_Name();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDisplayName <em>Result Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Display Name</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getResultDisplayName()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_ResultDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultColumnType#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType#getMissing()
	 * @see #getFunctionResultColumnType()
	 * @generated
	 */
	EAttribute getFunctionResultColumnType_Missing();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.FunctionResultsType <em>Function Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Results Type</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultsType
	 * @generated
	 */
	EClass getFunctionResultsType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.FunctionResultsType#getFunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Result</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultsType#getFunctionResult()
	 * @see #getFunctionResultsType()
	 * @generated
	 */
	EReference getFunctionResultsType_FunctionResult();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.FunctionResultType <em>Function Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Result Type</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType
	 * @generated
	 */
	EClass getFunctionResultType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.FunctionResultType#getFunctionResultColumn <em>Function Result Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Result Column</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType#getFunctionResultColumn()
	 * @see #getFunctionResultType()
	 * @generated
	 */
	EReference getFunctionResultType_FunctionResultColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.FunctionResultType#getFunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Result</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType#getFunctionResult()
	 * @see #getFunctionResultType()
	 * @generated
	 */
	EReference getFunctionResultType_FunctionResult();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultType#getShowUsedColumnsOnly <em>Show Used Columns Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Used Columns Only</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType#getShowUsedColumnsOnly()
	 * @see #getFunctionResultType()
	 * @generated
	 */
	EAttribute getFunctionResultType_ShowUsedColumnsOnly();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.FunctionResultType#getCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType#getCollapsed()
	 * @see #getFunctionResultType()
	 * @generated
	 */
	EAttribute getFunctionResultType_Collapsed();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.FunctionResultType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see AlleKnotenFormartiert.FunctionResultType#getOutputs()
	 * @see #getFunctionResultType()
	 * @generated
	 */
	EReference getFunctionResultType_Outputs();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type</em>'.
	 * @see AlleKnotenFormartiert.InputsType
	 * @generated
	 */
	EClass getInputsType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.InputsType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see AlleKnotenFormartiert.InputsType#getInput()
	 * @see #getInputsType()
	 * @generated
	 */
	EReference getInputsType_Input();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see AlleKnotenFormartiert.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.InputType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see AlleKnotenFormartiert.InputType#getSource()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Source();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.InputType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see AlleKnotenFormartiert.InputType#getParameter()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Parameter();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NewDataSetType <em>New Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Data Set Type</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType
	 * @generated
	 */
	EClass getNewDataSetType();

	/**
	 * Returns the meta object for the attribute list '{@link AlleKnotenFormartiert.NewDataSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType#getGroup()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EAttribute getNewDataSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NewDataSetType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType#getSource()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NewDataSetType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType#getInputs()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NewDataSetType#getFunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Result</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType#getFunctionResult()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_FunctionResult();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NewDataSetType#getNodeSystem <em>Node System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node System</em>'.
	 * @see AlleKnotenFormartiert.NewDataSetType#getNodeSystem()
	 * @see #getNewDataSetType()
	 * @generated
	 */
	EReference getNewDataSetType_NodeSystem();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see AlleKnotenFormartiert.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeType#getNodeClassId <em>Node Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Class Id</em>'.
	 * @see AlleKnotenFormartiert.NodeType#getNodeClassId()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_NodeClassId();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see AlleKnotenFormartiert.NodeType#getNodeName()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeType#getCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see AlleKnotenFormartiert.NodeType#getCollapsed()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Collapsed();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see AlleKnotenFormartiert.NodeType#getInputs()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see AlleKnotenFormartiert.NodeType#getOutputs()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Outputs();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NodeSystemType <em>Node System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node System Type</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType
	 * @generated
	 */
	EClass getNodeSystemType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeSystemType#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getSources()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeSystemType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getNodes()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeSystemType#getFunctionResults <em>Function Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Results</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getFunctionResults()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_FunctionResults();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeSystemType#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getResults()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_Results();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language Name</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getExpressionLanguageName()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_ExpressionLanguageName();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeSystemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getId()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Version</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getRuntimeVersion()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_RuntimeVersion();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NodeSystemType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getVersion()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EAttribute getNodeSystemType_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodeSystemType#getViewOptions <em>View Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Options</em>'.
	 * @see AlleKnotenFormartiert.NodeSystemType#getViewOptions()
	 * @see #getNodeSystemType()
	 * @generated
	 */
	EReference getNodeSystemType_ViewOptions();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NullNodeType <em>Null Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Node Type</em>'.
	 * @see AlleKnotenFormartiert.NullNodeType
	 * @generated
	 */
	EClass getNullNodeType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NullNodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.NullNodeType#getId()
	 * @see #getNullNodeType()
	 * @generated
	 */
	EAttribute getNullNodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NullNodeType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see AlleKnotenFormartiert.NullNodeType#getLocation()
	 * @see #getNullNodeType()
	 * @generated
	 */
	EAttribute getNullNodeType_Location();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NullNodeType#getNodeClassId <em>Node Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Class Id</em>'.
	 * @see AlleKnotenFormartiert.NullNodeType#getNodeClassId()
	 * @see #getNullNodeType()
	 * @generated
	 */
	EAttribute getNullNodeType_NodeClassId();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.NullNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see AlleKnotenFormartiert.NullNodeType#getNodeName()
	 * @see #getNullNodeType()
	 * @generated
	 */
	EAttribute getNullNodeType_NodeName();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ResultsType <em>Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Type</em>'.
	 * @see AlleKnotenFormartiert.ResultsType
	 * @generated
	 */
	EClass getResultsType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ResultsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.ResultsType#getId()
	 * @see #getResultsType()
	 * @generated
	 */
	EAttribute getResultsType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ResultsType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see AlleKnotenFormartiert.ResultsType#getLocation()
	 * @see #getResultsType()
	 * @generated
	 */
	EAttribute getResultsType_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.ResultsType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see AlleKnotenFormartiert.ResultsType#getResult()
	 * @see #getResultsType()
	 * @generated
	 */
	EReference getResultsType_Result();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.SourcesType <em>Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources Type</em>'.
	 * @see AlleKnotenFormartiert.SourcesType
	 * @generated
	 */
	EClass getSourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.SourcesType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see AlleKnotenFormartiert.SourcesType#getSource()
	 * @see #getSourcesType()
	 * @generated
	 */
	EReference getSourcesType_Source();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see AlleKnotenFormartiert.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getNode()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Node();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getValue()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getTableName()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.SourceType#getSourceColumns <em>Source Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Columns</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getSourceColumns()
	 * @see #getSourceType()
	 * @generated
	 */
	EReference getSourceType_SourceColumns();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getRank()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Rank();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.SourceType#getVisibleColumns <em>Visible Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visible Columns</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getVisibleColumns()
	 * @see #getSourceType()
	 * @generated
	 */
	EReference getSourceType_VisibleColumns();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getCollapsed()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Collapsed();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceType#getExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getExpanded()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Expanded();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.SourceType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see AlleKnotenFormartiert.SourceType#getOutputs()
	 * @see #getSourceType()
	 * @generated
	 */
	EReference getSourceType_Outputs();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ColumnDecorationsType <em>Column Decorations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Decorations Type</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType
	 * @generated
	 */
	EClass getColumnDecorationsType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getForeColor <em>Fore Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fore Color</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getForeColor()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_ForeColor();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getBackColor <em>Back Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Back Color</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getBackColor()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_BackColor();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getAlignment()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getDisplayFormat <em>Display Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Format</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getDisplayFormat()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_DisplayFormat();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getCategory()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_Category();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ColumnDecorationsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType#getDescription()
	 * @see #getColumnDecorationsType()
	 * @generated
	 */
	EAttribute getColumnDecorationsType_Description();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.SourceColumnsType <em>Source Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Columns Type</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnsType
	 * @generated
	 */
	EClass getSourceColumnsType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.SourceColumnsType#getSourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Column</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnsType#getSourceColumn()
	 * @see #getSourceColumnsType()
	 * @generated
	 */
	EReference getSourceColumnsType_SourceColumn();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.SourceColumnType <em>Source Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Column Type</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType
	 * @generated
	 */
	EClass getSourceColumnType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceColumnType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType#getId()
	 * @see #getSourceColumnType()
	 * @generated
	 */
	EAttribute getSourceColumnType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceColumnType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType#getColumn()
	 * @see #getSourceColumnType()
	 * @generated
	 */
	EAttribute getSourceColumnType_Column();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceColumnType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType#getValueType()
	 * @see #getSourceColumnType()
	 * @generated
	 */
	EAttribute getSourceColumnType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceColumnType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType#getNullable()
	 * @see #getSourceColumnType()
	 * @generated
	 */
	EAttribute getSourceColumnType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.SourceColumnType#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see AlleKnotenFormartiert.SourceColumnType#getRank()
	 * @see #getSourceColumnType()
	 * @generated
	 */
	EAttribute getSourceColumnType_Rank();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see AlleKnotenFormartiert.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NewEClass148 <em>New EClass148</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass148</em>'.
	 * @see AlleKnotenFormartiert.NewEClass148
	 * @generated
	 */
	EClass getNewEClass148();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.VisibleColumnsType <em>Visible Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Columns Type</em>'.
	 * @see AlleKnotenFormartiert.VisibleColumnsType
	 * @generated
	 */
	EClass getVisibleColumnsType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.VisibleColumnsType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see AlleKnotenFormartiert.VisibleColumnsType#getItem()
	 * @see #getVisibleColumnsType()
	 * @generated
	 */
	EReference getVisibleColumnsType_Item();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see AlleKnotenFormartiert.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ItemType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AlleKnotenFormartiert.ItemType#getValue()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Value();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ViewOptionsType <em>View Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Options Type</em>'.
	 * @see AlleKnotenFormartiert.ViewOptionsType
	 * @generated
	 */
	EClass getViewOptionsType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ViewOptionsType#getConnectionStyle <em>Connection Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Style</em>'.
	 * @see AlleKnotenFormartiert.ViewOptionsType#getConnectionStyle()
	 * @see #getViewOptionsType()
	 * @generated
	 */
	EAttribute getViewOptionsType_ConnectionStyle();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Type</em>'.
	 * @see AlleKnotenFormartiert.NodesType
	 * @generated
	 */
	EClass getNodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NodesType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see AlleKnotenFormartiert.NodesType#getNode()
	 * @see #getNodesType()
	 * @generated
	 */
	EReference getNodesType_Node();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see AlleKnotenFormartiert.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.OutputType#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see AlleKnotenFormartiert.OutputType#getNodeId()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_NodeId();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.NotFunctionalNodeType <em>Not Functional Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Functional Node Type</em>'.
	 * @see AlleKnotenFormartiert.NotFunctionalNodeType
	 * @generated
	 */
	EClass getNotFunctionalNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link AlleKnotenFormartiert.NotFunctionalNodeType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see AlleKnotenFormartiert.NotFunctionalNodeType#getInput()
	 * @see #getNotFunctionalNodeType()
	 * @generated
	 */
	EReference getNotFunctionalNodeType_Input();

	/**
	 * Returns the meta object for class '{@link AlleKnotenFormartiert.ANodeType <em>ANode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANode Type</em>'.
	 * @see AlleKnotenFormartiert.ANodeType
	 * @generated
	 */
	EClass getANodeType();

	/**
	 * Returns the meta object for the attribute list '{@link AlleKnotenFormartiert.ANodeType#getAdjacencyList <em>Adjacency List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Adjacency List</em>'.
	 * @see AlleKnotenFormartiert.ANodeType#getAdjacencyList()
	 * @see #getANodeType()
	 * @generated
	 */
	EAttribute getANodeType_AdjacencyList();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ANodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AlleKnotenFormartiert.ANodeType#getId()
	 * @see #getANodeType()
	 * @generated
	 */
	EAttribute getANodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ANodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AlleKnotenFormartiert.ANodeType#getName()
	 * @see #getANodeType()
	 * @generated
	 */
	EAttribute getANodeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ANodeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AlleKnotenFormartiert.ANodeType#getDescription()
	 * @see #getANodeType()
	 * @generated
	 */
	EAttribute getANodeType_Description();

	/**
	 * Returns the meta object for the attribute '{@link AlleKnotenFormartiert.ANodeType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see AlleKnotenFormartiert.ANodeType#getLocation()
	 * @see #getANodeType()
	 * @generated
	 */
	EAttribute getANodeType_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlleKnotenFormartiertFactory getAlleKnotenFormartiertFactory();

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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.DocumentRootImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Function Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FUNCTION_RESULT = eINSTANCE.getDocumentRoot_FunctionResult();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INPUTS = eINSTANCE.getDocumentRoot_Inputs();

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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl <em>Function Result Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultColumnType()
		 * @generated
		 */
		EClass FUNCTION_RESULT_COLUMN_TYPE = eINSTANCE.getFunctionResultColumnType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__ID = eINSTANCE.getFunctionResultColumnType_Id();

		/**
		 * The meta object literal for the '<em><b>Result Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK = eINSTANCE.getFunctionResultColumnType_ResultRank();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__COLUMN = eINSTANCE.getFunctionResultColumnType_Column();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE = eINSTANCE.getFunctionResultColumnType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Column Decorations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS = eINSTANCE.getFunctionResultColumnType_ColumnDecorations();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__NULLABLE = eINSTANCE.getFunctionResultColumnType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Result Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED = eINSTANCE.getFunctionResultColumnType_ResultDeleted();

		/**
		 * The meta object literal for the '<em><b>Column Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME = eINSTANCE.getFunctionResultColumnType_ColumnDisplayName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__NAME = eINSTANCE.getFunctionResultColumnType_Name();

		/**
		 * The meta object literal for the '<em><b>Result Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME = eINSTANCE.getFunctionResultColumnType_ResultDisplayName();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_COLUMN_TYPE__MISSING = eINSTANCE.getFunctionResultColumnType_Missing();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.FunctionResultsTypeImpl <em>Function Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.FunctionResultsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultsType()
		 * @generated
		 */
		EClass FUNCTION_RESULTS_TYPE = eINSTANCE.getFunctionResultsType();

		/**
		 * The meta object literal for the '<em><b>Function Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RESULTS_TYPE__FUNCTION_RESULT = eINSTANCE.getFunctionResultsType_FunctionResult();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl <em>Function Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.FunctionResultTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getFunctionResultType()
		 * @generated
		 */
		EClass FUNCTION_RESULT_TYPE = eINSTANCE.getFunctionResultType();

		/**
		 * The meta object literal for the '<em><b>Function Result Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN = eINSTANCE.getFunctionResultType_FunctionResultColumn();

		/**
		 * The meta object literal for the '<em><b>Function Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RESULT_TYPE__FUNCTION_RESULT = eINSTANCE.getFunctionResultType_FunctionResult();

		/**
		 * The meta object literal for the '<em><b>Show Used Columns Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY = eINSTANCE.getFunctionResultType_ShowUsedColumnsOnly();

		/**
		 * The meta object literal for the '<em><b>Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RESULT_TYPE__COLLAPSED = eINSTANCE.getFunctionResultType_Collapsed();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RESULT_TYPE__OUTPUTS = eINSTANCE.getFunctionResultType_Outputs();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.InputsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getInputsType()
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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.InputTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getInputType()
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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl <em>New Data Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NewDataSetTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNewDataSetType()
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
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__INPUTS = eINSTANCE.getNewDataSetType_Inputs();

		/**
		 * The meta object literal for the '<em><b>Function Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__FUNCTION_RESULT = eINSTANCE.getNewDataSetType_FunctionResult();

		/**
		 * The meta object literal for the '<em><b>Node System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_SET_TYPE__NODE_SYSTEM = eINSTANCE.getNewDataSetType_NodeSystem();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NodeTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

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
		 * The meta object literal for the '<em><b>Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__COLLAPSED = eINSTANCE.getNodeType_Collapsed();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__INPUTS = eINSTANCE.getNodeType_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__OUTPUTS = eINSTANCE.getNodeType_Outputs();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl <em>Node System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NodeSystemTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodeSystemType()
		 * @generated
		 */
		EClass NODE_SYSTEM_TYPE = eINSTANCE.getNodeSystemType();

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
		 * The meta object literal for the '<em><b>Function Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SYSTEM_TYPE__FUNCTION_RESULTS = eINSTANCE.getNodeSystemType_FunctionResults();

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
		 * The meta object literal for the '<em><b>View Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SYSTEM_TYPE__VIEW_OPTIONS = eINSTANCE.getNodeSystemType_ViewOptions();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl <em>Null Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NullNodeTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNullNodeType()
		 * @generated
		 */
		EClass NULL_NODE_TYPE = eINSTANCE.getNullNodeType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_NODE_TYPE__ID = eINSTANCE.getNullNodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_NODE_TYPE__LOCATION = eINSTANCE.getNullNodeType_Location();

		/**
		 * The meta object literal for the '<em><b>Node Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_NODE_TYPE__NODE_CLASS_ID = eINSTANCE.getNullNodeType_NodeClassId();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_NODE_TYPE__NODE_NAME = eINSTANCE.getNullNodeType_NodeName();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ResultsTypeImpl <em>Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ResultsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getResultsType()
		 * @generated
		 */
		EClass RESULTS_TYPE = eINSTANCE.getResultsType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS_TYPE__ID = eINSTANCE.getResultsType_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS_TYPE__LOCATION = eINSTANCE.getResultsType_Location();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_TYPE__RESULT = eINSTANCE.getResultsType_Result();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.SourcesTypeImpl <em>Sources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.SourcesTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourcesType()
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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.SourceTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__NODE = eINSTANCE.getSourceType_Node();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__VALUE = eINSTANCE.getSourceType_Value();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__TABLE_NAME = eINSTANCE.getSourceType_TableName();

		/**
		 * The meta object literal for the '<em><b>Source Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TYPE__SOURCE_COLUMNS = eINSTANCE.getSourceType_SourceColumns();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__RANK = eINSTANCE.getSourceType_Rank();

		/**
		 * The meta object literal for the '<em><b>Visible Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TYPE__VISIBLE_COLUMNS = eINSTANCE.getSourceType_VisibleColumns();

		/**
		 * The meta object literal for the '<em><b>Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__COLLAPSED = eINSTANCE.getSourceType_Collapsed();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__EXPANDED = eINSTANCE.getSourceType_Expanded();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TYPE__OUTPUTS = eINSTANCE.getSourceType_Outputs();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl <em>Column Decorations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getColumnDecorationsType()
		 * @generated
		 */
		EClass COLUMN_DECORATIONS_TYPE = eINSTANCE.getColumnDecorationsType();

		/**
		 * The meta object literal for the '<em><b>Fore Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__FORE_COLOR = eINSTANCE.getColumnDecorationsType_ForeColor();

		/**
		 * The meta object literal for the '<em><b>Back Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__BACK_COLOR = eINSTANCE.getColumnDecorationsType_BackColor();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__ALIGNMENT = eINSTANCE.getColumnDecorationsType_Alignment();

		/**
		 * The meta object literal for the '<em><b>Display Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT = eINSTANCE.getColumnDecorationsType_DisplayFormat();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__CATEGORY = eINSTANCE.getColumnDecorationsType_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DECORATIONS_TYPE__DESCRIPTION = eINSTANCE.getColumnDecorationsType_Description();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.SourceColumnsTypeImpl <em>Source Columns Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.SourceColumnsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceColumnsType()
		 * @generated
		 */
		EClass SOURCE_COLUMNS_TYPE = eINSTANCE.getSourceColumnsType();

		/**
		 * The meta object literal for the '<em><b>Source Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_COLUMNS_TYPE__SOURCE_COLUMN = eINSTANCE.getSourceColumnsType_SourceColumn();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.SourceColumnTypeImpl <em>Source Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.SourceColumnTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getSourceColumnType()
		 * @generated
		 */
		EClass SOURCE_COLUMN_TYPE = eINSTANCE.getSourceColumnType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN_TYPE__ID = eINSTANCE.getSourceColumnType_Id();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN_TYPE__COLUMN = eINSTANCE.getSourceColumnType_Column();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN_TYPE__VALUE_TYPE = eINSTANCE.getSourceColumnType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN_TYPE__NULLABLE = eINSTANCE.getSourceColumnType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN_TYPE__RANK = eINSTANCE.getSourceColumnType_Rank();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ResultTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NewEClass148Impl <em>New EClass148</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NewEClass148Impl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNewEClass148()
		 * @generated
		 */
		EClass NEW_ECLASS148 = eINSTANCE.getNewEClass148();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.VisibleColumnsTypeImpl <em>Visible Columns Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.VisibleColumnsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getVisibleColumnsType()
		 * @generated
		 */
		EClass VISIBLE_COLUMNS_TYPE = eINSTANCE.getVisibleColumnsType();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBLE_COLUMNS_TYPE__ITEM = eINSTANCE.getVisibleColumnsType_Item();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ItemTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__VALUE = eINSTANCE.getItemType_Value();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ViewOptionsTypeImpl <em>View Options Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ViewOptionsTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getViewOptionsType()
		 * @generated
		 */
		EClass VIEW_OPTIONS_TYPE = eINSTANCE.getViewOptionsType();

		/**
		 * The meta object literal for the '<em><b>Connection Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_OPTIONS_TYPE__CONNECTION_STYLE = eINSTANCE.getViewOptionsType_ConnectionStyle();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NodesTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNodesType()
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
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.OutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.OutputTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getOutputType()
		 * @generated
		 */
		EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__NODE_ID = eINSTANCE.getOutputType_NodeId();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.NotFunctionalNodeTypeImpl <em>Not Functional Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.NotFunctionalNodeTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getNotFunctionalNodeType()
		 * @generated
		 */
		EClass NOT_FUNCTIONAL_NODE_TYPE = eINSTANCE.getNotFunctionalNodeType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_FUNCTIONAL_NODE_TYPE__INPUT = eINSTANCE.getNotFunctionalNodeType_Input();

		/**
		 * The meta object literal for the '{@link AlleKnotenFormartiert.impl.ANodeTypeImpl <em>ANode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AlleKnotenFormartiert.impl.ANodeTypeImpl
		 * @see AlleKnotenFormartiert.impl.AlleKnotenFormartiertPackageImpl#getANodeType()
		 * @generated
		 */
		EClass ANODE_TYPE = eINSTANCE.getANodeType();

		/**
		 * The meta object literal for the '<em><b>Adjacency List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANODE_TYPE__ADJACENCY_LIST = eINSTANCE.getANodeType_AdjacencyList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANODE_TYPE__ID = eINSTANCE.getANodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANODE_TYPE__NAME = eINSTANCE.getANodeType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANODE_TYPE__DESCRIPTION = eINSTANCE.getANodeType_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANODE_TYPE__LOCATION = eINSTANCE.getANodeType_Location();

	}

} //AlleKnotenFormartiertPackage
