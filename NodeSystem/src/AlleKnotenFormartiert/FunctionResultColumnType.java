/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Result Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultRank <em>Result Rank</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumn <em>Column</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumnDecorations <em>Column Decorations</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getNullable <em>Nullable</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDeleted <em>Result Deleted</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumnDisplayName <em>Column Display Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getName <em>Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDisplayName <em>Result Display Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.FunctionResultColumnType#getMissing <em>Missing</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType()
 * @model extendedMetaData="name='functionResultColumn_._type' kind='empty'"
 * @generated
 */
public interface FunctionResultColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Result Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Rank</em>' attribute.
	 * @see #setResultRank(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ResultRank()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resultRank' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResultRank();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultRank <em>Result Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Rank</em>' attribute.
	 * @see #getResultRank()
	 * @generated
	 */
	void setResultRank(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getColumn();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumn <em>Column</em>}' attribute.
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Column Decorations</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.ColumnDecorationsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Decorations</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ColumnDecorations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnDecorationsType> getColumnDecorations();

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_Nullable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNullable();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(String value);

	/**
	 * Returns the value of the '<em><b>Result Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Deleted</em>' attribute.
	 * @see #setResultDeleted(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ResultDeleted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getResultDeleted();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDeleted <em>Result Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Deleted</em>' attribute.
	 * @see #getResultDeleted()
	 * @generated
	 */
	void setResultDeleted(String value);

	/**
	 * Returns the value of the '<em><b>Column Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Display Name</em>' attribute.
	 * @see #setColumnDisplayName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ColumnDisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getColumnDisplayName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getColumnDisplayName <em>Column Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Display Name</em>' attribute.
	 * @see #getColumnDisplayName()
	 * @generated
	 */
	void setColumnDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Display Name</em>' attribute.
	 * @see #setResultDisplayName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_ResultDisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getResultDisplayName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getResultDisplayName <em>Result Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Display Name</em>' attribute.
	 * @see #getResultDisplayName()
	 * @generated
	 */
	void setResultDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see #setMissing(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getFunctionResultColumnType_Missing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMissing();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.FunctionResultColumnType#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(String value);

} // FunctionResultColumnType
