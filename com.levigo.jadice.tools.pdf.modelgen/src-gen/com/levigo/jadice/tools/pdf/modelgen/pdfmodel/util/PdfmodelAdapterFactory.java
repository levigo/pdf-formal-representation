/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.util;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage
 * @generated
 */
public class PdfmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdfmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PdfmodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PdfmodelSwitch<Adapter> modelSwitch =
    new PdfmodelSwitch<Adapter>()
    {
      @Override
      public Adapter casePDFModel(PDFModel object)
      {
        return createPDFModelAdapter();
      }
      @Override
      public Adapter caseAbstractDeclaration(AbstractDeclaration object)
      {
        return createAbstractDeclarationAdapter();
      }
      @Override
      public Adapter caseSpecificationReference(SpecificationReference object)
      {
        return createSpecificationReferenceAdapter();
      }
      @Override
      public Adapter caseSectionReference(SectionReference object)
      {
        return createSectionReferenceAdapter();
      }
      @Override
      public Adapter caseArrayMappedDeclaration(ArrayMappedDeclaration object)
      {
        return createArrayMappedDeclarationAdapter();
      }
      @Override
      public Adapter caseAbstractEntry(AbstractEntry object)
      {
        return createAbstractEntryAdapter();
      }
      @Override
      public Adapter caseArrayMappedEntry(ArrayMappedEntry object)
      {
        return createArrayMappedEntryAdapter();
      }
      @Override
      public Adapter caseDictionaryDeclaration(DictionaryDeclaration object)
      {
        return createDictionaryDeclarationAdapter();
      }
      @Override
      public Adapter caseSubtypeConfig(SubtypeConfig object)
      {
        return createSubtypeConfigAdapter();
      }
      @Override
      public Adapter caseDictionaryEntry(DictionaryEntry object)
      {
        return createDictionaryEntryAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseBitFlagsDeclaration(BitFlagsDeclaration object)
      {
        return createBitFlagsDeclarationAdapter();
      }
      @Override
      public Adapter caseBitFlagsDeclarationPart(BitFlagsDeclarationPart object)
      {
        return createBitFlagsDeclarationPartAdapter();
      }
      @Override
      public Adapter caseNameEnumDeclaration(NameEnumDeclaration object)
      {
        return createNameEnumDeclarationAdapter();
      }
      @Override
      public Adapter caseNameEnumDeclarationPart(NameEnumDeclarationPart object)
      {
        return createNameEnumDeclarationPartAdapter();
      }
      @Override
      public Adapter caseAbstractEntryValue(AbstractEntryValue object)
      {
        return createAbstractEntryValueAdapter();
      }
      @Override
      public Adapter caseNullObjectEntryValue(NullObjectEntryValue object)
      {
        return createNullObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseNameObjectEntryValue(NameObjectEntryValue object)
      {
        return createNameObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseNumberObjectEntryValue(NumberObjectEntryValue object)
      {
        return createNumberObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseNumberValidationRule(NumberValidationRule object)
      {
        return createNumberValidationRuleAdapter();
      }
      @Override
      public Adapter caseNumberInclusiveRangeValidationRule(NumberInclusiveRangeValidationRule object)
      {
        return createNumberInclusiveRangeValidationRuleAdapter();
      }
      @Override
      public Adapter caseNumberGreaterValidationRule(NumberGreaterValidationRule object)
      {
        return createNumberGreaterValidationRuleAdapter();
      }
      @Override
      public Adapter caseNumberGreaterEqualsValidationRule(NumberGreaterEqualsValidationRule object)
      {
        return createNumberGreaterEqualsValidationRuleAdapter();
      }
      @Override
      public Adapter caseNumberValuesValidationRule(NumberValuesValidationRule object)
      {
        return createNumberValuesValidationRuleAdapter();
      }
      @Override
      public Adapter caseNumberValuesValidationRuleEntry(NumberValuesValidationRuleEntry object)
      {
        return createNumberValuesValidationRuleEntryAdapter();
      }
      @Override
      public Adapter caseIntegerObjectEntryValue(IntegerObjectEntryValue object)
      {
        return createIntegerObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseIntegerValidationRule(IntegerValidationRule object)
      {
        return createIntegerValidationRuleAdapter();
      }
      @Override
      public Adapter caseIntegerInclusiveRangeValidationRule(IntegerInclusiveRangeValidationRule object)
      {
        return createIntegerInclusiveRangeValidationRuleAdapter();
      }
      @Override
      public Adapter caseIntegerValuesValidationRule(IntegerValuesValidationRule object)
      {
        return createIntegerValuesValidationRuleAdapter();
      }
      @Override
      public Adapter caseIntegerGreaterValidationRule(IntegerGreaterValidationRule object)
      {
        return createIntegerGreaterValidationRuleAdapter();
      }
      @Override
      public Adapter caseIntegerGreaterEqualsValidationRule(IntegerGreaterEqualsValidationRule object)
      {
        return createIntegerGreaterEqualsValidationRuleAdapter();
      }
      @Override
      public Adapter caseIntegerValuesValidationRuleEntry(IntegerValuesValidationRuleEntry object)
      {
        return createIntegerValuesValidationRuleEntryAdapter();
      }
      @Override
      public Adapter caseRealObjectEntryValue(RealObjectEntryValue object)
      {
        return createRealObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseNameTreeEntryValue(NameTreeEntryValue object)
      {
        return createNameTreeEntryValueAdapter();
      }
      @Override
      public Adapter caseNumberTreeEntryValue(NumberTreeEntryValue object)
      {
        return createNumberTreeEntryValueAdapter();
      }
      @Override
      public Adapter caseArrayEntryValue(ArrayEntryValue object)
      {
        return createArrayEntryValueAdapter();
      }
      @Override
      public Adapter caseArrayValidationRule(ArrayValidationRule object)
      {
        return createArrayValidationRuleAdapter();
      }
      @Override
      public Adapter caseArrayLengthValidationRule(ArrayLengthValidationRule object)
      {
        return createArrayLengthValidationRuleAdapter();
      }
      @Override
      public Adapter caseObjectEntryValue(ObjectEntryValue object)
      {
        return createObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseMappingDictEntryValue(MappingDictEntryValue object)
      {
        return createMappingDictEntryValueAdapter();
      }
      @Override
      public Adapter caseStringEntryValue(StringEntryValue object)
      {
        return createStringEntryValueAdapter();
      }
      @Override
      public Adapter caseStringValidationRule(StringValidationRule object)
      {
        return createStringValidationRuleAdapter();
      }
      @Override
      public Adapter caseStringLengthValidationRule(StringLengthValidationRule object)
      {
        return createStringLengthValidationRuleAdapter();
      }
      @Override
      public Adapter caseAlternativeEntryValue(AlternativeEntryValue object)
      {
        return createAlternativeEntryValueAdapter();
      }
      @Override
      public Adapter caseBooleanEntryValue(BooleanEntryValue object)
      {
        return createBooleanEntryValueAdapter();
      }
      @Override
      public Adapter caseReferenceEntryValue(ReferenceEntryValue object)
      {
        return createReferenceEntryValueAdapter();
      }
      @Override
      public Adapter caseParentReferenceEntryValue(ParentReferenceEntryValue object)
      {
        return createParentReferenceEntryValueAdapter();
      }
      @Override
      public Adapter caseDictionaryObjectEntryValue(DictionaryObjectEntryValue object)
      {
        return createDictionaryObjectEntryValueAdapter();
      }
      @Override
      public Adapter caseDictionaryDeclarationEntryValue(DictionaryDeclarationEntryValue object)
      {
        return createDictionaryDeclarationEntryValueAdapter();
      }
      @Override
      public Adapter caseArrayMappedEntryValue(ArrayMappedEntryValue object)
      {
        return createArrayMappedEntryValueAdapter();
      }
      @Override
      public Adapter caseBitFlagsEntryValue(BitFlagsEntryValue object)
      {
        return createBitFlagsEntryValueAdapter();
      }
      @Override
      public Adapter caseDateEntryValue(DateEntryValue object)
      {
        return createDateEntryValueAdapter();
      }
      @Override
      public Adapter caseNameEnumEntryValue(NameEnumEntryValue object)
      {
        return createNameEnumEntryValueAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel <em>PDF Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel
   * @generated
   */
  public Adapter createPDFModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration
   * @generated
   */
  public Adapter createAbstractDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference <em>Specification Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference
   * @generated
   */
  public Adapter createSpecificationReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference <em>Section Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference
   * @generated
   */
  public Adapter createSectionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration <em>Array Mapped Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration
   * @generated
   */
  public Adapter createArrayMappedDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry <em>Abstract Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry
   * @generated
   */
  public Adapter createAbstractEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry <em>Array Mapped Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry
   * @generated
   */
  public Adapter createArrayMappedEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration <em>Dictionary Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration
   * @generated
   */
  public Adapter createDictionaryDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig <em>Subtype Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig
   * @generated
   */
  public Adapter createSubtypeConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry <em>Dictionary Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry
   * @generated
   */
  public Adapter createDictionaryEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration <em>Bit Flags Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration
   * @generated
   */
  public Adapter createBitFlagsDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart <em>Bit Flags Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart
   * @generated
   */
  public Adapter createBitFlagsDeclarationPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration <em>Name Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration
   * @generated
   */
  public Adapter createNameEnumDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart <em>Name Enum Declaration Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart
   * @generated
   */
  public Adapter createNameEnumDeclarationPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue <em>Abstract Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue
   * @generated
   */
  public Adapter createAbstractEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NullObjectEntryValue <em>Null Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NullObjectEntryValue
   * @generated
   */
  public Adapter createNullObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue <em>Name Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue
   * @generated
   */
  public Adapter createNameObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue <em>Number Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue
   * @generated
   */
  public Adapter createNumberObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule <em>Number Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule
   * @generated
   */
  public Adapter createNumberValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule <em>Number Inclusive Range Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule
   * @generated
   */
  public Adapter createNumberInclusiveRangeValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule <em>Number Greater Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule
   * @generated
   */
  public Adapter createNumberGreaterValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule <em>Number Greater Equals Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule
   * @generated
   */
  public Adapter createNumberGreaterEqualsValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule <em>Number Values Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule
   * @generated
   */
  public Adapter createNumberValuesValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry <em>Number Values Validation Rule Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry
   * @generated
   */
  public Adapter createNumberValuesValidationRuleEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue <em>Integer Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue
   * @generated
   */
  public Adapter createIntegerObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule <em>Integer Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule
   * @generated
   */
  public Adapter createIntegerValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule <em>Integer Inclusive Range Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule
   * @generated
   */
  public Adapter createIntegerInclusiveRangeValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule <em>Integer Values Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule
   * @generated
   */
  public Adapter createIntegerValuesValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule <em>Integer Greater Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule
   * @generated
   */
  public Adapter createIntegerGreaterValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule <em>Integer Greater Equals Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule
   * @generated
   */
  public Adapter createIntegerGreaterEqualsValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry <em>Integer Values Validation Rule Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry
   * @generated
   */
  public Adapter createIntegerValuesValidationRuleEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue <em>Real Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue
   * @generated
   */
  public Adapter createRealObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameTreeEntryValue <em>Name Tree Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameTreeEntryValue
   * @generated
   */
  public Adapter createNameTreeEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberTreeEntryValue <em>Number Tree Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberTreeEntryValue
   * @generated
   */
  public Adapter createNumberTreeEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue <em>Array Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue
   * @generated
   */
  public Adapter createArrayEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule <em>Array Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule
   * @generated
   */
  public Adapter createArrayValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule <em>Array Length Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule
   * @generated
   */
  public Adapter createArrayLengthValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ObjectEntryValue <em>Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ObjectEntryValue
   * @generated
   */
  public Adapter createObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue <em>Mapping Dict Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue
   * @generated
   */
  public Adapter createMappingDictEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue <em>String Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue
   * @generated
   */
  public Adapter createStringEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule <em>String Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule
   * @generated
   */
  public Adapter createStringValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule <em>String Length Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule
   * @generated
   */
  public Adapter createStringLengthValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue <em>Alternative Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue
   * @generated
   */
  public Adapter createAlternativeEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue <em>Boolean Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue
   * @generated
   */
  public Adapter createBooleanEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ReferenceEntryValue <em>Reference Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ReferenceEntryValue
   * @generated
   */
  public Adapter createReferenceEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue <em>Parent Reference Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue
   * @generated
   */
  public Adapter createParentReferenceEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryObjectEntryValue <em>Dictionary Object Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryObjectEntryValue
   * @generated
   */
  public Adapter createDictionaryObjectEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue <em>Dictionary Declaration Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue
   * @generated
   */
  public Adapter createDictionaryDeclarationEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue <em>Array Mapped Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue
   * @generated
   */
  public Adapter createArrayMappedEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue <em>Bit Flags Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue
   * @generated
   */
  public Adapter createBitFlagsEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DateEntryValue <em>Date Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DateEntryValue
   * @generated
   */
  public Adapter createDateEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue <em>Name Enum Entry Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue
   * @generated
   */
  public Adapter createNameEnumEntryValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PdfmodelAdapterFactory
