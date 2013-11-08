/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#isCached <em>Cached</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#getIndirectReference <em>Indirect Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#getSince <em>Since</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractEntryImpl extends MinimalEObjectImpl.Container implements AbstractEntry
{
  /**
   * The default value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected static final boolean CACHED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected boolean cached = CACHED_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #getIndirectReference() <em>Indirect Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndirectReference()
   * @generated
   * @ordered
   */
  protected static final IndirectReference INDIRECT_REFERENCE_EDEFAULT = IndirectReference.UNDEFINED;

  /**
   * The cached value of the '{@link #getIndirectReference() <em>Indirect Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndirectReference()
   * @generated
   * @ordered
   */
  protected IndirectReference indirectReference = INDIRECT_REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AbstractEntryValue value;

  /**
   * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected static final SinceVersion SINCE_EDEFAULT = SinceVersion.UNDEFINED;

  /**
   * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected SinceVersion since = SINCE_EDEFAULT;

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
  protected AbstractEntryImpl()
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
    return PdfmodelPackage.Literals.ABSTRACT_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCached()
  {
    return cached;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCached(boolean newCached)
  {
    boolean oldCached = cached;
    cached = newCached;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__CACHED, oldCached, cached));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndirectReference getIndirectReference()
  {
    return indirectReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndirectReference(IndirectReference newIndirectReference)
  {
    IndirectReference oldIndirectReference = indirectReference;
    indirectReference = newIndirectReference == null ? INDIRECT_REFERENCE_EDEFAULT : newIndirectReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__INDIRECT_REFERENCE, oldIndirectReference, indirectReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntryValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AbstractEntryValue newValue, NotificationChain msgs)
  {
    AbstractEntryValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AbstractEntryValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ABSTRACT_ENTRY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ABSTRACT_ENTRY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SinceVersion getSince()
  {
    return since;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSince(SinceVersion newSince)
  {
    SinceVersion oldSince = since;
    since = newSince == null ? SINCE_EDEFAULT : newSince;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__SINCE, oldSince, since));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION, oldRequiresCustomValidation, requiresCustomValidation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT, oldRequiresCustomDefault, requiresCustomDefault));
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
      case PdfmodelPackage.ABSTRACT_ENTRY__VALUE:
        return basicSetValue(null, msgs);
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
      case PdfmodelPackage.ABSTRACT_ENTRY__CACHED:
        return isCached();
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRED:
        return isRequired();
      case PdfmodelPackage.ABSTRACT_ENTRY__INDIRECT_REFERENCE:
        return getIndirectReference();
      case PdfmodelPackage.ABSTRACT_ENTRY__VALUE:
        return getValue();
      case PdfmodelPackage.ABSTRACT_ENTRY__SINCE:
        return getSince();
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION:
        return isRequiresCustomValidation();
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ABSTRACT_ENTRY__CACHED:
        setCached((Boolean)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__INDIRECT_REFERENCE:
        setIndirectReference((IndirectReference)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__VALUE:
        setValue((AbstractEntryValue)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__SINCE:
        setSince((SinceVersion)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation((Boolean)newValue);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ABSTRACT_ENTRY__CACHED:
        setCached(CACHED_EDEFAULT);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__INDIRECT_REFERENCE:
        setIndirectReference(INDIRECT_REFERENCE_EDEFAULT);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__VALUE:
        setValue((AbstractEntryValue)null);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__SINCE:
        setSince(SINCE_EDEFAULT);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation(REQUIRES_CUSTOM_VALIDATION_EDEFAULT);
        return;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ABSTRACT_ENTRY__CACHED:
        return cached != CACHED_EDEFAULT;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case PdfmodelPackage.ABSTRACT_ENTRY__INDIRECT_REFERENCE:
        return indirectReference != INDIRECT_REFERENCE_EDEFAULT;
      case PdfmodelPackage.ABSTRACT_ENTRY__VALUE:
        return value != null;
      case PdfmodelPackage.ABSTRACT_ENTRY__SINCE:
        return since != SINCE_EDEFAULT;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION:
        return requiresCustomValidation != REQUIRES_CUSTOM_VALIDATION_EDEFAULT;
      case PdfmodelPackage.ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT:
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
    result.append(" (cached: ");
    result.append(cached);
    result.append(", required: ");
    result.append(required);
    result.append(", indirectReference: ");
    result.append(indirectReference);
    result.append(", since: ");
    result.append(since);
    result.append(", requiresCustomValidation: ");
    result.append(requiresCustomValidation);
    result.append(", requiresCustomDefault: ");
    result.append(requiresCustomDefault);
    result.append(')');
    return result.toString();
  }

} //AbstractEntryImpl
