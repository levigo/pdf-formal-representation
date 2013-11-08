/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDF Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel#getConfig <em>Config</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getPDFModel()
 * @model
 * @generated
 */
public interface PDFModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(ModelConfig)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getPDFModel_Config()
   * @model containment="true"
   * @generated
   */
  ModelConfig getConfig();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(ModelConfig value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getPDFModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDeclaration> getPackages();

} // PDFModel
