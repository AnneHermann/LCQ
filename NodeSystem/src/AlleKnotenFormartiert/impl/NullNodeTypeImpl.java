/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.NullNodeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl#getNodeClassId <em>Node Class Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NullNodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullNodeTypeImpl extends MinimalEObjectImpl.Container implements NullNodeType {
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
	protected NullNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.NULL_NODE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NULL_NODE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NULL_NODE_TYPE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_CLASS_ID, oldNodeClassId, nodeClassId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__ID:
				return getId();
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__LOCATION:
				return getLocation();
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_CLASS_ID:
				return getNodeClassId();
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_NAME:
				return getNodeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__ID:
				setId((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_NAME:
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
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId(NODE_CLASS_ID_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_NAME:
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
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_CLASS_ID:
				return NODE_CLASS_ID_EDEFAULT == null ? nodeClassId != null : !NODE_CLASS_ID_EDEFAULT.equals(nodeClassId);
			case AlleKnotenFormartiertPackage.NULL_NODE_TYPE__NODE_NAME:
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

} //NullNodeTypeImpl
