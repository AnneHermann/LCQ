/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.FunctionResultType;
import AlleKnotenFormartiert.InputsType;
import AlleKnotenFormartiert.NewDataSetType;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.SourceType;

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
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getNewDataSet <em>New Data Set</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getNodeSystem <em>Node System</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
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
		return AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResultType getFunctionResult() {
		return (FunctionResultType)getMixed().get(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__FUNCTION_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionResult(FunctionResultType newFunctionResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__FUNCTION_RESULT, newFunctionResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionResult(FunctionResultType newFunctionResult) {
		((FeatureMap.Internal)getMixed()).set(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__FUNCTION_RESULT, newFunctionResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType getInputs() {
		return (InputsType)getMixed().get(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType newInputs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__INPUTS, newInputs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(InputsType newInputs) {
		((FeatureMap.Internal)getMixed()).set(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__INPUTS, newInputs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewDataSetType getNewDataSet() {
		return (NewDataSetType)getMixed().get(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewDataSet(NewDataSetType newNewDataSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, newNewDataSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDataSet(NewDataSetType newNewDataSet) {
		((FeatureMap.Internal)getMixed()).set(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET, newNewDataSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSystemType getNodeSystem() {
		return (NodeSystemType)getMixed().get(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeSystem(NodeSystemType newNodeSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, newNodeSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSystem(NodeSystemType newNodeSystem) {
		((FeatureMap.Internal)getMixed()).set(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM, newNodeSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return (SourceType)getMixed().get(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		((FeatureMap.Internal)getMixed()).set(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
				return basicSetFunctionResult(null, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
				return basicSetInputs(null, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return basicSetNewDataSet(null, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return basicSetNodeSystem(null, msgs);
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
				return getFunctionResult();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
				return getInputs();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return getNewDataSet();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return getNodeSystem();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
				setFunctionResult((FunctionResultType)newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
				setInputs((InputsType)newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				setNewDataSet((NewDataSetType)newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				setNodeSystem((NodeSystemType)newValue);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
				setFunctionResult((FunctionResultType)null);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
				setInputs((InputsType)null);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				setNewDataSet((NewDataSetType)null);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				setNodeSystem((NodeSystemType)null);
				return;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
				return getFunctionResult() != null;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
				return getInputs() != null;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
				return getNewDataSet() != null;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
				return getNodeSystem() != null;
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
