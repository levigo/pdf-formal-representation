/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Values Validation Rule Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getValue <em>Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerValuesValidationRuleEntry()
 * @model
 * @generated
 */
public interface IntegerValuesValidationRuleEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(IntLiteral)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerValuesValidationRuleEntry_Value()
   * @model containment="true"
   * @generated
   */
  IntLiteral getValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(IntLiteral value);

  /**
   * Returns the value of the '<em><b>Since</b></em>' attribute.
   * The literals are from the enumeration {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @see #setSince(SinceVersion)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerValuesValidationRuleEntry_Since()
   * @model
   * @generated
   */
  SinceVersion getSince();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getSince <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @see #getSince()
   * @generated
   */
  void setSince(SinceVersion value);

} // IntegerValuesValidationRuleEntry
