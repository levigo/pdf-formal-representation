/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Flags Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitFlagsDeclarationPartImpl extends MinimalEObjectImpl.Container implements BitFlagsDeclarationPart
{
  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected BitFlagsDeclarationPartImpl()
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
    return PdfmodelPackage.Literals.BIT_FLAGS_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__SINCE, oldSince, since));
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__INDEX:
        return getIndex();
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__NAME:
        return getName();
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__SINCE:
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__INDEX:
        setIndex((Integer)newValue);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__NAME:
        setName((String)newValue);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__SINCE:
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__SINCE:
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
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__INDEX:
        return index != INDEX_EDEFAULT;
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART__SINCE:
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
    result.append(" (index: ");
    result.append(index);
    result.append(", name: ");
    result.append(name);
    result.append(", since: ");
    result.append(since);
    result.append(')');
    return result.toString();
  }

} //BitFlagsDeclarationPartImpl
