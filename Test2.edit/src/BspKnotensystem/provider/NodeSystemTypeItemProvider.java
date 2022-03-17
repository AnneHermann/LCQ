/**
 */
package BspKnotensystem.provider;


import BspKnotensystem.BspKnotensystemFactory;
import BspKnotensystem.BspKnotensystemPackage;
import BspKnotensystem.NodeSystemType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BspKnotensystem.NodeSystemType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeSystemTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSystemTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addViewOptionsPropertyDescriptor(object);
			addParameterDefinitionsPropertyDescriptor(object);
			addFunctionResultsPropertyDescriptor(object);
			addExpressionLanguageNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addRuntimeVersionPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the View Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_viewOptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_viewOptions_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__VIEW_OPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_parameterDefinitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_parameterDefinitions_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_functionResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_functionResults_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__FUNCTION_RESULTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression Language Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionLanguageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_expressionLanguageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_expressionLanguageName_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_id_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Runtime Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntimeVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_runtimeVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_runtimeVersion_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__RUNTIME_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeSystemType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeSystemType_version_feature", "_UI_NodeSystemType_type"),
				 BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__SOURCES);
			childrenFeatures.add(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__NODES);
			childrenFeatures.add(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__RESULTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NodeSystemType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeSystemType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NodeSystemType)object).getExpressionLanguageName();
		return label == null || label.length() == 0 ?
			getString("_UI_NodeSystemType_type") :
			getString("_UI_NodeSystemType_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeSystemType.class)) {
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VIEW_OPTIONS:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__PARAMETER_DEFINITIONS:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__FUNCTION_RESULTS:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__EXPRESSION_LANGUAGE_NAME:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__ID:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RUNTIME_VERSION:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__SOURCES:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__NODES:
			case BspKnotensystemPackage.NODE_SYSTEM_TYPE__RESULTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__SOURCES,
				 BspKnotensystemFactory.eINSTANCE.createSourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__NODES,
				 BspKnotensystemFactory.eINSTANCE.createNodesType()));

		newChildDescriptors.add
			(createChildParameter
				(BspKnotensystemPackage.Literals.NODE_SYSTEM_TYPE__RESULTS,
				 BspKnotensystemFactory.eINSTANCE.createResultsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BspKnotensystemEditPlugin.INSTANCE;
	}

}
