package org.eclipse.epsilon.ecl.parse;

// $ANTLR 3.1b1 EclParserRules.g 2020-06-22 12:50:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 * -----------------------------------------------------------------------------
 * ANTLR 3 License
 * [The "BSD licence"]
 * Copyright (c) 2005-2008 Terence Parr
 * All rights reserved.
 *  
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *   derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
public class Ecl_EclParserRules extends org.eclipse.epsilon.common.parse.EpsilonParser {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int MODELDECLARATIONPARAMETER=78;
    public static final int T__145=145;
    public static final int BREAKALL=44;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int VAR=53;
    public static final int MODELDECLARATIONPARAMETERS=77;
    public static final int T__141=141;
    public static final int THROW=58;
    public static final int SpecialTypeName=19;
    public static final int PARAMLIST=29;
    public static final int EXPRLIST=59;
    public static final int EXPRRANGE=60;
    public static final int BREAK=43;
    public static final int ELSE=36;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int FORMAL=28;
    public static final int IF=35;
    public static final int MultiplicativeExpression=62;
    public static final int TYPE=70;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__135=135;
    public static final int T__134=134;
    public static final int T__131=131;
    public static final int NewExpression=52;
    public static final int T__130=130;
    public static final int CASE=40;
    public static final int Letter=20;
    public static final int LINE_COMMENT=26;
    public static final int T__129=129;
    public static final int T__126=126;
    public static final int JavaIDDigit=22;
    public static final int T__125=125;
    public static final int LAMBDAEXPR=69;
    public static final int MAP=80;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int MODELDECLARATION=73;
    public static final int T__163=163;
    public static final int EXPRESSIONINBRACKETS=64;
    public static final int T__160=160;
    public static final int TERNARY=37;
    public static final int TRANSACTION=46;
    public static final int FLOAT_TYPE_SUFFIX=7;
    public static final int ITEMSELECTOR=79;
    public static final int COMMENT=25;
    public static final int ModelElementType=50;
    public static final int IMPORT=72;
    public static final int DELETE=57;
    public static final int ARROW=11;
    public static final int MapTypeName=18;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__155=155;
    public static final int SPECIAL_ASSIGNMENT=31;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int Annotation=27;
    public static final int CONTINUE=45;
    public static final int ENUMERATION_VALUE=71;
    public static final int OPERATOR=63;
    public static final int EXPONENT=6;
    public static final int STRING=15;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int NAMESPACE=74;
    public static final int T__92=92;
    public static final int COLLECTION=47;
    public static final int NEW=54;
    public static final int EXTENDS=85;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int PRE=83;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int POST=84;
    public static final int ALIAS=75;
    public static final int DRIVER=76;
    public static final int DO=89;
    public static final int KEYVAL=81;
    public static final int POINT_POINT=10;
    public static final int GUARD=86;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int HELPERMETHOD=32;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int StatementBlock=33;
    public static final int T__98=98;
    public static final int ABORT=48;
    public static final int StrangeNameLiteral=16;
    public static final int FOR=34;
    public static final int BLOCK=67;
    public static final int PARAMETERS=51;
    public static final int SpecialNameChar=21;
    public static final int BOOLEAN=13;
    public static final int NAME=23;
    public static final int COMPARE=88;
    public static final int SWITCH=39;
    public static final int FeatureCall=65;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int FLOAT=4;
    public static final int ECLMODULE=90;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int NativeType=61;
    public static final int INT=8;
    public static final int ANNOTATIONBLOCK=55;
    public static final int RETURN=42;
    public static final int KEYVALLIST=82;
    public static final int FEATURECALL=68;
    public static final int CollectionType=49;
    public static final int T__119=119;
    public static final int ASSIGNMENT=30;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int WS=24;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int EscapeSequence=14;
    public static final int EOLMODULE=66;
    public static final int CollectionTypeName=17;
    public static final int DIGIT=5;
    public static final int EXECUTABLEANNOTATION=56;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int WHILE=38;
    public static final int T__109=109;
    public static final int NAVIGATION=12;
    public static final int T__104=104;
    public static final int POINT=9;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int DEFAULT=41;
    public static final int MATCH=87;
    public static final int T__105=105;

