/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.NodesType#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getNodesType()
 * @model extendedMetaData="name='Nodes_._type' kind='elementOnly'"
 * @generated
 */
public interface NodesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodesType_Node()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeType> getNode();

} // NodesType
