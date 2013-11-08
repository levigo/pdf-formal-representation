/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.CoreTypesConfig;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ModelConfigImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ModelConfigImpl#getCoreTypesConfig <em>Core Types Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelConfigImpl extends MinimalEObjectImpl.Container implements ModelConfig
{
  /**
   * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected static final String BASE_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected String basePackage = BASE_PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCoreTypesConfig() <em>Core Types Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreTypesConfig()
   * @generated
   * @ordered
   */
  protected CoreTypesConfig coreTypesConfig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelConfigImpl()
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
    return PdfmodelPackage.Literals.MODEL_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasePackage()
  {
    return basePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasePackage(String newBasePackage)
  {
    String oldBasePackage = basePackage;
    basePackage = newBasePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MODEL_CONFIG__BASE_PACKAGE, oldBasePackage, basePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreTypesConfig getCoreTypesConfig()
  {
    return coreTypesConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoreTypesConfig(CoreTypesConfig newCoreTypesConfig, NotificationChain msgs)
  {
    CoreTypesConfig oldCoreTypesConfig = coreTypesConfig;
    coreTypesConfig = newCoreTypesConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG, oldCoreTypesConfig, newCoreTypesConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoreTypesConfig(CoreTypesConfig newCoreTypesConfig)
  {
    if (newCoreTypesConfig != coreTypesConfig)
    {
      NotificationChain msgs = null;
      if (coreTypesConfig != null)
        msgs = ((InternalEObject)coreTypesConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG, null, msgs);
      if (newCoreTypesConfig != null)
        msgs = ((InternalEObject)newCoreTypesConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG, null, msgs);
      msgs = basicSetCoreTypesConfig(newCoreTypesConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG, newCoreTypesConfig, newCoreTypesConfig));
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
      case PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG:
        return basicSetCoreTypesConfig(null, msgs);
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
      case PdfmodelPackage.MODEL_CONFIG__BASE_PACKAGE:
        return getBasePackage();
      case PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG:
        return getCoreTypesConfig();
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
      case PdfmodelPackage.MODEL_CONFIG__BASE_PACKAGE:
        setBasePackage((String)newValue);
        return;
      case PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG:
        setCoreTypesConfig((CoreTypesConfig)newValue);
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
      case PdfmodelPackage.MODEL_CONFIG__BASE_PACKAGE:
        setBasePackage(BASE_PACKAGE_EDEFAULT);
        return;
      case PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG:
        setCoreTypesConfig((CoreTypesConfig)null);
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
      case PdfmodelPackage.MODEL_CONFIG__BASE_PACKAGE:
        return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
      case PdfmodelPackage.MODEL_CONFIG__CORE_TYPES_CONFIG:
        return coreTypesConfig != null;
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
    result.append(" (basePackage: ");
    result.append(basePackage);
    result.append(')');
    return result.toString();
  }

} //ModelConfigImpl
