/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.SourcesType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getSourcesType()
 * @model extendedMetaData="name='Sources_._type' kind='elementOnly'"
 * @generated
 */
public interface SourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourcesType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceType> getSource();

} // SourcesType
