/**
 */
package AlleKnotenFormartiert.provider;


import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.FunctionResultType;

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
 * This is the item provider adapter for a {@link AlleKnotenFormartiert.FunctionResultType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionResultTypeItemProvider 
	extends NotFunctionalNodeTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResultTypeItemProvider(AdapterFactory adapterFactory) {
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

			addShowUsedColumnsOnlyPropertyDescriptor(object);
			addCollapsedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Show Used Columns Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowUsedColumnsOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionResultType_showUsedColumnsOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultType_showUsedColumnsOnly_feature", "_UI_FunctionResultType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY,
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
				 getString("_UI_FunctionResultType_collapsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionResultType_collapsed_feature", "_UI_FunctionResultType_type"),
				 AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__COLLAPSED,
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
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__FUNCTION_RESULT);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__OUTPUTS);
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
	 * This returns FunctionResultType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionResultType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionResultType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionResultType_type") :
			getString("_UI_FunctionResultType_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionResultType.class)) {
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__SHOW_USED_COLUMNS_ONLY:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__COLLAPSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__FUNCTION_RESULT:
			case AlleKnotenFormartiertPackage.FUNCTION_RESULT_TYPE__OUTPUTS:
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
				(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__FUNCTION_RESULT_COLUMN,
				 AlleKnotenFormartiertFactory.eINSTANCE.createFunctionResultColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__FUNCTION_RESULT,
				 AlleKnotenFormartiertFactory.eINSTANCE.createFunctionResultType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.FUNCTION_RESULT_TYPE__OUTPUTS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createOutputType()));
	}

}
