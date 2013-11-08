/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Dict Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#getType <em>Type</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getMappingDictEntryValue()
 * @model
 * @generated
 */
public interface MappingDictEntryValue extends AbstractEntryValue
{
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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getMappingDictEntryValue_Type()
   * @model containment="true"
   * @generated
   */
  AbstractEntryValue getType();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#getType <em>Type</em>}' containment reference.
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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getMappingDictEntryValue_RequiresCustomValidation()
   * @model
   * @generated
   */
  boolean isRequiresCustomValidation();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}' attribute.
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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getMappingDictEntryValue_RequiresCustomDefault()
   * @model
   * @generated
   */
  boolean isRequiresCustomDefault();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires Custom Default</em>' attribute.
   * @see #isRequiresCustomDefault()
   * @generated
   */
  void setRequiresCustomDefault(boolean value);

} // MappingDictEntryValue
