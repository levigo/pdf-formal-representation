/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDF Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PDFModelImpl extends MinimalEObjectImpl.Container implements PDFModel
{
  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected ModelConfig config;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<PackageDeclaration> packages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDFModelImpl()
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
    return PdfmodelPackage.Literals.PDF_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelConfig getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(ModelConfig newConfig, NotificationChain msgs)
  {
    ModelConfig oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.PDF_MODEL__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(ModelConfig newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.PDF_MODEL__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.PDF_MODEL__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.PDF_MODEL__CONFIG, newConfig, newConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageDeclaration> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<PackageDeclaration>(PackageDeclaration.class, this, PdfmodelPackage.PDF_MODEL__PACKAGES);
    }
    return packages;
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
      case PdfmodelPackage.PDF_MODEL__CONFIG:
        return basicSetConfig(null, msgs);
      case PdfmodelPackage.PDF_MODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
      case PdfmodelPackage.PDF_MODEL__CONFIG:
        return getConfig();
      case PdfmodelPackage.PDF_MODEL__PACKAGES:
        return getPackages();
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
      case PdfmodelPackage.PDF_MODEL__CONFIG:
        setConfig((ModelConfig)newValue);
        return;
      case PdfmodelPackage.PDF_MODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends PackageDeclaration>)newValue);
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
      case PdfmodelPackage.PDF_MODEL__CONFIG:
        setConfig((ModelConfig)null);
        return;
      case PdfmodelPackage.PDF_MODEL__PACKAGES:
        getPackages().clear();
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
      case PdfmodelPackage.PDF_MODEL__CONFIG:
        return config != null;
      case PdfmodelPackage.PDF_MODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PDFModelImpl
