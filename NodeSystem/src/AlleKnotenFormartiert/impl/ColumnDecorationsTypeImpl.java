/**
 */
package AlleKnotenFormartiert.impl;

import AlleKnotenFormartiert.AlleKnotenFormartiertPackage;
import AlleKnotenFormartiert.ColumnDecorationsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Decorations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getForeColor <em>Fore Color</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getBackColor <em>Back Color</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getDisplayFormat <em>Display Format</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link AlleKnotenFormartiert.impl.ColumnDecorationsTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnDecorationsTypeImpl extends MinimalEObjectImpl.Container implements ColumnDecorationsType {
	/**
	 * The default value of the '{@link #getForeColor() <em>Fore Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FORE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeColor() <em>Fore Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeColor()
	 * @generated
	 * @ordered
	 */
	protected String foreColor = FORE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackColor() <em>Back Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackColor() <em>Back Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected String backColor = BACK_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected String alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected String displayFormat = DISPLAY_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnDecorationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlleKnotenFormartiertPackage.Literals.COLUMN_DECORATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeColor() {
		return foreColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeColor(String newForeColor) {
		String oldForeColor = foreColor;
		foreColor = newForeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__FORE_COLOR, oldForeColor, foreColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackColor() {
		return backColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackColor(String newBackColor) {
		String oldBackColor = backColor;
		backColor = newBackColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__BACK_COLOR, oldBackColor, backColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(String newAlignment) {
		String oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayFormat() {
		return displayFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFormat(String newDisplayFormat) {
		String oldDisplayFormat = displayFormat;
		displayFormat = newDisplayFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT, oldDisplayFormat, displayFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__FORE_COLOR:
				return getForeColor();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__BACK_COLOR:
				return getBackColor();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__ALIGNMENT:
				return getAlignment();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT:
				return getDisplayFormat();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__CATEGORY:
				return getCategory();
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__FORE_COLOR:
				setForeColor((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__BACK_COLOR:
				setBackColor((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__ALIGNMENT:
				setAlignment((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT:
				setDisplayFormat((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__CATEGORY:
				setCategory((String)newValue);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__FORE_COLOR:
				setForeColor(FORE_COLOR_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__BACK_COLOR:
				setBackColor(BACK_COLOR_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT:
				setDisplayFormat(DISPLAY_FORMAT_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__FORE_COLOR:
				return FORE_COLOR_EDEFAULT == null ? foreColor != null : !FORE_COLOR_EDEFAULT.equals(foreColor);
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__BACK_COLOR:
				return BACK_COLOR_EDEFAULT == null ? backColor != null : !BACK_COLOR_EDEFAULT.equals(backColor);
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DISPLAY_FORMAT:
				return DISPLAY_FORMAT_EDEFAULT == null ? displayFormat != null : !DISPLAY_FORMAT_EDEFAULT.equals(displayFormat);
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case AlleKnotenFormartiertPackage.COLUMN_DECORATIONS_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (foreColor: ");
		result.append(foreColor);
		result.append(", backColor: ");
		result.append(backColor);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", displayFormat: ");
		result.append(displayFormat);
		result.append(", category: ");
		result.append(category);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ColumnDecorationsTypeImpl
