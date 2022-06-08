/**
 */
package AlleKnotenFormartiert.provider;


import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.SourceType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link AlleKnotenFormartiert.SourceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceTypeItemProvider 
	extends ANodeTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNodePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addRankPropertyDescriptor(object);
			addCollapsedPropertyDescriptor(object);
			addExpandedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_node_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_value_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_tableName_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_rank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_rank_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__RANK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collapsed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollapsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_collapsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_collapsed_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__COLLAPSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expanded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpandedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceType_expanded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceType_expanded_feature", "_UI_SourceType_type"),
				 AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__EXPANDED,
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
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__SOURCE_COLUMNS);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__VISIBLE_COLUMNS);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__OUTPUTS);
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
	 * This returns SourceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SourceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SourceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SourceType_type") :
			getString("_UI_SourceType_type") + " " + label;
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

		switch (notification.getFeatureID(SourceType.class)) {
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__NODE:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VALUE:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__TABLE_NAME:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__RANK:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__COLLAPSED:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__EXPANDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__SOURCE_COLUMNS:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__VISIBLE_COLUMNS:
			case AlleKnotenFormartiertPackage.SOURCE_TYPE__OUTPUTS:
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
				(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__SOURCE_COLUMNS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createSourceColumnsType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__VISIBLE_COLUMNS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createVisibleColumnsType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.SOURCE_TYPE__OUTPUTS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createOutputType()));
	}

}
