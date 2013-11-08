/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Length Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringLengthValidationRuleImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringLengthValidationRuleImpl extends StringValidationRuleImpl implements StringLengthValidationRule
{
  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected IntLiteral length;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringLengthValidationRuleImpl()
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
    return PdfmodelPackage.Literals.STRING_LENGTH_VALIDATION_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLength(IntLiteral newLength, NotificationChain msgs)
  {
    IntLiteral oldLength = length;
    length = newLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH, oldLength, newLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(IntLiteral newLength)
  {
    if (newLength != length)
    {
      NotificationChain msgs = null;
      if (length != null)
        msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH, null, msgs);
      if (newLength != null)
        msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH, null, msgs);
      msgs = basicSetLength(newLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH, newLength, newLength));
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
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH:
        return basicSetLength(null, msgs);
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
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH:
        return getLength();
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
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH:
        setLength((IntLiteral)newValue);
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
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH:
        setLength((IntLiteral)null);
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
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE__LENGTH:
        return length != null;
    }
    return super.eIsSet(featureID);
  }

} //StringLengthValidationRuleImpl
