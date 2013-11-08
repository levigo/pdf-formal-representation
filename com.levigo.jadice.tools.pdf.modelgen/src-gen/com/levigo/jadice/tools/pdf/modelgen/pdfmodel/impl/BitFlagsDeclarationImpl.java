/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Flags Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl#getSpecificationReference <em>Specification Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitFlagsDeclarationImpl extends AbstractDeclarationImpl implements BitFlagsDeclaration
{
  /**
   * The cached value of the '{@link #getSpecificationReference() <em>Specification Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecificationReference()
   * @generated
   * @ordered
   */
  protected SpecificationReference specificationReference;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<BitFlagsDeclarationPart> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BitFlagsDeclarationImpl()
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
    return PdfmodelPackage.Literals.BIT_FLAGS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecificationReference getSpecificationReference()
  {
    return specificationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecificationReference(SpecificationReference newSpecificationReference, NotificationChain msgs)
  {
    SpecificationReference oldSpecificationReference = specificationReference;
    specificationReference = newSpecificationReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE, oldSpecificationReference, newSpecificationReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecificationReference(SpecificationReference newSpecificationReference)
  {
    if (newSpecificationReference != specificationReference)
    {
      NotificationChain msgs = null;
      if (specificationReference != null)
        msgs = ((InternalEObject)specificationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE, null, msgs);
      if (newSpecificationReference != null)
        msgs = ((InternalEObject)newSpecificationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE, null, msgs);
      msgs = basicSetSpecificationReference(newSpecificationReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE, newSpecificationReference, newSpecificationReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BitFlagsDeclarationPart> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<BitFlagsDeclarationPart>(BitFlagsDeclarationPart.class, this, PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS);
    }
    return declarations;
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE:
        return basicSetSpecificationReference(null, msgs);
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE:
        return getSpecificationReference();
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS:
        return getDeclarations();
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE:
        setSpecificationReference((SpecificationReference)newValue);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends BitFlagsDeclarationPart>)newValue);
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE:
        setSpecificationReference((SpecificationReference)null);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS:
        getDeclarations().clear();
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE:
        return specificationReference != null;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BitFlagsDeclarationImpl
