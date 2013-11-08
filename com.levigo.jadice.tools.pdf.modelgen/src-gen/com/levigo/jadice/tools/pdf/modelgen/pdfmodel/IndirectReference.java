/**
 */
package com.levigo.jadice.tools.pdf.modelgen.pdfmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Indirect Reference</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage#getIndirectReference()
 * @model
 * @generated
 */
public enum IndirectReference implements Enumerator
{
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

  /**
   * The '<em><b>INDIRECT SHALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHALL_VALUE
   * @generated
   * @ordered
   */
  INDIRECT_SHALL(1, "INDIRECT_SHALL", "indirect-shall"),

  /**
   * The '<em><b>INDIRECT SHALL NOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHALL_NOT_VALUE
   * @generated
   * @ordered
   */
  INDIRECT_SHALL_NOT(2, "INDIRECT_SHALL_NOT", "indirect-shall-not"),

  /**
   * The '<em><b>INDIRECT SHOULD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHOULD_VALUE
   * @generated
   * @ordered
   */
  INDIRECT_SHOULD(3, "INDIRECT_SHOULD", "indirect-should");

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>INDIRECT SHALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INDIRECT SHALL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHALL
   * @model literal="indirect-shall"
   * @generated
   * @ordered
   */
  public static final int INDIRECT_SHALL_VALUE = 1;

  /**
   * The '<em><b>INDIRECT SHALL NOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INDIRECT SHALL NOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHALL_NOT
   * @model literal="indirect-shall-not"
   * @generated
   * @ordered
   */
  public static final int INDIRECT_SHALL_NOT_VALUE = 2;

  /**
   * The '<em><b>INDIRECT SHOULD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INDIRECT SHOULD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INDIRECT_SHOULD
   * @model literal="indirect-should"
   * @generated
   * @ordered
   */
  public static final int INDIRECT_SHOULD_VALUE = 3;

  /**
   * An array of all the '<em><b>Indirect Reference</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final IndirectReference[] VALUES_ARRAY =
    new IndirectReference[]
    {
      UNDEFINED,
      INDIRECT_SHALL,
      INDIRECT_SHALL_NOT,
      INDIRECT_SHOULD,
    };

  /**
   * A public read-only list of all the '<em><b>Indirect Reference</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<IndirectReference> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Indirect Reference</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IndirectReference get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      IndirectReference result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Indirect Reference</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IndirectReference getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      IndirectReference result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Indirect Reference</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IndirectReference get(int value)
  {
    switch (value)
    {
      case UNDEFINED_VALUE: return UNDEFINED;
      case INDIRECT_SHALL_VALUE: return INDIRECT_SHALL;
      case INDIRECT_SHALL_NOT_VALUE: return INDIRECT_SHALL_NOT;
      case INDIRECT_SHOULD_VALUE: return INDIRECT_SHOULD;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private IndirectReference(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //IndirectReference
