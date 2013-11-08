/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SubtypeConfigImpl#getCandidates <em>Candidates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtypeConfigImpl extends MinimalEObjectImpl.Container implements SubtypeConfig
{
  /**
   * The cached value of the '{@link #getCandidates() <em>Candidates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidates()
   * @generated
   * @ordered
   */
  protected EList<DictionaryDeclaration> candidates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtypeConfigImpl()
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
    return PdfmodelPackage.Literals.SUBTYPE_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DictionaryDeclaration> getCandidates()
  {
    if (candidates == null)
    {
      candidates = new EObjectResolvingEList<DictionaryDeclaration>(DictionaryDeclaration.class, this, PdfmodelPackage.SUBTYPE_CONFIG__CANDIDATES);
    }
    return candidates;
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
      case PdfmodelPackage.SUBTYPE_CONFIG__CANDIDATES:
        return getCandidates();
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
      case PdfmodelPackage.SUBTYPE_CONFIG__CANDIDATES:
        getCandidates().clear();
        getCandidates().addAll((Collection<? extends DictionaryDeclaration>)newValue);
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
      case PdfmodelPackage.SUBTYPE_CONFIG__CANDIDATES:
        getCandidates().clear();
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
      case PdfmodelPackage.SUBTYPE_CONFIG__CANDIDATES:
        return candidates != null && !candidates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubtypeConfigImpl
