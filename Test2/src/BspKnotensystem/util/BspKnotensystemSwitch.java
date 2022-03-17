/**
 */
package BspKnotensystem.util;

import BspKnotensystem.*;

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
 * @see BspKnotensystem.BspKnotensystemPackage
 * @generated
 */
public class BspKnotensystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BspKnotensystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BspKnotensystemSwitch() {
		if (modelPackage == null) {
			modelPackage = BspKnotensystemPackage.eINSTANCE;
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
			case BspKnotensystemPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.INPUTS_TYPE: {
				InputsType inputsType = (InputsType)theEObject;
				T result = caseInputsType(inputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.INPUT_TYPE: {
				InputType inputType = (InputType)theEObject;
				T result = caseInputType(inputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE: {
				NewDataSetType newDataSetType = (NewDataSetType)theEObject;
				T result = caseNewDataSetType(newDataSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.NODES_TYPE: {
				NodesType nodesType = (NodesType)theEObject;
				T result = caseNodesType(nodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE: {
				NodeSystemType nodeSystemType = (NodeSystemType)theEObject;
				T result = caseNodeSystemType(nodeSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.NODE_TYPE: {
				NodeType nodeType = (NodeType)theEObject;
				T result = caseNodeType(nodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.RESULTS_TYPE: {
				ResultsType resultsType = (ResultsType)theEObject;
				T result = caseResultsType(resultsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.SOURCES_TYPE: {
				SourcesType sourcesType = (SourcesType)theEObject;
				T result = caseSourcesType(sourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BspKnotensystemPackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
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

} //BspKnotensystemSwitch
