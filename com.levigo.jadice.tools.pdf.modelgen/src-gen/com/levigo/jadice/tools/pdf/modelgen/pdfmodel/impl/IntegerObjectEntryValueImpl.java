/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Object Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl#isHasMustBe <em>Has Must Be</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerObjectEntryValueImpl extends AbstractEntryValueImpl implements IntegerObjectEntryValue
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected IntegerValidationRule rule;

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
  protected IntLiteral requiredValue;

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
  protected IntLiteral defaultValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerObjectEntryValueImpl()
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
    return PdfmodelPackage.Literals.INTEGER_OBJECT_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValidationRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(IntegerValidationRule newRule, NotificationChain msgs)
  {
    IntegerValidationRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(IntegerValidationRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE, newRule, newRule));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE, oldHasMustBe, hasMustBe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getRequiredValue()
  {
    return requiredValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequiredValue(IntLiteral newRequiredValue, NotificationChain msgs)
  {
    IntLiteral oldRequiredValue = requiredValue;
    requiredValue = newRequiredValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, oldRequiredValue, newRequiredValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredValue(IntLiteral newRequiredValue)
  {
    if (newRequiredValue != requiredValue)
    {
      NotificationChain msgs = null;
      if (requiredValue != null)
        msgs = ((InternalEObject)requiredValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, null, msgs);
      if (newRequiredValue != null)
        msgs = ((InternalEObject)newRequiredValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, null, msgs);
      msgs = basicSetRequiredValue(newRequiredValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE, newRequiredValue, newRequiredValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT, oldHasDefault, hasDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(IntLiteral newDefaultValue, NotificationChain msgs)
  {
    IntLiteral oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(IntLiteral newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE:
        return basicSetRule(null, msgs);
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return basicSetRequiredValue(null, msgs);
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
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
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE:
        return getRule();
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        return isHasMustBe();
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return getRequiredValue();
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        return isHasDefault();
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
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
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE:
        setRule((IntegerValidationRule)newValue);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe((Boolean)newValue);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue((IntLiteral)newValue);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue((IntLiteral)newValue);
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
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE:
        setRule((IntegerValidationRule)null);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        setHasMustBe(HAS_MUST_BE_EDEFAULT);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        setRequiredValue((IntLiteral)null);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
        setDefaultValue((IntLiteral)null);
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
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__RULE:
        return rule != null;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE:
        return hasMustBe != HAS_MUST_BE_EDEFAULT;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE:
        return requiredValue != null;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE:
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

} //IntegerObjectEntryValueImpl
