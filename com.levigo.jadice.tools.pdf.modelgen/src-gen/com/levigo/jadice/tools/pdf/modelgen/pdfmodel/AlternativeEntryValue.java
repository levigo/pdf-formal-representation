/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAlternativeEntryValue()
 * @model
 * @generated
 */
public interface AlternativeEntryValue extends AbstractEntryValue
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAlternativeEntryValue_Options()
   * @model containment="true"
   * @generated
   */
  EList<AbstractEntryValue> getOptions();

} // AlternativeEntryValue
