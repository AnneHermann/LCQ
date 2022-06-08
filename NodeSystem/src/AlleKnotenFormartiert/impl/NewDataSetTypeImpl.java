/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultType;
import AlleKnotenFormartiert.InputsType;
import AlleKnotenFormartiert.NewDataSetType;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.SourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NewDataSetTypeImpl#getNodeSystem <em>Node System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewDataSetTypeImpl extends MinimalEObjectImpl.Container implements NewDataSetType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewDataSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.NEW_DATA_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceType> getSource() {
		return getGroup().list(AlleKnotenFormartiertPackage.Literals.NEW_DATA_SET_TYPE__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputsType> getInputs() {
		return getGroup().list(AlleKnotenFormartiertPackage.Literals.NEW_DATA_SET_TYPE__INPUTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionResultType> getFunctionResult() {
		return getGroup().list(AlleKnotenFormartiertPackage.Literals.NEW_DATA_SET_TYPE__FUNCTION_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSystemType> getNodeSystem() {
		return getGroup().list(AlleKnotenFormartiertPackage.Literals.NEW_DATA_SET_TYPE__NODE_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__FUNCTION_RESULT:
				return ((InternalEList<?>)getFunctionResult()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
				return ((InternalEList<?>)getNodeSystem()).basicRemove(otherEnd, msgs);
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
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__SOURCE:
				return getSource();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__INPUTS:
				return getInputs();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__FUNCTION_RESULT:
				return getFunctionResult();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
				return getNodeSystem();
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
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
				getFunctionResult().addAll((Collection<? extends FunctionResultType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
				getNodeSystem().clear();
				getNodeSystem().addAll((Collection<? extends NodeSystemType>)newValue);
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
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__SOURCE:
				getSource().clear();
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__INPUTS:
				getInputs().clear();
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__FUNCTION_RESULT:
				getFunctionResult().clear();
				return;
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
				getNodeSystem().clear();
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
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__SOURCE:
				return !getSource().isEmpty();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__INPUTS:
				return !getInputs().isEmpty();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__FUNCTION_RESULT:
				return !getFunctionResult().isEmpty();
			case AlleKnotenFormartiertPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
				return !getNodeSystem().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //NewDataSetTypeImpl
