/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.SourceColumnType;
import AlleKnotenFormartiert.SourceColumnsType;

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
 * An implementation of the model object '<em><b>Source Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.SourceColumnsTypeImpl#getSourceColumn <em>Source Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceColumnsTypeImpl extends MinimalEObjectImpl.Container implements SourceColumnsType {
	/**
	 * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumnType> sourceColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.SOURCE_COLUMNS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumnType> getSourceColumn() {
		if (sourceColumn == null) {
			sourceColumn = new EObjectContainmentEList<SourceColumnType>(SourceColumnType.class, this, AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN);
		}
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN:
				return ((InternalEList<?>)getSourceColumn()).basicRemove(otherEnd, msgs);
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
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN:
				return getSourceColumn();
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
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN:
				getSourceColumn().clear();
				getSourceColumn().addAll((Collection<? extends SourceColumnType>)newValue);
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
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN:
				getSourceColumn().clear();
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
			case AlleKnotenFormartiertPackage.SOURCE_COLUMNS_TYPE__SOURCE_COLUMN:
				return sourceColumn != null && !sourceColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceColumnsTypeImpl
