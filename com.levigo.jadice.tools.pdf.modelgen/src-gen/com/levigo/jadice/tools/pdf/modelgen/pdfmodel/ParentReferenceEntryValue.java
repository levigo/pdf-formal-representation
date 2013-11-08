/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Reference Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue#getParentType <em>Parent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getParentReferenceEntryValue()
 * @model
 * @generated
 */
public interface ParentReferenceEntryValue extends AbstractEntryValue
{
  /**
   * Returns the value of the '<em><b>Parent Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Type</em>' reference.
   * @see #setParentType(DictionaryDeclaration)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getParentReferenceEntryValue_ParentType()
   * @model
   * @generated
   */
  DictionaryDeclaration getParentType();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue#getParentType <em>Parent Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Type</em>' reference.
   * @see #getParentType()
   * @generated
   */
  void setParentType(DictionaryDeclaration value);

} // ParentReferenceEntryValue
