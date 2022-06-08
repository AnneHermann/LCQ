/**
 */
package AlleKnotenFormartiert.util;

import AlleKnotenFormartiert.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage
 * @generated
 */
public class AlleKnotenFormartiertAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlleKnotenFormartiertPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleKnotenFormartiertAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlleKnotenFormartiertPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlleKnotenFormartiertSwitch<Adapter> modelSwitch =
		new AlleKnotenFormartiertSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFunctionResultColumnType(FunctionResultColumnType object) {
				return createFunctionResultColumnTypeAdapter();
			}
			@Override
			public Adapter caseFunctionResultsType(FunctionResultsType object) {
				return createFunctionResultsTypeAdapter();
			}
			@Override
			public Adapter caseFunctionResultType(FunctionResultType object) {
				return createFunctionResultTypeAdapter();
			}
			@Override
			public Adapter caseInputsType(InputsType object) {
				return createInputsTypeAdapter();
			}
			@Override
			public Adapter caseInputType(InputType object) {
				return createInputTypeAdapter();
			}
			@Override
			public Adapter caseNewDataSetType(NewDataSetType object) {
				return createNewDataSetTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseNodeSystemType(NodeSystemType object) {
				return createNodeSystemTypeAdapter();
			}
			@Override
			public Adapter caseNullNodeType(NullNodeType object) {
				return createNullNodeTypeAdapter();
			}
			@Override
			public Adapter caseResultsType(ResultsType object) {
				return createResultsTypeAdapter();
			}
			@Override
			public Adapter caseSourcesType(SourcesType object) {
				return createSourcesTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseColumnDecorationsType(ColumnDecorationsType object) {
				return createColumnDecorationsTypeAdapter();
			}
			@Override
			public Adapter caseSourceColumnsType(SourceColumnsType object) {
				return createSourceColumnsTypeAdapter();
			}
			@Override
			public Adapter caseSourceColumnType(SourceColumnType object) {
				return createSourceColumnTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseNewEClass148(NewEClass148 object) {
				return createNewEClass148Adapter();
			}
			@Override
			public Adapter caseVisibleColumnsType(VisibleColumnsType object) {
				return createVisibleColumnsTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseViewOptionsType(ViewOptionsType object) {
				return createViewOptionsTypeAdapter();
			}
			@Override
			public Adapter caseNodesType(NodesType object) {
				return createNodesTypeAdapter();
			}
			@Override
			public Adapter caseOutputType(OutputType object) {
				return createOutputTypeAdapter();
			}
			@Override
			public Adapter caseANodeType(ANodeType object) {
				return createANodeTypeAdapter();
			}
			@Override
			public Adapter caseNotFunctionalNodeType(NotFunctionalNodeType object) {
				return createNotFunctionalNodeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.FunctionResultColumnType <em>Function Result Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.FunctionResultColumnType
	 * @generated
	 */
	public Adapter createFunctionResultColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.FunctionResultsType <em>Function Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.FunctionResultsType
	 * @generated
	 */
	public Adapter createFunctionResultsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.FunctionResultType <em>Function Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.FunctionResultType
	 * @generated
	 */
	public Adapter createFunctionResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.InputsType
	 * @generated
	 */
	public Adapter createInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NewDataSetType <em>New Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NewDataSetType
	 * @generated
	 */
	public Adapter createNewDataSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NodeSystemType <em>Node System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NodeSystemType
	 * @generated
	 */
	public Adapter createNodeSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NullNodeType <em>Null Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NullNodeType
	 * @generated
	 */
	public Adapter createNullNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ResultsType <em>Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ResultsType
	 * @generated
	 */
	public Adapter createResultsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.SourcesType <em>Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.SourcesType
	 * @generated
	 */
	public Adapter createSourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ColumnDecorationsType <em>Column Decorations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ColumnDecorationsType
	 * @generated
	 */
	public Adapter createColumnDecorationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.SourceColumnsType <em>Source Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.SourceColumnsType
	 * @generated
	 */
	public Adapter createSourceColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.SourceColumnType <em>Source Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.SourceColumnType
	 * @generated
	 */
	public Adapter createSourceColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NewEClass148 <em>New EClass148</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NewEClass148
	 * @generated
	 */
	public Adapter createNewEClass148Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.VisibleColumnsType <em>Visible Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.VisibleColumnsType
	 * @generated
	 */
	public Adapter createVisibleColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ViewOptionsType <em>View Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ViewOptionsType
	 * @generated
	 */
	public Adapter createViewOptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NodesType
	 * @generated
	 */
	public Adapter createNodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.NotFunctionalNodeType <em>Not Functional Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.NotFunctionalNodeType
	 * @generated
	 */
	public Adapter createNotFunctionalNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlleKnotenFormartiert.ANodeType <em>ANode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlleKnotenFormartiert.ANodeType
	 * @generated
	 */
	public Adapter createANodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlleKnotenFormartiertAdapterFactory
