/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getNode <em>Node</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getValue <em>Value</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getTableName <em>Table Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getSourceColumns <em>Source Columns</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getRank <em>Rank</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getVisibleColumns <em>Visible Columns</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getExpanded <em>Expanded</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceType#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType()
 * @model extendedMetaData="name='source_._type' kind='empty'"
 * @generated
 */
public interface SourceType extends ANodeType {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Source Columns</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.SourceColumnsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Columns</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_SourceColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceColumnsType> getSourceColumns();

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Rank()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRank();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(String value);

	/**
	 * Returns the value of the '<em><b>Visible Columns</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.VisibleColumnsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Columns</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_VisibleColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisibleColumnsType> getVisibleColumns();

	/**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Collapsed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCollapsed();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #getCollapsed()
	 * @generated
	 */
	void setCollapsed(String value);

	/**
	 * Returns the value of the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded</em>' attribute.
	 * @see #setExpanded(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Expanded()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getExpanded();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceType#getExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #getExpanded()
	 * @generated
	 */
	void setExpanded(String value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.OutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceType_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputType> getOutputs();

} // SourceType
