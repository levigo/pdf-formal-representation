/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getKey <em>Key</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#isInheritable <em>Inheritable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryEntry()
 * @model
 * @generated
 */
public interface DictionaryEntry extends AbstractEntry
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryEntry_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryEntry_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Inheritable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritable</em>' attribute.
   * @see #setInheritable(boolean)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getDictionaryEntry_Inheritable()
   * @model
   * @generated
   */
  boolean isInheritable();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#isInheritable <em>Inheritable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritable</em>' attribute.
   * @see #isInheritable()
   * @generated
   */
  void setInheritable(boolean value);

} // DictionaryEntry
