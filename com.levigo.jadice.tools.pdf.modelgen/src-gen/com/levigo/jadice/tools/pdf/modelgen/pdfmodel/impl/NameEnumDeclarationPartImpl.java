/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Enum Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameEnumDeclarationPartImpl extends MinimalEObjectImpl.Container implements NameEnumDeclarationPart
{
  /**
   * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected static final String CONSTANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected String constant = CONSTANT_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameEnumDeclarationPartImpl()
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
    return PdfmodelPackage.Literals.NAME_ENUM_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(String newConstant)
  {
    String oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NAME_ENUM_DECLARATION_PART__CONSTANT, oldConstant, constant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NAME_ENUM_DECLARATION_PART__ALIAS, oldAlias, alias));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.NAME_ENUM_DECLARATION_PART__SINCE, oldSince, since));
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
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__CONSTANT:
        return getConstant();
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__ALIAS:
        return getAlias();
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__SINCE:
        return getSince();
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
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__CONSTANT:
        setConstant((String)newValue);
        return;
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__ALIAS:
        setAlias((String)newValue);
        return;
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__SINCE:
        setSince((SinceVersion)newValue);
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
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__SINCE:
        setSince(SINCE_EDEFAULT);
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
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__CONSTANT:
        return CONSTANT_EDEFAULT == null ? constant != null : !CONSTANT_EDEFAULT.equals(constant);
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART__SINCE:
        return since != SINCE_EDEFAULT;
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
    result.append(" (constant: ");
    result.append(constant);
    result.append(", alias: ");
    result.append(alias);
    result.append(", since: ");
    result.append(since);
    result.append(')');
    return result.toString();
  }

} //NameEnumDeclarationPartImpl
