/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#isStream <em>Stream</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSubtypeConfig <em>Subtype Config</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryDeclaration()
 * @model
 * @generated
 */
public interface DictionaryDeclaration extends AbstractDeclaration
{
  /**
   * Returns the value of the '<em><b>Stream</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' attribute.
   * @see #setStream(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryDeclaration_Stream()
   * @model
   * @generated
   */
  boolean isStream();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#isStream <em>Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' attribute.
   * @see #isStream()
   * @generated
   */
  void setStream(boolean value);

  /**
   * Returns the value of the '<em><b>Super Types</b></em>' reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryDeclaration_SuperTypes()
   * @model
   * @generated
   */
  EList<DictionaryDeclaration> getSuperTypes();

  /**
   * Returns the value of the '<em><b>Subtype Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Config</em>' containment reference.
   * @see #setSubtypeConfig(SubtypeConfig)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryDeclaration_SubtypeConfig()
   * @model containment="true"
   * @generated
   */
  SubtypeConfig getSubtypeConfig();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSubtypeConfig <em>Subtype Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Config</em>' containment reference.
   * @see #getSubtypeConfig()
   * @generated
   */
  void setSubtypeConfig(SubtypeConfig value);

  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryDeclaration_Entries()
   * @model containment="true"
   * @generated
   */
  EList<DictionaryEntry> getEntries();

} // DictionaryDeclaration
