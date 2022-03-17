/**
 */
package BspKnotensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BspKnotensystem.NodeSystemType#getViewOptions <em>View Options</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getFunctionResults <em>Function Results</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getSources <em>Sources</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getNodes <em>Nodes</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getResults <em>Results</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getId <em>Id</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link BspKnotensystem.NodeSystemType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType()
 * @model extendedMetaData="name='NodeSystem_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeSystemType extends EObject {
	/**
	 * Returns the value of the '<em><b>View Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Options</em>' attribute.
	 * @see #setViewOptions(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_ViewOptions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='0'"
	 *        extendedMetaData="kind='element' name='ViewOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getViewOptions();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getViewOptions <em>View Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Options</em>' attribute.
	 * @see #getViewOptions()
	 * @generated
	 */
	void setViewOptions(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Definitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definitions</em>' attribute.
	 * @see #setParameterDefinitions(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_ParameterDefinitions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='1'"
	 *        extendedMetaData="kind='element' name='ParameterDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParameterDefinitions();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getParameterDefinitions <em>Parameter Definitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Definitions</em>' attribute.
	 * @see #getParameterDefinitions()
	 * @generated
	 */
	void setParameterDefinitions(String value);

	/**
	 * Returns the value of the '<em><b>Function Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Results</em>' attribute.
	 * @see #setFunctionResults(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_FunctionResults()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='3'"
	 *        extendedMetaData="kind='element' name='FunctionResults' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFunctionResults();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getFunctionResults <em>Function Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Results</em>' attribute.
	 * @see #getFunctionResults()
	 * @generated
	 */
	void setFunctionResults(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.SourcesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_Sources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sources' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourcesType> getSources();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.NodesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Nodes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodesType> getNodes();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link BspKnotensystem.ResultsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_Results()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Results' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResultsType> getResults();

	/**
	 * Returns the value of the '<em><b>Expression Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language Name</em>' attribute.
	 * @see #setExpressionLanguageName(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_ExpressionLanguageName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExpressionLanguageName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpressionLanguageName();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language Name</em>' attribute.
	 * @see #getExpressionLanguageName()
	 * @generated
	 */
	void setExpressionLanguageName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Version</em>' attribute.
	 * @see #setRuntimeVersion(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_RuntimeVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RuntimeVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRuntimeVersion();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Version</em>' attribute.
	 * @see #getRuntimeVersion()
	 * @generated
	 */
	void setRuntimeVersion(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see BspKnotensystem.BspKnotensystemPackage#getNodeSystemType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link BspKnotensystem.NodeSystemType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // NodeSystemType
