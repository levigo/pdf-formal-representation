/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Length Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getStringLengthValidationRule()
 * @model
 * @generated
 */
public interface StringLengthValidationRule extends StringValidationRule
{
  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(IntLiteral)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getStringLengthValidationRule_Length()
   * @model containment="true"
   * @generated
   */
  IntLiteral getLength();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(IntLiteral value);

} // StringLengthValidationRule
