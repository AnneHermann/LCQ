/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.OutputType;
import AlleKnotenFormartiert.SourceColumnsType;
import AlleKnotenFormartiert.SourceType;
import AlleKnotenFormartiert.VisibleColumnsType;

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
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getSourceColumns <em>Source Columns</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getVisibleColumns <em>Visible Columns</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getExpanded <em>Expanded</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceTypeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends ANodeTypeImpl implements SourceType {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceColumns() <em>Source Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumnsType> sourceColumns;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final String RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected String rank = RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibleColumns() <em>Visible Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibleColumnsType> visibleColumns;

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
	 * The default value of the '{@link #getExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPANDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanded()
	 * @generated
	 * @ordered
	 */
	protected String expanded = EXPANDED_EDEFAULT;

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
		return AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumnsType> getSourceColumns() {
		if (sourceColumns == null) {
			sourceColumns = new EObjectContainmentEList<SourceColumnsType>(SourceColumnsType.class, this, AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS);
		}
		return sourceColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(String newRank) {
		String oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisibleColumnsType> getVisibleColumns() {
		if (visibleColumns == null) {
			visibleColumns = new EObjectContainmentEList<VisibleColumnsType>(VisibleColumnsType.class, this, AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS);
		}
		return visibleColumns;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED, oldCollapsed, collapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpanded(String newExpanded) {
		String oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputType> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputType>(OutputType.class, this, AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS);
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
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				return ((InternalEList<?>)getSourceColumns()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				return ((InternalEList<?>)getVisibleColumns()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE:
				return getNode();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE:
				return getValue();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME:
				return getTableName();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				return getSourceColumns();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK:
				return getRank();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				return getVisibleColumns();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED:
				return getCollapsed();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED:
				return getExpanded();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE:
				setNode((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				getSourceColumns().clear();
				getSourceColumns().addAll((Collection<? extends SourceColumnsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK:
				setRank((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				getVisibleColumns().clear();
				getVisibleColumns().addAll((Collection<? extends VisibleColumnsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED:
				setCollapsed((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED:
				setExpanded((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				getSourceColumns().clear();
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				getVisibleColumns().clear();
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
				return sourceColumns != null && !sourceColumns.isEmpty();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK:
				return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
				return visibleColumns != null && !visibleColumns.isEmpty();
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED:
				return COLLAPSED_EDEFAULT == null ? collapsed != null : !COLLAPSED_EDEFAULT.equals(collapsed);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED:
				return EXPANDED_EDEFAULT == null ? expanded != null : !EXPANDED_EDEFAULT.equals(expanded);
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
		result.append(" (node: ");
		result.append(node);
		result.append(", value: ");
		result.append(value);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", rank: ");
		result.append(rank);
		result.append(", collapsed: ");
		result.append(collapsed);
		result.append(", expanded: ");
		result.append(expanded);
		result.append(')');
		return result.toString();
	}

} //SourceTypeImpl
