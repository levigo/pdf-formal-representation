/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl#isStream <em>Stream</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl#getSubtypeConfig <em>Subtype Config</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryDeclarationImpl extends AbstractDeclarationImpl implements DictionaryDeclaration
{
  /**
   * The default value of the '{@link #isStream() <em>Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStream()
   * @generated
   * @ordered
   */
  protected static final boolean STREAM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStream() <em>Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStream()
   * @generated
   * @ordered
   */
  protected boolean stream = STREAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<DictionaryDeclaration> superTypes;

  /**
   * The cached value of the '{@link #getSubtypeConfig() <em>Subtype Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeConfig()
   * @generated
   * @ordered
   */
  protected SubtypeConfig subtypeConfig;

  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected EList<DictionaryEntry> entries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DictionaryDeclarationImpl()
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
    return PdfmodelPackage.Literals.DICTIONARY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStream()
  {
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream(boolean newStream)
  {
    boolean oldStream = stream;
    stream = newStream;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.DICTIONARY_DECLARATION__STREAM, oldStream, stream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DictionaryDeclaration> getSuperTypes()
  {
    if (superTypes == null)
    {
      superTypes = new EObjectResolvingEList<DictionaryDeclaration>(DictionaryDeclaration.class, this, PdfmodelPackage.DICTIONARY_DECLARATION__SUPER_TYPES);
    }
    return superTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeConfig getSubtypeConfig()
  {
    return subtypeConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeConfig(SubtypeConfig newSubtypeConfig, NotificationChain msgs)
  {
    SubtypeConfig oldSubtypeConfig = subtypeConfig;
    subtypeConfig = newSubtypeConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG, oldSubtypeConfig, newSubtypeConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeConfig(SubtypeConfig newSubtypeConfig)
  {
    if (newSubtypeConfig != subtypeConfig)
    {
      NotificationChain msgs = null;
      if (subtypeConfig != null)
        msgs = ((InternalEObject)subtypeConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG, null, msgs);
      if (newSubtypeConfig != null)
        msgs = ((InternalEObject)newSubtypeConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG, null, msgs);
      msgs = basicSetSubtypeConfig(newSubtypeConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG, newSubtypeConfig, newSubtypeConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DictionaryEntry> getEntries()
  {
    if (entries == null)
    {
      entries = new EObjectContainmentEList<DictionaryEntry>(DictionaryEntry.class, this, PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES);
    }
    return entries;
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
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG:
        return basicSetSubtypeConfig(null, msgs);
      case PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES:
        return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
      case PdfmodelPackage.DICTIONARY_DECLARATION__STREAM:
        return isStream();
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUPER_TYPES:
        return getSuperTypes();
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG:
        return getSubtypeConfig();
      case PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES:
        return getEntries();
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
      case PdfmodelPackage.DICTIONARY_DECLARATION__STREAM:
        setStream((Boolean)newValue);
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUPER_TYPES:
        getSuperTypes().clear();
        getSuperTypes().addAll((Collection<? extends DictionaryDeclaration>)newValue);
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG:
        setSubtypeConfig((SubtypeConfig)newValue);
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES:
        getEntries().clear();
        getEntries().addAll((Collection<? extends DictionaryEntry>)newValue);
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
      case PdfmodelPackage.DICTIONARY_DECLARATION__STREAM:
        setStream(STREAM_EDEFAULT);
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUPER_TYPES:
        getSuperTypes().clear();
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG:
        setSubtypeConfig((SubtypeConfig)null);
        return;
      case PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES:
        getEntries().clear();
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
      case PdfmodelPackage.DICTIONARY_DECLARATION__STREAM:
        return stream != STREAM_EDEFAULT;
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUPER_TYPES:
        return superTypes != null && !superTypes.isEmpty();
      case PdfmodelPackage.DICTIONARY_DECLARATION__SUBTYPE_CONFIG:
        return subtypeConfig != null;
      case PdfmodelPackage.DICTIONARY_DECLARATION__ENTRIES:
        return entries != null && !entries.isEmpty();
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
    result.append(" (stream: ");
    result.append(stream);
    result.append(')');
    return result.toString();
  }

} //DictionaryDeclarationImpl
