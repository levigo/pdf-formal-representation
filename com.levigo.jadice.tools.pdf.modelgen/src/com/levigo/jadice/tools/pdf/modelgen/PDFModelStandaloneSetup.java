/**
 * <pre>
 * Copyright (c) 1995-2012 levigo holding gmbh. All Rights Reserved.
 *
 * This software is the proprietary information of levigo holding gmbh.
 * Use is subject to license terms.
 * </pre>
 */
package com.levigo.jadice.tools.pdf.modelgen;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PDFModelStandaloneSetup extends PDFModelStandaloneSetupGenerated{

	public static void doSetup() {
		new PDFModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

