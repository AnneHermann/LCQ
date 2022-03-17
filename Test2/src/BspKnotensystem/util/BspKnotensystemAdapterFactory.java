/**
 */
package BspKnotensystem.util;

import BspKnotensystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BspKnotensystem.BspKnotensystemPackage
 * @generated
 */
public class BspKnotensystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BspKnotensystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BspKnotensystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BspKnotensystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BspKnotensystemSwitch<Adapter> modelSwitch =
		new BspKnotensystemSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseInputsType(InputsType object) {
				return createInputsTypeAdapter();
			}
			@Override
			public Adapter caseInputType(InputType object) {
				return createInputTypeAdapter();
			}
			@Override
			public Adapter caseNewDataSetType(NewDataSetType object) {
				return createNewDataSetTypeAdapter();
			}
			@Override
			public Adapter caseNodesType(NodesType object) {
				return createNodesTypeAdapter();
			}
			@Override
			public Adapter caseNodeSystemType(NodeSystemType object) {
				return createNodeSystemTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseResultsType(ResultsType object) {
				return createResultsTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseSourcesType(SourcesType object) {
				return createSourcesTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.InputsType
	 * @generated
	 */
	public Adapter createInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.NewDataSetType <em>New Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.NewDataSetType
	 * @generated
	 */
	public Adapter createNewDataSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.NodesType
	 * @generated
	 */
	public Adapter createNodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.NodeSystemType <em>Node System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.NodeSystemType
	 * @generated
	 */
	public Adapter createNodeSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.ResultsType <em>Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.ResultsType
	 * @generated
	 */
	public Adapter createResultsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.SourcesType <em>Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.SourcesType
	 * @generated
	 */
	public Adapter createSourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BspKnotensystem.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BspKnotensystem.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BspKnotensystemAdapterFactory
