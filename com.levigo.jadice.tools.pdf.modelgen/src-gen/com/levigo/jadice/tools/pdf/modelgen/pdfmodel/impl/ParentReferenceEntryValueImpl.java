/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Reference Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ParentReferenceEntryValueImpl#getParentType <em>Parent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentReferenceEntryValueImpl extends AbstractEntryValueImpl implements ParentReferenceEntryValue
{
  /**
   * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentType()
   * @generated
   * @ordered
   */
  protected DictionaryDeclaration parentType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParentReferenceEntryValueImpl()
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
    return PdfmodelPackage.Literals.PARENT_REFERENCE_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryDeclaration getParentType()
  {
    if (parentType != null && parentType.eIsProxy())
    {
      InternalEObject oldParentType = (InternalEObject)parentType;
      parentType = (DictionaryDeclaration)eResolveProxy(oldParentType);
      if (parentType != oldParentType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE, oldParentType, parentType));
      }
    }
    return parentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryDeclaration basicGetParentType()
  {
    return parentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentType(DictionaryDeclaration newParentType)
  {
    DictionaryDeclaration oldParentType = parentType;
    parentType = newParentType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE, oldParentType, parentType));
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
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE:
        if (resolve) return getParentType();
        return basicGetParentType();
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
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE:
        setParentType((DictionaryDeclaration)newValue);
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
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE:
        setParentType((DictionaryDeclaration)null);
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
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE:
        return parentType != null;
    }
    return super.eIsSet(featureID);
  }

} //ParentReferenceEntryValueImpl
