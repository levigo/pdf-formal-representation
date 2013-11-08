/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Mapped Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayMappedDeclaration()
 * @model
 * @generated
 */
public interface ArrayMappedDeclaration extends AbstractDeclaration
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayMappedDeclaration_Entries()
   * @model containment="true"
   * @generated
   */
  EList<ArrayMappedEntry> getEntries();

} // ArrayMappedDeclaration
