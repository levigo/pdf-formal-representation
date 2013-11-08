/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig#getCoreTypesConfig <em>Core Types Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getModelConfig()
 * @model
 * @generated
 */
public interface ModelConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Package</em>' attribute.
   * @see #setBasePackage(String)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getModelConfig_BasePackage()
   * @model
   * @generated
   */
  String getBasePackage();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig#getBasePackage <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Package</em>' attribute.
   * @see #getBasePackage()
   * @generated
   */
  void setBasePackage(String value);

  /**
   * Returns the value of the '<em><b>Core Types Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core Types Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core Types Config</em>' containment reference.
   * @see #setCoreTypesConfig(CoreTypesConfig)
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getModelConfig_CoreTypesConfig()
   * @model containment="true"
   * @generated
   */
  CoreTypesConfig getCoreTypesConfig();

  /**
   * Sets the value of the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig#getCoreTypesConfig <em>Core Types Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core Types Config</em>' containment reference.
   * @see #getCoreTypesConfig()
   * @generated
   */
  void setCoreTypesConfig(CoreTypesConfig value);

} // ModelConfig
