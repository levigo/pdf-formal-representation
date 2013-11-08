/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Values Validation Rule Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerValuesValidationRuleEntryImpl extends MinimalEObjectImpl.Container implements IntegerValuesValidationRuleEntry
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected IntLiteral value;

  /**
   * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected static final SinceVersion SINCE_EDEFAULT = SinceVersion.UNDEFINED;

  /**
   * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected SinceVersion since = SINCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerValuesValidationRuleEntryImpl()
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
    return PdfmodelPackage.Literals.INTEGER_VALUES_VALIDATION_RULE_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(IntLiteral newValue, NotificationChain msgs)
  {
    IntLiteral oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(IntLiteral newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SinceVersion getSince()
  {
    return since;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSince(SinceVersion newSince)
  {
    SinceVersion oldSince = since;
    since = newSince == null ? SINCE_EDEFAULT : newSince;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE, oldSince, since));
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
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE:
        return basicSetValue(null, msgs);
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
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE:
        return getValue();
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE:
        return getSince();
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
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE:
        setValue((IntLiteral)newValue);
        return;
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE:
        setSince((SinceVersion)newValue);
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
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE:
        setValue((IntLiteral)null);
        return;
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE:
        setSince(SINCE_EDEFAULT);
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
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE:
        return value != null;
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE:
        return since != SINCE_EDEFAULT;
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
    result.append(" (since: ");
    result.append(since);
    result.append(')');
    return result.toString();
  }

} //IntegerValuesValidationRuleEntryImpl
