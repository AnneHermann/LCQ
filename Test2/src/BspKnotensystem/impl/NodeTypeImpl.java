/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.InputsType;
import BspKnotensystem.NodeType;

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
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.impl.NodeTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeTypeImpl#getNodeClassId <em>Node Class Id</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends MinimalEObjectImpl.Container implements NodeType {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputsType> inputs;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeClassId() <em>Node Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_CLASS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeClassId() <em>Node Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClassId()
	 * @generated
	 * @ordered
	 */
	protected String nodeClassId = NODE_CLASS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BspKnotensystemPackage.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputsType> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputsType>(InputsType.class, this, BspKnotensystemPackage.NODE_TYPE__INPUTS);
		}
		return inputs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeClassId() {
		return nodeClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeClassId(String newNodeClassId) {
		String oldNodeClassId = nodeClassId;
		nodeClassId = newNodeClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_TYPE__NODE_CLASS_ID, oldNodeClassId, nodeClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeName(String newNodeName) {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BspKnotensystemPackage.NODE_TYPE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case BspKnotensystemPackage.NODE_TYPE__INPUTS:
				return getInputs();
			case BspKnotensystemPackage.NODE_TYPE__ID:
				return getId();
			case BspKnotensystemPackage.NODE_TYPE__LOCATION:
				return getLocation();
			case BspKnotensystemPackage.NODE_TYPE__NODE_CLASS_ID:
				return getNodeClassId();
			case BspKnotensystemPackage.NODE_TYPE__NODE_NAME:
				return getNodeName();
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
			case BspKnotensystemPackage.NODE_TYPE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputsType>)newValue);
				return;
			case BspKnotensystemPackage.NODE_TYPE__ID:
				setId((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
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
			case BspKnotensystemPackage.NODE_TYPE__INPUTS:
				getInputs().clear();
				return;
			case BspKnotensystemPackage.NODE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId(NODE_CLASS_ID_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
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
			case BspKnotensystemPackage.NODE_TYPE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case BspKnotensystemPackage.NODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BspKnotensystemPackage.NODE_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case BspKnotensystemPackage.NODE_TYPE__NODE_CLASS_ID:
				return NODE_CLASS_ID_EDEFAULT == null ? nodeClassId != null : !NODE_CLASS_ID_EDEFAULT.equals(nodeClassId);
			case BspKnotensystemPackage.NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
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
		result.append(", location: ");
		result.append(location);
		result.append(", nodeClassId: ");
		result.append(nodeClassId);
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(')');
		return result.toString();
	}

} //NodeTypeImpl
