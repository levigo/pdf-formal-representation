/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Flags Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getSpecificationReference <em>Specification Reference</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclaration()
 * @model
 * @generated
 */
public interface BitFlagsDeclaration extends AbstractDeclaration
{
  /**
   * Returns the value of the '<em><b>Specification Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specification Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification Reference</em>' containment reference.
   * @see #setSpecificationReference(SpecificationReference)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclaration_SpecificationReference()
   * @model containment="true"
   * @generated
   */
  SpecificationReference getSpecificationReference();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getSpecificationReference <em>Specification Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification Reference</em>' containment reference.
   * @see #getSpecificationReference()
   * @generated
   */
  void setSpecificationReference(SpecificationReference value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclaration_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<BitFlagsDeclarationPart> getDeclarations();

} // BitFlagsDeclaration
