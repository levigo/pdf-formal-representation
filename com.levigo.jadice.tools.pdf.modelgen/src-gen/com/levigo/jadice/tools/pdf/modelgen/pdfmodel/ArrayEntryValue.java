/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getRule <em>Rule</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getIndirectReference <em>Indirect Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getType <em>Type</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue()
 * @model
 * @generated
 */
public interface ArrayEntryValue extends AbstractEntryValue
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(ArrayValidationRule)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue_Rule()
   * @model containment="true"
   * @generated
   */
  ArrayValidationRule getRule();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(ArrayValidationRule value);

  /**
   * Returns the value of the '<em><b>Indirect Reference</b></em>' attribute.
   * The literals are from the enumeration {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indirect Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indirect Reference</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
   * @see #setIndirectReference(IndirectReference)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue_IndirectReference()
   * @model
   * @generated
   */
  IndirectReference getIndirectReference();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getIndirectReference <em>Indirect Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indirect Reference</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
   * @see #getIndirectReference()
   * @generated
   */
  void setIndirectReference(IndirectReference value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractEntryValue)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue_Type()
   * @model containment="true"
   * @generated
   */
  AbstractEntryValue getType();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractEntryValue value);

  /**
   * Returns the value of the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires Custom Validation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires Custom Validation</em>' attribute.
   * @see #setRequiresCustomValidation(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue_RequiresCustomValidation()
   * @model
   * @generated
   */
  boolean isRequiresCustomValidation();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires Custom Validation</em>' attribute.
   * @see #isRequiresCustomValidation()
   * @generated
   */
  void setRequiresCustomValidation(boolean value);

  /**
   * Returns the value of the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires Custom Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires Custom Default</em>' attribute.
   * @see #setRequiresCustomDefault(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getArrayEntryValue_RequiresCustomDefault()
   * @model
   * @generated
   */
  boolean isRequiresCustomDefault();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires Custom Default</em>' attribute.
   * @see #isRequiresCustomDefault()
   * @generated
   */
  void setRequiresCustomDefault(boolean value);

} // ArrayEntryValue
