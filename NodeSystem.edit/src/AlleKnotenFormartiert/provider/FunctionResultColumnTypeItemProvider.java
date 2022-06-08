/**
 */
package AlleKnotenFormartiert.provider;


import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultColumnType;

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
 * This is the item provider adapter for a {@link AlleKnotenFormartiert.FunctionResultColumnType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionResultColumnTypeItemProvider 
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
	public FunctionResultColumnTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addResultRankPropertyDescriptor(object);
			addColumnPropertyDescriptor(object);
			addValueTypePropertyDescriptor(object);
			addNullablePropertyDescriptor(object);
			addResultDeletedPropertyDescriptor(object);
			addColumnDisplayNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addResultDisplayNamePropertyDescriptor(object);
			addMissingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_FunctionResultColumnType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_id_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result Rank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultRankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_resultRank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_resultRank_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_column_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_column_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__COLUMN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_valueType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_valueType_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nullable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_nullable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_nullable_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result Deleted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultDeletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_resultDeleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_resultDeleted_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Display Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_columnDisplayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_columnDisplayName_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_name_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result Display Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_resultDisplayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_resultDisplayName_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Missing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultColumnType_missing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultColumnType_missing_feature", "_UI_FunctionResultColumnType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__MISSING,
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
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS);
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
	 * This returns FunctionResultColumnType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionResultColumnType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionResultColumnType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionResultColumnType_type") :
			getString("_UI_FunctionResultColumnType_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionResultColumnType.class)) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__ID:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_RANK:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__VALUE_TYPE:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NULLABLE:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DELETED:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DISPLAY_NAME:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__NAME:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__RESULT_DISPLAY_NAME:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__MISSING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS:
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
				(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_COLUMN_TYPE__COLUMN_DECORATIONS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createColumnDecorationsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AlleKnotenFormartiertEditPlugin.INSTANCE;
	}

}
