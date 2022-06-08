/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.InputsType#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getInputsType()
 * @model extendedMetaData="name='inputs_._type' kind='elementOnly'"
 * @generated
 */
public interface InputsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getInputsType_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InputType> getInput();

} // InputsType
