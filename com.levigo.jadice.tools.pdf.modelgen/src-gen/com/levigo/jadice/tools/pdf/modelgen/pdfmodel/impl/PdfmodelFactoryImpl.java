/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdfmodelFactoryImpl extends EFactoryImpl implements PdfmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PdfmodelFactory init()
  {
    try
    {
      PdfmodelFactory thePdfmodelFactory = (PdfmodelFactory)EPackage.Registry.INSTANCE.getEFactory(PdfmodelPackage.eNS_URI);
      if (thePdfmodelFactory != null)
      {
        return thePdfmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PdfmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PdfmodelPackage.PDF_MODEL: return createPDFModel();
      case PdfmodelPackage.MODEL_CONFIG: return createModelConfig();
      case PdfmodelPackage.CORE_TYPES_CONFIG: return createCoreTypesConfig();
      case PdfmodelPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case PdfmodelPackage.SPECIFICATION_REFERENCE: return createSpecificationReference();
      case PdfmodelPackage.SECTION_REFERENCE: return createSectionReference();
      case PdfmodelPackage.ARRAY_MAPPED_DECLARATION: return createArrayMappedDeclaration();
      case PdfmodelPackage.ABSTRACT_ENTRY: return createAbstractEntry();
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY: return createArrayMappedEntry();
      case PdfmodelPackage.DICTIONARY_DECLARATION: return createDictionaryDeclaration();
      case PdfmodelPackage.SUBTYPE_CONFIG: return createSubtypeConfig();
      case PdfmodelPackage.DICTIONARY_ENTRY: return createDictionaryEntry();
      case PdfmodelPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case PdfmodelPackage.BIT_FLAGS_DECLARATION: return createBitFlagsDeclaration();
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART: return createBitFlagsDeclarationPart();
      case PdfmodelPackage.NAME_ENUM_DECLARATION: return createNameEnumDeclaration();
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART: return createNameEnumDeclarationPart();
      case PdfmodelPackage.ABSTRACT_ENTRY_VALUE: return createAbstractEntryValue();
      case PdfmodelPackage.NULL_OBJECT_ENTRY_VALUE: return createNullObjectEntryValue();
      case PdfmodelPackage.NAME_OBJECT_ENTRY_VALUE: return createNameObjectEntryValue();
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE: return createNumberObjectEntryValue();
      case PdfmodelPackage.NUMBER_VALIDATION_RULE: return createNumberValidationRule();
      case PdfmodelPackage.NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE: return createNumberInclusiveRangeValidationRule();
      case PdfmodelPackage.NUMBER_GREATER_VALIDATION_RULE: return createNumberGreaterValidationRule();
      case PdfmodelPackage.NUMBER_GREATER_EQUALS_VALIDATION_RULE: return createNumberGreaterEqualsValidationRule();
      case PdfmodelPackage.NUMBER_VALUES_VALIDATION_RULE: return createNumberValuesValidationRule();
      case PdfmodelPackage.NUMBER_VALUES_VALIDATION_RULE_ENTRY: return createNumberValuesValidationRuleEntry();
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE: return createIntegerObjectEntryValue();
      case PdfmodelPackage.INTEGER_VALIDATION_RULE: return createIntegerValidationRule();
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE: return createIntegerInclusiveRangeValidationRule();
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE: return createIntegerValuesValidationRule();
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE: return createIntegerGreaterValidationRule();
      case PdfmodelPackage.INTEGER_GREATER_EQUALS_VALIDATION_RULE: return createIntegerGreaterEqualsValidationRule();
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY: return createIntegerValuesValidationRuleEntry();
      case PdfmodelPackage.REAL_OBJECT_ENTRY_VALUE: return createRealObjectEntryValue();
      case PdfmodelPackage.NAME_TREE_ENTRY_VALUE: return createNameTreeEntryValue();
      case PdfmodelPackage.NUMBER_TREE_ENTRY_VALUE: return createNumberTreeEntryValue();
      case PdfmodelPackage.ARRAY_ENTRY_VALUE: return createArrayEntryValue();
      case PdfmodelPackage.ARRAY_VALIDATION_RULE: return createArrayValidationRule();
      case PdfmodelPackage.ARRAY_LENGTH_VALIDATION_RULE: return createArrayLengthValidationRule();
      case PdfmodelPackage.OBJECT_ENTRY_VALUE: return createObjectEntryValue();
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE: return createMappingDictEntryValue();
      case PdfmodelPackage.STRING_ENTRY_VALUE: return createStringEntryValue();
      case PdfmodelPackage.STRING_VALIDATION_RULE: return createStringValidationRule();
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE: return createStringLengthValidationRule();
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE: return createAlternativeEntryValue();
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE: return createBooleanEntryValue();
      case PdfmodelPackage.REFERENCE_ENTRY_VALUE: return createReferenceEntryValue();
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE: return createParentReferenceEntryValue();
      case PdfmodelPackage.DICTIONARY_OBJECT_ENTRY_VALUE: return createDictionaryObjectEntryValue();
      case PdfmodelPackage.DICTIONARY_DECLARATION_ENTRY_VALUE: return createDictionaryDeclarationEntryValue();
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE: return createArrayMappedEntryValue();
      case PdfmodelPackage.BIT_FLAGS_ENTRY_VALUE: return createBitFlagsEntryValue();
      case PdfmodelPackage.DATE_ENTRY_VALUE: return createDateEntryValue();
      case PdfmodelPackage.NAME_ENUM_ENTRY_VALUE: return createNameEnumEntryValue();
      case PdfmodelPackage.NUMBER_LITERAL: return createNumberLiteral();
      case PdfmodelPackage.INT_LITERAL: return createIntLiteral();
      case PdfmodelPackage.REAL_LITERAL: return createRealLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PdfmodelPackage.INDIRECT_REFERENCE:
        return createIndirectReferenceFromString(eDataType, initialValue);
      case PdfmodelPackage.SINCE_VERSION:
        return createSinceVersionFromString(eDataType, initialValue);
      case PdfmodelPackage.BOOL:
        return createBoolFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PdfmodelPackage.INDIRECT_REFERENCE:
        return convertIndirectReferenceToString(eDataType, instanceValue);
      case PdfmodelPackage.SINCE_VERSION:
        return convertSinceVersionToString(eDataType, instanceValue);
      case PdfmodelPackage.BOOL:
        return convertBoolToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDFModel createPDFModel()
  {
    PDFModelImpl pdfModel = new PDFModelImpl();
    return pdfModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelConfig createModelConfig()
  {
    ModelConfigImpl modelConfig = new ModelConfigImpl();
    return modelConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreTypesConfig createCoreTypesConfig()
  {
    CoreTypesConfigImpl coreTypesConfig = new CoreTypesConfigImpl();
    return coreTypesConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration createAbstractDeclaration()
  {
    AbstractDeclarationImpl abstractDeclaration = new AbstractDeclarationImpl();
    return abstractDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecificationReference createSpecificationReference()
  {
    SpecificationReferenceImpl specificationReference = new SpecificationReferenceImpl();
    return specificationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionReference createSectionReference()
  {
    SectionReferenceImpl sectionReference = new SectionReferenceImpl();
    return sectionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayMappedDeclaration createArrayMappedDeclaration()
  {
    ArrayMappedDeclarationImpl arrayMappedDeclaration = new ArrayMappedDeclarationImpl();
    return arrayMappedDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntry createAbstractEntry()
  {
    AbstractEntryImpl abstractEntry = new AbstractEntryImpl();
    return abstractEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayMappedEntry createArrayMappedEntry()
  {
    ArrayMappedEntryImpl arrayMappedEntry = new ArrayMappedEntryImpl();
    return arrayMappedEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryDeclaration createDictionaryDeclaration()
  {
    DictionaryDeclarationImpl dictionaryDeclaration = new DictionaryDeclarationImpl();
    return dictionaryDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeConfig createSubtypeConfig()
  {
    SubtypeConfigImpl subtypeConfig = new SubtypeConfigImpl();
    return subtypeConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryEntry createDictionaryEntry()
  {
    DictionaryEntryImpl dictionaryEntry = new DictionaryEntryImpl();
    return dictionaryEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitFlagsDeclaration createBitFlagsDeclaration()
  {
    BitFlagsDeclarationImpl bitFlagsDeclaration = new BitFlagsDeclarationImpl();
    return bitFlagsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitFlagsDeclarationPart createBitFlagsDeclarationPart()
  {
    BitFlagsDeclarationPartImpl bitFlagsDeclarationPart = new BitFlagsDeclarationPartImpl();
    return bitFlagsDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameEnumDeclaration createNameEnumDeclaration()
  {
    NameEnumDeclarationImpl nameEnumDeclaration = new NameEnumDeclarationImpl();
    return nameEnumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameEnumDeclarationPart createNameEnumDeclarationPart()
  {
    NameEnumDeclarationPartImpl nameEnumDeclarationPart = new NameEnumDeclarationPartImpl();
    return nameEnumDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntryValue createAbstractEntryValue()
  {
    AbstractEntryValueImpl abstractEntryValue = new AbstractEntryValueImpl();
    return abstractEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullObjectEntryValue createNullObjectEntryValue()
  {
    NullObjectEntryValueImpl nullObjectEntryValue = new NullObjectEntryValueImpl();
    return nullObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameObjectEntryValue createNameObjectEntryValue()
  {
    NameObjectEntryValueImpl nameObjectEntryValue = new NameObjectEntryValueImpl();
    return nameObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberObjectEntryValue createNumberObjectEntryValue()
  {
    NumberObjectEntryValueImpl numberObjectEntryValue = new NumberObjectEntryValueImpl();
    return numberObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValidationRule createNumberValidationRule()
  {
    NumberValidationRuleImpl numberValidationRule = new NumberValidationRuleImpl();
    return numberValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberInclusiveRangeValidationRule createNumberInclusiveRangeValidationRule()
  {
    NumberInclusiveRangeValidationRuleImpl numberInclusiveRangeValidationRule = new NumberInclusiveRangeValidationRuleImpl();
    return numberInclusiveRangeValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberGreaterValidationRule createNumberGreaterValidationRule()
  {
    NumberGreaterValidationRuleImpl numberGreaterValidationRule = new NumberGreaterValidationRuleImpl();
    return numberGreaterValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberGreaterEqualsValidationRule createNumberGreaterEqualsValidationRule()
  {
    NumberGreaterEqualsValidationRuleImpl numberGreaterEqualsValidationRule = new NumberGreaterEqualsValidationRuleImpl();
    return numberGreaterEqualsValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValuesValidationRule createNumberValuesValidationRule()
  {
    NumberValuesValidationRuleImpl numberValuesValidationRule = new NumberValuesValidationRuleImpl();
    return numberValuesValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValuesValidationRuleEntry createNumberValuesValidationRuleEntry()
  {
    NumberValuesValidationRuleEntryImpl numberValuesValidationRuleEntry = new NumberValuesValidationRuleEntryImpl();
    return numberValuesValidationRuleEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerObjectEntryValue createIntegerObjectEntryValue()
  {
    IntegerObjectEntryValueImpl integerObjectEntryValue = new IntegerObjectEntryValueImpl();
    return integerObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValidationRule createIntegerValidationRule()
  {
    IntegerValidationRuleImpl integerValidationRule = new IntegerValidationRuleImpl();
    return integerValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerInclusiveRangeValidationRule createIntegerInclusiveRangeValidationRule()
  {
    IntegerInclusiveRangeValidationRuleImpl integerInclusiveRangeValidationRule = new IntegerInclusiveRangeValidationRuleImpl();
    return integerInclusiveRangeValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValuesValidationRule createIntegerValuesValidationRule()
  {
    IntegerValuesValidationRuleImpl integerValuesValidationRule = new IntegerValuesValidationRuleImpl();
    return integerValuesValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerGreaterValidationRule createIntegerGreaterValidationRule()
  {
    IntegerGreaterValidationRuleImpl integerGreaterValidationRule = new IntegerGreaterValidationRuleImpl();
    return integerGreaterValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerGreaterEqualsValidationRule createIntegerGreaterEqualsValidationRule()
  {
    IntegerGreaterEqualsValidationRuleImpl integerGreaterEqualsValidationRule = new IntegerGreaterEqualsValidationRuleImpl();
    return integerGreaterEqualsValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValuesValidationRuleEntry createIntegerValuesValidationRuleEntry()
  {
    IntegerValuesValidationRuleEntryImpl integerValuesValidationRuleEntry = new IntegerValuesValidationRuleEntryImpl();
    return integerValuesValidationRuleEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealObjectEntryValue createRealObjectEntryValue()
  {
    RealObjectEntryValueImpl realObjectEntryValue = new RealObjectEntryValueImpl();
    return realObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameTreeEntryValue createNameTreeEntryValue()
  {
    NameTreeEntryValueImpl nameTreeEntryValue = new NameTreeEntryValueImpl();
    return nameTreeEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberTreeEntryValue createNumberTreeEntryValue()
  {
    NumberTreeEntryValueImpl numberTreeEntryValue = new NumberTreeEntryValueImpl();
    return numberTreeEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayEntryValue createArrayEntryValue()
  {
    ArrayEntryValueImpl arrayEntryValue = new ArrayEntryValueImpl();
    return arrayEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayValidationRule createArrayValidationRule()
  {
    ArrayValidationRuleImpl arrayValidationRule = new ArrayValidationRuleImpl();
    return arrayValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLengthValidationRule createArrayLengthValidationRule()
  {
    ArrayLengthValidationRuleImpl arrayLengthValidationRule = new ArrayLengthValidationRuleImpl();
    return arrayLengthValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectEntryValue createObjectEntryValue()
  {
    ObjectEntryValueImpl objectEntryValue = new ObjectEntryValueImpl();
    return objectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDictEntryValue createMappingDictEntryValue()
  {
    MappingDictEntryValueImpl mappingDictEntryValue = new MappingDictEntryValueImpl();
    return mappingDictEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringEntryValue createStringEntryValue()
  {
    StringEntryValueImpl stringEntryValue = new StringEntryValueImpl();
    return stringEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValidationRule createStringValidationRule()
  {
    StringValidationRuleImpl stringValidationRule = new StringValidationRuleImpl();
    return stringValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLengthValidationRule createStringLengthValidationRule()
  {
    StringLengthValidationRuleImpl stringLengthValidationRule = new StringLengthValidationRuleImpl();
    return stringLengthValidationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeEntryValue createAlternativeEntryValue()
  {
    AlternativeEntryValueImpl alternativeEntryValue = new AlternativeEntryValueImpl();
    return alternativeEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanEntryValue createBooleanEntryValue()
  {
    BooleanEntryValueImpl booleanEntryValue = new BooleanEntryValueImpl();
    return booleanEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceEntryValue createReferenceEntryValue()
  {
    ReferenceEntryValueImpl referenceEntryValue = new ReferenceEntryValueImpl();
    return referenceEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentReferenceEntryValue createParentReferenceEntryValue()
  {
    ParentReferenceEntryValueImpl parentReferenceEntryValue = new ParentReferenceEntryValueImpl();
    return parentReferenceEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryObjectEntryValue createDictionaryObjectEntryValue()
  {
    DictionaryObjectEntryValueImpl dictionaryObjectEntryValue = new DictionaryObjectEntryValueImpl();
    return dictionaryObjectEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryDeclarationEntryValue createDictionaryDeclarationEntryValue()
  {
    DictionaryDeclarationEntryValueImpl dictionaryDeclarationEntryValue = new DictionaryDeclarationEntryValueImpl();
    return dictionaryDeclarationEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayMappedEntryValue createArrayMappedEntryValue()
  {
    ArrayMappedEntryValueImpl arrayMappedEntryValue = new ArrayMappedEntryValueImpl();
    return arrayMappedEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitFlagsEntryValue createBitFlagsEntryValue()
  {
    BitFlagsEntryValueImpl bitFlagsEntryValue = new BitFlagsEntryValueImpl();
    return bitFlagsEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateEntryValue createDateEntryValue()
  {
    DateEntryValueImpl dateEntryValue = new DateEntryValueImpl();
    return dateEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameEnumEntryValue createNameEnumEntryValue()
  {
    NameEnumEntryValueImpl nameEnumEntryValue = new NameEnumEntryValueImpl();
    return nameEnumEntryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndirectReference createIndirectReferenceFromString(EDataType eDataType, String initialValue)
  {
    IndirectReference result = IndirectReference.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIndirectReferenceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SinceVersion createSinceVersionFromString(EDataType eDataType, String initialValue)
  {
    SinceVersion result = SinceVersion.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSinceVersionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool createBoolFromString(EDataType eDataType, String initialValue)
  {
    Bool result = Bool.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfmodelPackage getPdfmodelPackage()
  {
    return (PdfmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PdfmodelPackage getPackage()
  {
    return PdfmodelPackage.eINSTANCE;
  }

} //PdfmodelFactoryImpl
