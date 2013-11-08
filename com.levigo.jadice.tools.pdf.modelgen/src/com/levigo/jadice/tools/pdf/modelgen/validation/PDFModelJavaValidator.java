/**
 * <pre>
 * Copyright (c) 1995-2012 levigo holding gmbh. All Rights Reserved.
 * 
 * This software is the proprietary information of levigo holding gmbh.
 * Use is subject to license terms.
 * </pre>
 */
package com.levigo.jadice.tools.pdf.modelgen.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.NameEnumDeclarationPart;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PdfmodelPackage;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

public class PDFModelJavaValidator extends AbstractPDFModelJavaValidator {

  @Check
  public void checkSinceVersion(DictionaryEntry e) {
    if (e.getSince() == SinceVersion.UNDEFINED) {
      if (((DictionaryDeclaration) e.eContainer()).getSince() == SinceVersion.UNDEFINED)
        error("Either the dictionary entry or the dictionary must have a 'since' declaration",
            PdfmodelPackage.Literals.ABSTRACT_ENTRY__SINCE);
    }
  }

  @Check
  public void checkSinceVersion(ArrayMappedEntry e) {
    if (e.getSince() == SinceVersion.UNDEFINED
        && ((ArrayMappedDeclaration) e.eContainer()).getSince() == SinceVersion.UNDEFINED)
      error("Either the array mapped entry or the array mapped object itself must have a 'since' declaration",
          PdfmodelPackage.Literals.ABSTRACT_ENTRY__SINCE);
  }

  @Check
  public void checkSinceVersion(NameEnumDeclarationPart e) {
    if (e.getSince() == SinceVersion.UNDEFINED
        && ((NameEnumDeclaration) e.eContainer()).getSince() == SinceVersion.UNDEFINED)
      error("Either the enum value the enum itself must have a 'since' declaration",
          PdfmodelPackage.Literals.NAME_ENUM_DECLARATION_PART__SINCE);
  }

  @Check
  public void checkArrayMappedDeclarationConsistent(ArrayMappedDeclaration arrayMapped) {

    boolean hasRequired = false;
    boolean foundOptional = false;
    int lastIndex = -1;
    for (int i = 0; i < arrayMapped.getEntries().size(); i++) {
      final ArrayMappedEntry e = arrayMapped.getEntries().get(i);

      if (lastIndex != -1) {
        if (lastIndex + 1 != e.getIndex())
          error("Improper index sequence", e.eContainingFeature(), i);
      }
      lastIndex = e.getIndex();

      if (e.isRequired()) {
        hasRequired = true;
        if (foundOptional)
          error("Required element following optional", e.eContainingFeature(), i);
      } else {
        foundOptional = true;
      }
    }

    if (!hasRequired)
      error("Array mapped elements must have at least one required entry",
          PdfmodelPackage.Literals.ABSTRACT_DECLARATION__NAME);
  }

  @Check
  public void checkAliasDifferentFromKey(DictionaryEntry e) {
    if (e.getAlias() != null
        && StringExtensions.toFirstLower(e.getAlias()).equals(
            StringExtensions.toFirstLower(skipNameSlash(e.getKey()))))
      warning("Unnecessary alias: matches key", PdfmodelPackage.Literals.DICTIONARY_ENTRY__ALIAS);
  }

  private String skipNameSlash(String key) {
    if (key.length()> 1 && key.charAt(0) == '/')
      return key.substring(1);
    return key;
  }

  @Check
  public void checkNoDuplicateKeys(DictionaryDeclaration d) {
    final Map<String, DictionaryEntry> keys = new HashMap<String, DictionaryEntry>();
    final Set<DictionaryEntry> dupes = new HashSet<DictionaryEntry>();
    for (final DictionaryEntry e : d.getEntries()) {
      if (keys.containsKey(e.getKey())) {
        dupes.add(keys.get(e.getKey()));
        dupes.add(e);
      } else
        keys.put(e.getKey(), e);
    }

    for (final DictionaryEntry dupe : dupes)
      error("Duplicate key " + dupe.getKey() + " in dictionary " + d.getName(),
          PdfmodelPackage.Literals.DICTIONARY_DECLARATION__ENTRIES, d.getEntries().indexOf(dupe));
  }

  @Check
  public void checkNoDuplicateKeys(NameEnumDeclaration d) {
    final Map<String, NameEnumDeclarationPart> keys = new HashMap<String, NameEnumDeclarationPart>();
    final Set<NameEnumDeclarationPart> dupes = new HashSet<NameEnumDeclarationPart>();
    for (final NameEnumDeclarationPart e : d.getDeclarations()) {
      if (keys.containsKey(e.getConstant())) {
        dupes.add(keys.get(e.getConstant()));
        dupes.add(e);
      } else
        keys.put(e.getConstant(), e);
    }

    for (final NameEnumDeclarationPart dupe : dupes)
      error("Duplicate constant " + dupe.getConstant() + " in name-enum " + d.getName(),
          PdfmodelPackage.Literals.NAME_ENUM_DECLARATION__DECLARATIONS, d.getDeclarations().indexOf(dupe));
  }
}
