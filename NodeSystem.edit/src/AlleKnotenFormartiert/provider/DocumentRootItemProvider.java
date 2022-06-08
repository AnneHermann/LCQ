/**
 */
package AlleKnotenFormartiert.provider;


import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.DocumentRoot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link AlleKnotenFormartiert.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__FUNCTION_RESULT);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__INPUTS);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM);
			childrenFeatures.add(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__SOURCE);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__FUNCTION_RESULT:
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__INPUTS:
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NEW_DATA_SET:
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__NODE_SYSTEM:
			case AlleKnotenFormartiertPackage.DOCUMENT_ROOT__SOURCE:
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
				(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__FUNCTION_RESULT,
				 AlleKnotenFormartiertFactory.eINSTANCE.createFunctionResultType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__INPUTS,
				 AlleKnotenFormartiertFactory.eINSTANCE.createInputsType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NEW_DATA_SET,
				 AlleKnotenFormartiertFactory.eINSTANCE.createNewDataSetType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__NODE_SYSTEM,
				 AlleKnotenFormartiertFactory.eINSTANCE.createNodeSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AlleKnotenFormartiertPackage.Literals.DOCUMENT_ROOT__SOURCE,
				 AlleKnotenFormartiertFactory.eINSTANCE.createSourceType()));
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
