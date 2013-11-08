/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Greater Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule#getMinValue <em>Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getNumberGreaterValidationRule()
 * @model
 * @generated
 */
public interface NumberGreaterValidationRule extends NumberValidationRule
{
  /**
   * Returns the value of the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' containment reference.
   * @see #setMinValue(NumberLiteral)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getNumberGreaterValidationRule_MinValue()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getMinValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule#getMinValue <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' containment reference.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(NumberLiteral value);

} // NumberGreaterValidationRule
