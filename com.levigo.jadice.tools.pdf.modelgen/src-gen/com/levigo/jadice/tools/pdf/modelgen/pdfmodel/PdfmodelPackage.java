/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelFactory
 * @model kind="package"
 * @generated
 */
public interface PdfmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pdfmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.levigo.com/jadice/tools/pdf/modelgen/PDFModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pdfmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdfmodelPackage eINSTANCE = com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl <em>PDF Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getPDFModel()
   * @generated
   */
  int PDF_MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDF_MODEL__PACKAGES = 0;

  /**
   * The number of structural features of the '<em>PDF Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDF_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION__SINCE = 1;

  /**
   * The number of structural features of the '<em>Abstract Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl <em>Specification Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSpecificationReference()
   * @generated
   */
  int SPECIFICATION_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_REFERENCE__SECTION = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_REFERENCE__TABLE = 1;

  /**
   * The number of structural features of the '<em>Specification Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SectionReferenceImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSectionReference()
   * @generated
   */
  int SECTION_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_REFERENCE__SECTION = 0;

  /**
   * The number of structural features of the '<em>Section Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedDeclarationImpl <em>Array Mapped Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedDeclaration()
   * @generated
   */
  int ARRAY_MAPPED_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_DECLARATION__SINCE = ABSTRACT_DECLARATION__SINCE;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_DECLARATION__ENTRIES = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Mapped Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl <em>Abstract Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractEntry()
   * @generated
   */
  int ABSTRACT_ENTRY = 5;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__CACHED = 0;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__REQUIRED = 1;

  /**
   * The feature id for the '<em><b>Indirect Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__INDIRECT_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__VALUE = 3;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__SINCE = 4;

  /**
   * The feature id for the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION = 5;

  /**
   * The feature id for the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT = 6;

  /**
   * The number of structural features of the '<em>Abstract Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl <em>Array Mapped Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedEntry()
   * @generated
   */
  int ARRAY_MAPPED_ENTRY = 6;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__CACHED = ABSTRACT_ENTRY__CACHED;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__REQUIRED = ABSTRACT_ENTRY__REQUIRED;

  /**
   * The feature id for the '<em><b>Indirect Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__INDIRECT_REFERENCE = ABSTRACT_ENTRY__INDIRECT_REFERENCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__VALUE = ABSTRACT_ENTRY__VALUE;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__SINCE = ABSTRACT_ENTRY__SINCE;

  /**
   * The feature id for the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__REQUIRES_CUSTOM_VALIDATION = ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION;

  /**
   * The feature id for the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__REQUIRES_CUSTOM_DEFAULT = ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__INDEX = ABSTRACT_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__NAME = ABSTRACT_ENTRY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY__NULLABLE = ABSTRACT_ENTRY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Array Mapped Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY_FEATURE_COUNT = ABSTRACT_ENTRY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl <em>Dictionary Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryDeclaration()
   * @generated
   */
  int DICTIONARY_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__SINCE = ABSTRACT_DECLARATION__SINCE;

  /**
   * The feature id for the '<em><b>Stream</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__STREAM = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__SUPER_TYPES = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subtype Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__SUBTYPE_CONFIG = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION__ENTRIES = ABSTRACT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Dictionary Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SubtypeConfigImpl <em>Subtype Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SubtypeConfigImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSubtypeConfig()
   * @generated
   */
  int SUBTYPE_CONFIG = 8;

  /**
   * The feature id for the '<em><b>Candidates</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_CONFIG__CANDIDATES = 0;

  /**
   * The number of structural features of the '<em>Subtype Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_CONFIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryEntryImpl <em>Dictionary Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryEntryImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryEntry()
   * @generated
   */
  int DICTIONARY_ENTRY = 9;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__CACHED = ABSTRACT_ENTRY__CACHED;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__REQUIRED = ABSTRACT_ENTRY__REQUIRED;

  /**
   * The feature id for the '<em><b>Indirect Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__INDIRECT_REFERENCE = ABSTRACT_ENTRY__INDIRECT_REFERENCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__VALUE = ABSTRACT_ENTRY__VALUE;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__SINCE = ABSTRACT_ENTRY__SINCE;

  /**
   * The feature id for the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__REQUIRES_CUSTOM_VALIDATION = ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION;

  /**
   * The feature id for the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__REQUIRES_CUSTOM_DEFAULT = ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__KEY = ABSTRACT_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__ALIAS = ABSTRACT_ENTRY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inheritable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__INHERITABLE = ABSTRACT_ENTRY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dictionary Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY_FEATURE_COUNT = ABSTRACT_ENTRY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PackageDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl <em>Bit Flags Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsDeclaration()
   * @generated
   */
  int BIT_FLAGS_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION__SINCE = ABSTRACT_DECLARATION__SINCE;

  /**
   * The feature id for the '<em><b>Specification Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION__DECLARATIONS = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bit Flags Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl <em>Bit Flags Declaration Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsDeclarationPart()
   * @generated
   */
  int BIT_FLAGS_DECLARATION_PART = 12;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION_PART__INDEX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION_PART__NAME = 1;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION_PART__SINCE = 2;

  /**
   * The number of structural features of the '<em>Bit Flags Declaration Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_DECLARATION_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationImpl <em>Name Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumDeclaration()
   * @generated
   */
  int NAME_ENUM_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION__SINCE = ABSTRACT_DECLARATION__SINCE;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION__DECLARATIONS = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl <em>Name Enum Declaration Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumDeclarationPart()
   * @generated
   */
  int NAME_ENUM_DECLARATION_PART = 14;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION_PART__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION_PART__ALIAS = 1;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION_PART__SINCE = 2;

  /**
   * The number of structural features of the '<em>Name Enum Declaration Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_DECLARATION_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryValueImpl <em>Abstract Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractEntryValue()
   * @generated
   */
  int ABSTRACT_ENTRY_VALUE = 15;

  /**
   * The number of structural features of the '<em>Abstract Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTRY_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NullObjectEntryValueImpl <em>Null Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NullObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNullObjectEntryValue()
   * @generated
   */
  int NULL_OBJECT_ENTRY_VALUE = 16;

  /**
   * The number of structural features of the '<em>Null Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameObjectEntryValueImpl <em>Name Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameObjectEntryValue()
   * @generated
   */
  int NAME_OBJECT_ENTRY_VALUE = 17;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OBJECT_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OBJECT_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Name Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl <em>Number Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberObjectEntryValue()
   * @generated
   */
  int NUMBER_OBJECT_ENTRY_VALUE = 18;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE__RULE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Number Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValidationRuleImpl <em>Number Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValidationRule()
   * @generated
   */
  int NUMBER_VALIDATION_RULE = 19;

  /**
   * The number of structural features of the '<em>Number Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALIDATION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberInclusiveRangeValidationRuleImpl <em>Number Inclusive Range Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberInclusiveRangeValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberInclusiveRangeValidationRule()
   * @generated
   */
  int NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE = 20;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Inclusive Range Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE_FEATURE_COUNT = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterValidationRuleImpl <em>Number Greater Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberGreaterValidationRule()
   * @generated
   */
  int NUMBER_GREATER_VALIDATION_RULE = 21;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GREATER_VALIDATION_RULE__MIN_VALUE = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Greater Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GREATER_VALIDATION_RULE_FEATURE_COUNT = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterEqualsValidationRuleImpl <em>Number Greater Equals Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterEqualsValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberGreaterEqualsValidationRule()
   * @generated
   */
  int NUMBER_GREATER_EQUALS_VALIDATION_RULE = 22;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Greater Equals Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GREATER_EQUALS_VALIDATION_RULE_FEATURE_COUNT = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleImpl <em>Number Values Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValuesValidationRule()
   * @generated
   */
  int NUMBER_VALUES_VALIDATION_RULE = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUES_VALIDATION_RULE__VALUE = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Values Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUES_VALIDATION_RULE_FEATURE_COUNT = NUMBER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleEntryImpl <em>Number Values Validation Rule Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleEntryImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValuesValidationRuleEntry()
   * @generated
   */
  int NUMBER_VALUES_VALIDATION_RULE_ENTRY = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUES_VALIDATION_RULE_ENTRY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUES_VALIDATION_RULE_ENTRY__SINCE = 1;

  /**
   * The number of structural features of the '<em>Number Values Validation Rule Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUES_VALIDATION_RULE_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl <em>Integer Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerObjectEntryValue()
   * @generated
   */
  int INTEGER_OBJECT_ENTRY_VALUE = 25;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE__RULE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Integer Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValidationRuleImpl <em>Integer Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValidationRule()
   * @generated
   */
  int INTEGER_VALIDATION_RULE = 26;

  /**
   * The number of structural features of the '<em>Integer Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALIDATION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl <em>Integer Inclusive Range Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerInclusiveRangeValidationRule()
   * @generated
   */
  int INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE = 27;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Inclusive Range Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE_FEATURE_COUNT = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleImpl <em>Integer Values Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValuesValidationRule()
   * @generated
   */
  int INTEGER_VALUES_VALIDATION_RULE = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUES_VALIDATION_RULE__VALUE = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Values Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUES_VALIDATION_RULE_FEATURE_COUNT = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterValidationRuleImpl <em>Integer Greater Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerGreaterValidationRule()
   * @generated
   */
  int INTEGER_GREATER_VALIDATION_RULE = 29;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Greater Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_GREATER_VALIDATION_RULE_FEATURE_COUNT = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterEqualsValidationRuleImpl <em>Integer Greater Equals Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterEqualsValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerGreaterEqualsValidationRule()
   * @generated
   */
  int INTEGER_GREATER_EQUALS_VALIDATION_RULE = 30;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Greater Equals Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_GREATER_EQUALS_VALIDATION_RULE_FEATURE_COUNT = INTEGER_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl <em>Integer Values Validation Rule Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValuesValidationRuleEntry()
   * @generated
   */
  int INTEGER_VALUES_VALIDATION_RULE_ENTRY = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE = 1;

  /**
   * The number of structural features of the '<em>Integer Values Validation Rule Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUES_VALIDATION_RULE_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealObjectEntryValueImpl <em>Real Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getRealObjectEntryValue()
   * @generated
   */
  int REAL_OBJECT_ENTRY_VALUE = 32;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_OBJECT_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_OBJECT_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Real Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameTreeEntryValueImpl <em>Name Tree Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameTreeEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameTreeEntryValue()
   * @generated
   */
  int NAME_TREE_ENTRY_VALUE = 33;

  /**
   * The number of structural features of the '<em>Name Tree Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TREE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberTreeEntryValueImpl <em>Number Tree Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberTreeEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberTreeEntryValue()
   * @generated
   */
  int NUMBER_TREE_ENTRY_VALUE = 34;

  /**
   * The number of structural features of the '<em>Number Tree Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TREE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl <em>Array Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayEntryValue()
   * @generated
   */
  int ARRAY_ENTRY_VALUE = 35;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE__RULE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indirect Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE__TYPE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Array Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayValidationRuleImpl <em>Array Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayValidationRule()
   * @generated
   */
  int ARRAY_VALIDATION_RULE = 36;

  /**
   * The number of structural features of the '<em>Array Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALIDATION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayLengthValidationRuleImpl <em>Array Length Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayLengthValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayLengthValidationRule()
   * @generated
   */
  int ARRAY_LENGTH_VALIDATION_RULE = 37;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LENGTH_VALIDATION_RULE__LENGTH = ARRAY_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Length Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LENGTH_VALIDATION_RULE_FEATURE_COUNT = ARRAY_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ObjectEntryValueImpl <em>Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getObjectEntryValue()
   * @generated
   */
  int OBJECT_ENTRY_VALUE = 38;

  /**
   * The number of structural features of the '<em>Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl <em>Mapping Dict Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getMappingDictEntryValue()
   * @generated
   */
  int MAPPING_DICT_ENTRY_VALUE = 39;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DICT_ENTRY_VALUE__TYPE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Requires Custom Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Requires Custom Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mapping Dict Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DICT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl <em>String Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringEntryValue()
   * @generated
   */
  int STRING_ENTRY_VALUE = 40;

  /**
   * The feature id for the '<em><b>Text String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ENTRY_VALUE__TEXT_STRING = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ascii String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ENTRY_VALUE__ASCII_STRING = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Byte String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ENTRY_VALUE__BYTE_STRING = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ENTRY_VALUE__RULE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>String Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringValidationRuleImpl <em>String Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringValidationRule()
   * @generated
   */
  int STRING_VALIDATION_RULE = 41;

  /**
   * The number of structural features of the '<em>String Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALIDATION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringLengthValidationRuleImpl <em>String Length Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringLengthValidationRuleImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringLengthValidationRule()
   * @generated
   */
  int STRING_LENGTH_VALIDATION_RULE = 42;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LENGTH_VALIDATION_RULE__LENGTH = STRING_VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Length Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LENGTH_VALIDATION_RULE_FEATURE_COUNT = STRING_VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AlternativeEntryValueImpl <em>Alternative Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AlternativeEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAlternativeEntryValue()
   * @generated
   */
  int ALTERNATIVE_ENTRY_VALUE = 43;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_ENTRY_VALUE__OPTIONS = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl <em>Boolean Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBooleanEntryValue()
   * @generated
   */
  int BOOLEAN_ENTRY_VALUE = 44;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Boolean Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ReferenceEntryValueImpl <em>Reference Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ReferenceEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getReferenceEntryValue()
   * @generated
   */
  int REFERENCE_ENTRY_VALUE = 45;

  /**
   * The number of structural features of the '<em>Reference Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ParentReferenceEntryValueImpl <em>Parent Reference Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ParentReferenceEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getParentReferenceEntryValue()
   * @generated
   */
  int PARENT_REFERENCE_ENTRY_VALUE = 46;

  /**
   * The feature id for the '<em><b>Parent Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parent Reference Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_REFERENCE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryObjectEntryValueImpl <em>Dictionary Object Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryObjectEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryObjectEntryValue()
   * @generated
   */
  int DICTIONARY_OBJECT_ENTRY_VALUE = 47;

  /**
   * The number of structural features of the '<em>Dictionary Object Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_OBJECT_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationEntryValueImpl <em>Dictionary Declaration Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryDeclarationEntryValue()
   * @generated
   */
  int DICTIONARY_DECLARATION_ENTRY_VALUE = 48;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION_ENTRY_VALUE__TARGET = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dictionary Declaration Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_DECLARATION_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryValueImpl <em>Array Mapped Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedEntryValue()
   * @generated
   */
  int ARRAY_MAPPED_ENTRY_VALUE = 49;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY_VALUE__TARGET = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Mapped Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_MAPPED_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsEntryValueImpl <em>Bit Flags Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsEntryValue()
   * @generated
   */
  int BIT_FLAGS_ENTRY_VALUE = 50;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_ENTRY_VALUE__TARGET = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bit Flags Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FLAGS_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DateEntryValueImpl <em>Date Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DateEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDateEntryValue()
   * @generated
   */
  int DATE_ENTRY_VALUE = 51;

  /**
   * The number of structural features of the '<em>Date Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumEntryValueImpl <em>Name Enum Entry Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumEntryValueImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumEntryValue()
   * @generated
   */
  int NAME_ENUM_ENTRY_VALUE = 52;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE__TARGET = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Must Be</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE__HAS_MUST_BE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Required Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE__REQUIRED_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE__HAS_DEFAULT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE__DEFAULT_VALUE = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Name Enum Entry Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_ENUM_ENTRY_VALUE_FEATURE_COUNT = ABSTRACT_ENTRY_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberLiteralImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 53;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntLiteralImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealLiteralImpl
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference <em>Indirect Reference</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIndirectReference()
   * @generated
   */
  int INDIRECT_REFERENCE = 56;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion <em>Since Version</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSinceVersion()
   * @generated
   */
  int SINCE_VERSION = 57;

  /**
   * The meta object id for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool <em>Bool</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBool()
   * @generated
   */
  int BOOL = 58;


  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel <em>PDF Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PDF Model</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel
   * @generated
   */
  EClass getPDFModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel#getPackages()
   * @see #getPDFModel()
   * @generated
   */
  EReference getPDFModel_Packages();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration#getName()
   * @see #getAbstractDeclaration()
   * @generated
   */
  EAttribute getAbstractDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration#getSince()
   * @see #getAbstractDeclaration()
   * @generated
   */
  EAttribute getAbstractDeclaration_Since();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference <em>Specification Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference
   * @generated
   */
  EClass getSpecificationReference();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Section</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference#getSection()
   * @see #getSpecificationReference()
   * @generated
   */
  EReference getSpecificationReference_Section();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference#getTable()
   * @see #getSpecificationReference()
   * @generated
   */
  EAttribute getSpecificationReference_Table();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference <em>Section Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference
   * @generated
   */
  EClass getSectionReference();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference#getSection()
   * @see #getSectionReference()
   * @generated
   */
  EAttribute getSectionReference_Section();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration <em>Array Mapped Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Mapped Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration
   * @generated
   */
  EClass getArrayMappedDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration#getEntries()
   * @see #getArrayMappedDeclaration()
   * @generated
   */
  EReference getArrayMappedDeclaration_Entries();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry <em>Abstract Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entry</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry
   * @generated
   */
  EClass getAbstractEntry();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isCached <em>Cached</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cached</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isCached()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_Cached();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequired()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_Required();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getIndirectReference <em>Indirect Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Indirect Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getIndirectReference()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_IndirectReference();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getValue()
   * @see #getAbstractEntry()
   * @generated
   */
  EReference getAbstractEntry_Value();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#getSince()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_Since();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomValidation <em>Requires Custom Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Validation</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomValidation()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_RequiresCustomValidation();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomDefault <em>Requires Custom Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry#isRequiresCustomDefault()
   * @see #getAbstractEntry()
   * @generated
   */
  EAttribute getAbstractEntry_RequiresCustomDefault();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry <em>Array Mapped Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Mapped Entry</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry
   * @generated
   */
  EClass getArrayMappedEntry();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#getIndex()
   * @see #getArrayMappedEntry()
   * @generated
   */
  EAttribute getArrayMappedEntry_Index();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#getName()
   * @see #getArrayMappedEntry()
   * @generated
   */
  EAttribute getArrayMappedEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry#isNullable()
   * @see #getArrayMappedEntry()
   * @generated
   */
  EAttribute getArrayMappedEntry_Nullable();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration <em>Dictionary Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration
   * @generated
   */
  EClass getDictionaryDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#isStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stream</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#isStream()
   * @see #getDictionaryDeclaration()
   * @generated
   */
  EAttribute getDictionaryDeclaration_Stream();

  /**
   * Returns the meta object for the reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Types</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSuperTypes()
   * @see #getDictionaryDeclaration()
   * @generated
   */
  EReference getDictionaryDeclaration_SuperTypes();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSubtypeConfig <em>Subtype Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Config</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getSubtypeConfig()
   * @see #getDictionaryDeclaration()
   * @generated
   */
  EReference getDictionaryDeclaration_SubtypeConfig();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration#getEntries()
   * @see #getDictionaryDeclaration()
   * @generated
   */
  EReference getDictionaryDeclaration_Entries();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig <em>Subtype Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtype Config</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig
   * @generated
   */
  EClass getSubtypeConfig();

  /**
   * Returns the meta object for the reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig#getCandidates <em>Candidates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Candidates</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig#getCandidates()
   * @see #getSubtypeConfig()
   * @generated
   */
  EReference getSubtypeConfig_Candidates();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry <em>Dictionary Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary Entry</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry
   * @generated
   */
  EClass getDictionaryEntry();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getKey()
   * @see #getDictionaryEntry()
   * @generated
   */
  EAttribute getDictionaryEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#getAlias()
   * @see #getDictionaryEntry()
   * @generated
   */
  EAttribute getDictionaryEntry_Alias();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#isInheritable <em>Inheritable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inheritable</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry#isInheritable()
   * @see #getDictionaryEntry()
   * @generated
   */
  EAttribute getDictionaryEntry_Inheritable();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration <em>Bit Flags Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Flags Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration
   * @generated
   */
  EClass getBitFlagsDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getSpecificationReference <em>Specification Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specification Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getSpecificationReference()
   * @see #getBitFlagsDeclaration()
   * @generated
   */
  EReference getBitFlagsDeclaration_SpecificationReference();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration#getDeclarations()
   * @see #getBitFlagsDeclaration()
   * @generated
   */
  EReference getBitFlagsDeclaration_Declarations();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart <em>Bit Flags Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Flags Declaration Part</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart
   * @generated
   */
  EClass getBitFlagsDeclarationPart();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getIndex()
   * @see #getBitFlagsDeclarationPart()
   * @generated
   */
  EAttribute getBitFlagsDeclarationPart_Index();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getName()
   * @see #getBitFlagsDeclarationPart()
   * @generated
   */
  EAttribute getBitFlagsDeclarationPart_Name();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart#getSince()
   * @see #getBitFlagsDeclarationPart()
   * @generated
   */
  EAttribute getBitFlagsDeclarationPart_Since();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration <em>Name Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Enum Declaration</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration
   * @generated
   */
  EClass getNameEnumDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration#getDeclarations()
   * @see #getNameEnumDeclaration()
   * @generated
   */
  EReference getNameEnumDeclaration_Declarations();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart <em>Name Enum Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Enum Declaration Part</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart
   * @generated
   */
  EClass getNameEnumDeclarationPart();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getConstant()
   * @see #getNameEnumDeclarationPart()
   * @generated
   */
  EAttribute getNameEnumDeclarationPart_Constant();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getAlias()
   * @see #getNameEnumDeclarationPart()
   * @generated
   */
  EAttribute getNameEnumDeclarationPart_Alias();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart#getSince()
   * @see #getNameEnumDeclarationPart()
   * @generated
   */
  EAttribute getNameEnumDeclarationPart_Since();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue <em>Abstract Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue
   * @generated
   */
  EClass getAbstractEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NullObjectEntryValue <em>Null Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NullObjectEntryValue
   * @generated
   */
  EClass getNullObjectEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue <em>Name Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue
   * @generated
   */
  EClass getNameObjectEntryValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#isHasMustBe()
   * @see #getNameObjectEntryValue()
   * @generated
   */
  EAttribute getNameObjectEntryValue_HasMustBe();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#getRequiredValue()
   * @see #getNameObjectEntryValue()
   * @generated
   */
  EAttribute getNameObjectEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#isHasDefault()
   * @see #getNameObjectEntryValue()
   * @generated
   */
  EAttribute getNameObjectEntryValue_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue#getDefaultValue()
   * @see #getNameObjectEntryValue()
   * @generated
   */
  EAttribute getNameObjectEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue <em>Number Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue
   * @generated
   */
  EClass getNumberObjectEntryValue();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getRule()
   * @see #getNumberObjectEntryValue()
   * @generated
   */
  EReference getNumberObjectEntryValue_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#isHasMustBe()
   * @see #getNumberObjectEntryValue()
   * @generated
   */
  EAttribute getNumberObjectEntryValue_HasMustBe();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getRequiredValue()
   * @see #getNumberObjectEntryValue()
   * @generated
   */
  EReference getNumberObjectEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#isHasDefault()
   * @see #getNumberObjectEntryValue()
   * @generated
   */
  EAttribute getNumberObjectEntryValue_HasDefault();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue#getDefaultValue()
   * @see #getNumberObjectEntryValue()
   * @generated
   */
  EReference getNumberObjectEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule <em>Number Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule
   * @generated
   */
  EClass getNumberValidationRule();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule <em>Number Inclusive Range Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Inclusive Range Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule
   * @generated
   */
  EClass getNumberInclusiveRangeValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule#getLowerBound()
   * @see #getNumberInclusiveRangeValidationRule()
   * @generated
   */
  EReference getNumberInclusiveRangeValidationRule_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule#getUpperBound()
   * @see #getNumberInclusiveRangeValidationRule()
   * @generated
   */
  EReference getNumberInclusiveRangeValidationRule_UpperBound();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule <em>Number Greater Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Greater Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule
   * @generated
   */
  EClass getNumberGreaterValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule#getMinValue()
   * @see #getNumberGreaterValidationRule()
   * @generated
   */
  EReference getNumberGreaterValidationRule_MinValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule <em>Number Greater Equals Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Greater Equals Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule
   * @generated
   */
  EClass getNumberGreaterEqualsValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule#getMinValue()
   * @see #getNumberGreaterEqualsValidationRule()
   * @generated
   */
  EReference getNumberGreaterEqualsValidationRule_MinValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule <em>Number Values Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Values Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule
   * @generated
   */
  EClass getNumberValuesValidationRule();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule#getValue()
   * @see #getNumberValuesValidationRule()
   * @generated
   */
  EReference getNumberValuesValidationRule_Value();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry <em>Number Values Validation Rule Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Values Validation Rule Entry</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry
   * @generated
   */
  EClass getNumberValuesValidationRuleEntry();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry#getValue()
   * @see #getNumberValuesValidationRuleEntry()
   * @generated
   */
  EReference getNumberValuesValidationRuleEntry_Value();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry#getSince()
   * @see #getNumberValuesValidationRuleEntry()
   * @generated
   */
  EAttribute getNumberValuesValidationRuleEntry_Since();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue <em>Integer Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue
   * @generated
   */
  EClass getIntegerObjectEntryValue();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRule()
   * @see #getIntegerObjectEntryValue()
   * @generated
   */
  EReference getIntegerObjectEntryValue_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasMustBe()
   * @see #getIntegerObjectEntryValue()
   * @generated
   */
  EAttribute getIntegerObjectEntryValue_HasMustBe();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getRequiredValue()
   * @see #getIntegerObjectEntryValue()
   * @generated
   */
  EReference getIntegerObjectEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#isHasDefault()
   * @see #getIntegerObjectEntryValue()
   * @generated
   */
  EAttribute getIntegerObjectEntryValue_HasDefault();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue#getDefaultValue()
   * @see #getIntegerObjectEntryValue()
   * @generated
   */
  EReference getIntegerObjectEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule <em>Integer Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule
   * @generated
   */
  EClass getIntegerValidationRule();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule <em>Integer Inclusive Range Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Inclusive Range Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule
   * @generated
   */
  EClass getIntegerInclusiveRangeValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule#getLowerBound()
   * @see #getIntegerInclusiveRangeValidationRule()
   * @generated
   */
  EReference getIntegerInclusiveRangeValidationRule_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule#getUpperBound()
   * @see #getIntegerInclusiveRangeValidationRule()
   * @generated
   */
  EReference getIntegerInclusiveRangeValidationRule_UpperBound();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule <em>Integer Values Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Values Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule
   * @generated
   */
  EClass getIntegerValuesValidationRule();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule#getValue()
   * @see #getIntegerValuesValidationRule()
   * @generated
   */
  EReference getIntegerValuesValidationRule_Value();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule <em>Integer Greater Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Greater Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule
   * @generated
   */
  EClass getIntegerGreaterValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule#getMinValue()
   * @see #getIntegerGreaterValidationRule()
   * @generated
   */
  EReference getIntegerGreaterValidationRule_MinValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule <em>Integer Greater Equals Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Greater Equals Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule
   * @generated
   */
  EClass getIntegerGreaterEqualsValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule#getMinValue()
   * @see #getIntegerGreaterEqualsValidationRule()
   * @generated
   */
  EReference getIntegerGreaterEqualsValidationRule_MinValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry <em>Integer Values Validation Rule Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Values Validation Rule Entry</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry
   * @generated
   */
  EClass getIntegerValuesValidationRuleEntry();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getValue()
   * @see #getIntegerValuesValidationRuleEntry()
   * @generated
   */
  EReference getIntegerValuesValidationRuleEntry_Value();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry#getSince()
   * @see #getIntegerValuesValidationRuleEntry()
   * @generated
   */
  EAttribute getIntegerValuesValidationRuleEntry_Since();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue <em>Real Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue
   * @generated
   */
  EClass getRealObjectEntryValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#isHasMustBe()
   * @see #getRealObjectEntryValue()
   * @generated
   */
  EAttribute getRealObjectEntryValue_HasMustBe();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#getRequiredValue()
   * @see #getRealObjectEntryValue()
   * @generated
   */
  EReference getRealObjectEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#isHasDefault()
   * @see #getRealObjectEntryValue()
   * @generated
   */
  EAttribute getRealObjectEntryValue_HasDefault();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue#getDefaultValue()
   * @see #getRealObjectEntryValue()
   * @generated
   */
  EReference getRealObjectEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameTreeEntryValue <em>Name Tree Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Tree Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameTreeEntryValue
   * @generated
   */
  EClass getNameTreeEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberTreeEntryValue <em>Number Tree Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Tree Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberTreeEntryValue
   * @generated
   */
  EClass getNumberTreeEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue <em>Array Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue
   * @generated
   */
  EClass getArrayEntryValue();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getRule()
   * @see #getArrayEntryValue()
   * @generated
   */
  EReference getArrayEntryValue_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getIndirectReference <em>Indirect Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Indirect Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getIndirectReference()
   * @see #getArrayEntryValue()
   * @generated
   */
  EAttribute getArrayEntryValue_IndirectReference();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#getType()
   * @see #getArrayEntryValue()
   * @generated
   */
  EReference getArrayEntryValue_Type();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Validation</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomValidation()
   * @see #getArrayEntryValue()
   * @generated
   */
  EAttribute getArrayEntryValue_RequiresCustomValidation();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue#isRequiresCustomDefault()
   * @see #getArrayEntryValue()
   * @generated
   */
  EAttribute getArrayEntryValue_RequiresCustomDefault();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule <em>Array Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule
   * @generated
   */
  EClass getArrayValidationRule();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule <em>Array Length Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Length Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule
   * @generated
   */
  EClass getArrayLengthValidationRule();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule#getLength()
   * @see #getArrayLengthValidationRule()
   * @generated
   */
  EAttribute getArrayLengthValidationRule_Length();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ObjectEntryValue <em>Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ObjectEntryValue
   * @generated
   */
  EClass getObjectEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue <em>Mapping Dict Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Dict Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue
   * @generated
   */
  EClass getMappingDictEntryValue();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#getType()
   * @see #getMappingDictEntryValue()
   * @generated
   */
  EReference getMappingDictEntryValue_Type();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomValidation <em>Requires Custom Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Validation</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomValidation()
   * @see #getMappingDictEntryValue()
   * @generated
   */
  EAttribute getMappingDictEntryValue_RequiresCustomValidation();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomDefault <em>Requires Custom Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires Custom Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue#isRequiresCustomDefault()
   * @see #getMappingDictEntryValue()
   * @generated
   */
  EAttribute getMappingDictEntryValue_RequiresCustomDefault();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue <em>String Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue
   * @generated
   */
  EClass getStringEntryValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isTextString <em>Text String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text String</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isTextString()
   * @see #getStringEntryValue()
   * @generated
   */
  EAttribute getStringEntryValue_TextString();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isAsciiString <em>Ascii String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ascii String</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isAsciiString()
   * @see #getStringEntryValue()
   * @generated
   */
  EAttribute getStringEntryValue_AsciiString();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isByteString <em>Byte String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte String</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#isByteString()
   * @see #getStringEntryValue()
   * @generated
   */
  EAttribute getStringEntryValue_ByteString();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue#getRule()
   * @see #getStringEntryValue()
   * @generated
   */
  EReference getStringEntryValue_Rule();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule <em>String Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule
   * @generated
   */
  EClass getStringValidationRule();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule <em>String Length Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Length Validation Rule</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule
   * @generated
   */
  EClass getStringLengthValidationRule();

  /**
   * Returns the meta object for the containment reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule#getLength()
   * @see #getStringLengthValidationRule()
   * @generated
   */
  EReference getStringLengthValidationRule_Length();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue <em>Alternative Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue
   * @generated
   */
  EClass getAlternativeEntryValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue#getOptions()
   * @see #getAlternativeEntryValue()
   * @generated
   */
  EReference getAlternativeEntryValue_Options();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue <em>Boolean Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue
   * @generated
   */
  EClass getBooleanEntryValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasMustBe()
   * @see #getBooleanEntryValue()
   * @generated
   */
  EAttribute getBooleanEntryValue_HasMustBe();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getRequiredValue()
   * @see #getBooleanEntryValue()
   * @generated
   */
  EAttribute getBooleanEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#isHasDefault()
   * @see #getBooleanEntryValue()
   * @generated
   */
  EAttribute getBooleanEntryValue_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue#getDefaultValue()
   * @see #getBooleanEntryValue()
   * @generated
   */
  EAttribute getBooleanEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ReferenceEntryValue <em>Reference Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ReferenceEntryValue
   * @generated
   */
  EClass getReferenceEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue <em>Parent Reference Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Reference Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue
   * @generated
   */
  EClass getParentReferenceEntryValue();

  /**
   * Returns the meta object for the reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue#getParentType <em>Parent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent Type</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue#getParentType()
   * @see #getParentReferenceEntryValue()
   * @generated
   */
  EReference getParentReferenceEntryValue_ParentType();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryObjectEntryValue <em>Dictionary Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary Object Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryObjectEntryValue
   * @generated
   */
  EClass getDictionaryObjectEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue <em>Dictionary Declaration Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary Declaration Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue
   * @generated
   */
  EClass getDictionaryDeclarationEntryValue();

  /**
   * Returns the meta object for the reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue#getTarget()
   * @see #getDictionaryDeclarationEntryValue()
   * @generated
   */
  EReference getDictionaryDeclarationEntryValue_Target();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue <em>Array Mapped Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Mapped Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue
   * @generated
   */
  EClass getArrayMappedEntryValue();

  /**
   * Returns the meta object for the reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue#getTarget()
   * @see #getArrayMappedEntryValue()
   * @generated
   */
  EReference getArrayMappedEntryValue_Target();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue <em>Bit Flags Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Flags Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue
   * @generated
   */
  EClass getBitFlagsEntryValue();

  /**
   * Returns the meta object for the reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue#getTarget()
   * @see #getBitFlagsEntryValue()
   * @generated
   */
  EReference getBitFlagsEntryValue_Target();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DateEntryValue <em>Date Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DateEntryValue
   * @generated
   */
  EClass getDateEntryValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue <em>Name Enum Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Enum Entry Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue
   * @generated
   */
  EClass getNameEnumEntryValue();

  /**
   * Returns the meta object for the reference '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getTarget()
   * @see #getNameEnumEntryValue()
   * @generated
   */
  EReference getNameEnumEntryValue_Target();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#isHasMustBe <em>Has Must Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Must Be</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#isHasMustBe()
   * @see #getNameEnumEntryValue()
   * @generated
   */
  EAttribute getNameEnumEntryValue_HasMustBe();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getRequiredValue <em>Required Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getRequiredValue()
   * @see #getNameEnumEntryValue()
   * @generated
   */
  EAttribute getNameEnumEntryValue_RequiredValue();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#isHasDefault()
   * @see #getNameEnumEntryValue()
   * @generated
   */
  EAttribute getNameEnumEntryValue_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue#getDefaultValue()
   * @see #getNameEnumEntryValue()
   * @generated
   */
  EAttribute getNameEnumEntryValue_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral#getValue()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Value();

  /**
   * Returns the meta object for enum '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference <em>Indirect Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Indirect Reference</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
   * @generated
   */
  EEnum getIndirectReference();

  /**
   * Returns the meta object for enum '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion <em>Since Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Since Version</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
   * @generated
   */
  EEnum getSinceVersion();

  /**
   * Returns the meta object for enum '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Bool</em>'.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
   * @generated
   */
  EEnum getBool();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PdfmodelFactory getPdfmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl <em>PDF Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PDFModelImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getPDFModel()
     * @generated
     */
    EClass PDF_MODEL = eINSTANCE.getPDFModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDF_MODEL__PACKAGES = eINSTANCE.getPDFModel_Packages();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractDeclaration()
     * @generated
     */
    EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DECLARATION__NAME = eINSTANCE.getAbstractDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DECLARATION__SINCE = eINSTANCE.getAbstractDeclaration_Since();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl <em>Specification Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SpecificationReferenceImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSpecificationReference()
     * @generated
     */
    EClass SPECIFICATION_REFERENCE = eINSTANCE.getSpecificationReference();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION_REFERENCE__SECTION = eINSTANCE.getSpecificationReference_Section();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION_REFERENCE__TABLE = eINSTANCE.getSpecificationReference_Table();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SectionReferenceImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSectionReference()
     * @generated
     */
    EClass SECTION_REFERENCE = eINSTANCE.getSectionReference();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION_REFERENCE__SECTION = eINSTANCE.getSectionReference_Section();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedDeclarationImpl <em>Array Mapped Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedDeclaration()
     * @generated
     */
    EClass ARRAY_MAPPED_DECLARATION = eINSTANCE.getArrayMappedDeclaration();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_MAPPED_DECLARATION__ENTRIES = eINSTANCE.getArrayMappedDeclaration_Entries();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl <em>Abstract Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractEntry()
     * @generated
     */
    EClass ABSTRACT_ENTRY = eINSTANCE.getAbstractEntry();

    /**
     * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__CACHED = eINSTANCE.getAbstractEntry_Cached();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__REQUIRED = eINSTANCE.getAbstractEntry_Required();

    /**
     * The meta object literal for the '<em><b>Indirect Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__INDIRECT_REFERENCE = eINSTANCE.getAbstractEntry_IndirectReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTRY__VALUE = eINSTANCE.getAbstractEntry_Value();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__SINCE = eINSTANCE.getAbstractEntry_Since();

    /**
     * The meta object literal for the '<em><b>Requires Custom Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION = eINSTANCE.getAbstractEntry_RequiresCustomValidation();

    /**
     * The meta object literal for the '<em><b>Requires Custom Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT = eINSTANCE.getAbstractEntry_RequiresCustomDefault();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl <em>Array Mapped Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedEntry()
     * @generated
     */
    EClass ARRAY_MAPPED_ENTRY = eINSTANCE.getArrayMappedEntry();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_MAPPED_ENTRY__INDEX = eINSTANCE.getArrayMappedEntry_Index();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_MAPPED_ENTRY__NAME = eINSTANCE.getArrayMappedEntry_Name();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_MAPPED_ENTRY__NULLABLE = eINSTANCE.getArrayMappedEntry_Nullable();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl <em>Dictionary Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryDeclaration()
     * @generated
     */
    EClass DICTIONARY_DECLARATION = eINSTANCE.getDictionaryDeclaration();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DICTIONARY_DECLARATION__STREAM = eINSTANCE.getDictionaryDeclaration_Stream();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_DECLARATION__SUPER_TYPES = eINSTANCE.getDictionaryDeclaration_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Subtype Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_DECLARATION__SUBTYPE_CONFIG = eINSTANCE.getDictionaryDeclaration_SubtypeConfig();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_DECLARATION__ENTRIES = eINSTANCE.getDictionaryDeclaration_Entries();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SubtypeConfigImpl <em>Subtype Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.SubtypeConfigImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSubtypeConfig()
     * @generated
     */
    EClass SUBTYPE_CONFIG = eINSTANCE.getSubtypeConfig();

    /**
     * The meta object literal for the '<em><b>Candidates</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTYPE_CONFIG__CANDIDATES = eINSTANCE.getSubtypeConfig_Candidates();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryEntryImpl <em>Dictionary Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryEntryImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryEntry()
     * @generated
     */
    EClass DICTIONARY_ENTRY = eINSTANCE.getDictionaryEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DICTIONARY_ENTRY__KEY = eINSTANCE.getDictionaryEntry_Key();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DICTIONARY_ENTRY__ALIAS = eINSTANCE.getDictionaryEntry_Alias();

    /**
     * The meta object literal for the '<em><b>Inheritable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DICTIONARY_ENTRY__INHERITABLE = eINSTANCE.getDictionaryEntry_Inheritable();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PackageDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl <em>Bit Flags Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsDeclaration()
     * @generated
     */
    EClass BIT_FLAGS_DECLARATION = eINSTANCE.getBitFlagsDeclaration();

    /**
     * The meta object literal for the '<em><b>Specification Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE = eINSTANCE.getBitFlagsDeclaration_SpecificationReference();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT_FLAGS_DECLARATION__DECLARATIONS = eINSTANCE.getBitFlagsDeclaration_Declarations();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl <em>Bit Flags Declaration Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsDeclarationPartImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsDeclarationPart()
     * @generated
     */
    EClass BIT_FLAGS_DECLARATION_PART = eINSTANCE.getBitFlagsDeclarationPart();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIT_FLAGS_DECLARATION_PART__INDEX = eINSTANCE.getBitFlagsDeclarationPart_Index();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIT_FLAGS_DECLARATION_PART__NAME = eINSTANCE.getBitFlagsDeclarationPart_Name();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIT_FLAGS_DECLARATION_PART__SINCE = eINSTANCE.getBitFlagsDeclarationPart_Since();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationImpl <em>Name Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumDeclaration()
     * @generated
     */
    EClass NAME_ENUM_DECLARATION = eINSTANCE.getNameEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_ENUM_DECLARATION__DECLARATIONS = eINSTANCE.getNameEnumDeclaration_Declarations();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl <em>Name Enum Declaration Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumDeclarationPartImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumDeclarationPart()
     * @generated
     */
    EClass NAME_ENUM_DECLARATION_PART = eINSTANCE.getNameEnumDeclarationPart();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_DECLARATION_PART__CONSTANT = eINSTANCE.getNameEnumDeclarationPart_Constant();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_DECLARATION_PART__ALIAS = eINSTANCE.getNameEnumDeclarationPart_Alias();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_DECLARATION_PART__SINCE = eINSTANCE.getNameEnumDeclarationPart_Since();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryValueImpl <em>Abstract Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AbstractEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAbstractEntryValue()
     * @generated
     */
    EClass ABSTRACT_ENTRY_VALUE = eINSTANCE.getAbstractEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NullObjectEntryValueImpl <em>Null Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NullObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNullObjectEntryValue()
     * @generated
     */
    EClass NULL_OBJECT_ENTRY_VALUE = eINSTANCE.getNullObjectEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameObjectEntryValueImpl <em>Name Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameObjectEntryValue()
     * @generated
     */
    EClass NAME_OBJECT_ENTRY_VALUE = eINSTANCE.getNameObjectEntryValue();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OBJECT_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getNameObjectEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getNameObjectEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OBJECT_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getNameObjectEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getNameObjectEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl <em>Number Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberObjectEntryValue()
     * @generated
     */
    EClass NUMBER_OBJECT_ENTRY_VALUE = eINSTANCE.getNumberObjectEntryValue();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_OBJECT_ENTRY_VALUE__RULE = eINSTANCE.getNumberObjectEntryValue_Rule();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getNumberObjectEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getNumberObjectEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getNumberObjectEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getNumberObjectEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValidationRuleImpl <em>Number Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValidationRule()
     * @generated
     */
    EClass NUMBER_VALIDATION_RULE = eINSTANCE.getNumberValidationRule();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberInclusiveRangeValidationRuleImpl <em>Number Inclusive Range Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberInclusiveRangeValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberInclusiveRangeValidationRule()
     * @generated
     */
    EClass NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE = eINSTANCE.getNumberInclusiveRangeValidationRule();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND = eINSTANCE.getNumberInclusiveRangeValidationRule_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND = eINSTANCE.getNumberInclusiveRangeValidationRule_UpperBound();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterValidationRuleImpl <em>Number Greater Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberGreaterValidationRule()
     * @generated
     */
    EClass NUMBER_GREATER_VALIDATION_RULE = eINSTANCE.getNumberGreaterValidationRule();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_GREATER_VALIDATION_RULE__MIN_VALUE = eINSTANCE.getNumberGreaterValidationRule_MinValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterEqualsValidationRuleImpl <em>Number Greater Equals Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberGreaterEqualsValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberGreaterEqualsValidationRule()
     * @generated
     */
    EClass NUMBER_GREATER_EQUALS_VALIDATION_RULE = eINSTANCE.getNumberGreaterEqualsValidationRule();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE = eINSTANCE.getNumberGreaterEqualsValidationRule_MinValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleImpl <em>Number Values Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValuesValidationRule()
     * @generated
     */
    EClass NUMBER_VALUES_VALIDATION_RULE = eINSTANCE.getNumberValuesValidationRule();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_VALUES_VALIDATION_RULE__VALUE = eINSTANCE.getNumberValuesValidationRule_Value();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleEntryImpl <em>Number Values Validation Rule Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberValuesValidationRuleEntryImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberValuesValidationRuleEntry()
     * @generated
     */
    EClass NUMBER_VALUES_VALIDATION_RULE_ENTRY = eINSTANCE.getNumberValuesValidationRuleEntry();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_VALUES_VALIDATION_RULE_ENTRY__VALUE = eINSTANCE.getNumberValuesValidationRuleEntry_Value();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUES_VALIDATION_RULE_ENTRY__SINCE = eINSTANCE.getNumberValuesValidationRuleEntry_Since();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl <em>Integer Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerObjectEntryValue()
     * @generated
     */
    EClass INTEGER_OBJECT_ENTRY_VALUE = eINSTANCE.getIntegerObjectEntryValue();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_OBJECT_ENTRY_VALUE__RULE = eINSTANCE.getIntegerObjectEntryValue_Rule();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getIntegerObjectEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getIntegerObjectEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getIntegerObjectEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getIntegerObjectEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValidationRuleImpl <em>Integer Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValidationRule()
     * @generated
     */
    EClass INTEGER_VALIDATION_RULE = eINSTANCE.getIntegerValidationRule();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl <em>Integer Inclusive Range Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerInclusiveRangeValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerInclusiveRangeValidationRule()
     * @generated
     */
    EClass INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE = eINSTANCE.getIntegerInclusiveRangeValidationRule();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND = eINSTANCE.getIntegerInclusiveRangeValidationRule_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND = eINSTANCE.getIntegerInclusiveRangeValidationRule_UpperBound();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleImpl <em>Integer Values Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValuesValidationRule()
     * @generated
     */
    EClass INTEGER_VALUES_VALIDATION_RULE = eINSTANCE.getIntegerValuesValidationRule();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_VALUES_VALIDATION_RULE__VALUE = eINSTANCE.getIntegerValuesValidationRule_Value();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterValidationRuleImpl <em>Integer Greater Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerGreaterValidationRule()
     * @generated
     */
    EClass INTEGER_GREATER_VALIDATION_RULE = eINSTANCE.getIntegerGreaterValidationRule();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE = eINSTANCE.getIntegerGreaterValidationRule_MinValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterEqualsValidationRuleImpl <em>Integer Greater Equals Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerGreaterEqualsValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerGreaterEqualsValidationRule()
     * @generated
     */
    EClass INTEGER_GREATER_EQUALS_VALIDATION_RULE = eINSTANCE.getIntegerGreaterEqualsValidationRule();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE = eINSTANCE.getIntegerGreaterEqualsValidationRule_MinValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl <em>Integer Values Validation Rule Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntegerValuesValidationRuleEntryImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntegerValuesValidationRuleEntry()
     * @generated
     */
    EClass INTEGER_VALUES_VALIDATION_RULE_ENTRY = eINSTANCE.getIntegerValuesValidationRuleEntry();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE = eINSTANCE.getIntegerValuesValidationRuleEntry_Value();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE = eINSTANCE.getIntegerValuesValidationRuleEntry_Since();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealObjectEntryValueImpl <em>Real Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getRealObjectEntryValue()
     * @generated
     */
    EClass REAL_OBJECT_ENTRY_VALUE = eINSTANCE.getRealObjectEntryValue();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_OBJECT_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getRealObjectEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_OBJECT_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getRealObjectEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_OBJECT_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getRealObjectEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_OBJECT_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getRealObjectEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameTreeEntryValueImpl <em>Name Tree Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameTreeEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameTreeEntryValue()
     * @generated
     */
    EClass NAME_TREE_ENTRY_VALUE = eINSTANCE.getNameTreeEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberTreeEntryValueImpl <em>Number Tree Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberTreeEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberTreeEntryValue()
     * @generated
     */
    EClass NUMBER_TREE_ENTRY_VALUE = eINSTANCE.getNumberTreeEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl <em>Array Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayEntryValue()
     * @generated
     */
    EClass ARRAY_ENTRY_VALUE = eINSTANCE.getArrayEntryValue();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ENTRY_VALUE__RULE = eINSTANCE.getArrayEntryValue_Rule();

    /**
     * The meta object literal for the '<em><b>Indirect Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE = eINSTANCE.getArrayEntryValue_IndirectReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ENTRY_VALUE__TYPE = eINSTANCE.getArrayEntryValue_Type();

    /**
     * The meta object literal for the '<em><b>Requires Custom Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION = eINSTANCE.getArrayEntryValue_RequiresCustomValidation();

    /**
     * The meta object literal for the '<em><b>Requires Custom Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT = eINSTANCE.getArrayEntryValue_RequiresCustomDefault();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayValidationRuleImpl <em>Array Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayValidationRule()
     * @generated
     */
    EClass ARRAY_VALIDATION_RULE = eINSTANCE.getArrayValidationRule();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayLengthValidationRuleImpl <em>Array Length Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayLengthValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayLengthValidationRule()
     * @generated
     */
    EClass ARRAY_LENGTH_VALIDATION_RULE = eINSTANCE.getArrayLengthValidationRule();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_LENGTH_VALIDATION_RULE__LENGTH = eINSTANCE.getArrayLengthValidationRule_Length();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ObjectEntryValueImpl <em>Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getObjectEntryValue()
     * @generated
     */
    EClass OBJECT_ENTRY_VALUE = eINSTANCE.getObjectEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl <em>Mapping Dict Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.MappingDictEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getMappingDictEntryValue()
     * @generated
     */
    EClass MAPPING_DICT_ENTRY_VALUE = eINSTANCE.getMappingDictEntryValue();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DICT_ENTRY_VALUE__TYPE = eINSTANCE.getMappingDictEntryValue_Type();

    /**
     * The meta object literal for the '<em><b>Requires Custom Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION = eINSTANCE.getMappingDictEntryValue_RequiresCustomValidation();

    /**
     * The meta object literal for the '<em><b>Requires Custom Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT = eINSTANCE.getMappingDictEntryValue_RequiresCustomDefault();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl <em>String Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringEntryValue()
     * @generated
     */
    EClass STRING_ENTRY_VALUE = eINSTANCE.getStringEntryValue();

    /**
     * The meta object literal for the '<em><b>Text String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ENTRY_VALUE__TEXT_STRING = eINSTANCE.getStringEntryValue_TextString();

    /**
     * The meta object literal for the '<em><b>Ascii String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ENTRY_VALUE__ASCII_STRING = eINSTANCE.getStringEntryValue_AsciiString();

    /**
     * The meta object literal for the '<em><b>Byte String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ENTRY_VALUE__BYTE_STRING = eINSTANCE.getStringEntryValue_ByteString();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ENTRY_VALUE__RULE = eINSTANCE.getStringEntryValue_Rule();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringValidationRuleImpl <em>String Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringValidationRule()
     * @generated
     */
    EClass STRING_VALIDATION_RULE = eINSTANCE.getStringValidationRule();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringLengthValidationRuleImpl <em>String Length Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.StringLengthValidationRuleImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getStringLengthValidationRule()
     * @generated
     */
    EClass STRING_LENGTH_VALIDATION_RULE = eINSTANCE.getStringLengthValidationRule();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_LENGTH_VALIDATION_RULE__LENGTH = eINSTANCE.getStringLengthValidationRule_Length();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AlternativeEntryValueImpl <em>Alternative Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.AlternativeEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getAlternativeEntryValue()
     * @generated
     */
    EClass ALTERNATIVE_ENTRY_VALUE = eINSTANCE.getAlternativeEntryValue();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE_ENTRY_VALUE__OPTIONS = eINSTANCE.getAlternativeEntryValue_Options();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl <em>Boolean Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BooleanEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBooleanEntryValue()
     * @generated
     */
    EClass BOOLEAN_ENTRY_VALUE = eINSTANCE.getBooleanEntryValue();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getBooleanEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getBooleanEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getBooleanEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getBooleanEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ReferenceEntryValueImpl <em>Reference Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ReferenceEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getReferenceEntryValue()
     * @generated
     */
    EClass REFERENCE_ENTRY_VALUE = eINSTANCE.getReferenceEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ParentReferenceEntryValueImpl <em>Parent Reference Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ParentReferenceEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getParentReferenceEntryValue()
     * @generated
     */
    EClass PARENT_REFERENCE_ENTRY_VALUE = eINSTANCE.getParentReferenceEntryValue();

    /**
     * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE = eINSTANCE.getParentReferenceEntryValue_ParentType();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryObjectEntryValueImpl <em>Dictionary Object Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryObjectEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryObjectEntryValue()
     * @generated
     */
    EClass DICTIONARY_OBJECT_ENTRY_VALUE = eINSTANCE.getDictionaryObjectEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationEntryValueImpl <em>Dictionary Declaration Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DictionaryDeclarationEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDictionaryDeclarationEntryValue()
     * @generated
     */
    EClass DICTIONARY_DECLARATION_ENTRY_VALUE = eINSTANCE.getDictionaryDeclarationEntryValue();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_DECLARATION_ENTRY_VALUE__TARGET = eINSTANCE.getDictionaryDeclarationEntryValue_Target();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryValueImpl <em>Array Mapped Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.ArrayMappedEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getArrayMappedEntryValue()
     * @generated
     */
    EClass ARRAY_MAPPED_ENTRY_VALUE = eINSTANCE.getArrayMappedEntryValue();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_MAPPED_ENTRY_VALUE__TARGET = eINSTANCE.getArrayMappedEntryValue_Target();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsEntryValueImpl <em>Bit Flags Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.BitFlagsEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBitFlagsEntryValue()
     * @generated
     */
    EClass BIT_FLAGS_ENTRY_VALUE = eINSTANCE.getBitFlagsEntryValue();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT_FLAGS_ENTRY_VALUE__TARGET = eINSTANCE.getBitFlagsEntryValue_Target();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DateEntryValueImpl <em>Date Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.DateEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getDateEntryValue()
     * @generated
     */
    EClass DATE_ENTRY_VALUE = eINSTANCE.getDateEntryValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumEntryValueImpl <em>Name Enum Entry Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NameEnumEntryValueImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNameEnumEntryValue()
     * @generated
     */
    EClass NAME_ENUM_ENTRY_VALUE = eINSTANCE.getNameEnumEntryValue();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_ENUM_ENTRY_VALUE__TARGET = eINSTANCE.getNameEnumEntryValue_Target();

    /**
     * The meta object literal for the '<em><b>Has Must Be</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_ENTRY_VALUE__HAS_MUST_BE = eINSTANCE.getNameEnumEntryValue_HasMustBe();

    /**
     * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_ENTRY_VALUE__REQUIRED_VALUE = eINSTANCE.getNameEnumEntryValue_RequiredValue();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_ENTRY_VALUE__HAS_DEFAULT = eINSTANCE.getNameEnumEntryValue_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_ENUM_ENTRY_VALUE__DEFAULT_VALUE = eINSTANCE.getNameEnumEntryValue_DefaultValue();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.NumberLiteralImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.IntLiteralImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.RealLiteralImpl
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference <em>Indirect Reference</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getIndirectReference()
     * @generated
     */
    EEnum INDIRECT_REFERENCE = eINSTANCE.getIndirectReference();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion <em>Since Version</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getSinceVersion()
     * @generated
     */
    EEnum SINCE_VERSION = eINSTANCE.getSinceVersion();

    /**
     * The meta object literal for the '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool <em>Bool</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool
     * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelPackageImpl#getBool()
     * @generated
     */
    EEnum BOOL = eINSTANCE.getBool();

  }

} //PdfmodelPackage
