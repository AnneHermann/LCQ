/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultType;
import AlleKnotenFormartiert.FunctionResultsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Results Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.FunctionResultsTypeImpl#getFunctionResult <em>Function Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionResultsTypeImpl extends MinimalEObjectImpl.Container implements FunctionResultsType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionResultsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionResultType> getFunctionResult() {
		if (functionResult == null) {
			functionResult = new EObjectContainmentEList<FunctionResultType>(FunctionResultType.class, this, AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT);
		}
		return functionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT:
				return ((InternalEList<?>)getFunctionResult()).basicRemove(otherEnd, msgs);
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT:
				return getFunctionResult();
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
				getFunctionResult().addAll((Collection<? extends FunctionResultType>)newValue);
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
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
			case AlleKnotenFormartiertPackage.FUNCTION_RESULTS_TYPE__FUNCTION_RESULT:
				return functionResult != null && !functionResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionResultsTypeImpl
