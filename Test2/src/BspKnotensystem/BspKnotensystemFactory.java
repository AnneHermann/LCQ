/**
 */
package BspKnotensystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BspKnotensystem.BspKnotensystemPackage
 * @generated
 */
public interface BspKnotensystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BspKnotensystemFactory eINSTANCE = BspKnotensystem.impl.BspKnotensystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs Type</em>'.
	 * @generated
	 */
	InputsType createInputsType();

	/**
	 * Returns a new object of class '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Type</em>'.
	 * @generated
	 */
	InputType createInputType();

	/**
	 * Returns a new object of class '<em>New Data Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Data Set Type</em>'.
	 * @generated
	 */
	NewDataSetType createNewDataSetType();

	/**
	 * Returns a new object of class '<em>Nodes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodes Type</em>'.
	 * @generated
	 */
	NodesType createNodesType();

	/**
	 * Returns a new object of class '<em>Node System Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node System Type</em>'.
	 * @generated
	 */
	NodeSystemType createNodeSystemType();

	/**
	 * Returns a new object of class '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Type</em>'.
	 * @generated
	 */
	NodeType createNodeType();

	/**
	 * Returns a new object of class '<em>Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Type</em>'.
	 * @generated
	 */
	ResultsType createResultsType();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Sources Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sources Type</em>'.
	 * @generated
	 */
	SourcesType createSourcesType();

	/**
	 * Returns a new object of class '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Type</em>'.
	 * @generated
	 */
	SourceType createSourceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BspKnotensystemPackage getBspKnotensystemPackage();

} //BspKnotensystemFactory
