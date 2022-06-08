/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.ViewOptionsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Options Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.ViewOptionsTypeImpl#getConnectionStyle <em>Connection Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewOptionsTypeImpl extends MinimalEObjectImpl.Container implements ViewOptionsType {
	/**
	 * The default value of the '{@link #getConnectionStyle() <em>Connection Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionStyle() <em>Connection Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionStyle()
	 * @generated
	 * @ordered
	 */
	protected String connectionStyle = CONNECTION_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewOptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.VIEW_OPTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionStyle() {
		return connectionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionStyle(String newConnectionStyle) {
		String oldConnectionStyle = connectionStyle;
		connectionStyle = newConnectionStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE__CONNECTION_STYLE, oldConnectionStyle, connectionStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE__CONNECTION_STYLE:
				return getConnectionStyle();
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
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE__CONNECTION_STYLE:
				setConnectionStyle((String)newValue);
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
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE__CONNECTION_STYLE:
				setConnectionStyle(CONNECTION_STYLE_EDEFAULT);
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
			case AlleKnotenFormartiertPackage.VIEW_OPTIONS_TYPE__CONNECTION_STYLE:
				return CONNECTION_STYLE_EDEFAULT == null ? connectionStyle != null : !CONNECTION_STYLE_EDEFAULT.equals(connectionStyle);
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
		result.append(" (connectionStyle: ");
		result.append(connectionStyle);
		result.append(')');
		return result.toString();
	}

} //ViewOptionsTypeImpl
