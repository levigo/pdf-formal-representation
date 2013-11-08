/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AlternativeEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayLengthValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BitFlagsEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.Bool;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.BooleanEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DateEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclarationEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IndirectReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterEqualsValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerGreaterValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerInclusiveRangeValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.IntegerValuesValidationRuleEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.MappingDictEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameTreeEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NullObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterEqualsValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberGreaterValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberInclusiveRangeValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberTreeEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NumberValuesValidationRuleEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PDFModel;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ParentReferenceEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelFactory;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealLiteral;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.RealObjectEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ReferenceEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SectionReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SpecificationReference;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringEntryValue;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringLengthValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.StringValidationRule;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SubtypeConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdfmodelPackageImpl extends EPackageImpl implements PdfmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdfModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayMappedDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayMappedEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtypeConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitFlagsDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitFlagsDeclarationPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEnumDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEnumDeclarationPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberInclusiveRangeValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberGreaterValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberGreaterEqualsValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberValuesValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberValuesValidationRuleEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerInclusiveRangeValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValuesValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerGreaterValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerGreaterEqualsValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValuesValidationRuleEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameTreeEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberTreeEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayLengthValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingDictEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLengthValidationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parentReferenceEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryObjectEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryDeclarationEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayMappedEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitFlagsEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEnumEntryValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum indirectReferenceEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sinceVersionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum boolEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PdfmodelPackageImpl()
  {
    super(eNS_URI, PdfmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PdfmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PdfmodelPackage init()
  {
    if (isInited) return (PdfmodelPackage)EPackage.Registry.INSTANCE.getEPackage(PdfmodelPackage.eNS_URI);

    // Obtain or create and register package
    PdfmodelPackageImpl thePdfmodelPackage = (PdfmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PdfmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PdfmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePdfmodelPackage.createPackageContents();

    // Initialize created meta-data
    thePdfmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePdfmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PdfmodelPackage.eNS_URI, thePdfmodelPackage);
    return thePdfmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDFModel()
  {
    return pdfModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDFModel_Packages()
  {
    return (EReference)pdfModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDeclaration()
  {
    return abstractDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDeclaration_Name()
  {
    return (EAttribute)abstractDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDeclaration_Since()
  {
    return (EAttribute)abstractDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecificationReference()
  {
    return specificationReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificationReference_Section()
  {
    return (EReference)specificationReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecificationReference_Table()
  {
    return (EAttribute)specificationReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionReference()
  {
    return sectionReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionReference_Section()
  {
    return (EAttribute)sectionReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayMappedDeclaration()
  {
    return arrayMappedDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayMappedDeclaration_Entries()
  {
    return (EReference)arrayMappedDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractEntry()
  {
    return abstractEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_Cached()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_Required()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_IndirectReference()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractEntry_Value()
  {
    return (EReference)abstractEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_Since()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_RequiresCustomValidation()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractEntry_RequiresCustomDefault()
  {
    return (EAttribute)abstractEntryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayMappedEntry()
  {
    return arrayMappedEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayMappedEntry_Index()
  {
    return (EAttribute)arrayMappedEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayMappedEntry_Name()
  {
    return (EAttribute)arrayMappedEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayMappedEntry_Nullable()
  {
    return (EAttribute)arrayMappedEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionaryDeclaration()
  {
    return dictionaryDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDictionaryDeclaration_Stream()
  {
    return (EAttribute)dictionaryDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryDeclaration_SuperTypes()
  {
    return (EReference)dictionaryDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryDeclaration_SubtypeConfig()
  {
    return (EReference)dictionaryDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryDeclaration_Entries()
  {
    return (EReference)dictionaryDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtypeConfig()
  {
    return subtypeConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubtypeConfig_Candidates()
  {
    return (EReference)subtypeConfigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionaryEntry()
  {
    return dictionaryEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDictionaryEntry_Key()
  {
    return (EAttribute)dictionaryEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDictionaryEntry_Alias()
  {
    return (EAttribute)dictionaryEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDictionaryEntry_Inheritable()
  {
    return (EAttribute)dictionaryEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitFlagsDeclaration()
  {
    return bitFlagsDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitFlagsDeclaration_SpecificationReference()
  {
    return (EReference)bitFlagsDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitFlagsDeclaration_Declarations()
  {
    return (EReference)bitFlagsDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitFlagsDeclarationPart()
  {
    return bitFlagsDeclarationPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitFlagsDeclarationPart_Index()
  {
    return (EAttribute)bitFlagsDeclarationPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitFlagsDeclarationPart_Name()
  {
    return (EAttribute)bitFlagsDeclarationPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitFlagsDeclarationPart_Since()
  {
    return (EAttribute)bitFlagsDeclarationPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameEnumDeclaration()
  {
    return nameEnumDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameEnumDeclaration_Declarations()
  {
    return (EReference)nameEnumDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameEnumDeclarationPart()
  {
    return nameEnumDeclarationPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumDeclarationPart_Constant()
  {
    return (EAttribute)nameEnumDeclarationPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumDeclarationPart_Alias()
  {
    return (EAttribute)nameEnumDeclarationPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumDeclarationPart_Since()
  {
    return (EAttribute)nameEnumDeclarationPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractEntryValue()
  {
    return abstractEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullObjectEntryValue()
  {
    return nullObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameObjectEntryValue()
  {
    return nameObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameObjectEntryValue_HasMustBe()
  {
    return (EAttribute)nameObjectEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameObjectEntryValue_RequiredValue()
  {
    return (EAttribute)nameObjectEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameObjectEntryValue_HasDefault()
  {
    return (EAttribute)nameObjectEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameObjectEntryValue_DefaultValue()
  {
    return (EAttribute)nameObjectEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberObjectEntryValue()
  {
    return numberObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberObjectEntryValue_Rule()
  {
    return (EReference)numberObjectEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberObjectEntryValue_HasMustBe()
  {
    return (EAttribute)numberObjectEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberObjectEntryValue_RequiredValue()
  {
    return (EReference)numberObjectEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberObjectEntryValue_HasDefault()
  {
    return (EAttribute)numberObjectEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberObjectEntryValue_DefaultValue()
  {
    return (EReference)numberObjectEntryValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberValidationRule()
  {
    return numberValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberInclusiveRangeValidationRule()
  {
    return numberInclusiveRangeValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberInclusiveRangeValidationRule_LowerBound()
  {
    return (EReference)numberInclusiveRangeValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberInclusiveRangeValidationRule_UpperBound()
  {
    return (EReference)numberInclusiveRangeValidationRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberGreaterValidationRule()
  {
    return numberGreaterValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberGreaterValidationRule_MinValue()
  {
    return (EReference)numberGreaterValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberGreaterEqualsValidationRule()
  {
    return numberGreaterEqualsValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberGreaterEqualsValidationRule_MinValue()
  {
    return (EReference)numberGreaterEqualsValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberValuesValidationRule()
  {
    return numberValuesValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberValuesValidationRule_Value()
  {
    return (EReference)numberValuesValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberValuesValidationRuleEntry()
  {
    return numberValuesValidationRuleEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberValuesValidationRuleEntry_Value()
  {
    return (EReference)numberValuesValidationRuleEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberValuesValidationRuleEntry_Since()
  {
    return (EAttribute)numberValuesValidationRuleEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerObjectEntryValue()
  {
    return integerObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerObjectEntryValue_Rule()
  {
    return (EReference)integerObjectEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerObjectEntryValue_HasMustBe()
  {
    return (EAttribute)integerObjectEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerObjectEntryValue_RequiredValue()
  {
    return (EReference)integerObjectEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerObjectEntryValue_HasDefault()
  {
    return (EAttribute)integerObjectEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerObjectEntryValue_DefaultValue()
  {
    return (EReference)integerObjectEntryValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValidationRule()
  {
    return integerValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerInclusiveRangeValidationRule()
  {
    return integerInclusiveRangeValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerInclusiveRangeValidationRule_LowerBound()
  {
    return (EReference)integerInclusiveRangeValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerInclusiveRangeValidationRule_UpperBound()
  {
    return (EReference)integerInclusiveRangeValidationRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValuesValidationRule()
  {
    return integerValuesValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerValuesValidationRule_Value()
  {
    return (EReference)integerValuesValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerGreaterValidationRule()
  {
    return integerGreaterValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerGreaterValidationRule_MinValue()
  {
    return (EReference)integerGreaterValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerGreaterEqualsValidationRule()
  {
    return integerGreaterEqualsValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerGreaterEqualsValidationRule_MinValue()
  {
    return (EReference)integerGreaterEqualsValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValuesValidationRuleEntry()
  {
    return integerValuesValidationRuleEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerValuesValidationRuleEntry_Value()
  {
    return (EReference)integerValuesValidationRuleEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerValuesValidationRuleEntry_Since()
  {
    return (EAttribute)integerValuesValidationRuleEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealObjectEntryValue()
  {
    return realObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealObjectEntryValue_HasMustBe()
  {
    return (EAttribute)realObjectEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealObjectEntryValue_RequiredValue()
  {
    return (EReference)realObjectEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealObjectEntryValue_HasDefault()
  {
    return (EAttribute)realObjectEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealObjectEntryValue_DefaultValue()
  {
    return (EReference)realObjectEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameTreeEntryValue()
  {
    return nameTreeEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberTreeEntryValue()
  {
    return numberTreeEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayEntryValue()
  {
    return arrayEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayEntryValue_Rule()
  {
    return (EReference)arrayEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayEntryValue_IndirectReference()
  {
    return (EAttribute)arrayEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayEntryValue_Type()
  {
    return (EReference)arrayEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayEntryValue_RequiresCustomValidation()
  {
    return (EAttribute)arrayEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayEntryValue_RequiresCustomDefault()
  {
    return (EAttribute)arrayEntryValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayValidationRule()
  {
    return arrayValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayLengthValidationRule()
  {
    return arrayLengthValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayLengthValidationRule_Length()
  {
    return (EAttribute)arrayLengthValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectEntryValue()
  {
    return objectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingDictEntryValue()
  {
    return mappingDictEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDictEntryValue_Type()
  {
    return (EReference)mappingDictEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingDictEntryValue_RequiresCustomValidation()
  {
    return (EAttribute)mappingDictEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingDictEntryValue_RequiresCustomDefault()
  {
    return (EAttribute)mappingDictEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringEntryValue()
  {
    return stringEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringEntryValue_TextString()
  {
    return (EAttribute)stringEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringEntryValue_AsciiString()
  {
    return (EAttribute)stringEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringEntryValue_ByteString()
  {
    return (EAttribute)stringEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringEntryValue_Rule()
  {
    return (EReference)stringEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValidationRule()
  {
    return stringValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLengthValidationRule()
  {
    return stringLengthValidationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringLengthValidationRule_Length()
  {
    return (EReference)stringLengthValidationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternativeEntryValue()
  {
    return alternativeEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternativeEntryValue_Options()
  {
    return (EReference)alternativeEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanEntryValue()
  {
    return booleanEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanEntryValue_HasMustBe()
  {
    return (EAttribute)booleanEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanEntryValue_RequiredValue()
  {
    return (EAttribute)booleanEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanEntryValue_HasDefault()
  {
    return (EAttribute)booleanEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanEntryValue_DefaultValue()
  {
    return (EAttribute)booleanEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceEntryValue()
  {
    return referenceEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParentReferenceEntryValue()
  {
    return parentReferenceEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParentReferenceEntryValue_ParentType()
  {
    return (EReference)parentReferenceEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionaryObjectEntryValue()
  {
    return dictionaryObjectEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionaryDeclarationEntryValue()
  {
    return dictionaryDeclarationEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryDeclarationEntryValue_Target()
  {
    return (EReference)dictionaryDeclarationEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayMappedEntryValue()
  {
    return arrayMappedEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayMappedEntryValue_Target()
  {
    return (EReference)arrayMappedEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitFlagsEntryValue()
  {
    return bitFlagsEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitFlagsEntryValue_Target()
  {
    return (EReference)bitFlagsEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateEntryValue()
  {
    return dateEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameEnumEntryValue()
  {
    return nameEnumEntryValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameEnumEntryValue_Target()
  {
    return (EReference)nameEnumEntryValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumEntryValue_HasMustBe()
  {
    return (EAttribute)nameEnumEntryValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumEntryValue_RequiredValue()
  {
    return (EAttribute)nameEnumEntryValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumEntryValue_HasDefault()
  {
    return (EAttribute)nameEnumEntryValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameEnumEntryValue_DefaultValue()
  {
    return (EAttribute)nameEnumEntryValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteral()
  {
    return intLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteral_Value()
  {
    return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealLiteral()
  {
    return realLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealLiteral_Value()
  {
    return (EAttribute)realLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIndirectReference()
  {
    return indirectReferenceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSinceVersion()
  {
    return sinceVersionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBool()
  {
    return boolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfmodelFactory getPdfmodelFactory()
  {
    return (PdfmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pdfModelEClass = createEClass(PDF_MODEL);
    createEReference(pdfModelEClass, PDF_MODEL__PACKAGES);

    abstractDeclarationEClass = createEClass(ABSTRACT_DECLARATION);
    createEAttribute(abstractDeclarationEClass, ABSTRACT_DECLARATION__NAME);
    createEAttribute(abstractDeclarationEClass, ABSTRACT_DECLARATION__SINCE);

    specificationReferenceEClass = createEClass(SPECIFICATION_REFERENCE);
    createEReference(specificationReferenceEClass, SPECIFICATION_REFERENCE__SECTION);
    createEAttribute(specificationReferenceEClass, SPECIFICATION_REFERENCE__TABLE);

    sectionReferenceEClass = createEClass(SECTION_REFERENCE);
    createEAttribute(sectionReferenceEClass, SECTION_REFERENCE__SECTION);

    arrayMappedDeclarationEClass = createEClass(ARRAY_MAPPED_DECLARATION);
    createEReference(arrayMappedDeclarationEClass, ARRAY_MAPPED_DECLARATION__ENTRIES);

    abstractEntryEClass = createEClass(ABSTRACT_ENTRY);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__CACHED);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__REQUIRED);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__INDIRECT_REFERENCE);
    createEReference(abstractEntryEClass, ABSTRACT_ENTRY__VALUE);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__SINCE);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__REQUIRES_CUSTOM_VALIDATION);
    createEAttribute(abstractEntryEClass, ABSTRACT_ENTRY__REQUIRES_CUSTOM_DEFAULT);

    arrayMappedEntryEClass = createEClass(ARRAY_MAPPED_ENTRY);
    createEAttribute(arrayMappedEntryEClass, ARRAY_MAPPED_ENTRY__INDEX);
    createEAttribute(arrayMappedEntryEClass, ARRAY_MAPPED_ENTRY__NAME);
    createEAttribute(arrayMappedEntryEClass, ARRAY_MAPPED_ENTRY__NULLABLE);

    dictionaryDeclarationEClass = createEClass(DICTIONARY_DECLARATION);
    createEAttribute(dictionaryDeclarationEClass, DICTIONARY_DECLARATION__STREAM);
    createEReference(dictionaryDeclarationEClass, DICTIONARY_DECLARATION__SUPER_TYPES);
    createEReference(dictionaryDeclarationEClass, DICTIONARY_DECLARATION__SUBTYPE_CONFIG);
    createEReference(dictionaryDeclarationEClass, DICTIONARY_DECLARATION__ENTRIES);

    subtypeConfigEClass = createEClass(SUBTYPE_CONFIG);
    createEReference(subtypeConfigEClass, SUBTYPE_CONFIG__CANDIDATES);

    dictionaryEntryEClass = createEClass(DICTIONARY_ENTRY);
    createEAttribute(dictionaryEntryEClass, DICTIONARY_ENTRY__KEY);
    createEAttribute(dictionaryEntryEClass, DICTIONARY_ENTRY__ALIAS);
    createEAttribute(dictionaryEntryEClass, DICTIONARY_ENTRY__INHERITABLE);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    bitFlagsDeclarationEClass = createEClass(BIT_FLAGS_DECLARATION);
    createEReference(bitFlagsDeclarationEClass, BIT_FLAGS_DECLARATION__SPECIFICATION_REFERENCE);
    createEReference(bitFlagsDeclarationEClass, BIT_FLAGS_DECLARATION__DECLARATIONS);

    bitFlagsDeclarationPartEClass = createEClass(BIT_FLAGS_DECLARATION_PART);
    createEAttribute(bitFlagsDeclarationPartEClass, BIT_FLAGS_DECLARATION_PART__INDEX);
    createEAttribute(bitFlagsDeclarationPartEClass, BIT_FLAGS_DECLARATION_PART__NAME);
    createEAttribute(bitFlagsDeclarationPartEClass, BIT_FLAGS_DECLARATION_PART__SINCE);

    nameEnumDeclarationEClass = createEClass(NAME_ENUM_DECLARATION);
    createEReference(nameEnumDeclarationEClass, NAME_ENUM_DECLARATION__DECLARATIONS);

    nameEnumDeclarationPartEClass = createEClass(NAME_ENUM_DECLARATION_PART);
    createEAttribute(nameEnumDeclarationPartEClass, NAME_ENUM_DECLARATION_PART__CONSTANT);
    createEAttribute(nameEnumDeclarationPartEClass, NAME_ENUM_DECLARATION_PART__ALIAS);
    createEAttribute(nameEnumDeclarationPartEClass, NAME_ENUM_DECLARATION_PART__SINCE);

    abstractEntryValueEClass = createEClass(ABSTRACT_ENTRY_VALUE);

    nullObjectEntryValueEClass = createEClass(NULL_OBJECT_ENTRY_VALUE);

    nameObjectEntryValueEClass = createEClass(NAME_OBJECT_ENTRY_VALUE);
    createEAttribute(nameObjectEntryValueEClass, NAME_OBJECT_ENTRY_VALUE__HAS_MUST_BE);
    createEAttribute(nameObjectEntryValueEClass, NAME_OBJECT_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(nameObjectEntryValueEClass, NAME_OBJECT_ENTRY_VALUE__HAS_DEFAULT);
    createEAttribute(nameObjectEntryValueEClass, NAME_OBJECT_ENTRY_VALUE__DEFAULT_VALUE);

    numberObjectEntryValueEClass = createEClass(NUMBER_OBJECT_ENTRY_VALUE);
    createEReference(numberObjectEntryValueEClass, NUMBER_OBJECT_ENTRY_VALUE__RULE);
    createEAttribute(numberObjectEntryValueEClass, NUMBER_OBJECT_ENTRY_VALUE__HAS_MUST_BE);
    createEReference(numberObjectEntryValueEClass, NUMBER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(numberObjectEntryValueEClass, NUMBER_OBJECT_ENTRY_VALUE__HAS_DEFAULT);
    createEReference(numberObjectEntryValueEClass, NUMBER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE);

    numberValidationRuleEClass = createEClass(NUMBER_VALIDATION_RULE);

    numberInclusiveRangeValidationRuleEClass = createEClass(NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE);
    createEReference(numberInclusiveRangeValidationRuleEClass, NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND);
    createEReference(numberInclusiveRangeValidationRuleEClass, NUMBER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND);

    numberGreaterValidationRuleEClass = createEClass(NUMBER_GREATER_VALIDATION_RULE);
    createEReference(numberGreaterValidationRuleEClass, NUMBER_GREATER_VALIDATION_RULE__MIN_VALUE);

    numberGreaterEqualsValidationRuleEClass = createEClass(NUMBER_GREATER_EQUALS_VALIDATION_RULE);
    createEReference(numberGreaterEqualsValidationRuleEClass, NUMBER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE);

    numberValuesValidationRuleEClass = createEClass(NUMBER_VALUES_VALIDATION_RULE);
    createEReference(numberValuesValidationRuleEClass, NUMBER_VALUES_VALIDATION_RULE__VALUE);

    numberValuesValidationRuleEntryEClass = createEClass(NUMBER_VALUES_VALIDATION_RULE_ENTRY);
    createEReference(numberValuesValidationRuleEntryEClass, NUMBER_VALUES_VALIDATION_RULE_ENTRY__VALUE);
    createEAttribute(numberValuesValidationRuleEntryEClass, NUMBER_VALUES_VALIDATION_RULE_ENTRY__SINCE);

    integerObjectEntryValueEClass = createEClass(INTEGER_OBJECT_ENTRY_VALUE);
    createEReference(integerObjectEntryValueEClass, INTEGER_OBJECT_ENTRY_VALUE__RULE);
    createEAttribute(integerObjectEntryValueEClass, INTEGER_OBJECT_ENTRY_VALUE__HAS_MUST_BE);
    createEReference(integerObjectEntryValueEClass, INTEGER_OBJECT_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(integerObjectEntryValueEClass, INTEGER_OBJECT_ENTRY_VALUE__HAS_DEFAULT);
    createEReference(integerObjectEntryValueEClass, INTEGER_OBJECT_ENTRY_VALUE__DEFAULT_VALUE);

    integerValidationRuleEClass = createEClass(INTEGER_VALIDATION_RULE);

    integerInclusiveRangeValidationRuleEClass = createEClass(INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE);
    createEReference(integerInclusiveRangeValidationRuleEClass, INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__LOWER_BOUND);
    createEReference(integerInclusiveRangeValidationRuleEClass, INTEGER_INCLUSIVE_RANGE_VALIDATION_RULE__UPPER_BOUND);

    integerValuesValidationRuleEClass = createEClass(INTEGER_VALUES_VALIDATION_RULE);
    createEReference(integerValuesValidationRuleEClass, INTEGER_VALUES_VALIDATION_RULE__VALUE);

    integerGreaterValidationRuleEClass = createEClass(INTEGER_GREATER_VALIDATION_RULE);
    createEReference(integerGreaterValidationRuleEClass, INTEGER_GREATER_VALIDATION_RULE__MIN_VALUE);

    integerGreaterEqualsValidationRuleEClass = createEClass(INTEGER_GREATER_EQUALS_VALIDATION_RULE);
    createEReference(integerGreaterEqualsValidationRuleEClass, INTEGER_GREATER_EQUALS_VALIDATION_RULE__MIN_VALUE);

    integerValuesValidationRuleEntryEClass = createEClass(INTEGER_VALUES_VALIDATION_RULE_ENTRY);
    createEReference(integerValuesValidationRuleEntryEClass, INTEGER_VALUES_VALIDATION_RULE_ENTRY__VALUE);
    createEAttribute(integerValuesValidationRuleEntryEClass, INTEGER_VALUES_VALIDATION_RULE_ENTRY__SINCE);

    realObjectEntryValueEClass = createEClass(REAL_OBJECT_ENTRY_VALUE);
    createEAttribute(realObjectEntryValueEClass, REAL_OBJECT_ENTRY_VALUE__HAS_MUST_BE);
    createEReference(realObjectEntryValueEClass, REAL_OBJECT_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(realObjectEntryValueEClass, REAL_OBJECT_ENTRY_VALUE__HAS_DEFAULT);
    createEReference(realObjectEntryValueEClass, REAL_OBJECT_ENTRY_VALUE__DEFAULT_VALUE);

    nameTreeEntryValueEClass = createEClass(NAME_TREE_ENTRY_VALUE);

    numberTreeEntryValueEClass = createEClass(NUMBER_TREE_ENTRY_VALUE);

    arrayEntryValueEClass = createEClass(ARRAY_ENTRY_VALUE);
    createEReference(arrayEntryValueEClass, ARRAY_ENTRY_VALUE__RULE);
    createEAttribute(arrayEntryValueEClass, ARRAY_ENTRY_VALUE__INDIRECT_REFERENCE);
    createEReference(arrayEntryValueEClass, ARRAY_ENTRY_VALUE__TYPE);
    createEAttribute(arrayEntryValueEClass, ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION);
    createEAttribute(arrayEntryValueEClass, ARRAY_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT);

    arrayValidationRuleEClass = createEClass(ARRAY_VALIDATION_RULE);

    arrayLengthValidationRuleEClass = createEClass(ARRAY_LENGTH_VALIDATION_RULE);
    createEAttribute(arrayLengthValidationRuleEClass, ARRAY_LENGTH_VALIDATION_RULE__LENGTH);

    objectEntryValueEClass = createEClass(OBJECT_ENTRY_VALUE);

    mappingDictEntryValueEClass = createEClass(MAPPING_DICT_ENTRY_VALUE);
    createEReference(mappingDictEntryValueEClass, MAPPING_DICT_ENTRY_VALUE__TYPE);
    createEAttribute(mappingDictEntryValueEClass, MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_VALIDATION);
    createEAttribute(mappingDictEntryValueEClass, MAPPING_DICT_ENTRY_VALUE__REQUIRES_CUSTOM_DEFAULT);

    stringEntryValueEClass = createEClass(STRING_ENTRY_VALUE);
    createEAttribute(stringEntryValueEClass, STRING_ENTRY_VALUE__TEXT_STRING);
    createEAttribute(stringEntryValueEClass, STRING_ENTRY_VALUE__ASCII_STRING);
    createEAttribute(stringEntryValueEClass, STRING_ENTRY_VALUE__BYTE_STRING);
    createEReference(stringEntryValueEClass, STRING_ENTRY_VALUE__RULE);

    stringValidationRuleEClass = createEClass(STRING_VALIDATION_RULE);

    stringLengthValidationRuleEClass = createEClass(STRING_LENGTH_VALIDATION_RULE);
    createEReference(stringLengthValidationRuleEClass, STRING_LENGTH_VALIDATION_RULE__LENGTH);

    alternativeEntryValueEClass = createEClass(ALTERNATIVE_ENTRY_VALUE);
    createEReference(alternativeEntryValueEClass, ALTERNATIVE_ENTRY_VALUE__OPTIONS);

    booleanEntryValueEClass = createEClass(BOOLEAN_ENTRY_VALUE);
    createEAttribute(booleanEntryValueEClass, BOOLEAN_ENTRY_VALUE__HAS_MUST_BE);
    createEAttribute(booleanEntryValueEClass, BOOLEAN_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(booleanEntryValueEClass, BOOLEAN_ENTRY_VALUE__HAS_DEFAULT);
    createEAttribute(booleanEntryValueEClass, BOOLEAN_ENTRY_VALUE__DEFAULT_VALUE);

    referenceEntryValueEClass = createEClass(REFERENCE_ENTRY_VALUE);

    parentReferenceEntryValueEClass = createEClass(PARENT_REFERENCE_ENTRY_VALUE);
    createEReference(parentReferenceEntryValueEClass, PARENT_REFERENCE_ENTRY_VALUE__PARENT_TYPE);

    dictionaryObjectEntryValueEClass = createEClass(DICTIONARY_OBJECT_ENTRY_VALUE);

    dictionaryDeclarationEntryValueEClass = createEClass(DICTIONARY_DECLARATION_ENTRY_VALUE);
    createEReference(dictionaryDeclarationEntryValueEClass, DICTIONARY_DECLARATION_ENTRY_VALUE__TARGET);

    arrayMappedEntryValueEClass = createEClass(ARRAY_MAPPED_ENTRY_VALUE);
    createEReference(arrayMappedEntryValueEClass, ARRAY_MAPPED_ENTRY_VALUE__TARGET);

    bitFlagsEntryValueEClass = createEClass(BIT_FLAGS_ENTRY_VALUE);
    createEReference(bitFlagsEntryValueEClass, BIT_FLAGS_ENTRY_VALUE__TARGET);

    dateEntryValueEClass = createEClass(DATE_ENTRY_VALUE);

    nameEnumEntryValueEClass = createEClass(NAME_ENUM_ENTRY_VALUE);
    createEReference(nameEnumEntryValueEClass, NAME_ENUM_ENTRY_VALUE__TARGET);
    createEAttribute(nameEnumEntryValueEClass, NAME_ENUM_ENTRY_VALUE__HAS_MUST_BE);
    createEAttribute(nameEnumEntryValueEClass, NAME_ENUM_ENTRY_VALUE__REQUIRED_VALUE);
    createEAttribute(nameEnumEntryValueEClass, NAME_ENUM_ENTRY_VALUE__HAS_DEFAULT);
    createEAttribute(nameEnumEntryValueEClass, NAME_ENUM_ENTRY_VALUE__DEFAULT_VALUE);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);

    intLiteralEClass = createEClass(INT_LITERAL);
    createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

    realLiteralEClass = createEClass(REAL_LITERAL);
    createEAttribute(realLiteralEClass, REAL_LITERAL__VALUE);

    // Create enums
    indirectReferenceEEnum = createEEnum(INDIRECT_REFERENCE);
    sinceVersionEEnum = createEEnum(SINCE_VERSION);
    boolEEnum = createEEnum(BOOL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    arrayMappedDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    arrayMappedEntryEClass.getESuperTypes().add(this.getAbstractEntry());
    dictionaryDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    dictionaryEntryEClass.getESuperTypes().add(this.getAbstractEntry());
    bitFlagsDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    nameEnumDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    nullObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    nameObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    numberObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    numberInclusiveRangeValidationRuleEClass.getESuperTypes().add(this.getNumberValidationRule());
    numberGreaterValidationRuleEClass.getESuperTypes().add(this.getNumberValidationRule());
    numberGreaterEqualsValidationRuleEClass.getESuperTypes().add(this.getNumberValidationRule());
    numberValuesValidationRuleEClass.getESuperTypes().add(this.getNumberValidationRule());
    integerObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    integerInclusiveRangeValidationRuleEClass.getESuperTypes().add(this.getIntegerValidationRule());
    integerValuesValidationRuleEClass.getESuperTypes().add(this.getIntegerValidationRule());
    integerGreaterValidationRuleEClass.getESuperTypes().add(this.getIntegerValidationRule());
    integerGreaterEqualsValidationRuleEClass.getESuperTypes().add(this.getIntegerValidationRule());
    realObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    nameTreeEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    numberTreeEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    arrayEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    arrayLengthValidationRuleEClass.getESuperTypes().add(this.getArrayValidationRule());
    objectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    mappingDictEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    stringEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    stringLengthValidationRuleEClass.getESuperTypes().add(this.getStringValidationRule());
    alternativeEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    booleanEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    referenceEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    parentReferenceEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    dictionaryObjectEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    dictionaryDeclarationEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    arrayMappedEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    bitFlagsEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    dateEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    nameEnumEntryValueEClass.getESuperTypes().add(this.getAbstractEntryValue());
    intLiteralEClass.getESuperTypes().add(this.getNumberLiteral());
    realLiteralEClass.getESuperTypes().add(this.getNumberLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(pdfModelEClass, PDFModel.class, "PDFModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPDFModel_Packages(), this.getPackageDeclaration(), null, "packages", null, 0, -1, PDFModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeclarationEClass, AbstractDeclaration.class, "AbstractDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractDeclaration_Since(), this.getSinceVersion(), "since", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificationReferenceEClass, SpecificationReference.class, "SpecificationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecificationReference_Section(), this.getSectionReference(), null, "section", null, 0, 1, SpecificationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecificationReference_Table(), ecorePackage.getEInt(), "table", null, 0, 1, SpecificationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionReferenceEClass, SectionReference.class, "SectionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSectionReference_Section(), ecorePackage.getEString(), "section", null, 0, 1, SectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayMappedDeclarationEClass, ArrayMappedDeclaration.class, "ArrayMappedDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayMappedDeclaration_Entries(), this.getArrayMappedEntry(), null, "entries", null, 0, -1, ArrayMappedDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractEntryEClass, AbstractEntry.class, "AbstractEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractEntry_Cached(), ecorePackage.getEBoolean(), "cached", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractEntry_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractEntry_IndirectReference(), this.getIndirectReference(), "indirectReference", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractEntry_Value(), this.getAbstractEntryValue(), null, "value", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractEntry_Since(), this.getSinceVersion(), "since", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractEntry_RequiresCustomValidation(), ecorePackage.getEBoolean(), "requiresCustomValidation", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractEntry_RequiresCustomDefault(), ecorePackage.getEBoolean(), "requiresCustomDefault", null, 0, 1, AbstractEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayMappedEntryEClass, ArrayMappedEntry.class, "ArrayMappedEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayMappedEntry_Index(), ecorePackage.getEInt(), "index", null, 0, 1, ArrayMappedEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayMappedEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArrayMappedEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayMappedEntry_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, ArrayMappedEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dictionaryDeclarationEClass, DictionaryDeclaration.class, "DictionaryDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDictionaryDeclaration_Stream(), ecorePackage.getEBoolean(), "stream", null, 0, 1, DictionaryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDictionaryDeclaration_SuperTypes(), this.getDictionaryDeclaration(), null, "superTypes", null, 0, -1, DictionaryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDictionaryDeclaration_SubtypeConfig(), this.getSubtypeConfig(), null, "subtypeConfig", null, 0, 1, DictionaryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDictionaryDeclaration_Entries(), this.getDictionaryEntry(), null, "entries", null, 0, -1, DictionaryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subtypeConfigEClass, SubtypeConfig.class, "SubtypeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubtypeConfig_Candidates(), this.getDictionaryDeclaration(), null, "candidates", null, 0, -1, SubtypeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dictionaryEntryEClass, DictionaryEntry.class, "DictionaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDictionaryEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, DictionaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDictionaryEntry_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, DictionaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDictionaryEntry_Inheritable(), ecorePackage.getEBoolean(), "inheritable", null, 0, 1, DictionaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractDeclaration(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitFlagsDeclarationEClass, BitFlagsDeclaration.class, "BitFlagsDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitFlagsDeclaration_SpecificationReference(), this.getSpecificationReference(), null, "specificationReference", null, 0, 1, BitFlagsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBitFlagsDeclaration_Declarations(), this.getBitFlagsDeclarationPart(), null, "declarations", null, 0, -1, BitFlagsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitFlagsDeclarationPartEClass, BitFlagsDeclarationPart.class, "BitFlagsDeclarationPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBitFlagsDeclarationPart_Index(), ecorePackage.getEInt(), "index", null, 0, 1, BitFlagsDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBitFlagsDeclarationPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, BitFlagsDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBitFlagsDeclarationPart_Since(), this.getSinceVersion(), "since", null, 0, 1, BitFlagsDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEnumDeclarationEClass, NameEnumDeclaration.class, "NameEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameEnumDeclaration_Declarations(), this.getNameEnumDeclarationPart(), null, "declarations", null, 0, -1, NameEnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEnumDeclarationPartEClass, NameEnumDeclarationPart.class, "NameEnumDeclarationPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameEnumDeclarationPart_Constant(), ecorePackage.getEString(), "constant", null, 0, 1, NameEnumDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumDeclarationPart_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, NameEnumDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumDeclarationPart_Since(), this.getSinceVersion(), "since", null, 0, 1, NameEnumDeclarationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractEntryValueEClass, AbstractEntryValue.class, "AbstractEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullObjectEntryValueEClass, NullObjectEntryValue.class, "NullObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameObjectEntryValueEClass, NameObjectEntryValue.class, "NameObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameObjectEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, NameObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameObjectEntryValue_RequiredValue(), ecorePackage.getEString(), "requiredValue", null, 0, 1, NameObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameObjectEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, NameObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameObjectEntryValue_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NameObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberObjectEntryValueEClass, NumberObjectEntryValue.class, "NumberObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberObjectEntryValue_Rule(), this.getNumberValidationRule(), null, "rule", null, 0, 1, NumberObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberObjectEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, NumberObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberObjectEntryValue_RequiredValue(), this.getNumberLiteral(), null, "requiredValue", null, 0, 1, NumberObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberObjectEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, NumberObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberObjectEntryValue_DefaultValue(), this.getNumberLiteral(), null, "defaultValue", null, 0, 1, NumberObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberValidationRuleEClass, NumberValidationRule.class, "NumberValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberInclusiveRangeValidationRuleEClass, NumberInclusiveRangeValidationRule.class, "NumberInclusiveRangeValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberInclusiveRangeValidationRule_LowerBound(), this.getNumberLiteral(), null, "lowerBound", null, 0, 1, NumberInclusiveRangeValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberInclusiveRangeValidationRule_UpperBound(), this.getNumberLiteral(), null, "upperBound", null, 0, 1, NumberInclusiveRangeValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberGreaterValidationRuleEClass, NumberGreaterValidationRule.class, "NumberGreaterValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberGreaterValidationRule_MinValue(), this.getNumberLiteral(), null, "minValue", null, 0, 1, NumberGreaterValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberGreaterEqualsValidationRuleEClass, NumberGreaterEqualsValidationRule.class, "NumberGreaterEqualsValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberGreaterEqualsValidationRule_MinValue(), this.getNumberLiteral(), null, "minValue", null, 0, 1, NumberGreaterEqualsValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberValuesValidationRuleEClass, NumberValuesValidationRule.class, "NumberValuesValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberValuesValidationRule_Value(), this.getNumberValuesValidationRuleEntry(), null, "value", null, 0, -1, NumberValuesValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberValuesValidationRuleEntryEClass, NumberValuesValidationRuleEntry.class, "NumberValuesValidationRuleEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberValuesValidationRuleEntry_Value(), this.getNumberLiteral(), null, "value", null, 0, 1, NumberValuesValidationRuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberValuesValidationRuleEntry_Since(), this.getSinceVersion(), "since", null, 0, 1, NumberValuesValidationRuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerObjectEntryValueEClass, IntegerObjectEntryValue.class, "IntegerObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerObjectEntryValue_Rule(), this.getIntegerValidationRule(), null, "rule", null, 0, 1, IntegerObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerObjectEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, IntegerObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerObjectEntryValue_RequiredValue(), this.getIntLiteral(), null, "requiredValue", null, 0, 1, IntegerObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerObjectEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, IntegerObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerObjectEntryValue_DefaultValue(), this.getIntLiteral(), null, "defaultValue", null, 0, 1, IntegerObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValidationRuleEClass, IntegerValidationRule.class, "IntegerValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerInclusiveRangeValidationRuleEClass, IntegerInclusiveRangeValidationRule.class, "IntegerInclusiveRangeValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerInclusiveRangeValidationRule_LowerBound(), this.getIntLiteral(), null, "lowerBound", null, 0, 1, IntegerInclusiveRangeValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerInclusiveRangeValidationRule_UpperBound(), this.getIntLiteral(), null, "upperBound", null, 0, 1, IntegerInclusiveRangeValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValuesValidationRuleEClass, IntegerValuesValidationRule.class, "IntegerValuesValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerValuesValidationRule_Value(), this.getIntegerValuesValidationRuleEntry(), null, "value", null, 0, -1, IntegerValuesValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerGreaterValidationRuleEClass, IntegerGreaterValidationRule.class, "IntegerGreaterValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerGreaterValidationRule_MinValue(), this.getIntLiteral(), null, "minValue", null, 0, 1, IntegerGreaterValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerGreaterEqualsValidationRuleEClass, IntegerGreaterEqualsValidationRule.class, "IntegerGreaterEqualsValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerGreaterEqualsValidationRule_MinValue(), this.getNumberLiteral(), null, "minValue", null, 0, 1, IntegerGreaterEqualsValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValuesValidationRuleEntryEClass, IntegerValuesValidationRuleEntry.class, "IntegerValuesValidationRuleEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerValuesValidationRuleEntry_Value(), this.getIntLiteral(), null, "value", null, 0, 1, IntegerValuesValidationRuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerValuesValidationRuleEntry_Since(), this.getSinceVersion(), "since", null, 0, 1, IntegerValuesValidationRuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realObjectEntryValueEClass, RealObjectEntryValue.class, "RealObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealObjectEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, RealObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRealObjectEntryValue_RequiredValue(), this.getRealLiteral(), null, "requiredValue", null, 0, 1, RealObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRealObjectEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, RealObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRealObjectEntryValue_DefaultValue(), this.getRealLiteral(), null, "defaultValue", null, 0, 1, RealObjectEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameTreeEntryValueEClass, NameTreeEntryValue.class, "NameTreeEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberTreeEntryValueEClass, NumberTreeEntryValue.class, "NumberTreeEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayEntryValueEClass, ArrayEntryValue.class, "ArrayEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayEntryValue_Rule(), this.getArrayValidationRule(), null, "rule", null, 0, 1, ArrayEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayEntryValue_IndirectReference(), this.getIndirectReference(), "indirectReference", null, 0, 1, ArrayEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayEntryValue_Type(), this.getAbstractEntryValue(), null, "type", null, 0, 1, ArrayEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayEntryValue_RequiresCustomValidation(), ecorePackage.getEBoolean(), "requiresCustomValidation", null, 0, 1, ArrayEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayEntryValue_RequiresCustomDefault(), ecorePackage.getEBoolean(), "requiresCustomDefault", null, 0, 1, ArrayEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayValidationRuleEClass, ArrayValidationRule.class, "ArrayValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayLengthValidationRuleEClass, ArrayLengthValidationRule.class, "ArrayLengthValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayLengthValidationRule_Length(), ecorePackage.getEInt(), "length", null, 0, 1, ArrayLengthValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectEntryValueEClass, ObjectEntryValue.class, "ObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mappingDictEntryValueEClass, MappingDictEntryValue.class, "MappingDictEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingDictEntryValue_Type(), this.getAbstractEntryValue(), null, "type", null, 0, 1, MappingDictEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingDictEntryValue_RequiresCustomValidation(), ecorePackage.getEBoolean(), "requiresCustomValidation", null, 0, 1, MappingDictEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingDictEntryValue_RequiresCustomDefault(), ecorePackage.getEBoolean(), "requiresCustomDefault", null, 0, 1, MappingDictEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringEntryValueEClass, StringEntryValue.class, "StringEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringEntryValue_TextString(), ecorePackage.getEBoolean(), "textString", null, 0, 1, StringEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringEntryValue_AsciiString(), ecorePackage.getEBoolean(), "asciiString", null, 0, 1, StringEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringEntryValue_ByteString(), ecorePackage.getEBoolean(), "byteString", null, 0, 1, StringEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringEntryValue_Rule(), this.getStringValidationRule(), null, "rule", null, 0, 1, StringEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValidationRuleEClass, StringValidationRule.class, "StringValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLengthValidationRuleEClass, StringLengthValidationRule.class, "StringLengthValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringLengthValidationRule_Length(), this.getIntLiteral(), null, "length", null, 0, 1, StringLengthValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeEntryValueEClass, AlternativeEntryValue.class, "AlternativeEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlternativeEntryValue_Options(), this.getAbstractEntryValue(), null, "options", null, 0, -1, AlternativeEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanEntryValueEClass, BooleanEntryValue.class, "BooleanEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, BooleanEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanEntryValue_RequiredValue(), this.getBool(), "requiredValue", null, 0, 1, BooleanEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, BooleanEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanEntryValue_DefaultValue(), this.getBool(), "defaultValue", null, 0, 1, BooleanEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEntryValueEClass, ReferenceEntryValue.class, "ReferenceEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parentReferenceEntryValueEClass, ParentReferenceEntryValue.class, "ParentReferenceEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParentReferenceEntryValue_ParentType(), this.getDictionaryDeclaration(), null, "parentType", null, 0, 1, ParentReferenceEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dictionaryObjectEntryValueEClass, DictionaryObjectEntryValue.class, "DictionaryObjectEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dictionaryDeclarationEntryValueEClass, DictionaryDeclarationEntryValue.class, "DictionaryDeclarationEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDictionaryDeclarationEntryValue_Target(), this.getDictionaryDeclaration(), null, "target", null, 0, 1, DictionaryDeclarationEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayMappedEntryValueEClass, ArrayMappedEntryValue.class, "ArrayMappedEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayMappedEntryValue_Target(), this.getArrayMappedDeclaration(), null, "target", null, 0, 1, ArrayMappedEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitFlagsEntryValueEClass, BitFlagsEntryValue.class, "BitFlagsEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitFlagsEntryValue_Target(), this.getBitFlagsDeclaration(), null, "target", null, 0, 1, BitFlagsEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEntryValueEClass, DateEntryValue.class, "DateEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameEnumEntryValueEClass, NameEnumEntryValue.class, "NameEnumEntryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameEnumEntryValue_Target(), this.getNameEnumDeclaration(), null, "target", null, 0, 1, NameEnumEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumEntryValue_HasMustBe(), ecorePackage.getEBoolean(), "hasMustBe", null, 0, 1, NameEnumEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumEntryValue_RequiredValue(), ecorePackage.getEString(), "requiredValue", null, 0, 1, NameEnumEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumEntryValue_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, NameEnumEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameEnumEntryValue_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NameEnumEntryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(indirectReferenceEEnum, IndirectReference.class, "IndirectReference");
    addEEnumLiteral(indirectReferenceEEnum, IndirectReference.UNDEFINED);
    addEEnumLiteral(indirectReferenceEEnum, IndirectReference.INDIRECT_SHALL);
    addEEnumLiteral(indirectReferenceEEnum, IndirectReference.INDIRECT_SHALL_NOT);
    addEEnumLiteral(indirectReferenceEEnum, IndirectReference.INDIRECT_SHOULD);

    initEEnum(sinceVersionEEnum, SinceVersion.class, "SinceVersion");
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.UNDEFINED);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_10);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_11);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_12);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_13);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_14);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_15);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_16);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_17);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_32000_1);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_20);
    addEEnumLiteral(sinceVersionEEnum, SinceVersion.PDF_32000_2);

    initEEnum(boolEEnum, Bool.class, "Bool");
    addEEnumLiteral(boolEEnum, Bool.TRUE);
    addEEnumLiteral(boolEEnum, Bool.FALSE);

    // Create resource
    createResource(eNS_URI);
  }

} //PdfmodelPackageImpl
