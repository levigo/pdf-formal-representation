/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Inclusive Range Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerInclusiveRangeValidationRuleImpl extends IntegerValidationRuleImpl implements IntegerInclusiveRangeValidationRule
{
  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected IntLiteral lowerBound;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected IntLiteral upperBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerInclusiveRangeValidationRuleImpl()
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
    return PdfmodelPackage.Literals.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(IntLiteral newLowerBound, NotificationChain msgs)
  {
    IntLiteral oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(IntLiteral newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBound(IntLiteral newUpperBound, NotificationChain msgs)
  {
    IntLiteral oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND, oldUpperBound, newUpperBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(IntLiteral newUpperBound)
  {
    if (newUpperBound != upperBound)
    {
      NotificationChain msgs = null;
      if (upperBound != null)
        msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND, null, msgs);
      if (newUpperBound != null)
        msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND, null, msgs);
      msgs = basicSetUpperBound(newUpperBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND, newUpperBound, newUpperBound));
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
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND:
        return basicSetUpperBound(null, msgs);
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
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND:
        return getLowerBound();
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND:
        return getUpperBound();
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
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND:
        setLowerBound((IntLiteral)newValue);
        return;
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND:
        setUpperBound((IntLiteral)newValue);
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
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND:
        setLowerBound((IntLiteral)null);
        return;
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND:
        setUpperBound((IntLiteral)null);
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
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND:
        return lowerBound != null;
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND:
        return upperBound != null;
    }
    return super.eIsSet(featureID);
  }

} //IntegerInclusiveRangeValidationRuleImpl
