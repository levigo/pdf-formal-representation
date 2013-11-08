package com.levigo.jadice.tools.pdf.modelgen.util;
import org.eclipse.emf.ecore.EObject;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.AbstractEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ArrayMappedEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryEntry;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.util.PdfmodelSwitch;


public class EntryTypeSwitch<T> extends PdfmodelSwitch<T> {

  public static <T> T doSwitch(AbstractEntry e, Processor<T, DictionaryEntry> dictProcessor,
      Processor<T, ArrayMappedEntry> arrayMappedProcessor) {

    return new EntryTypeSwitch<T>(dictProcessor, arrayMappedProcessor).doSwitch(e);
  }

  private final Processor<T, DictionaryEntry> dictProcessor;
  private final Processor<T, ArrayMappedEntry> arrayMappedProcessor;

  public EntryTypeSwitch(Processor<T, DictionaryEntry> dictProcessor,
      Processor<T, ArrayMappedEntry> arrayMappedProcessor) {
    super();
    this.dictProcessor = dictProcessor;
    this.arrayMappedProcessor = arrayMappedProcessor;
  }

  @Override
  public T caseDictionaryEntry(DictionaryEntry object) {
    return dictProcessor.process(object);
  }

  @Override
  public T caseArrayMappedEntry(ArrayMappedEntry object) {
    return arrayMappedProcessor.process(object);
  }

  @Override
  public T defaultCase(EObject object) {
    throw new RuntimeException();
  }
}