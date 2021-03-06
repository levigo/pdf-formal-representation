/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Mapped Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayMappedEntryValue()
 * @model
 * @generated
 */
public interface ArrayMappedEntryValue extends AbstractEntryValue
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ArrayMappedDeclaration)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayMappedEntryValue_Target()
   * @model
   * @generated
   */
  ArrayMappedDeclaration getTarget();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ArrayMappedDeclaration value);

} // ArrayMappedEntryValue
