/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultsType#getFunctionResult <em>Function Result</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultsType()
 * @model extendedMetaData="name='functionResults_._type' kind='elementOnly'"
 * @generated
 */
public interface FunctionResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Result</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.FunctionResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Result</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultsType_FunctionResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionResultType> getFunctionResult();

} // FunctionResultsType
