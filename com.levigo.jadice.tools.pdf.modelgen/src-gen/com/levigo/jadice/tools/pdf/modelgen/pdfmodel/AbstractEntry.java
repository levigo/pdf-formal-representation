/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isCached <em>Cached</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequired <em>Required</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getIndirectReference <em>Indirect Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getValue <em>Value</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getSince <em>Since</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomValidation <em>Requires Custom Validation</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomDefault <em>Requires Custom Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry()
 * @model
 * @generated
 */
public interface AbstractEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cached</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cached</em>' attribute.
   * @see #setCached(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_Cached()
   * @model
   * @generated
   */
  boolean isCached();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isCached <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cached</em>' attribute.
   * @see #isCached()
   * @generated
   */
  void setCached(boolean value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_Required()
   * @model
   * @generated
   */
  boolean isRequired();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
  void setRequired(boolean value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_IndirectReference()
   * @model
   * @generated
   */
  IndirectReference getIndirectReference();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getIndirectReference <em>Indirect Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indirect Reference</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
   * @see #getIndirectReference()
   * @generated
   */
  void setIndirectReference(IndirectReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AbstractEntryValue)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_Value()
   * @model containment="true"
   * @generated
   */
  AbstractEntryValue getValue();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AbstractEntryValue value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_Since()
   * @model
   * @generated
   */
  SinceVersion getSince();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getSince <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @see #getSince()
   * @generated
   */
  void setSince(SinceVersion value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_RequiresCustomValidation()
   * @model
   * @generated
   */
  boolean isRequiresCustomValidation();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomValidation <em>Requires Custom Validation</em>}' attribute.
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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getAbstractEntry_RequiresCustomDefault()
   * @model
   * @generated
   */
  boolean isRequiresCustomDefault();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomDefault <em>Requires Custom Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires Custom Default</em>' attribute.
   * @see #isRequiresCustomDefault()
   * @generated
   */
  void setRequiresCustomDefault(boolean value);

} // AbstractEntry
