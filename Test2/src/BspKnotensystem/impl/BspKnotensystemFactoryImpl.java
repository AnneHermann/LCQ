/**
 */
package BspKnotensystem.impl;

import BspKnotensystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BspKnotensystemFactoryImpl extends EFactoryImpl implements BspKnotensystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BspKnotensystemFactory init() {
		try {
			BspKnotensystemFactory theBspKnotensystemFactory = (BspKnotensystemFactory)EPackage.Registry.INSTANCE.getEFactory(BspKnotensystemPackage.eNS_URI);
			if (theBspKnotensystemFactory != null) {
				return theBspKnotensystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BspKnotensystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BspKnotensystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BspKnotensystemPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BspKnotensystemPackage.INPUTS_TYPE: return createInputsType();
			case BspKnotensystemPackage.INPUT_TYPE: return createInputType();
			case BspKnotensystemPackage.NEW_DATA_SET_TYPE: return createNewDataSetType();
			case BspKnotensystemPackage.NODES_TYPE: return createNodesType();
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE: return createNodeSystemType();
			case BspKnotensystemPackage.NODE_TYPE: return createNodeType();
			case BspKnotensystemPackage.RESULTS_TYPE: return createResultsType();
			case BspKnotensystemPackage.RESULT_TYPE: return createResultType();
			case BspKnotensystemPackage.SOURCES_TYPE: return createSourcesType();
			case BspKnotensystemPackage.SOURCE_TYPE: return createSourceType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType createInputsType() {
		InputsTypeImpl inputsType = new InputsTypeImpl();
		return inputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewDataSetType createNewDataSetType() {
		NewDataSetTypeImpl newDataSetType = new NewDataSetTypeImpl();
		return newDataSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesType createNodesType() {
		NodesTypeImpl nodesType = new NodesTypeImpl();
		return nodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSystemType createNodeSystemType() {
		NodeSystemTypeImpl nodeSystemType = new NodeSystemTypeImpl();
		return nodeSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsType createResultsType() {
		ResultsTypeImpl resultsType = new ResultsTypeImpl();
		return resultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcesType createSourcesType() {
		SourcesTypeImpl sourcesType = new SourcesTypeImpl();
		return sourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BspKnotensystemPackage getBspKnotensystemPackage() {
		return (BspKnotensystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BspKnotensystemPackage getPackage() {
		return BspKnotensystemPackage.eINSTANCE;
	}

} //BspKnotensystemFactoryImpl
