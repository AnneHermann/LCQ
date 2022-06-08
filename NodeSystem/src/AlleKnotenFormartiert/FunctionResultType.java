/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultType#getFunctionResultColumn <em>Function Result Column</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultType#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultType#getShowUsedColumnsOnly <em>Show Used Columns Only</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultType#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultType#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType()
 * @model extendedMetaData="name='functionResult_._type' kind='elementOnly'"
 * @generated
 */
public interface FunctionResultType extends NotFunctionalNodeType {
	/**
	 * Returns the value of the '<em><b>Function Result Column</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.FunctionResultColumnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Result Column</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType_FunctionResultColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionResultColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionResultColumnType> getFunctionResultColumn();

	/**
	 * Returns the value of the '<em><b>Function Result</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.FunctionResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Result</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType_FunctionResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionResultType> getFunctionResult();

	/**
	 * Returns the value of the '<em><b>Show Used Columns Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Used Columns Only</em>' attribute.
	 * @see #setShowUsedColumnsOnly(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType_ShowUsedColumnsOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getShowUsedColumnsOnly();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultType#getShowUsedColumnsOnly <em>Show Used Columns Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Used Columns Only</em>' attribute.
	 * @see #getShowUsedColumnsOnly()
	 * @generated
	 */
	void setShowUsedColumnsOnly(String value);

	/**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType_Collapsed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCollapsed();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultType#getCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #getCollapsed()
	 * @generated
	 */
	void setCollapsed(String value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.OutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultType_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputType> getOutputs();

} // FunctionResultType
