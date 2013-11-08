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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_NAME_OBJECT", "RULE_ID", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'base-package'", "';'", "'}'", "'core-types'", "'object'", "'reference'", "'dictionary'", "'name'", "'string'", "'literal-string'", "'hex-string'", "'array'", "'boolean'", "'number'", "'real'", "'integer'", "'null'", "'stream'", "'util-types'", "'name-tree'", "'number-tree'", "'name-tree-parser'", "'number-tree-parser'", "'@spec-ref'", "'ISO32000-1:2008'", "','", "'table'", "'section'", "'array-mapped'", "'('", "')'", "'->'", "'cached'", "'required'", "'nullable'", "'custom-validation'", "'custom-default'", "'dict-obj'", "'stream-obj'", "'extends'", "'subtypes'", "'as'", "'inheritable'", "'package'", "'bit-flags'", "'name-enum'", "'must-be'", "'default'", "'num'", "'['", "']'", "'range-incl'", "'to'", "'greater'", "'greater-equals'", "'values'", "'int'", "'<'", "'>'", "'length'", "'mapping-dict'", "'text-string'", "'ascii-string'", "'byte-string'", "'|'", "'bool'", "'ref'", "'parent-ref'", "'dict'", "'date'", "'.'", "'UNDEFINED'", "'indirect-shall'", "'indirect-shall-not'", "'indirect-should'", "'pdf-1.0'", "'pdf-1.1'", "'pdf-1.2'", "'pdf-1.3'", "'pdf-1.4'", "'pdf-1.5'", "'pdf-1.6'", "'pdf-1.7'", "'32000-1'", "'pdf-2.0'", "'32000-2'", "'true'", "'false'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NAME_OBJECT=6;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:83:1: rulePDFModel returns [EObject current=null] : ( ( (lv_config_0_0= ruleModelConfig ) ) ( (lv_packages_1_0= rulePackageDeclaration ) )+ ) ;
    public final EObject rulePDFModel() throws RecognitionException {
        EObject current = null;

        EObject lv_config_0_0 = null;

        EObject lv_packages_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:86:28: ( ( ( (lv_config_0_0= ruleModelConfig ) ) ( (lv_packages_1_0= rulePackageDeclaration ) )+ ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:1: ( ( (lv_config_0_0= ruleModelConfig ) ) ( (lv_packages_1_0= rulePackageDeclaration ) )+ )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:1: ( ( (lv_config_0_0= ruleModelConfig ) ) ( (lv_packages_1_0= rulePackageDeclaration ) )+ )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:2: ( (lv_config_0_0= ruleModelConfig ) ) ( (lv_packages_1_0= rulePackageDeclaration ) )+
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:87:2: ( (lv_config_0_0= ruleModelConfig ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:88:1: (lv_config_0_0= ruleModelConfig )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:88:1: (lv_config_0_0= ruleModelConfig )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:89:3: lv_config_0_0= ruleModelConfig
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPDFModelAccess().getConfigModelConfigParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModelConfig_in_rulePDFModel137);
            lv_config_0_0=ruleModelConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPDFModelRule());
              	        }
                     		set(
                     			current, 
                     			"config",
                      		lv_config_0_0, 
                      		"ModelConfig");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:105:2: ( (lv_packages_1_0= rulePackageDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==58) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:106:1: (lv_packages_1_0= rulePackageDeclaration )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:106:1: (lv_packages_1_0= rulePackageDeclaration )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:107:3: lv_packages_1_0= rulePackageDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPDFModelAccess().getPackagesPackageDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDeclaration_in_rulePDFModel158);
            	    lv_packages_1_0=rulePackageDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPDFModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packages",
            	              		lv_packages_1_0, 
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


    // $ANTLR start "entryRuleModelConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:131:1: entryRuleModelConfig returns [EObject current=null] : iv_ruleModelConfig= ruleModelConfig EOF ;
    public final EObject entryRuleModelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelConfig = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:132:2: (iv_ruleModelConfig= ruleModelConfig EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:133:2: iv_ruleModelConfig= ruleModelConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelConfigRule()); 
            }
            pushFollow(FOLLOW_ruleModelConfig_in_entryRuleModelConfig195);
            iv_ruleModelConfig=ruleModelConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelConfig205); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelConfig"


    // $ANTLR start "ruleModelConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:140:1: ruleModelConfig returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'base-package' ( (lv_basePackage_3_0= ruleQualifiedName ) ) otherlv_4= ';' ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) ) otherlv_6= '}' ) ;
    public final EObject ruleModelConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_basePackage_3_0 = null;

        EObject lv_coreTypesConfig_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:143:28: ( (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'base-package' ( (lv_basePackage_3_0= ruleQualifiedName ) ) otherlv_4= ';' ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) ) otherlv_6= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:144:1: (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'base-package' ( (lv_basePackage_3_0= ruleQualifiedName ) ) otherlv_4= ';' ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) ) otherlv_6= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:144:1: (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'base-package' ( (lv_basePackage_3_0= ruleQualifiedName ) ) otherlv_4= ';' ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) ) otherlv_6= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:144:3: otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'base-package' ( (lv_basePackage_3_0= ruleQualifiedName ) ) otherlv_4= ';' ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModelConfig242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelConfigAccess().getConfigKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleModelConfig254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelConfigAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleModelConfig266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelConfigAccess().getBasePackageKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:156:1: ( (lv_basePackage_3_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:157:1: (lv_basePackage_3_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:157:1: (lv_basePackage_3_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:158:3: lv_basePackage_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelConfigAccess().getBasePackageQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModelConfig287);
            lv_basePackage_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelConfigRule());
              	        }
                     		set(
                     			current, 
                     			"basePackage",
                      		lv_basePackage_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleModelConfig299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getModelConfigAccess().getSemicolonKeyword_4());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:178:1: ( (lv_coreTypesConfig_5_0= ruleCoreTypesConfig ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:179:1: (lv_coreTypesConfig_5_0= ruleCoreTypesConfig )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:179:1: (lv_coreTypesConfig_5_0= ruleCoreTypesConfig )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:180:3: lv_coreTypesConfig_5_0= ruleCoreTypesConfig
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelConfigAccess().getCoreTypesConfigCoreTypesConfigParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoreTypesConfig_in_ruleModelConfig320);
            lv_coreTypesConfig_5_0=ruleCoreTypesConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelConfigRule());
              	        }
                     		set(
                     			current, 
                     			"coreTypesConfig",
                      		lv_coreTypesConfig_5_0, 
                      		"CoreTypesConfig");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleModelConfig332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelConfigAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleModelConfig"


    // $ANTLR start "entryRuleCoreTypesConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:208:1: entryRuleCoreTypesConfig returns [EObject current=null] : iv_ruleCoreTypesConfig= ruleCoreTypesConfig EOF ;
    public final EObject entryRuleCoreTypesConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreTypesConfig = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:209:2: (iv_ruleCoreTypesConfig= ruleCoreTypesConfig EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:210:2: iv_ruleCoreTypesConfig= ruleCoreTypesConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoreTypesConfigRule()); 
            }
            pushFollow(FOLLOW_ruleCoreTypesConfig_in_entryRuleCoreTypesConfig368);
            iv_ruleCoreTypesConfig=ruleCoreTypesConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoreTypesConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoreTypesConfig378); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoreTypesConfig"


    // $ANTLR start "ruleCoreTypesConfig"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:217:1: ruleCoreTypesConfig returns [EObject current=null] : (otherlv_0= 'core-types' otherlv_1= '{' otherlv_2= 'object' ( (lv_objectTypeName_3_0= ruleQualifiedName ) ) otherlv_4= ';' otherlv_5= 'reference' ( (lv_referenceTypeName_6_0= ruleQualifiedName ) ) otherlv_7= ';' otherlv_8= 'dictionary' ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) ) otherlv_10= ';' otherlv_11= 'name' ( (lv_nameTypeName_12_0= ruleQualifiedName ) ) otherlv_13= ';' otherlv_14= 'string' ( (lv_stringTypeName_15_0= ruleQualifiedName ) ) otherlv_16= ';' otherlv_17= 'literal-string' ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) ) otherlv_19= ';' otherlv_20= 'hex-string' ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) ) otherlv_22= ';' otherlv_23= 'array' ( (lv_arrayTypeName_24_0= ruleQualifiedName ) ) otherlv_25= ';' otherlv_26= 'boolean' ( (lv_booleanTypeName_27_0= ruleQualifiedName ) ) otherlv_28= ';' otherlv_29= 'number' ( (lv_numberTypeName_30_0= ruleQualifiedName ) ) otherlv_31= ';' otherlv_32= 'real' ( (lv_realTypeName_33_0= ruleQualifiedName ) ) otherlv_34= ';' otherlv_35= 'integer' ( (lv_integerTypeName_36_0= ruleQualifiedName ) ) otherlv_37= ';' otherlv_38= 'null' ( (lv_nullTypeName_39_0= ruleQualifiedName ) ) otherlv_40= ';' otherlv_41= 'stream' ( (lv_streamTypeName_42_0= ruleQualifiedName ) ) otherlv_43= ';' otherlv_44= '}' otherlv_45= 'util-types' otherlv_46= '{' otherlv_47= 'name-tree' ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) ) otherlv_49= ';' otherlv_50= 'number-tree' ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) ) otherlv_52= ';' otherlv_53= 'name-tree-parser' ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) ) otherlv_55= ';' otherlv_56= 'number-tree-parser' ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) ) otherlv_58= ';' otherlv_59= '}' ) ;
    public final EObject ruleCoreTypesConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        AntlrDatatypeRuleToken lv_objectTypeName_3_0 = null;

        AntlrDatatypeRuleToken lv_referenceTypeName_6_0 = null;

        AntlrDatatypeRuleToken lv_dictionaryTypeName_9_0 = null;

        AntlrDatatypeRuleToken lv_nameTypeName_12_0 = null;

        AntlrDatatypeRuleToken lv_stringTypeName_15_0 = null;

        AntlrDatatypeRuleToken lv_literalStringTypeName_18_0 = null;

        AntlrDatatypeRuleToken lv_hexStringTypeName_21_0 = null;

        AntlrDatatypeRuleToken lv_arrayTypeName_24_0 = null;

        AntlrDatatypeRuleToken lv_booleanTypeName_27_0 = null;

        AntlrDatatypeRuleToken lv_numberTypeName_30_0 = null;

        AntlrDatatypeRuleToken lv_realTypeName_33_0 = null;

        AntlrDatatypeRuleToken lv_integerTypeName_36_0 = null;

        AntlrDatatypeRuleToken lv_nullTypeName_39_0 = null;

        AntlrDatatypeRuleToken lv_streamTypeName_42_0 = null;

        AntlrDatatypeRuleToken lv_nameTreeTypeName_48_0 = null;

        AntlrDatatypeRuleToken lv_numberTreeTypeName_51_0 = null;

        AntlrDatatypeRuleToken lv_nameTreeParserTypeName_54_0 = null;

        AntlrDatatypeRuleToken lv_numberTreeParserTypeName_57_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:220:28: ( (otherlv_0= 'core-types' otherlv_1= '{' otherlv_2= 'object' ( (lv_objectTypeName_3_0= ruleQualifiedName ) ) otherlv_4= ';' otherlv_5= 'reference' ( (lv_referenceTypeName_6_0= ruleQualifiedName ) ) otherlv_7= ';' otherlv_8= 'dictionary' ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) ) otherlv_10= ';' otherlv_11= 'name' ( (lv_nameTypeName_12_0= ruleQualifiedName ) ) otherlv_13= ';' otherlv_14= 'string' ( (lv_stringTypeName_15_0= ruleQualifiedName ) ) otherlv_16= ';' otherlv_17= 'literal-string' ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) ) otherlv_19= ';' otherlv_20= 'hex-string' ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) ) otherlv_22= ';' otherlv_23= 'array' ( (lv_arrayTypeName_24_0= ruleQualifiedName ) ) otherlv_25= ';' otherlv_26= 'boolean' ( (lv_booleanTypeName_27_0= ruleQualifiedName ) ) otherlv_28= ';' otherlv_29= 'number' ( (lv_numberTypeName_30_0= ruleQualifiedName ) ) otherlv_31= ';' otherlv_32= 'real' ( (lv_realTypeName_33_0= ruleQualifiedName ) ) otherlv_34= ';' otherlv_35= 'integer' ( (lv_integerTypeName_36_0= ruleQualifiedName ) ) otherlv_37= ';' otherlv_38= 'null' ( (lv_nullTypeName_39_0= ruleQualifiedName ) ) otherlv_40= ';' otherlv_41= 'stream' ( (lv_streamTypeName_42_0= ruleQualifiedName ) ) otherlv_43= ';' otherlv_44= '}' otherlv_45= 'util-types' otherlv_46= '{' otherlv_47= 'name-tree' ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) ) otherlv_49= ';' otherlv_50= 'number-tree' ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) ) otherlv_52= ';' otherlv_53= 'name-tree-parser' ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) ) otherlv_55= ';' otherlv_56= 'number-tree-parser' ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) ) otherlv_58= ';' otherlv_59= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:221:1: (otherlv_0= 'core-types' otherlv_1= '{' otherlv_2= 'object' ( (lv_objectTypeName_3_0= ruleQualifiedName ) ) otherlv_4= ';' otherlv_5= 'reference' ( (lv_referenceTypeName_6_0= ruleQualifiedName ) ) otherlv_7= ';' otherlv_8= 'dictionary' ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) ) otherlv_10= ';' otherlv_11= 'name' ( (lv_nameTypeName_12_0= ruleQualifiedName ) ) otherlv_13= ';' otherlv_14= 'string' ( (lv_stringTypeName_15_0= ruleQualifiedName ) ) otherlv_16= ';' otherlv_17= 'literal-string' ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) ) otherlv_19= ';' otherlv_20= 'hex-string' ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) ) otherlv_22= ';' otherlv_23= 'array' ( (lv_arrayTypeName_24_0= ruleQualifiedName ) ) otherlv_25= ';' otherlv_26= 'boolean' ( (lv_booleanTypeName_27_0= ruleQualifiedName ) ) otherlv_28= ';' otherlv_29= 'number' ( (lv_numberTypeName_30_0= ruleQualifiedName ) ) otherlv_31= ';' otherlv_32= 'real' ( (lv_realTypeName_33_0= ruleQualifiedName ) ) otherlv_34= ';' otherlv_35= 'integer' ( (lv_integerTypeName_36_0= ruleQualifiedName ) ) otherlv_37= ';' otherlv_38= 'null' ( (lv_nullTypeName_39_0= ruleQualifiedName ) ) otherlv_40= ';' otherlv_41= 'stream' ( (lv_streamTypeName_42_0= ruleQualifiedName ) ) otherlv_43= ';' otherlv_44= '}' otherlv_45= 'util-types' otherlv_46= '{' otherlv_47= 'name-tree' ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) ) otherlv_49= ';' otherlv_50= 'number-tree' ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) ) otherlv_52= ';' otherlv_53= 'name-tree-parser' ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) ) otherlv_55= ';' otherlv_56= 'number-tree-parser' ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) ) otherlv_58= ';' otherlv_59= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:221:1: (otherlv_0= 'core-types' otherlv_1= '{' otherlv_2= 'object' ( (lv_objectTypeName_3_0= ruleQualifiedName ) ) otherlv_4= ';' otherlv_5= 'reference' ( (lv_referenceTypeName_6_0= ruleQualifiedName ) ) otherlv_7= ';' otherlv_8= 'dictionary' ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) ) otherlv_10= ';' otherlv_11= 'name' ( (lv_nameTypeName_12_0= ruleQualifiedName ) ) otherlv_13= ';' otherlv_14= 'string' ( (lv_stringTypeName_15_0= ruleQualifiedName ) ) otherlv_16= ';' otherlv_17= 'literal-string' ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) ) otherlv_19= ';' otherlv_20= 'hex-string' ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) ) otherlv_22= ';' otherlv_23= 'array' ( (lv_arrayTypeName_24_0= ruleQualifiedName ) ) otherlv_25= ';' otherlv_26= 'boolean' ( (lv_booleanTypeName_27_0= ruleQualifiedName ) ) otherlv_28= ';' otherlv_29= 'number' ( (lv_numberTypeName_30_0= ruleQualifiedName ) ) otherlv_31= ';' otherlv_32= 'real' ( (lv_realTypeName_33_0= ruleQualifiedName ) ) otherlv_34= ';' otherlv_35= 'integer' ( (lv_integerTypeName_36_0= ruleQualifiedName ) ) otherlv_37= ';' otherlv_38= 'null' ( (lv_nullTypeName_39_0= ruleQualifiedName ) ) otherlv_40= ';' otherlv_41= 'stream' ( (lv_streamTypeName_42_0= ruleQualifiedName ) ) otherlv_43= ';' otherlv_44= '}' otherlv_45= 'util-types' otherlv_46= '{' otherlv_47= 'name-tree' ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) ) otherlv_49= ';' otherlv_50= 'number-tree' ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) ) otherlv_52= ';' otherlv_53= 'name-tree-parser' ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) ) otherlv_55= ';' otherlv_56= 'number-tree-parser' ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) ) otherlv_58= ';' otherlv_59= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:221:3: otherlv_0= 'core-types' otherlv_1= '{' otherlv_2= 'object' ( (lv_objectTypeName_3_0= ruleQualifiedName ) ) otherlv_4= ';' otherlv_5= 'reference' ( (lv_referenceTypeName_6_0= ruleQualifiedName ) ) otherlv_7= ';' otherlv_8= 'dictionary' ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) ) otherlv_10= ';' otherlv_11= 'name' ( (lv_nameTypeName_12_0= ruleQualifiedName ) ) otherlv_13= ';' otherlv_14= 'string' ( (lv_stringTypeName_15_0= ruleQualifiedName ) ) otherlv_16= ';' otherlv_17= 'literal-string' ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) ) otherlv_19= ';' otherlv_20= 'hex-string' ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) ) otherlv_22= ';' otherlv_23= 'array' ( (lv_arrayTypeName_24_0= ruleQualifiedName ) ) otherlv_25= ';' otherlv_26= 'boolean' ( (lv_booleanTypeName_27_0= ruleQualifiedName ) ) otherlv_28= ';' otherlv_29= 'number' ( (lv_numberTypeName_30_0= ruleQualifiedName ) ) otherlv_31= ';' otherlv_32= 'real' ( (lv_realTypeName_33_0= ruleQualifiedName ) ) otherlv_34= ';' otherlv_35= 'integer' ( (lv_integerTypeName_36_0= ruleQualifiedName ) ) otherlv_37= ';' otherlv_38= 'null' ( (lv_nullTypeName_39_0= ruleQualifiedName ) ) otherlv_40= ';' otherlv_41= 'stream' ( (lv_streamTypeName_42_0= ruleQualifiedName ) ) otherlv_43= ';' otherlv_44= '}' otherlv_45= 'util-types' otherlv_46= '{' otherlv_47= 'name-tree' ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) ) otherlv_49= ';' otherlv_50= 'number-tree' ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) ) otherlv_52= ';' otherlv_53= 'name-tree-parser' ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) ) otherlv_55= ';' otherlv_56= 'number-tree-parser' ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) ) otherlv_58= ';' otherlv_59= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCoreTypesConfig415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCoreTypesConfigAccess().getCoreTypesKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCoreTypesConfig427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCoreTypesConfigAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCoreTypesConfig439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCoreTypesConfigAccess().getObjectKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:233:1: ( (lv_objectTypeName_3_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:234:1: (lv_objectTypeName_3_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:234:1: (lv_objectTypeName_3_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:235:3: lv_objectTypeName_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getObjectTypeNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig460);
            lv_objectTypeName_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"objectTypeName",
                      		lv_objectTypeName_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCoreTypesConfig484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCoreTypesConfigAccess().getReferenceKeyword_5());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:259:1: ( (lv_referenceTypeName_6_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:260:1: (lv_referenceTypeName_6_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:260:1: (lv_referenceTypeName_6_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:261:3: lv_referenceTypeName_6_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getReferenceTypeNameQualifiedNameParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig505);
            lv_referenceTypeName_6_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"referenceTypeName",
                      		lv_referenceTypeName_6_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleCoreTypesConfig529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCoreTypesConfigAccess().getDictionaryKeyword_8());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:285:1: ( (lv_dictionaryTypeName_9_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:286:1: (lv_dictionaryTypeName_9_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:286:1: (lv_dictionaryTypeName_9_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:287:3: lv_dictionaryTypeName_9_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getDictionaryTypeNameQualifiedNameParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig550);
            lv_dictionaryTypeName_9_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"dictionaryTypeName",
                      		lv_dictionaryTypeName_9_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleCoreTypesConfig574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCoreTypesConfigAccess().getNameKeyword_11());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:311:1: ( (lv_nameTypeName_12_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:312:1: (lv_nameTypeName_12_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:312:1: (lv_nameTypeName_12_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:313:3: lv_nameTypeName_12_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNameTypeNameQualifiedNameParserRuleCall_12_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig595);
            lv_nameTypeName_12_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"nameTypeName",
                      		lv_nameTypeName_12_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_13());
                  
            }
            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleCoreTypesConfig619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getCoreTypesConfigAccess().getStringKeyword_14());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:337:1: ( (lv_stringTypeName_15_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:338:1: (lv_stringTypeName_15_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:338:1: (lv_stringTypeName_15_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:339:3: lv_stringTypeName_15_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getStringTypeNameQualifiedNameParserRuleCall_15_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig640);
            lv_stringTypeName_15_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"stringTypeName",
                      		lv_stringTypeName_15_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_16());
                  
            }
            otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleCoreTypesConfig664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCoreTypesConfigAccess().getLiteralStringKeyword_17());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:363:1: ( (lv_literalStringTypeName_18_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:364:1: (lv_literalStringTypeName_18_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:364:1: (lv_literalStringTypeName_18_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:365:3: lv_literalStringTypeName_18_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getLiteralStringTypeNameQualifiedNameParserRuleCall_18_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig685);
            lv_literalStringTypeName_18_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"literalStringTypeName",
                      		lv_literalStringTypeName_18_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_19());
                  
            }
            otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleCoreTypesConfig709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getCoreTypesConfigAccess().getHexStringKeyword_20());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:389:1: ( (lv_hexStringTypeName_21_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:390:1: (lv_hexStringTypeName_21_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:390:1: (lv_hexStringTypeName_21_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:391:3: lv_hexStringTypeName_21_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getHexStringTypeNameQualifiedNameParserRuleCall_21_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig730);
            lv_hexStringTypeName_21_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"hexStringTypeName",
                      		lv_hexStringTypeName_21_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_22());
                  
            }
            otherlv_23=(Token)match(input,26,FOLLOW_26_in_ruleCoreTypesConfig754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getCoreTypesConfigAccess().getArrayKeyword_23());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:415:1: ( (lv_arrayTypeName_24_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:416:1: (lv_arrayTypeName_24_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:416:1: (lv_arrayTypeName_24_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:417:3: lv_arrayTypeName_24_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getArrayTypeNameQualifiedNameParserRuleCall_24_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig775);
            lv_arrayTypeName_24_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"arrayTypeName",
                      		lv_arrayTypeName_24_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_25, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_25());
                  
            }
            otherlv_26=(Token)match(input,27,FOLLOW_27_in_ruleCoreTypesConfig799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getCoreTypesConfigAccess().getBooleanKeyword_26());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:441:1: ( (lv_booleanTypeName_27_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:442:1: (lv_booleanTypeName_27_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:442:1: (lv_booleanTypeName_27_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:443:3: lv_booleanTypeName_27_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getBooleanTypeNameQualifiedNameParserRuleCall_27_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig820);
            lv_booleanTypeName_27_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"booleanTypeName",
                      		lv_booleanTypeName_27_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_28=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_28, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_28());
                  
            }
            otherlv_29=(Token)match(input,28,FOLLOW_28_in_ruleCoreTypesConfig844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_29, grammarAccess.getCoreTypesConfigAccess().getNumberKeyword_29());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:467:1: ( (lv_numberTypeName_30_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:468:1: (lv_numberTypeName_30_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:468:1: (lv_numberTypeName_30_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:469:3: lv_numberTypeName_30_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNumberTypeNameQualifiedNameParserRuleCall_30_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig865);
            lv_numberTypeName_30_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"numberTypeName",
                      		lv_numberTypeName_30_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_31, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_31());
                  
            }
            otherlv_32=(Token)match(input,29,FOLLOW_29_in_ruleCoreTypesConfig889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_32, grammarAccess.getCoreTypesConfigAccess().getRealKeyword_32());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:493:1: ( (lv_realTypeName_33_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:494:1: (lv_realTypeName_33_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:494:1: (lv_realTypeName_33_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:495:3: lv_realTypeName_33_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getRealTypeNameQualifiedNameParserRuleCall_33_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig910);
            lv_realTypeName_33_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"realTypeName",
                      		lv_realTypeName_33_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_34=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_34, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_34());
                  
            }
            otherlv_35=(Token)match(input,30,FOLLOW_30_in_ruleCoreTypesConfig934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_35, grammarAccess.getCoreTypesConfigAccess().getIntegerKeyword_35());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:519:1: ( (lv_integerTypeName_36_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:520:1: (lv_integerTypeName_36_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:520:1: (lv_integerTypeName_36_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:521:3: lv_integerTypeName_36_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getIntegerTypeNameQualifiedNameParserRuleCall_36_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig955);
            lv_integerTypeName_36_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"integerTypeName",
                      		lv_integerTypeName_36_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_37=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_37, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_37());
                  
            }
            otherlv_38=(Token)match(input,31,FOLLOW_31_in_ruleCoreTypesConfig979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_38, grammarAccess.getCoreTypesConfigAccess().getNullKeyword_38());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:545:1: ( (lv_nullTypeName_39_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:546:1: (lv_nullTypeName_39_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:546:1: (lv_nullTypeName_39_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:547:3: lv_nullTypeName_39_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNullTypeNameQualifiedNameParserRuleCall_39_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1000);
            lv_nullTypeName_39_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"nullTypeName",
                      		lv_nullTypeName_39_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_40=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_40, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_40());
                  
            }
            otherlv_41=(Token)match(input,32,FOLLOW_32_in_ruleCoreTypesConfig1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_41, grammarAccess.getCoreTypesConfigAccess().getStreamKeyword_41());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:571:1: ( (lv_streamTypeName_42_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:572:1: (lv_streamTypeName_42_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:572:1: (lv_streamTypeName_42_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:573:3: lv_streamTypeName_42_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getStreamTypeNameQualifiedNameParserRuleCall_42_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1045);
            lv_streamTypeName_42_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"streamTypeName",
                      		lv_streamTypeName_42_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_43=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_43, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_43());
                  
            }
            otherlv_44=(Token)match(input,17,FOLLOW_17_in_ruleCoreTypesConfig1069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_44, grammarAccess.getCoreTypesConfigAccess().getRightCurlyBracketKeyword_44());
                  
            }
            otherlv_45=(Token)match(input,33,FOLLOW_33_in_ruleCoreTypesConfig1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_45, grammarAccess.getCoreTypesConfigAccess().getUtilTypesKeyword_45());
                  
            }
            otherlv_46=(Token)match(input,14,FOLLOW_14_in_ruleCoreTypesConfig1093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_46, grammarAccess.getCoreTypesConfigAccess().getLeftCurlyBracketKeyword_46());
                  
            }
            otherlv_47=(Token)match(input,34,FOLLOW_34_in_ruleCoreTypesConfig1105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_47, grammarAccess.getCoreTypesConfigAccess().getNameTreeKeyword_47());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:609:1: ( (lv_nameTreeTypeName_48_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:610:1: (lv_nameTreeTypeName_48_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:610:1: (lv_nameTreeTypeName_48_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:611:3: lv_nameTreeTypeName_48_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNameTreeTypeNameQualifiedNameParserRuleCall_48_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1126);
            lv_nameTreeTypeName_48_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"nameTreeTypeName",
                      		lv_nameTreeTypeName_48_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_49=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_49, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_49());
                  
            }
            otherlv_50=(Token)match(input,35,FOLLOW_35_in_ruleCoreTypesConfig1150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_50, grammarAccess.getCoreTypesConfigAccess().getNumberTreeKeyword_50());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:635:1: ( (lv_numberTreeTypeName_51_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:636:1: (lv_numberTreeTypeName_51_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:636:1: (lv_numberTreeTypeName_51_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:637:3: lv_numberTreeTypeName_51_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNumberTreeTypeNameQualifiedNameParserRuleCall_51_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1171);
            lv_numberTreeTypeName_51_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"numberTreeTypeName",
                      		lv_numberTreeTypeName_51_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_52=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_52, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_52());
                  
            }
            otherlv_53=(Token)match(input,36,FOLLOW_36_in_ruleCoreTypesConfig1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_53, grammarAccess.getCoreTypesConfigAccess().getNameTreeParserKeyword_53());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:661:1: ( (lv_nameTreeParserTypeName_54_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:662:1: (lv_nameTreeParserTypeName_54_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:662:1: (lv_nameTreeParserTypeName_54_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:663:3: lv_nameTreeParserTypeName_54_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNameTreeParserTypeNameQualifiedNameParserRuleCall_54_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1216);
            lv_nameTreeParserTypeName_54_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"nameTreeParserTypeName",
                      		lv_nameTreeParserTypeName_54_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_55=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_55, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_55());
                  
            }
            otherlv_56=(Token)match(input,37,FOLLOW_37_in_ruleCoreTypesConfig1240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_56, grammarAccess.getCoreTypesConfigAccess().getNumberTreeParserKeyword_56());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:687:1: ( (lv_numberTreeParserTypeName_57_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:688:1: (lv_numberTreeParserTypeName_57_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:688:1: (lv_numberTreeParserTypeName_57_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:689:3: lv_numberTreeParserTypeName_57_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoreTypesConfigAccess().getNumberTreeParserTypeNameQualifiedNameParserRuleCall_57_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1261);
            lv_numberTreeParserTypeName_57_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoreTypesConfigRule());
              	        }
                     		set(
                     			current, 
                     			"numberTreeParserTypeName",
                      		lv_numberTreeParserTypeName_57_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_58=(Token)match(input,16,FOLLOW_16_in_ruleCoreTypesConfig1273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_58, grammarAccess.getCoreTypesConfigAccess().getSemicolonKeyword_58());
                  
            }
            otherlv_59=(Token)match(input,17,FOLLOW_17_in_ruleCoreTypesConfig1285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_59, grammarAccess.getCoreTypesConfigAccess().getRightCurlyBracketKeyword_59());
                  
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
    // $ANTLR end "ruleCoreTypesConfig"


    // $ANTLR start "entryRuleAbstractDeclaration"
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:721:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:722:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:723:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration1321);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration1331); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:730:1: ruleAbstractDeclaration returns [EObject current=null] : (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DictionaryDeclaration_0 = null;

        EObject this_NameEnumDeclaration_1 = null;

        EObject this_ArrayMappedDeclaration_2 = null;

        EObject this_BitFlagsDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:733:28: ( (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:734:1: (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:734:1: (this_DictionaryDeclaration_0= ruleDictionaryDeclaration | this_NameEnumDeclaration_1= ruleNameEnumDeclaration | this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration | this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
                {
                alt2=1;
                }
                break;
            case 60:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            case 38:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:735:2: this_DictionaryDeclaration_0= ruleDictionaryDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDictionaryDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryDeclaration_in_ruleAbstractDeclaration1381);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:748:2: this_NameEnumDeclaration_1= ruleNameEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getNameEnumDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameEnumDeclaration_in_ruleAbstractDeclaration1411);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:761:2: this_ArrayMappedDeclaration_2= ruleArrayMappedDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getArrayMappedDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayMappedDeclaration_in_ruleAbstractDeclaration1441);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:774:2: this_BitFlagsDeclaration_3= ruleBitFlagsDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getBitFlagsDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitFlagsDeclaration_in_ruleAbstractDeclaration1471);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:793:1: entryRuleSpecificationReference returns [EObject current=null] : iv_ruleSpecificationReference= ruleSpecificationReference EOF ;
    public final EObject entryRuleSpecificationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationReference = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:794:2: (iv_ruleSpecificationReference= ruleSpecificationReference EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:795:2: iv_ruleSpecificationReference= ruleSpecificationReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSpecificationReference_in_entryRuleSpecificationReference1506);
            iv_ruleSpecificationReference=ruleSpecificationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecificationReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecificationReference1516); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:802:1: ruleSpecificationReference returns [EObject current=null] : (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:805:28: ( (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:806:1: (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:806:1: (otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:806:3: otherlv_0= '@spec-ref' otherlv_1= 'ISO32000-1:2008' otherlv_2= ',' ( (lv_section_3_0= ruleSectionReference ) ) (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleSpecificationReference1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecificationReferenceAccess().getSpecRefKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSpecificationReference1565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSpecificationReferenceAccess().getISO3200012008Keyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSpecificationReference1577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSpecificationReferenceAccess().getCommaKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:818:1: ( (lv_section_3_0= ruleSectionReference ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:819:1: (lv_section_3_0= ruleSectionReference )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:819:1: (lv_section_3_0= ruleSectionReference )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:820:3: lv_section_3_0= ruleSectionReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecificationReferenceAccess().getSectionSectionReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSectionReference_in_ruleSpecificationReference1598);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:836:2: (otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:836:4: otherlv_4= ',' otherlv_5= 'table' ( (lv_table_6_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSpecificationReference1611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSpecificationReferenceAccess().getCommaKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleSpecificationReference1623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSpecificationReferenceAccess().getTableKeyword_4_1());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:844:1: ( (lv_table_6_0= RULE_INT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:845:1: (lv_table_6_0= RULE_INT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:845:1: (lv_table_6_0= RULE_INT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:846:3: lv_table_6_0= RULE_INT
                    {
                    lv_table_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecificationReference1640); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:870:1: entryRuleSectionReference returns [EObject current=null] : iv_ruleSectionReference= ruleSectionReference EOF ;
    public final EObject entryRuleSectionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReference = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:871:2: (iv_ruleSectionReference= ruleSectionReference EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:872:2: iv_ruleSectionReference= ruleSectionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSectionReference_in_entryRuleSectionReference1683);
            iv_ruleSectionReference=ruleSectionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReference1693); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:879:1: ruleSectionReference returns [EObject current=null] : (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSectionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_section_1_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:882:28: ( (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:883:1: (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:883:1: (otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:883:3: otherlv_0= 'section' ( (lv_section_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSectionReference1730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSectionReferenceAccess().getSectionKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:887:1: ( (lv_section_1_0= RULE_STRING ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:888:1: (lv_section_1_0= RULE_STRING )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:888:1: (lv_section_1_0= RULE_STRING )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:889:3: lv_section_1_0= RULE_STRING
            {
            lv_section_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSectionReference1747); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:913:1: entryRuleArrayMappedDeclaration returns [EObject current=null] : iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF ;
    public final EObject entryRuleArrayMappedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:914:2: (iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:915:2: iv_ruleArrayMappedDeclaration= ruleArrayMappedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedDeclaration_in_entryRuleArrayMappedDeclaration1788);
            iv_ruleArrayMappedDeclaration=ruleArrayMappedDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedDeclaration1798); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:922:1: ruleArrayMappedDeclaration returns [EObject current=null] : (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:925:28: ( (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:926:1: (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:926:1: (otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:926:3: otherlv_0= 'array-mapped' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entries_6_0= ruleArrayMappedEntry ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleArrayMappedDeclaration1835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayMappedDeclarationAccess().getArrayMappedKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:930:1: ( (lv_name_1_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:931:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:931:1: (lv_name_1_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:932:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleArrayMappedDeclaration1856);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:948:2: (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:948:4: otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleArrayMappedDeclaration1869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArrayMappedDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:952:1: ( (lv_since_3_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:953:1: (lv_since_3_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:953:1: (lv_since_3_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:954:3: lv_since_3_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleArrayMappedDeclaration1890);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleArrayMappedDeclaration1902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArrayMappedDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleArrayMappedDeclaration1916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayMappedDeclarationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:978:1: ( (lv_entries_6_0= ruleArrayMappedEntry ) )+
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
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:979:1: (lv_entries_6_0= ruleArrayMappedEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:979:1: (lv_entries_6_0= ruleArrayMappedEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:980:3: lv_entries_6_0= ruleArrayMappedEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayMappedDeclarationAccess().getEntriesArrayMappedEntryParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayMappedEntry_in_ruleArrayMappedDeclaration1937);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleArrayMappedDeclaration1950); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1010:1: entryRuleArrayMappedEntry returns [EObject current=null] : iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF ;
    public final EObject entryRuleArrayMappedEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1011:2: (iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1012:2: iv_ruleArrayMappedEntry= ruleArrayMappedEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedEntryRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedEntry_in_entryRuleArrayMappedEntry1988);
            iv_ruleArrayMappedEntry=ruleArrayMappedEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedEntry1998); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1019:1: ruleArrayMappedEntry returns [EObject current=null] : ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1022:28: ( ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1023:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1023:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1023:2: ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_nullable_5_0= 'nullable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )? ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )? otherlv_13= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1023:2: ( (lv_index_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1024:1: (lv_index_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1024:1: (lv_index_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1025:3: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayMappedEntry2040); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleArrayMappedEntry2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayMappedEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1045:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1046:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1046:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1047:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleArrayMappedEntry2078);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1063:2: ( (lv_cached_3_0= 'cached' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1064:1: (lv_cached_3_0= 'cached' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1064:1: (lv_cached_3_0= 'cached' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1065:3: lv_cached_3_0= 'cached'
                    {
                    lv_cached_3_0=(Token)match(input,47,FOLLOW_47_in_ruleArrayMappedEntry2096); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1078:3: ( (lv_required_4_0= 'required' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1079:1: (lv_required_4_0= 'required' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1079:1: (lv_required_4_0= 'required' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1080:3: lv_required_4_0= 'required'
                    {
                    lv_required_4_0=(Token)match(input,48,FOLLOW_48_in_ruleArrayMappedEntry2128); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1093:3: ( (lv_nullable_5_0= 'nullable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1094:1: (lv_nullable_5_0= 'nullable' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1094:1: (lv_nullable_5_0= 'nullable' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1095:3: lv_nullable_5_0= 'nullable'
                    {
                    lv_nullable_5_0=(Token)match(input,49,FOLLOW_49_in_ruleArrayMappedEntry2160); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1108:3: ( (lv_indirectReference_6_0= ruleIndirectReference ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=86 && LA9_0<=89)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1109:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1109:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1110:3: lv_indirectReference_6_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleArrayMappedEntry2195);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1126:3: ( (lv_value_7_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1127:1: (lv_value_7_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1127:1: (lv_value_7_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1128:3: lv_value_7_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getValueAbstractEntryValueParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleArrayMappedEntry2217);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1144:2: (otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1144:4: otherlv_8= '(' ( (lv_since_9_0= ruleSinceVersion ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleArrayMappedEntry2230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getArrayMappedEntryAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1148:1: ( (lv_since_9_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1149:1: (lv_since_9_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1149:1: (lv_since_9_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1150:3: lv_since_9_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayMappedEntryAccess().getSinceSinceVersionEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleArrayMappedEntry2251);
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

                    otherlv_10=(Token)match(input,45,FOLLOW_45_in_ruleArrayMappedEntry2263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getArrayMappedEntryAccess().getRightParenthesisKeyword_8_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1170:3: ( (lv_requiresCustomValidation_11_0= 'custom-validation' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1171:1: (lv_requiresCustomValidation_11_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1171:1: (lv_requiresCustomValidation_11_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1172:3: lv_requiresCustomValidation_11_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_11_0=(Token)match(input,50,FOLLOW_50_in_ruleArrayMappedEntry2283); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1185:3: ( (lv_requiresCustomDefault_12_0= 'custom-default' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1186:1: (lv_requiresCustomDefault_12_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1186:1: (lv_requiresCustomDefault_12_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1187:3: lv_requiresCustomDefault_12_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_12_0=(Token)match(input,51,FOLLOW_51_in_ruleArrayMappedEntry2315); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleArrayMappedEntry2341); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1212:1: entryRuleDictionaryDeclaration returns [EObject current=null] : iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF ;
    public final EObject entryRuleDictionaryDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1213:2: (iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1214:2: iv_ruleDictionaryDeclaration= ruleDictionaryDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryDeclaration_in_entryRuleDictionaryDeclaration2377);
            iv_ruleDictionaryDeclaration=ruleDictionaryDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryDeclaration2387); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1221:1: ruleDictionaryDeclaration returns [EObject current=null] : ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1224:28: ( ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1225:1: ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1225:1: ( (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1225:2: (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )? ( (lv_entries_15_0= ruleDictionaryEntry ) )* otherlv_16= '}'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1225:2: (otherlv_0= 'dict-obj' | ( (lv_stream_1_0= 'stream-obj' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            else if ( (LA13_0==53) ) {
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1225:4: otherlv_0= 'dict-obj'
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleDictionaryDeclaration2425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDictionaryDeclarationAccess().getDictObjKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1230:6: ( (lv_stream_1_0= 'stream-obj' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1230:6: ( (lv_stream_1_0= 'stream-obj' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1231:1: (lv_stream_1_0= 'stream-obj' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1231:1: (lv_stream_1_0= 'stream-obj' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1232:3: lv_stream_1_0= 'stream-obj'
                    {
                    lv_stream_1_0=(Token)match(input,53,FOLLOW_53_in_ruleDictionaryDeclaration2449); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1245:3: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1246:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1246:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1247:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleDictionaryDeclaration2484);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1263:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1263:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleDictionaryDeclaration2497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDictionaryDeclarationAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1267:1: ( ( ruleQualifiedName ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1268:1: ( ruleQualifiedName )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1268:1: ( ruleQualifiedName )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1269:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration2524);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1285:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==40) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1285:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleDictionaryDeclaration2537); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getDictionaryDeclarationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1289:1: ( ( ruleQualifiedName ) )
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1290:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1290:1: ( ruleQualifiedName )
                    	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1291:3: ruleQualifiedName
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
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration2564);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1307:6: (otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1307:8: otherlv_7= '(' ( (lv_since_8_0= ruleSinceVersion ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleDictionaryDeclaration2581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDictionaryDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1311:1: ( (lv_since_8_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1312:1: (lv_since_8_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1312:1: (lv_since_8_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1313:3: lv_since_8_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleDictionaryDeclaration2602);
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

                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleDictionaryDeclaration2614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDictionaryDeclarationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDictionaryDeclaration2628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDictionaryDeclarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1337:1: (otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1337:3: otherlv_11= 'config' otherlv_12= '{' ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )? otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleDictionaryDeclaration2641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDictionaryDeclarationAccess().getConfigKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleDictionaryDeclaration2653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDictionaryDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1345:1: ( (lv_subtypeConfig_13_0= ruleSubtypeConfig ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==55) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1346:1: (lv_subtypeConfig_13_0= ruleSubtypeConfig )
                            {
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1346:1: (lv_subtypeConfig_13_0= ruleSubtypeConfig )
                            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1347:3: lv_subtypeConfig_13_0= ruleSubtypeConfig
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getSubtypeConfigSubtypeConfigParserRuleCall_5_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSubtypeConfig_in_ruleDictionaryDeclaration2674);
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

                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleDictionaryDeclaration2687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDictionaryDeclarationAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1367:3: ( (lv_entries_15_0= ruleDictionaryEntry ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_NAME_OBJECT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1368:1: (lv_entries_15_0= ruleDictionaryEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1368:1: (lv_entries_15_0= ruleDictionaryEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1369:3: lv_entries_15_0= ruleDictionaryEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDictionaryDeclarationAccess().getEntriesDictionaryEntryParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictionaryEntry_in_ruleDictionaryDeclaration2710);
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

            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleDictionaryDeclaration2723); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1397:1: entryRuleSubtypeConfig returns [EObject current=null] : iv_ruleSubtypeConfig= ruleSubtypeConfig EOF ;
    public final EObject entryRuleSubtypeConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeConfig = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1398:2: (iv_ruleSubtypeConfig= ruleSubtypeConfig EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1399:2: iv_ruleSubtypeConfig= ruleSubtypeConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtypeConfigRule()); 
            }
            pushFollow(FOLLOW_ruleSubtypeConfig_in_entryRuleSubtypeConfig2759);
            iv_ruleSubtypeConfig=ruleSubtypeConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtypeConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeConfig2769); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1406:1: ruleSubtypeConfig returns [EObject current=null] : (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSubtypeConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1409:28: ( (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1410:1: (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1410:1: (otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1410:3: otherlv_0= 'subtypes' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleSubtypeConfig2806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubtypeConfigAccess().getSubtypesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1414:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1415:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1415:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1416:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig2833);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1432:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1432:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSubtypeConfig2846); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSubtypeConfigAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1436:1: ( ( ruleQualifiedName ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1437:1: ( ruleQualifiedName )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1437:1: ( ruleQualifiedName )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1438:3: ruleQualifiedName
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
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig2873);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSubtypeConfig2887); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1466:1: entryRuleDictionaryEntry returns [EObject current=null] : iv_ruleDictionaryEntry= ruleDictionaryEntry EOF ;
    public final EObject entryRuleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1467:2: (iv_ruleDictionaryEntry= ruleDictionaryEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1468:2: iv_ruleDictionaryEntry= ruleDictionaryEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryEntryRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryEntry_in_entryRuleDictionaryEntry2923);
            iv_ruleDictionaryEntry=ruleDictionaryEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryEntry2933); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1475:1: ruleDictionaryEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1478:28: ( ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1479:1: ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1479:1: ( ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1479:2: ( (lv_key_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ( (lv_cached_3_0= 'cached' ) )? ( (lv_required_4_0= 'required' ) )? ( (lv_inheritable_5_0= 'inheritable' ) )? ( (lv_indirectReference_6_0= ruleIndirectReference ) )? ( (lv_value_7_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )? (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )? otherlv_13= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1479:2: ( (lv_key_0_0= RULE_NAME_OBJECT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1480:1: (lv_key_0_0= RULE_NAME_OBJECT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1480:1: (lv_key_0_0= RULE_NAME_OBJECT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1481:3: lv_key_0_0= RULE_NAME_OBJECT
            {
            lv_key_0_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleDictionaryEntry2975); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1497:2: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1497:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleDictionaryEntry2993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDictionaryEntryAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1501:1: ( (lv_alias_2_0= RULE_ID ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1502:1: (lv_alias_2_0= RULE_ID )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1502:1: (lv_alias_2_0= RULE_ID )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1503:3: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDictionaryEntry3010); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1519:4: ( (lv_cached_3_0= 'cached' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1520:1: (lv_cached_3_0= 'cached' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1520:1: (lv_cached_3_0= 'cached' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1521:3: lv_cached_3_0= 'cached'
                    {
                    lv_cached_3_0=(Token)match(input,47,FOLLOW_47_in_ruleDictionaryEntry3035); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1534:3: ( (lv_required_4_0= 'required' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1535:1: (lv_required_4_0= 'required' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1535:1: (lv_required_4_0= 'required' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1536:3: lv_required_4_0= 'required'
                    {
                    lv_required_4_0=(Token)match(input,48,FOLLOW_48_in_ruleDictionaryEntry3067); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1549:3: ( (lv_inheritable_5_0= 'inheritable' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1550:1: (lv_inheritable_5_0= 'inheritable' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1550:1: (lv_inheritable_5_0= 'inheritable' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1551:3: lv_inheritable_5_0= 'inheritable'
                    {
                    lv_inheritable_5_0=(Token)match(input,57,FOLLOW_57_in_ruleDictionaryEntry3099); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1564:3: ( (lv_indirectReference_6_0= ruleIndirectReference ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=86 && LA25_0<=89)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1565:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1565:1: (lv_indirectReference_6_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1566:3: lv_indirectReference_6_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleDictionaryEntry3134);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1582:3: ( (lv_value_7_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1583:1: (lv_value_7_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1583:1: (lv_value_7_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1584:3: lv_value_7_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getValueAbstractEntryValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleDictionaryEntry3156);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1600:2: ( (lv_requiresCustomValidation_8_0= 'custom-validation' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1601:1: (lv_requiresCustomValidation_8_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1601:1: (lv_requiresCustomValidation_8_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1602:3: lv_requiresCustomValidation_8_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_8_0=(Token)match(input,50,FOLLOW_50_in_ruleDictionaryEntry3174); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1615:3: ( (lv_requiresCustomDefault_9_0= 'custom-default' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1616:1: (lv_requiresCustomDefault_9_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1616:1: (lv_requiresCustomDefault_9_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1617:3: lv_requiresCustomDefault_9_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_9_0=(Token)match(input,51,FOLLOW_51_in_ruleDictionaryEntry3206); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1630:3: (otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1630:5: otherlv_10= '(' ( (lv_since_11_0= ruleSinceVersion ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_44_in_ruleDictionaryEntry3233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDictionaryEntryAccess().getLeftParenthesisKeyword_9_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1634:1: ( (lv_since_11_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1635:1: (lv_since_11_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1635:1: (lv_since_11_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1636:3: lv_since_11_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getSinceSinceVersionEnumRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleDictionaryEntry3254);
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

                    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleDictionaryEntry3266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDictionaryEntryAccess().getRightParenthesisKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleDictionaryEntry3280); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1668:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1669:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1670:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3316);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration3326); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1677:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1680:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1681:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1681:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1681:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulePackageDeclaration3363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1685:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1686:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1686:1: (lv_name_1_0= ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1687:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration3384);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration3396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1707:1: ( (lv_elements_3_0= ruleAbstractDeclaration ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38||LA29_0==43||(LA29_0>=52 && LA29_0<=53)||LA29_0==60) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1708:1: (lv_elements_3_0= ruleAbstractDeclaration )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1708:1: (lv_elements_3_0= ruleAbstractDeclaration )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1709:3: lv_elements_3_0= ruleAbstractDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDeclaration_in_rulePackageDeclaration3417);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePackageDeclaration3430); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1737:1: entryRuleBitFlagsDeclaration returns [EObject current=null] : iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF ;
    public final EObject entryRuleBitFlagsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1738:2: (iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1739:2: iv_ruleBitFlagsDeclaration= ruleBitFlagsDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsDeclaration_in_entryRuleBitFlagsDeclaration3466);
            iv_ruleBitFlagsDeclaration=ruleBitFlagsDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsDeclaration3476); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1746:1: ruleBitFlagsDeclaration returns [EObject current=null] : ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1749:28: ( ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1750:1: ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1750:1: ( ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1750:2: ( (lv_specificationReference_0_0= ruleSpecificationReference ) ) otherlv_1= 'bit-flags' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+ otherlv_8= '}'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1750:2: ( (lv_specificationReference_0_0= ruleSpecificationReference ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1751:1: (lv_specificationReference_0_0= ruleSpecificationReference )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1751:1: (lv_specificationReference_0_0= ruleSpecificationReference )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1752:3: lv_specificationReference_0_0= ruleSpecificationReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getSpecificationReferenceSpecificationReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSpecificationReference_in_ruleBitFlagsDeclaration3522);
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

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleBitFlagsDeclaration3534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBitFlagsDeclarationAccess().getBitFlagsKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1772:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1773:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1773:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1774:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBitFlagsDeclaration3555);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1790:2: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1790:4: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleBitFlagsDeclaration3568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBitFlagsDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1794:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1795:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1795:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1796:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclaration3589);
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

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleBitFlagsDeclaration3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBitFlagsDeclarationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleBitFlagsDeclaration3615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBitFlagsDeclarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1820:1: ( (lv_declarations_7_0= ruleBitFlagsDeclarationPart ) )+
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
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1821:1: (lv_declarations_7_0= ruleBitFlagsDeclarationPart )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1821:1: (lv_declarations_7_0= ruleBitFlagsDeclarationPart )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1822:3: lv_declarations_7_0= ruleBitFlagsDeclarationPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationAccess().getDeclarationsBitFlagsDeclarationPartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitFlagsDeclarationPart_in_ruleBitFlagsDeclaration3636);
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleBitFlagsDeclaration3649); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1850:1: entryRuleBitFlagsDeclarationPart returns [EObject current=null] : iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF ;
    public final EObject entryRuleBitFlagsDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsDeclarationPart = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1851:2: (iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1852:2: iv_ruleBitFlagsDeclarationPart= ruleBitFlagsDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsDeclarationPart_in_entryRuleBitFlagsDeclarationPart3685);
            iv_ruleBitFlagsDeclarationPart=ruleBitFlagsDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsDeclarationPart3695); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1859:1: ruleBitFlagsDeclarationPart returns [EObject current=null] : ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1862:28: ( ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1863:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1863:1: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1863:2: ( (lv_index_0_0= RULE_INT ) ) otherlv_1= '->' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? otherlv_6= ';'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1863:2: ( (lv_index_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1864:1: (lv_index_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1864:1: (lv_index_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1865:3: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBitFlagsDeclarationPart3737); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleBitFlagsDeclarationPart3754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBitFlagsDeclarationPartAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1885:1: ( (lv_name_2_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1886:1: (lv_name_2_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1886:1: (lv_name_2_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1887:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBitFlagsDeclarationPartAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBitFlagsDeclarationPart3775);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1903:2: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1903:4: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleBitFlagsDeclarationPart3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBitFlagsDeclarationPartAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1907:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1908:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1908:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1909:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitFlagsDeclarationPartAccess().getSinceSinceVersionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclarationPart3809);
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

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleBitFlagsDeclarationPart3821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBitFlagsDeclarationPartAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleBitFlagsDeclarationPart3835); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1941:1: entryRuleNameEnumDeclaration returns [EObject current=null] : iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF ;
    public final EObject entryRuleNameEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumDeclaration = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1942:2: (iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1943:2: iv_ruleNameEnumDeclaration= ruleNameEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumDeclaration_in_entryRuleNameEnumDeclaration3871);
            iv_ruleNameEnumDeclaration=ruleNameEnumDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumDeclaration3881); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1950:1: ruleNameEnumDeclaration returns [EObject current=null] : (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1953:28: ( (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1954:1: (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1954:1: (otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1954:3: otherlv_0= 'name-enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) ) (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )* (otherlv_9= ',' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleNameEnumDeclaration3918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNameEnumDeclarationAccess().getNameEnumKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1958:1: ( (lv_name_1_0= ruleValidID ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1959:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1959:1: (lv_name_1_0= ruleValidID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1960:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleNameEnumDeclaration3939);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1976:2: (otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1976:4: otherlv_2= '(' ( (lv_since_3_0= ruleSinceVersion ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleNameEnumDeclaration3952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNameEnumDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1980:1: ( (lv_since_3_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1981:1: (lv_since_3_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1981:1: (lv_since_3_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:1982:3: lv_since_3_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclaration3973);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleNameEnumDeclaration3985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNameEnumDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNameEnumDeclaration3999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNameEnumDeclarationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2006:1: ( (lv_declarations_6_0= ruleNameEnumDeclarationPart ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2007:1: (lv_declarations_6_0= ruleNameEnumDeclarationPart )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2007:1: (lv_declarations_6_0= ruleNameEnumDeclarationPart )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2008:3: lv_declarations_6_0= ruleNameEnumDeclarationPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getDeclarationsNameEnumDeclarationPartParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration4020);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2024:2: (otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==40) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_NAME_OBJECT) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2024:4: otherlv_7= ',' ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) )
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleNameEnumDeclaration4033); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getNameEnumDeclarationAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2028:1: ( (lv_declarations_8_0= ruleNameEnumDeclarationPart ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2029:1: (lv_declarations_8_0= ruleNameEnumDeclarationPart )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2029:1: (lv_declarations_8_0= ruleNameEnumDeclarationPart )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2030:3: lv_declarations_8_0= ruleNameEnumDeclarationPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameEnumDeclarationAccess().getDeclarationsNameEnumDeclarationPartParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration4054);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2046:4: (otherlv_9= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2046:6: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleNameEnumDeclaration4069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNameEnumDeclarationAccess().getCommaKeyword_6());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleNameEnumDeclaration4083); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2062:1: entryRuleNameEnumDeclarationPart returns [EObject current=null] : iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF ;
    public final EObject entryRuleNameEnumDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumDeclarationPart = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2063:2: (iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2064:2: iv_ruleNameEnumDeclarationPart= ruleNameEnumDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumDeclarationPart_in_entryRuleNameEnumDeclarationPart4119);
            iv_ruleNameEnumDeclarationPart=ruleNameEnumDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumDeclarationPart4129); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2071:1: ruleNameEnumDeclarationPart returns [EObject current=null] : ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2074:28: ( ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2075:1: ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2075:1: ( ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2075:2: ( (lv_constant_0_0= RULE_NAME_OBJECT ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2075:2: ( (lv_constant_0_0= RULE_NAME_OBJECT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2076:1: (lv_constant_0_0= RULE_NAME_OBJECT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2076:1: (lv_constant_0_0= RULE_NAME_OBJECT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2077:3: lv_constant_0_0= RULE_NAME_OBJECT
            {
            lv_constant_0_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumDeclarationPart4171); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2093:2: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2093:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNameEnumDeclarationPart4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNameEnumDeclarationPartAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2097:1: ( (lv_alias_2_0= RULE_ID ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2098:1: (lv_alias_2_0= RULE_ID )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2098:1: (lv_alias_2_0= RULE_ID )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2099:3: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameEnumDeclarationPart4206); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2115:4: (otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2115:6: otherlv_3= '(' ( (lv_since_4_0= ruleSinceVersion ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleNameEnumDeclarationPart4226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNameEnumDeclarationPartAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2119:1: ( (lv_since_4_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2120:1: (lv_since_4_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2120:1: (lv_since_4_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2121:3: lv_since_4_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameEnumDeclarationPartAccess().getSinceSinceVersionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclarationPart4247);
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

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleNameEnumDeclarationPart4259); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2149:1: entryRuleAbstractEntryValue returns [EObject current=null] : iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF ;
    public final EObject entryRuleAbstractEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2150:2: (iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2151:2: iv_ruleAbstractEntryValue= ruleAbstractEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_entryRuleAbstractEntryValue4297);
            iv_ruleAbstractEntryValue=ruleAbstractEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntryValue4307); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2158:1: ruleAbstractEntryValue returns [EObject current=null] : (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2161:28: ( (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2162:1: (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2162:1: (this_NullObjectEntryValue_0= ruleNullObjectEntryValue | this_NameTreeEntryValue_1= ruleNameTreeEntryValue | this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue | this_NameObjectEntryValue_3= ruleNameObjectEntryValue | this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue | this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue | this_RealObjectEntryValue_6= ruleRealObjectEntryValue | this_NameEnumEntryValue_7= ruleNameEnumEntryValue | this_ReferenceEntryValue_8= ruleReferenceEntryValue | this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue | this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue | this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue | this_ArrayEntryValue_12= ruleArrayEntryValue | this_MappingDictEntryValue_13= ruleMappingDictEntryValue | this_BooleanEntryValue_14= ruleBooleanEntryValue | this_DateEntryValue_15= ruleDateEntryValue | this_AlternativeEntryValue_16= ruleAlternativeEntryValue | this_ObjectEntryValue_17= ruleObjectEntryValue | this_StringEntryValue_18= ruleStringEntryValue | this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue | this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue )
            int alt38=21;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt38=1;
                }
                break;
            case 34:
                {
                alt38=2;
                }
                break;
            case 35:
                {
                alt38=3;
                }
                break;
            case 22:
                {
                alt38=4;
                }
                break;
            case 63:
                {
                alt38=5;
                }
                break;
            case 71:
                {
                alt38=6;
                }
                break;
            case 29:
                {
                alt38=7;
                }
                break;
            case 60:
                {
                alt38=8;
                }
                break;
            case 81:
                {
                alt38=9;
                }
                break;
            case 82:
                {
                alt38=10;
                }
                break;
            case 52:
                {
                alt38=11;
                }
                break;
            case 83:
                {
                alt38=12;
                }
                break;
            case 26:
                {
                alt38=13;
                }
                break;
            case 75:
                {
                alt38=14;
                }
                break;
            case 80:
                {
                alt38=15;
                }
                break;
            case 84:
                {
                alt38=16;
                }
                break;
            case 44:
                {
                alt38=17;
                }
                break;
            case 19:
                {
                alt38=18;
                }
                break;
            case 76:
            case 77:
            case 78:
                {
                alt38=19;
                }
                break;
            case 43:
                {
                alt38=20;
                }
                break;
            case 59:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2163:2: this_NullObjectEntryValue_0= ruleNullObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNullObjectEntryValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullObjectEntryValue_in_ruleAbstractEntryValue4357);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2176:2: this_NameTreeEntryValue_1= ruleNameTreeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameTreeEntryValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameTreeEntryValue_in_ruleAbstractEntryValue4387);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2189:2: this_NumberTreeEntryValue_2= ruleNumberTreeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNumberTreeEntryValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTreeEntryValue_in_ruleAbstractEntryValue4417);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2202:2: this_NameObjectEntryValue_3= ruleNameObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameObjectEntryValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameObjectEntryValue_in_ruleAbstractEntryValue4447);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2215:2: this_NumberObjectEntryValue_4= ruleNumberObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNumberObjectEntryValueParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberObjectEntryValue_in_ruleAbstractEntryValue4477);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2228:2: this_IntegerObjectEntryValue_5= ruleIntegerObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getIntegerObjectEntryValueParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerObjectEntryValue_in_ruleAbstractEntryValue4507);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2241:2: this_RealObjectEntryValue_6= ruleRealObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getRealObjectEntryValueParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealObjectEntryValue_in_ruleAbstractEntryValue4537);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2254:2: this_NameEnumEntryValue_7= ruleNameEnumEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getNameEnumEntryValueParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameEnumEntryValue_in_ruleAbstractEntryValue4567);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2267:2: this_ReferenceEntryValue_8= ruleReferenceEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getReferenceEntryValueParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceEntryValue_in_ruleAbstractEntryValue4597);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2280:2: this_ParentReferenceEntryValue_9= ruleParentReferenceEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getParentReferenceEntryValueParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParentReferenceEntryValue_in_ruleAbstractEntryValue4627);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2293:2: this_DictionaryDeclarationEntryValue_10= ruleDictionaryDeclarationEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDictionaryDeclarationEntryValueParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryDeclarationEntryValue_in_ruleAbstractEntryValue4657);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2306:2: this_DictionaryObjectEntryValue_11= ruleDictionaryObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDictionaryObjectEntryValueParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionaryObjectEntryValue_in_ruleAbstractEntryValue4687);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2319:2: this_ArrayEntryValue_12= ruleArrayEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getArrayEntryValueParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayEntryValue_in_ruleAbstractEntryValue4717);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2332:2: this_MappingDictEntryValue_13= ruleMappingDictEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getMappingDictEntryValueParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingDictEntryValue_in_ruleAbstractEntryValue4747);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2345:2: this_BooleanEntryValue_14= ruleBooleanEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getBooleanEntryValueParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanEntryValue_in_ruleAbstractEntryValue4777);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2358:2: this_DateEntryValue_15= ruleDateEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getDateEntryValueParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateEntryValue_in_ruleAbstractEntryValue4807);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2371:2: this_AlternativeEntryValue_16= ruleAlternativeEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getAlternativeEntryValueParserRuleCall_16()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlternativeEntryValue_in_ruleAbstractEntryValue4837);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2384:2: this_ObjectEntryValue_17= ruleObjectEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getObjectEntryValueParserRuleCall_17()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectEntryValue_in_ruleAbstractEntryValue4867);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2397:2: this_StringEntryValue_18= ruleStringEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getStringEntryValueParserRuleCall_18()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringEntryValue_in_ruleAbstractEntryValue4897);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2410:2: this_ArrayMappedEntryValue_19= ruleArrayMappedEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getArrayMappedEntryValueParserRuleCall_19()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayMappedEntryValue_in_ruleAbstractEntryValue4927);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2423:2: this_BitFlagsEntryValue_20= ruleBitFlagsEntryValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEntryValueAccess().getBitFlagsEntryValueParserRuleCall_20()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitFlagsEntryValue_in_ruleAbstractEntryValue4957);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2442:1: entryRuleNullObjectEntryValue returns [EObject current=null] : iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF ;
    public final EObject entryRuleNullObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2443:2: (iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2444:2: iv_ruleNullObjectEntryValue= ruleNullObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNullObjectEntryValue_in_entryRuleNullObjectEntryValue4992);
            iv_ruleNullObjectEntryValue=ruleNullObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullObjectEntryValue5002); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2451:1: ruleNullObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2454:28: ( ( () otherlv_1= 'null' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2455:1: ( () otherlv_1= 'null' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2455:1: ( () otherlv_1= 'null' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2455:2: () otherlv_1= 'null'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2455:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2456:2: 
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNullObjectEntryValue5051); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2476:1: entryRuleNameObjectEntryValue returns [EObject current=null] : iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF ;
    public final EObject entryRuleNameObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2477:2: (iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2478:2: iv_ruleNameObjectEntryValue= ruleNameObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameObjectEntryValue_in_entryRuleNameObjectEntryValue5087);
            iv_ruleNameObjectEntryValue=ruleNameObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameObjectEntryValue5097); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2485:1: ruleNameObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) ;
    public final EObject ruleNameObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_requiredValue_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValue_5_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2488:28: ( ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2489:1: ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2489:1: ( () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2489:2: () otherlv_1= 'name' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2489:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2490:2: 
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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleNameObjectEntryValue5146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNameObjectEntryValueAccess().getNameKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:1: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61) ) {
                alt39=1;
            }
            else if ( (LA39_0==62) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:3: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2502:3: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2503:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2503:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2504:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,61,FOLLOW_61_in_ruleNameObjectEntryValue5166); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2517:2: ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2518:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2518:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2519:3: lv_requiredValue_3_0= RULE_NAME_OBJECT
                    {
                    lv_requiredValue_3_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue5196); if (state.failed) return current;
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2536:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2537:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2537:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2538:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,62,FOLLOW_62_in_ruleNameObjectEntryValue5227); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2551:2: ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2552:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2552:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2553:3: lv_defaultValue_5_0= RULE_NAME_OBJECT
                    {
                    lv_defaultValue_5_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue5257); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2577:1: entryRuleNumberObjectEntryValue returns [EObject current=null] : iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF ;
    public final EObject entryRuleNumberObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2578:2: (iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2579:2: iv_ruleNumberObjectEntryValue= ruleNumberObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberObjectEntryValue_in_entryRuleNumberObjectEntryValue5301);
            iv_ruleNumberObjectEntryValue=ruleNumberObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberObjectEntryValue5311); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2586:1: ruleNumberObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2589:28: ( ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2590:1: ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2590:1: ( () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2590:2: () otherlv_1= 'num' (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2590:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2591:2: 
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

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleNumberObjectEntryValue5360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumberObjectEntryValueAccess().getNumKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2603:1: (otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2603:3: otherlv_2= '[' ( (lv_rule_3_0= ruleNumberValidationRule ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleNumberObjectEntryValue5373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNumberObjectEntryValueAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2607:1: ( (lv_rule_3_0= ruleNumberValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2608:1: (lv_rule_3_0= ruleNumberValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2608:1: (lv_rule_3_0= ruleNumberValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2609:3: lv_rule_3_0= ruleNumberValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getRuleNumberValidationRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberValidationRule_in_ruleNumberObjectEntryValue5394);
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

                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleNumberObjectEntryValue5406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNumberObjectEntryValueAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:3: ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) ) )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            else if ( (LA41_0==62) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:5: ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleNumberLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2629:5: ( (lv_hasMustBe_5_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2630:1: (lv_hasMustBe_5_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2630:1: (lv_hasMustBe_5_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2631:3: lv_hasMustBe_5_0= 'must-be'
                    {
                    lv_hasMustBe_5_0=(Token)match(input,61,FOLLOW_61_in_ruleNumberObjectEntryValue5428); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2644:2: ( (lv_requiredValue_6_0= ruleNumberLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2645:1: (lv_requiredValue_6_0= ruleNumberLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2645:1: (lv_requiredValue_6_0= ruleNumberLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2646:3: lv_requiredValue_6_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getRequiredValueNumberLiteralParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue5462);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2663:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2663:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2663:7: ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleNumberLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2663:7: ( (lv_hasDefault_7_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2664:1: (lv_hasDefault_7_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2664:1: (lv_hasDefault_7_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2665:3: lv_hasDefault_7_0= 'default'
                    {
                    lv_hasDefault_7_0=(Token)match(input,62,FOLLOW_62_in_ruleNumberObjectEntryValue5488); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2678:2: ( (lv_defaultValue_8_0= ruleNumberLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2679:1: (lv_defaultValue_8_0= ruleNumberLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2679:1: (lv_defaultValue_8_0= ruleNumberLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2680:3: lv_defaultValue_8_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberObjectEntryValueAccess().getDefaultValueNumberLiteralParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue5522);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2704:1: entryRuleNumberValidationRule returns [EObject current=null] : iv_ruleNumberValidationRule= ruleNumberValidationRule EOF ;
    public final EObject entryRuleNumberValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2705:2: (iv_ruleNumberValidationRule= ruleNumberValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2706:2: iv_ruleNumberValidationRule= ruleNumberValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValidationRule_in_entryRuleNumberValidationRule5561);
            iv_ruleNumberValidationRule=ruleNumberValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValidationRule5571); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2713:1: ruleNumberValidationRule returns [EObject current=null] : (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule ) ;
    public final EObject ruleNumberValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_NumberInclusiveRangeValidationRule_0 = null;

        EObject this_NumberGreaterValidationRule_1 = null;

        EObject this_NumberGreaterEqualsValidationRule_2 = null;

        EObject this_NumberValuesValidationRule_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2716:28: ( (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2717:1: (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2717:1: (this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule | this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule | this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule | this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt42=1;
                }
                break;
            case 68:
                {
                alt42=2;
                }
                break;
            case 69:
                {
                alt42=3;
                }
                break;
            case 70:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2718:2: this_NumberInclusiveRangeValidationRule_0= ruleNumberInclusiveRangeValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberInclusiveRangeValidationRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberInclusiveRangeValidationRule_in_ruleNumberValidationRule5621);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2731:2: this_NumberGreaterValidationRule_1= ruleNumberGreaterValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberGreaterValidationRuleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberGreaterValidationRule_in_ruleNumberValidationRule5651);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2744:2: this_NumberGreaterEqualsValidationRule_2= ruleNumberGreaterEqualsValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberGreaterEqualsValidationRuleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberGreaterEqualsValidationRule_in_ruleNumberValidationRule5681);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2757:2: this_NumberValuesValidationRule_3= ruleNumberValuesValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValidationRuleAccess().getNumberValuesValidationRuleParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValuesValidationRule_in_ruleNumberValidationRule5711);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2776:1: entryRuleNumberInclusiveRangeValidationRule returns [EObject current=null] : iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF ;
    public final EObject entryRuleNumberInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberInclusiveRangeValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2777:2: (iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2778:2: iv_ruleNumberInclusiveRangeValidationRule= ruleNumberInclusiveRangeValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberInclusiveRangeValidationRule_in_entryRuleNumberInclusiveRangeValidationRule5746);
            iv_ruleNumberInclusiveRangeValidationRule=ruleNumberInclusiveRangeValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberInclusiveRangeValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberInclusiveRangeValidationRule5756); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2785:1: ruleNumberInclusiveRangeValidationRule returns [EObject current=null] : (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2788:28: ( (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2789:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2789:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2789:3: otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleNumberLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleNumberInclusiveRangeValidationRule5793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getRangeInclKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2793:1: ( (lv_lowerBound_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2794:1: (lv_lowerBound_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2794:1: (lv_lowerBound_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2795:3: lv_lowerBound_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getLowerBoundNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule5814);
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

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleNumberInclusiveRangeValidationRule5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getToKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2815:1: ( (lv_upperBound_3_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2816:1: (lv_upperBound_3_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2816:1: (lv_upperBound_3_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2817:3: lv_upperBound_3_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberInclusiveRangeValidationRuleAccess().getUpperBoundNumberLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule5847);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2841:1: entryRuleNumberGreaterValidationRule returns [EObject current=null] : iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF ;
    public final EObject entryRuleNumberGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberGreaterValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2842:2: (iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2843:2: iv_ruleNumberGreaterValidationRule= ruleNumberGreaterValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberGreaterValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberGreaterValidationRule_in_entryRuleNumberGreaterValidationRule5883);
            iv_ruleNumberGreaterValidationRule=ruleNumberGreaterValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberGreaterValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberGreaterValidationRule5893); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2850:1: ruleNumberGreaterValidationRule returns [EObject current=null] : (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2853:28: ( (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2854:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2854:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2854:3: otherlv_0= 'greater' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleNumberGreaterValidationRule5930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberGreaterValidationRuleAccess().getGreaterKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2858:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2859:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2859:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2860:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberGreaterValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterValidationRule5951);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2884:1: entryRuleNumberGreaterEqualsValidationRule returns [EObject current=null] : iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF ;
    public final EObject entryRuleNumberGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberGreaterEqualsValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2885:2: (iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2886:2: iv_ruleNumberGreaterEqualsValidationRule= ruleNumberGreaterEqualsValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberGreaterEqualsValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberGreaterEqualsValidationRule_in_entryRuleNumberGreaterEqualsValidationRule5987);
            iv_ruleNumberGreaterEqualsValidationRule=ruleNumberGreaterEqualsValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberGreaterEqualsValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberGreaterEqualsValidationRule5997); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2893:1: ruleNumberGreaterEqualsValidationRule returns [EObject current=null] : (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleNumberGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2896:28: ( (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2897:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2897:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2897:3: otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleNumberGreaterEqualsValidationRule6034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberGreaterEqualsValidationRuleAccess().getGreaterEqualsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2901:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2902:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2902:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2903:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberGreaterEqualsValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterEqualsValidationRule6055);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2927:1: entryRuleNumberValuesValidationRule returns [EObject current=null] : iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF ;
    public final EObject entryRuleNumberValuesValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValuesValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2928:2: (iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2929:2: iv_ruleNumberValuesValidationRule= ruleNumberValuesValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValuesValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRule_in_entryRuleNumberValuesValidationRule6091);
            iv_ruleNumberValuesValidationRule=ruleNumberValuesValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValuesValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValuesValidationRule6101); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2936:1: ruleNumberValuesValidationRule returns [EObject current=null] : (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* ) ;
    public final EObject ruleNumberValuesValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2939:28: ( (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2940:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2940:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2940:3: otherlv_0= 'values' ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )*
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleNumberValuesValidationRule6138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberValuesValidationRuleAccess().getValuesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2944:1: ( (lv_value_1_0= ruleNumberValuesValidationRuleEntry ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2945:1: (lv_value_1_0= ruleNumberValuesValidationRuleEntry )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2945:1: (lv_value_1_0= ruleNumberValuesValidationRuleEntry )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2946:3: lv_value_1_0= ruleNumberValuesValidationRuleEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleAccess().getValueNumberValuesValidationRuleEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule6159);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2962:2: (otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==40) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2962:4: otherlv_2= ',' ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleNumberValuesValidationRule6172); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNumberValuesValidationRuleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2966:1: ( (lv_value_3_0= ruleNumberValuesValidationRuleEntry ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2967:1: (lv_value_3_0= ruleNumberValuesValidationRuleEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2967:1: (lv_value_3_0= ruleNumberValuesValidationRuleEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2968:3: lv_value_3_0= ruleNumberValuesValidationRuleEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleAccess().getValueNumberValuesValidationRuleEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule6193);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2992:1: entryRuleNumberValuesValidationRuleEntry returns [EObject current=null] : iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF ;
    public final EObject entryRuleNumberValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValuesValidationRuleEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2993:2: (iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:2994:2: iv_ruleNumberValuesValidationRuleEntry= ruleNumberValuesValidationRuleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValuesValidationRuleEntry_in_entryRuleNumberValuesValidationRuleEntry6231);
            iv_ruleNumberValuesValidationRuleEntry=ruleNumberValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValuesValidationRuleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValuesValidationRuleEntry6241); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3001:1: ruleNumberValuesValidationRuleEntry returns [EObject current=null] : ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleNumberValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        Enumerator lv_since_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3004:28: ( ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:1: ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:1: ( ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:2: ( (lv_value_0_0= ruleNumberLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3005:2: ( (lv_value_0_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3006:1: (lv_value_0_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3006:1: (lv_value_0_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3007:3: lv_value_0_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryAccess().getValueNumberLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberValuesValidationRuleEntry6287);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3023:2: (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3023:4: otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleNumberValuesValidationRuleEntry6300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNumberValuesValidationRuleEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3027:1: ( (lv_since_2_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3028:1: (lv_since_2_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3028:1: (lv_since_2_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3029:3: lv_since_2_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberValuesValidationRuleEntryAccess().getSinceSinceVersionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleNumberValuesValidationRuleEntry6321);
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

                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleNumberValuesValidationRuleEntry6333); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3057:1: entryRuleIntegerObjectEntryValue returns [EObject current=null] : iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF ;
    public final EObject entryRuleIntegerObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3058:2: (iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3059:2: iv_ruleIntegerObjectEntryValue= ruleIntegerObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerObjectEntryValue_in_entryRuleIntegerObjectEntryValue6371);
            iv_ruleIntegerObjectEntryValue=ruleIntegerObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerObjectEntryValue6381); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3066:1: ruleIntegerObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3069:28: ( ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3070:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3070:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3070:2: () otherlv_1= 'int' (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )? ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3070:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3071:2: 
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

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleIntegerObjectEntryValue6430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerObjectEntryValueAccess().getIntKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3083:1: (otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3083:3: otherlv_2= '[' ( (lv_rule_3_0= ruleIntegerValidationRule ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleIntegerObjectEntryValue6443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntegerObjectEntryValueAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3087:1: ( (lv_rule_3_0= ruleIntegerValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3088:1: (lv_rule_3_0= ruleIntegerValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3088:1: (lv_rule_3_0= ruleIntegerValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3089:3: lv_rule_3_0= ruleIntegerValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getRuleIntegerValidationRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerValidationRule_in_ruleIntegerObjectEntryValue6464);
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

                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleIntegerObjectEntryValue6476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIntegerObjectEntryValueAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3109:3: ( ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) ) | ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            else if ( (LA46_0==62) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3109:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3109:4: ( ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3109:5: ( (lv_hasMustBe_5_0= 'must-be' ) ) ( (lv_requiredValue_6_0= ruleIntLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3109:5: ( (lv_hasMustBe_5_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3110:1: (lv_hasMustBe_5_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3110:1: (lv_hasMustBe_5_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3111:3: lv_hasMustBe_5_0= 'must-be'
                    {
                    lv_hasMustBe_5_0=(Token)match(input,61,FOLLOW_61_in_ruleIntegerObjectEntryValue6498); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3124:2: ( (lv_requiredValue_6_0= ruleIntLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3125:1: (lv_requiredValue_6_0= ruleIntLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3125:1: (lv_requiredValue_6_0= ruleIntLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3126:3: lv_requiredValue_6_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getRequiredValueIntLiteralParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue6532);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3143:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3143:6: ( ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3143:7: ( (lv_hasDefault_7_0= 'default' ) ) ( (lv_defaultValue_8_0= ruleIntLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3143:7: ( (lv_hasDefault_7_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3144:1: (lv_hasDefault_7_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3144:1: (lv_hasDefault_7_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3145:3: lv_hasDefault_7_0= 'default'
                    {
                    lv_hasDefault_7_0=(Token)match(input,62,FOLLOW_62_in_ruleIntegerObjectEntryValue6558); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3158:2: ( (lv_defaultValue_8_0= ruleIntLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3159:1: (lv_defaultValue_8_0= ruleIntLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3159:1: (lv_defaultValue_8_0= ruleIntLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3160:3: lv_defaultValue_8_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerObjectEntryValueAccess().getDefaultValueIntLiteralParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue6592);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3184:1: entryRuleIntegerValidationRule returns [EObject current=null] : iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF ;
    public final EObject entryRuleIntegerValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3185:2: (iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3186:2: iv_ruleIntegerValidationRule= ruleIntegerValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValidationRule_in_entryRuleIntegerValidationRule6631);
            iv_ruleIntegerValidationRule=ruleIntegerValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValidationRule6641); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3193:1: ruleIntegerValidationRule returns [EObject current=null] : (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule ) ;
    public final EObject ruleIntegerValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerInclusiveRangeValidationRule_0 = null;

        EObject this_IntegerValuesValidationRule_1 = null;

        EObject this_IntegerGreaterValidationRule_2 = null;

        EObject this_IntegerGreaterEqualsValidationRule_3 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3196:28: ( (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3197:1: (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3197:1: (this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule | this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule | this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule | this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt47=1;
                }
                break;
            case 70:
                {
                alt47=2;
                }
                break;
            case 68:
                {
                alt47=3;
                }
                break;
            case 69:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3198:2: this_IntegerInclusiveRangeValidationRule_0= ruleIntegerInclusiveRangeValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerInclusiveRangeValidationRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_ruleIntegerValidationRule6691);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3211:2: this_IntegerValuesValidationRule_1= ruleIntegerValuesValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerValuesValidationRuleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValuesValidationRule_in_ruleIntegerValidationRule6721);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3224:2: this_IntegerGreaterValidationRule_2= ruleIntegerGreaterValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerGreaterValidationRuleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerGreaterValidationRule_in_ruleIntegerValidationRule6751);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3237:2: this_IntegerGreaterEqualsValidationRule_3= ruleIntegerGreaterEqualsValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerValidationRuleAccess().getIntegerGreaterEqualsValidationRuleParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_ruleIntegerValidationRule6781);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3256:1: entryRuleIntegerInclusiveRangeValidationRule returns [EObject current=null] : iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF ;
    public final EObject entryRuleIntegerInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerInclusiveRangeValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3257:2: (iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3258:2: iv_ruleIntegerInclusiveRangeValidationRule= ruleIntegerInclusiveRangeValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_entryRuleIntegerInclusiveRangeValidationRule6816);
            iv_ruleIntegerInclusiveRangeValidationRule=ruleIntegerInclusiveRangeValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerInclusiveRangeValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerInclusiveRangeValidationRule6826); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3265:1: ruleIntegerInclusiveRangeValidationRule returns [EObject current=null] : (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleIntegerInclusiveRangeValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3268:28: ( (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:1: (otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3269:3: otherlv_0= 'range-incl' ( (lv_lowerBound_1_0= ruleIntLiteral ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleIntegerInclusiveRangeValidationRule6863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getRangeInclKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3273:1: ( (lv_lowerBound_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3274:1: (lv_lowerBound_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3274:1: (lv_lowerBound_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3275:3: lv_lowerBound_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getLowerBoundIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule6884);
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

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleIntegerInclusiveRangeValidationRule6896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getToKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3295:1: ( (lv_upperBound_3_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3296:1: (lv_upperBound_3_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3296:1: (lv_upperBound_3_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3297:3: lv_upperBound_3_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerInclusiveRangeValidationRuleAccess().getUpperBoundIntLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule6917);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3321:1: entryRuleIntegerValuesValidationRule returns [EObject current=null] : iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF ;
    public final EObject entryRuleIntegerValuesValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValuesValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3322:2: (iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3323:2: iv_ruleIntegerValuesValidationRule= ruleIntegerValuesValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValuesValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRule_in_entryRuleIntegerValuesValidationRule6953);
            iv_ruleIntegerValuesValidationRule=ruleIntegerValuesValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValuesValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValuesValidationRule6963); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3330:1: ruleIntegerValuesValidationRule returns [EObject current=null] : (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* ) ;
    public final EObject ruleIntegerValuesValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3333:28: ( (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3334:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3334:1: (otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3334:3: otherlv_0= 'values' ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )*
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleIntegerValuesValidationRule7000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerValuesValidationRuleAccess().getValuesKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3338:1: ( (lv_value_1_0= ruleIntegerValuesValidationRuleEntry ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3339:1: (lv_value_1_0= ruleIntegerValuesValidationRuleEntry )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3339:1: (lv_value_1_0= ruleIntegerValuesValidationRuleEntry )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3340:3: lv_value_1_0= ruleIntegerValuesValidationRuleEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleAccess().getValueIntegerValuesValidationRuleEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule7021);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3356:2: (otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==40) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3356:4: otherlv_2= ',' ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleIntegerValuesValidationRule7034); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getIntegerValuesValidationRuleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3360:1: ( (lv_value_3_0= ruleIntegerValuesValidationRuleEntry ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3361:1: (lv_value_3_0= ruleIntegerValuesValidationRuleEntry )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3361:1: (lv_value_3_0= ruleIntegerValuesValidationRuleEntry )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3362:3: lv_value_3_0= ruleIntegerValuesValidationRuleEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleAccess().getValueIntegerValuesValidationRuleEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule7055);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3386:1: entryRuleIntegerGreaterValidationRule returns [EObject current=null] : iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF ;
    public final EObject entryRuleIntegerGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerGreaterValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3387:2: (iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3388:2: iv_ruleIntegerGreaterValidationRule= ruleIntegerGreaterValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerGreaterValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerGreaterValidationRule_in_entryRuleIntegerGreaterValidationRule7093);
            iv_ruleIntegerGreaterValidationRule=ruleIntegerGreaterValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerGreaterValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerGreaterValidationRule7103); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3395:1: ruleIntegerGreaterValidationRule returns [EObject current=null] : (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleIntegerGreaterValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3398:28: ( (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3399:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3399:1: (otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3399:3: otherlv_0= 'greater' ( (lv_minValue_1_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleIntegerGreaterValidationRule7140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerGreaterValidationRuleAccess().getGreaterKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3403:1: ( (lv_minValue_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3404:1: (lv_minValue_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3404:1: (lv_minValue_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3405:3: lv_minValue_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerGreaterValidationRuleAccess().getMinValueIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerGreaterValidationRule7161);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3429:1: entryRuleIntegerGreaterEqualsValidationRule returns [EObject current=null] : iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF ;
    public final EObject entryRuleIntegerGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerGreaterEqualsValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3430:2: (iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3431:2: iv_ruleIntegerGreaterEqualsValidationRule= ruleIntegerGreaterEqualsValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerGreaterEqualsValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_entryRuleIntegerGreaterEqualsValidationRule7197);
            iv_ruleIntegerGreaterEqualsValidationRule=ruleIntegerGreaterEqualsValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerGreaterEqualsValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerGreaterEqualsValidationRule7207); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3438:1: ruleIntegerGreaterEqualsValidationRule returns [EObject current=null] : (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) ;
    public final EObject ruleIntegerGreaterEqualsValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_minValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3441:28: ( (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3442:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3442:1: (otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3442:3: otherlv_0= 'greater-equals' ( (lv_minValue_1_0= ruleNumberLiteral ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleIntegerGreaterEqualsValidationRule7244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerGreaterEqualsValidationRuleAccess().getGreaterEqualsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3446:1: ( (lv_minValue_1_0= ruleNumberLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3447:1: (lv_minValue_1_0= ruleNumberLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3447:1: (lv_minValue_1_0= ruleNumberLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3448:3: lv_minValue_1_0= ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerGreaterEqualsValidationRuleAccess().getMinValueNumberLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleIntegerGreaterEqualsValidationRule7265);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3472:1: entryRuleIntegerValuesValidationRuleEntry returns [EObject current=null] : iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF ;
    public final EObject entryRuleIntegerValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValuesValidationRuleEntry = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3473:2: (iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3474:2: iv_ruleIntegerValuesValidationRuleEntry= ruleIntegerValuesValidationRuleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValuesValidationRuleEntry_in_entryRuleIntegerValuesValidationRuleEntry7301);
            iv_ruleIntegerValuesValidationRuleEntry=ruleIntegerValuesValidationRuleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValuesValidationRuleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValuesValidationRuleEntry7311); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3481:1: ruleIntegerValuesValidationRuleEntry returns [EObject current=null] : ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleIntegerValuesValidationRuleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        Enumerator lv_since_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3484:28: ( ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3485:1: ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3485:1: ( ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3485:2: ( (lv_value_0_0= ruleIntLiteral ) ) (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3485:2: ( (lv_value_0_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3486:1: (lv_value_0_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3486:1: (lv_value_0_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3487:3: lv_value_0_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryAccess().getValueIntLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleIntegerValuesValidationRuleEntry7357);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3503:2: (otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3503:4: otherlv_1= '(' ( (lv_since_2_0= ruleSinceVersion ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleIntegerValuesValidationRuleEntry7370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIntegerValuesValidationRuleEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3507:1: ( (lv_since_2_0= ruleSinceVersion ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3508:1: (lv_since_2_0= ruleSinceVersion )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3508:1: (lv_since_2_0= ruleSinceVersion )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3509:3: lv_since_2_0= ruleSinceVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerValuesValidationRuleEntryAccess().getSinceSinceVersionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSinceVersion_in_ruleIntegerValuesValidationRuleEntry7391);
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

                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleIntegerValuesValidationRuleEntry7403); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3537:1: entryRuleRealObjectEntryValue returns [EObject current=null] : iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF ;
    public final EObject entryRuleRealObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3538:2: (iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3539:2: iv_ruleRealObjectEntryValue= ruleRealObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleRealObjectEntryValue_in_entryRuleRealObjectEntryValue7441);
            iv_ruleRealObjectEntryValue=ruleRealObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealObjectEntryValue7451); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3546:1: ruleRealObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? ) ;
    public final EObject ruleRealObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_hasDefault_4_0=null;
        EObject lv_requiredValue_3_0 = null;

        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3549:28: ( ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3550:1: ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3550:1: ( () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3550:2: () otherlv_1= 'real' ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3550:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3551:2: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleRealObjectEntryValue7500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealObjectEntryValueAccess().getRealKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3563:1: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            else if ( (LA50_0==62) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3563:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3563:2: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3563:3: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleRealLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3563:3: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3564:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3564:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3565:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,61,FOLLOW_61_in_ruleRealObjectEntryValue7520); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3578:2: ( (lv_requiredValue_3_0= ruleRealLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3579:1: (lv_requiredValue_3_0= ruleRealLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3579:1: (lv_requiredValue_3_0= ruleRealLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3580:3: lv_requiredValue_3_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealObjectEntryValueAccess().getRequiredValueRealLiteralParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue7554);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleRealLiteral ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3597:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3598:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3598:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3599:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,62,FOLLOW_62_in_ruleRealObjectEntryValue7580); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3612:2: ( (lv_defaultValue_5_0= ruleRealLiteral ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3613:1: (lv_defaultValue_5_0= ruleRealLiteral )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3613:1: (lv_defaultValue_5_0= ruleRealLiteral )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3614:3: lv_defaultValue_5_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealObjectEntryValueAccess().getDefaultValueRealLiteralParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue7614);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3638:1: entryRuleNameTreeEntryValue returns [EObject current=null] : iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF ;
    public final EObject entryRuleNameTreeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTreeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3639:2: (iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3640:2: iv_ruleNameTreeEntryValue= ruleNameTreeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameTreeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameTreeEntryValue_in_entryRuleNameTreeEntryValue7653);
            iv_ruleNameTreeEntryValue=ruleNameTreeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameTreeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameTreeEntryValue7663); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3647:1: ruleNameTreeEntryValue returns [EObject current=null] : ( () otherlv_1= 'name-tree' ) ;
    public final EObject ruleNameTreeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3650:28: ( ( () otherlv_1= 'name-tree' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3651:1: ( () otherlv_1= 'name-tree' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3651:1: ( () otherlv_1= 'name-tree' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3651:2: () otherlv_1= 'name-tree'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3651:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3652:2: 
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleNameTreeEntryValue7712); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3672:1: entryRuleNumberTreeEntryValue returns [EObject current=null] : iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF ;
    public final EObject entryRuleNumberTreeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTreeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3673:2: (iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3674:2: iv_ruleNumberTreeEntryValue= ruleNumberTreeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTreeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTreeEntryValue_in_entryRuleNumberTreeEntryValue7748);
            iv_ruleNumberTreeEntryValue=ruleNumberTreeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTreeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTreeEntryValue7758); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3681:1: ruleNumberTreeEntryValue returns [EObject current=null] : ( () otherlv_1= 'number-tree' ) ;
    public final EObject ruleNumberTreeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3684:28: ( ( () otherlv_1= 'number-tree' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3685:1: ( () otherlv_1= 'number-tree' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3685:1: ( () otherlv_1= 'number-tree' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3685:2: () otherlv_1= 'number-tree'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3685:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3686:2: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleNumberTreeEntryValue7807); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3706:1: entryRuleArrayEntryValue returns [EObject current=null] : iv_ruleArrayEntryValue= ruleArrayEntryValue EOF ;
    public final EObject entryRuleArrayEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3707:2: (iv_ruleArrayEntryValue= ruleArrayEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3708:2: iv_ruleArrayEntryValue= ruleArrayEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleArrayEntryValue_in_entryRuleArrayEntryValue7843);
            iv_ruleArrayEntryValue=ruleArrayEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayEntryValue7853); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3715:1: ruleArrayEntryValue returns [EObject current=null] : (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3718:28: ( (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3719:1: (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3719:1: (otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3719:3: otherlv_0= 'array' (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )? otherlv_4= '<' ( (lv_indirectReference_5_0= ruleIndirectReference ) )? ( (lv_type_6_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )? otherlv_9= '>'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleArrayEntryValue7890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayEntryValueAccess().getArrayKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3723:1: (otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==64) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3723:3: otherlv_1= '[' ( (lv_rule_2_0= ruleArrayValidationRule ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleArrayEntryValue7903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArrayEntryValueAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3727:1: ( (lv_rule_2_0= ruleArrayValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3728:1: (lv_rule_2_0= ruleArrayValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3728:1: (lv_rule_2_0= ruleArrayValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3729:3: lv_rule_2_0= ruleArrayValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getRuleArrayValidationRuleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrayValidationRule_in_ruleArrayEntryValue7924);
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

                    otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleArrayEntryValue7936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayEntryValueAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleArrayEntryValue7950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayEntryValueAccess().getLessThanSignKeyword_2());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3753:1: ( (lv_indirectReference_5_0= ruleIndirectReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=86 && LA52_0<=89)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3754:1: (lv_indirectReference_5_0= ruleIndirectReference )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3754:1: (lv_indirectReference_5_0= ruleIndirectReference )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3755:3: lv_indirectReference_5_0= ruleIndirectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getIndirectReferenceIndirectReferenceEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndirectReference_in_ruleArrayEntryValue7971);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3771:3: ( (lv_type_6_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3772:1: (lv_type_6_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3772:1: (lv_type_6_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3773:3: lv_type_6_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayEntryValueAccess().getTypeAbstractEntryValueParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleArrayEntryValue7993);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3789:2: ( (lv_requiresCustomValidation_7_0= 'custom-validation' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3790:1: (lv_requiresCustomValidation_7_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3790:1: (lv_requiresCustomValidation_7_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3791:3: lv_requiresCustomValidation_7_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_7_0=(Token)match(input,50,FOLLOW_50_in_ruleArrayEntryValue8011); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3804:3: ( (lv_requiresCustomDefault_8_0= 'custom-default' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3805:1: (lv_requiresCustomDefault_8_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3805:1: (lv_requiresCustomDefault_8_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3806:3: lv_requiresCustomDefault_8_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_8_0=(Token)match(input,51,FOLLOW_51_in_ruleArrayEntryValue8043); if (state.failed) return current;
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

            otherlv_9=(Token)match(input,73,FOLLOW_73_in_ruleArrayEntryValue8069); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3831:1: entryRuleArrayValidationRule returns [EObject current=null] : iv_ruleArrayValidationRule= ruleArrayValidationRule EOF ;
    public final EObject entryRuleArrayValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3832:2: (iv_ruleArrayValidationRule= ruleArrayValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3833:2: iv_ruleArrayValidationRule= ruleArrayValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleArrayValidationRule_in_entryRuleArrayValidationRule8105);
            iv_ruleArrayValidationRule=ruleArrayValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayValidationRule8115); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3840:1: ruleArrayValidationRule returns [EObject current=null] : this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule ;
    public final EObject ruleArrayValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayLengthValidationRule_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3843:28: (this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3845:2: this_ArrayLengthValidationRule_0= ruleArrayLengthValidationRule
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayValidationRuleAccess().getArrayLengthValidationRuleParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrayLengthValidationRule_in_ruleArrayValidationRule8164);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3864:1: entryRuleArrayLengthValidationRule returns [EObject current=null] : iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF ;
    public final EObject entryRuleArrayLengthValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLengthValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3865:2: (iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3866:2: iv_ruleArrayLengthValidationRule= ruleArrayLengthValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLengthValidationRule_in_entryRuleArrayLengthValidationRule8198);
            iv_ruleArrayLengthValidationRule=ruleArrayLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLengthValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLengthValidationRule8208); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3873:1: ruleArrayLengthValidationRule returns [EObject current=null] : (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) ) ;
    public final EObject ruleArrayLengthValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3876:28: ( (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3877:1: (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3877:1: (otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3877:3: otherlv_0= 'length' ( (lv_length_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleArrayLengthValidationRule8245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLengthValidationRuleAccess().getLengthKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3881:1: ( (lv_length_1_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3882:1: (lv_length_1_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3882:1: (lv_length_1_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3883:3: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayLengthValidationRule8262); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3907:1: entryRuleObjectEntryValue returns [EObject current=null] : iv_ruleObjectEntryValue= ruleObjectEntryValue EOF ;
    public final EObject entryRuleObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3908:2: (iv_ruleObjectEntryValue= ruleObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3909:2: iv_ruleObjectEntryValue= ruleObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleObjectEntryValue_in_entryRuleObjectEntryValue8303);
            iv_ruleObjectEntryValue=ruleObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectEntryValue8313); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3916:1: ruleObjectEntryValue returns [EObject current=null] : (otherlv_0= 'object' () ) ;
    public final EObject ruleObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3919:28: ( (otherlv_0= 'object' () ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3920:1: (otherlv_0= 'object' () )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3920:1: (otherlv_0= 'object' () )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3920:3: otherlv_0= 'object' ()
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleObjectEntryValue8350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectEntryValueAccess().getObjectKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3924:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3925:2: 
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3941:1: entryRuleMappingDictEntryValue returns [EObject current=null] : iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF ;
    public final EObject entryRuleMappingDictEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingDictEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3942:2: (iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3943:2: iv_ruleMappingDictEntryValue= ruleMappingDictEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingDictEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleMappingDictEntryValue_in_entryRuleMappingDictEntryValue8398);
            iv_ruleMappingDictEntryValue=ruleMappingDictEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingDictEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingDictEntryValue8408); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3950:1: ruleMappingDictEntryValue returns [EObject current=null] : (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3953:28: ( (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3954:1: (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3954:1: (otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3954:3: otherlv_0= 'mapping-dict' otherlv_1= '<' ( (lv_type_2_0= ruleAbstractEntryValue ) ) ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )? ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleMappingDictEntryValue8445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingDictEntryValueAccess().getMappingDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleMappingDictEntryValue8457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingDictEntryValueAccess().getLessThanSignKeyword_1());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3962:1: ( (lv_type_2_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3963:1: (lv_type_2_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3963:1: (lv_type_2_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3964:3: lv_type_2_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingDictEntryValueAccess().getTypeAbstractEntryValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleMappingDictEntryValue8478);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3980:2: ( (lv_requiresCustomValidation_3_0= 'custom-validation' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3981:1: (lv_requiresCustomValidation_3_0= 'custom-validation' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3981:1: (lv_requiresCustomValidation_3_0= 'custom-validation' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3982:3: lv_requiresCustomValidation_3_0= 'custom-validation'
                    {
                    lv_requiresCustomValidation_3_0=(Token)match(input,50,FOLLOW_50_in_ruleMappingDictEntryValue8496); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3995:3: ( (lv_requiresCustomDefault_4_0= 'custom-default' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3996:1: (lv_requiresCustomDefault_4_0= 'custom-default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3996:1: (lv_requiresCustomDefault_4_0= 'custom-default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:3997:3: lv_requiresCustomDefault_4_0= 'custom-default'
                    {
                    lv_requiresCustomDefault_4_0=(Token)match(input,51,FOLLOW_51_in_ruleMappingDictEntryValue8528); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleMappingDictEntryValue8554); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4022:1: entryRuleStringEntryValue returns [EObject current=null] : iv_ruleStringEntryValue= ruleStringEntryValue EOF ;
    public final EObject entryRuleStringEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4023:2: (iv_ruleStringEntryValue= ruleStringEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4024:2: iv_ruleStringEntryValue= ruleStringEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringEntryValue_in_entryRuleStringEntryValue8590);
            iv_ruleStringEntryValue=ruleStringEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringEntryValue8600); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4031:1: ruleStringEntryValue returns [EObject current=null] : ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4034:28: ( ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:1: ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:1: ( ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:2: ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) ) (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )?
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:2: ( ( (lv_textString_0_0= 'text-string' ) ) | ( (lv_asciiString_1_0= 'ascii-string' ) ) | ( (lv_byteString_2_0= 'byte-string' ) ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt57=1;
                }
                break;
            case 77:
                {
                alt57=2;
                }
                break;
            case 78:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:3: ( (lv_textString_0_0= 'text-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4035:3: ( (lv_textString_0_0= 'text-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4036:1: (lv_textString_0_0= 'text-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4036:1: (lv_textString_0_0= 'text-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4037:3: lv_textString_0_0= 'text-string'
                    {
                    lv_textString_0_0=(Token)match(input,76,FOLLOW_76_in_ruleStringEntryValue8644); if (state.failed) return current;
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4051:6: ( (lv_asciiString_1_0= 'ascii-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4051:6: ( (lv_asciiString_1_0= 'ascii-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4052:1: (lv_asciiString_1_0= 'ascii-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4052:1: (lv_asciiString_1_0= 'ascii-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4053:3: lv_asciiString_1_0= 'ascii-string'
                    {
                    lv_asciiString_1_0=(Token)match(input,77,FOLLOW_77_in_ruleStringEntryValue8681); if (state.failed) return current;
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4067:6: ( (lv_byteString_2_0= 'byte-string' ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4067:6: ( (lv_byteString_2_0= 'byte-string' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4068:1: (lv_byteString_2_0= 'byte-string' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4068:1: (lv_byteString_2_0= 'byte-string' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4069:3: lv_byteString_2_0= 'byte-string'
                    {
                    lv_byteString_2_0=(Token)match(input,78,FOLLOW_78_in_ruleStringEntryValue8718); if (state.failed) return current;
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4082:3: (otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==64) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4082:5: otherlv_3= '[' ( (lv_rule_4_0= ruleStringValidationRule ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleStringEntryValue8745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStringEntryValueAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4086:1: ( (lv_rule_4_0= ruleStringValidationRule ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4087:1: (lv_rule_4_0= ruleStringValidationRule )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4087:1: (lv_rule_4_0= ruleStringValidationRule )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4088:3: lv_rule_4_0= ruleStringValidationRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringEntryValueAccess().getRuleStringValidationRuleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStringValidationRule_in_ruleStringEntryValue8766);
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

                    otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleStringEntryValue8778); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4116:1: entryRuleStringValidationRule returns [EObject current=null] : iv_ruleStringValidationRule= ruleStringValidationRule EOF ;
    public final EObject entryRuleStringValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4117:2: (iv_ruleStringValidationRule= ruleStringValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4118:2: iv_ruleStringValidationRule= ruleStringValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleStringValidationRule_in_entryRuleStringValidationRule8816);
            iv_ruleStringValidationRule=ruleStringValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValidationRule8826); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4125:1: ruleStringValidationRule returns [EObject current=null] : this_StringLengthValidationRule_0= ruleStringLengthValidationRule ;
    public final EObject ruleStringValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_StringLengthValidationRule_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4128:28: (this_StringLengthValidationRule_0= ruleStringLengthValidationRule )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4130:2: this_StringLengthValidationRule_0= ruleStringLengthValidationRule
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStringValidationRuleAccess().getStringLengthValidationRuleParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleStringLengthValidationRule_in_ruleStringValidationRule8875);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4149:1: entryRuleStringLengthValidationRule returns [EObject current=null] : iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF ;
    public final EObject entryRuleStringLengthValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLengthValidationRule = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4150:2: (iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4151:2: iv_ruleStringLengthValidationRule= ruleStringLengthValidationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLengthValidationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleStringLengthValidationRule_in_entryRuleStringLengthValidationRule8909);
            iv_ruleStringLengthValidationRule=ruleStringLengthValidationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLengthValidationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLengthValidationRule8919); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4158:1: ruleStringLengthValidationRule returns [EObject current=null] : (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) ) ;
    public final EObject ruleStringLengthValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_length_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4161:28: ( (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4162:1: (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4162:1: (otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4162:3: otherlv_0= 'length' ( (lv_length_1_0= ruleIntLiteral ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleStringLengthValidationRule8956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringLengthValidationRuleAccess().getLengthKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4166:1: ( (lv_length_1_0= ruleIntLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4167:1: (lv_length_1_0= ruleIntLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4167:1: (lv_length_1_0= ruleIntLiteral )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4168:3: lv_length_1_0= ruleIntLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringLengthValidationRuleAccess().getLengthIntLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_ruleStringLengthValidationRule8977);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4192:1: entryRuleAlternativeEntryValue returns [EObject current=null] : iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF ;
    public final EObject entryRuleAlternativeEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4193:2: (iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4194:2: iv_ruleAlternativeEntryValue= ruleAlternativeEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleAlternativeEntryValue_in_entryRuleAlternativeEntryValue9013);
            iv_ruleAlternativeEntryValue=ruleAlternativeEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternativeEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeEntryValue9023); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4201:1: ruleAlternativeEntryValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAlternativeEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4204:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4205:1: (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4205:1: (otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4205:3: otherlv_0= '(' ( (lv_options_1_0= ruleAbstractEntryValue ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleAlternativeEntryValue9060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlternativeEntryValueAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4209:1: ( (lv_options_1_0= ruleAbstractEntryValue ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4210:1: (lv_options_1_0= ruleAbstractEntryValue )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4210:1: (lv_options_1_0= ruleAbstractEntryValue )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4211:3: lv_options_1_0= ruleAbstractEntryValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeEntryValueAccess().getOptionsAbstractEntryValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue9081);
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4227:2: (otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==79) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4227:4: otherlv_2= '|' ( (lv_options_3_0= ruleAbstractEntryValue ) )
            	    {
            	    otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleAlternativeEntryValue9094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAlternativeEntryValueAccess().getVerticalLineKeyword_2_0());
            	          
            	    }
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4231:1: ( (lv_options_3_0= ruleAbstractEntryValue ) )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4232:1: (lv_options_3_0= ruleAbstractEntryValue )
            	    {
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4232:1: (lv_options_3_0= ruleAbstractEntryValue )
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4233:3: lv_options_3_0= ruleAbstractEntryValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAlternativeEntryValueAccess().getOptionsAbstractEntryValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue9115);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleAlternativeEntryValue9129); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4261:1: entryRuleBooleanEntryValue returns [EObject current=null] : iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF ;
    public final EObject entryRuleBooleanEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4262:2: (iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4263:2: iv_ruleBooleanEntryValue= ruleBooleanEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanEntryValue_in_entryRuleBooleanEntryValue9165);
            iv_ruleBooleanEntryValue=ruleBooleanEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanEntryValue9175); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4270:1: ruleBooleanEntryValue returns [EObject current=null] : (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? ) ;
    public final EObject ruleBooleanEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_hasDefault_4_0=null;
        Enumerator lv_requiredValue_3_0 = null;

        Enumerator lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4273:28: ( (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4274:1: (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4274:1: (otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4274:3: otherlv_0= 'bool' () ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleBooleanEntryValue9212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBooleanEntryValueAccess().getBoolKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4278:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4279:2: 
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

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:2: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) ) )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            else if ( (LA60_0==62) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:4: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= ruleBool ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4287:4: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4288:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4288:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4289:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,61,FOLLOW_61_in_ruleBooleanEntryValue9244); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4302:2: ( (lv_requiredValue_3_0= ruleBool ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4303:1: (lv_requiredValue_3_0= ruleBool )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4303:1: (lv_requiredValue_3_0= ruleBool )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4304:3: lv_requiredValue_3_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanEntryValueAccess().getRequiredValueBoolEnumRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBooleanEntryValue9278);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4321:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4321:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4321:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= ruleBool ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4321:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4322:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4322:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4323:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,62,FOLLOW_62_in_ruleBooleanEntryValue9304); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4336:2: ( (lv_defaultValue_5_0= ruleBool ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4337:1: (lv_defaultValue_5_0= ruleBool )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4337:1: (lv_defaultValue_5_0= ruleBool )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4338:3: lv_defaultValue_5_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanEntryValueAccess().getDefaultValueBoolEnumRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBooleanEntryValue9338);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4362:1: entryRuleReferenceEntryValue returns [EObject current=null] : iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF ;
    public final EObject entryRuleReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4363:2: (iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4364:2: iv_ruleReferenceEntryValue= ruleReferenceEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceEntryValue_in_entryRuleReferenceEntryValue9377);
            iv_ruleReferenceEntryValue=ruleReferenceEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceEntryValue9387); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4371:1: ruleReferenceEntryValue returns [EObject current=null] : (otherlv_0= 'ref' () ) ;
    public final EObject ruleReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4374:28: ( (otherlv_0= 'ref' () ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4375:1: (otherlv_0= 'ref' () )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4375:1: (otherlv_0= 'ref' () )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4375:3: otherlv_0= 'ref' ()
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleReferenceEntryValue9424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceEntryValueAccess().getRefKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4379:1: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4380:2: 
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4396:1: entryRuleParentReferenceEntryValue returns [EObject current=null] : iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF ;
    public final EObject entryRuleParentReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentReferenceEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4397:2: (iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4398:2: iv_ruleParentReferenceEntryValue= ruleParentReferenceEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentReferenceEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleParentReferenceEntryValue_in_entryRuleParentReferenceEntryValue9472);
            iv_ruleParentReferenceEntryValue=ruleParentReferenceEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentReferenceEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentReferenceEntryValue9482); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4405:1: ruleParentReferenceEntryValue returns [EObject current=null] : (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleParentReferenceEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4408:28: ( (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:1: (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:1: (otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4409:3: otherlv_0= 'parent-ref' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleParentReferenceEntryValue9519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParentReferenceEntryValueAccess().getParentRefKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4413:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4414:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4414:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4415:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParentReferenceEntryValue9546);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4439:1: entryRuleDictionaryObjectEntryValue returns [EObject current=null] : iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF ;
    public final EObject entryRuleDictionaryObjectEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryObjectEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4440:2: (iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4441:2: iv_ruleDictionaryObjectEntryValue= ruleDictionaryObjectEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryObjectEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryObjectEntryValue_in_entryRuleDictionaryObjectEntryValue9582);
            iv_ruleDictionaryObjectEntryValue=ruleDictionaryObjectEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryObjectEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryObjectEntryValue9592); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4448:1: ruleDictionaryObjectEntryValue returns [EObject current=null] : ( () otherlv_1= 'dict' ) ;
    public final EObject ruleDictionaryObjectEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4451:28: ( ( () otherlv_1= 'dict' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:1: ( () otherlv_1= 'dict' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:1: ( () otherlv_1= 'dict' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:2: () otherlv_1= 'dict'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4452:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4453:2: 
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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleDictionaryObjectEntryValue9641); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4473:1: entryRuleDictionaryDeclarationEntryValue returns [EObject current=null] : iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF ;
    public final EObject entryRuleDictionaryDeclarationEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryDeclarationEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4474:2: (iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4475:2: iv_ruleDictionaryDeclarationEntryValue= ruleDictionaryDeclarationEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryDeclarationEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDictionaryDeclarationEntryValue_in_entryRuleDictionaryDeclarationEntryValue9677);
            iv_ruleDictionaryDeclarationEntryValue=ruleDictionaryDeclarationEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryDeclarationEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionaryDeclarationEntryValue9687); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4482:1: ruleDictionaryDeclarationEntryValue returns [EObject current=null] : (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDictionaryDeclarationEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4485:28: ( (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4486:1: (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4486:1: (otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4486:3: otherlv_0= 'dict-obj' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleDictionaryDeclarationEntryValue9724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictionaryDeclarationEntryValueAccess().getDictObjKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4490:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4491:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4491:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4492:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclarationEntryValue9751);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4516:1: entryRuleArrayMappedEntryValue returns [EObject current=null] : iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF ;
    public final EObject entryRuleArrayMappedEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayMappedEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4517:2: (iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4518:2: iv_ruleArrayMappedEntryValue= ruleArrayMappedEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayMappedEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleArrayMappedEntryValue_in_entryRuleArrayMappedEntryValue9787);
            iv_ruleArrayMappedEntryValue=ruleArrayMappedEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayMappedEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayMappedEntryValue9797); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4525:1: ruleArrayMappedEntryValue returns [EObject current=null] : (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleArrayMappedEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4528:28: ( (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4529:1: (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4529:1: (otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4529:3: otherlv_0= 'array-mapped' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleArrayMappedEntryValue9834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayMappedEntryValueAccess().getArrayMappedKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4533:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4534:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4534:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4535:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArrayMappedEntryValue9861);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4559:1: entryRuleBitFlagsEntryValue returns [EObject current=null] : iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF ;
    public final EObject entryRuleBitFlagsEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitFlagsEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4560:2: (iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4561:2: iv_ruleBitFlagsEntryValue= ruleBitFlagsEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitFlagsEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleBitFlagsEntryValue_in_entryRuleBitFlagsEntryValue9897);
            iv_ruleBitFlagsEntryValue=ruleBitFlagsEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitFlagsEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitFlagsEntryValue9907); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4568:1: ruleBitFlagsEntryValue returns [EObject current=null] : (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBitFlagsEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4571:28: ( (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4572:1: (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4572:1: (otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4572:3: otherlv_0= 'bit-flags' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleBitFlagsEntryValue9944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBitFlagsEntryValueAccess().getBitFlagsKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4576:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4577:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4577:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4578:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBitFlagsEntryValue9971);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4602:1: entryRuleDateEntryValue returns [EObject current=null] : iv_ruleDateEntryValue= ruleDateEntryValue EOF ;
    public final EObject entryRuleDateEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4603:2: (iv_ruleDateEntryValue= ruleDateEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4604:2: iv_ruleDateEntryValue= ruleDateEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleDateEntryValue_in_entryRuleDateEntryValue10007);
            iv_ruleDateEntryValue=ruleDateEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateEntryValue10017); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4611:1: ruleDateEntryValue returns [EObject current=null] : ( () otherlv_1= 'date' ) ;
    public final EObject ruleDateEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4614:28: ( ( () otherlv_1= 'date' ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4615:1: ( () otherlv_1= 'date' )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4615:1: ( () otherlv_1= 'date' )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4615:2: () otherlv_1= 'date'
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4615:2: ()
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4616:2: 
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

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleDateEntryValue10066); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4636:1: entryRuleNameEnumEntryValue returns [EObject current=null] : iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF ;
    public final EObject entryRuleNameEnumEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEnumEntryValue = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4637:2: (iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4638:2: iv_ruleNameEnumEntryValue= ruleNameEnumEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameEnumEntryValueRule()); 
            }
            pushFollow(FOLLOW_ruleNameEnumEntryValue_in_entryRuleNameEnumEntryValue10102);
            iv_ruleNameEnumEntryValue=ruleNameEnumEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameEnumEntryValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameEnumEntryValue10112); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4645:1: ruleNameEnumEntryValue returns [EObject current=null] : (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) ;
    public final EObject ruleNameEnumEntryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasMustBe_2_0=null;
        Token lv_requiredValue_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValue_5_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4648:28: ( (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4649:1: (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4649:1: (otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )? )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4649:3: otherlv_0= 'name-enum' ( ( ruleQualifiedName ) ) ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleNameEnumEntryValue10149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNameEnumEntryValueAccess().getNameEnumKeyword_0());
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4653:1: ( ( ruleQualifiedName ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4654:1: ( ruleQualifiedName )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4654:1: ( ruleQualifiedName )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4655:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNameEnumEntryValue10176);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4671:2: ( ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) ) | ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==61) ) {
                alt61=1;
            }
            else if ( (LA61_0==62) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4671:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4671:3: ( ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4671:4: ( (lv_hasMustBe_2_0= 'must-be' ) ) ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4671:4: ( (lv_hasMustBe_2_0= 'must-be' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4672:1: (lv_hasMustBe_2_0= 'must-be' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4672:1: (lv_hasMustBe_2_0= 'must-be' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4673:3: lv_hasMustBe_2_0= 'must-be'
                    {
                    lv_hasMustBe_2_0=(Token)match(input,61,FOLLOW_61_in_ruleNameEnumEntryValue10196); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4686:2: ( (lv_requiredValue_3_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4687:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4687:1: (lv_requiredValue_3_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4688:3: lv_requiredValue_3_0= RULE_NAME_OBJECT
                    {
                    lv_requiredValue_3_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue10226); if (state.failed) return current;
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4705:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4705:6: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4705:7: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4705:7: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4706:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4706:1: (lv_hasDefault_4_0= 'default' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4707:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,62,FOLLOW_62_in_ruleNameEnumEntryValue10257); if (state.failed) return current;
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

                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4720:2: ( (lv_defaultValue_5_0= RULE_NAME_OBJECT ) )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4721:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4721:1: (lv_defaultValue_5_0= RULE_NAME_OBJECT )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4722:3: lv_defaultValue_5_0= RULE_NAME_OBJECT
                    {
                    lv_defaultValue_5_0=(Token)match(input,RULE_NAME_OBJECT,FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue10287); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4746:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4747:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4748:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral10331);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral10341); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4755:1: ruleNumberLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4758:28: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4759:1: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4759:1: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4760:2: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLiteralAccess().getIntLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleNumberLiteral10391);
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4773:2: this_RealLiteral_1= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberLiteralAccess().getRealLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleNumberLiteral10421);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4792:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4793:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4794:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral10456);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral10466); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4801:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4804:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4805:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4805:1: ( (lv_value_0_0= RULE_INT ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4806:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4806:1: (lv_value_0_0= RULE_INT )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4807:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral10507); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4831:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4832:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4833:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral10547);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral10557); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4840:1: ruleRealLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4843:28: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4844:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4844:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4845:1: (lv_value_0_0= RULE_DOUBLE )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4845:1: (lv_value_0_0= RULE_DOUBLE )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4846:3: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRealLiteral10598); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4870:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4871:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4872:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10639);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10650); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4879:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4882:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4883:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4883:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4884:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10697);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4894:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==85) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4895:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,85,FOLLOW_85_in_ruleQualifiedName10716); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10738);
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4919:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4920:2: (iv_ruleValidID= ruleValidID EOF )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4921:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10786);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10797); if (state.failed) return current;

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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4928:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4931:28: (this_ID_0= RULE_ID )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4932:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10836); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4947:1: ruleIndirectReference returns [Enumerator current=null] : ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) ) ;
    public final Enumerator ruleIndirectReference() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4949:28: ( ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4950:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4950:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'indirect-shall' ) | (enumLiteral_2= 'indirect-shall-not' ) | (enumLiteral_3= 'indirect-should' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt64=1;
                }
                break;
            case 87:
                {
                alt64=2;
                }
                break;
            case 88:
                {
                alt64=3;
                }
                break;
            case 89:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4950:2: (enumLiteral_0= 'UNDEFINED' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4950:2: (enumLiteral_0= 'UNDEFINED' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4950:4: enumLiteral_0= 'UNDEFINED'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleIndirectReference10894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIndirectReferenceAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4956:6: (enumLiteral_1= 'indirect-shall' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4956:6: (enumLiteral_1= 'indirect-shall' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4956:8: enumLiteral_1= 'indirect-shall'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleIndirectReference10911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4962:6: (enumLiteral_2= 'indirect-shall-not' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4962:6: (enumLiteral_2= 'indirect-shall-not' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4962:8: enumLiteral_2= 'indirect-shall-not'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleIndirectReference10928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALL_NOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIndirectReferenceAccess().getINDIRECT_SHALL_NOTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4968:6: (enumLiteral_3= 'indirect-should' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4968:6: (enumLiteral_3= 'indirect-should' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4968:8: enumLiteral_3= 'indirect-should'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleIndirectReference10945); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4978:1: ruleSinceVersion returns [Enumerator current=null] : ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) ) ;
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
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4980:28: ( ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4981:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4981:1: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'pdf-1.0' ) | (enumLiteral_2= 'pdf-1.1' ) | (enumLiteral_3= 'pdf-1.2' ) | (enumLiteral_4= 'pdf-1.3' ) | (enumLiteral_5= 'pdf-1.4' ) | (enumLiteral_6= 'pdf-1.5' ) | (enumLiteral_7= 'pdf-1.6' ) | (enumLiteral_8= 'pdf-1.7' ) | (enumLiteral_9= '32000-1' ) | (enumLiteral_10= 'pdf-2.0' ) | (enumLiteral_11= '32000-2' ) )
            int alt65=12;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt65=1;
                }
                break;
            case 90:
                {
                alt65=2;
                }
                break;
            case 91:
                {
                alt65=3;
                }
                break;
            case 92:
                {
                alt65=4;
                }
                break;
            case 93:
                {
                alt65=5;
                }
                break;
            case 94:
                {
                alt65=6;
                }
                break;
            case 95:
                {
                alt65=7;
                }
                break;
            case 96:
                {
                alt65=8;
                }
                break;
            case 97:
                {
                alt65=9;
                }
                break;
            case 98:
                {
                alt65=10;
                }
                break;
            case 99:
                {
                alt65=11;
                }
                break;
            case 100:
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4981:2: (enumLiteral_0= 'UNDEFINED' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4981:2: (enumLiteral_0= 'UNDEFINED' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4981:4: enumLiteral_0= 'UNDEFINED'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleSinceVersion10990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSinceVersionAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4987:6: (enumLiteral_1= 'pdf-1.0' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4987:6: (enumLiteral_1= 'pdf-1.0' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4987:8: enumLiteral_1= 'pdf-1.0'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleSinceVersion11007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_10EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSinceVersionAccess().getPDF_10EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4993:6: (enumLiteral_2= 'pdf-1.1' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4993:6: (enumLiteral_2= 'pdf-1.1' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4993:8: enumLiteral_2= 'pdf-1.1'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleSinceVersion11024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_11EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSinceVersionAccess().getPDF_11EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4999:6: (enumLiteral_3= 'pdf-1.2' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4999:6: (enumLiteral_3= 'pdf-1.2' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:4999:8: enumLiteral_3= 'pdf-1.2'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_92_in_ruleSinceVersion11041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_12EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSinceVersionAccess().getPDF_12EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5005:6: (enumLiteral_4= 'pdf-1.3' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5005:6: (enumLiteral_4= 'pdf-1.3' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5005:8: enumLiteral_4= 'pdf-1.3'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_93_in_ruleSinceVersion11058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_13EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSinceVersionAccess().getPDF_13EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5011:6: (enumLiteral_5= 'pdf-1.4' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5011:6: (enumLiteral_5= 'pdf-1.4' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5011:8: enumLiteral_5= 'pdf-1.4'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_94_in_ruleSinceVersion11075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_14EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSinceVersionAccess().getPDF_14EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5017:6: (enumLiteral_6= 'pdf-1.5' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5017:6: (enumLiteral_6= 'pdf-1.5' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5017:8: enumLiteral_6= 'pdf-1.5'
                    {
                    enumLiteral_6=(Token)match(input,95,FOLLOW_95_in_ruleSinceVersion11092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_15EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getSinceVersionAccess().getPDF_15EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5023:6: (enumLiteral_7= 'pdf-1.6' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5023:6: (enumLiteral_7= 'pdf-1.6' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5023:8: enumLiteral_7= 'pdf-1.6'
                    {
                    enumLiteral_7=(Token)match(input,96,FOLLOW_96_in_ruleSinceVersion11109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_16EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getSinceVersionAccess().getPDF_16EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5029:6: (enumLiteral_8= 'pdf-1.7' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5029:6: (enumLiteral_8= 'pdf-1.7' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5029:8: enumLiteral_8= 'pdf-1.7'
                    {
                    enumLiteral_8=(Token)match(input,97,FOLLOW_97_in_ruleSinceVersion11126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_17EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getSinceVersionAccess().getPDF_17EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5035:6: (enumLiteral_9= '32000-1' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5035:6: (enumLiteral_9= '32000-1' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5035:8: enumLiteral_9= '32000-1'
                    {
                    enumLiteral_9=(Token)match(input,98,FOLLOW_98_in_ruleSinceVersion11143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_32000_1EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getSinceVersionAccess().getPDF_32000_1EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5041:6: (enumLiteral_10= 'pdf-2.0' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5041:6: (enumLiteral_10= 'pdf-2.0' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5041:8: enumLiteral_10= 'pdf-2.0'
                    {
                    enumLiteral_10=(Token)match(input,99,FOLLOW_99_in_ruleSinceVersion11160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSinceVersionAccess().getPDF_20EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getSinceVersionAccess().getPDF_20EnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5047:6: (enumLiteral_11= '32000-2' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5047:6: (enumLiteral_11= '32000-2' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5047:8: enumLiteral_11= '32000-2'
                    {
                    enumLiteral_11=(Token)match(input,100,FOLLOW_100_in_ruleSinceVersion11177); if (state.failed) return current;
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
    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5057:1: ruleBool returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5059:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5060:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5060:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==101) ) {
                alt66=1;
            }
            else if ( (LA66_0==102) ) {
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
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5060:2: (enumLiteral_0= 'true' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5060:2: (enumLiteral_0= 'true' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5060:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleBool11222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5066:6: (enumLiteral_1= 'false' )
                    {
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5066:6: (enumLiteral_1= 'false' )
                    // ../com.levigo.jadice.tools.pdf.modelgen/src-gen/com/levigo/jadice/tools/pdf/modelgen/parser/antlr/internal/InternalPDFModel.g:5066:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleBool11239); if (state.failed) return current;
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
    public static final BitSet FOLLOW_ruleModelConfig_in_rulePDFModel137 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rulePDFModel158 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleModelConfig_in_entryRuleModelConfig195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelConfig205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModelConfig242 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModelConfig254 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModelConfig266 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModelConfig287 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModelConfig299 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleCoreTypesConfig_in_ruleModelConfig320 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModelConfig332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoreTypesConfig_in_entryRuleCoreTypesConfig368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoreTypesConfig378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCoreTypesConfig415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCoreTypesConfig427 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCoreTypesConfig439 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig460 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig472 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCoreTypesConfig484 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig505 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig517 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCoreTypesConfig529 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig550 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCoreTypesConfig574 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig595 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig607 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCoreTypesConfig619 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig640 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig652 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCoreTypesConfig664 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig685 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig697 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCoreTypesConfig709 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig742 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCoreTypesConfig754 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig787 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCoreTypesConfig799 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig820 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig832 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCoreTypesConfig844 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig865 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig877 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCoreTypesConfig889 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig910 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig922 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCoreTypesConfig934 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig967 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCoreTypesConfig979 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1000 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1012 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCoreTypesConfig1024 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1045 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1057 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCoreTypesConfig1069 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCoreTypesConfig1081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCoreTypesConfig1093 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCoreTypesConfig1105 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1126 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1138 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCoreTypesConfig1150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1183 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCoreTypesConfig1195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1216 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1228 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCoreTypesConfig1240 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCoreTypesConfig1261 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoreTypesConfig1273 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCoreTypesConfig1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclaration_in_ruleAbstractDeclaration1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclaration_in_ruleAbstractDeclaration1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedDeclaration_in_ruleAbstractDeclaration1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclaration_in_ruleAbstractDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecificationReference_in_entryRuleSpecificationReference1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecificationReference1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSpecificationReference1553 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSpecificationReference1565 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSpecificationReference1577 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleSectionReference_in_ruleSpecificationReference1598 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleSpecificationReference1611 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSpecificationReference1623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecificationReference1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_entryRuleSectionReference1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReference1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSectionReference1730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSectionReference1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedDeclaration_in_entryRuleArrayMappedDeclaration1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedDeclaration1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleArrayMappedDeclaration1835 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleArrayMappedDeclaration1856 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleArrayMappedDeclaration1869 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleArrayMappedDeclaration1890 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleArrayMappedDeclaration1902 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayMappedDeclaration1916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrayMappedEntry_in_ruleArrayMappedDeclaration1937 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleArrayMappedDeclaration1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntry_in_entryRuleArrayMappedEntry1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedEntry1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayMappedEntry2040 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleArrayMappedEntry2057 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleArrayMappedEntry2078 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_47_in_ruleArrayMappedEntry2096 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_48_in_ruleArrayMappedEntry2128 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_49_in_ruleArrayMappedEntry2160 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleArrayMappedEntry2195 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleArrayMappedEntry2217 = new BitSet(new long[]{0x000C100000010000L});
    public static final BitSet FOLLOW_44_in_ruleArrayMappedEntry2230 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleArrayMappedEntry2251 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleArrayMappedEntry2263 = new BitSet(new long[]{0x000C000000010000L});
    public static final BitSet FOLLOW_50_in_ruleArrayMappedEntry2283 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51_in_ruleArrayMappedEntry2315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayMappedEntry2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclaration_in_entryRuleDictionaryDeclaration2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryDeclaration2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDictionaryDeclaration2425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_53_in_ruleDictionaryDeclaration2449 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleDictionaryDeclaration2484 = new BitSet(new long[]{0x0040100000004000L});
    public static final BitSet FOLLOW_54_in_ruleDictionaryDeclaration2497 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration2524 = new BitSet(new long[]{0x0000110000004000L});
    public static final BitSet FOLLOW_40_in_ruleDictionaryDeclaration2537 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclaration2564 = new BitSet(new long[]{0x0000110000004000L});
    public static final BitSet FOLLOW_44_in_ruleDictionaryDeclaration2581 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleDictionaryDeclaration2602 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDictionaryDeclaration2614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDictionaryDeclaration2628 = new BitSet(new long[]{0x0000000000022040L});
    public static final BitSet FOLLOW_13_in_ruleDictionaryDeclaration2641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDictionaryDeclaration2653 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_ruleSubtypeConfig_in_ruleDictionaryDeclaration2674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDictionaryDeclaration2687 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_ruleDictionaryEntry_in_ruleDictionaryDeclaration2710 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleDictionaryDeclaration2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeConfig_in_entryRuleSubtypeConfig2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeConfig2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSubtypeConfig2806 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig2833 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleSubtypeConfig2846 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubtypeConfig2873 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubtypeConfig2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryEntry_in_entryRuleDictionaryEntry2923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryEntry2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleDictionaryEntry2975 = new BitSet(new long[]{0x9B13980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_56_in_ruleDictionaryEntry2993 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDictionaryEntry3010 = new BitSet(new long[]{0x9A13980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_47_in_ruleDictionaryEntry3035 = new BitSet(new long[]{0x9A13980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_48_in_ruleDictionaryEntry3067 = new BitSet(new long[]{0x9A13980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_57_in_ruleDictionaryEntry3099 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleDictionaryEntry3134 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleDictionaryEntry3156 = new BitSet(new long[]{0x000C100000010000L});
    public static final BitSet FOLLOW_50_in_ruleDictionaryEntry3174 = new BitSet(new long[]{0x0008100000010000L});
    public static final BitSet FOLLOW_51_in_ruleDictionaryEntry3206 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_44_in_ruleDictionaryEntry3233 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleDictionaryEntry3254 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDictionaryEntry3266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDictionaryEntry3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePackageDeclaration3363 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration3384 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration3396 = new BitSet(new long[]{0x1030084000020000L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rulePackageDeclaration3417 = new BitSet(new long[]{0x1030084000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclaration_in_entryRuleBitFlagsDeclaration3466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsDeclaration3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecificationReference_in_ruleBitFlagsDeclaration3522 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleBitFlagsDeclaration3534 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBitFlagsDeclaration3555 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleBitFlagsDeclaration3568 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclaration3589 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBitFlagsDeclaration3601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBitFlagsDeclaration3615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclarationPart_in_ruleBitFlagsDeclaration3636 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleBitFlagsDeclaration3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsDeclarationPart_in_entryRuleBitFlagsDeclarationPart3685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsDeclarationPart3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBitFlagsDeclarationPart3737 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBitFlagsDeclarationPart3754 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBitFlagsDeclarationPart3775 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_44_in_ruleBitFlagsDeclarationPart3788 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleBitFlagsDeclarationPart3809 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBitFlagsDeclarationPart3821 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBitFlagsDeclarationPart3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclaration_in_entryRuleNameEnumDeclaration3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumDeclaration3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNameEnumDeclaration3918 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleNameEnumDeclaration3939 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleNameEnumDeclaration3952 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclaration3973 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNameEnumDeclaration3985 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNameEnumDeclaration3999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration4020 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_40_in_ruleNameEnumDeclaration4033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_ruleNameEnumDeclaration4054 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_40_in_ruleNameEnumDeclaration4069 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNameEnumDeclaration4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumDeclarationPart_in_entryRuleNameEnumDeclarationPart4119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumDeclarationPart4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumDeclarationPart4171 = new BitSet(new long[]{0x0100100000000002L});
    public static final BitSet FOLLOW_56_in_ruleNameEnumDeclarationPart4189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameEnumDeclarationPart4206 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNameEnumDeclarationPart4226 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNameEnumDeclarationPart4247 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNameEnumDeclarationPart4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_entryRuleAbstractEntryValue4297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntryValue4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullObjectEntryValue_in_ruleAbstractEntryValue4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTreeEntryValue_in_ruleAbstractEntryValue4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTreeEntryValue_in_ruleAbstractEntryValue4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameObjectEntryValue_in_ruleAbstractEntryValue4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberObjectEntryValue_in_ruleAbstractEntryValue4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerObjectEntryValue_in_ruleAbstractEntryValue4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealObjectEntryValue_in_ruleAbstractEntryValue4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumEntryValue_in_ruleAbstractEntryValue4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceEntryValue_in_ruleAbstractEntryValue4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentReferenceEntryValue_in_ruleAbstractEntryValue4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclarationEntryValue_in_ruleAbstractEntryValue4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryObjectEntryValue_in_ruleAbstractEntryValue4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayEntryValue_in_ruleAbstractEntryValue4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingDictEntryValue_in_ruleAbstractEntryValue4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanEntryValue_in_ruleAbstractEntryValue4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateEntryValue_in_ruleAbstractEntryValue4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeEntryValue_in_ruleAbstractEntryValue4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectEntryValue_in_ruleAbstractEntryValue4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringEntryValue_in_ruleAbstractEntryValue4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntryValue_in_ruleAbstractEntryValue4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsEntryValue_in_ruleAbstractEntryValue4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullObjectEntryValue_in_entryRuleNullObjectEntryValue4992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullObjectEntryValue5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNullObjectEntryValue5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameObjectEntryValue_in_entryRuleNameObjectEntryValue5087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameObjectEntryValue5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNameObjectEntryValue5146 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNameObjectEntryValue5166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNameObjectEntryValue5227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameObjectEntryValue5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberObjectEntryValue_in_entryRuleNumberObjectEntryValue5301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberObjectEntryValue5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNumberObjectEntryValue5360 = new BitSet(new long[]{0x6000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleNumberObjectEntryValue5373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000074L});
    public static final BitSet FOLLOW_ruleNumberValidationRule_in_ruleNumberObjectEntryValue5394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleNumberObjectEntryValue5406 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNumberObjectEntryValue5428 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNumberObjectEntryValue5488 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberObjectEntryValue5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValidationRule_in_entryRuleNumberValidationRule5561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValidationRule5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberInclusiveRangeValidationRule_in_ruleNumberValidationRule5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterValidationRule_in_ruleNumberValidationRule5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterEqualsValidationRule_in_ruleNumberValidationRule5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRule_in_ruleNumberValidationRule5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberInclusiveRangeValidationRule_in_entryRuleNumberInclusiveRangeValidationRule5746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberInclusiveRangeValidationRule5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleNumberInclusiveRangeValidationRule5793 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule5814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleNumberInclusiveRangeValidationRule5826 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberInclusiveRangeValidationRule5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterValidationRule_in_entryRuleNumberGreaterValidationRule5883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberGreaterValidationRule5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleNumberGreaterValidationRule5930 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterValidationRule5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberGreaterEqualsValidationRule_in_entryRuleNumberGreaterEqualsValidationRule5987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberGreaterEqualsValidationRule5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNumberGreaterEqualsValidationRule6034 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberGreaterEqualsValidationRule6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRule_in_entryRuleNumberValuesValidationRule6091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValuesValidationRule6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNumberValuesValidationRule6138 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule6159 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumberValuesValidationRule6172 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_ruleNumberValuesValidationRule6193 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleNumberValuesValidationRuleEntry_in_entryRuleNumberValuesValidationRuleEntry6231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValuesValidationRuleEntry6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberValuesValidationRuleEntry6287 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumberValuesValidationRuleEntry6300 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleNumberValuesValidationRuleEntry6321 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNumberValuesValidationRuleEntry6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerObjectEntryValue_in_entryRuleIntegerObjectEntryValue6371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerObjectEntryValue6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleIntegerObjectEntryValue6430 = new BitSet(new long[]{0x6000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleIntegerObjectEntryValue6443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000074L});
    public static final BitSet FOLLOW_ruleIntegerValidationRule_in_ruleIntegerObjectEntryValue6464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIntegerObjectEntryValue6476 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIntegerObjectEntryValue6498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIntegerObjectEntryValue6558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerObjectEntryValue6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValidationRule_in_entryRuleIntegerValidationRule6631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValidationRule6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_ruleIntegerValidationRule6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRule_in_ruleIntegerValidationRule6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterValidationRule_in_ruleIntegerValidationRule6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_ruleIntegerValidationRule6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInclusiveRangeValidationRule_in_entryRuleIntegerInclusiveRangeValidationRule6816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerInclusiveRangeValidationRule6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIntegerInclusiveRangeValidationRule6863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule6884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleIntegerInclusiveRangeValidationRule6896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerInclusiveRangeValidationRule6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRule_in_entryRuleIntegerValuesValidationRule6953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValuesValidationRule6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleIntegerValuesValidationRule7000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule7021 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleIntegerValuesValidationRule7034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_ruleIntegerValuesValidationRule7055 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterValidationRule_in_entryRuleIntegerGreaterValidationRule7093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerGreaterValidationRule7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIntegerGreaterValidationRule7140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerGreaterValidationRule7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerGreaterEqualsValidationRule_in_entryRuleIntegerGreaterEqualsValidationRule7197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerGreaterEqualsValidationRule7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleIntegerGreaterEqualsValidationRule7244 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleIntegerGreaterEqualsValidationRule7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValuesValidationRuleEntry_in_entryRuleIntegerValuesValidationRuleEntry7301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValuesValidationRuleEntry7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleIntegerValuesValidationRuleEntry7357 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleIntegerValuesValidationRuleEntry7370 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFC400000L});
    public static final BitSet FOLLOW_ruleSinceVersion_in_ruleIntegerValuesValidationRuleEntry7391 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIntegerValuesValidationRuleEntry7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealObjectEntryValue_in_entryRuleRealObjectEntryValue7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealObjectEntryValue7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRealObjectEntryValue7500 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRealObjectEntryValue7520 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRealObjectEntryValue7580 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleRealObjectEntryValue7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTreeEntryValue_in_entryRuleNameTreeEntryValue7653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameTreeEntryValue7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNameTreeEntryValue7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTreeEntryValue_in_entryRuleNumberTreeEntryValue7748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTreeEntryValue7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumberTreeEntryValue7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayEntryValue_in_entryRuleArrayEntryValue7843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayEntryValue7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArrayEntryValue7890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000101L});
    public static final BitSet FOLLOW_64_in_ruleArrayEntryValue7903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleArrayValidationRule_in_ruleArrayEntryValue7924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleArrayEntryValue7936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleArrayEntryValue7950 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleIndirectReference_in_ruleArrayEntryValue7971 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleArrayEntryValue7993 = new BitSet(new long[]{0x000C000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50_in_ruleArrayEntryValue8011 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51_in_ruleArrayEntryValue8043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleArrayEntryValue8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValidationRule_in_entryRuleArrayValidationRule8105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayValidationRule8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLengthValidationRule_in_ruleArrayValidationRule8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLengthValidationRule_in_entryRuleArrayLengthValidationRule8198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLengthValidationRule8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleArrayLengthValidationRule8245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayLengthValidationRule8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectEntryValue_in_entryRuleObjectEntryValue8303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectEntryValue8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleObjectEntryValue8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingDictEntryValue_in_entryRuleMappingDictEntryValue8398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingDictEntryValue8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleMappingDictEntryValue8445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleMappingDictEntryValue8457 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleMappingDictEntryValue8478 = new BitSet(new long[]{0x000C000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50_in_ruleMappingDictEntryValue8496 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51_in_ruleMappingDictEntryValue8528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleMappingDictEntryValue8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringEntryValue_in_entryRuleStringEntryValue8590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringEntryValue8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleStringEntryValue8644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_77_in_ruleStringEntryValue8681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_78_in_ruleStringEntryValue8718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStringEntryValue8745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleStringValidationRule_in_ruleStringEntryValue8766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStringEntryValue8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValidationRule_in_entryRuleStringValidationRule8816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValidationRule8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLengthValidationRule_in_ruleStringValidationRule8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLengthValidationRule_in_entryRuleStringLengthValidationRule8909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLengthValidationRule8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleStringLengthValidationRule8956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleStringLengthValidationRule8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeEntryValue_in_entryRuleAlternativeEntryValue9013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeEntryValue9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlternativeEntryValue9060 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue9081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleAlternativeEntryValue9094 = new BitSet(new long[]{0x9813980CA4480000L,0x0000000003DF7880L});
    public static final BitSet FOLLOW_ruleAbstractEntryValue_in_ruleAlternativeEntryValue9115 = new BitSet(new long[]{0x0000200000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_45_in_ruleAlternativeEntryValue9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanEntryValue_in_entryRuleBooleanEntryValue9165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanEntryValue9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBooleanEntryValue9212 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBooleanEntryValue9244 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBooleanEntryValue9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanEntryValue9304 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBooleanEntryValue9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceEntryValue_in_entryRuleReferenceEntryValue9377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceEntryValue9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleReferenceEntryValue9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentReferenceEntryValue_in_entryRuleParentReferenceEntryValue9472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentReferenceEntryValue9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleParentReferenceEntryValue9519 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParentReferenceEntryValue9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryObjectEntryValue_in_entryRuleDictionaryObjectEntryValue9582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryObjectEntryValue9592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDictionaryObjectEntryValue9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionaryDeclarationEntryValue_in_entryRuleDictionaryDeclarationEntryValue9677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionaryDeclarationEntryValue9687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDictionaryDeclarationEntryValue9724 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDictionaryDeclarationEntryValue9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayMappedEntryValue_in_entryRuleArrayMappedEntryValue9787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayMappedEntryValue9797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleArrayMappedEntryValue9834 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArrayMappedEntryValue9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitFlagsEntryValue_in_entryRuleBitFlagsEntryValue9897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitFlagsEntryValue9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBitFlagsEntryValue9944 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBitFlagsEntryValue9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateEntryValue_in_entryRuleDateEntryValue10007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateEntryValue10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDateEntryValue10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameEnumEntryValue_in_entryRuleNameEnumEntryValue10102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameEnumEntryValue10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNameEnumEntryValue10149 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNameEnumEntryValue10176 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNameEnumEntryValue10196 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNameEnumEntryValue10257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_OBJECT_in_ruleNameEnumEntryValue10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral10331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleNumberLiteral10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleNumberLiteral10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral10456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral10547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral10557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRealLiteral10598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleQualifiedName10716 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleIndirectReference10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleIndirectReference10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleIndirectReference10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleIndirectReference10945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleSinceVersion10990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleSinceVersion11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleSinceVersion11024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleSinceVersion11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSinceVersion11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleSinceVersion11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleSinceVersion11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleSinceVersion11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleSinceVersion11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleSinceVersion11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleSinceVersion11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleSinceVersion11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBool11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleBool11239 = new BitSet(new long[]{0x0000000000000002L});

}