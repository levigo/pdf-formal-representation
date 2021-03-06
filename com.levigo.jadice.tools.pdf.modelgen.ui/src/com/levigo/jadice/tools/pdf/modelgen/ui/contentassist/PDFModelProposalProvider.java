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
package com.levigo.jadice.tools.pdf.modelgen.ui.contentassist;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.levigo.jadice.tools.pdf.modelgen.pdfmodel.SinceVersion;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to
 * customize content assistant
 */
public class PDFModelProposalProvider extends AbstractPDFModelProposalProvider {

  @Override
  public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
      ICompletionProposalAcceptor acceptor) {

    // skip the UNDEFINED value in the content proposal.
    if (!keyword.getValue().equals(SinceVersion.UNDEFINED.getLiteral()))
      super.completeKeyword(keyword, contentAssistContext, acceptor);
  }

}
