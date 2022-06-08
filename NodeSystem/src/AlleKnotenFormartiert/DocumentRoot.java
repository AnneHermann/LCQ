/**
 */
package AlleKnotenFormartiert;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getFunctionResult <em>Function Result</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getInputs <em>Inputs</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getNewDataSet <em>New Data Set</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getNodeSystem <em>Node System</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.DocumentRoot#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Function Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Result</em>' containment reference.
	 * @see #setFunctionResult(FunctionResultType)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_FunctionResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='functionResult' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionResultType getFunctionResult();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.DocumentRoot#getFunctionResult <em>Function Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Result</em>' containment reference.
	 * @see #getFunctionResult()
	 * @generated
	 */
	void setFunctionResult(FunctionResultType value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_Inputs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType getInputs();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.DocumentRoot#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType value);

	/**
	 * Returns the value of the '<em><b>New Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data Set</em>' containment reference.
	 * @see #setNewDataSet(NewDataSetType)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_NewDataSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata IsDataSet='true' UseCurrentLocale='true'"
	 *        extendedMetaData="kind='element' name='NewDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	NewDataSetType getNewDataSet();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.DocumentRoot#getNewDataSet <em>New Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data Set</em>' containment reference.
	 * @see #getNewDataSet()
	 * @generated
	 */
	void setNewDataSet(NewDataSetType value);

	/**
	 * Returns the value of the '<em><b>Node System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node System</em>' containment reference.
	 * @see #setNodeSystem(NodeSystemType)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_NodeSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeSystemType getNodeSystem();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.DocumentRoot#getNodeSystem <em>Node System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node System</em>' containment reference.
	 * @see #getNodeSystem()
	 * @generated
	 */
	void setNodeSystem(NodeSystemType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see AlleKnotenFormartiert.AlleKnotenFormartiertPackage#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link AlleKnotenFormartiert.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

} // DocumentRoot
