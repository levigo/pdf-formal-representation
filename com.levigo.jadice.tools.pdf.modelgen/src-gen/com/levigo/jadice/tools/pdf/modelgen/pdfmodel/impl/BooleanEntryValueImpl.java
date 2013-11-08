/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl#isHasMustBe <em>Has Must Be</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanEntryValueImpl extends AbstractEntryValueImpl implements BooleanEntryValue
{
  /**
   * The default value of the '{@link #isHasMustBe() <em>Has Must Be</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasMustBe()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_MUST_BE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasMustBe() <em>Has Must Be</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasMustBe()
   * @generated
   * @ordered
   */
  protected boolean hasMustBe = HAS_MUST_BE_EDEFAULT;

  /**
   * The default value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredValue()
   * @generated
   * @ordered
   */
  protected static final Bool REQUIRED_VALUE_EDEFAULT = Bool.TRUE;

  /**
   * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredValue()
   * @generated
   * @ordered
   */
  protected Bool requiredValue = REQUIRED_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDefault()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDefault()
   * @generated
   * @ordered
   */
  protected boolean hasDefault = HAS_DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final Bool DEFAULT_VALUE_EDEFAULT = Bool.TRUE;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected Bool defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanEntryValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PdfmodelPackage.Literals.BOOLEAN_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasMustBe()
  {
    return hasMustBe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasMustBe(boolean newHasMustBe)
  {
    boolean oldHasMustBe = hasMustBe;
    hasMustBe = newHasMustBe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_MUST_BE, oldHasMustBe, hasMustBe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool getRequiredValue()
  {
    return requiredValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredValue(Bool newRequiredValue)
  {
    Bool oldRequiredValue = requiredValue;
    requiredValue = newRequiredValue == null ? REQUIRED_VALUE_EDEFAULT : newRequiredValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE, oldRequiredValue, requiredValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasDefault()
  {
    return hasDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasDefault(boolean newHasDefault)
  {
    boolean oldHasDefault = hasDefault;
    hasDefault = newHasDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_DEFAULT, oldHasDefault, hasDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(Bool newDefaultValue)
  {
    Bool oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue == null ? DEFAULT_VALUE_EDEFAULT : newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_MUST_BE:
        return isHasMustBe();
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE:
        return getRequiredValue();
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_DEFAULT:
        return isHasDefault();
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE:
        return getDefaultValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe((Boolean)newValue);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue((Bool)newValue);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue((Bool)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe(HAS_MUST_BE_EDEFAULT);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue(REQUIRED_VALUE_EDEFAULT);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_MUST_BE:
        return hasMustBe != HAS_MUST_BE_EDEFAULT;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE:
        return requiredValue != REQUIRED_VALUE_EDEFAULT;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE:
        return defaultValue != DEFAULT_VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hasMustBe: ");
    result.append(hasMustBe);
    result.append(", requiredValue: ");
    result.append(requiredValue);
    result.append(", hasDefault: ");
    result.append(hasDefault);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(')');
    return result.toString();
  }

} //BooleanEntryValueImpl
