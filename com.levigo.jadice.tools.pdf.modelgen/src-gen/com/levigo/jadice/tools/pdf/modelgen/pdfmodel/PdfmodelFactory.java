/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage
 * @generated
 */
public interface PdfmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdfmodelFactory eINSTANCE = com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.PdfmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PDF Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PDF Model</em>'.
   * @generated
   */
  PDFModel createPDFModel();

  /**
   * Returns a new object of class '<em>Abstract Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Declaration</em>'.
   * @generated
   */
  AbstractDeclaration createAbstractDeclaration();

  /**
   * Returns a new object of class '<em>Specification Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification Reference</em>'.
   * @generated
   */
  SpecificationReference createSpecificationReference();

  /**
   * Returns a new object of class '<em>Section Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section Reference</em>'.
   * @generated
   */
  SectionReference createSectionReference();

  /**
   * Returns a new object of class '<em>Array Mapped Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Mapped Declaration</em>'.
   * @generated
   */
  ArrayMappedDeclaration createArrayMappedDeclaration();

  /**
   * Returns a new object of class '<em>Abstract Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Entry</em>'.
   * @generated
   */
  AbstractEntry createAbstractEntry();

  /**
   * Returns a new object of class '<em>Array Mapped Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Mapped Entry</em>'.
   * @generated
   */
  ArrayMappedEntry createArrayMappedEntry();

  /**
   * Returns a new object of class '<em>Dictionary Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Declaration</em>'.
   * @generated
   */
  DictionaryDeclaration createDictionaryDeclaration();

  /**
   * Returns a new object of class '<em>Subtype Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtype Config</em>'.
   * @generated
   */
  SubtypeConfig createSubtypeConfig();

  /**
   * Returns a new object of class '<em>Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Entry</em>'.
   * @generated
   */
  DictionaryEntry createDictionaryEntry();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Bit Flags Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Flags Declaration</em>'.
   * @generated
   */
  BitFlagsDeclaration createBitFlagsDeclaration();

  /**
   * Returns a new object of class '<em>Bit Flags Declaration Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Flags Declaration Part</em>'.
   * @generated
   */
  BitFlagsDeclarationPart createBitFlagsDeclarationPart();

  /**
   * Returns a new object of class '<em>Name Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Enum Declaration</em>'.
   * @generated
   */
  NameEnumDeclaration createNameEnumDeclaration();

  /**
   * Returns a new object of class '<em>Name Enum Declaration Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Enum Declaration Part</em>'.
   * @generated
   */
  NameEnumDeclarationPart createNameEnumDeclarationPart();

  /**
   * Returns a new object of class '<em>Abstract Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Entry Value</em>'.
   * @generated
   */
  AbstractEntryValue createAbstractEntryValue();

  /**
   * Returns a new object of class '<em>Null Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Object Entry Value</em>'.
   * @generated
   */
  NullObjectEntryValue createNullObjectEntryValue();

  /**
   * Returns a new object of class '<em>Name Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Object Entry Value</em>'.
   * @generated
   */
  NameObjectEntryValue createNameObjectEntryValue();

  /**
   * Returns a new object of class '<em>Number Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Object Entry Value</em>'.
   * @generated
   */
  NumberObjectEntryValue createNumberObjectEntryValue();

  /**
   * Returns a new object of class '<em>Number Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Validation Rule</em>'.
   * @generated
   */
  NumberValidationRule createNumberValidationRule();

  /**
   * Returns a new object of class '<em>Number Inclusive Range Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Inclusive Range Validation Rule</em>'.
   * @generated
   */
  NumberInclusiveRangeValidationRule createNumberInclusiveRangeValidationRule();

  /**
   * Returns a new object of class '<em>Number Greater Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Greater Validation Rule</em>'.
   * @generated
   */
  NumberGreaterValidationRule createNumberGreaterValidationRule();

  /**
   * Returns a new object of class '<em>Number Greater Equals Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Greater Equals Validation Rule</em>'.
   * @generated
   */
  NumberGreaterEqualsValidationRule createNumberGreaterEqualsValidationRule();

  /**
   * Returns a new object of class '<em>Number Values Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Values Validation Rule</em>'.
   * @generated
   */
  NumberValuesValidationRule createNumberValuesValidationRule();

  /**
   * Returns a new object of class '<em>Number Values Validation Rule Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Values Validation Rule Entry</em>'.
   * @generated
   */
  NumberValuesValidationRuleEntry createNumberValuesValidationRuleEntry();

  /**
   * Returns a new object of class '<em>Integer Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Object Entry Value</em>'.
   * @generated
   */
  IntegerObjectEntryValue createIntegerObjectEntryValue();

  /**
   * Returns a new object of class '<em>Integer Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Validation Rule</em>'.
   * @generated
   */
  IntegerValidationRule createIntegerValidationRule();

  /**
   * Returns a new object of class '<em>Integer Inclusive Range Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Inclusive Range Validation Rule</em>'.
   * @generated
   */
  IntegerInclusiveRangeValidationRule createIntegerInclusiveRangeValidationRule();

  /**
   * Returns a new object of class '<em>Integer Values Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Values Validation Rule</em>'.
   * @generated
   */
  IntegerValuesValidationRule createIntegerValuesValidationRule();

  /**
   * Returns a new object of class '<em>Integer Greater Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Greater Validation Rule</em>'.
   * @generated
   */
  IntegerGreaterValidationRule createIntegerGreaterValidationRule();

  /**
   * Returns a new object of class '<em>Integer Greater Equals Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Greater Equals Validation Rule</em>'.
   * @generated
   */
  IntegerGreaterEqualsValidationRule createIntegerGreaterEqualsValidationRule();

  /**
   * Returns a new object of class '<em>Integer Values Validation Rule Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Values Validation Rule Entry</em>'.
   * @generated
   */
  IntegerValuesValidationRuleEntry createIntegerValuesValidationRuleEntry();

  /**
   * Returns a new object of class '<em>Real Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Object Entry Value</em>'.
   * @generated
   */
  RealObjectEntryValue createRealObjectEntryValue();

  /**
   * Returns a new object of class '<em>Name Tree Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Tree Entry Value</em>'.
   * @generated
   */
  NameTreeEntryValue createNameTreeEntryValue();

  /**
   * Returns a new object of class '<em>Number Tree Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Tree Entry Value</em>'.
   * @generated
   */
  NumberTreeEntryValue createNumberTreeEntryValue();

  /**
   * Returns a new object of class '<em>Array Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Entry Value</em>'.
   * @generated
   */
  ArrayEntryValue createArrayEntryValue();

  /**
   * Returns a new object of class '<em>Array Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Validation Rule</em>'.
   * @generated
   */
  ArrayValidationRule createArrayValidationRule();

  /**
   * Returns a new object of class '<em>Array Length Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Length Validation Rule</em>'.
   * @generated
   */
  ArrayLengthValidationRule createArrayLengthValidationRule();

  /**
   * Returns a new object of class '<em>Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Entry Value</em>'.
   * @generated
   */
  ObjectEntryValue createObjectEntryValue();

  /**
   * Returns a new object of class '<em>Mapping Dict Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Dict Entry Value</em>'.
   * @generated
   */
  MappingDictEntryValue createMappingDictEntryValue();

  /**
   * Returns a new object of class '<em>String Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Entry Value</em>'.
   * @generated
   */
  StringEntryValue createStringEntryValue();

  /**
   * Returns a new object of class '<em>String Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Validation Rule</em>'.
   * @generated
   */
  StringValidationRule createStringValidationRule();

  /**
   * Returns a new object of class '<em>String Length Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Length Validation Rule</em>'.
   * @generated
   */
  StringLengthValidationRule createStringLengthValidationRule();

  /**
   * Returns a new object of class '<em>Alternative Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Entry Value</em>'.
   * @generated
   */
  AlternativeEntryValue createAlternativeEntryValue();

  /**
   * Returns a new object of class '<em>Boolean Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Entry Value</em>'.
   * @generated
   */
  BooleanEntryValue createBooleanEntryValue();

  /**
   * Returns a new object of class '<em>Reference Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Entry Value</em>'.
   * @generated
   */
  ReferenceEntryValue createReferenceEntryValue();

  /**
   * Returns a new object of class '<em>Parent Reference Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Reference Entry Value</em>'.
   * @generated
   */
  ParentReferenceEntryValue createParentReferenceEntryValue();

  /**
   * Returns a new object of class '<em>Dictionary Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Object Entry Value</em>'.
   * @generated
   */
  DictionaryObjectEntryValue createDictionaryObjectEntryValue();

  /**
   * Returns a new object of class '<em>Dictionary Declaration Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Declaration Entry Value</em>'.
   * @generated
   */
  DictionaryDeclarationEntryValue createDictionaryDeclarationEntryValue();

  /**
   * Returns a new object of class '<em>Array Mapped Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Mapped Entry Value</em>'.
   * @generated
   */
  ArrayMappedEntryValue createArrayMappedEntryValue();

  /**
   * Returns a new object of class '<em>Bit Flags Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Flags Entry Value</em>'.
   * @generated
   */
  BitFlagsEntryValue createBitFlagsEntryValue();

  /**
   * Returns a new object of class '<em>Date Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Entry Value</em>'.
   * @generated
   */
  DateEntryValue createDateEntryValue();

  /**
   * Returns a new object of class '<em>Name Enum Entry Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Enum Entry Value</em>'.
   * @generated
   */
  NameEnumEntryValue createNameEnumEntryValue();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PdfmodelPackage getPdfmodelPackage();

} //PdfmodelFactory
