/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Object Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl#isHasMustBe <em>Has Must Be</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberObjectEntryValueImpl extends AbstractEntryValueImpl implements NumberObjectEntryValue
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected NumberValidationRule rule;

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
   * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredValue()
   * @generated
   * @ordered
   */
  protected NumberLiteral requiredValue;

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
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected NumberLiteral defaultValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberObjectEntryValueImpl()
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
    return PdfmodelPackage.Literals.NUMBER_OBJECT_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValidationRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(NumberValidationRule newRule, NotificationChain msgs)
  {
    NumberValidationRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(NumberValidationRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE, newRule, newRule));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE, oldHasMustBe, hasMustBe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral getRequiredValue()
  {
    return requiredValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequiredValue(NumberLiteral newRequiredValue, NotificationChain msgs)
  {
    NumberLiteral oldRequiredValue = requiredValue;
    requiredValue = newRequiredValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, oldRequiredValue, newRequiredValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredValue(NumberLiteral newRequiredValue)
  {
    if (newRequiredValue != requiredValue)
    {
      NotificationChain msgs = null;
      if (requiredValue != null)
        msgs = ((InternalEObject)requiredValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, null, msgs);
      if (newRequiredValue != null)
        msgs = ((InternalEObject)newRequiredValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, null, msgs);
      msgs = basicSetRequiredValue(newRequiredValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, newRequiredValue, newRequiredValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT, oldHasDefault, hasDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(NumberLiteral newDefaultValue, NotificationChain msgs)
  {
    NumberLiteral oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(NumberLiteral newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE:
        return basicSetRule(null, msgs);
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return basicSetRequiredValue(null, msgs);
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE:
        return getRule();
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        return isHasMustBe();
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return getRequiredValue();
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        return isHasDefault();
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
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
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE:
        setRule((NumberValidationRule)newValue);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe((Boolean)newValue);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue((NumberLiteral)newValue);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue((NumberLiteral)newValue);
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
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE:
        setRule((NumberValidationRule)null);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe(HAS_MUST_BE_EDEFAULT);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue((NumberLiteral)null);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue((NumberLiteral)null);
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
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__RULE:
        return rule != null;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        return hasMustBe != HAS_MUST_BE_EDEFAULT;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return requiredValue != null;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        return defaultValue != null;
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
    result.append(", hasDefault: ");
    result.append(hasDefault);
    result.append(')');
    return result.toString();
  }

} //NumberObjectEntryValueImpl
