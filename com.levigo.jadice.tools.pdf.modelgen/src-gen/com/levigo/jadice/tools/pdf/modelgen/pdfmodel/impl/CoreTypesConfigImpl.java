/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.CoreTypesConfig;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Types Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getObjectTypeName <em>Object Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getReferenceTypeName <em>Reference Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getDictionaryTypeName <em>Dictionary Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNameTypeName <em>Name Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getStringTypeName <em>String Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getLiteralStringTypeName <em>Literal String Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getHexStringTypeName <em>Hex String Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getArrayTypeName <em>Array Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getBooleanTypeName <em>Boolean Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNumberTypeName <em>Number Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getRealTypeName <em>Real Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getIntegerTypeName <em>Integer Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNullTypeName <em>Null Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getStreamTypeName <em>Stream Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNameTreeTypeName <em>Name Tree Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNumberTreeTypeName <em>Number Tree Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNameTreeParserTypeName <em>Name Tree Parser Type Name</em>}</li>
 *   <li>{@link com.levigo.jadice.tools.pdf.modelgen.pdfmodel.impl.CoreTypesConfigImpl#getNumberTreeParserTypeName <em>Number Tree Parser Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreTypesConfigImpl extends MinimalEObjectImpl.Container implements CoreTypesConfig
{
  /**
   * The default value of the '{@link #getObjectTypeName() <em>Object Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectTypeName()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectTypeName() <em>Object Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectTypeName()
   * @generated
   * @ordered
   */
  protected String objectTypeName = OBJECT_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReferenceTypeName() <em>Reference Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceTypeName()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceTypeName() <em>Reference Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceTypeName()
   * @generated
   * @ordered
   */
  protected String referenceTypeName = REFERENCE_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDictionaryTypeName() <em>Dictionary Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionaryTypeName()
   * @generated
   * @ordered
   */
  protected static final String DICTIONARY_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDictionaryTypeName() <em>Dictionary Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionaryTypeName()
   * @generated
   * @ordered
   */
  protected String dictionaryTypeName = DICTIONARY_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNameTypeName() <em>Name Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTypeName()
   * @generated
   * @ordered
   */
  protected static final String NAME_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameTypeName() <em>Name Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTypeName()
   * @generated
   * @ordered
   */
  protected String nameTypeName = NAME_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStringTypeName() <em>String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringTypeName()
   * @generated
   * @ordered
   */
  protected static final String STRING_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringTypeName() <em>String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringTypeName()
   * @generated
   * @ordered
   */
  protected String stringTypeName = STRING_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLiteralStringTypeName() <em>Literal String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralStringTypeName()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_STRING_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteralStringTypeName() <em>Literal String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralStringTypeName()
   * @generated
   * @ordered
   */
  protected String literalStringTypeName = LITERAL_STRING_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHexStringTypeName() <em>Hex String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHexStringTypeName()
   * @generated
   * @ordered
   */
  protected static final String HEX_STRING_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHexStringTypeName() <em>Hex String Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHexStringTypeName()
   * @generated
   * @ordered
   */
  protected String hexStringTypeName = HEX_STRING_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getArrayTypeName() <em>Array Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayTypeName()
   * @generated
   * @ordered
   */
  protected static final String ARRAY_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArrayTypeName() <em>Array Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayTypeName()
   * @generated
   * @ordered
   */
  protected String arrayTypeName = ARRAY_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanTypeName() <em>Boolean Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanTypeName()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBooleanTypeName() <em>Boolean Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanTypeName()
   * @generated
   * @ordered
   */
  protected String booleanTypeName = BOOLEAN_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberTypeName() <em>Number Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTypeName()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumberTypeName() <em>Number Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTypeName()
   * @generated
   * @ordered
   */
  protected String numberTypeName = NUMBER_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRealTypeName() <em>Real Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealTypeName()
   * @generated
   * @ordered
   */
  protected static final String REAL_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRealTypeName() <em>Real Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealTypeName()
   * @generated
   * @ordered
   */
  protected String realTypeName = REAL_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIntegerTypeName() <em>Integer Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerTypeName()
   * @generated
   * @ordered
   */
  protected static final String INTEGER_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntegerTypeName() <em>Integer Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerTypeName()
   * @generated
   * @ordered
   */
  protected String integerTypeName = INTEGER_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNullTypeName() <em>Null Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullTypeName()
   * @generated
   * @ordered
   */
  protected static final String NULL_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullTypeName() <em>Null Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullTypeName()
   * @generated
   * @ordered
   */
  protected String nullTypeName = NULL_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStreamTypeName() <em>Stream Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamTypeName()
   * @generated
   * @ordered
   */
  protected static final String STREAM_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStreamTypeName() <em>Stream Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamTypeName()
   * @generated
   * @ordered
   */
  protected String streamTypeName = STREAM_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNameTreeTypeName() <em>Name Tree Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTreeTypeName()
   * @generated
   * @ordered
   */
  protected static final String NAME_TREE_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameTreeTypeName() <em>Name Tree Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTreeTypeName()
   * @generated
   * @ordered
   */
  protected String nameTreeTypeName = NAME_TREE_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberTreeTypeName() <em>Number Tree Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTreeTypeName()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_TREE_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumberTreeTypeName() <em>Number Tree Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTreeTypeName()
   * @generated
   * @ordered
   */
  protected String numberTreeTypeName = NUMBER_TREE_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNameTreeParserTypeName() <em>Name Tree Parser Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTreeParserTypeName()
   * @generated
   * @ordered
   */
  protected static final String NAME_TREE_PARSER_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameTreeParserTypeName() <em>Name Tree Parser Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameTreeParserTypeName()
   * @generated
   * @ordered
   */
  protected String nameTreeParserTypeName = NAME_TREE_PARSER_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberTreeParserTypeName() <em>Number Tree Parser Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTreeParserTypeName()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_TREE_PARSER_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumberTreeParserTypeName() <em>Number Tree Parser Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberTreeParserTypeName()
   * @generated
   * @ordered
   */
  protected String numberTreeParserTypeName = NUMBER_TREE_PARSER_TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreTypesConfigImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PdfmodelPackage.Literals.CORE_TYPES_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectTypeName()
  {
    return objectTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectTypeName(String newObjectTypeName)
  {
    String oldObjectTypeName = objectTypeName;
    objectTypeName = newObjectTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__OBJECT_TYPE_NAME, oldObjectTypeName, objectTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceTypeName()
  {
    return referenceTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceTypeName(String newReferenceTypeName)
  {
    String oldReferenceTypeName = referenceTypeName;
    referenceTypeName = newReferenceTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__REFERENCE_TYPE_NAME, oldReferenceTypeName, referenceTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDictionaryTypeName()
  {
    return dictionaryTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDictionaryTypeName(String newDictionaryTypeName)
  {
    String oldDictionaryTypeName = dictionaryTypeName;
    dictionaryTypeName = newDictionaryTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__DICTIONARY_TYPE_NAME, oldDictionaryTypeName, dictionaryTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameTypeName()
  {
    return nameTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameTypeName(String newNameTypeName)
  {
    String oldNameTypeName = nameTypeName;
    nameTypeName = newNameTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TYPE_NAME, oldNameTypeName, nameTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringTypeName()
  {
    return stringTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringTypeName(String newStringTypeName)
  {
    String oldStringTypeName = stringTypeName;
    stringTypeName = newStringTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__STRING_TYPE_NAME, oldStringTypeName, stringTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteralStringTypeName()
  {
    return literalStringTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralStringTypeName(String newLiteralStringTypeName)
  {
    String oldLiteralStringTypeName = literalStringTypeName;
    literalStringTypeName = newLiteralStringTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__LITERAL_STRING_TYPE_NAME, oldLiteralStringTypeName, literalStringTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHexStringTypeName()
  {
    return hexStringTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHexStringTypeName(String newHexStringTypeName)
  {
    String oldHexStringTypeName = hexStringTypeName;
    hexStringTypeName = newHexStringTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__HEX_STRING_TYPE_NAME, oldHexStringTypeName, hexStringTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArrayTypeName()
  {
    return arrayTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayTypeName(String newArrayTypeName)
  {
    String oldArrayTypeName = arrayTypeName;
    arrayTypeName = newArrayTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__ARRAY_TYPE_NAME, oldArrayTypeName, arrayTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBooleanTypeName()
  {
    return booleanTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanTypeName(String newBooleanTypeName)
  {
    String oldBooleanTypeName = booleanTypeName;
    booleanTypeName = newBooleanTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__BOOLEAN_TYPE_NAME, oldBooleanTypeName, booleanTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumberTypeName()
  {
    return numberTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberTypeName(String newNumberTypeName)
  {
    String oldNumberTypeName = numberTypeName;
    numberTypeName = newNumberTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TYPE_NAME, oldNumberTypeName, numberTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRealTypeName()
  {
    return realTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealTypeName(String newRealTypeName)
  {
    String oldRealTypeName = realTypeName;
    realTypeName = newRealTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__REAL_TYPE_NAME, oldRealTypeName, realTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntegerTypeName()
  {
    return integerTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerTypeName(String newIntegerTypeName)
  {
    String oldIntegerTypeName = integerTypeName;
    integerTypeName = newIntegerTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__INTEGER_TYPE_NAME, oldIntegerTypeName, integerTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullTypeName()
  {
    return nullTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullTypeName(String newNullTypeName)
  {
    String oldNullTypeName = nullTypeName;
    nullTypeName = newNullTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NULL_TYPE_NAME, oldNullTypeName, nullTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStreamTypeName()
  {
    return streamTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreamTypeName(String newStreamTypeName)
  {
    String oldStreamTypeName = streamTypeName;
    streamTypeName = newStreamTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__STREAM_TYPE_NAME, oldStreamTypeName, streamTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameTreeTypeName()
  {
    return nameTreeTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameTreeTypeName(String newNameTreeTypeName)
  {
    String oldNameTreeTypeName = nameTreeTypeName;
    nameTreeTypeName = newNameTreeTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_TYPE_NAME, oldNameTreeTypeName, nameTreeTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumberTreeTypeName()
  {
    return numberTreeTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberTreeTypeName(String newNumberTreeTypeName)
  {
    String oldNumberTreeTypeName = numberTreeTypeName;
    numberTreeTypeName = newNumberTreeTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_TYPE_NAME, oldNumberTreeTypeName, numberTreeTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameTreeParserTypeName()
  {
    return nameTreeParserTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameTreeParserTypeName(String newNameTreeParserTypeName)
  {
    String oldNameTreeParserTypeName = nameTreeParserTypeName;
    nameTreeParserTypeName = newNameTreeParserTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_PARSER_TYPE_NAME, oldNameTreeParserTypeName, nameTreeParserTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumberTreeParserTypeName()
  {
    return numberTreeParserTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberTreeParserTypeName(String newNumberTreeParserTypeName)
  {
    String oldNumberTreeParserTypeName = numberTreeParserTypeName;
    numberTreeParserTypeName = newNumberTreeParserTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_PARSER_TYPE_NAME, oldNumberTreeParserTypeName, numberTreeParserTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdfmodelPackage.CORE_TYPES_CONFIG__OBJECT_TYPE_NAME:
        return getObjectTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__REFERENCE_TYPE_NAME:
        return getReferenceTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__DICTIONARY_TYPE_NAME:
        return getDictionaryTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TYPE_NAME:
        return getNameTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__STRING_TYPE_NAME:
        return getStringTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__LITERAL_STRING_TYPE_NAME:
        return getLiteralStringTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__HEX_STRING_TYPE_NAME:
        return getHexStringTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__ARRAY_TYPE_NAME:
        return getArrayTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__BOOLEAN_TYPE_NAME:
        return getBooleanTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TYPE_NAME:
        return getNumberTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__REAL_TYPE_NAME:
        return getRealTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__INTEGER_TYPE_NAME:
        return getIntegerTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NULL_TYPE_NAME:
        return getNullTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__STREAM_TYPE_NAME:
        return getStreamTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_TYPE_NAME:
        return getNameTreeTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_TYPE_NAME:
        return getNumberTreeTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_PARSER_TYPE_NAME:
        return getNameTreeParserTypeName();
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_PARSER_TYPE_NAME:
        return getNumberTreeParserTypeName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdfmodelPackage.CORE_TYPES_CONFIG__OBJECT_TYPE_NAME:
        setObjectTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__REFERENCE_TYPE_NAME:
        setReferenceTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__DICTIONARY_TYPE_NAME:
        setDictionaryTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TYPE_NAME:
        setNameTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__STRING_TYPE_NAME:
        setStringTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__LITERAL_STRING_TYPE_NAME:
        setLiteralStringTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__HEX_STRING_TYPE_NAME:
        setHexStringTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__ARRAY_TYPE_NAME:
        setArrayTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__BOOLEAN_TYPE_NAME:
        setBooleanTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TYPE_NAME:
        setNumberTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__REAL_TYPE_NAME:
        setRealTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__INTEGER_TYPE_NAME:
        setIntegerTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NULL_TYPE_NAME:
        setNullTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__STREAM_TYPE_NAME:
        setStreamTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_TYPE_NAME:
        setNameTreeTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_TYPE_NAME:
        setNumberTreeTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_PARSER_TYPE_NAME:
        setNameTreeParserTypeName((String)newValue);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_PARSER_TYPE_NAME:
        setNumberTreeParserTypeName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PdfmodelPackage.CORE_TYPES_CONFIG__OBJECT_TYPE_NAME:
        setObjectTypeName(OBJECT_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__REFERENCE_TYPE_NAME:
        setReferenceTypeName(REFERENCE_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__DICTIONARY_TYPE_NAME:
        setDictionaryTypeName(DICTIONARY_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TYPE_NAME:
        setNameTypeName(NAME_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__STRING_TYPE_NAME:
        setStringTypeName(STRING_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__LITERAL_STRING_TYPE_NAME:
        setLiteralStringTypeName(LITERAL_STRING_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__HEX_STRING_TYPE_NAME:
        setHexStringTypeName(HEX_STRING_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__ARRAY_TYPE_NAME:
        setArrayTypeName(ARRAY_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__BOOLEAN_TYPE_NAME:
        setBooleanTypeName(BOOLEAN_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TYPE_NAME:
        setNumberTypeName(NUMBER_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__REAL_TYPE_NAME:
        setRealTypeName(REAL_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__INTEGER_TYPE_NAME:
        setIntegerTypeName(INTEGER_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NULL_TYPE_NAME:
        setNullTypeName(NULL_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__STREAM_TYPE_NAME:
        setStreamTypeName(STREAM_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_TYPE_NAME:
        setNameTreeTypeName(NAME_TREE_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_TYPE_NAME:
        setNumberTreeTypeName(NUMBER_TREE_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_PARSER_TYPE_NAME:
        setNameTreeParserTypeName(NAME_TREE_PARSER_TYPE_NAME_EDEFAULT);
        return;
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_PARSER_TYPE_NAME:
        setNumberTreeParserTypeName(NUMBER_TREE_PARSER_TYPE_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PdfmodelPackage.CORE_TYPES_CONFIG__OBJECT_TYPE_NAME:
        return OBJECT_TYPE_NAME_EDEFAULT == null ? objectTypeName != null : !OBJECT_TYPE_NAME_EDEFAULT.equals(objectTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__REFERENCE_TYPE_NAME:
        return REFERENCE_TYPE_NAME_EDEFAULT == null ? referenceTypeName != null : !REFERENCE_TYPE_NAME_EDEFAULT.equals(referenceTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__DICTIONARY_TYPE_NAME:
        return DICTIONARY_TYPE_NAME_EDEFAULT == null ? dictionaryTypeName != null : !DICTIONARY_TYPE_NAME_EDEFAULT.equals(dictionaryTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TYPE_NAME:
        return NAME_TYPE_NAME_EDEFAULT == null ? nameTypeName != null : !NAME_TYPE_NAME_EDEFAULT.equals(nameTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__STRING_TYPE_NAME:
        return STRING_TYPE_NAME_EDEFAULT == null ? stringTypeName != null : !STRING_TYPE_NAME_EDEFAULT.equals(stringTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__LITERAL_STRING_TYPE_NAME:
        return LITERAL_STRING_TYPE_NAME_EDEFAULT == null ? literalStringTypeName != null : !LITERAL_STRING_TYPE_NAME_EDEFAULT.equals(literalStringTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__HEX_STRING_TYPE_NAME:
        return HEX_STRING_TYPE_NAME_EDEFAULT == null ? hexStringTypeName != null : !HEX_STRING_TYPE_NAME_EDEFAULT.equals(hexStringTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__ARRAY_TYPE_NAME:
        return ARRAY_TYPE_NAME_EDEFAULT == null ? arrayTypeName != null : !ARRAY_TYPE_NAME_EDEFAULT.equals(arrayTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__BOOLEAN_TYPE_NAME:
        return BOOLEAN_TYPE_NAME_EDEFAULT == null ? booleanTypeName != null : !BOOLEAN_TYPE_NAME_EDEFAULT.equals(booleanTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TYPE_NAME:
        return NUMBER_TYPE_NAME_EDEFAULT == null ? numberTypeName != null : !NUMBER_TYPE_NAME_EDEFAULT.equals(numberTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__REAL_TYPE_NAME:
        return REAL_TYPE_NAME_EDEFAULT == null ? realTypeName != null : !REAL_TYPE_NAME_EDEFAULT.equals(realTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__INTEGER_TYPE_NAME:
        return INTEGER_TYPE_NAME_EDEFAULT == null ? integerTypeName != null : !INTEGER_TYPE_NAME_EDEFAULT.equals(integerTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NULL_TYPE_NAME:
        return NULL_TYPE_NAME_EDEFAULT == null ? nullTypeName != null : !NULL_TYPE_NAME_EDEFAULT.equals(nullTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__STREAM_TYPE_NAME:
        return STREAM_TYPE_NAME_EDEFAULT == null ? streamTypeName != null : !STREAM_TYPE_NAME_EDEFAULT.equals(streamTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_TYPE_NAME:
        return NAME_TREE_TYPE_NAME_EDEFAULT == null ? nameTreeTypeName != null : !NAME_TREE_TYPE_NAME_EDEFAULT.equals(nameTreeTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_TYPE_NAME:
        return NUMBER_TREE_TYPE_NAME_EDEFAULT == null ? numberTreeTypeName != null : !NUMBER_TREE_TYPE_NAME_EDEFAULT.equals(numberTreeTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NAME_TREE_PARSER_TYPE_NAME:
        return NAME_TREE_PARSER_TYPE_NAME_EDEFAULT == null ? nameTreeParserTypeName != null : !NAME_TREE_PARSER_TYPE_NAME_EDEFAULT.equals(nameTreeParserTypeName);
      case PdfmodelPackage.CORE_TYPES_CONFIG__NUMBER_TREE_PARSER_TYPE_NAME:
        return NUMBER_TREE_PARSER_TYPE_NAME_EDEFAULT == null ? numberTreeParserTypeName != null : !NUMBER_TREE_PARSER_TYPE_NAME_EDEFAULT.equals(numberTreeParserTypeName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (objectTypeName: ");
    result.append(objectTypeName);
    result.append(", referenceTypeName: ");
    result.append(referenceTypeName);
    result.append(", dictionaryTypeName: ");
    result.append(dictionaryTypeName);
    result.append(", nameTypeName: ");
    result.append(nameTypeName);
    result.append(", stringTypeName: ");
    result.append(stringTypeName);
    result.append(", literalStringTypeName: ");
    result.append(literalStringTypeName);
    result.append(", hexStringTypeName: ");
    result.append(hexStringTypeName);
    result.append(", arrayTypeName: ");
    result.append(arrayTypeName);
    result.append(", booleanTypeName: ");
    result.append(booleanTypeName);
    result.append(", numberTypeName: ");
    result.append(numberTypeName);
    result.append(", realTypeName: ");
    result.append(realTypeName);
    result.append(", integerTypeName: ");
    result.append(integerTypeName);
    result.append(", nullTypeName: ");
    result.append(nullTypeName);
    result.append(", streamTypeName: ");
    result.append(streamTypeName);
    result.append(", nameTreeTypeName: ");
    result.append(nameTreeTypeName);
    result.append(", numberTreeTypeName: ");
    result.append(numberTreeTypeName);
    result.append(", nameTreeParserTypeName: ");
    result.append(nameTreeParserTypeName);
    result.append(", numberTreeParserTypeName: ");
    result.append(numberTreeParserTypeName);
    result.append(')');
    return result.toString();
  }

} //CoreTypesConfigImpl
