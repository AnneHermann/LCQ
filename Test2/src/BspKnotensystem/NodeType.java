/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.NodeType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link BspKnotensystem.NodeType#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.NodeType#getLocation <em>Location</em>}</li>
 *   <li>{@link BspKnotensystem.NodeType#getNodeClassId <em>Node Class Id</em>}</li>
 *   <li>{@link BspKnotensystem.NodeType#getNodeName <em>Node Name</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType()
 * @model extendedMetaData="name='Node_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.InputsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InputsType> getInputs();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeType#getId <em>Id</em>}' attribute.
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
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Node Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class Id</em>' attribute.
	 * @see #setNodeClassId(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType_NodeClassId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NodeClassId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeClassId();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeType#getNodeClassId <em>Node Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Class Id</em>' attribute.
	 * @see #getNodeClassId()
	 * @generated
	 */
	void setNodeClassId(String value);

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeType_NodeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeType#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

} // NodeType
