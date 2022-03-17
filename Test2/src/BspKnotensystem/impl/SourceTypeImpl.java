/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.SourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.impl.SourceTypeImpl#getSourceColumns <em>Source Columns</em>}</li>
 *   <li>{@link BspKnotensystem.impl.SourceTypeImpl#getVisibleColumns <em>Visible Columns</em>}</li>
 *   <li>{@link BspKnotensystem.impl.SourceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.impl.SourceTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link BspKnotensystem.impl.SourceTypeImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends MinimalEObjectImpl.Container implements SourceType {
	/**
	 * The default value of the '{@link #getSourceColumns() <em>Source Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceColumns() <em>Source Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumns()
	 * @generated
	 * @ordered
	 */
	protected String sourceColumns = SOURCE_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleColumns() <em>Visible Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleColumns() <em>Visible Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleColumns()
	 * @generated
	 * @ordered
	 */
	protected String visibleColumns = VISIBLE_COLUMNS_EDEFAULT;

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
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BspKnotensystemPackage.Literals.SOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceColumns() {
		return sourceColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceColumns(String newSourceColumns) {
		String oldSourceColumns = sourceColumns;
		sourceColumns = newSourceColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.SOURCE_TYPE__SOURCE_COLUMNS, oldSourceColumns, sourceColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleColumns() {
		return visibleColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleColumns(String newVisibleColumns) {
		String oldVisibleColumns = visibleColumns;
		visibleColumns = newVisibleColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.SOURCE_TYPE__VISIBLE_COLUMNS, oldVisibleColumns, visibleColumns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.SOURCE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.SOURCE_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.SOURCE_TYPE__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BspKnotensystemPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				return getSourceColumns();
			case BspKnotensystemPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				return getVisibleColumns();
			case BspKnotensystemPackage.SOURCE_TYPE__ID:
				return getId();
			case BspKnotensystemPackage.SOURCE_TYPE__LOCATION:
				return getLocation();
			case BspKnotensystemPackage.SOURCE_TYPE__NODE:
				return getNode();
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
			case BspKnotensystemPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				setSourceColumns((String)newValue);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				setVisibleColumns((String)newValue);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__ID:
				setId((String)newValue);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__NODE:
				setNode((String)newValue);
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
			case BspKnotensystemPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				setSourceColumns(SOURCE_COLUMNS_EDEFAULT);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				setVisibleColumns(VISIBLE_COLUMNS_EDEFAULT);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case BspKnotensystemPackage.SOURCE_TYPE__NODE:
				setNode(NODE_EDEFAULT);
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
			case BspKnotensystemPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				return SOURCE_COLUMNS_EDEFAULT == null ? sourceColumns != null : !SOURCE_COLUMNS_EDEFAULT.equals(sourceColumns);
			case BspKnotensystemPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				return VISIBLE_COLUMNS_EDEFAULT == null ? visibleColumns != null : !VISIBLE_COLUMNS_EDEFAULT.equals(visibleColumns);
			case BspKnotensystemPackage.SOURCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BspKnotensystemPackage.SOURCE_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case BspKnotensystemPackage.SOURCE_TYPE__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
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
		result.append(" (sourceColumns: ");
		result.append(sourceColumns);
		result.append(", visibleColumns: ");
		result.append(visibleColumns);
		result.append(", id: ");
		result.append(id);
		result.append(", location: ");
		result.append(location);
		result.append(", node: ");
		result.append(node);
		result.append(')');
		return result.toString();
	}

} //SourceTypeImpl
