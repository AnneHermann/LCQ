/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultColumnType;
import AlleKnotenFormartiert.FunctionResultType;
import AlleKnotenFormartiert.OutputType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl#getFunctionResultColumn <em>Function Result Column</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl#getShowUsedColumnsOnly <em>Show Used Columns Only</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultTypeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionResultTypeImpl extends NotFunctionalNodeTypeImpl implements FunctionResultType {
	/**
	 * The cached value of the '{@link #getFunctionResultColumn() <em>Function Result Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionResultColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionResultColumnType> functionResultColumn;

	/**
	 * The cached value of the '{@link #getFunctionResult() <em>Function Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionResultType> functionResult;

	/**
	 * The default value of the '{@link #getShowUsedColumnsOnly() <em>Show Used Columns Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowUsedColumnsOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_USED_COLUMNS_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowUsedColumnsOnly() <em>Show Used Columns Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowUsedColumnsOnly()
	 * @generated
	 * @ordered
	 */
	protected String showUsedColumnsOnly = SHOW_USED_COLUMNS_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLAPSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsed()
	 * @generated
	 * @ordered
	 */
	protected String collapsed = COLLAPSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputType> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionResultColumnType> getFunctionResultColumn() {
		if (functionResultColumn == null) {
			functionResultColumn = new EObjectContainmentEList<FunctionResultColumnType>(FunctionResultColumnType.class, this, AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN);
		}
		return functionResultColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionResultType> getFunctionResult() {
		if (functionResult == null) {
			functionResult = new EObjectContainmentEList<FunctionResultType>(FunctionResultType.class, this, AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT);
		}
		return functionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShowUsedColumnsOnly() {
		return showUsedColumnsOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowUsedColumnsOnly(String newShowUsedColumnsOnly) {
		String oldShowUsedColumnsOnly = showUsedColumnsOnly;
		showUsedColumnsOnly = newShowUsedColumnsOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY, oldShowUsedColumnsOnly, showUsedColumnsOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollapsed() {
		return collapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsed(String newCollapsed) {
		String oldCollapsed = collapsed;
		collapsed = newCollapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED, oldCollapsed, collapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputType> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputType>(OutputType.class, this, AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
				return ((InternalEList<?>)getFunctionResultColumn()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
				return ((InternalEList<?>)getFunctionResult()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
				return getFunctionResultColumn();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
				return getFunctionResult();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY:
				return getShowUsedColumnsOnly();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED:
				return getCollapsed();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
				return getOutputs();
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
				getFunctionResultColumn().clear();
				getFunctionResultColumn().addAll((Collection<? extends FunctionResultColumnType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
				getFunctionResult().addAll((Collection<? extends FunctionResultType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY:
				setShowUsedColumnsOnly((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED:
				setCollapsed((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputType>)newValue);
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
				getFunctionResultColumn().clear();
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY:
				setShowUsedColumnsOnly(SHOW_USED_COLUMNS_ONLY_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
				getOutputs().clear();
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
				return functionResultColumn != null && !functionResultColumn.isEmpty();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
				return functionResult != null && !functionResult.isEmpty();
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY:
				return SHOW_USED_COLUMNS_ONLY_EDEFAULT == null ? showUsedColumnsOnly != null : !SHOW_USED_COLUMNS_ONLY_EDEFAULT.equals(showUsedColumnsOnly);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED:
				return COLLAPSED_EDEFAULT == null ? collapsed != null : !COLLAPSED_EDEFAULT.equals(collapsed);
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		result.append(" (showUsedColumnsOnly: ");
		result.append(showUsedColumnsOnly);
		result.append(", collapsed: ");
		result.append(collapsed);
		result.append(')');
		return result.toString();
	}

} //FunctionResultTypeImpl
