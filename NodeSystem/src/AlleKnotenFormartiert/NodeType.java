/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.NodeType#getNodeClassId <em>Node Class Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeType#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeType#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeType#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType()
 * @model extendedMetaData="name='nodes_._type' kind='empty'"
 * @generated
 */
public interface NodeType extends ANodeType {
	/**
	 * Returns the value of the '<em><b>Node Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class Id</em>' attribute.
	 * @see #setNodeClassId(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType_NodeClassId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nodeClassId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeClassId();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeType#getNodeClassId <em>Node Class Id</em>}' attribute.
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType_NodeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeType#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType_Collapsed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCollapsed();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeType#getCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #getCollapsed()
	 * @generated
	 */
	void setCollapsed(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.InputsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputsType> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.OutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeType_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputType> getOutputs();

} // NodeType
