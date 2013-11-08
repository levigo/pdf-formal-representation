package com.levigo.jadice.tools.pdf.modelgen.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

public final class AllEObjectContentsIterable implements Iterable<EObject> {
  private final EObject modelObject;

  public AllEObjectContentsIterable(EObject modelObject) {
    if (modelObject == null)
      throw new IllegalArgumentException("modelObject must not be null");
    
    this.modelObject = modelObject;
  }

  @Override
  public Iterator<EObject> iterator() {
    return modelObject.eAllContents();
  }
}