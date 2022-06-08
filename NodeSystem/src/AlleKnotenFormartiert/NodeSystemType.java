/**
 */
package AlleKnotenFormartiert;

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
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getSources <em>Sources</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getNodes <em>Nodes</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getFunctionResults <em>Function Results</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getResults <em>Results</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getId <em>Id</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getVersion <em>Version</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.NodeSystemType#getViewOptions <em>View Options</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType()
 * @model extendedMetaData="name='nodeSystem_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeSystemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.SourcesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_Sources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sources' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourcesType> getSources();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.NodesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodesType> getNodes();

	/**
	 * Returns the value of the '<em><b>Function Results</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.FunctionResultsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Results</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_FunctionResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionResults' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionResultsType> getFunctionResults();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.ResultsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_Results()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='results' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResultsType> getResults();

	/**
	 * Returns the value of the '<em><b>Expression Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language Name</em>' attribute.
	 * @see #setExpressionLanguageName(String)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_ExpressionLanguageName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='expressionLanguageName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpressionLanguageName();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeSystemType#getExpressionLanguageName <em>Expression Language Name</em>}' attribute.
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeSystemType#getId <em>Id</em>}' attribute.
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_RuntimeVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='runtimeVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRuntimeVersion();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeSystemType#getRuntimeVersion <em>Runtime Version</em>}' attribute.
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
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.NodeSystemType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>View Options</b></em>' containment reference list.
	 * The list contents are of type {@link AlleKnotenFormartiert.ViewOptionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Options</em>' containment reference list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getNodeSystemType_ViewOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewOptionsType> getViewOptions();

} // NodeSystemType
