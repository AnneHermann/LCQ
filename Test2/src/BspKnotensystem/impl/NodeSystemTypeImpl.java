/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.NodeSystemType;
import BspKnotensystem.NodesType;
import BspKnotensystem.ResultsType;
import BspKnotensystem.SourcesType;

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
 * An implementation of the model object '<em><b>Node System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getViewOptions <em>View Options</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getFunctionResults <em>Function Results</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getResults <em>Results</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getExpressionLanguageName <em>Expression Language Name</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link BspKnotensystem.impl.NodeSystemTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSystemTypeImpl extends MinimalEObjectImpl.Container implements NodeSystemType {
	/**
	 * The default value of the '{@link #getViewOptions() <em>View Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewOptions() <em>View Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOptions()
	 * @generated
	 * @ordered
	 */
	protected String viewOptions = VIEW_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterDefinitions() <em>Parameter Definitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDefinitions()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_DEFINITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterDefinitions() <em>Parameter Definitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDefinitions()
	 * @generated
	 * @ordered
	 */
	protected String parameterDefinitions = PARAMETER_DEFINITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionResults() <em>Function Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionResults()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_RESULTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionResults() <em>Function Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionResults()
	 * @generated
	 * @ordered
	 */
	protected String functionResults = FUNCTION_RESULTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourcesType> sources;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodesType> nodes;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultsType> results;

	/**
	 * The default value of the '{@link #getExpressionLanguageName() <em>Expression Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionLanguageName() <em>Expression Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguageName()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguageName = EXPRESSION_LANGUAGE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected String runtimeVersion = RUNTIME_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewOptions() {
		return viewOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewOptions(String newViewOptions) {
		String oldViewOptions = viewOptions;
		viewOptions = newViewOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS, oldViewOptions, viewOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterDefinitions() {
		return parameterDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterDefinitions(String newParameterDefinitions) {
		String oldParameterDefinitions = parameterDefinitions;
		parameterDefinitions = newParameterDefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS, oldParameterDefinitions, parameterDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionResults() {
		return functionResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionResults(String newFunctionResults) {
		String oldFunctionResults = functionResults;
		functionResults = newFunctionResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS, oldFunctionResults, functionResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourcesType> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<SourcesType>(SourcesType.class, this, BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodesType> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NodesType>(NodesType.class, this, BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultsType> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<ResultsType>(ResultsType.class, this, BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguageName() {
		return expressionLanguageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguageName(String newExpressionLanguageName) {
		String oldExpressionLanguageName = expressionLanguageName;
		expressionLanguageName = newExpressionLanguageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME, oldExpressionLanguageName, expressionLanguageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntimeVersion() {
		return runtimeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeVersion(String newRuntimeVersion) {
		String oldRuntimeVersion = runtimeVersion;
		runtimeVersion = newRuntimeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION, oldRuntimeVersion, runtimeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				return getViewOptions();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS:
				return getParameterDefinitions();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				return getFunctionResults();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
				return getSources();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
				return getNodes();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				return getResults();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				return getExpressionLanguageName();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID:
				return getId();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				return getRuntimeVersion();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION:
				return getVersion();
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
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				setViewOptions((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS:
				setParameterDefinitions((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				setFunctionResults((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourcesType>)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodesType>)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends ResultsType>)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				setExpressionLanguageName((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID:
				setId((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				setRuntimeVersion((String)newValue);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION:
				setVersion((String)newValue);
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
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				setViewOptions(VIEW_OPTIONS_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS:
				setParameterDefinitions(PARAMETER_DEFINITIONS_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				setFunctionResults(FUNCTION_RESULTS_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
				getSources().clear();
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
				getNodes().clear();
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				getResults().clear();
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				setExpressionLanguageName(EXPRESSION_LANGUAGE_NAME_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				setRuntimeVersion(RUNTIME_VERSION_EDEFAULT);
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				return VIEW_OPTIONS_EDEFAULT == null ? viewOptions != null : !VIEW_OPTIONS_EDEFAULT.equals(viewOptions);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS:
				return PARAMETER_DEFINITIONS_EDEFAULT == null ? parameterDefinitions != null : !PARAMETER_DEFINITIONS_EDEFAULT.equals(parameterDefinitions);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				return FUNCTION_RESULTS_EDEFAULT == null ? functionResults != null : !FUNCTION_RESULTS_EDEFAULT.equals(functionResults);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
				return sources != null && !sources.isEmpty();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
				return nodes != null && !nodes.isEmpty();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				return results != null && !results.isEmpty();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				return EXPRESSION_LANGUAGE_NAME_EDEFAULT == null ? expressionLanguageName != null : !EXPRESSION_LANGUAGE_NAME_EDEFAULT.equals(expressionLanguageName);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				return RUNTIME_VERSION_EDEFAULT == null ? runtimeVersion != null : !RUNTIME_VERSION_EDEFAULT.equals(runtimeVersion);
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (viewOptions: ");
		result.append(viewOptions);
		result.append(", parameterDefinitions: ");
		result.append(parameterDefinitions);
		result.append(", functionResults: ");
		result.append(functionResults);
		result.append(", expressionLanguageName: ");
		result.append(expressionLanguageName);
		result.append(", id: ");
		result.append(id);
		result.append(", runtimeVersion: ");
		result.append(runtimeVersion);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //NodeSystemTypeImpl
