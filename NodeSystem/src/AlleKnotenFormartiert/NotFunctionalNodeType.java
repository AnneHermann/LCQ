/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Functional Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.NotFunctionalNodeType#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNotFunctionalNodeType()
 * @model abstract="true"
 * @generated
 */
public interface NotFunctionalNodeType extends ANodeType {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNotFunctionalNodeType_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputType> getInput();

} // NotFunctionalNodeType
