/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnsType#getSourceColumn <em>Source Column</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnsType()
 * @model
 * @generated
 */
public interface SourceColumnsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Column</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.SourceColumnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnsType_SourceColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceColumnType> getSourceColumn();

} // SourceColumnsType
