/**
 */
package BspKnotensystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.SourceType#getSourceColumns <em>Source Columns</em>}</li>
 *   <li>{@link BspKnotensystem.SourceType#getVisibleColumns <em>Visible Columns</em>}</li>
 *   <li>{@link BspKnotensystem.SourceType#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.SourceType#getLocation <em>Location</em>}</li>
 *   <li>{@link BspKnotensystem.SourceType#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType()
 * @model extendedMetaData="name='Source_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Columns</em>' attribute.
	 * @see #setSourceColumns(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType_SourceColumns()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='0'"
	 *        extendedMetaData="kind='element' name='SourceColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceColumns();

	/**
	 * Sets the value of the '{@link BspKnotensystem.SourceType#getSourceColumns <em>Source Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Columns</em>' attribute.
	 * @see #getSourceColumns()
	 * @generated
	 */
	void setSourceColumns(String value);

	/**
	 * Returns the value of the '<em><b>Visible Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Columns</em>' attribute.
	 * @see #setVisibleColumns(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType_VisibleColumns()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='1'"
	 *        extendedMetaData="kind='element' name='VisibleColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisibleColumns();

	/**
	 * Sets the value of the '{@link BspKnotensystem.SourceType#getVisibleColumns <em>Visible Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Columns</em>' attribute.
	 * @see #getVisibleColumns()
	 * @generated
	 */
	void setVisibleColumns(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link BspKnotensystem.SourceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link BspKnotensystem.SourceType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getSourceType_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Node' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link BspKnotensystem.SourceType#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // SourceType
