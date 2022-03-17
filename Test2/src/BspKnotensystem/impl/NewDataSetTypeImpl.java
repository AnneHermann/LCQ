/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.InputType;
import BspKnotensystem.NewDataSetType;
import BspKnotensystem.NodeSystemType;
import BspKnotensystem.SourceType;

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
 *   <li>{@link BspKnotensystem.impl.NewDataSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NewDataSetTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NewDataSetTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NewDataSetTypeImpl#getNodeSystem <em>Node System</em>}</li>
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
		return BspKnotensystemPackage.Literals.NEW_DATA_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceType> getSource() {
		return getGroup().list(BspKnotensystemPackage.Literals.NEW_DATA_SET_TYPE__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputType> getInput() {
		return getGroup().list(BspKnotensystemPackage.Literals.NEW_DATA_SET_TYPE__INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSystemType> getNodeSystem() {
		return getGroup().list(BspKnotensystemPackage.Literals.NEW_DATA_SET_TYPE__NODE_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
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
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__SOURCE:
				return getSource();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__INPUT:
				return getInput();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
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
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceType>)newValue);
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputType>)newValue);
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
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
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__SOURCE:
				getSource().clear();
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__INPUT:
				getInput().clear();
				return;
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
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
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__SOURCE:
				return !getSource().isEmpty();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__INPUT:
				return !getInput().isEmpty();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE__NODE_SYSTEM:
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
