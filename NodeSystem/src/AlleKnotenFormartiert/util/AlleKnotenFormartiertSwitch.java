/**
 */
package AlleKnotenFormartiert.util;

import AlleKnotenFormartiert.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage
 * @generated
 */
public class AlleKnotenFormartiertSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlleKnotenFormartiertPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleKnotenFormartiertSwitch() {
		if (modelPackage == null) {
			modelPackage = AlleKnotenFormartiertPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE: {
				FunctionResultColumnType functionResultColumnType = (FunctionResultColumnType)theEObject;
				T result = caseFunctionResultColumnType(functionResultColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE: {
				FunctionResultsType functionResultsType = (FunctionResultsType)theEObject;
				T result = caseFunctionResultsType(functionResultsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE: {
				FunctionResultType functionResultType = (FunctionResultType)theEObject;
				T result = caseFunctionResultType(functionResultType);
				if (result == null) result = caseNotFunctionalNodeType(functionResultType);
				if (result == null) result = caseANodeType(functionResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.INPUTS_TYPE: {
				InputsType inputsType = (InputsType)theEObject;
				T result = caseInputsType(inputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.INPUT_TYPE: {
				InputType inputType = (InputType)theEObject;
				T result = caseInputType(inputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE: {
				NewDataSetType newDataSetType = (NewDataSetType)theEObject;
				T result = caseNewDataSetType(newDataSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NODE_TYPE: {
				NodeType nodeType = (NodeType)theEObject;
				T result = caseNodeType(nodeType);
				if (result == null) result = caseANodeType(nodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE: {
				NodeSystemType nodeSystemType = (NodeSystemType)theEObject;
				T result = caseNodeSystemType(nodeSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE: {
				NullNodeType nullNodeType = (NullNodeType)theEObject;
				T result = caseNullNodeType(nullNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.RESULTS_TYPE: {
				ResultsType resultsType = (ResultsType)theEObject;
				T result = caseResultsType(resultsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.SOURCES_TYPE: {
				SourcesType sourcesType = (SourcesType)theEObject;
				T result = caseSourcesType(sourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = caseANodeType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE: {
				ColumnDecorationsType columnDecorationsType = (ColumnDecorationsType)theEObject;
				T result = caseColumnDecorationsType(columnDecorationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE: {
				SourceColumnsType sourceColumnsType = (SourceColumnsType)theEObject;
				T result = caseSourceColumnsType(sourceColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.SOURCE_COLUMN_TYPE: {
				SourceColumnType sourceColumnType = (SourceColumnType)theEObject;
				T result = caseSourceColumnType(sourceColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = caseNotFunctionalNodeType(resultType);
				if (result == null) result = caseANodeType(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NEW_ECLASS148: {
				NewEClass148 newEClass148 = (NewEClass148)theEObject;
				T result = caseNewEClass148(newEClass148);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.VISIBLE_COLUMNS_TYPE: {
				VisibleColumnsType visibleColumnsType = (VisibleColumnsType)theEObject;
				T result = caseVisibleColumnsType(visibleColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE: {
				ViewOptionsType viewOptionsType = (ViewOptionsType)theEObject;
				T result = caseViewOptionsType(viewOptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NODES_TYPE: {
				NodesType nodesType = (NodesType)theEObject;
				T result = caseNodesType(nodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.OUTPUT_TYPE: {
				OutputType outputType = (OutputType)theEObject;
				T result = caseOutputType(outputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.ANODE_TYPE: {
				ANodeType aNodeType = (ANodeType)theEObject;
				T result = caseANodeType(aNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlleKnotenFormartiertPackage.NOT_FUNCTIONAL_NODE_TYPE: {
				NotFunctionalNodeType notFunctionalNodeType = (NotFunctionalNodeType)theEObject;
				T result = caseNotFunctionalNodeType(notFunctionalNodeType);
				if (result == null) result = caseANodeType(notFunctionalNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Result Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Result Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionResultColumnType(FunctionResultColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Results Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionResultsType(FunctionResultsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionResultType(FunctionResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType(InputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType(InputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Data Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Data Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewDataSetType(NewDataSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeType(NodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSystemType(NodeSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullNodeType(NullNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsType(ResultsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourcesType(SourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Decorations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Decorations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnDecorationsType(ColumnDecorationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceColumnsType(SourceColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceColumnType(SourceColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass148</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass148</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass148(NewEClass148 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visible Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visible Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibleColumnsType(VisibleColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Options Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewOptionsType(ViewOptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesType(NodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Functional Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Functional Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotFunctionalNodeType(NotFunctionalNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANodeType(ANodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AlleKnotenFormartiertSwitch
