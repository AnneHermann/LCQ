/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.DocumentRoot;
import BspKnotensystem.InputType;
import BspKnotensystem.NewDataSetType;
import BspKnotensystem.NodeSystemType;
import BspKnotensystem.SourceType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getInput <em>Input</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getNewDataSet <em>New Data Set</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getNodeSystem <em>Node System</em>}</li>
 *   <li>{@link BspKnotensystem.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BspKnotensystemPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BspKnotensystemPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getInput() {
		return (InputType)getMixed().get(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(InputType newInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__INPUT, newInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputType newInput) {
		((FeatureMap.Internal)getMixed()).set(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewDataSetType getNewDataSet() {
		return (NewDataSetType)getMixed().get(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewDataSet(NewDataSetType newNewDataSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, newNewDataSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDataSet(NewDataSetType newNewDataSet) {
		((FeatureMap.Internal)getMixed()).set(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, newNewDataSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSystemType getNodeSystem() {
		return (NodeSystemType)getMixed().get(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeSystem(NodeSystemType newNodeSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, newNodeSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSystem(NodeSystemType newNodeSystem) {
		((FeatureMap.Internal)getMixed()).set(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, newNodeSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return (SourceType)getMixed().get(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		((FeatureMap.Internal)getMixed()).set(BspKnotensystemPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BspKnotensystemPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__INPUT:
				return basicSetInput(null, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return basicSetNewDataSet(null, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return basicSetNodeSystem(null, msgs);
			case BspKnotensystemPackage.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
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
			case BspKnotensystemPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BspKnotensystemPackage.DOCUMENT_ROOT__INPUT:
				return getInput();
			case BspKnotensystemPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return getNewDataSet();
			case BspKnotensystemPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return getNodeSystem();
			case BspKnotensystemPackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
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
			case BspKnotensystemPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__INPUT:
				setInput((InputType)newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				setNewDataSet((NewDataSetType)newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				setNodeSystem((NodeSystemType)newValue);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)newValue);
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
			case BspKnotensystemPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__INPUT:
				setInput((InputType)null);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				setNewDataSet((NewDataSetType)null);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				setNodeSystem((NodeSystemType)null);
				return;
			case BspKnotensystemPackage.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)null);
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
			case BspKnotensystemPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BspKnotensystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BspKnotensystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BspKnotensystemPackage.DOCUMENT_ROOT__INPUT:
				return getInput() != null;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return getNewDataSet() != null;
			case BspKnotensystemPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return getNodeSystem() != null;
			case BspKnotensystemPackage.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
