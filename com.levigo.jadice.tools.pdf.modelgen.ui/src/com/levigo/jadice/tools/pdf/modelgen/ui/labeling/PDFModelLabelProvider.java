/**
 * <pre>
 * Copyright (c) 1995-2012 levigo holding gmbh. All Rights Reserved.
 *
 * This software is the proprietary information of levigo holding gmbh.
 * Use is subject to license terms.
 * </pre>
 */
/*
* generated by Xtext
*/
package com.levigo.jadice.tools.pdf.modelgen.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.DictionaryDeclaration;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.ModelConfig;
import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.PackageDeclaration;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class PDFModelLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public PDFModelLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	public String text(ModelConfig config) {
	  return "Model Configuration";
	}
	
	public String image(PackageDeclaration declaration) {
	  return "box.png";
	}

	public String image(DictionaryDeclaration declaration) {
	  return "book.png";
	}
	
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}