    // delegates
    // delegators
    public EclParser gEcl;


        public Ecl_EclParserRules(TokenStream input, EclParser gEcl) {
            this(input, new RecognizerSharedState(), gEcl);
        }
        public Ecl_EclParserRules(TokenStream input, RecognizerSharedState state, EclParser gEcl) {
            super(input, state);
            this.gEcl = gEcl;
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return EclParser.tokenNames; }
    public String getGrammarFileName() { return "EclParserRules.g"; }


    public static class eclModuleContent_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start eclModuleContent
    // EclParserRules.g:47:1: eclModuleContent : ( matchRule | erlModuleContent );
    public final Ecl_EclParserRules.eclModuleContent_return eclModuleContent() throws RecognitionException {
        Ecl_EclParserRules.eclModuleContent_return retval = new Ecl_EclParserRules.eclModuleContent_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Ecl_EclParserRules.matchRule_return matchRule1 = null;

        Ecl_ErlParserRules.erlModuleContent_return erlModuleContent2 = null;



        try {
            // EclParserRules.g:48:2: ( matchRule | erlModuleContent )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==160) ) {
                alt1=1;
            }
            else if ( (LA1_0==Annotation||(LA1_0>=99 && LA1_0<=100)||LA1_0==105||(LA1_0>=156 && LA1_0<=157)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // EclParserRules.g:48:4: matchRule
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    pushFollow(FOLLOW_matchRule_in_eclModuleContent44);
                    matchRule1=matchRule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchRule1.getTree());

                    }
                    break;
                case 2 :
                    // EclParserRules.g:48:16: erlModuleContent
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    pushFollow(FOLLOW_erlModuleContent_in_eclModuleContent48);
                    erlModuleContent2=gEcl.erlModuleContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, erlModuleContent2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end eclModuleContent

    public static class matchRule_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start matchRule
    // EclParserRules.g:51:1: matchRule : r= 'rule' rule= NAME 'match' formalParameter 'with' formalParameter ( extendz )? ob= '{' ( guard )? ( compareBlock )? ( doBlock )? cb= '}' ;
    public final Ecl_EclParserRules.matchRule_return matchRule() throws RecognitionException {
        Ecl_EclParserRules.matchRule_return retval = new Ecl_EclParserRules.matchRule_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token r=null;
        Token rule=null;
        Token ob=null;
        Token cb=null;
        Token string_literal3=null;
        Token string_literal5=null;
        Ecl_EolParserRules.formalParameter_return formalParameter4 = null;

        Ecl_EolParserRules.formalParameter_return formalParameter6 = null;

        Ecl_ErlParserRules.extendz_return extendz7 = null;

        Ecl_ErlParserRules.guard_return guard8 = null;

        Ecl_EclParserRules.compareBlock_return compareBlock9 = null;

        Ecl_EclParserRules.doBlock_return doBlock10 = null;


        org.eclipse.epsilon.common.parse.AST r_tree=null;
        org.eclipse.epsilon.common.parse.AST rule_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST string_literal3_tree=null;
        org.eclipse.epsilon.common.parse.AST string_literal5_tree=null;

        try {
            // EclParserRules.g:56:2: (r= 'rule' rule= NAME 'match' formalParameter 'with' formalParameter ( extendz )? ob= '{' ( guard )? ( compareBlock )? ( doBlock )? cb= '}' )
            // EclParserRules.g:56:4: r= 'rule' rule= NAME 'match' formalParameter 'with' formalParameter ( extendz )? ob= '{' ( guard )? ( compareBlock )? ( doBlock )? cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,160,FOLLOW_160_in_matchRule68); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            rule=(Token)match(input,NAME,FOLLOW_NAME_in_matchRule73); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            rule_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(rule);
            adaptor.addChild(root_0, rule_tree);
            }
            string_literal3=(Token)match(input,161,FOLLOW_161_in_matchRule75); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_matchRule78);
            formalParameter4=gEcl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter4.getTree());
            string_literal5=(Token)match(input,162,FOLLOW_162_in_matchRule80); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_matchRule83);
            formalParameter6=gEcl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter6.getTree());
            // EclParserRules.g:57:2: ( extendz )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==159) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // EclParserRules.g:0:0: extendz
                    {
                    pushFollow(FOLLOW_extendz_in_matchRule86);
                    extendz7=gEcl.extendz();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extendz7.getTree());

                    }
                    break;

            }

            ob=(Token)match(input,96,FOLLOW_96_in_matchRule91); if (state.failed) return retval;
            // EclParserRules.g:57:19: ( guard )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==158) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // EclParserRules.g:0:0: guard
                    {
                    pushFollow(FOLLOW_guard_in_matchRule94);
                    guard8=gEcl.guard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, guard8.getTree());

                    }
                    break;

            }

            // EclParserRules.g:57:26: ( compareBlock )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==163) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // EclParserRules.g:0:0: compareBlock
                    {
                    pushFollow(FOLLOW_compareBlock_in_matchRule97);
                    compareBlock9=compareBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compareBlock9.getTree());

                    }
                    break;

            }

            // EclParserRules.g:57:40: ( doBlock )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==164) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EclParserRules.g:0:0: doBlock
                    {
                    pushFollow(FOLLOW_doBlock_in_matchRule100);
                    doBlock10=doBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doBlock10.getTree());

                    }
                    break;

            }

            cb=(Token)match(input,97,FOLLOW_97_in_matchRule105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              r.setType(MATCH);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              		((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(ob);
              		((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(cb);
              	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end matchRule

    public static class compareBlock_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compareBlock
    // EclParserRules.g:61:1: compareBlock : c= 'compare' expressionOrStatementBlock ;
    public final Ecl_EclParserRules.compareBlock_return compareBlock() throws RecognitionException {
        Ecl_EclParserRules.compareBlock_return retval = new Ecl_EclParserRules.compareBlock_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token c=null;
        Ecl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock11 = null;


        org.eclipse.epsilon.common.parse.AST c_tree=null;

        try {
            // EclParserRules.g:62:2: (c= 'compare' expressionOrStatementBlock )
            // EclParserRules.g:62:4: c= 'compare' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            c=(Token)match(input,163,FOLLOW_163_in_compareBlock122); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            c_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(c);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(c_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_compareBlock125);
            expressionOrStatementBlock11=gEcl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock11.getTree());
            if ( state.backtracking==0 ) {
              c.setType(COMPARE);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end compareBlock

    public static class doBlock_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start doBlock
    // EclParserRules.g:66:1: doBlock : d= 'do' statementBlock ;
    public final Ecl_EclParserRules.doBlock_return doBlock() throws RecognitionException {
        Ecl_EclParserRules.doBlock_return retval = new Ecl_EclParserRules.doBlock_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token d=null;
        Ecl_EolParserRules.statementBlock_return statementBlock12 = null;


        org.eclipse.epsilon.common.parse.AST d_tree=null;

        try {
            // EclParserRules.g:67:2: (d= 'do' statementBlock )
            // EclParserRules.g:67:4: d= 'do' statementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            d=(Token)match(input,164,FOLLOW_164_in_doBlock141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            d_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(d);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(d_tree, root_0);
            }
            pushFollow(FOLLOW_statementBlock_in_doBlock144);
            statementBlock12=gEcl.statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock12.getTree());
            if ( state.backtracking==0 ) {
              d.setType(DO);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end doBlock

    // Delegated rules


 

    public static final BitSet FOLLOW_matchRule_in_eclModuleContent44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_erlModuleContent_in_eclModuleContent48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_matchRule68 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAME_in_matchRule73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_matchRule75 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_formalParameter_in_matchRule78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_matchRule80 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_formalParameter_in_matchRule83 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_extendz_in_matchRule86 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_matchRule91 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000001840000000L});
    public static final BitSet FOLLOW_guard_in_matchRule94 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_compareBlock_in_matchRule97 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_doBlock_in_matchRule100 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_matchRule105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_compareBlock122 = new BitSet(new long[]{0x0000000000000000L,0x0000008100000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_compareBlock125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_doBlock141 = new BitSet(new long[]{0x0000000000000000L,0x0000008100000000L});
    public static final BitSet FOLLOW_statementBlock_in_doBlock144 = new BitSet(new long[]{0x0000000000000002L});

}