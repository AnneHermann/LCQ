/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.ResultsType#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getResultsType()
 * @model extendedMetaData="name='Results_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getResultsType_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResultType> getResult();

} // ResultsType
