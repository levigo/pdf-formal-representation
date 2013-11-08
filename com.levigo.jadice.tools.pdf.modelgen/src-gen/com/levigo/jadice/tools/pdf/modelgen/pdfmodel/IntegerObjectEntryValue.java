/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Object Entry Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRule <em>Rule</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasMustBe <em>Has Must Be</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue()
 * @model
 * @generated
 */
public interface IntegerObjectEntryValue extends AbstractEntryValue
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
   * @see #setRule(IntegerValidationRule)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue_Rule()
   * @model containment="true"
   * @generated
   */
  IntegerValidationRule getRule();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(IntegerValidationRule value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue_HasMustBe()
   * @model
   * @generated
   */
  boolean isHasMustBe();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasMustBe <em>Has Must Be</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Must Be</em>' attribute.
   * @see #isHasMustBe()
   * @generated
   */
  void setHasMustBe(boolean value);

  /**
   * Returns the value of the '<em><b>Required Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Value</em>' containment reference.
   * @see #setRequiredValue(IntLiteral)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue_RequiredValue()
   * @model containment="true"
   * @generated
   */
  IntLiteral getRequiredValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRequiredValue <em>Required Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Value</em>' containment reference.
   * @see #getRequiredValue()
   * @generated
   */
  void setRequiredValue(IntLiteral value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasDefault <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Default</em>' attribute.
   * @see #isHasDefault()
   * @generated
   */
  void setHasDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(IntLiteral)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIntegerObjectEntryValue_DefaultValue()
   * @model containment="true"
   * @generated
   */
  IntLiteral getDefaultValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(IntLiteral value);

} // IntegerObjectEntryValue
