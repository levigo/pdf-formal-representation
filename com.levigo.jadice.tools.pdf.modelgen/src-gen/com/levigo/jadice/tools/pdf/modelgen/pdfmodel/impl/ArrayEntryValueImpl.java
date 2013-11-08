/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl#getIndirectReference <em>Indirect Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayEntryValueImpl extends AbstractEntryValueImpl implements ArrayEntryValue
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected ArrayValidationRule rule;

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
  protected ArrayEntryValueImpl()
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
    return PdfmodelPackage.Literals.ARRAY_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayValidationRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(ArrayValidationRule newRule, NotificationChain msgs)
  {
    ArrayValidationRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(ArrayValidationRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE, newRule, newRule));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE, oldIndirectReference, indirectReference));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION, oldRequiresCustomValidation, requiresCustomValidation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT, oldRequiresCustomDefault, requiresCustomDefault));
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
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE:
        return basicSetRule(null, msgs);
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE:
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
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE:
        return getRule();
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE:
        return getIndirectReference();
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE:
        return getType();
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        return isRequiresCustomValidation();
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE:
        setRule((ArrayValidationRule)newValue);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE:
        setIndirectReference((IndirectReference)newValue);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE:
        setType((AbstractEntryValue)newValue);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation((Boolean)newValue);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE:
        setRule((ArrayValidationRule)null);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE:
        setIndirectReference(INDIRECT_REFERENCE_EDEFAULT);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE:
        setType((AbstractEntryValue)null);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        setRequiresCustomValidation(REQUIRES_CUSTOM_VALIDATION_EDEFAULT);
        return;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
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
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__RULE:
        return rule != null;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE:
        return indirectReference != INDIRECT_REFERENCE_EDEFAULT;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__TYPE:
        return type != null;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION:
        return requiresCustomValidation != REQUIRES_CUSTOM_VALIDATION_EDEFAULT;
      case PdfmodelPackage.ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT:
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
    result.append(" (indirectReference: ");
    result.append(indirectReference);
    result.append(", requiresCustomValidation: ");
    result.append(requiresCustomValidation);
    result.append(", requiresCustomDefault: ");
    result.append(requiresCustomDefault);
    result.append(')');
    return result.toString();
  }

} //ArrayEntryValueImpl
