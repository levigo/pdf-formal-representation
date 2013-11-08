/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference#getSection <em>Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getSectionReference()
 * @model
 * @generated
 */
public interface SectionReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Section</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' attribute.
   * @see #setSection(String)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getSectionReference_Section()
   * @model
   * @generated
   */
  String getSection();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference#getSection <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' attribute.
   * @see #getSection()
   * @generated
   */
  void setSection(String value);

} // SectionReference
