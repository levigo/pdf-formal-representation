/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Flags Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getIndex <em>Index</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getName <em>Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclarationPart()
 * @model
 * @generated
 */
public interface BitFlagsDeclarationPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclarationPart_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclarationPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getBitFlagsDeclarationPart_Since()
   * @model
   * @generated
   */
  SinceVersion getSince();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getSince <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' attribute.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @see #getSince()
   * @generated
   */
  void setSince(SinceVersion value);

} // BitFlagsDeclarationPart
