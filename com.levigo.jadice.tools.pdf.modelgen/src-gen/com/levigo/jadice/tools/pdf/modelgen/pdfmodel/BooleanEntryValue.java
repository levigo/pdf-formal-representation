/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasMustBe <em>Has Must Be</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBooleanEntryValue()
 * @model
 * @generated
 */
public interface BooleanEntryValue extends AbstractEntryValue
{
  /**
   * Returns the value of the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Must Be</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Must Be</em>' attribute.
   * @see #setHasMustBe(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBooleanEntryValue_HasMustBe()
   * @model
   * @generated
   */
  boolean isHasMustBe();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasMustBe <em>Has Must Be</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Must Be</em>' attribute.
   * @see #isHasMustBe()
   * @generated
   */
  void setHasMustBe(boolean value);

  /**
   * Returns the value of the '<em><b>Required Value</b></em>' attribute.
   * The literals are from the enumeration {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Value</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @see #setRequiredValue(Bool)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBooleanEntryValue_RequiredValue()
   * @model
   * @generated
   */
  Bool getRequiredValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getRequiredValue <em>Required Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Value</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @see #getRequiredValue()
   * @generated
   */
  void setRequiredValue(Bool value);

  /**
   * Returns the value of the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Default</em>' attribute.
   * @see #setHasDefault(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBooleanEntryValue_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasDefault <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Default</em>' attribute.
   * @see #isHasDefault()
   * @generated
   */
  void setHasDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * The literals are from the enumeration {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @see #setDefaultValue(Bool)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBooleanEntryValue_DefaultValue()
   * @model
   * @generated
   */
  Bool getDefaultValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Bool value);

} // BooleanEntryValue
