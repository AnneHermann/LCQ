/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.NewDataSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link BspKnotensystem.NewDataSetType#getSource <em>Source</em>}</li>
 *   <li>{@link BspKnotensystem.NewDataSetType#getInput <em>Input</em>}</li>
 *   <li>{@link BspKnotensystem.NewDataSetType#getNodeSystem <em>Node System</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getNewDataSetType()
 * @model extendedMetaData="name='NewDataSet_._type' kind='elementOnly'"
 * @generated
 */
public interface NewDataSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNewDataSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNewDataSetType_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SourceType> getSource();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNewDataSetType_Input()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<InputType> getInput();

	/**
	 * Returns the value of the '<em><b>Node System</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.NodeSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node System</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNewDataSetType_NodeSystem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeSystem' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<NodeSystemType> getNodeSystem();

} // NewDataSetType
