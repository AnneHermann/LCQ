/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultsType;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.NodesType;
import AlleKnotenFormartiert.ResultsType;
import AlleKnotenFormartiert.SourcesType;
import AlleKnotenFormartiert.ViewOptionsType;

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
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getFunctionResults <em>Function Results</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getResults <em>Results</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getExpressionLanguageName <em>Expression Language Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.NodeSystemTypeImpl#getViewOptions <em>View Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSystemTypeImpl extends MinimalEObjectImpl.Container implements NodeSystemType {
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
	 * The cached value of the '{@link #getFunctionResults() <em>Function Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionResults()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionResultsType> functionResults;

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
	 * The cached value of the '{@link #getViewOptions() <em>View Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewOptionsType> viewOptions;

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
		return AlleKnotenFormartiertPackage.Literals.NODE_SYSTEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourcesType> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<SourcesType>(SourcesType.class, this, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES);
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
			nodes = new EObjectContainmentEList<NodesType>(NodesType.class, this, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionResultsType> getFunctionResults() {
		if (functionResults == null) {
			functionResults = new EObjectContainmentEList<FunctionResultsType>(FunctionResultsType.class, this, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS);
		}
		return functionResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultsType> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<ResultsType>(ResultsType.class, this, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME, oldExpressionLanguageName, expressionLanguageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION, oldRuntimeVersion, runtimeVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewOptionsType> getViewOptions() {
		if (viewOptions == null) {
			viewOptions = new EObjectContainmentEList<ViewOptionsType>(ViewOptionsType.class, this, AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS);
		}
		return viewOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				return ((InternalEList<?>)getFunctionResults()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				return ((InternalEList<?>)getViewOptions()).basicRemove(otherEnd, msgs);
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
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES:
				return getSources();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES:
				return getNodes();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				return getFunctionResults();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS:
				return getResults();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				return getExpressionLanguageName();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__ID:
				return getId();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				return getRuntimeVersion();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VERSION:
				return getVersion();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				return getViewOptions();
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
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourcesType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodesType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				getFunctionResults().clear();
				getFunctionResults().addAll((Collection<? extends FunctionResultsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends ResultsType>)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				setExpressionLanguageName((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__ID:
				setId((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				setRuntimeVersion((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				getViewOptions().clear();
				getViewOptions().addAll((Collection<? extends ViewOptionsType>)newValue);
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
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES:
				getSources().clear();
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES:
				getNodes().clear();
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				getFunctionResults().clear();
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS:
				getResults().clear();
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				setExpressionLanguageName(EXPRESSION_LANGUAGE_NAME_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				setRuntimeVersion(RUNTIME_VERSION_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				getViewOptions().clear();
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
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__SOURCES:
				return sources != null && !sources.isEmpty();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__NODES:
				return nodes != null && !nodes.isEmpty();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
				return functionResults != null && !functionResults.isEmpty();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RESULTS:
				return results != null && !results.isEmpty();
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
				return EXPRESSION_LANGUAGE_NAME_EDEFAULT == null ? expressionLanguageName != null : !EXPRESSION_LANGUAGE_NAME_EDEFAULT.equals(expressionLanguageName);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
				return RUNTIME_VERSION_EDEFAULT == null ? runtimeVersion != null : !RUNTIME_VERSION_EDEFAULT.equals(runtimeVersion);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case AlleKnotenFormartiertPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
				return viewOptions != null && !viewOptions.isEmpty();
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
		result.append(" (expressionLanguageName: ");
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
