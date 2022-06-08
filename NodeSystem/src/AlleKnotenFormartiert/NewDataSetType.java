/**
 */
package AlleKnotenFormartiert;

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
 *   <li>{@link AlleKnotenFormartiert.NewDataSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NewDataSetType#getSource <em>Source</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NewDataSetType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NewDataSetType#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NewDataSetType#getNodeSystem <em>Node System</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType()
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SourceType> getSource();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.InputsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType_Inputs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<InputsType> getInputs();

	/**
	 * Returns the value of the '<em><b>Function Result</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.FunctionResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Result</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType_FunctionResult()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='functionResult' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<FunctionResultType> getFunctionResult();

	/**
	 * Returns the value of the '<em><b>Node System</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.NodeSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node System</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNewDataSetType_NodeSystem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nodeSystem' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<NodeSystemType> getNodeSystem();

} // NewDataSetType
