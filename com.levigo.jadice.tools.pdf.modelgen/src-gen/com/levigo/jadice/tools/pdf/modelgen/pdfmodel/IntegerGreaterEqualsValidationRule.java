/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Greater Equals Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule#getMinValue <em>Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerGreaterEqualsValidationRule()
 * @model
 * @generated
 */
public interface IntegerGreaterEqualsValidationRule extends IntegerValidationRule
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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerGreaterEqualsValidationRule_MinValue()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getMinValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule#getMinValue <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' containment reference.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(NumberLiteral value);

} // IntegerGreaterEqualsValidationRule
