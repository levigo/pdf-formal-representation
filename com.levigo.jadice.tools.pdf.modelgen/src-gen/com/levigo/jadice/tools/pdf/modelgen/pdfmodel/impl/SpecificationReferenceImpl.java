/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl#getSection <em>Section</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationReferenceImpl extends MinimalEObjectImpl.Container implements SpecificationReference
{
  /**
   * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected SectionReference section;

  /**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final int TABLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected int table = TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificationReferenceImpl()
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
    return PdfmodelPackage.Literals.SPECIFICATION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionReference getSection()
  {
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSection(SectionReference newSection, NotificationChain msgs)
  {
    SectionReference oldSection = section;
    section = newSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION, oldSection, newSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSection(SectionReference newSection)
  {
    if (newSection != section)
    {
      NotificationChain msgs = null;
      if (section != null)
        msgs = ((InternalEObject)section).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION, null, msgs);
      if (newSection != null)
        msgs = ((InternalEObject)newSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION, null, msgs);
      msgs = basicSetSection(newSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION, newSection, newSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(int newTable)
  {
    int oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.SPECIFICATION_REFERENCE__TABLE, oldTable, table));
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
      case PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION:
        return basicSetSection(null, msgs);
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
      case PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION:
        return getSection();
      case PdfmodelPackage.SPECIFICATION_REFERENCE__TABLE:
        return getTable();
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
      case PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION:
        setSection((SectionReference)newValue);
        return;
      case PdfmodelPackage.SPECIFICATION_REFERENCE__TABLE:
        setTable((Integer)newValue);
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
      case PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION:
        setSection((SectionReference)null);
        return;
      case PdfmodelPackage.SPECIFICATION_REFERENCE__TABLE:
        setTable(TABLE_EDEFAULT);
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
      case PdfmodelPackage.SPECIFICATION_REFERENCE__SECTION:
        return section != null;
      case PdfmodelPackage.SPECIFICATION_REFERENCE__TABLE:
        return table != TABLE_EDEFAULT;
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
    result.append(" (table: ");
    result.append(table);
    result.append(')');
    return result.toString();
  }

} //SpecificationReferenceImpl
