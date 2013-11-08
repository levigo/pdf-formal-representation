/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Dict Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingDictEntryValueImpl extends AbstractEntryValueImpl implements MappingDictEntryValue
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AbstractEntryValue type;

  /**
   * The default value of the '{@link #isRequiresCustomValidation() <em>Requires Custom Validation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiresCustomValidation()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRES_CUSTOM_VALIDATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequiresCustomValidation() <em>Requires Custom Validation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiresCustomValidation()
   * @generated
   * @ordered
   */
  protected boolean requiresCustomValidation = REQUIRES_CUSTOM_VALIDATION_EDEFAULT;

  /**
   * The default value of the '{@link #isRequiresCustomDefault() <em>Requires Custom Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiresCustomDefault()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRES_CUSTOM_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequiresCustomDefault() <em>Requires Custom Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiresCustomDefault()
   * @generated
   * @ordered
   */
  protected boolean requiresCustomDefault = REQUIRES_CUSTOM_DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingDictEntryValueImpl()
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
    return PdfmodelPackage.Literals.MAPPING_DICT_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntryValue getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AbstractEntryValue newType, NotificationChain msgs)
  {
    AbstractEntryValue oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AbstractEntryValue newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequiresCustomValidation()
  {
    return requiresCustomValidation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiresCustomValidation(boolean newRequiresCustomValidation)
  {
    boolean oldRequiresCustomValidation = requiresCustomValidation;
    requiresCustomValidation = newRequiresCustomValidation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION, oldRequiresCustomValidation, requiresCustomValidation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequiresCustomDefault()
  {
    return requiresCustomDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiresCustomDefault(boolean newRequiresCustomDefault)
  {
    boolean oldRequiresCustomDefault = requiresCustomDefault;
    requiresCustomDefault = newRequiresCustomDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT, oldRequiresCustomDefault, requiresCustomDefault));
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
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE:
        return basicSetType(null, msgs);
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
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE:
        return getType();
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        return isRequiresCustomValidation();
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
        return isRequiresCustomDefault();
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
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE:
        setType((AbstractEntryValue)newValue);
        return;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation((Boolean)newValue);
        return;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
        setRequiresCustomDefault((Boolean)newValue);
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
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE:
        setType((AbstractEntryValue)null);
        return;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation(REQUIRES_CUSTOM_VALIDATION_EDEFAULT);
        return;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
        setRequiresCustomDefault(REQUIRES_CUSTOM_DEFAULT_EDEFAULT);
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
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__TYPE:
        return type != null;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        return requiresCustomValidation != REQUIRES_CUSTOM_VALIDATION_EDEFAULT;
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
        return requiresCustomDefault != REQUIRES_CUSTOM_DEFAULT_EDEFAULT;
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
    result.append(" (requiresCustomValidation: ");
    result.append(requiresCustomValidation);
    result.append(", requiresCustomDefault: ");
    result.append(requiresCustomDefault);
    result.append(')');
    return result.toString();
  }

} //MappingDictEntryValueImpl
