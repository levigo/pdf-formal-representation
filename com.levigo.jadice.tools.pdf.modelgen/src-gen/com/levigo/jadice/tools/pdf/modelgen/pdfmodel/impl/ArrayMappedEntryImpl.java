/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Mapped Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayMappedEntryImpl extends AbstractEntryImpl implements ArrayMappedEntry
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
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayMappedEntryImpl()
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
    return PdfmodelPackage.Literals.ARRAY_MAPPED_ENTRY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_MAPPED_ENTRY__INDEX, oldIndex, index));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_MAPPED_ENTRY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable)
  {
    boolean oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.ARRAY_MAPPED_ENTRY__NULLABLE, oldNullable, nullable));
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__INDEX:
        return getIndex();
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NAME:
        return getName();
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NULLABLE:
        return isNullable();
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__INDEX:
        setIndex((Integer)newValue);
        return;
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NAME:
        setName((String)newValue);
        return;
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NULLABLE:
        setNullable((Boolean)newValue);
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
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
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__INDEX:
        return index != INDEX_EDEFAULT;
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY__NULLABLE:
        return nullable != NULLABLE_EDEFAULT;
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
    result.append(", nullable: ");
    result.append(nullable);
    result.append(')');
    return result.toString();
  }

} //ArrayMappedEntryImpl
