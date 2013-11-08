/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Mapped Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryValueImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayMappedEntryValueImpl extends AbstractEntryValueImpl implements ArrayMappedEntryValue
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ArrayMappedDeclaration target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayMappedEntryValueImpl()
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
    return PdfmodelPackage.Literals.ARRAY_MAPPED_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayMappedDeclaration getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ArrayMappedDeclaration)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayMappedDeclaration basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ArrayMappedDeclaration newTarget)
  {
    ArrayMappedDeclaration oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET, oldTarget, target));
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET:
        setTarget((ArrayMappedDeclaration)newValue);
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET:
        setTarget((ArrayMappedDeclaration)null);
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayMappedEntryValueImpl
