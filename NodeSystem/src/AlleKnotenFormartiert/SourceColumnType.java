/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnType#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnType#getColumn <em>Column</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnType#getNullable <em>Nullable</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.SourceColumnType#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType()
 * @model
 * @generated
 */
public interface SourceColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceColumnType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getColumn();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceColumnType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceColumnType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType_Nullable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNullable();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceColumnType#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getSourceColumnType_Rank()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRank();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.SourceColumnType#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(String value);

} // SourceColumnType
