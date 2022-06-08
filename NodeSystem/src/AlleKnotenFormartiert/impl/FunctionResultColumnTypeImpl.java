/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.ColumnDecorationsType;
import AlleKnotenFormartiert.FunctionResultColumnType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Result Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getResultRank <em>Result Rank</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getColumnDecorations <em>Column Decorations</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getResultDeleted <em>Result Deleted</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getColumnDisplayName <em>Column Display Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getResultDisplayName <em>Result Display Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultColumnTypeImpl#getMissing <em>Missing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionResultColumnTypeImpl extends MinimalEObjectImpl.Container implements FunctionResultColumnType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultRank() <em>Result Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultRank()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultRank() <em>Result Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultRank()
	 * @generated
	 * @ordered
	 */
	protected String resultRank = RESULT_RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected String column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnDecorations() <em>Column Decorations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDecorations()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnDecorationsType> columnDecorations;

	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final String NULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected String nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultDeleted() <em>Result Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_DELETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultDeleted() <em>Result Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDeleted()
	 * @generated
	 * @ordered
	 */
	protected String resultDeleted = RESULT_DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnDisplayName() <em>Column Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnDisplayName() <em>Column Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String columnDisplayName = COLUMN_DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultDisplayName() <em>Result Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultDisplayName() <em>Result Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String resultDisplayName = RESULT_DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected String missing = MISSING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionResultColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultRank() {
		return resultRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultRank(String newResultRank) {
		String oldResultRank = resultRank;
		resultRank = newResultRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK, oldResultRank, resultRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(String newColumn) {
		String oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnDecorationsType> getColumnDecorations() {
		if (columnDecorations == null) {
			columnDecorations = new EObjectContainmentEList<ColumnDecorationsType>(ColumnDecorationsType.class, this, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS);
		}
		return columnDecorations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(String newNullable) {
		String oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultDeleted() {
		return resultDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultDeleted(String newResultDeleted) {
		String oldResultDeleted = resultDeleted;
		resultDeleted = newResultDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED, oldResultDeleted, resultDeleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnDisplayName() {
		return columnDisplayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDisplayName(String newColumnDisplayName) {
		String oldColumnDisplayName = columnDisplayName;
		columnDisplayName = newColumnDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME, oldColumnDisplayName, columnDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultDisplayName() {
		return resultDisplayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultDisplayName(String newResultDisplayName) {
		String oldResultDisplayName = resultDisplayName;
		resultDisplayName = newResultDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME, oldResultDisplayName, resultDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(String newMissing) {
		String oldMissing = missing;
		missing = newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING, oldMissing, missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
				return ((InternalEList<?>)getColumnDecorations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID:
				return getId();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK:
				return getResultRank();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN:
				return getColumn();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE:
				return getValueType();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
				return getColumnDecorations();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE:
				return getNullable();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED:
				return getResultDeleted();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME:
				return getColumnDisplayName();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME:
				return getName();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME:
				return getResultDisplayName();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING:
				return getMissing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID:
				setId((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK:
				setResultRank((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN:
				setColumn((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE:
				setValueType((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
				getColumnDecorations().clear();
				getColumnDecorations().addAll((Collection<? extends ColumnDecorationsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE:
				setNullable((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED:
				setResultDeleted((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME:
				setColumnDisplayName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME:
				setName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME:
				setResultDisplayName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING:
				setMissing((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK:
				setResultRank(RESULT_RANK_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
				getColumnDecorations().clear();
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED:
				setResultDeleted(RESULT_DELETED_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME:
				setColumnDisplayName(COLUMN_DISPLAY_NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME:
				setResultDisplayName(RESULT_DISPLAY_NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING:
				setMissing(MISSING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK:
				return RESULT_RANK_EDEFAULT == null ? resultRank != null : !RESULT_RANK_EDEFAULT.equals(resultRank);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE:
				return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
				return columnDecorations != null && !columnDecorations.isEmpty();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE:
				return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED:
				return RESULT_DELETED_EDEFAULT == null ? resultDeleted != null : !RESULT_DELETED_EDEFAULT.equals(resultDeleted);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME:
				return COLUMN_DISPLAY_NAME_EDEFAULT == null ? columnDisplayName != null : !COLUMN_DISPLAY_NAME_EDEFAULT.equals(columnDisplayName);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME:
				return RESULT_DISPLAY_NAME_EDEFAULT == null ? resultDisplayName != null : !RESULT_DISPLAY_NAME_EDEFAULT.equals(resultDisplayName);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING:
				return MISSING_EDEFAULT == null ? missing != null : !MISSING_EDEFAULT.equals(missing);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", resultRank: ");
		result.append(resultRank);
		result.append(", column: ");
		result.append(column);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", resultDeleted: ");
		result.append(resultDeleted);
		result.append(", columnDisplayName: ");
		result.append(columnDisplayName);
		result.append(", name: ");
		result.append(name);
		result.append(", resultDisplayName: ");
		result.append(resultDisplayName);
		result.append(", missing: ");
		result.append(missing);
		result.append(')');
		return result.toString();
	}

} //FunctionResultColumnTypeImpl
