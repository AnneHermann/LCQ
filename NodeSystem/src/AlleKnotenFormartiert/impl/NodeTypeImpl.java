/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.InputsType;
import AlleKnotenFormartiert.NodeType;

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
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeTypeImpl#getNodeClassId <em>Node Class Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeTypeImpl#getCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeTypeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends ANodeTypeImpl implements NodeType {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputsType> inputs;

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
		return AlleKnotenFormartiertPackage.Literals.NODE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_TYPE__NODE_CLASS_ID, oldNodeClassId, nodeClassId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_TYPE__COLLAPSED, oldCollapsed, collapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputsType> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputsType>(InputsType.class, this, AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputType> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputType>(OutputType.class, this, AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS);
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
			case AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_CLASS_ID:
				return getNodeClassId();
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_NAME:
				return getNodeName();
			case AlleKnotenFormartiertPackage.NODE_TYPE__COLLAPSED:
				return getCollapsed();
			case AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS:
				return getInputs();
			case AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__COLLAPSED:
				setCollapsed((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_CLASS_ID:
				setNodeClassId(NODE_CLASS_ID_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS:
				getInputs().clear();
				return;
			case AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS:
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
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_CLASS_ID:
				return NODE_CLASS_ID_EDEFAULT == null ? nodeClassId != null : !NODE_CLASS_ID_EDEFAULT.equals(nodeClassId);
			case AlleKnotenFormartiertPackage.NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case AlleKnotenFormartiertPackage.NODE_TYPE__COLLAPSED:
				return COLLAPSED_EDEFAULT == null ? collapsed != null : !COLLAPSED_EDEFAULT.equals(collapsed);
			case AlleKnotenFormartiertPackage.NODE_TYPE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case AlleKnotenFormartiertPackage.NODE_TYPE__OUTPUTS:
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
		result.append(" (nodeClassId: ");
		result.append(nodeClassId);
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", collapsed: ");
		result.append(collapsed);
		result.append(')');
		return result.toString();
	}

} //NodeTypeImpl
