/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Entry Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl#isTextString <em>Text String</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl#isAsciiString <em>Ascii String</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl#isByteString <em>Byte String</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringEntryValueImpl extends AbstractEntryValueImpl implements StringEntryValue
{
  /**
   * The default value of the '{@link #isTextString() <em>Text String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTextString()
   * @generated
   * @ordered
   */
  protected static final boolean TEXT_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTextString() <em>Text String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTextString()
   * @generated
   * @ordered
   */
  protected boolean textString = TEXT_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isAsciiString() <em>Ascii String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsciiString()
   * @generated
   * @ordered
   */
  protected static final boolean ASCII_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAsciiString() <em>Ascii String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsciiString()
   * @generated
   * @ordered
   */
  protected boolean asciiString = ASCII_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isByteString() <em>Byte String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByteString()
   * @generated
   * @ordered
   */
  protected static final boolean BYTE_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isByteString() <em>Byte String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByteString()
   * @generated
   * @ordered
   */
  protected boolean byteString = BYTE_STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected StringValidationRule rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringEntryValueImpl()
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
    return PdfmodelPackage.Literals.STRING_ENTRY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTextString()
  {
    return textString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextString(boolean newTextString)
  {
    boolean oldTextString = textString;
    textString = newTextString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_ENTRY_VALUE__TEXT_STRING, oldTextString, textString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAsciiString()
  {
    return asciiString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsciiString(boolean newAsciiString)
  {
    boolean oldAsciiString = asciiString;
    asciiString = newAsciiString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_ENTRY_VALUE__ASCII_STRING, oldAsciiString, asciiString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isByteString()
  {
    return byteString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByteString(boolean newByteString)
  {
    boolean oldByteString = byteString;
    byteString = newByteString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_ENTRY_VALUE__BYTE_STRING, oldByteString, byteString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValidationRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(StringValidationRule newRule, NotificationChain msgs)
  {
    StringValidationRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_ENTRY_VALUE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(StringValidationRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.STRING_ENTRY_VALUE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.STRING_ENTRY_VALUE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.STRING_ENTRY_VALUE__RULE, newRule, newRule));
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
      case PdfmodelPackage.STRING_ENTRY_VALUE__RULE:
        return basicSetRule(null, msgs);
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
      case PdfmodelPackage.STRING_ENTRY_VALUE__TEXT_STRING:
        return isTextString();
      case PdfmodelPackage.STRING_ENTRY_VALUE__ASCII_STRING:
        return isAsciiString();
      case PdfmodelPackage.STRING_ENTRY_VALUE__BYTE_STRING:
        return isByteString();
      case PdfmodelPackage.STRING_ENTRY_VALUE__RULE:
        return getRule();
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
      case PdfmodelPackage.STRING_ENTRY_VALUE__TEXT_STRING:
        setTextString((Boolean)newValue);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__ASCII_STRING:
        setAsciiString((Boolean)newValue);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__BYTE_STRING:
        setByteString((Boolean)newValue);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__RULE:
        setRule((StringValidationRule)newValue);
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
      case PdfmodelPackage.STRING_ENTRY_VALUE__TEXT_STRING:
        setTextString(TEXT_STRING_EDEFAULT);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__ASCII_STRING:
        setAsciiString(ASCII_STRING_EDEFAULT);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__BYTE_STRING:
        setByteString(BYTE_STRING_EDEFAULT);
        return;
      case PdfmodelPackage.STRING_ENTRY_VALUE__RULE:
        setRule((StringValidationRule)null);
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
      case PdfmodelPackage.STRING_ENTRY_VALUE__TEXT_STRING:
        return textString != TEXT_STRING_EDEFAULT;
      case PdfmodelPackage.STRING_ENTRY_VALUE__ASCII_STRING:
        return asciiString != ASCII_STRING_EDEFAULT;
      case PdfmodelPackage.STRING_ENTRY_VALUE__BYTE_STRING:
        return byteString != BYTE_STRING_EDEFAULT;
      case PdfmodelPackage.STRING_ENTRY_VALUE__RULE:
        return rule != null;
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
    result.append(" (textString: ");
    result.append(textString);
    result.append(", asciiString: ");
    result.append(asciiString);
    result.append(", byteString: ");
    result.append(byteString);
    result.append(')');
    return result.toString();
  }

} //StringEntryValueImpl
