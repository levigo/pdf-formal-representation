/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AlternativeEntryValueImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeEntryValueImpl extends AbstractEntryValueImpl implements AlternativeEntryValue
{
  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<AbstractEntryValue> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeEntryValueImpl()
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
    return PdfmodelPackage.Literals.ALTERNATIVE_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractEntryValue> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<AbstractEntryValue>(AbstractEntryValue.class, this, PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS);
    }
    return options;
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
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS:
        return getOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends AbstractEntryValue>)newValue);
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
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS:
        getOptions().clear();
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
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AlternativeEntryValueImpl
