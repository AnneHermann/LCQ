/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.InputType#getSource <em>Source</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.InputType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getInputType()
 * @model extendedMetaData="name='input_._type' kind='elementOnly'"
 * @generated
 */
public interface InputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getInputType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceType> getSource();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getInputType_Parameter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.InputType#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

} // InputType
