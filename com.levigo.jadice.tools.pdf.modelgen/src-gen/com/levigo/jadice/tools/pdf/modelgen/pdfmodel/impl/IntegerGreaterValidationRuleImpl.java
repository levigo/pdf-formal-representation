/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Greater Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterValidationRuleImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerGreaterValidationRuleImpl extends IntegerValidationRuleImpl implements IntegerGreaterValidationRule
{
  /**
   * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected IntLiteral minValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerGreaterValidationRuleImpl()
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
    return PdfmodelPackage.Literals.INTEGER_GREATER_VALIDATION_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getMinValue()
  {
    return minValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinValue(IntLiteral newMinValue, NotificationChain msgs)
  {
    IntLiteral oldMinValue = minValue;
    minValue = newMinValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE, oldMinValue, newMinValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinValue(IntLiteral newMinValue)
  {
    if (newMinValue != minValue)
    {
      NotificationChain msgs = null;
      if (minValue != null)
        msgs = ((InternalEObject)minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE, null, msgs);
      if (newMinValue != null)
        msgs = ((InternalEObject)newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE, null, msgs);
      msgs = basicSetMinValue(newMinValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE, newMinValue, newMinValue));
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
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE:
        return basicSetMinValue(null, msgs);
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
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE:
        return getMinValue();
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
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE:
        setMinValue((IntLiteral)newValue);
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
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE:
        setMinValue((IntLiteral)null);
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
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE:
        return minValue != null;
    }
    return super.eIsSet(featureID);
  }

} //IntegerGreaterValidationRuleImpl
