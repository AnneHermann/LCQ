/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlleKnotenFormartiertFactoryImpl extends EFactoryImpl implements AlleKnotenFormartiertFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlleKnotenFormartiertFactory init() {
		try {
			AlleKnotenFormartiertFactory theAlleKnotenFormartiertFactory = (AlleKnotenFormartiertFactory)EPackage.Registry.INSTANCE.getEFactory(AlleKnotenFormartiertPackage.eNS_URI);
			if (theAlleKnotenFormartiertFactory != null) {
				return theAlleKnotenFormartiertFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlleKnotenFormartiertFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleKnotenFormartiertFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE: return createFunctionResultColumnType();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE: return createFunctionResultsType();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE: return createFunctionResultType();
			case AlleKnotenFormartiertPackage.INPUTS_TYPE: return createInputsType();
			case AlleKnotenFormartiertPackage.INPUT_TYPE: return createInputType();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE: return createNewDataSetType();
			case AlleKnotenFormartiertPackage.NODE_TYPE: return createNodeType();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE: return createNodeSystemType();
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE: return createNullNodeType();
			case AlleKnotenFormartiertPackage.RESULTS_TYPE: return createResultsType();
			case AlleKnotenFormartiertPackage.SOURCES_TYPE: return createSourcesType();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE: return createSourceType();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE: return createColumnDecorationsType();
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE: return createSourceColumnsType();
			case AlleKnotenFormartiertPackage.SOURCE_COLUMN_TYPE: return createSourceColumnType();
			case AlleKnotenFormartiertPackage.RESULT_TYPE: return createResultType();
			case AlleKnotenFormartiertPackage.NEW_ECLASS148: return createNewEClass148();
			case AlleKnotenFormartiertPackage.VISIBLE_COLUMNS_TYPE: return createVisibleColumnsType();
			case AlleKnotenFormartiertPackage.ITEM_TYPE: return createItemType();
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE: return createViewOptionsType();
			case AlleKnotenFormartiertPackage.NODES_TYPE: return createNodesType();
			case AlleKnotenFormartiertPackage.OUTPUT_TYPE: return createOutputType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResultColumnType createFunctionResultColumnType() {
		FunctionResultColumnTypeImpl functionResultColumnType = new FunctionResultColumnTypeImpl();
		return functionResultColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResultsType createFunctionResultsType() {
		FunctionResultsTypeImpl functionResultsType = new FunctionResultsTypeImpl();
		return functionResultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResultType createFunctionResultType() {
		FunctionResultTypeImpl functionResultType = new FunctionResultTypeImpl();
		return functionResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType createInputsType() {
		InputsTypeImpl inputsType = new InputsTypeImpl();
		return inputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewDataSetType createNewDataSetType() {
		NewDataSetTypeImpl newDataSetType = new NewDataSetTypeImpl();
		return newDataSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSystemType createNodeSystemType() {
		NodeSystemTypeImpl nodeSystemType = new NodeSystemTypeImpl();
		return nodeSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullNodeType createNullNodeType() {
		NullNodeTypeImpl nullNodeType = new NullNodeTypeImpl();
		return nullNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsType createResultsType() {
		ResultsTypeImpl resultsType = new ResultsTypeImpl();
		return resultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcesType createSourcesType() {
		SourcesTypeImpl sourcesType = new SourcesTypeImpl();
		return sourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnDecorationsType createColumnDecorationsType() {
		ColumnDecorationsTypeImpl columnDecorationsType = new ColumnDecorationsTypeImpl();
		return columnDecorationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceColumnsType createSourceColumnsType() {
		SourceColumnsTypeImpl sourceColumnsType = new SourceColumnsTypeImpl();
		return sourceColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceColumnType createSourceColumnType() {
		SourceColumnTypeImpl sourceColumnType = new SourceColumnTypeImpl();
		return sourceColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass148 createNewEClass148() {
		NewEClass148Impl newEClass148 = new NewEClass148Impl();
		return newEClass148;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleColumnsType createVisibleColumnsType() {
		VisibleColumnsTypeImpl visibleColumnsType = new VisibleColumnsTypeImpl();
		return visibleColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewOptionsType createViewOptionsType() {
		ViewOptionsTypeImpl viewOptionsType = new ViewOptionsTypeImpl();
		return viewOptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesType createNodesType() {
		NodesTypeImpl nodesType = new NodesTypeImpl();
		return nodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputType() {
		OutputTypeImpl outputType = new OutputTypeImpl();
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleKnotenFormartiertPackage getAlleKnotenFormartiertPackage() {
		return (AlleKnotenFormartiertPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlleKnotenFormartiertPackage getPackage() {
		return AlleKnotenFormartiertPackage.eINSTANCE;
	}

} //AlleKnotenFormartiertFactoryImpl
