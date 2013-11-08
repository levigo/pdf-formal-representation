/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.util;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage
 * @generated
 */
public class PdfmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdfmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PdfmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PdfmodelPackage.PDF_MODEL:
      {
        PDFModel pdfModel = (PDFModel)theEObject;
        T result = casePDFModel(pdfModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.MODEL_CONFIG:
      {
        ModelConfig modelConfig = (ModelConfig)theEObject;
        T result = caseModelConfig(modelConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.CORE_TYPES_CONFIG:
      {
        CoreTypesConfig coreTypesConfig = (CoreTypesConfig)theEObject;
        T result = caseCoreTypesConfig(coreTypesConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ABSTRACT_DECLARATION:
      {
        AbstractDeclaration abstractDeclaration = (AbstractDeclaration)theEObject;
        T result = caseAbstractDeclaration(abstractDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.SPECIFICATION_REFERENCE:
      {
        SpecificationReference specificationReference = (SpecificationReference)theEObject;
        T result = caseSpecificationReference(specificationReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.SECTION_REFERENCE:
      {
        SectionReference sectionReference = (SectionReference)theEObject;
        T result = caseSectionReference(sectionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_MAPPED_DECLARATION:
      {
        ArrayMappedDeclaration arrayMappedDeclaration = (ArrayMappedDeclaration)theEObject;
        T result = caseArrayMappedDeclaration(arrayMappedDeclaration);
        if (result == null) result = caseAbstractDeclaration(arrayMappedDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ABSTRACT_ENTRY:
      {
        AbstractEntry abstractEntry = (AbstractEntry)theEObject;
        T result = caseAbstractEntry(abstractEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY:
      {
        ArrayMappedEntry arrayMappedEntry = (ArrayMappedEntry)theEObject;
        T result = caseArrayMappedEntry(arrayMappedEntry);
        if (result == null) result = caseAbstractEntry(arrayMappedEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.DICTIONARY_DECLARATION:
      {
        DictionaryDeclaration dictionaryDeclaration = (DictionaryDeclaration)theEObject;
        T result = caseDictionaryDeclaration(dictionaryDeclaration);
        if (result == null) result = caseAbstractDeclaration(dictionaryDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.SUBTYPE_CONFIG:
      {
        SubtypeConfig subtypeConfig = (SubtypeConfig)theEObject;
        T result = caseSubtypeConfig(subtypeConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.DICTIONARY_ENTRY:
      {
        DictionaryEntry dictionaryEntry = (DictionaryEntry)theEObject;
        T result = caseDictionaryEntry(dictionaryEntry);
        if (result == null) result = caseAbstractEntry(dictionaryEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.BIT_FLAGS_DECLARATION:
      {
        BitFlagsDeclaration bitFlagsDeclaration = (BitFlagsDeclaration)theEObject;
        T result = caseBitFlagsDeclaration(bitFlagsDeclaration);
        if (result == null) result = caseAbstractDeclaration(bitFlagsDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.BIT_FLAGS_DECLARATION_PART:
      {
        BitFlagsDeclarationPart bitFlagsDeclarationPart = (BitFlagsDeclarationPart)theEObject;
        T result = caseBitFlagsDeclarationPart(bitFlagsDeclarationPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NAME_ENUM_DECLARATION:
      {
        NameEnumDeclaration nameEnumDeclaration = (NameEnumDeclaration)theEObject;
        T result = caseNameEnumDeclaration(nameEnumDeclaration);
        if (result == null) result = caseAbstractDeclaration(nameEnumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NAME_ENUM_DECLARATION_PART:
      {
        NameEnumDeclarationPart nameEnumDeclarationPart = (NameEnumDeclarationPart)theEObject;
        T result = caseNameEnumDeclarationPart(nameEnumDeclarationPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ABSTRACT_ENTRY_VALUE:
      {
        AbstractEntryValue abstractEntryValue = (AbstractEntryValue)theEObject;
        T result = caseAbstractEntryValue(abstractEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NULL_OBJECT_ENTRY_VALUE:
      {
        NullObjectEntryValue nullObjectEntryValue = (NullObjectEntryValue)theEObject;
        T result = caseNullObjectEntryValue(nullObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(nullObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NAME_OBJECT_ENTRY_VALUE:
      {
        NameObjectEntryValue nameObjectEntryValue = (NameObjectEntryValue)theEObject;
        T result = caseNameObjectEntryValue(nameObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(nameObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_OBJECT_ENTRY_VALUE:
      {
        NumberObjectEntryValue numberObjectEntryValue = (NumberObjectEntryValue)theEObject;
        T result = caseNumberObjectEntryValue(numberObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(numberObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_VALIDATION_RULE:
      {
        NumberValidationRule numberValidationRule = (NumberValidationRule)theEObject;
        T result = caseNumberValidationRule(numberValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE:
      {
        NumberInclusiveRangeValidationRule numberInclusiveRangeValidationRule = (NumberInclusiveRangeValidationRule)theEObject;
        T result = caseNumberInclusiveRangeValidationRule(numberInclusiveRangeValidationRule);
        if (result == null) result = caseNumberValidationRule(numberInclusiveRangeValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_GREATER_VALIDATION_RULE:
      {
        NumberGreaterValidationRule numberGreaterValidationRule = (NumberGreaterValidationRule)theEObject;
        T result = caseNumberGreaterValidationRule(numberGreaterValidationRule);
        if (result == null) result = caseNumberValidationRule(numberGreaterValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_GREATER_EQUALS_VALIDATION_RULE:
      {
        NumberGreaterEqualsValidationRule numberGreaterEqualsValidationRule = (NumberGreaterEqualsValidationRule)theEObject;
        T result = caseNumberGreaterEqualsValidationRule(numberGreaterEqualsValidationRule);
        if (result == null) result = caseNumberValidationRule(numberGreaterEqualsValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_VALUES_VALIDATION_RULE:
      {
        NumberValuesValidationRule numberValuesValidationRule = (NumberValuesValidationRule)theEObject;
        T result = caseNumberValuesValidationRule(numberValuesValidationRule);
        if (result == null) result = caseNumberValidationRule(numberValuesValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_VALUES_VALIDATION_RULE_ENTRY:
      {
        NumberValuesValidationRuleEntry numberValuesValidationRuleEntry = (NumberValuesValidationRuleEntry)theEObject;
        T result = caseNumberValuesValidationRuleEntry(numberValuesValidationRuleEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_OBJECT_ENTRY_VALUE:
      {
        IntegerObjectEntryValue integerObjectEntryValue = (IntegerObjectEntryValue)theEObject;
        T result = caseIntegerObjectEntryValue(integerObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(integerObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_VALIDATION_RULE:
      {
        IntegerValidationRule integerValidationRule = (IntegerValidationRule)theEObject;
        T result = caseIntegerValidationRule(integerValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE:
      {
        IntegerInclusiveRangeValidationRule integerInclusiveRangeValidationRule = (IntegerInclusiveRangeValidationRule)theEObject;
        T result = caseIntegerInclusiveRangeValidationRule(integerInclusiveRangeValidationRule);
        if (result == null) result = caseIntegerValidationRule(integerInclusiveRangeValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE:
      {
        IntegerValuesValidationRule integerValuesValidationRule = (IntegerValuesValidationRule)theEObject;
        T result = caseIntegerValuesValidationRule(integerValuesValidationRule);
        if (result == null) result = caseIntegerValidationRule(integerValuesValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_GREATER_VALIDATION_RULE:
      {
        IntegerGreaterValidationRule integerGreaterValidationRule = (IntegerGreaterValidationRule)theEObject;
        T result = caseIntegerGreaterValidationRule(integerGreaterValidationRule);
        if (result == null) result = caseIntegerValidationRule(integerGreaterValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_GREATER_EQUALS_VALIDATION_RULE:
      {
        IntegerGreaterEqualsValidationRule integerGreaterEqualsValidationRule = (IntegerGreaterEqualsValidationRule)theEObject;
        T result = caseIntegerGreaterEqualsValidationRule(integerGreaterEqualsValidationRule);
        if (result == null) result = caseIntegerValidationRule(integerGreaterEqualsValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INTEGER_VALUES_VALIDATION_RULE_ENTRY:
      {
        IntegerValuesValidationRuleEntry integerValuesValidationRuleEntry = (IntegerValuesValidationRuleEntry)theEObject;
        T result = caseIntegerValuesValidationRuleEntry(integerValuesValidationRuleEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.REAL_OBJECT_ENTRY_VALUE:
      {
        RealObjectEntryValue realObjectEntryValue = (RealObjectEntryValue)theEObject;
        T result = caseRealObjectEntryValue(realObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(realObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NAME_TREE_ENTRY_VALUE:
      {
        NameTreeEntryValue nameTreeEntryValue = (NameTreeEntryValue)theEObject;
        T result = caseNameTreeEntryValue(nameTreeEntryValue);
        if (result == null) result = caseAbstractEntryValue(nameTreeEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_TREE_ENTRY_VALUE:
      {
        NumberTreeEntryValue numberTreeEntryValue = (NumberTreeEntryValue)theEObject;
        T result = caseNumberTreeEntryValue(numberTreeEntryValue);
        if (result == null) result = caseAbstractEntryValue(numberTreeEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_ENTRY_VALUE:
      {
        ArrayEntryValue arrayEntryValue = (ArrayEntryValue)theEObject;
        T result = caseArrayEntryValue(arrayEntryValue);
        if (result == null) result = caseAbstractEntryValue(arrayEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_VALIDATION_RULE:
      {
        ArrayValidationRule arrayValidationRule = (ArrayValidationRule)theEObject;
        T result = caseArrayValidationRule(arrayValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_LENGTH_VALIDATION_RULE:
      {
        ArrayLengthValidationRule arrayLengthValidationRule = (ArrayLengthValidationRule)theEObject;
        T result = caseArrayLengthValidationRule(arrayLengthValidationRule);
        if (result == null) result = caseArrayValidationRule(arrayLengthValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.OBJECT_ENTRY_VALUE:
      {
        ObjectEntryValue objectEntryValue = (ObjectEntryValue)theEObject;
        T result = caseObjectEntryValue(objectEntryValue);
        if (result == null) result = caseAbstractEntryValue(objectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.MAPPING_DICT_ENTRY_VALUE:
      {
        MappingDictEntryValue mappingDictEntryValue = (MappingDictEntryValue)theEObject;
        T result = caseMappingDictEntryValue(mappingDictEntryValue);
        if (result == null) result = caseAbstractEntryValue(mappingDictEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.STRING_ENTRY_VALUE:
      {
        StringEntryValue stringEntryValue = (StringEntryValue)theEObject;
        T result = caseStringEntryValue(stringEntryValue);
        if (result == null) result = caseAbstractEntryValue(stringEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.STRING_VALIDATION_RULE:
      {
        StringValidationRule stringValidationRule = (StringValidationRule)theEObject;
        T result = caseStringValidationRule(stringValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.STRING_LENGTH_VALIDATION_RULE:
      {
        StringLengthValidationRule stringLengthValidationRule = (StringLengthValidationRule)theEObject;
        T result = caseStringLengthValidationRule(stringLengthValidationRule);
        if (result == null) result = caseStringValidationRule(stringLengthValidationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ALTERNATIVE_ENTRY_VALUE:
      {
        AlternativeEntryValue alternativeEntryValue = (AlternativeEntryValue)theEObject;
        T result = caseAlternativeEntryValue(alternativeEntryValue);
        if (result == null) result = caseAbstractEntryValue(alternativeEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.BOOLEAN_ENTRY_VALUE:
      {
        BooleanEntryValue booleanEntryValue = (BooleanEntryValue)theEObject;
        T result = caseBooleanEntryValue(booleanEntryValue);
        if (result == null) result = caseAbstractEntryValue(booleanEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.REFERENCE_ENTRY_VALUE:
      {
        ReferenceEntryValue referenceEntryValue = (ReferenceEntryValue)theEObject;
        T result = caseReferenceEntryValue(referenceEntryValue);
        if (result == null) result = caseAbstractEntryValue(referenceEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.PARENT_REFERENCE_ENTRY_VALUE:
      {
        ParentReferenceEntryValue parentReferenceEntryValue = (ParentReferenceEntryValue)theEObject;
        T result = caseParentReferenceEntryValue(parentReferenceEntryValue);
        if (result == null) result = caseAbstractEntryValue(parentReferenceEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.DICTIONARY_OBJECT_ENTRY_VALUE:
      {
        DictionaryObjectEntryValue dictionaryObjectEntryValue = (DictionaryObjectEntryValue)theEObject;
        T result = caseDictionaryObjectEntryValue(dictionaryObjectEntryValue);
        if (result == null) result = caseAbstractEntryValue(dictionaryObjectEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.DICTIONARY_DECLARATION_ENTRY_VALUE:
      {
        DictionaryDeclarationEntryValue dictionaryDeclarationEntryValue = (DictionaryDeclarationEntryValue)theEObject;
        T result = caseDictionaryDeclarationEntryValue(dictionaryDeclarationEntryValue);
        if (result == null) result = caseAbstractEntryValue(dictionaryDeclarationEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.ARRAY_MAPPED_ENTRY_VALUE:
      {
        ArrayMappedEntryValue arrayMappedEntryValue = (ArrayMappedEntryValue)theEObject;
        T result = caseArrayMappedEntryValue(arrayMappedEntryValue);
        if (result == null) result = caseAbstractEntryValue(arrayMappedEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.BIT_FLAGS_ENTRY_VALUE:
      {
        BitFlagsEntryValue bitFlagsEntryValue = (BitFlagsEntryValue)theEObject;
        T result = caseBitFlagsEntryValue(bitFlagsEntryValue);
        if (result == null) result = caseAbstractEntryValue(bitFlagsEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.DATE_ENTRY_VALUE:
      {
        DateEntryValue dateEntryValue = (DateEntryValue)theEObject;
        T result = caseDateEntryValue(dateEntryValue);
        if (result == null) result = caseAbstractEntryValue(dateEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NAME_ENUM_ENTRY_VALUE:
      {
        NameEnumEntryValue nameEnumEntryValue = (NameEnumEntryValue)theEObject;
        T result = caseNameEnumEntryValue(nameEnumEntryValue);
        if (result == null) result = caseAbstractEntryValue(nameEnumEntryValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseNumberLiteral(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfmodelPackage.REAL_LITERAL:
      {
        RealLiteral realLiteral = (RealLiteral)theEObject;
        T result = caseRealLiteral(realLiteral);
        if (result == null) result = caseNumberLiteral(realLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PDF Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PDF Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDFModel(PDFModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelConfig(ModelConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Core Types Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Core Types Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoreTypesConfig(CoreTypesConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDeclaration(AbstractDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecificationReference(SpecificationReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionReference(SectionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Mapped Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Mapped Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayMappedDeclaration(ArrayMappedDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractEntry(AbstractEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Mapped Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Mapped Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayMappedEntry(ArrayMappedEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionaryDeclaration(DictionaryDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtype Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtype Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtypeConfig(SubtypeConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionaryEntry(DictionaryEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Flags Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Flags Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitFlagsDeclaration(BitFlagsDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Flags Declaration Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Flags Declaration Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitFlagsDeclarationPart(BitFlagsDeclarationPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameEnumDeclaration(NameEnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Enum Declaration Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Enum Declaration Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameEnumDeclarationPart(NameEnumDeclarationPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractEntryValue(AbstractEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullObjectEntryValue(NullObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameObjectEntryValue(NameObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberObjectEntryValue(NumberObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberValidationRule(NumberValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Inclusive Range Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Inclusive Range Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberInclusiveRangeValidationRule(NumberInclusiveRangeValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Greater Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Greater Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberGreaterValidationRule(NumberGreaterValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Greater Equals Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Greater Equals Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberGreaterEqualsValidationRule(NumberGreaterEqualsValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Values Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Values Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberValuesValidationRule(NumberValuesValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Values Validation Rule Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Values Validation Rule Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberValuesValidationRuleEntry(NumberValuesValidationRuleEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerObjectEntryValue(IntegerObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValidationRule(IntegerValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Inclusive Range Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Inclusive Range Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerInclusiveRangeValidationRule(IntegerInclusiveRangeValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Values Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Values Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValuesValidationRule(IntegerValuesValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Greater Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Greater Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerGreaterValidationRule(IntegerGreaterValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Greater Equals Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Greater Equals Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerGreaterEqualsValidationRule(IntegerGreaterEqualsValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Values Validation Rule Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Values Validation Rule Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValuesValidationRuleEntry(IntegerValuesValidationRuleEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealObjectEntryValue(RealObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Tree Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Tree Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameTreeEntryValue(NameTreeEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Tree Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Tree Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberTreeEntryValue(NumberTreeEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayEntryValue(ArrayEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayValidationRule(ArrayValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Length Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Length Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayLengthValidationRule(ArrayLengthValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectEntryValue(ObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Dict Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Dict Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingDictEntryValue(MappingDictEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringEntryValue(StringEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValidationRule(StringValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Length Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Length Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLengthValidationRule(StringLengthValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternativeEntryValue(AlternativeEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanEntryValue(BooleanEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceEntryValue(ReferenceEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Reference Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Reference Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentReferenceEntryValue(ParentReferenceEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary Object Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary Object Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionaryObjectEntryValue(DictionaryObjectEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary Declaration Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary Declaration Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionaryDeclarationEntryValue(DictionaryDeclarationEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Mapped Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Mapped Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayMappedEntryValue(ArrayMappedEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Flags Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Flags Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitFlagsEntryValue(BitFlagsEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateEntryValue(DateEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Enum Entry Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Enum Entry Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameEnumEntryValue(NameEnumEntryValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLiteral(RealLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PdfmodelSwitch
