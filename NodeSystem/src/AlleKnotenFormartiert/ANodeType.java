/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.ANodeType#getAdjacencyList <em>Adjacency List</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.ANodeType#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.ANodeType#getName <em>Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.ANodeType#getDescription <em>Description</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.ANodeType#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType()
 * @model abstract="true"
 * @generated
 */
public interface ANodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Adjacency List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacency List</em>' attribute list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType_AdjacencyList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getAdjacencyList();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.ANodeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.ANodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.ANodeType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getANodeType_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.ANodeType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // ANodeType
