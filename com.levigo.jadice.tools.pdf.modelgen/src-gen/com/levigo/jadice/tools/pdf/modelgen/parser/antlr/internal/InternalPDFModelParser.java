package com.levigo.jadice.tools.pdf.modelgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.levigo.jadice.tools.pdf.modelgen.services.PDFModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPDFModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_NAME_OBJECT", "RULE_ID", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@spec-ref'", "'ISO32000-1:2008'", "','", "'table'", "'section'", "'array-mapped'", "'('", "')'", "'{'", "'}'", "'->'", "'cached'", "'required'", "'nullable'", "'custom-validation'", "'custom-default'", "';'", "'dict-obj'", "'stream-obj'", "'extends'", "'config'", "'subtypes'", "'as'", "'inheritable'", "'package'", "'bit-flags'", "'name-enum'", "'null'", "'name'", "'must-be'", "'default'", "'num'", "'['", "']'", "'range-incl'", "'to'", "'greater'", "'greater-equals'", "'values'", "'int'", "'real'", "'name-tree'", "'number-tree'", "'array'", "'<'", "'>'", "'length'", "'object'", "'mapping-dict'", "'text-string'", "'ascii-string'", "'byte-string'", "'|'", "'bool'", "'ref'", "'parent-ref'", "'dict'", "'date'", "'.'", "'UNDEFINED'", "'indirect-shall'", "'indirect-shall-not'", "'indirect-should'", "'pdf-1.0'", "'pdf-1.1'", "'pdf-1.2'", "'pdf-1.3'", "'pdf-1.4'", "'pdf-1.5'", "'pdf-1.6'", "'pdf-1.7'", "'32000-1'", "'pdf-2.0'", "'32000-2'", "'true'", "'false'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NAME_OBJECT=6;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int RULE_DOUBLE=8;
    public static final int T__86=86;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPDFModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDFModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDFModelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private PDFModelGrammarAccess grammarAccess;
     	
        public InternalPDFModelParser(TokenStream input, PDFModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PDFModel";	
       	}
       	
       	@Override
       	protected PDFModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePDFModel"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:74:1: entryRulePDFModel returns [EObject current=null] : iv_rulePDFModel= rulePDFModel EOF ;
    public final EObject entryRulePDFModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDFModel = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:75:2: (iv_rulePDFModel= rulePDFModel EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:76:2: iv_rulePDFModel= rulePDFModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPDFModelRule()); 
            }
            pushFollow(FOLLOW_rulePDFModel_in_entryRulePDFModel81);
            iv_rulePDFModel=rulePDFModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePDFModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePDFModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePDFModel"


    // $ANTLR start "rulePDFModel"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:83:1: rulePDFModel returns [EObject current=null] : ( (lv_packages_0_0= rulePackageDeclaration ) )+ ;
    public final EObject rulePDFModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:86:28: ( ( (lv_packages_0_0= rulePackageDeclaration ) )+ )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:1: ( (lv_packages_0_0= rulePackageDeclaration ) )+
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:1: ( (lv_packages_0_0= rulePackageDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:88:1: (lv_packages_0_0= rulePackageDeclaration )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:88:1: (lv_packages_0_0= rulePackageDeclaration )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:89:3: lv_packages_0_0= rulePackageDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPDFModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDeclaration_in_rulePDFModel136);
            	    lv_packages_0_0=rulePackageDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPDFModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packages",
            	              		lv_packages_0_0, 
            	              		"PackageDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePDFModel"


    // $ANTLR start "entryRuleAbstractDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:113:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:114:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:115:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration172);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration182); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDeclaration"


    // $ANTLR start "ruleAbstractDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:122:1: ruleAbstractDeclaration returns [EObject current=null] : (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DictionaryDeclaration_0 = null;

        EObject this_NameEnumDeclaration_1 = null;

        EObject this_ArrayMappedDeclaration_2 = null;

        EObject this_BitFlagsDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:125:28: ( (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:126:1: (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:126:1: (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:127:2: this_DictionaryDeclaration_0= ruleDictionaryDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDictionaryDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryDeclaration_in_ruleAbstractDeclaration232);
                    this_DictionaryDeclaration_0=ruleDictionaryDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DictionaryDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:140:2: this_NameEnumDeclaration_1= ruleNameEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getNameEnumDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameEnumDeclaration_in_ruleAbstractDeclaration262);
                    this_NameEnumDeclaration_1=ruleNameEnumDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameEnumDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:153:2: this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getArrayMappedDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayMappedDeclaration_in_ruleAbstractDeclaration292);
                    this_ArrayMappedDeclaration_2=ruleArrayMappedDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayMappedDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:166:2: this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getBitFlagsDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitFlagsDeclaration_in_ruleAbstractDeclaration322);
                    this_BitFlagsDeclaration_3=ruleBitFlagsDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitFlagsDeclaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDeclaration"


    // $ANTLR start "entryRuleSpecificationReference"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:185:1: entryRuleSpecificationReference returns [EObject current=null] : iv_ruleSpecificationReference= ruleSpecificationReference EOF ;
    public final EObject entryRuleSpecificationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationReference = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:186:2: (iv_ruleSpecificationReference= ruleSpecificationReference EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:187:2: iv_ruleSpecificationReference= ruleSpecificationReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSpecificationReference_in_entryRuleSpecificationReference357);
            iv_ruleSpecificationReference=ruleSpecificationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecificationReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecificationReference367); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificationReference"


    // $ANTLR start "ruleSpecificationReference"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:194:1: ruleSpecificationReference returns [EObject current=null] : (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSpecificationReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_table_6_0=null;
        EObject lv_section_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:197:28: ( (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:198:1: (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:198:1: (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:198:3: otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSpecificationReference404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecificationReferenceAccess().getSpecRefKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSpecificationReference416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSpecificationReferenceAccess().getISO3200012008Keyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSpecificationReference428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSpecificationReferenceAccess().getCommaKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:210:1: ( (lv_section_3_0= ruleSectionReference ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:211:1: (lv_section_3_0= ruleSectionReference )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:211:1: (lv_section_3_0= ruleSectionReference )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:212:3: lv_section_3_0= ruleSectionReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecificationReferenceAccess().getSectionSectionReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSectionReference_in_ruleSpecificationReference449);
            lv_section_3_0=ruleSectionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecificationReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"section",
                      		lv_section_3_0, 
                      		"SectionReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:228:2: (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:228:4: otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSpecificationReference462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSpecificationReferenceAccess().getCommaKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSpecificationReference474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSpecificationReferenceAccess().getTableKeyword_4_1());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:236:1: ( (lv_table_6_0= RULE_INT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:237:1: (lv_table_6_0= RULE_INT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:237:1: (lv_table_6_0= RULE_INT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:238:3: lv_table_6_0= RULE_INT
                    {
                    lv_table_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecificationReference491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_table_6_0, grammarAccess.getSpecificationReferenceAccess().getTableINTTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpecificationReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"table",
                              		lv_table_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificationReference"


    // $ANTLR start "entryRuleSectionReference"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:262:1: entryRuleSectionReference returns [EObject current=null] : iv_ruleSectionReference= ruleSectionReference EOF ;
    public final EObject entryRuleSectionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReference = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:263:2: (iv_ruleSectionReference= ruleSectionReference EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:264:2: iv_ruleSectionReference= ruleSectionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSectionReference_in_entryRuleSectionReference534);
            iv_ruleSectionReference=ruleSectionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReference544); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:271:1: ruleSectionReference returns [EObject current=null] : (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSectionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_section_1_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:274:28: ( (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:275:1: (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:275:1: (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:275:3: otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSectionReference581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSectionReferenceAccess().getSectionKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:279:1: ( (lv_section_1_0= RULE_STRING ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:280:1: (lv_section_1_0= RULE_STRING )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:280:1: (lv_section_1_0= RULE_STRING )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:281:3: lv_section_1_0= RULE_STRING
            {
            lv_section_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSectionReference598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_section_1_0, grammarAccess.getSectionReferenceAccess().getSectionSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSectionReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"section",
                      		lv_section_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "entryRuleArrayMappedDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:305:1: entryRuleArrayMappedDeclaration returns [EObject current=null] : iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF ;
    public final EObject entryRuleArrayMappedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:306:2: (iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:307:2: iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedDeclaration_in_entryRuleArrayMappedDeclaration639);
            iv_ruleArrayMappedDeclaration=ruleArrayMappedDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedDeclaration649); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayMappedDeclaration"


    // $ANTLR start "ruleArrayMappedDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:314:1: ruleArrayMappedDeclaration returns [EObject current=null] : (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' ) ;
    public final EObject ruleArrayMappedDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_since_3_0 = null;

        EObject lv_entries_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:317:28: ( (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:318:1: (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:318:1: (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:318:3: otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleArrayMappedDeclaration686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayMappedDeclarationAccess().getArrayMappedKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:322:1: ( (lv_name_1_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:323:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:323:1: (lv_name_1_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:324:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleArrayMappedDeclaration707);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayMappedDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:340:2: (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:340:4: otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleArrayMappedDeclaration720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArrayMappedDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:344:1: ( (lv_since_3_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:345:1: (lv_since_3_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:345:1: (lv_since_3_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:346:3: lv_since_3_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleArrayMappedDeclaration741);
                    lv_since_3_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayMappedDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_3_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleArrayMappedDeclaration753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArrayMappedDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleArrayMappedDeclaration767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayMappedDeclarationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:370:1: ( (lv_entries_6_0= ruleArrayMappedEntry ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:371:1: (lv_entries_6_0= ruleArrayMappedEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:371:1: (lv_entries_6_0= ruleArrayMappedEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:372:3: lv_entries_6_0= ruleArrayMappedEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getEntriesArrayMappedEntryParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayMappedEntry_in_ruleArrayMappedDeclaration788);
            	    lv_entries_6_0=ruleArrayMappedEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayMappedDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_6_0, 
            	              		"ArrayMappedEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleArrayMappedDeclaration801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getArrayMappedDeclarationAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayMappedDeclaration"


    // $ANTLR start "entryRuleArrayMappedEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:402:1: entryRuleArrayMappedEntry returns [EObject current=null] : iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF ;
    public final EObject entryRuleArrayMappedEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:403:2: (iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:404:2: iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedEntryRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedEntry_in_entryRuleArrayMappedEntry839);
            iv_ruleArrayMappedEntry=ruleArrayMappedEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedEntry849); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayMappedEntry"


    // $ANTLR start "ruleArrayMappedEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:411:1: ruleArrayMappedEntry returns [EObject current=null] : ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' ) ;
    public final EObject ruleArrayMappedEntry() throws RecognitionException {
        EObject current = null;

        Token lv_index_0_0=null;
        Token otherlv_1=null;
        Token lv_cached_3_0=null;
        Token lv_required_4_0=null;
        Token lv_nullable_5_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_requiresCustomValidation_11_0=null;
        Token lv_requiresCustomDefault_12_0=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_indirectReference_6_0 = null;

        EObject lv_value_7_0 = null;

        Enumerator lv_since_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:414:28: ( ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:415:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:415:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:415:2: ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:415:2: ( (lv_index_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:416:1: (lv_index_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:416:1: (lv_index_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:417:3: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayMappedEntry891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_0_0, grammarAccess.getArrayMappedEntryAccess().getIndexINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleArrayMappedEntry908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayMappedEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:437:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:438:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:438:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:439:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleArrayMappedEntry929);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayMappedEntryRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:455:2: ( (lv_cached_3_0= 'cached' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:456:1: (lv_cached_3_0= 'cached' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:456:1: (lv_cached_3_0= 'cached' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:457:3: lv_cached_3_0= 'cached'
                    {
                    lv_cached_3_0=(Token)match(input,24,FOLLOW_24_in_ruleArrayMappedEntry947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cached_3_0, grammarAccess.getArrayMappedEntryAccess().getCachedCachedKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		setWithLastConsumed(current, "cached", true, "cached");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:470:3: ( (lv_required_4_0= 'required' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:471:1: (lv_required_4_0= 'required' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:471:1: (lv_required_4_0= 'required' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:472:3: lv_required_4_0= 'required'
                    {
                    lv_required_4_0=(Token)match(input,25,FOLLOW_25_in_ruleArrayMappedEntry979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_required_4_0, grammarAccess.getArrayMappedEntryAccess().getRequiredRequiredKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		setWithLastConsumed(current, "required", true, "required");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:485:3: ( (lv_nullable_5_0= 'nullable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:486:1: (lv_nullable_5_0= 'nullable' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:486:1: (lv_nullable_5_0= 'nullable' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:487:3: lv_nullable_5_0= 'nullable'
                    {
                    lv_nullable_5_0=(Token)match(input,26,FOLLOW_26_in_ruleArrayMappedEntry1011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nullable_5_0, grammarAccess.getArrayMappedEntryAccess().getNullableNullableKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		setWithLastConsumed(current, "nullable", true, "nullable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:500:3: ( (lv_indirectReference_6_0= ruleIndirectReference ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=72 && LA9_0<=75)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:501:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:501:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:502:3: lv_indirectReference_6_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleArrayMappedEntry1046);
                    lv_indirectReference_6_0=ruleIndirectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"indirectReference",
                              		lv_indirectReference_6_0, 
                              		"IndirectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:518:3: ( (lv_value_7_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:519:1: (lv_value_7_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:519:1: (lv_value_7_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:520:3: lv_value_7_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getValueAbstractEntryValueParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleArrayMappedEntry1068);
            lv_value_7_0=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayMappedEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"AbstractEntryValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:536:2: (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:536:4: otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleArrayMappedEntry1081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getArrayMappedEntryAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:540:1: ( (lv_since_9_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:541:1: (lv_since_9_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:541:1: (lv_since_9_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:542:3: lv_since_9_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getSinceSinceVersionEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleArrayMappedEntry1102);
                    lv_since_9_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_9_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleArrayMappedEntry1114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getArrayMappedEntryAccess().getRightParenthesisKeyword_8_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:562:3: ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:563:1: (lv_requiresCustomValidation_11_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:563:1: (lv_requiresCustomValidation_11_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:564:3: lv_requiresCustomValidation_11_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_11_0=(Token)match(input,27,FOLLOW_27_in_ruleArrayMappedEntry1134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomValidation_11_0, grammarAccess.getArrayMappedEntryAccess().getRequiresCustomValidationCustomValidationKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomValidation", true, "custom-validation");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:577:3: ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:578:1: (lv_requiresCustomDefault_12_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:578:1: (lv_requiresCustomDefault_12_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:579:3: lv_requiresCustomDefault_12_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_12_0=(Token)match(input,28,FOLLOW_28_in_ruleArrayMappedEntry1166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomDefault_12_0, grammarAccess.getArrayMappedEntryAccess().getRequiresCustomDefaultCustomDefaultKeyword_10_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayMappedEntryRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomDefault", true, "custom-default");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleArrayMappedEntry1192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getArrayMappedEntryAccess().getSemicolonKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayMappedEntry"


    // $ANTLR start "entryRuleDictionaryDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:604:1: entryRuleDictionaryDeclaration returns [EObject current=null] : iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF ;
    public final EObject entryRuleDictionaryDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:605:2: (iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:606:2: iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryDeclaration_in_entryRuleDictionaryDeclaration1228);
            iv_ruleDictionaryDeclaration=ruleDictionaryDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryDeclaration1238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionaryDeclaration"


    // $ANTLR start "ruleDictionaryDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:613:1: ruleDictionaryDeclaration returns [EObject current=null] : ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' ) ;
    public final EObject ruleDictionaryDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stream_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_since_8_0 = null;

        EObject lv_subtypeConfig_13_0 = null;

        EObject lv_entries_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:616:28: ( ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:617:1: ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:617:1: ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:617:2: (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:617:2: (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:617:4: otherlv_0= 'dict-obj'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDictionaryDeclaration1276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDictionaryDeclarationAccess().getDictObjKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:622:6: ( (lv_stream_1_0= 'stream-obj' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:622:6: ( (lv_stream_1_0= 'stream-obj' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:623:1: (lv_stream_1_0= 'stream-obj' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:623:1: (lv_stream_1_0= 'stream-obj' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:624:3: lv_stream_1_0= 'stream-obj'
                    {
                    lv_stream_1_0=(Token)match(input,31,FOLLOW_31_in_ruleDictionaryDeclaration1300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stream_1_0, grammarAccess.getDictionaryDeclarationAccess().getStreamStreamObjKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "stream", true, "stream-obj");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:637:3: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:638:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:638:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:639:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleDictionaryDeclaration1335);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictionaryDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:655:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:655:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDictionaryDeclaration1348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDictionaryDeclarationAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:659:1: ( ( ruleQualifiedName ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:660:1: ( ruleQualifiedName )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:660:1: ( ruleQualifiedName )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:661:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSuperTypesDictionaryDeclarationCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration1375);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:677:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:677:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDictionaryDeclaration1388); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getDictionaryDeclarationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:681:1: ( ( ruleQualifiedName ) )
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:682:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:682:1: ( ruleQualifiedName )
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:683:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getDictionaryDeclarationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSuperTypesDictionaryDeclarationCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration1415);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:699:6: (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:699:8: otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleDictionaryDeclaration1432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDictionaryDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:703:1: ( (lv_since_8_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:704:1: (lv_since_8_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:704:1: (lv_since_8_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:705:3: lv_since_8_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleDictionaryDeclaration1453);
                    lv_since_8_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_8_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleDictionaryDeclaration1465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDictionaryDeclarationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleDictionaryDeclaration1479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDictionaryDeclarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:729:1: (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:729:3: otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleDictionaryDeclaration1492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDictionaryDeclarationAccess().getConfigKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleDictionaryDeclaration1504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDictionaryDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:737:1: ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:738:1: (lv_subtypeConfig_13_0= ruleSubtypeConfig )
                            {
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:738:1: (lv_subtypeConfig_13_0= ruleSubtypeConfig )
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:739:3: lv_subtypeConfig_13_0= ruleSubtypeConfig
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSubtypeConfigSubtypeConfigParserRuleCall_5_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSubtypeConfig_in_ruleDictionaryDeclaration1525);
                            lv_subtypeConfig_13_0=ruleSubtypeConfig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDictionaryDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"subtypeConfig",
                                      		lv_subtypeConfig_13_0, 
                                      		"SubtypeConfig");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleDictionaryDeclaration1538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDictionaryDeclarationAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:759:3: ( (lv_entries_15_0= ruleDictionaryEntry ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_NAME_OBJECT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:760:1: (lv_entries_15_0= ruleDictionaryEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:760:1: (lv_entries_15_0= ruleDictionaryEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:761:3: lv_entries_15_0= ruleDictionaryEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getEntriesDictionaryEntryParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictionaryEntry_in_ruleDictionaryDeclaration1561);
            	    lv_entries_15_0=ruleDictionaryEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDictionaryDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_15_0, 
            	              		"DictionaryEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleDictionaryDeclaration1574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getDictionaryDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionaryDeclaration"


    // $ANTLR start "entryRuleSubtypeConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:789:1: entryRuleSubtypeConfig returns [EObject current=null] : iv_ruleSubtypeConfig= ruleSubtypeConfig EOF ;
    public final EObject entryRuleSubtypeConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeConfig = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:790:2: (iv_ruleSubtypeConfig= ruleSubtypeConfig EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:791:2: iv_ruleSubtypeConfig= ruleSubtypeConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtypeConfigRule()); 
            }
            pushFollow(FOLLOW_ruleSubtypeConfig_in_entryRuleSubtypeConfig1610);
            iv_ruleSubtypeConfig=ruleSubtypeConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtypeConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeConfig1620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtypeConfig"


    // $ANTLR start "ruleSubtypeConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:798:1: ruleSubtypeConfig returns [EObject current=null] : (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSubtypeConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:801:28: ( (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:802:1: (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:802:1: (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:802:3: otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSubtypeConfig1657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubtypeConfigAccess().getSubtypesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:806:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:807:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:807:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:808:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSubtypeConfigRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubtypeConfigAccess().getCandidatesDictionaryDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig1684);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:824:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:824:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSubtypeConfig1697); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSubtypeConfigAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:828:1: ( ( ruleQualifiedName ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:829:1: ( ruleQualifiedName )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:829:1: ( ruleQualifiedName )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:830:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSubtypeConfigRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtypeConfigAccess().getCandidatesDictionaryDeclarationCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig1724);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleSubtypeConfig1738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSubtypeConfigAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtypeConfig"


    // $ANTLR start "entryRuleDictionaryEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:858:1: entryRuleDictionaryEntry returns [EObject current=null] : iv_ruleDictionaryEntry= ruleDictionaryEntry EOF ;
    public final EObject entryRuleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:859:2: (iv_ruleDictionaryEntry= ruleDictionaryEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:860:2: iv_ruleDictionaryEntry= ruleDictionaryEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryEntryRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryEntry_in_entryRuleDictionaryEntry1774);
            iv_ruleDictionaryEntry=ruleDictionaryEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryEntry1784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionaryEntry"


    // $ANTLR start "ruleDictionaryEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:867:1: ruleDictionaryEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' ) ;
    public final EObject ruleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token lv_cached_3_0=null;
        Token lv_required_4_0=null;
        Token lv_inheritable_5_0=null;
        Token lv_requiresCustomValidation_8_0=null;
        Token lv_requiresCustomDefault_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_indirectReference_6_0 = null;

        EObject lv_value_7_0 = null;

        Enumerator lv_since_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:870:28: ( ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:871:1: ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:871:1: ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:871:2: ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:871:2: ( (lv_key_0_0= RULE_NAME_OBJECT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:872:1: (lv_key_0_0= RULE_NAME_OBJECT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:872:1: (lv_key_0_0= RULE_NAME_OBJECT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:873:3: lv_key_0_0= RULE_NAME_OBJECT
            {
            lv_key_0_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleDictionaryEntry1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getDictionaryEntryAccess().getKeyNAME_OBJECTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"NAME_OBJECT");
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:889:2: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:889:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDictionaryEntry1844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDictionaryEntryAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:893:1: ( (lv_alias_2_0= RULE_ID ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:894:1: (lv_alias_2_0= RULE_ID )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:894:1: (lv_alias_2_0= RULE_ID )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:895:3: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDictionaryEntry1861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_alias_2_0, grammarAccess.getDictionaryEntryAccess().getAliasIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"alias",
                              		lv_alias_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:911:4: ( (lv_cached_3_0= 'cached' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:912:1: (lv_cached_3_0= 'cached' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:912:1: (lv_cached_3_0= 'cached' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:913:3: lv_cached_3_0= 'cached'
                    {
                    lv_cached_3_0=(Token)match(input,24,FOLLOW_24_in_ruleDictionaryEntry1886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cached_3_0, grammarAccess.getDictionaryEntryAccess().getCachedCachedKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(current, "cached", true, "cached");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:926:3: ( (lv_required_4_0= 'required' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:927:1: (lv_required_4_0= 'required' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:927:1: (lv_required_4_0= 'required' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:928:3: lv_required_4_0= 'required'
                    {
                    lv_required_4_0=(Token)match(input,25,FOLLOW_25_in_ruleDictionaryEntry1918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_required_4_0, grammarAccess.getDictionaryEntryAccess().getRequiredRequiredKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(current, "required", true, "required");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:941:3: ( (lv_inheritable_5_0= 'inheritable' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:942:1: (lv_inheritable_5_0= 'inheritable' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:942:1: (lv_inheritable_5_0= 'inheritable' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:943:3: lv_inheritable_5_0= 'inheritable'
                    {
                    lv_inheritable_5_0=(Token)match(input,36,FOLLOW_36_in_ruleDictionaryEntry1950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_inheritable_5_0, grammarAccess.getDictionaryEntryAccess().getInheritableInheritableKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(current, "inheritable", true, "inheritable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:956:3: ( (lv_indirectReference_6_0= ruleIndirectReference ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=72 && LA25_0<=75)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:957:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:957:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:958:3: lv_indirectReference_6_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleDictionaryEntry1985);
                    lv_indirectReference_6_0=ruleIndirectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"indirectReference",
                              		lv_indirectReference_6_0, 
                              		"IndirectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:974:3: ( (lv_value_7_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:975:1: (lv_value_7_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:975:1: (lv_value_7_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:976:3: lv_value_7_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getValueAbstractEntryValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleDictionaryEntry2007);
            lv_value_7_0=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"AbstractEntryValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:992:2: ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:993:1: (lv_requiresCustomValidation_8_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:993:1: (lv_requiresCustomValidation_8_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:994:3: lv_requiresCustomValidation_8_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_8_0=(Token)match(input,27,FOLLOW_27_in_ruleDictionaryEntry2025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomValidation_8_0, grammarAccess.getDictionaryEntryAccess().getRequiresCustomValidationCustomValidationKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomValidation", true, "custom-validation");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1007:3: ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1008:1: (lv_requiresCustomDefault_9_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1008:1: (lv_requiresCustomDefault_9_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1009:3: lv_requiresCustomDefault_9_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_9_0=(Token)match(input,28,FOLLOW_28_in_ruleDictionaryEntry2057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomDefault_9_0, grammarAccess.getDictionaryEntryAccess().getRequiresCustomDefaultCustomDefaultKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomDefault", true, "custom-default");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1022:3: (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1022:5: otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleDictionaryEntry2084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDictionaryEntryAccess().getLeftParenthesisKeyword_9_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1026:1: ( (lv_since_11_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1027:1: (lv_since_11_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1027:1: (lv_since_11_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1028:3: lv_since_11_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getSinceSinceVersionEnumRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleDictionaryEntry2105);
                    lv_since_11_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_11_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleDictionaryEntry2117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDictionaryEntryAccess().getRightParenthesisKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleDictionaryEntry2131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getDictionaryEntryAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionaryEntry"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1060:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1061:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1062:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration2167);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration2177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1069:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1072:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1073:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1073:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1073:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePackageDeclaration2214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1077:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1078:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1078:1: (lv_name_1_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1079:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration2235);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePackageDeclaration2247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1099:1: ( (lv_elements_3_0= ruleAbstractDeclaration ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13||LA29_0==18||(LA29_0>=30 && LA29_0<=31)||LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1100:1: (lv_elements_3_0= ruleAbstractDeclaration )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1100:1: (lv_elements_3_0= ruleAbstractDeclaration )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1101:3: lv_elements_3_0= ruleAbstractDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDeclaration_in_rulePackageDeclaration2268);
            	    lv_elements_3_0=ruleAbstractDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"AbstractDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_rulePackageDeclaration2281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleBitFlagsDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1129:1: entryRuleBitFlagsDeclaration returns [EObject current=null] : iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF ;
    public final EObject entryRuleBitFlagsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1130:2: (iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1131:2: iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsDeclaration_in_entryRuleBitFlagsDeclaration2317);
            iv_ruleBitFlagsDeclaration=ruleBitFlagsDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsDeclaration2327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitFlagsDeclaration"


    // $ANTLR start "ruleBitFlagsDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1138:1: ruleBitFlagsDeclaration returns [EObject current=null] : ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' ) ;
    public final EObject ruleBitFlagsDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_specificationReference_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_since_4_0 = null;

        EObject lv_declarations_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1141:28: ( ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1142:1: ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1142:1: ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1142:2: ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1142:2: ( (lv_specificationReference_0_0= ruleSpecificationReference ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1143:1: (lv_specificationReference_0_0= ruleSpecificationReference )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1143:1: (lv_specificationReference_0_0= ruleSpecificationReference )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1144:3: lv_specificationReference_0_0= ruleSpecificationReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getSpecificationReferenceSpecificationReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSpecificationReference_in_ruleBitFlagsDeclaration2373);
            lv_specificationReference_0_0=ruleSpecificationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"specificationReference",
                      		lv_specificationReference_0_0, 
                      		"SpecificationReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBitFlagsDeclaration2385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBitFlagsDeclarationAccess().getBitFlagsKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1164:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1165:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1165:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1166:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBitFlagsDeclaration2406);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1182:2: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1182:4: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBitFlagsDeclaration2419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBitFlagsDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1186:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1187:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1187:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1188:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclaration2440);
                    lv_since_4_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_4_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBitFlagsDeclaration2452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBitFlagsDeclarationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleBitFlagsDeclaration2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBitFlagsDeclarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1212:1: ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_INT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1213:1: (lv_declarations_7_0= ruleBitFlagsDeclarationPart )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1213:1: (lv_declarations_7_0= ruleBitFlagsDeclarationPart )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1214:3: lv_declarations_7_0= ruleBitFlagsDeclarationPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getDeclarationsBitFlagsDeclarationPartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitFlagsDeclarationPart_in_ruleBitFlagsDeclaration2487);
            	    lv_declarations_7_0=ruleBitFlagsDeclarationPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_7_0, 
            	              		"BitFlagsDeclarationPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleBitFlagsDeclaration2500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBitFlagsDeclarationAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitFlagsDeclaration"


    // $ANTLR start "entryRuleBitFlagsDeclarationPart"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1242:1: entryRuleBitFlagsDeclarationPart returns [EObject current=null] : iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF ;
    public final EObject entryRuleBitFlagsDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsDeclarationPart = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1243:2: (iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1244:2: iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsDeclarationPart_in_entryRuleBitFlagsDeclarationPart2536);
            iv_ruleBitFlagsDeclarationPart=ruleBitFlagsDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsDeclarationPart2546); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitFlagsDeclarationPart"


    // $ANTLR start "ruleBitFlagsDeclarationPart"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1251:1: ruleBitFlagsDeclarationPart returns [EObject current=null] : ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' ) ;
    public final EObject ruleBitFlagsDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token lv_index_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_since_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1254:28: ( ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1255:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1255:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1255:2: ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1255:2: ( (lv_index_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1256:1: (lv_index_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1256:1: (lv_index_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1257:3: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBitFlagsDeclarationPart2588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_index_0_0, grammarAccess.getBitFlagsDeclarationPartAccess().getIndexINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBitFlagsDeclarationPartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"index",
                      		lv_index_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBitFlagsDeclarationPart2605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBitFlagsDeclarationPartAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1277:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1278:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1278:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1279:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationPartAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBitFlagsDeclarationPart2626);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationPartRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1295:2: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1295:4: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBitFlagsDeclarationPart2639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBitFlagsDeclarationPartAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1299:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1300:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1300:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1301:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationPartAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclarationPart2660);
                    lv_since_4_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitFlagsDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_4_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBitFlagsDeclarationPart2672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBitFlagsDeclarationPartAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleBitFlagsDeclarationPart2686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBitFlagsDeclarationPartAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitFlagsDeclarationPart"


    // $ANTLR start "entryRuleNameEnumDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1333:1: entryRuleNameEnumDeclaration returns [EObject current=null] : iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF ;
    public final EObject entryRuleNameEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1334:2: (iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1335:2: iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumDeclaration_in_entryRuleNameEnumDeclaration2722);
            iv_ruleNameEnumDeclaration=ruleNameEnumDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumDeclaration2732); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameEnumDeclaration"


    // $ANTLR start "ruleNameEnumDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1342:1: ruleNameEnumDeclaration returns [EObject current=null] : (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' ) ;
    public final EObject ruleNameEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_since_3_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_declarations_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1345:28: ( (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1346:1: (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1346:1: (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1346:3: otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNameEnumDeclaration2769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNameEnumDeclarationAccess().getNameEnumKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1350:1: ( (lv_name_1_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1351:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1351:1: (lv_name_1_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1352:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleNameEnumDeclaration2790);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameEnumDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1368:2: (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1368:4: otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNameEnumDeclaration2803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNameEnumDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1372:1: ( (lv_since_3_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1373:1: (lv_since_3_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1373:1: (lv_since_3_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1374:3: lv_since_3_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclaration2824);
                    lv_since_3_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameEnumDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_3_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleNameEnumDeclaration2836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNameEnumDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleNameEnumDeclaration2850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNameEnumDeclarationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1398:1: ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1399:1: (lv_declarations_6_0= ruleNameEnumDeclarationPart )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1399:1: (lv_declarations_6_0= ruleNameEnumDeclarationPart )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1400:3: lv_declarations_6_0= ruleNameEnumDeclarationPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getDeclarationsNameEnumDeclarationPartParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration2871);
            lv_declarations_6_0=ruleNameEnumDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameEnumDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"declarations",
                      		lv_declarations_6_0, 
                      		"NameEnumDeclarationPart");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1416:2: (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_NAME_OBJECT) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1416:4: otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNameEnumDeclaration2884); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getNameEnumDeclarationAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1420:1: ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1421:1: (lv_declarations_8_0= ruleNameEnumDeclarationPart )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1421:1: (lv_declarations_8_0= ruleNameEnumDeclarationPart )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1422:3: lv_declarations_8_0= ruleNameEnumDeclarationPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getDeclarationsNameEnumDeclarationPartParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration2905);
            	    lv_declarations_8_0=ruleNameEnumDeclarationPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNameEnumDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_8_0, 
            	              		"NameEnumDeclarationPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1438:4: (otherlv_9= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1438:6: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleNameEnumDeclaration2920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNameEnumDeclarationAccess().getCommaKeyword_6());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleNameEnumDeclaration2934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getNameEnumDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameEnumDeclaration"


    // $ANTLR start "entryRuleNameEnumDeclarationPart"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1454:1: entryRuleNameEnumDeclarationPart returns [EObject current=null] : iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF ;
    public final EObject entryRuleNameEnumDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumDeclarationPart = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1455:2: (iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1456:2: iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_entryRuleNameEnumDeclarationPart2970);
            iv_ruleNameEnumDeclarationPart=ruleNameEnumDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumDeclarationPart2980); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameEnumDeclarationPart"


    // $ANTLR start "ruleNameEnumDeclarationPart"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1463:1: ruleNameEnumDeclarationPart returns [EObject current=null] : ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleNameEnumDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_since_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1466:28: ( ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1467:1: ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1467:1: ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1467:2: ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1467:2: ( (lv_constant_0_0= RULE_NAME_OBJECT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1468:1: (lv_constant_0_0= RULE_NAME_OBJECT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1468:1: (lv_constant_0_0= RULE_NAME_OBJECT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1469:3: lv_constant_0_0= RULE_NAME_OBJECT
            {
            lv_constant_0_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumDeclarationPart3022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_constant_0_0, grammarAccess.getNameEnumDeclarationPartAccess().getConstantNAME_OBJECTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNameEnumDeclarationPartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"constant",
                      		lv_constant_0_0, 
                      		"NAME_OBJECT");
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1485:2: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1485:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleNameEnumDeclarationPart3040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNameEnumDeclarationPartAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1489:1: ( (lv_alias_2_0= RULE_ID ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1490:1: (lv_alias_2_0= RULE_ID )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1490:1: (lv_alias_2_0= RULE_ID )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1491:3: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameEnumDeclarationPart3057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_alias_2_0, grammarAccess.getNameEnumDeclarationPartAccess().getAliasIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameEnumDeclarationPartRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"alias",
                              		lv_alias_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1507:4: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1507:6: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNameEnumDeclarationPart3077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNameEnumDeclarationPartAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1511:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1512:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1512:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1513:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameEnumDeclarationPartAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclarationPart3098);
                    lv_since_4_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameEnumDeclarationPartRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_4_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleNameEnumDeclarationPart3110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNameEnumDeclarationPartAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameEnumDeclarationPart"


    // $ANTLR start "entryRuleAbstractEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1541:1: entryRuleAbstractEntryValue returns [EObject current=null] : iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF ;
    public final EObject entryRuleAbstractEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1542:2: (iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1543:2: iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_entryRuleAbstractEntryValue3148);
            iv_ruleAbstractEntryValue=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntryValue3158); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractEntryValue"


    // $ANTLR start "ruleAbstractEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1550:1: ruleAbstractEntryValue returns [EObject current=null] : (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue ) ;
    public final EObject ruleAbstractEntryValue() throws RecognitionException {
        EObject current = null;

        EObject this_NullObjectEntryValue_0 = null;

        EObject this_NameTreeEntryValue_1 = null;

        EObject this_NumberTreeEntryValue_2 = null;

        EObject this_NameObjectEntryValue_3 = null;

        EObject this_NumberObjectEntryValue_4 = null;

        EObject this_IntegerObjectEntryValue_5 = null;

        EObject this_RealObjectEntryValue_6 = null;

        EObject this_NameEnumEntryValue_7 = null;

        EObject this_ReferenceEntryValue_8 = null;

        EObject this_ParentReferenceEntryValue_9 = null;

        EObject this_DictionaryDeclarationEntryValue_10 = null;

        EObject this_DictionaryObjectEntryValue_11 = null;

        EObject this_ArrayEntryValue_12 = null;

        EObject this_MappingDictEntryValue_13 = null;

        EObject this_BooleanEntryValue_14 = null;

        EObject this_DateEntryValue_15 = null;

        EObject this_AlternativeEntryValue_16 = null;

        EObject this_ObjectEntryValue_17 = null;

        EObject this_StringEntryValue_18 = null;

        EObject this_ArrayMappedEntryValue_19 = null;

        EObject this_BitFlagsEntryValue_20 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1553:28: ( (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1554:1: (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1554:1: (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue )
            int alt38=21;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt38=1;
                }
                break;
            case 54:
                {
                alt38=2;
                }
                break;
            case 55:
                {
                alt38=3;
                }
                break;
            case 41:
                {
                alt38=4;
                }
                break;
            case 44:
                {
                alt38=5;
                }
                break;
            case 52:
                {
                alt38=6;
                }
                break;
            case 53:
                {
                alt38=7;
                }
                break;
            case 39:
                {
                alt38=8;
                }
                break;
            case 67:
                {
                alt38=9;
                }
                break;
            case 68:
                {
                alt38=10;
                }
                break;
            case 30:
                {
                alt38=11;
                }
                break;
            case 69:
                {
                alt38=12;
                }
                break;
            case 56:
                {
                alt38=13;
                }
                break;
            case 61:
                {
                alt38=14;
                }
                break;
            case 66:
                {
                alt38=15;
                }
                break;
            case 70:
                {
                alt38=16;
                }
                break;
            case 19:
                {
                alt38=17;
                }
                break;
            case 60:
                {
                alt38=18;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt38=19;
                }
                break;
            case 18:
                {
                alt38=20;
                }
                break;
            case 38:
                {
                alt38=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1555:2: this_NullObjectEntryValue_0= ruleNullObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNullObjectEntryValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullObjectEntryValue_in_ruleAbstractEntryValue3208);
                    this_NullObjectEntryValue_0=ruleNullObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullObjectEntryValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1568:2: this_NameTreeEntryValue_1= ruleNameTreeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameTreeEntryValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameTreeEntryValue_in_ruleAbstractEntryValue3238);
                    this_NameTreeEntryValue_1=ruleNameTreeEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameTreeEntryValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1581:2: this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNumberTreeEntryValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTreeEntryValue_in_ruleAbstractEntryValue3268);
                    this_NumberTreeEntryValue_2=ruleNumberTreeEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberTreeEntryValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1594:2: this_NameObjectEntryValue_3= ruleNameObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameObjectEntryValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameObjectEntryValue_in_ruleAbstractEntryValue3298);
                    this_NameObjectEntryValue_3=ruleNameObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameObjectEntryValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1607:2: this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNumberObjectEntryValueParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberObjectEntryValue_in_ruleAbstractEntryValue3328);
                    this_NumberObjectEntryValue_4=ruleNumberObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberObjectEntryValue_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1620:2: this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getIntegerObjectEntryValueParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerObjectEntryValue_in_ruleAbstractEntryValue3358);
                    this_IntegerObjectEntryValue_5=ruleIntegerObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerObjectEntryValue_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1633:2: this_RealObjectEntryValue_6= ruleRealObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getRealObjectEntryValueParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealObjectEntryValue_in_ruleAbstractEntryValue3388);
                    this_RealObjectEntryValue_6=ruleRealObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealObjectEntryValue_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1646:2: this_NameEnumEntryValue_7= ruleNameEnumEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameEnumEntryValueParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameEnumEntryValue_in_ruleAbstractEntryValue3418);
                    this_NameEnumEntryValue_7=ruleNameEnumEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameEnumEntryValue_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1659:2: this_ReferenceEntryValue_8= ruleReferenceEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getReferenceEntryValueParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceEntryValue_in_ruleAbstractEntryValue3448);
                    this_ReferenceEntryValue_8=ruleReferenceEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceEntryValue_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1672:2: this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getParentReferenceEntryValueParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParentReferenceEntryValue_in_ruleAbstractEntryValue3478);
                    this_ParentReferenceEntryValue_9=ruleParentReferenceEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParentReferenceEntryValue_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1685:2: this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDictionaryDeclarationEntryValueParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryDeclarationEntryValue_in_ruleAbstractEntryValue3508);
                    this_DictionaryDeclarationEntryValue_10=ruleDictionaryDeclarationEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DictionaryDeclarationEntryValue_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1698:2: this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDictionaryObjectEntryValueParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryObjectEntryValue_in_ruleAbstractEntryValue3538);
                    this_DictionaryObjectEntryValue_11=ruleDictionaryObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DictionaryObjectEntryValue_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1711:2: this_ArrayEntryValue_12= ruleArrayEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getArrayEntryValueParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayEntryValue_in_ruleAbstractEntryValue3568);
                    this_ArrayEntryValue_12=ruleArrayEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayEntryValue_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1724:2: this_MappingDictEntryValue_13= ruleMappingDictEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getMappingDictEntryValueParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingDictEntryValue_in_ruleAbstractEntryValue3598);
                    this_MappingDictEntryValue_13=ruleMappingDictEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MappingDictEntryValue_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1737:2: this_BooleanEntryValue_14= ruleBooleanEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getBooleanEntryValueParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanEntryValue_in_ruleAbstractEntryValue3628);
                    this_BooleanEntryValue_14=ruleBooleanEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanEntryValue_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1750:2: this_DateEntryValue_15= ruleDateEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDateEntryValueParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateEntryValue_in_ruleAbstractEntryValue3658);
                    this_DateEntryValue_15=ruleDateEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateEntryValue_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1763:2: this_AlternativeEntryValue_16= ruleAlternativeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getAlternativeEntryValueParserRuleCall_16()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlternativeEntryValue_in_ruleAbstractEntryValue3688);
                    this_AlternativeEntryValue_16=ruleAlternativeEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlternativeEntryValue_16; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1776:2: this_ObjectEntryValue_17= ruleObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getObjectEntryValueParserRuleCall_17()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectEntryValue_in_ruleAbstractEntryValue3718);
                    this_ObjectEntryValue_17=ruleObjectEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectEntryValue_17; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1789:2: this_StringEntryValue_18= ruleStringEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getStringEntryValueParserRuleCall_18()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringEntryValue_in_ruleAbstractEntryValue3748);
                    this_StringEntryValue_18=ruleStringEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringEntryValue_18; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1802:2: this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getArrayMappedEntryValueParserRuleCall_19()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayMappedEntryValue_in_ruleAbstractEntryValue3778);
                    this_ArrayMappedEntryValue_19=ruleArrayMappedEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayMappedEntryValue_19; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1815:2: this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getBitFlagsEntryValueParserRuleCall_20()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitFlagsEntryValue_in_ruleAbstractEntryValue3808);
                    this_BitFlagsEntryValue_20=ruleBitFlagsEntryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitFlagsEntryValue_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractEntryValue"


    // $ANTLR start "entryRuleNullObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1834:1: entryRuleNullObjectEntryValue returns [EObject current=null] : iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF ;
    public final EObject entryRuleNullObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1835:2: (iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1836:2: iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNullObjectEntryValue_in_entryRuleNullObjectEntryValue3843);
            iv_ruleNullObjectEntryValue=ruleNullObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullObjectEntryValue3853); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullObjectEntryValue"


    // $ANTLR start "ruleNullObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1843:1: ruleNullObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1846:28: ( ( () otherlv_1= 'null' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1847:1: ( () otherlv_1= 'null' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1847:1: ( () otherlv_1= 'null' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1847:2: () otherlv_1= 'null'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1847:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1848:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullObjectEntryValueAccess().getNullObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleNullObjectEntryValue3902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullObjectEntryValueAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullObjectEntryValue"


    // $ANTLR start "entryRuleNameObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1868:1: entryRuleNameObjectEntryValue returns [EObject current=null] : iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF ;
    public final EObject entryRuleNameObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1869:2: (iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1870:2: iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameObjectEntryValue_in_entryRuleNameObjectEntryValue3938);
            iv_ruleNameObjectEntryValue=ruleNameObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameObjectEntryValue3948); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameObjectEntryValue"


    // $ANTLR start "ruleNameObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1877:1: ruleNameObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) ;
    public final EObject ruleNameObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_requiredValue_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValue_5_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1880:28: ( ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1881:1: ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1881:1: ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1881:2: () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1881:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1882:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNameObjectEntryValueAccess().getNameObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleNameObjectEntryValue3997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNameObjectEntryValueAccess().getNameKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1894:1: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            else if ( (LA39_0==43) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1894:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1894:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1894:3: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1894:3: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1895:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1895:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1896:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,42,FOLLOW_42_in_ruleNameObjectEntryValue4017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_2_0, grammarAccess.getNameObjectEntryValueAccess().getHasMustBeMustBeKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1909:2: ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1910:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1910:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1911:3: lv_requiredValue_3_0= RULE_NAME_OBJECT
                    {
                    lv_requiredValue_3_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue4047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_requiredValue_3_0, grammarAccess.getNameObjectEntryValueAccess().getRequiredValueNAME_OBJECTTerminalRuleCall_2_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_3_0, 
                              		"NAME_OBJECT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1928:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1928:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1928:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1928:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1929:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1929:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1930:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,43,FOLLOW_43_in_ruleNameObjectEntryValue4078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_4_0, grammarAccess.getNameObjectEntryValueAccess().getHasDefaultDefaultKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1943:2: ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1944:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1944:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1945:3: lv_defaultValue_5_0= RULE_NAME_OBJECT
                    {
                    lv_defaultValue_5_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue4108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_defaultValue_5_0, grammarAccess.getNameObjectEntryValueAccess().getDefaultValueNAME_OBJECTTerminalRuleCall_2_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_5_0, 
                              		"NAME_OBJECT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameObjectEntryValue"


    // $ANTLR start "entryRuleNumberObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1969:1: entryRuleNumberObjectEntryValue returns [EObject current=null] : iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF ;
    public final EObject entryRuleNumberObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1970:2: (iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1971:2: iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberObjectEntryValue_in_entryRuleNumberObjectEntryValue4152);
            iv_ruleNumberObjectEntryValue=ruleNumberObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberObjectEntryValue4162); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberObjectEntryValue"


    // $ANTLR start "ruleNumberObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1978:1: ruleNumberObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? ) ;
    public final EObject ruleNumberObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_hasMustBe_5_0=null;
        Token lv_hasDefault_7_0=null;
        EObject lv_rule_3_0 = null;

        EObject lv_requiredValue_6_0 = null;

        EObject lv_defaultValue_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1981:28: ( ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1982:1: ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1982:1: ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1982:2: () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1982:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1983:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberObjectEntryValueAccess().getNumberObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleNumberObjectEntryValue4211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumberObjectEntryValueAccess().getNumKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1995:1: (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1995:3: otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleNumberObjectEntryValue4224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNumberObjectEntryValueAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1999:1: ( (lv_rule_3_0= ruleNumberValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2000:1: (lv_rule_3_0= ruleNumberValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2000:1: (lv_rule_3_0= ruleNumberValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2001:3: lv_rule_3_0= ruleNumberValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getRuleNumberValidationRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberValidationRule_in_ruleNumberObjectEntryValue4245);
                    lv_rule_3_0=ruleNumberValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_3_0, 
                              		"NumberValidationRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleNumberObjectEntryValue4257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNumberObjectEntryValueAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2021:3: ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            else if ( (LA41_0==43) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2021:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2021:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2021:5: ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2021:5: ( (lv_hasMustBe_5_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2022:1: (lv_hasMustBe_5_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2022:1: (lv_hasMustBe_5_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2023:3: lv_hasMustBe_5_0= 'must-be'
                    {
                    lv_hasMustBe_5_0=(Token)match(input,42,FOLLOW_42_in_ruleNumberObjectEntryValue4279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_5_0, grammarAccess.getNumberObjectEntryValueAccess().getHasMustBeMustBeKeyword_3_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2036:2: ( (lv_requiredValue_6_0= ruleNumberLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2037:1: (lv_requiredValue_6_0= ruleNumberLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2037:1: (lv_requiredValue_6_0= ruleNumberLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2038:3: lv_requiredValue_6_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getRequiredValueNumberLiteralParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue4313);
                    lv_requiredValue_6_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_6_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2055:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2055:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2055:7: ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2055:7: ( (lv_hasDefault_7_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2056:1: (lv_hasDefault_7_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2056:1: (lv_hasDefault_7_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2057:3: lv_hasDefault_7_0= 'default'
                    {
                    lv_hasDefault_7_0=(Token)match(input,43,FOLLOW_43_in_ruleNumberObjectEntryValue4339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_7_0, grammarAccess.getNumberObjectEntryValueAccess().getHasDefaultDefaultKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2070:2: ( (lv_defaultValue_8_0= ruleNumberLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2071:1: (lv_defaultValue_8_0= ruleNumberLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2071:1: (lv_defaultValue_8_0= ruleNumberLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2072:3: lv_defaultValue_8_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getDefaultValueNumberLiteralParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue4373);
                    lv_defaultValue_8_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_8_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberObjectEntryValue"


    // $ANTLR start "entryRuleNumberValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2096:1: entryRuleNumberValidationRule returns [EObject current=null] : iv_ruleNumberValidationRule= ruleNumberValidationRule EOF ;
    public final EObject entryRuleNumberValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2097:2: (iv_ruleNumberValidationRule= ruleNumberValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2098:2: iv_ruleNumberValidationRule= ruleNumberValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValidationRule_in_entryRuleNumberValidationRule4412);
            iv_ruleNumberValidationRule=ruleNumberValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValidationRule4422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValidationRule"


    // $ANTLR start "ruleNumberValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2105:1: ruleNumberValidationRule returns [EObject current=null] : (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule ) ;
    public final EObject ruleNumberValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_NumberInclusiveRangeValidationRule_0 = null;

        EObject this_NumberGreaterValidationRule_1 = null;

        EObject this_NumberGreaterEqualsValidationRule_2 = null;

        EObject this_NumberValuesValidationRule_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2108:28: ( (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2109:1: (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2109:1: (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt42=1;
                }
                break;
            case 49:
                {
                alt42=2;
                }
                break;
            case 50:
                {
                alt42=3;
                }
                break;
            case 51:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2110:2: this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberInclusiveRangeValidationRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberInclusiveRangeValidationRule_in_ruleNumberValidationRule4472);
                    this_NumberInclusiveRangeValidationRule_0=ruleNumberInclusiveRangeValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberInclusiveRangeValidationRule_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2123:2: this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberGreaterValidationRuleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberGreaterValidationRule_in_ruleNumberValidationRule4502);
                    this_NumberGreaterValidationRule_1=ruleNumberGreaterValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberGreaterValidationRule_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2136:2: this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberGreaterEqualsValidationRuleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberGreaterEqualsValidationRule_in_ruleNumberValidationRule4532);
                    this_NumberGreaterEqualsValidationRule_2=ruleNumberGreaterEqualsValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberGreaterEqualsValidationRule_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2149:2: this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberValuesValidationRuleParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValuesValidationRule_in_ruleNumberValidationRule4562);
                    this_NumberValuesValidationRule_3=ruleNumberValuesValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberValuesValidationRule_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValidationRule"


    // $ANTLR start "entryRuleNumberInclusiveRangeValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2168:1: entryRuleNumberInclusiveRangeValidationRule returns [EObject current=null] : iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF ;
    public final EObject entryRuleNumberInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberInclusiveRangeValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2169:2: (iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2170:2: iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberInclusiveRangeValidationRule_in_entryRuleNumberInclusiveRangeValidationRule4597);
            iv_ruleNumberInclusiveRangeValidationRule=ruleNumberInclusiveRangeValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberInclusiveRangeValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberInclusiveRangeValidationRule4607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberInclusiveRangeValidationRule"


    // $ANTLR start "ruleNumberInclusiveRangeValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2177:1: ruleNumberInclusiveRangeValidationRule returns [EObject current=null] : (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2180:28: ( (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2181:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2181:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2181:3: otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleNumberInclusiveRangeValidationRule4644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getRangeInclKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2185:1: ( (lv_lowerBound_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2186:1: (lv_lowerBound_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2186:1: (lv_lowerBound_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2187:3: lv_lowerBound_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getLowerBoundNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule4665);
            lv_lowerBound_1_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberInclusiveRangeValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_1_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleNumberInclusiveRangeValidationRule4677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getToKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2207:1: ( (lv_upperBound_3_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2208:1: (lv_upperBound_3_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2208:1: (lv_upperBound_3_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2209:3: lv_upperBound_3_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getUpperBoundNumberLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule4698);
            lv_upperBound_3_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberInclusiveRangeValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_3_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberInclusiveRangeValidationRule"


    // $ANTLR start "entryRuleNumberGreaterValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2233:1: entryRuleNumberGreaterValidationRule returns [EObject current=null] : iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF ;
    public final EObject entryRuleNumberGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberGreaterValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2234:2: (iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2235:2: iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberGreaterValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberGreaterValidationRule_in_entryRuleNumberGreaterValidationRule4734);
            iv_ruleNumberGreaterValidationRule=ruleNumberGreaterValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberGreaterValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberGreaterValidationRule4744); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberGreaterValidationRule"


    // $ANTLR start "ruleNumberGreaterValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2242:1: ruleNumberGreaterValidationRule returns [EObject current=null] : (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2245:28: ( (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2246:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2246:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2246:3: otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleNumberGreaterValidationRule4781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberGreaterValidationRuleAccess().getGreaterKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2250:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2251:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2251:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2252:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberGreaterValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterValidationRule4802);
            lv_minValue_1_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberGreaterValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"minValue",
                      		lv_minValue_1_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberGreaterValidationRule"


    // $ANTLR start "entryRuleNumberGreaterEqualsValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2276:1: entryRuleNumberGreaterEqualsValidationRule returns [EObject current=null] : iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF ;
    public final EObject entryRuleNumberGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberGreaterEqualsValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2277:2: (iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2278:2: iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberGreaterEqualsValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberGreaterEqualsValidationRule_in_entryRuleNumberGreaterEqualsValidationRule4838);
            iv_ruleNumberGreaterEqualsValidationRule=ruleNumberGreaterEqualsValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberGreaterEqualsValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberGreaterEqualsValidationRule4848); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberGreaterEqualsValidationRule"


    // $ANTLR start "ruleNumberGreaterEqualsValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2285:1: ruleNumberGreaterEqualsValidationRule returns [EObject current=null] : (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2288:28: ( (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2289:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2289:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2289:3: otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleNumberGreaterEqualsValidationRule4885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberGreaterEqualsValidationRuleAccess().getGreaterEqualsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2293:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2294:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2294:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2295:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberGreaterEqualsValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterEqualsValidationRule4906);
            lv_minValue_1_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberGreaterEqualsValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"minValue",
                      		lv_minValue_1_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberGreaterEqualsValidationRule"


    // $ANTLR start "entryRuleNumberValuesValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2319:1: entryRuleNumberValuesValidationRule returns [EObject current=null] : iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF ;
    public final EObject entryRuleNumberValuesValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValuesValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2320:2: (iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2321:2: iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValuesValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRule_in_entryRuleNumberValuesValidationRule4942);
            iv_ruleNumberValuesValidationRule=ruleNumberValuesValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValuesValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValuesValidationRule4952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValuesValidationRule"


    // $ANTLR start "ruleNumberValuesValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2328:1: ruleNumberValuesValidationRule returns [EObject current=null] : (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* ) ;
    public final EObject ruleNumberValuesValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2331:28: ( (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2332:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2332:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2332:3: otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleNumberValuesValidationRule4989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberValuesValidationRuleAccess().getValuesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2336:1: ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2337:1: (lv_value_1_0= ruleNumberValuesValidationRuleEntry )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2337:1: (lv_value_1_0= ruleNumberValuesValidationRuleEntry )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2338:3: lv_value_1_0= ruleNumberValuesValidationRuleEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleAccess().getValueNumberValuesValidationRuleEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule5010);
            lv_value_1_0=ruleNumberValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberValuesValidationRuleRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"NumberValuesValidationRuleEntry");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2354:2: (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==15) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2354:4: otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleNumberValuesValidationRule5023); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNumberValuesValidationRuleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2358:1: ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2359:1: (lv_value_3_0= ruleNumberValuesValidationRuleEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2359:1: (lv_value_3_0= ruleNumberValuesValidationRuleEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2360:3: lv_value_3_0= ruleNumberValuesValidationRuleEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleAccess().getValueNumberValuesValidationRuleEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule5044);
            	    lv_value_3_0=ruleNumberValuesValidationRuleEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumberValuesValidationRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"NumberValuesValidationRuleEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValuesValidationRule"


    // $ANTLR start "entryRuleNumberValuesValidationRuleEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2384:1: entryRuleNumberValuesValidationRuleEntry returns [EObject current=null] : iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF ;
    public final EObject entryRuleNumberValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValuesValidationRuleEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2385:2: (iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2386:2: iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_entryRuleNumberValuesValidationRuleEntry5082);
            iv_ruleNumberValuesValidationRuleEntry=ruleNumberValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValuesValidationRuleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValuesValidationRuleEntry5092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValuesValidationRuleEntry"


    // $ANTLR start "ruleNumberValuesValidationRuleEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2393:1: ruleNumberValuesValidationRuleEntry returns [EObject current=null] : ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleNumberValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        Enumerator lv_since_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2396:28: ( ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2397:1: ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2397:1: ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2397:2: ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2397:2: ( (lv_value_0_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2398:1: (lv_value_0_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2398:1: (lv_value_0_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2399:3: lv_value_0_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryAccess().getValueNumberLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberValuesValidationRuleEntry5138);
            lv_value_0_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberValuesValidationRuleEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2415:2: (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2415:4: otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleNumberValuesValidationRuleEntry5151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNumberValuesValidationRuleEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2419:1: ( (lv_since_2_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2420:1: (lv_since_2_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2420:1: (lv_since_2_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2421:3: lv_since_2_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryAccess().getSinceSinceVersionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNumberValuesValidationRuleEntry5172);
                    lv_since_2_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberValuesValidationRuleEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_2_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleNumberValuesValidationRuleEntry5184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumberValuesValidationRuleEntryAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValuesValidationRuleEntry"


    // $ANTLR start "entryRuleIntegerObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2449:1: entryRuleIntegerObjectEntryValue returns [EObject current=null] : iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF ;
    public final EObject entryRuleIntegerObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2450:2: (iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2451:2: iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerObjectEntryValue_in_entryRuleIntegerObjectEntryValue5222);
            iv_ruleIntegerObjectEntryValue=ruleIntegerObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerObjectEntryValue5232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerObjectEntryValue"


    // $ANTLR start "ruleIntegerObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2458:1: ruleIntegerObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? ) ;
    public final EObject ruleIntegerObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_hasMustBe_5_0=null;
        Token lv_hasDefault_7_0=null;
        EObject lv_rule_3_0 = null;

        EObject lv_requiredValue_6_0 = null;

        EObject lv_defaultValue_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2461:28: ( ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2462:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2462:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2462:2: () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2462:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2463:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntegerObjectEntryValueAccess().getIntegerObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleIntegerObjectEntryValue5281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerObjectEntryValueAccess().getIntKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2475:1: (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2475:3: otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleIntegerObjectEntryValue5294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntegerObjectEntryValueAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2479:1: ( (lv_rule_3_0= ruleIntegerValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2480:1: (lv_rule_3_0= ruleIntegerValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2480:1: (lv_rule_3_0= ruleIntegerValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2481:3: lv_rule_3_0= ruleIntegerValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getRuleIntegerValidationRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerValidationRule_in_ruleIntegerObjectEntryValue5315);
                    lv_rule_3_0=ruleIntegerValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_3_0, 
                              		"IntegerValidationRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleIntegerObjectEntryValue5327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIntegerObjectEntryValueAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2501:3: ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            else if ( (LA46_0==43) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2501:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2501:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2501:5: ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2501:5: ( (lv_hasMustBe_5_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:1: (lv_hasMustBe_5_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:1: (lv_hasMustBe_5_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2503:3: lv_hasMustBe_5_0= 'must-be'
                    {
                    lv_hasMustBe_5_0=(Token)match(input,42,FOLLOW_42_in_ruleIntegerObjectEntryValue5349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_5_0, grammarAccess.getIntegerObjectEntryValueAccess().getHasMustBeMustBeKeyword_3_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2516:2: ( (lv_requiredValue_6_0= ruleIntLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2517:1: (lv_requiredValue_6_0= ruleIntLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2517:1: (lv_requiredValue_6_0= ruleIntLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2518:3: lv_requiredValue_6_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getRequiredValueIntLiteralParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue5383);
                    lv_requiredValue_6_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_6_0, 
                              		"IntLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2535:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2535:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2535:7: ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2535:7: ( (lv_hasDefault_7_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:1: (lv_hasDefault_7_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:1: (lv_hasDefault_7_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2537:3: lv_hasDefault_7_0= 'default'
                    {
                    lv_hasDefault_7_0=(Token)match(input,43,FOLLOW_43_in_ruleIntegerObjectEntryValue5409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_7_0, grammarAccess.getIntegerObjectEntryValueAccess().getHasDefaultDefaultKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2550:2: ( (lv_defaultValue_8_0= ruleIntLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2551:1: (lv_defaultValue_8_0= ruleIntLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2551:1: (lv_defaultValue_8_0= ruleIntLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2552:3: lv_defaultValue_8_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getDefaultValueIntLiteralParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue5443);
                    lv_defaultValue_8_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_8_0, 
                              		"IntLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerObjectEntryValue"


    // $ANTLR start "entryRuleIntegerValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2576:1: entryRuleIntegerValidationRule returns [EObject current=null] : iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF ;
    public final EObject entryRuleIntegerValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2577:2: (iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2578:2: iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValidationRule_in_entryRuleIntegerValidationRule5482);
            iv_ruleIntegerValidationRule=ruleIntegerValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValidationRule5492); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValidationRule"


    // $ANTLR start "ruleIntegerValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2585:1: ruleIntegerValidationRule returns [EObject current=null] : (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule ) ;
    public final EObject ruleIntegerValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerInclusiveRangeValidationRule_0 = null;

        EObject this_IntegerValuesValidationRule_1 = null;

        EObject this_IntegerGreaterValidationRule_2 = null;

        EObject this_IntegerGreaterEqualsValidationRule_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2588:28: ( (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2589:1: (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2589:1: (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt47=1;
                }
                break;
            case 51:
                {
                alt47=2;
                }
                break;
            case 49:
                {
                alt47=3;
                }
                break;
            case 50:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2590:2: this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerInclusiveRangeValidationRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_ruleIntegerValidationRule5542);
                    this_IntegerInclusiveRangeValidationRule_0=ruleIntegerInclusiveRangeValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerInclusiveRangeValidationRule_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2603:2: this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerValuesValidationRuleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValuesValidationRule_in_ruleIntegerValidationRule5572);
                    this_IntegerValuesValidationRule_1=ruleIntegerValuesValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValuesValidationRule_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2616:2: this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerGreaterValidationRuleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerGreaterValidationRule_in_ruleIntegerValidationRule5602);
                    this_IntegerGreaterValidationRule_2=ruleIntegerGreaterValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerGreaterValidationRule_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:2: this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerGreaterEqualsValidationRuleParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_ruleIntegerValidationRule5632);
                    this_IntegerGreaterEqualsValidationRule_3=ruleIntegerGreaterEqualsValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerGreaterEqualsValidationRule_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValidationRule"


    // $ANTLR start "entryRuleIntegerInclusiveRangeValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2648:1: entryRuleIntegerInclusiveRangeValidationRule returns [EObject current=null] : iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF ;
    public final EObject entryRuleIntegerInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerInclusiveRangeValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2649:2: (iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2650:2: iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_entryRuleIntegerInclusiveRangeValidationRule5667);
            iv_ruleIntegerInclusiveRangeValidationRule=ruleIntegerInclusiveRangeValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerInclusiveRangeValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerInclusiveRangeValidationRule5677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerInclusiveRangeValidationRule"


    // $ANTLR start "ruleIntegerInclusiveRangeValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2657:1: ruleIntegerInclusiveRangeValidationRule returns [EObject current=null] : (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleIntegerInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2660:28: ( (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2661:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2661:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2661:3: otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleIntegerInclusiveRangeValidationRule5714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getRangeInclKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2665:1: ( (lv_lowerBound_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2666:1: (lv_lowerBound_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2666:1: (lv_lowerBound_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2667:3: lv_lowerBound_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getLowerBoundIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule5735);
            lv_lowerBound_1_0=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerInclusiveRangeValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_1_0, 
                      		"IntLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleIntegerInclusiveRangeValidationRule5747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getToKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2687:1: ( (lv_upperBound_3_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2688:1: (lv_upperBound_3_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2688:1: (lv_upperBound_3_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2689:3: lv_upperBound_3_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getUpperBoundIntLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule5768);
            lv_upperBound_3_0=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerInclusiveRangeValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_3_0, 
                      		"IntLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerInclusiveRangeValidationRule"


    // $ANTLR start "entryRuleIntegerValuesValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2713:1: entryRuleIntegerValuesValidationRule returns [EObject current=null] : iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF ;
    public final EObject entryRuleIntegerValuesValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValuesValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2714:2: (iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2715:2: iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValuesValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRule_in_entryRuleIntegerValuesValidationRule5804);
            iv_ruleIntegerValuesValidationRule=ruleIntegerValuesValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValuesValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValuesValidationRule5814); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValuesValidationRule"


    // $ANTLR start "ruleIntegerValuesValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2722:1: ruleIntegerValuesValidationRule returns [EObject current=null] : (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* ) ;
    public final EObject ruleIntegerValuesValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2725:28: ( (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2726:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2726:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2726:3: otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleIntegerValuesValidationRule5851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerValuesValidationRuleAccess().getValuesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2730:1: ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2731:1: (lv_value_1_0= ruleIntegerValuesValidationRuleEntry )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2731:1: (lv_value_1_0= ruleIntegerValuesValidationRuleEntry )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2732:3: lv_value_1_0= ruleIntegerValuesValidationRuleEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleAccess().getValueIntegerValuesValidationRuleEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule5872);
            lv_value_1_0=ruleIntegerValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValuesValidationRuleRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"IntegerValuesValidationRuleEntry");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2748:2: (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==15) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2748:4: otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleIntegerValuesValidationRule5885); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getIntegerValuesValidationRuleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2752:1: ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2753:1: (lv_value_3_0= ruleIntegerValuesValidationRuleEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2753:1: (lv_value_3_0= ruleIntegerValuesValidationRuleEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2754:3: lv_value_3_0= ruleIntegerValuesValidationRuleEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleAccess().getValueIntegerValuesValidationRuleEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule5906);
            	    lv_value_3_0=ruleIntegerValuesValidationRuleEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIntegerValuesValidationRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"IntegerValuesValidationRuleEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValuesValidationRule"


    // $ANTLR start "entryRuleIntegerGreaterValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2778:1: entryRuleIntegerGreaterValidationRule returns [EObject current=null] : iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF ;
    public final EObject entryRuleIntegerGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerGreaterValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2779:2: (iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2780:2: iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerGreaterValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerGreaterValidationRule_in_entryRuleIntegerGreaterValidationRule5944);
            iv_ruleIntegerGreaterValidationRule=ruleIntegerGreaterValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerGreaterValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerGreaterValidationRule5954); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerGreaterValidationRule"


    // $ANTLR start "ruleIntegerGreaterValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2787:1: ruleIntegerGreaterValidationRule returns [EObject current=null] : (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleIntegerGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2790:28: ( (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2791:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2791:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2791:3: otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleIntegerGreaterValidationRule5991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerGreaterValidationRuleAccess().getGreaterKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2795:1: ( (lv_minValue_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2796:1: (lv_minValue_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2796:1: (lv_minValue_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2797:3: lv_minValue_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerGreaterValidationRuleAccess().getMinValueIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerGreaterValidationRule6012);
            lv_minValue_1_0=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerGreaterValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"minValue",
                      		lv_minValue_1_0, 
                      		"IntLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerGreaterValidationRule"


    // $ANTLR start "entryRuleIntegerGreaterEqualsValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2821:1: entryRuleIntegerGreaterEqualsValidationRule returns [EObject current=null] : iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF ;
    public final EObject entryRuleIntegerGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerGreaterEqualsValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2822:2: (iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2823:2: iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerGreaterEqualsValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_entryRuleIntegerGreaterEqualsValidationRule6048);
            iv_ruleIntegerGreaterEqualsValidationRule=ruleIntegerGreaterEqualsValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerGreaterEqualsValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerGreaterEqualsValidationRule6058); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerGreaterEqualsValidationRule"


    // $ANTLR start "ruleIntegerGreaterEqualsValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2830:1: ruleIntegerGreaterEqualsValidationRule returns [EObject current=null] : (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleIntegerGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2833:28: ( (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2834:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2834:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2834:3: otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleIntegerGreaterEqualsValidationRule6095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerGreaterEqualsValidationRuleAccess().getGreaterEqualsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2838:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2839:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2839:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2840:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerGreaterEqualsValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleIntegerGreaterEqualsValidationRule6116);
            lv_minValue_1_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerGreaterEqualsValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"minValue",
                      		lv_minValue_1_0, 
                      		"NumberLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerGreaterEqualsValidationRule"


    // $ANTLR start "entryRuleIntegerValuesValidationRuleEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2864:1: entryRuleIntegerValuesValidationRuleEntry returns [EObject current=null] : iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF ;
    public final EObject entryRuleIntegerValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValuesValidationRuleEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2865:2: (iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2866:2: iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_entryRuleIntegerValuesValidationRuleEntry6152);
            iv_ruleIntegerValuesValidationRuleEntry=ruleIntegerValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValuesValidationRuleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValuesValidationRuleEntry6162); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValuesValidationRuleEntry"


    // $ANTLR start "ruleIntegerValuesValidationRuleEntry"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2873:1: ruleIntegerValuesValidationRuleEntry returns [EObject current=null] : ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleIntegerValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        Enumerator lv_since_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2876:28: ( ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2877:1: ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2877:1: ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2877:2: ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2877:2: ( (lv_value_0_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2878:1: (lv_value_0_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2878:1: (lv_value_0_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2879:3: lv_value_0_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryAccess().getValueIntLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerValuesValidationRuleEntry6208);
            lv_value_0_0=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValuesValidationRuleEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"IntLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2895:2: (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==19) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2895:4: otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIntegerValuesValidationRuleEntry6221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIntegerValuesValidationRuleEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2899:1: ( (lv_since_2_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2900:1: (lv_since_2_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2900:1: (lv_since_2_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2901:3: lv_since_2_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryAccess().getSinceSinceVersionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleIntegerValuesValidationRuleEntry6242);
                    lv_since_2_0=ruleSinceVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerValuesValidationRuleEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"since",
                              		lv_since_2_0, 
                              		"SinceVersion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIntegerValuesValidationRuleEntry6254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIntegerValuesValidationRuleEntryAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValuesValidationRuleEntry"


    // $ANTLR start "entryRuleRealObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2929:1: entryRuleRealObjectEntryValue returns [EObject current=null] : iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF ;
    public final EObject entryRuleRealObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2930:2: (iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2931:2: iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleRealObjectEntryValue_in_entryRuleRealObjectEntryValue6292);
            iv_ruleRealObjectEntryValue=ruleRealObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealObjectEntryValue6302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealObjectEntryValue"


    // $ANTLR start "ruleRealObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2938:1: ruleRealObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? ) ;
    public final EObject ruleRealObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_hasDefault_4_0=null;
        EObject lv_requiredValue_3_0 = null;

        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2941:28: ( ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2942:1: ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2942:1: ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2942:2: () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2942:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2943:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealObjectEntryValueAccess().getRealObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleRealObjectEntryValue6351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealObjectEntryValueAccess().getRealKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2955:1: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            else if ( (LA50_0==43) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2955:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2955:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2955:3: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2955:3: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2956:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2956:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2957:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,42,FOLLOW_42_in_ruleRealObjectEntryValue6371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_2_0, grammarAccess.getRealObjectEntryValueAccess().getHasMustBeMustBeKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2970:2: ( (lv_requiredValue_3_0= ruleRealLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2971:1: (lv_requiredValue_3_0= ruleRealLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2971:1: (lv_requiredValue_3_0= ruleRealLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2972:3: lv_requiredValue_3_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealObjectEntryValueAccess().getRequiredValueRealLiteralParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue6405);
                    lv_requiredValue_3_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_3_0, 
                              		"RealLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2989:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2989:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2989:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2989:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2990:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2990:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2991:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,43,FOLLOW_43_in_ruleRealObjectEntryValue6431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_4_0, grammarAccess.getRealObjectEntryValueAccess().getHasDefaultDefaultKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealObjectEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3004:2: ( (lv_defaultValue_5_0= ruleRealLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:1: (lv_defaultValue_5_0= ruleRealLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:1: (lv_defaultValue_5_0= ruleRealLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3006:3: lv_defaultValue_5_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealObjectEntryValueAccess().getDefaultValueRealLiteralParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue6465);
                    lv_defaultValue_5_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealObjectEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_5_0, 
                              		"RealLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealObjectEntryValue"


    // $ANTLR start "entryRuleNameTreeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3030:1: entryRuleNameTreeEntryValue returns [EObject current=null] : iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF ;
    public final EObject entryRuleNameTreeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTreeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3031:2: (iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3032:2: iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameTreeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameTreeEntryValue_in_entryRuleNameTreeEntryValue6504);
            iv_ruleNameTreeEntryValue=ruleNameTreeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameTreeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameTreeEntryValue6514); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameTreeEntryValue"


    // $ANTLR start "ruleNameTreeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3039:1: ruleNameTreeEntryValue returns [EObject current=null] : ( () otherlv_1= 'name-tree' ) ;
    public final EObject ruleNameTreeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3042:28: ( ( () otherlv_1= 'name-tree' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3043:1: ( () otherlv_1= 'name-tree' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3043:1: ( () otherlv_1= 'name-tree' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3043:2: () otherlv_1= 'name-tree'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3043:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3044:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNameTreeEntryValueAccess().getNameTreeEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleNameTreeEntryValue6563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNameTreeEntryValueAccess().getNameTreeKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameTreeEntryValue"


    // $ANTLR start "entryRuleNumberTreeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3064:1: entryRuleNumberTreeEntryValue returns [EObject current=null] : iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF ;
    public final EObject entryRuleNumberTreeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTreeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3065:2: (iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3066:2: iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTreeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTreeEntryValue_in_entryRuleNumberTreeEntryValue6599);
            iv_ruleNumberTreeEntryValue=ruleNumberTreeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTreeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTreeEntryValue6609); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTreeEntryValue"


    // $ANTLR start "ruleNumberTreeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3073:1: ruleNumberTreeEntryValue returns [EObject current=null] : ( () otherlv_1= 'number-tree' ) ;
    public final EObject ruleNumberTreeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3076:28: ( ( () otherlv_1= 'number-tree' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3077:1: ( () otherlv_1= 'number-tree' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3077:1: ( () otherlv_1= 'number-tree' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3077:2: () otherlv_1= 'number-tree'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3077:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3078:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberTreeEntryValueAccess().getNumberTreeEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNumberTreeEntryValue6658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumberTreeEntryValueAccess().getNumberTreeKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberTreeEntryValue"


    // $ANTLR start "entryRuleArrayEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3098:1: entryRuleArrayEntryValue returns [EObject current=null] : iv_ruleArrayEntryValue= ruleArrayEntryValue EOF ;
    public final EObject entryRuleArrayEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3099:2: (iv_ruleArrayEntryValue= ruleArrayEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3100:2: iv_ruleArrayEntryValue= ruleArrayEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleArrayEntryValue_in_entryRuleArrayEntryValue6694);
            iv_ruleArrayEntryValue=ruleArrayEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayEntryValue6704); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayEntryValue"


    // $ANTLR start "ruleArrayEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3107:1: ruleArrayEntryValue returns [EObject current=null] : (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' ) ;
    public final EObject ruleArrayEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_requiresCustomValidation_7_0=null;
        Token lv_requiresCustomDefault_8_0=null;
        Token otherlv_9=null;
        EObject lv_rule_2_0 = null;

        Enumerator lv_indirectReference_5_0 = null;

        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3110:28: ( (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3111:1: (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3111:1: (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3111:3: otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleArrayEntryValue6741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayEntryValueAccess().getArrayKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3115:1: (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3115:3: otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleArrayEntryValue6754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArrayEntryValueAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3119:1: ( (lv_rule_2_0= ruleArrayValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3120:1: (lv_rule_2_0= ruleArrayValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3120:1: (lv_rule_2_0= ruleArrayValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3121:3: lv_rule_2_0= ruleArrayValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getRuleArrayValidationRuleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrayValidationRule_in_ruleArrayEntryValue6775);
                    lv_rule_2_0=ruleArrayValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_2_0, 
                              		"ArrayValidationRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleArrayEntryValue6787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayEntryValueAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleArrayEntryValue6801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayEntryValueAccess().getLessThanSignKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3145:1: ( (lv_indirectReference_5_0= ruleIndirectReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=72 && LA52_0<=75)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3146:1: (lv_indirectReference_5_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3146:1: (lv_indirectReference_5_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3147:3: lv_indirectReference_5_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleArrayEntryValue6822);
                    lv_indirectReference_5_0=ruleIndirectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"indirectReference",
                              		lv_indirectReference_5_0, 
                              		"IndirectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3163:3: ( (lv_type_6_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3164:1: (lv_type_6_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3164:1: (lv_type_6_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3165:3: lv_type_6_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getTypeAbstractEntryValueParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleArrayEntryValue6844);
            lv_type_6_0=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayEntryValueRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_6_0, 
                      		"AbstractEntryValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3181:2: ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3182:1: (lv_requiresCustomValidation_7_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3182:1: (lv_requiresCustomValidation_7_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3183:3: lv_requiresCustomValidation_7_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_7_0=(Token)match(input,27,FOLLOW_27_in_ruleArrayEntryValue6862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomValidation_7_0, grammarAccess.getArrayEntryValueAccess().getRequiresCustomValidationCustomValidationKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomValidation", true, "custom-validation");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3196:3: ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3197:1: (lv_requiresCustomDefault_8_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3197:1: (lv_requiresCustomDefault_8_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3198:3: lv_requiresCustomDefault_8_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_8_0=(Token)match(input,28,FOLLOW_28_in_ruleArrayEntryValue6894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomDefault_8_0, grammarAccess.getArrayEntryValueAccess().getRequiresCustomDefaultCustomDefaultKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomDefault", true, "custom-default");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleArrayEntryValue6920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getArrayEntryValueAccess().getGreaterThanSignKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayEntryValue"


    // $ANTLR start "entryRuleArrayValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3223:1: entryRuleArrayValidationRule returns [EObject current=null] : iv_ruleArrayValidationRule= ruleArrayValidationRule EOF ;
    public final EObject entryRuleArrayValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3224:2: (iv_ruleArrayValidationRule= ruleArrayValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3225:2: iv_ruleArrayValidationRule= ruleArrayValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleArrayValidationRule_in_entryRuleArrayValidationRule6956);
            iv_ruleArrayValidationRule=ruleArrayValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayValidationRule6966); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValidationRule"


    // $ANTLR start "ruleArrayValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3232:1: ruleArrayValidationRule returns [EObject current=null] : this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule ;
    public final EObject ruleArrayValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayLengthValidationRule_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3235:28: (this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3237:2: this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayValidationRuleAccess().getArrayLengthValidationRuleParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrayLengthValidationRule_in_ruleArrayValidationRule7015);
            this_ArrayLengthValidationRule_0=ruleArrayLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArrayLengthValidationRule_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValidationRule"


    // $ANTLR start "entryRuleArrayLengthValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3256:1: entryRuleArrayLengthValidationRule returns [EObject current=null] : iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF ;
    public final EObject entryRuleArrayLengthValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLengthValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3257:2: (iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3258:2: iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLengthValidationRule_in_entryRuleArrayLengthValidationRule7049);
            iv_ruleArrayLengthValidationRule=ruleArrayLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLengthValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLengthValidationRule7059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLengthValidationRule"


    // $ANTLR start "ruleArrayLengthValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3265:1: ruleArrayLengthValidationRule returns [EObject current=null] : (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) ) ;
    public final EObject ruleArrayLengthValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3268:28: ( (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:1: (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:1: (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:3: otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleArrayLengthValidationRule7096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLengthValidationRuleAccess().getLengthKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3273:1: ( (lv_length_1_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3274:1: (lv_length_1_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3274:1: (lv_length_1_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3275:3: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayLengthValidationRule7113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_length_1_0, grammarAccess.getArrayLengthValidationRuleAccess().getLengthINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getArrayLengthValidationRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"length",
                      		lv_length_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLengthValidationRule"


    // $ANTLR start "entryRuleObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3299:1: entryRuleObjectEntryValue returns [EObject current=null] : iv_ruleObjectEntryValue= ruleObjectEntryValue EOF ;
    public final EObject entryRuleObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3300:2: (iv_ruleObjectEntryValue= ruleObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3301:2: iv_ruleObjectEntryValue= ruleObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleObjectEntryValue_in_entryRuleObjectEntryValue7154);
            iv_ruleObjectEntryValue=ruleObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectEntryValue7164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectEntryValue"


    // $ANTLR start "ruleObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3308:1: ruleObjectEntryValue returns [EObject current=null] : (otherlv_0= 'object' () ) ;
    public final EObject ruleObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3311:28: ( (otherlv_0= 'object' () ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3312:1: (otherlv_0= 'object' () )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3312:1: (otherlv_0= 'object' () )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3312:3: otherlv_0= 'object' ()
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleObjectEntryValue7201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectEntryValueAccess().getObjectKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3316:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3317:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getObjectEntryValueAccess().getObjectEntryValueAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectEntryValue"


    // $ANTLR start "entryRuleMappingDictEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3333:1: entryRuleMappingDictEntryValue returns [EObject current=null] : iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF ;
    public final EObject entryRuleMappingDictEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingDictEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3334:2: (iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3335:2: iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingDictEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleMappingDictEntryValue_in_entryRuleMappingDictEntryValue7249);
            iv_ruleMappingDictEntryValue=ruleMappingDictEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingDictEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingDictEntryValue7259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingDictEntryValue"


    // $ANTLR start "ruleMappingDictEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3342:1: ruleMappingDictEntryValue returns [EObject current=null] : (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' ) ;
    public final EObject ruleMappingDictEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_requiresCustomValidation_3_0=null;
        Token lv_requiresCustomDefault_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3345:28: ( (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3346:1: (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3346:1: (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3346:3: otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleMappingDictEntryValue7296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingDictEntryValueAccess().getMappingDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleMappingDictEntryValue7308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingDictEntryValueAccess().getLessThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3354:1: ( (lv_type_2_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3355:1: (lv_type_2_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3355:1: (lv_type_2_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3356:3: lv_type_2_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingDictEntryValueAccess().getTypeAbstractEntryValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleMappingDictEntryValue7329);
            lv_type_2_0=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingDictEntryValueRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"AbstractEntryValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3372:2: ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==27) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3373:1: (lv_requiresCustomValidation_3_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3373:1: (lv_requiresCustomValidation_3_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3374:3: lv_requiresCustomValidation_3_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_3_0=(Token)match(input,27,FOLLOW_27_in_ruleMappingDictEntryValue7347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomValidation_3_0, grammarAccess.getMappingDictEntryValueAccess().getRequiresCustomValidationCustomValidationKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingDictEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomValidation", true, "custom-validation");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3387:3: ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==28) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3388:1: (lv_requiresCustomDefault_4_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3388:1: (lv_requiresCustomDefault_4_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3389:3: lv_requiresCustomDefault_4_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_4_0=(Token)match(input,28,FOLLOW_28_in_ruleMappingDictEntryValue7379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiresCustomDefault_4_0, grammarAccess.getMappingDictEntryValueAccess().getRequiresCustomDefaultCustomDefaultKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingDictEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "requiresCustomDefault", true, "custom-default");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleMappingDictEntryValue7405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMappingDictEntryValueAccess().getGreaterThanSignKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingDictEntryValue"


    // $ANTLR start "entryRuleStringEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3414:1: entryRuleStringEntryValue returns [EObject current=null] : iv_ruleStringEntryValue= ruleStringEntryValue EOF ;
    public final EObject entryRuleStringEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3415:2: (iv_ruleStringEntryValue= ruleStringEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3416:2: iv_ruleStringEntryValue= ruleStringEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringEntryValue_in_entryRuleStringEntryValue7441);
            iv_ruleStringEntryValue=ruleStringEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringEntryValue7451); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringEntryValue"


    // $ANTLR start "ruleStringEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3423:1: ruleStringEntryValue returns [EObject current=null] : ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleStringEntryValue() throws RecognitionException {
        EObject current = null;

        Token lv_textString_0_0=null;
        Token lv_asciiString_1_0=null;
        Token lv_byteString_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rule_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3426:28: ( ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:1: ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:1: ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:2: ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:2: ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt57=1;
                }
                break;
            case 63:
                {
                alt57=2;
                }
                break;
            case 64:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:3: ( (lv_textString_0_0= 'text-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3427:3: ( (lv_textString_0_0= 'text-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3428:1: (lv_textString_0_0= 'text-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3428:1: (lv_textString_0_0= 'text-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3429:3: lv_textString_0_0= 'text-string'
                    {
                    lv_textString_0_0=(Token)match(input,62,FOLLOW_62_in_ruleStringEntryValue7495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_textString_0_0, grammarAccess.getStringEntryValueAccess().getTextStringTextStringKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "textString", true, "text-string");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3443:6: ( (lv_asciiString_1_0= 'ascii-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3443:6: ( (lv_asciiString_1_0= 'ascii-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3444:1: (lv_asciiString_1_0= 'ascii-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3444:1: (lv_asciiString_1_0= 'ascii-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3445:3: lv_asciiString_1_0= 'ascii-string'
                    {
                    lv_asciiString_1_0=(Token)match(input,63,FOLLOW_63_in_ruleStringEntryValue7532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asciiString_1_0, grammarAccess.getStringEntryValueAccess().getAsciiStringAsciiStringKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "asciiString", true, "ascii-string");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3459:6: ( (lv_byteString_2_0= 'byte-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3459:6: ( (lv_byteString_2_0= 'byte-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3460:1: (lv_byteString_2_0= 'byte-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3460:1: (lv_byteString_2_0= 'byte-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3461:3: lv_byteString_2_0= 'byte-string'
                    {
                    lv_byteString_2_0=(Token)match(input,64,FOLLOW_64_in_ruleStringEntryValue7569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_byteString_2_0, grammarAccess.getStringEntryValueAccess().getByteStringByteStringKeyword_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "byteString", true, "byte-string");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3474:3: (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==45) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3474:5: otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleStringEntryValue7596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStringEntryValueAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3478:1: ( (lv_rule_4_0= ruleStringValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3479:1: (lv_rule_4_0= ruleStringValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3479:1: (lv_rule_4_0= ruleStringValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3480:3: lv_rule_4_0= ruleStringValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringEntryValueAccess().getRuleStringValidationRuleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStringValidationRule_in_ruleStringEntryValue7617);
                    lv_rule_4_0=ruleStringValidationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_4_0, 
                              		"StringValidationRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleStringEntryValue7629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStringEntryValueAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringEntryValue"


    // $ANTLR start "entryRuleStringValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3508:1: entryRuleStringValidationRule returns [EObject current=null] : iv_ruleStringValidationRule= ruleStringValidationRule EOF ;
    public final EObject entryRuleStringValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3509:2: (iv_ruleStringValidationRule= ruleStringValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3510:2: iv_ruleStringValidationRule= ruleStringValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleStringValidationRule_in_entryRuleStringValidationRule7667);
            iv_ruleStringValidationRule=ruleStringValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValidationRule7677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValidationRule"


    // $ANTLR start "ruleStringValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3517:1: ruleStringValidationRule returns [EObject current=null] : this_StringLengthValidationRule_0= ruleStringLengthValidationRule ;
    public final EObject ruleStringValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_StringLengthValidationRule_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3520:28: (this_StringLengthValidationRule_0= ruleStringLengthValidationRule )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3522:2: this_StringLengthValidationRule_0= ruleStringLengthValidationRule
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStringValidationRuleAccess().getStringLengthValidationRuleParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleStringLengthValidationRule_in_ruleStringValidationRule7726);
            this_StringLengthValidationRule_0=ruleStringLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_StringLengthValidationRule_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValidationRule"


    // $ANTLR start "entryRuleStringLengthValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3541:1: entryRuleStringLengthValidationRule returns [EObject current=null] : iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF ;
    public final EObject entryRuleStringLengthValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLengthValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3542:2: (iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3543:2: iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLengthValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleStringLengthValidationRule_in_entryRuleStringLengthValidationRule7760);
            iv_ruleStringLengthValidationRule=ruleStringLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLengthValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLengthValidationRule7770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLengthValidationRule"


    // $ANTLR start "ruleStringLengthValidationRule"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3550:1: ruleStringLengthValidationRule returns [EObject current=null] : (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleStringLengthValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_length_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3553:28: ( (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3554:1: (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3554:1: (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3554:3: otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleStringLengthValidationRule7807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringLengthValidationRuleAccess().getLengthKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3558:1: ( (lv_length_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3559:1: (lv_length_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3559:1: (lv_length_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3560:3: lv_length_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringLengthValidationRuleAccess().getLengthIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleStringLengthValidationRule7828);
            lv_length_1_0=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringLengthValidationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"length",
                      		lv_length_1_0, 
                      		"IntLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLengthValidationRule"


    // $ANTLR start "entryRuleAlternativeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3584:1: entryRuleAlternativeEntryValue returns [EObject current=null] : iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF ;
    public final EObject entryRuleAlternativeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3585:2: (iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3586:2: iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleAlternativeEntryValue_in_entryRuleAlternativeEntryValue7864);
            iv_ruleAlternativeEntryValue=ruleAlternativeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternativeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeEntryValue7874); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeEntryValue"


    // $ANTLR start "ruleAlternativeEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3593:1: ruleAlternativeEntryValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAlternativeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3596:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:1: (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:1: (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:3: otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAlternativeEntryValue7911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlternativeEntryValueAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3601:1: ( (lv_options_1_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3602:1: (lv_options_1_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3602:1: (lv_options_1_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3603:3: lv_options_1_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeEntryValueAccess().getOptionsAbstractEntryValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue7932);
            lv_options_1_0=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlternativeEntryValueRule());
              	        }
                     		add(
                     			current, 
                     			"options",
                      		lv_options_1_0, 
                      		"AbstractEntryValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3619:2: (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==65) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3619:4: otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) )
            	    {
            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleAlternativeEntryValue7945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAlternativeEntryValueAccess().getVerticalLineKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3623:1: ( (lv_options_3_0= ruleAbstractEntryValue ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3624:1: (lv_options_3_0= ruleAbstractEntryValue )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3624:1: (lv_options_3_0= ruleAbstractEntryValue )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3625:3: lv_options_3_0= ruleAbstractEntryValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAlternativeEntryValueAccess().getOptionsAbstractEntryValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue7966);
            	    lv_options_3_0=ruleAbstractEntryValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAlternativeEntryValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_3_0, 
            	              		"AbstractEntryValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAlternativeEntryValue7980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlternativeEntryValueAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeEntryValue"


    // $ANTLR start "entryRuleBooleanEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3653:1: entryRuleBooleanEntryValue returns [EObject current=null] : iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF ;
    public final EObject entryRuleBooleanEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3654:2: (iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3655:2: iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanEntryValue_in_entryRuleBooleanEntryValue8016);
            iv_ruleBooleanEntryValue=ruleBooleanEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanEntryValue8026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanEntryValue"


    // $ANTLR start "ruleBooleanEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3662:1: ruleBooleanEntryValue returns [EObject current=null] : (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? ) ;
    public final EObject ruleBooleanEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_hasDefault_4_0=null;
        Enumerator lv_requiredValue_3_0 = null;

        Enumerator lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3665:28: ( (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3666:1: (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3666:1: (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3666:3: otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleBooleanEntryValue8063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBooleanEntryValueAccess().getBoolKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3670:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3671:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanEntryValueAccess().getBooleanEntryValueAction_1(),
                          current);
                  
            }

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3679:2: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            else if ( (LA60_0==43) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3679:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3679:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3679:4: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3679:4: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3680:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3680:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3681:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,42,FOLLOW_42_in_ruleBooleanEntryValue8095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_2_0, grammarAccess.getBooleanEntryValueAccess().getHasMustBeMustBeKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3694:2: ( (lv_requiredValue_3_0= ruleBool ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3695:1: (lv_requiredValue_3_0= ruleBool )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3695:1: (lv_requiredValue_3_0= ruleBool )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3696:3: lv_requiredValue_3_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanEntryValueAccess().getRequiredValueBoolEnumRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBooleanEntryValue8129);
                    lv_requiredValue_3_0=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBooleanEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_3_0, 
                              		"Bool");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3713:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3713:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3713:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3713:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3714:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3714:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3715:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,43,FOLLOW_43_in_ruleBooleanEntryValue8155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_4_0, grammarAccess.getBooleanEntryValueAccess().getHasDefaultDefaultKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3728:2: ( (lv_defaultValue_5_0= ruleBool ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3729:1: (lv_defaultValue_5_0= ruleBool )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3729:1: (lv_defaultValue_5_0= ruleBool )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3730:3: lv_defaultValue_5_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanEntryValueAccess().getDefaultValueBoolEnumRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBooleanEntryValue8189);
                    lv_defaultValue_5_0=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBooleanEntryValueRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_5_0, 
                              		"Bool");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanEntryValue"


    // $ANTLR start "entryRuleReferenceEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3754:1: entryRuleReferenceEntryValue returns [EObject current=null] : iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF ;
    public final EObject entryRuleReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3755:2: (iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3756:2: iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceEntryValue_in_entryRuleReferenceEntryValue8228);
            iv_ruleReferenceEntryValue=ruleReferenceEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceEntryValue8238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceEntryValue"


    // $ANTLR start "ruleReferenceEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3763:1: ruleReferenceEntryValue returns [EObject current=null] : (otherlv_0= 'ref' () ) ;
    public final EObject ruleReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3766:28: ( (otherlv_0= 'ref' () ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3767:1: (otherlv_0= 'ref' () )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3767:1: (otherlv_0= 'ref' () )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3767:3: otherlv_0= 'ref' ()
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleReferenceEntryValue8275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceEntryValueAccess().getRefKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3771:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3772:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReferenceEntryValueAccess().getReferenceEntryValueAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceEntryValue"


    // $ANTLR start "entryRuleParentReferenceEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3788:1: entryRuleParentReferenceEntryValue returns [EObject current=null] : iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF ;
    public final EObject entryRuleParentReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentReferenceEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3789:2: (iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3790:2: iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentReferenceEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleParentReferenceEntryValue_in_entryRuleParentReferenceEntryValue8323);
            iv_ruleParentReferenceEntryValue=ruleParentReferenceEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentReferenceEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentReferenceEntryValue8333); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentReferenceEntryValue"


    // $ANTLR start "ruleParentReferenceEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3797:1: ruleParentReferenceEntryValue returns [EObject current=null] : (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleParentReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3800:28: ( (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3801:1: (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3801:1: (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3801:3: otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleParentReferenceEntryValue8370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParentReferenceEntryValueAccess().getParentRefKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3805:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3806:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3806:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3807:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParentReferenceEntryValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParentReferenceEntryValueAccess().getParentTypeDictionaryDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParentReferenceEntryValue8397);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParentReferenceEntryValue"


    // $ANTLR start "entryRuleDictionaryObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3831:1: entryRuleDictionaryObjectEntryValue returns [EObject current=null] : iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF ;
    public final EObject entryRuleDictionaryObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3832:2: (iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3833:2: iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryObjectEntryValue_in_entryRuleDictionaryObjectEntryValue8433);
            iv_ruleDictionaryObjectEntryValue=ruleDictionaryObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryObjectEntryValue8443); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionaryObjectEntryValue"


    // $ANTLR start "ruleDictionaryObjectEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3840:1: ruleDictionaryObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'dict' ) ;
    public final EObject ruleDictionaryObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3843:28: ( ( () otherlv_1= 'dict' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3844:1: ( () otherlv_1= 'dict' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3844:1: ( () otherlv_1= 'dict' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3844:2: () otherlv_1= 'dict'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3844:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3845:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictionaryObjectEntryValueAccess().getDictionaryObjectEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleDictionaryObjectEntryValue8492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictionaryObjectEntryValueAccess().getDictKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionaryObjectEntryValue"


    // $ANTLR start "entryRuleDictionaryDeclarationEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3865:1: entryRuleDictionaryDeclarationEntryValue returns [EObject current=null] : iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF ;
    public final EObject entryRuleDictionaryDeclarationEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryDeclarationEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3866:2: (iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3867:2: iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryDeclarationEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryDeclarationEntryValue_in_entryRuleDictionaryDeclarationEntryValue8528);
            iv_ruleDictionaryDeclarationEntryValue=ruleDictionaryDeclarationEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryDeclarationEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryDeclarationEntryValue8538); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionaryDeclarationEntryValue"


    // $ANTLR start "ruleDictionaryDeclarationEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3874:1: ruleDictionaryDeclarationEntryValue returns [EObject current=null] : (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDictionaryDeclarationEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3877:28: ( (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3878:1: (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3878:1: (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3878:3: otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDictionaryDeclarationEntryValue8575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictionaryDeclarationEntryValueAccess().getDictObjKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3882:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3883:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3883:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3884:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDictionaryDeclarationEntryValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictionaryDeclarationEntryValueAccess().getTargetDictionaryDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclarationEntryValue8602);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionaryDeclarationEntryValue"


    // $ANTLR start "entryRuleArrayMappedEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3908:1: entryRuleArrayMappedEntryValue returns [EObject current=null] : iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF ;
    public final EObject entryRuleArrayMappedEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3909:2: (iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3910:2: iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedEntryValue_in_entryRuleArrayMappedEntryValue8638);
            iv_ruleArrayMappedEntryValue=ruleArrayMappedEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedEntryValue8648); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayMappedEntryValue"


    // $ANTLR start "ruleArrayMappedEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3917:1: ruleArrayMappedEntryValue returns [EObject current=null] : (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleArrayMappedEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3920:28: ( (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3921:1: (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3921:1: (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3921:3: otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleArrayMappedEntryValue8685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayMappedEntryValueAccess().getArrayMappedKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3925:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3926:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3926:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3927:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getArrayMappedEntryValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedEntryValueAccess().getTargetArrayMappedDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArrayMappedEntryValue8712);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayMappedEntryValue"


    // $ANTLR start "entryRuleBitFlagsEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3951:1: entryRuleBitFlagsEntryValue returns [EObject current=null] : iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF ;
    public final EObject entryRuleBitFlagsEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3952:2: (iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3953:2: iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsEntryValue_in_entryRuleBitFlagsEntryValue8748);
            iv_ruleBitFlagsEntryValue=ruleBitFlagsEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsEntryValue8758); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitFlagsEntryValue"


    // $ANTLR start "ruleBitFlagsEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3960:1: ruleBitFlagsEntryValue returns [EObject current=null] : (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBitFlagsEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3963:28: ( (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3964:1: (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3964:1: (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3964:3: otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleBitFlagsEntryValue8795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBitFlagsEntryValueAccess().getBitFlagsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3968:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3969:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3969:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3970:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBitFlagsEntryValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsEntryValueAccess().getTargetBitFlagsDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBitFlagsEntryValue8822);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitFlagsEntryValue"


    // $ANTLR start "entryRuleDateEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3994:1: entryRuleDateEntryValue returns [EObject current=null] : iv_ruleDateEntryValue= ruleDateEntryValue EOF ;
    public final EObject entryRuleDateEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3995:2: (iv_ruleDateEntryValue= ruleDateEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3996:2: iv_ruleDateEntryValue= ruleDateEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDateEntryValue_in_entryRuleDateEntryValue8858);
            iv_ruleDateEntryValue=ruleDateEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateEntryValue8868); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateEntryValue"


    // $ANTLR start "ruleDateEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4003:1: ruleDateEntryValue returns [EObject current=null] : ( () otherlv_1= 'date' ) ;
    public final EObject ruleDateEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4006:28: ( ( () otherlv_1= 'date' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4007:1: ( () otherlv_1= 'date' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4007:1: ( () otherlv_1= 'date' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4007:2: () otherlv_1= 'date'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4007:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4008:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDateEntryValueAccess().getDateEntryValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleDateEntryValue8917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDateEntryValueAccess().getDateKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateEntryValue"


    // $ANTLR start "entryRuleNameEnumEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4028:1: entryRuleNameEnumEntryValue returns [EObject current=null] : iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF ;
    public final EObject entryRuleNameEnumEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4029:2: (iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4030:2: iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumEntryValue_in_entryRuleNameEnumEntryValue8953);
            iv_ruleNameEnumEntryValue=ruleNameEnumEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumEntryValue8963); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameEnumEntryValue"


    // $ANTLR start "ruleNameEnumEntryValue"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4037:1: ruleNameEnumEntryValue returns [EObject current=null] : (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) ;
    public final EObject ruleNameEnumEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_requiredValue_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValue_5_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4040:28: ( (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4041:1: (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4041:1: (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4041:3: otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNameEnumEntryValue9000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNameEnumEntryValueAccess().getNameEnumKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4045:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4046:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4046:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4047:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNameEnumEntryValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameEnumEntryValueAccess().getTargetNameEnumDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNameEnumEntryValue9027);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4063:2: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            else if ( (LA61_0==43) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4063:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4063:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4063:4: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4063:4: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4064:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4064:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4065:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,42,FOLLOW_42_in_ruleNameEnumEntryValue9047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasMustBe_2_0, grammarAccess.getNameEnumEntryValueAccess().getHasMustBeMustBeKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameEnumEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasMustBe", true, "must-be");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4078:2: ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4079:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4079:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4080:3: lv_requiredValue_3_0= RULE_NAME_OBJECT
                    {
                    lv_requiredValue_3_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue9077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_requiredValue_3_0, grammarAccess.getNameEnumEntryValueAccess().getRequiredValueNAME_OBJECTTerminalRuleCall_2_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameEnumEntryValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"requiredValue",
                              		lv_requiredValue_3_0, 
                              		"NAME_OBJECT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4097:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4097:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4097:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4097:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4098:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4098:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4099:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,43,FOLLOW_43_in_ruleNameEnumEntryValue9108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_hasDefault_4_0, grammarAccess.getNameEnumEntryValueAccess().getHasDefaultDefaultKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameEnumEntryValueRule());
                      	        }
                             		setWithLastConsumed(current, "hasDefault", true, "default");
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4112:2: ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4113:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4113:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4114:3: lv_defaultValue_5_0= RULE_NAME_OBJECT
                    {
                    lv_defaultValue_5_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue9138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_defaultValue_5_0, grammarAccess.getNameEnumEntryValueAccess().getDefaultValueNAME_OBJECTTerminalRuleCall_2_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameEnumEntryValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_5_0, 
                              		"NAME_OBJECT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameEnumEntryValue"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4138:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4139:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4140:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9182);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9192); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4147:1: ruleNumberLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4150:28: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4151:1: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4151:1: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_DOUBLE) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4152:2: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLiteralAccess().getIntLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleNumberLiteral9242);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4165:2: this_RealLiteral_1= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLiteralAccess().getRealLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleNumberLiteral9272);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4184:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4185:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4186:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9307);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4193:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4196:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4197:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4197:1: ( (lv_value_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4198:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4198:1: (lv_value_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4199:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4223:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4224:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4225:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9398);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4232:1: ruleRealLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4235:28: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4236:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4236:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4237:1: (lv_value_0_0= RULE_DOUBLE )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4237:1: (lv_value_0_0= RULE_DOUBLE )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4238:3: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRealLiteral9449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getRealLiteralAccess().getValueDOUBLETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRealLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"DOUBLE");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4262:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4263:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4264:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9490);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9501); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4271:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4274:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4275:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4275:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4276:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9548);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4286:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==71) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,71,FOLLOW_71_in_ruleQualifiedName9567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9589);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4311:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4312:2: (iv_ruleValidID= ruleValidID EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4313:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID9637);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID9648); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4320:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4323:28: (this_ID_0= RULE_ID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4324:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID9687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleIndirectReference"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4339:1: ruleIndirectReference returns [Enumerator current=null] : ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) ) ;
    public final Enumerator ruleIndirectReference() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4341:28: ( ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4342:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4342:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt64=1;
                }
                break;
            case 73:
                {
                alt64=2;
                }
                break;
            case 74:
                {
                alt64=3;
                }
                break;
            case 75:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4342:2: (enumLiteral_0= 'UNDEFINED' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4342:2: (enumLiteral_0= 'UNDEFINED' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4342:4: enumLiteral_0= 'UNDEFINED'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleIndirectReference9745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIndirectReferenceAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4348:6: (enumLiteral_1= 'indirect-shall' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4348:6: (enumLiteral_1= 'indirect-shall' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4348:8: enumLiteral_1= 'indirect-shall'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleIndirectReference9762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4354:6: (enumLiteral_2= 'indirect-shall-not' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4354:6: (enumLiteral_2= 'indirect-shall-not' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4354:8: enumLiteral_2= 'indirect-shall-not'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleIndirectReference9779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALL_NOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALL_NOTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4360:6: (enumLiteral_3= 'indirect-should' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4360:6: (enumLiteral_3= 'indirect-should' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4360:8: enumLiteral_3= 'indirect-should'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleIndirectReference9796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHOULDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHOULDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndirectReference"


    // $ANTLR start "ruleSinceVersion"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4370:1: ruleSinceVersion returns [Enumerator current=null] : ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) ) ;
    public final Enumerator ruleSinceVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4372:28: ( ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4373:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4373:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) )
            int alt65=12;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt65=1;
                }
                break;
            case 76:
                {
                alt65=2;
                }
                break;
            case 77:
                {
                alt65=3;
                }
                break;
            case 78:
                {
                alt65=4;
                }
                break;
            case 79:
                {
                alt65=5;
                }
                break;
            case 80:
                {
                alt65=6;
                }
                break;
            case 81:
                {
                alt65=7;
                }
                break;
            case 82:
                {
                alt65=8;
                }
                break;
            case 83:
                {
                alt65=9;
                }
                break;
            case 84:
                {
                alt65=10;
                }
                break;
            case 85:
                {
                alt65=11;
                }
                break;
            case 86:
                {
                alt65=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4373:2: (enumLiteral_0= 'UNDEFINED' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4373:2: (enumLiteral_0= 'UNDEFINED' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4373:4: enumLiteral_0= 'UNDEFINED'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleSinceVersion9841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSinceVersionAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4379:6: (enumLiteral_1= 'pdf-1.0' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4379:6: (enumLiteral_1= 'pdf-1.0' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4379:8: enumLiteral_1= 'pdf-1.0'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleSinceVersion9858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_10EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSinceVersionAccess().getPDF_10EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4385:6: (enumLiteral_2= 'pdf-1.1' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4385:6: (enumLiteral_2= 'pdf-1.1' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4385:8: enumLiteral_2= 'pdf-1.1'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleSinceVersion9875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_11EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSinceVersionAccess().getPDF_11EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4391:6: (enumLiteral_3= 'pdf-1.2' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4391:6: (enumLiteral_3= 'pdf-1.2' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4391:8: enumLiteral_3= 'pdf-1.2'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleSinceVersion9892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_12EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSinceVersionAccess().getPDF_12EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4397:6: (enumLiteral_4= 'pdf-1.3' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4397:6: (enumLiteral_4= 'pdf-1.3' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4397:8: enumLiteral_4= 'pdf-1.3'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_79_in_ruleSinceVersion9909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_13EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSinceVersionAccess().getPDF_13EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4403:6: (enumLiteral_5= 'pdf-1.4' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4403:6: (enumLiteral_5= 'pdf-1.4' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4403:8: enumLiteral_5= 'pdf-1.4'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_80_in_ruleSinceVersion9926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_14EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSinceVersionAccess().getPDF_14EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:6: (enumLiteral_6= 'pdf-1.5' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:6: (enumLiteral_6= 'pdf-1.5' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:8: enumLiteral_6= 'pdf-1.5'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_81_in_ruleSinceVersion9943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_15EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getSinceVersionAccess().getPDF_15EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4415:6: (enumLiteral_7= 'pdf-1.6' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4415:6: (enumLiteral_7= 'pdf-1.6' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4415:8: enumLiteral_7= 'pdf-1.6'
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_82_in_ruleSinceVersion9960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_16EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getSinceVersionAccess().getPDF_16EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4421:6: (enumLiteral_8= 'pdf-1.7' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4421:6: (enumLiteral_8= 'pdf-1.7' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4421:8: enumLiteral_8= 'pdf-1.7'
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_83_in_ruleSinceVersion9977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_17EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getSinceVersionAccess().getPDF_17EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4427:6: (enumLiteral_9= '32000-1' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4427:6: (enumLiteral_9= '32000-1' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4427:8: enumLiteral_9= '32000-1'
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_84_in_ruleSinceVersion9994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_32000_1EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getSinceVersionAccess().getPDF_32000_1EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4433:6: (enumLiteral_10= 'pdf-2.0' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4433:6: (enumLiteral_10= 'pdf-2.0' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4433:8: enumLiteral_10= 'pdf-2.0'
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_85_in_ruleSinceVersion10011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_20EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getSinceVersionAccess().getPDF_20EnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4439:6: (enumLiteral_11= '32000-2' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4439:6: (enumLiteral_11= '32000-2' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4439:8: enumLiteral_11= '32000-2'
                    {
                    enumLiteral_11=(Token)match(input,86,FOLLOW_86_in_ruleSinceVersion10028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_32000_2EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getSinceVersionAccess().getPDF_32000_2EnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinceVersion"


    // $ANTLR start "ruleBool"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4449:1: ruleBool returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4451:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==87) ) {
                alt66=1;
            }
            else if ( (LA66_0==88) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:2: (enumLiteral_0= 'true' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:2: (enumLiteral_0= 'true' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleBool10073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4458:6: (enumLiteral_1= 'false' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4458:6: (enumLiteral_1= 'false' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4458:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleBool10090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoolAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBoolAccess().getFALSEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePDFModel_in_entryRulePDFModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDFModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rulePDFModel136 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclaration_in_ruleAbstractDeclaration232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclaration_in_ruleAbstractDeclaration262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedDeclaration_in_ruleAbstractDeclaration292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclaration_in_ruleAbstractDeclaration322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecificationReference_in_entryRuleSpecificationReference357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecificationReference367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSpecificationReference404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSpecificationReference416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSpecificationReference428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSectionReference_in_ruleSpecificationReference449 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSpecificationReference462 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSpecificationReference474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecificationReference491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_entryRuleSectionReference534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReference544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSectionReference581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSectionReference598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedDeclaration_in_entryRuleArrayMappedDeclaration639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedDeclaration649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleArrayMappedDeclaration686 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleArrayMappedDeclaration707 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleArrayMappedDeclaration720 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleArrayMappedDeclaration741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayMappedDeclaration753 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArrayMappedDeclaration767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrayMappedEntry_in_ruleArrayMappedDeclaration788 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleArrayMappedDeclaration801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntry_in_entryRuleArrayMappedEntry839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedEntry849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayMappedEntry891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleArrayMappedEntry908 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleArrayMappedEntry929 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_24_in_ruleArrayMappedEntry947 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_25_in_ruleArrayMappedEntry979 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_26_in_ruleArrayMappedEntry1011 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleArrayMappedEntry1046 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleArrayMappedEntry1068 = new BitSet(new long[]{0x0000000038080000L});
    public static final BitSet FOLLOW_19_in_ruleArrayMappedEntry1081 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleArrayMappedEntry1102 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayMappedEntry1114 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayMappedEntry1134 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayMappedEntry1166 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArrayMappedEntry1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclaration_in_entryRuleDictionaryDeclaration1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryDeclaration1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDictionaryDeclaration1276 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_31_in_ruleDictionaryDeclaration1300 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleDictionaryDeclaration1335 = new BitSet(new long[]{0x0000000100280000L});
    public static final BitSet FOLLOW_32_in_ruleDictionaryDeclaration1348 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration1375 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_15_in_ruleDictionaryDeclaration1388 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration1415 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_19_in_ruleDictionaryDeclaration1432 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleDictionaryDeclaration1453 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDictionaryDeclaration1465 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDictionaryDeclaration1479 = new BitSet(new long[]{0x0000000200400040L});
    public static final BitSet FOLLOW_33_in_ruleDictionaryDeclaration1492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDictionaryDeclaration1504 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_ruleSubtypeConfig_in_ruleDictionaryDeclaration1525 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDictionaryDeclaration1538 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_ruleDictionaryEntry_in_ruleDictionaryDeclaration1561 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_22_in_ruleDictionaryDeclaration1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeConfig_in_entryRuleSubtypeConfig1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeConfig1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSubtypeConfig1657 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig1684 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_15_in_ruleSubtypeConfig1697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig1724 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_29_in_ruleSubtypeConfig1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryEntry_in_entryRuleDictionaryEntry1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryEntry1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleDictionaryEntry1826 = new BitSet(new long[]{0xF1F013D8470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_35_in_ruleDictionaryEntry1844 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDictionaryEntry1861 = new BitSet(new long[]{0xF1F013D0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_24_in_ruleDictionaryEntry1886 = new BitSet(new long[]{0xF1F013D0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_25_in_ruleDictionaryEntry1918 = new BitSet(new long[]{0xF1F013D0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_36_in_ruleDictionaryEntry1950 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleDictionaryEntry1985 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleDictionaryEntry2007 = new BitSet(new long[]{0x0000000038080000L});
    public static final BitSet FOLLOW_27_in_ruleDictionaryEntry2025 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_28_in_ruleDictionaryEntry2057 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleDictionaryEntry2084 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleDictionaryEntry2105 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDictionaryEntry2117 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDictionaryEntry2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePackageDeclaration2214 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration2235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePackageDeclaration2247 = new BitSet(new long[]{0x00000080C0442000L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rulePackageDeclaration2268 = new BitSet(new long[]{0x00000080C0442000L});
    public static final BitSet FOLLOW_22_in_rulePackageDeclaration2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclaration_in_entryRuleBitFlagsDeclaration2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsDeclaration2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecificationReference_in_ruleBitFlagsDeclaration2373 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBitFlagsDeclaration2385 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBitFlagsDeclaration2406 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleBitFlagsDeclaration2419 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclaration2440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBitFlagsDeclaration2452 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBitFlagsDeclaration2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclarationPart_in_ruleBitFlagsDeclaration2487 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleBitFlagsDeclaration2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclarationPart_in_entryRuleBitFlagsDeclarationPart2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsDeclarationPart2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBitFlagsDeclarationPart2588 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBitFlagsDeclarationPart2605 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBitFlagsDeclarationPart2626 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleBitFlagsDeclarationPart2639 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclarationPart2660 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBitFlagsDeclarationPart2672 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBitFlagsDeclarationPart2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclaration_in_entryRuleNameEnumDeclaration2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumDeclaration2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNameEnumDeclaration2769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleNameEnumDeclaration2790 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleNameEnumDeclaration2803 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclaration2824 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNameEnumDeclaration2836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNameEnumDeclaration2850 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration2871 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleNameEnumDeclaration2884 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration2905 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleNameEnumDeclaration2920 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNameEnumDeclaration2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_entryRuleNameEnumDeclarationPart2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumDeclarationPart2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumDeclarationPart3022 = new BitSet(new long[]{0x0000000800080002L});
    public static final BitSet FOLLOW_35_in_ruleNameEnumDeclarationPart3040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameEnumDeclarationPart3057 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleNameEnumDeclarationPart3077 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclarationPart3098 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNameEnumDeclarationPart3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_entryRuleAbstractEntryValue3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntryValue3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullObjectEntryValue_in_ruleAbstractEntryValue3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTreeEntryValue_in_ruleAbstractEntryValue3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTreeEntryValue_in_ruleAbstractEntryValue3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameObjectEntryValue_in_ruleAbstractEntryValue3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberObjectEntryValue_in_ruleAbstractEntryValue3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerObjectEntryValue_in_ruleAbstractEntryValue3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealObjectEntryValue_in_ruleAbstractEntryValue3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumEntryValue_in_ruleAbstractEntryValue3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceEntryValue_in_ruleAbstractEntryValue3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentReferenceEntryValue_in_ruleAbstractEntryValue3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclarationEntryValue_in_ruleAbstractEntryValue3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryObjectEntryValue_in_ruleAbstractEntryValue3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayEntryValue_in_ruleAbstractEntryValue3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingDictEntryValue_in_ruleAbstractEntryValue3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanEntryValue_in_ruleAbstractEntryValue3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateEntryValue_in_ruleAbstractEntryValue3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeEntryValue_in_ruleAbstractEntryValue3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectEntryValue_in_ruleAbstractEntryValue3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringEntryValue_in_ruleAbstractEntryValue3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntryValue_in_ruleAbstractEntryValue3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsEntryValue_in_ruleAbstractEntryValue3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullObjectEntryValue_in_entryRuleNullObjectEntryValue3843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullObjectEntryValue3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNullObjectEntryValue3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameObjectEntryValue_in_entryRuleNameObjectEntryValue3938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameObjectEntryValue3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNameObjectEntryValue3997 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleNameObjectEntryValue4017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNameObjectEntryValue4078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberObjectEntryValue_in_entryRuleNumberObjectEntryValue4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberObjectEntryValue4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumberObjectEntryValue4211 = new BitSet(new long[]{0x00002C0000000002L});
    public static final BitSet FOLLOW_45_in_ruleNumberObjectEntryValue4224 = new BitSet(new long[]{0x000E800000000000L});
    public static final BitSet FOLLOW_ruleNumberValidationRule_in_ruleNumberObjectEntryValue4245 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNumberObjectEntryValue4257 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumberObjectEntryValue4279 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumberObjectEntryValue4339 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValidationRule_in_entryRuleNumberValidationRule4412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValidationRule4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberInclusiveRangeValidationRule_in_ruleNumberValidationRule4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterValidationRule_in_ruleNumberValidationRule4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterEqualsValidationRule_in_ruleNumberValidationRule4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRule_in_ruleNumberValidationRule4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberInclusiveRangeValidationRule_in_entryRuleNumberInclusiveRangeValidationRule4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberInclusiveRangeValidationRule4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumberInclusiveRangeValidationRule4644 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule4665 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNumberInclusiveRangeValidationRule4677 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterValidationRule_in_entryRuleNumberGreaterValidationRule4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberGreaterValidationRule4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberGreaterValidationRule4781 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterValidationRule4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterEqualsValidationRule_in_entryRuleNumberGreaterEqualsValidationRule4838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberGreaterEqualsValidationRule4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumberGreaterEqualsValidationRule4885 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterEqualsValidationRule4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRule_in_entryRuleNumberValuesValidationRule4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValuesValidationRule4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberValuesValidationRule4989 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule5010 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleNumberValuesValidationRule5023 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule5044 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_entryRuleNumberValuesValidationRuleEntry5082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValuesValidationRuleEntry5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberValuesValidationRuleEntry5138 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleNumberValuesValidationRuleEntry5151 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNumberValuesValidationRuleEntry5172 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNumberValuesValidationRuleEntry5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerObjectEntryValue_in_entryRuleIntegerObjectEntryValue5222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerObjectEntryValue5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIntegerObjectEntryValue5281 = new BitSet(new long[]{0x00002C0000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntegerObjectEntryValue5294 = new BitSet(new long[]{0x000E800000000000L});
    public static final BitSet FOLLOW_ruleIntegerValidationRule_in_ruleIntegerObjectEntryValue5315 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleIntegerObjectEntryValue5327 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntegerObjectEntryValue5349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIntegerObjectEntryValue5409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValidationRule_in_entryRuleIntegerValidationRule5482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValidationRule5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_ruleIntegerValidationRule5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRule_in_ruleIntegerValidationRule5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterValidationRule_in_ruleIntegerValidationRule5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_ruleIntegerValidationRule5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_entryRuleIntegerInclusiveRangeValidationRule5667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerInclusiveRangeValidationRule5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleIntegerInclusiveRangeValidationRule5714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule5735 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleIntegerInclusiveRangeValidationRule5747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRule_in_entryRuleIntegerValuesValidationRule5804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValuesValidationRule5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIntegerValuesValidationRule5851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule5872 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleIntegerValuesValidationRule5885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule5906 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterValidationRule_in_entryRuleIntegerGreaterValidationRule5944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerGreaterValidationRule5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIntegerGreaterValidationRule5991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerGreaterValidationRule6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_entryRuleIntegerGreaterEqualsValidationRule6048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerGreaterEqualsValidationRule6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIntegerGreaterEqualsValidationRule6095 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleIntegerGreaterEqualsValidationRule6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_entryRuleIntegerValuesValidationRuleEntry6152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValuesValidationRuleEntry6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerValuesValidationRuleEntry6208 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleIntegerValuesValidationRuleEntry6221 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF100L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleIntegerValuesValidationRuleEntry6242 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntegerValuesValidationRuleEntry6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealObjectEntryValue_in_entryRuleRealObjectEntryValue6292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealObjectEntryValue6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRealObjectEntryValue6351 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleRealObjectEntryValue6371 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRealObjectEntryValue6431 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTreeEntryValue_in_entryRuleNameTreeEntryValue6504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameTreeEntryValue6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNameTreeEntryValue6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTreeEntryValue_in_entryRuleNumberTreeEntryValue6599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTreeEntryValue6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNumberTreeEntryValue6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayEntryValue_in_entryRuleArrayEntryValue6694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayEntryValue6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleArrayEntryValue6741 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_45_in_ruleArrayEntryValue6754 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleArrayValidationRule_in_ruleArrayEntryValue6775 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleArrayEntryValue6787 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArrayEntryValue6801 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleArrayEntryValue6822 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleArrayEntryValue6844 = new BitSet(new long[]{0x0400000018000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayEntryValue6862 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayEntryValue6894 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleArrayEntryValue6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValidationRule_in_entryRuleArrayValidationRule6956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayValidationRule6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLengthValidationRule_in_ruleArrayValidationRule7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLengthValidationRule_in_entryRuleArrayLengthValidationRule7049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLengthValidationRule7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleArrayLengthValidationRule7096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayLengthValidationRule7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectEntryValue_in_entryRuleObjectEntryValue7154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectEntryValue7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleObjectEntryValue7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingDictEntryValue_in_entryRuleMappingDictEntryValue7249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingDictEntryValue7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMappingDictEntryValue7296 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleMappingDictEntryValue7308 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleMappingDictEntryValue7329 = new BitSet(new long[]{0x0400000018000000L});
    public static final BitSet FOLLOW_27_in_ruleMappingDictEntryValue7347 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMappingDictEntryValue7379 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleMappingDictEntryValue7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringEntryValue_in_entryRuleStringEntryValue7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringEntryValue7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleStringEntryValue7495 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_63_in_ruleStringEntryValue7532 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_64_in_ruleStringEntryValue7569 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleStringEntryValue7596 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleStringValidationRule_in_ruleStringEntryValue7617 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStringEntryValue7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValidationRule_in_entryRuleStringValidationRule7667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValidationRule7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLengthValidationRule_in_ruleStringValidationRule7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLengthValidationRule_in_entryRuleStringLengthValidationRule7760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLengthValidationRule7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleStringLengthValidationRule7807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleStringLengthValidationRule7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeEntryValue_in_entryRuleAlternativeEntryValue7864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeEntryValue7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAlternativeEntryValue7911 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue7932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAlternativeEntryValue7945 = new BitSet(new long[]{0xF1F013C0470C0000L,0x0000000000000F7DL});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue7966 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAlternativeEntryValue7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanEntryValue_in_entryRuleBooleanEntryValue8016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanEntryValue8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBooleanEntryValue8063 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleBooleanEntryValue8095 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBooleanEntryValue8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBooleanEntryValue8155 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBooleanEntryValue8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceEntryValue_in_entryRuleReferenceEntryValue8228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceEntryValue8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleReferenceEntryValue8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentReferenceEntryValue_in_entryRuleParentReferenceEntryValue8323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentReferenceEntryValue8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleParentReferenceEntryValue8370 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParentReferenceEntryValue8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryObjectEntryValue_in_entryRuleDictionaryObjectEntryValue8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryObjectEntryValue8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDictionaryObjectEntryValue8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclarationEntryValue_in_entryRuleDictionaryDeclarationEntryValue8528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryDeclarationEntryValue8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDictionaryDeclarationEntryValue8575 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclarationEntryValue8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntryValue_in_entryRuleArrayMappedEntryValue8638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedEntryValue8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleArrayMappedEntryValue8685 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArrayMappedEntryValue8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsEntryValue_in_entryRuleBitFlagsEntryValue8748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsEntryValue8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBitFlagsEntryValue8795 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBitFlagsEntryValue8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateEntryValue_in_entryRuleDateEntryValue8858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateEntryValue8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDateEntryValue8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumEntryValue_in_entryRuleNameEnumEntryValue8953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumEntryValue8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNameEnumEntryValue9000 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNameEnumEntryValue9027 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleNameEnumEntryValue9047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNameEnumEntryValue9108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleNumberLiteral9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleNumberLiteral9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRealLiteral9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleQualifiedName9567 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID9637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID9687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleIndirectReference9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleIndirectReference9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIndirectReference9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleIndirectReference9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSinceVersion9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSinceVersion9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleSinceVersion9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSinceVersion9892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleSinceVersion9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleSinceVersion9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSinceVersion9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSinceVersion9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSinceVersion9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSinceVersion9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleSinceVersion10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleSinceVersion10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBool10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBool10090 = new BitSet(new long[]{0x0000000000000002L});

}