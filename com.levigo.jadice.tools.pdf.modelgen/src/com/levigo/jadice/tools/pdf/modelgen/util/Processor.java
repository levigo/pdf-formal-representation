package com.levigo.jadice.tools.pdf.modelgen.util;

public interface Processor<RES, IN> {
  RES process(IN value);
}