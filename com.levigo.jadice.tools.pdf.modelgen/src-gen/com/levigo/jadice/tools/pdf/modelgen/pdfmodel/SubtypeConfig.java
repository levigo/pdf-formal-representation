/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig#getCandidates <em>Candidates</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getSubtypeConfig()
 * @model
 * @generated
 */
public interface SubtypeConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Candidates</b></em>' reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Candidates</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Candidates</em>' reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getSubtypeConfig_Candidates()
   * @model
   * @generated
   */
  EList<DictionaryDeclaration> getCandidates();

} // SubtypeConfig
