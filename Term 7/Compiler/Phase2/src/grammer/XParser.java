// Generated from /Users/hasan/Desktop/Projects/University/Term 7/Compiler/Phase2/src/grammer/X.g4 by ANTLR 4.5.3
package grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerConstant=1, CharacterConstant=2, Typedef=3, Return=4, If=5, Else=6, 
		Size=7, Void=8, Int=9, Char=10, String=11, While=12, Break=13, Nil=14, 
		NumberSign=15, Of=16, In=17, As=18, List=19, Foreach=20, Head=21, Tail=22, 
		DollarSign=23, LeftParen=24, RightParen=25, LeftBracket=26, RightBracket=27, 
		LeftBrace=28, RightBrace=29, Less=30, Greater=31, Plus=32, Minus=33, Star=34, 
		Div=35, AndAnd=36, OrOr=37, Not=38, Colon=39, Semi=40, Comma=41, Assign=42, 
		Equal=43, NotEqual=44, Arrow=45, Dot=46, StringLiteral=47, NotPermittedCharacterConstant=48, 
		Identifier=49, Whitespace=50, Newline=51, BlockComment=52, LineComment=53;
	public static final int
		RULE_program = 0, RULE_global = 1, RULE_variableDefinition = 2, RULE_variableNaming = 3, 
		RULE_expression = 4, RULE_andExpression = 5, RULE_equivalentExpression = 6, 
		RULE_compareExpression = 7, RULE_plusAndMinusExpression = 8, RULE_mulAndDivExpression = 9, 
		RULE_unaryExpression = 10, RULE_endPointOfExpression = 11, RULE_arithmeticConstants = 12, 
		RULE_assignment = 13, RULE_listOrFunctionAccess = 14, RULE_leftPositionOfAccess = 15, 
		RULE_rightPositionOfAccess = 16, RULE_identifierAccess = 17, RULE_indexAccess = 18, 
		RULE_functionAccess = 19, RULE_listConstant = 20, RULE_typeForwardDeclaration = 21, 
		RULE_typeDefinition = 22, RULE_pointerToFunction = 23, RULE_ptfInputs = 24, 
		RULE_normalListDefinition = 25, RULE_specialListDefinition = 26, RULE_listDefinition = 27, 
		RULE_listAttributes = 28, RULE_listAttribute = 29, RULE_functionForwardDeclaration = 30, 
		RULE_functionDefinition = 31, RULE_functionHeader = 32, RULE_functionDeclarationHeader = 33, 
		RULE_functionBody = 34, RULE_functionInputs = 35, RULE_functionInput = 36, 
		RULE_functionDeclarationInputs = 37, RULE_functionDeclarationInput = 38, 
		RULE_type = 39, RULE_primitive = 40, RULE_functionName = 41, RULE_typedefName = 42, 
		RULE_statement = 43, RULE_simpleStatement = 44, RULE_statementWitIfElseNotIf = 45, 
		RULE_block = 46, RULE_ifStatement = 47, RULE_ifElse = 48, RULE_ifGeneral = 49, 
		RULE_whileStatement = 50, RULE_foreachStatement = 51;
	public static final String[] ruleNames = {
		"program", "global", "variableDefinition", "variableNaming", "expression", 
		"andExpression", "equivalentExpression", "compareExpression", "plusAndMinusExpression", 
		"mulAndDivExpression", "unaryExpression", "endPointOfExpression", "arithmeticConstants", 
		"assignment", "listOrFunctionAccess", "leftPositionOfAccess", "rightPositionOfAccess", 
		"identifierAccess", "indexAccess", "functionAccess", "listConstant", "typeForwardDeclaration", 
		"typeDefinition", "pointerToFunction", "ptfInputs", "normalListDefinition", 
		"specialListDefinition", "listDefinition", "listAttributes", "listAttribute", 
		"functionForwardDeclaration", "functionDefinition", "functionHeader", 
		"functionDeclarationHeader", "functionBody", "functionInputs", "functionInput", 
		"functionDeclarationInputs", "functionDeclarationInput", "type", "primitive", 
		"functionName", "typedefName", "statement", "simpleStatement", "statementWitIfElseNotIf", 
		"block", "ifStatement", "ifElse", "ifGeneral", "whileStatement", "foreachStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'typedef'", "'return'", "'if'", "'else'", "'size'", 
		"'void'", "'int'", "'char'", "'string'", "'while'", "'break'", "'nil'", 
		"'#'", "'of'", "'in'", "'as'", "'list'", "'foreach'", "'head'", "'tail'", 
		"'$'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "':'", "';'", "','", "'='", 
		"'=='", "'!='", "'->'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntegerConstant", "CharacterConstant", "Typedef", "Return", "If", 
		"Else", "Size", "Void", "Int", "Char", "String", "While", "Break", "Nil", 
		"NumberSign", "Of", "In", "As", "List", "Foreach", "Head", "Tail", "DollarSign", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "Less", "Greater", "Plus", "Minus", "Star", "Div", "AndAnd", 
		"OrOr", "Not", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
		"Arrow", "Dot", "StringLiteral", "NotPermittedCharacterConstant", "Identifier", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "X.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Typedef) | (1L << Void) | (1L << Int) | (1L << Char) | (1L << String) | (1L << List) | (1L << LeftBracket) | (1L << Less) | (1L << Identifier))) != 0)) {
				{
				{
				setState(104);
				global();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalContext extends ParserRuleContext {
		public TypeForwardDeclarationContext typeForwardDeclaration() {
			return getRuleContext(TypeForwardDeclarationContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionForwardDeclarationContext functionForwardDeclaration() {
			return getRuleContext(FunctionForwardDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				typeForwardDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				typeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				variableDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				functionForwardDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableNamingContext> variableNaming() {
			return getRuleContexts(VariableNamingContext.class);
		}
		public VariableNamingContext variableNaming(int i) {
			return getRuleContext(VariableNamingContext.class,i);
		}
		public TerminalNode Semi() { return getToken(XParser.Semi, 0); }
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			type();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					variableNaming();
					setState(119);
					match(Comma);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(126);
			variableNaming();
			setState(127);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNamingContext extends ParserRuleContext {
		public boolean haveExpression;
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(XParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNaming; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitVariableNaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNamingContext variableNaming() throws RecognitionException {
		VariableNamingContext _localctx = new VariableNamingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableNaming);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(Identifier);
				((VariableNamingContext)_localctx).haveExpression =  false;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Identifier);
				setState(132);
				match(Assign);
				setState(133);
				expression();
				((VariableNamingContext)_localctx).haveExpression =  true;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(XParser.OrOr, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				assignment();
				((ExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(141);
				andExpression();
				setState(142);
				((ExpressionContext)_localctx).op = match(OrOr);
				setState(143);
				expression();
				}
				((ExpressionContext)_localctx).path =  1;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				andExpression();
				((ExpressionContext)_localctx).path =  2;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public EquivalentExpressionContext equivalentExpression() {
			return getRuleContext(EquivalentExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(XParser.AndAnd, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_andExpression);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(152);
				equivalentExpression();
				setState(153);
				((AndExpressionContext)_localctx).op = match(AndAnd);
				setState(154);
				andExpression();
				}
				((AndExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				equivalentExpression();
				((AndExpressionContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquivalentExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public EquivalentExpressionContext equivalentExpression() {
			return getRuleContext(EquivalentExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(XParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(XParser.NotEqual, 0); }
		public EquivalentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitEquivalentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquivalentExpressionContext equivalentExpression() throws RecognitionException {
		EquivalentExpressionContext _localctx = new EquivalentExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equivalentExpression);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(163);
				compareExpression();
				setState(164);
				((EquivalentExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
					((EquivalentExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(165);
				equivalentExpression();
				}
				((EquivalentExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				compareExpression();
				((EquivalentExpressionContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public PlusAndMinusExpressionContext plusAndMinusExpression() {
			return getRuleContext(PlusAndMinusExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(XParser.Less, 0); }
		public TerminalNode Greater() { return getToken(XParser.Greater, 0); }
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compareExpression);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174);
				plusAndMinusExpression();
				setState(175);
				((CompareExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Less || _la==Greater) ) {
					((CompareExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(176);
				compareExpression();
				}
				((CompareExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				plusAndMinusExpression();
				((CompareExpressionContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusAndMinusExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public MulAndDivExpressionContext mulAndDivExpression() {
			return getRuleContext(MulAndDivExpressionContext.class,0);
		}
		public PlusAndMinusExpressionContext plusAndMinusExpression() {
			return getRuleContext(PlusAndMinusExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(XParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(XParser.Minus, 0); }
		public PlusAndMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusAndMinusExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitPlusAndMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusAndMinusExpressionContext plusAndMinusExpression() throws RecognitionException {
		PlusAndMinusExpressionContext _localctx = new PlusAndMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_plusAndMinusExpression);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(185);
				mulAndDivExpression();
				setState(186);
				((PlusAndMinusExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
					((PlusAndMinusExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(187);
				plusAndMinusExpression();
				}
				((PlusAndMinusExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				mulAndDivExpression();
				((PlusAndMinusExpressionContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulAndDivExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MulAndDivExpressionContext mulAndDivExpression() {
			return getRuleContext(MulAndDivExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(XParser.Star, 0); }
		public TerminalNode Div() { return getToken(XParser.Div, 0); }
		public MulAndDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulAndDivExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitMulAndDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulAndDivExpressionContext mulAndDivExpression() throws RecognitionException {
		MulAndDivExpressionContext _localctx = new MulAndDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulAndDivExpression);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				unaryExpression();
				setState(197);
				((MulAndDivExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Div) ) {
					((MulAndDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(198);
				mulAndDivExpression();
				}
				((MulAndDivExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				unaryExpression();
				((MulAndDivExpressionContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public int path;
		public Token op;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(XParser.Minus, 0); }
		public TerminalNode Not() { return getToken(XParser.Not, 0); }
		public EndPointOfExpressionContext endPointOfExpression() {
			return getRuleContext(EndPointOfExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryExpression);
		int _la;
		try {
			setState(215);
			switch (_input.LA(1)) {
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(207);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Minus || _la==Not) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(208);
				unaryExpression();
				}
				((UnaryExpressionContext)_localctx).path =  0;
				}
				break;
			case IntegerConstant:
			case CharacterConstant:
			case Nil:
			case LeftParen:
			case LeftBracket:
			case StringLiteral:
			case NotPermittedCharacterConstant:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				endPointOfExpression();
				((UnaryExpressionContext)_localctx).path =  1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndPointOfExpressionContext extends ParserRuleContext {
		public int path;
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public ListOrFunctionAccessContext listOrFunctionAccess() {
			return getRuleContext(ListOrFunctionAccessContext.class,0);
		}
		public ListConstantContext listConstant() {
			return getRuleContext(ListConstantContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(XParser.StringLiteral, 0); }
		public TerminalNode IntegerConstant() { return getToken(XParser.IntegerConstant, 0); }
		public TerminalNode CharacterConstant() { return getToken(XParser.CharacterConstant, 0); }
		public TerminalNode Nil() { return getToken(XParser.Nil, 0); }
		public TerminalNode NotPermittedCharacterConstant() { return getToken(XParser.NotPermittedCharacterConstant, 0); }
		public EndPointOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endPointOfExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitEndPointOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndPointOfExpressionContext endPointOfExpression() throws RecognitionException {
		EndPointOfExpressionContext _localctx = new EndPointOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endPointOfExpression);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(217);
				match(LeftParen);
				setState(218);
				expression();
				setState(219);
				match(RightParen);
				}
				((EndPointOfExpressionContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(Identifier);
				((EndPointOfExpressionContext)_localctx).path =  1;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				listOrFunctionAccess();
				((EndPointOfExpressionContext)_localctx).path =  2;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				listConstant();
				((EndPointOfExpressionContext)_localctx).path =  3;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(StringLiteral);
				((EndPointOfExpressionContext)_localctx).path =  4;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(IntegerConstant);
				((EndPointOfExpressionContext)_localctx).path =  5;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(CharacterConstant);
				((EndPointOfExpressionContext)_localctx).path =  6;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(Nil);
				((EndPointOfExpressionContext)_localctx).path =  7;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				match(NotPermittedCharacterConstant);
				((EndPointOfExpressionContext)_localctx).path =  8;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticConstantsContext extends ParserRuleContext {
		public List<TerminalNode> Plus() { return getTokens(XParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(XParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(XParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(XParser.Minus, i);
		}
		public List<TerminalNode> Star() { return getTokens(XParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(XParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(XParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(XParser.Div, i);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(XParser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(XParser.IntegerConstant, i);
		}
		public ArithmeticConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitArithmeticConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticConstantsContext arithmeticConstants() throws RecognitionException {
		ArithmeticConstantsContext _localctx = new ArithmeticConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithmeticConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerConstant) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerConstant) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public int path;
		public TerminalNode Assign() { return getToken(XParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListOrFunctionAccessContext listOrFunctionAccess() {
			return getRuleContext(ListOrFunctionAccessContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(248);
				listOrFunctionAccess();
				((AssignmentContext)_localctx).path =  0;
				}
				break;
			case 2:
				{
				setState(251);
				match(Identifier);
				((AssignmentContext)_localctx).path =  1;
				}
				break;
			}
			setState(255);
			match(Assign);
			setState(256);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOrFunctionAccessContext extends ParserRuleContext {
		public int path;
		public LeftPositionOfAccessContext leftPositionOfAccess() {
			return getRuleContext(LeftPositionOfAccessContext.class,0);
		}
		public List<RightPositionOfAccessContext> rightPositionOfAccess() {
			return getRuleContexts(RightPositionOfAccessContext.class);
		}
		public RightPositionOfAccessContext rightPositionOfAccess(int i) {
			return getRuleContext(RightPositionOfAccessContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ListOrFunctionAccessContext listOrFunctionAccess() {
			return getRuleContext(ListOrFunctionAccessContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public ListOrFunctionAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOrFunctionAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitListOrFunctionAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOrFunctionAccessContext listOrFunctionAccess() throws RecognitionException {
		ListOrFunctionAccessContext _localctx = new ListOrFunctionAccessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listOrFunctionAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				{
				setState(258);
				match(LeftParen);
				setState(259);
				listOrFunctionAccess();
				setState(260);
				match(RightParen);
				}
				((ListOrFunctionAccessContext)_localctx).path =  0;
				}
				break;
			case LeftBracket:
			case StringLiteral:
			case Identifier:
				{
				setState(264);
				leftPositionOfAccess();
				((ListOrFunctionAccessContext)_localctx).path =  1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				rightPositionOfAccess();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumberSign) | (1L << LeftParen) | (1L << Dot))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftPositionOfAccessContext extends ParserRuleContext {
		public int path;
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(XParser.StringLiteral, 0); }
		public ListConstantContext listConstant() {
			return getRuleContext(ListConstantContext.class,0);
		}
		public LeftPositionOfAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftPositionOfAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitLeftPositionOfAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftPositionOfAccessContext leftPositionOfAccess() throws RecognitionException {
		LeftPositionOfAccessContext _localctx = new LeftPositionOfAccessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leftPositionOfAccess);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Identifier);
				((LeftPositionOfAccessContext)_localctx).path =  0;
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(StringLiteral);
				((LeftPositionOfAccessContext)_localctx).path =  1;
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				listConstant();
				((LeftPositionOfAccessContext)_localctx).path =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightPositionOfAccessContext extends ParserRuleContext {
		public int path;
		public IdentifierAccessContext identifierAccess() {
			return getRuleContext(IdentifierAccessContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public FunctionAccessContext functionAccess() {
			return getRuleContext(FunctionAccessContext.class,0);
		}
		public RightPositionOfAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPositionOfAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitRightPositionOfAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightPositionOfAccessContext rightPositionOfAccess() throws RecognitionException {
		RightPositionOfAccessContext _localctx = new RightPositionOfAccessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rightPositionOfAccess);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				identifierAccess();
				((RightPositionOfAccessContext)_localctx).path =  0;
				}
				break;
			case NumberSign:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				indexAccess();
				((RightPositionOfAccessContext)_localctx).path =  1;
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				functionAccess();
				((RightPositionOfAccessContext)_localctx).path =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierAccessContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(XParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public IdentifierAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitIdentifierAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierAccessContext identifierAccess() throws RecognitionException {
		IdentifierAccessContext _localctx = new IdentifierAccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifierAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Dot);
			setState(295);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessContext extends ParserRuleContext {
		public int path;
		public TerminalNode NumberSign() { return getToken(XParser.NumberSign, 0); }
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode IntegerConstant() { return getToken(XParser.IntegerConstant, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ArithmeticConstantsContext arithmeticConstants() {
			return getRuleContext(ArithmeticConstantsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(NumberSign);
			setState(308);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(298);
				match(Identifier);
				((IndexAccessContext)_localctx).path =  0;
				}
				break;
			case IntegerConstant:
				{
				setState(300);
				match(IntegerConstant);
				((IndexAccessContext)_localctx).path =  1;
				}
				break;
			case LeftParen:
				{
				{
				setState(302);
				match(LeftParen);
				setState(303);
				arithmeticConstants();
				setState(304);
				match(RightParen);
				}
				((IndexAccessContext)_localctx).path =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionAccessContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public FunctionAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAccessContext functionAccess() throws RecognitionException {
		FunctionAccessContext _localctx = new FunctionAccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionAccess);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LeftParen);
			setState(320);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerConstant) | (1L << CharacterConstant) | (1L << Nil) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Minus) | (1L << Not) | (1L << StringLiteral) | (1L << NotPermittedCharacterConstant) | (1L << Identifier))) != 0)) {
				{
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						expression();
						setState(312);
						match(Comma);
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(319);
				expression();
				}
			}

			setState(322);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListConstantContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(XParser.LeftBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(XParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public ListConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitListConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListConstantContext listConstant() throws RecognitionException {
		ListConstantContext _localctx = new ListConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listConstant);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(LeftBracket);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					expression();
					setState(326);
					match(Comma);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(333);
			expression();
			setState(334);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeForwardDeclarationContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(XParser.Typedef, 0); }
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(XParser.Semi, 0); }
		public TypeForwardDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeForwardDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitTypeForwardDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeForwardDeclarationContext typeForwardDeclaration() throws RecognitionException {
		TypeForwardDeclarationContext _localctx = new TypeForwardDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeForwardDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(Typedef);
			setState(337);
			typedefName();
			setState(338);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(XParser.Typedef, 0); }
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TerminalNode As() { return getToken(XParser.As, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(XParser.Semi, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(Typedef);
			setState(341);
			typedefName();
			setState(342);
			match(As);
			setState(343);
			type();
			setState(344);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerToFunctionContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(XParser.Less, 0); }
		public TerminalNode Arrow() { return getToken(XParser.Arrow, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Greater() { return getToken(XParser.Greater, 0); }
		public PtfInputsContext ptfInputs() {
			return getRuleContext(PtfInputsContext.class,0);
		}
		public PointerToFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerToFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitPointerToFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerToFunctionContext pointerToFunction() throws RecognitionException {
		PointerToFunctionContext _localctx = new PointerToFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pointerToFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Less);
			{
			setState(347);
			ptfInputs();
			}
			setState(348);
			match(Arrow);
			setState(349);
			type();
			setState(350);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtfInputsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(XParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(XParser.Star, i);
		}
		public PtfInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptfInputs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitPtfInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtfInputsContext ptfInputs() throws RecognitionException {
		PtfInputsContext _localctx = new PtfInputsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ptfInputs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					type();
					setState(353);
					match(Star);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(360);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalListDefinitionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(XParser.LeftBracket, 0); }
		public ListAttributesContext listAttributes() {
			return getRuleContext(ListAttributesContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(XParser.RightBracket, 0); }
		public NormalListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalListDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitNormalListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalListDefinitionContext normalListDefinition() throws RecognitionException {
		NormalListDefinitionContext _localctx = new NormalListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_normalListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(LeftBracket);
			setState(363);
			listAttributes();
			setState(364);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialListDefinitionContext extends ParserRuleContext {
		public boolean isString;
		public TerminalNode List() { return getToken(XParser.List, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ArithmeticConstantsContext arithmeticConstants() {
			return getRuleContext(ArithmeticConstantsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public TerminalNode Of() { return getToken(XParser.Of, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode String() { return getToken(XParser.String, 0); }
		public SpecialListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialListDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitSpecialListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialListDefinitionContext specialListDefinition() throws RecognitionException {
		SpecialListDefinitionContext _localctx = new SpecialListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specialListDefinition);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case List:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(366);
				match(List);
				setState(367);
				match(LeftParen);
				setState(368);
				arithmeticConstants();
				setState(369);
				match(RightParen);
				setState(370);
				match(Of);
				setState(371);
				type();
				}
				((SpecialListDefinitionContext)_localctx).isString =  false;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(375);
				match(String);
				setState(376);
				match(LeftParen);
				setState(377);
				arithmeticConstants();
				setState(378);
				match(RightParen);
				}
				((SpecialListDefinitionContext)_localctx).isString =  true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDefinitionContext extends ParserRuleContext {
		public NormalListDefinitionContext normalListDefinition() {
			return getRuleContext(NormalListDefinitionContext.class,0);
		}
		public SpecialListDefinitionContext specialListDefinition() {
			return getRuleContext(SpecialListDefinitionContext.class,0);
		}
		public ListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefinitionContext listDefinition() throws RecognitionException {
		ListDefinitionContext _localctx = new ListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listDefinition);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				normalListDefinition();
				}
				break;
			case String:
			case List:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				specialListDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListAttributesContext extends ParserRuleContext {
		public List<ListAttributeContext> listAttribute() {
			return getRuleContexts(ListAttributeContext.class);
		}
		public ListAttributeContext listAttribute(int i) {
			return getRuleContext(ListAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public ListAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAttributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitListAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAttributesContext listAttributes() throws RecognitionException {
		ListAttributesContext _localctx = new ListAttributesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					listAttribute();
					setState(389);
					match(Comma);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(396);
			listAttribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListAttributeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(XParser.Colon, 0); }
		public ListAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitListAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAttributeContext listAttribute() throws RecognitionException {
		ListAttributeContext _localctx = new ListAttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listAttribute);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(Identifier);
				setState(400);
				match(Colon);
				setState(401);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionForwardDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationHeaderContext functionDeclarationHeader() {
			return getRuleContext(FunctionDeclarationHeaderContext.class,0);
		}
		public TerminalNode Semi() { return getToken(XParser.Semi, 0); }
		public FunctionForwardDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionForwardDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionForwardDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionForwardDeclarationContext functionForwardDeclaration() throws RecognitionException {
		FunctionForwardDeclarationContext _localctx = new FunctionForwardDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionForwardDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			functionDeclarationHeader();
			setState(405);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			functionHeader();
			setState(408);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeaderContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public FunctionInputsContext functionInputs() {
			return getRuleContext(FunctionInputsContext.class,0);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			type();
			setState(411);
			functionName();
			setState(412);
			match(LeftParen);
			setState(414);
			_la = _input.LA(1);
			if (_la==DollarSign || _la==Identifier) {
				{
				setState(413);
				functionInputs();
				}
			}

			setState(416);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationHeaderContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public FunctionDeclarationInputsContext functionDeclarationInputs() {
			return getRuleContext(FunctionDeclarationInputsContext.class,0);
		}
		public FunctionDeclarationHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionDeclarationHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationHeaderContext functionDeclarationHeader() throws RecognitionException {
		FunctionDeclarationHeaderContext _localctx = new FunctionDeclarationHeaderContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionDeclarationHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			type();
			setState(419);
			functionName();
			setState(420);
			match(LeftParen);
			setState(422);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Int) | (1L << Char) | (1L << String) | (1L << List) | (1L << DollarSign) | (1L << LeftBracket) | (1L << Less) | (1L << Identifier))) != 0)) {
				{
				setState(421);
				functionDeclarationInputs();
				}
			}

			setState(424);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInputsContext extends ParserRuleContext {
		public List<FunctionInputContext> functionInput() {
			return getRuleContexts(FunctionInputContext.class);
		}
		public FunctionInputContext functionInput(int i) {
			return getRuleContext(FunctionInputContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public FunctionInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInputs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInputsContext functionInputs() throws RecognitionException {
		FunctionInputsContext _localctx = new FunctionInputsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionInputs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(428);
					functionInput();
					setState(429);
					match(Comma);
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(436);
			functionInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInputContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(XParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DollarSign() { return getToken(XParser.DollarSign, 0); }
		public FunctionInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInputContext functionInput() throws RecognitionException {
		FunctionInputContext _localctx = new FunctionInputContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if (_la==DollarSign) {
				{
				setState(438);
				match(DollarSign);
				}
			}

			setState(441);
			match(Identifier);
			setState(442);
			match(Colon);
			setState(443);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationInputsContext extends ParserRuleContext {
		public List<FunctionDeclarationInputContext> functionDeclarationInput() {
			return getRuleContexts(FunctionDeclarationInputContext.class);
		}
		public FunctionDeclarationInputContext functionDeclarationInput(int i) {
			return getRuleContext(FunctionDeclarationInputContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(XParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XParser.Comma, i);
		}
		public FunctionDeclarationInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationInputs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionDeclarationInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationInputsContext functionDeclarationInputs() throws RecognitionException {
		FunctionDeclarationInputsContext _localctx = new FunctionDeclarationInputsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionDeclarationInputs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(445);
					functionDeclarationInput();
					setState(446);
					match(Comma);
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(453);
			functionDeclarationInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationInputContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(XParser.Colon, 0); }
		public TerminalNode DollarSign() { return getToken(XParser.DollarSign, 0); }
		public FunctionDeclarationInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionDeclarationInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationInputContext functionDeclarationInput() throws RecognitionException {
		FunctionDeclarationInputContext _localctx = new FunctionDeclarationInputContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionDeclarationInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(456);
				_la = _input.LA(1);
				if (_la==DollarSign) {
					{
					setState(455);
					match(DollarSign);
					}
				}

				setState(458);
				match(Identifier);
				setState(459);
				match(Colon);
				}
				break;
			}
			setState(462);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ListDefinitionContext listDefinition() {
			return getRuleContext(ListDefinitionContext.class,0);
		}
		public PointerToFunctionContext pointerToFunction() {
			return getRuleContext(PointerToFunctionContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type);
		try {
			setState(468);
			switch (_input.LA(1)) {
			case Void:
			case Int:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				primitive();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				typedefName();
				}
				break;
			case String:
			case List:
			case LeftBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				listDefinition();
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				pointerToFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public String primitiveType;
		public TerminalNode Void() { return getToken(XParser.Void, 0); }
		public TerminalNode Char() { return getToken(XParser.Char, 0); }
		public TerminalNode Int() { return getToken(XParser.Int, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitive);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(Void);
				((PrimitiveContext)_localctx).primitiveType =  "void";
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(Char);
				((PrimitiveContext)_localctx).primitiveType =  "char";
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(Int);
				((PrimitiveContext)_localctx).primitiveType =  "int";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public int path;
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case IntegerConstant:
			case CharacterConstant:
			case Return:
			case Void:
			case Int:
			case Char:
			case String:
			case While:
			case Break:
			case Nil:
			case List:
			case Foreach:
			case LeftParen:
			case LeftBracket:
			case Less:
			case Minus:
			case Not:
			case Semi:
			case StringLiteral:
			case NotPermittedCharacterConstant:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				simpleStatement();
				((StatementContext)_localctx).path =  0;
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				ifStatement();
				((StatementContext)_localctx).path =  1;
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				block();
				((StatementContext)_localctx).path =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public int path;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(XParser.Semi, 0); }
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TerminalNode Return() { return getToken(XParser.Return, 0); }
		public TerminalNode Break() { return getToken(XParser.Break, 0); }
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simpleStatement);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				expression();
				setState(494);
				match(Semi);
				}
				((SimpleStatementContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				variableDefinition();
				((SimpleStatementContext)_localctx).path =  1;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				whileStatement();
				((SimpleStatementContext)_localctx).path =  2;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				foreachStatement();
				((SimpleStatementContext)_localctx).path =  3;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(507);
				match(Return);
				setState(509);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerConstant) | (1L << CharacterConstant) | (1L << Nil) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Minus) | (1L << Not) | (1L << StringLiteral) | (1L << NotPermittedCharacterConstant) | (1L << Identifier))) != 0)) {
					{
					setState(508);
					expression();
					}
				}

				setState(511);
				match(Semi);
				}
				((SimpleStatementContext)_localctx).path =  4;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				match(Semi);
				((SimpleStatementContext)_localctx).path =  5;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(516);
				match(Break);
				setState(517);
				match(Semi);
				}
				((SimpleStatementContext)_localctx).path =  6;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWitIfElseNotIfContext extends ParserRuleContext {
		public int path;
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementWitIfElseNotIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWitIfElseNotIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitStatementWitIfElseNotIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWitIfElseNotIfContext statementWitIfElseNotIf() throws RecognitionException {
		StatementWitIfElseNotIfContext _localctx = new StatementWitIfElseNotIfContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statementWitIfElseNotIf);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case IntegerConstant:
			case CharacterConstant:
			case Return:
			case Void:
			case Int:
			case Char:
			case String:
			case While:
			case Break:
			case Nil:
			case List:
			case Foreach:
			case LeftParen:
			case LeftBracket:
			case Less:
			case Minus:
			case Not:
			case Semi:
			case StringLiteral:
			case NotPermittedCharacterConstant:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				simpleStatement();
				((StatementWitIfElseNotIfContext)_localctx).path =  0;
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				ifElse();
				((StatementWitIfElseNotIfContext)_localctx).path =  1;
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				block();
				((StatementWitIfElseNotIfContext)_localctx).path =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(XParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(XParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			match(LeftBrace);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerConstant) | (1L << CharacterConstant) | (1L << Return) | (1L << If) | (1L << Void) | (1L << Int) | (1L << Char) | (1L << String) | (1L << While) | (1L << Break) | (1L << Nil) | (1L << List) | (1L << Foreach) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Less) | (1L << Minus) | (1L << Not) | (1L << Semi) | (1L << StringLiteral) | (1L << NotPermittedCharacterConstant) | (1L << Identifier))) != 0)) {
				{
				{
				setState(534);
				statement();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(RightBrace);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public int path;
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public IfGeneralContext ifGeneral() {
			return getRuleContext(IfGeneralContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifStatement);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				ifElse();
				((IfStatementContext)_localctx).path =  0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				ifGeneral();
				((IfStatementContext)_localctx).path =  1;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(XParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public TerminalNode Else() { return getToken(XParser.Else, 0); }
		public StatementWitIfElseNotIfContext statementWitIfElseNotIf() {
			return getRuleContext(StatementWitIfElseNotIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(If);
			setState(551);
			match(LeftParen);
			setState(552);
			expression();
			setState(553);
			match(RightParen);
			{
			setState(554);
			statementWitIfElseNotIf();
			}
			setState(555);
			match(Else);
			{
			setState(556);
			statement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfGeneralContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(XParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifGeneral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitIfGeneral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfGeneralContext ifGeneral() throws RecognitionException {
		IfGeneralContext _localctx = new IfGeneralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifGeneral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(If);
			setState(559);
			match(LeftParen);
			setState(560);
			expression();
			setState(561);
			match(RightParen);
			{
			setState(562);
			statement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(XParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(While);
			setState(565);
			match(LeftParen);
			setState(566);
			expression();
			setState(567);
			match(RightParen);
			{
			setState(568);
			statement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(XParser.Foreach, 0); }
		public TerminalNode LeftParen() { return getToken(XParser.LeftParen, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(XParser.Identifier, 0); }
		public TerminalNode In() { return getToken(XParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(XParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XVisitor ) return ((XVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(Foreach);
			setState(571);
			match(LeftParen);
			setState(572);
			type();
			setState(573);
			match(Identifier);
			setState(574);
			match(In);
			setState(575);
			expression();
			setState(576);
			match(RightParen);
			{
			setState(577);
			statement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0246\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\3\3\3\3\3\3\5\3v\n\3"+
		"\3\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a4\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00c5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00da\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00f4\n\r\3\16\6\16\u00f7\n\16\r\16\16\16\u00f8\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0100\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u010e\n\20\3\20\6\20\u0111\n\20\r\20\16\20\u0112"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011c\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0127\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0137\n\24\3\25\3\25\3\25"+
		"\3\25\7\25\u013d\n\25\f\25\16\25\u0140\13\25\3\25\5\25\u0143\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\7\26\u014b\n\26\f\26\16\26\u014e\13\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0166\n\32\f\32\16\32\u0169\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0181\n\34\3\35\3\35"+
		"\5\35\u0185\n\35\3\36\3\36\3\36\7\36\u018a\n\36\f\36\16\36\u018d\13\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0195\n\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\5\"\u01a1\n\"\3\"\3\"\3#\3#\3#\3#\5#\u01a9\n#\3#\3#\3$\3$\3"+
		"%\3%\3%\7%\u01b2\n%\f%\16%\u01b5\13%\3%\3%\3&\5&\u01ba\n&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\7\'\u01c3\n\'\f\'\16\'\u01c6\13\'\3\'\3\'\3(\5(\u01cb\n("+
		"\3(\3(\5(\u01cf\n(\3(\3(\3)\3)\3)\3)\5)\u01d7\n)\3*\3*\3*\3*\3*\3*\5*"+
		"\u01df\n*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01ee\n-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0200\n.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u020b\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0216\n/\3\60\3\60"+
		"\7\60\u021a\n\60\f\60\16\60\u021d\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0227\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\b\3\2-."+
		"\3\2 !\3\2\"#\3\2$%\4\2##((\4\2\3\3\"%\u0253\2m\3\2\2\2\4u\3\2\2\2\6w"+
		"\3\2\2\2\b\u008a\3\2\2\2\n\u0098\3\2\2\2\f\u00a3\3\2\2\2\16\u00ae\3\2"+
		"\2\2\20\u00b9\3\2\2\2\22\u00c4\3\2\2\2\24\u00cf\3\2\2\2\26\u00d9\3\2\2"+
		"\2\30\u00f3\3\2\2\2\32\u00f6\3\2\2\2\34\u00ff\3\2\2\2\36\u010d\3\2\2\2"+
		" \u011b\3\2\2\2\"\u0126\3\2\2\2$\u0128\3\2\2\2&\u012b\3\2\2\2(\u0138\3"+
		"\2\2\2*\u0146\3\2\2\2,\u0152\3\2\2\2.\u0156\3\2\2\2\60\u015c\3\2\2\2\62"+
		"\u0167\3\2\2\2\64\u016c\3\2\2\2\66\u0180\3\2\2\28\u0184\3\2\2\2:\u018b"+
		"\3\2\2\2<\u0194\3\2\2\2>\u0196\3\2\2\2@\u0199\3\2\2\2B\u019c\3\2\2\2D"+
		"\u01a4\3\2\2\2F\u01ac\3\2\2\2H\u01b3\3\2\2\2J\u01b9\3\2\2\2L\u01c4\3\2"+
		"\2\2N\u01ce\3\2\2\2P\u01d6\3\2\2\2R\u01de\3\2\2\2T\u01e0\3\2\2\2V\u01e2"+
		"\3\2\2\2X\u01ed\3\2\2\2Z\u020a\3\2\2\2\\\u0215\3\2\2\2^\u0217\3\2\2\2"+
		"`\u0226\3\2\2\2b\u0228\3\2\2\2d\u0230\3\2\2\2f\u0236\3\2\2\2h\u023c\3"+
		"\2\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\3\3\2\2\2om"+
		"\3\2\2\2pv\5,\27\2qv\5.\30\2rv\5\6\4\2sv\5> \2tv\5@!\2up\3\2\2\2uq\3\2"+
		"\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\5\3\2\2\2w}\5P)\2xy\5\b\5\2yz\7+\2"+
		"\2z|\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177}\3\2\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7*\2\2\u0082\7\3\2\2\2\u0083"+
		"\u0084\7\63\2\2\u0084\u008b\b\5\1\2\u0085\u0086\7\63\2\2\u0086\u0087\7"+
		",\2\2\u0087\u0088\5\n\6\2\u0088\u0089\b\5\1\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0083\3\2\2\2\u008a\u0085\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d\5\34\17"+
		"\2\u008d\u008e\b\6\1\2\u008e\u0099\3\2\2\2\u008f\u0090\5\f\7\2\u0090\u0091"+
		"\7\'\2\2\u0091\u0092\5\n\6\2\u0092\u0093\3\2\2\2\u0093\u0094\b\6\1\2\u0094"+
		"\u0099\3\2\2\2\u0095\u0096\5\f\7\2\u0096\u0097\b\6\1\2\u0097\u0099\3\2"+
		"\2\2\u0098\u008c\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0095\3\2\2\2\u0099"+
		"\13\3\2\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7&\2\2\u009c\u009d\5\f\7"+
		"\2\u009d\u009e\3\2\2\2\u009e\u009f\b\7\1\2\u009f\u00a4\3\2\2\2\u00a0\u00a1"+
		"\5\16\b\2\u00a1\u00a2\b\7\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009a\3\2\2\2"+
		"\u00a3\u00a0\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00a7"+
		"\t\2\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\b\1\2"+
		"\u00aa\u00af\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\b\b\1\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\17\3\2\2\2\u00b0"+
		"\u00b1\5\22\n\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\b\t\1\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\5\22\n\2\u00b7"+
		"\u00b8\b\t\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\t\4\2\2\u00bd"+
		"\u00be\5\22\n\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\n\1\2\u00c0\u00c5\3"+
		"\2\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\b\n\1\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\5\26\f"+
		"\2\u00c7\u00c8\t\5\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\b\13\1\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\b"+
		"\13\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\25\3\2\2\2\u00d1\u00d2\t\6\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d5\b\f\1\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5\30\r\2\u00d7"+
		"\u00d8\b\f\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00da\27\3\2\2\2\u00db\u00dc\7\32\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de"+
		"\7\33\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\r\1\2\u00e0\u00f4\3\2\2\2"+
		"\u00e1\u00e2\7\63\2\2\u00e2\u00f4\b\r\1\2\u00e3\u00e4\5\36\20\2\u00e4"+
		"\u00e5\b\r\1\2\u00e5\u00f4\3\2\2\2\u00e6\u00e7\5*\26\2\u00e7\u00e8\b\r"+
		"\1\2\u00e8\u00f4\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00f4\b\r\1\2\u00eb"+
		"\u00ec\7\3\2\2\u00ec\u00f4\b\r\1\2\u00ed\u00ee\7\4\2\2\u00ee\u00f4\b\r"+
		"\1\2\u00ef\u00f0\7\20\2\2\u00f0\u00f4\b\r\1\2\u00f1\u00f2\7\62\2\2\u00f2"+
		"\u00f4\b\r\1\2\u00f3\u00db\3\2\2\2\u00f3\u00e1\3\2\2\2\u00f3\u00e3\3\2"+
		"\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3"+
		"\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\31\3\2\2"+
		"\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\33\3\2\2\2\u00fa\u00fb\5\36\20\2\u00fb"+
		"\u00fc\b\17\1\2\u00fc\u0100\3\2\2\2\u00fd\u00fe\7\63\2\2\u00fe\u0100\b"+
		"\17\1\2\u00ff\u00fa\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7,\2\2\u0102\u0103\5\n\6\2\u0103\35\3\2\2\2\u0104\u0105\7\32\2"+
		"\2\u0105\u0106\5\36\20\2\u0106\u0107\7\33\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\b\20\1\2\u0109\u010e\3\2\2\2\u010a\u010b\5 \21\2\u010b\u010c\b"+
		"\20\1\2\u010c\u010e\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u010a\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\5\"\22\2\u0110\u010f\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114"+
		"\u0115\7\63\2\2\u0115\u011c\b\21\1\2\u0116\u0117\7\61\2\2\u0117\u011c"+
		"\b\21\1\2\u0118\u0119\5*\26\2\u0119\u011a\b\21\1\2\u011a\u011c\3\2\2\2"+
		"\u011b\u0114\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0118\3\2\2\2\u011c!\3"+
		"\2\2\2\u011d\u011e\5$\23\2\u011e\u011f\b\22\1\2\u011f\u0127\3\2\2\2\u0120"+
		"\u0121\5&\24\2\u0121\u0122\b\22\1\2\u0122\u0127\3\2\2\2\u0123\u0124\5"+
		"(\25\2\u0124\u0125\b\22\1\2\u0125\u0127\3\2\2\2\u0126\u011d\3\2\2\2\u0126"+
		"\u0120\3\2\2\2\u0126\u0123\3\2\2\2\u0127#\3\2\2\2\u0128\u0129\7\60\2\2"+
		"\u0129\u012a\7\63\2\2\u012a%\3\2\2\2\u012b\u0136\7\21\2\2\u012c\u012d"+
		"\7\63\2\2\u012d\u0137\b\24\1\2\u012e\u012f\7\3\2\2\u012f\u0137\b\24\1"+
		"\2\u0130\u0131\7\32\2\2\u0131\u0132\5\32\16\2\u0132\u0133\7\33\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\b\24\1\2\u0135\u0137\3\2\2\2\u0136\u012c\3"+
		"\2\2\2\u0136\u012e\3\2\2\2\u0136\u0130\3\2\2\2\u0137\'\3\2\2\2\u0138\u0142"+
		"\7\32\2\2\u0139\u013a\5\n\6\2\u013a\u013b\7+\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5\n\6\2\u0142"+
		"\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\33"+
		"\2\2\u0145)\3\2\2\2\u0146\u014c\7\34\2\2\u0147\u0148\5\n\6\2\u0148\u0149"+
		"\7+\2\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0150\5\n\6\2\u0150\u0151\7\35\2\2\u0151+\3\2\2\2\u0152\u0153"+
		"\7\5\2\2\u0153\u0154\5V,\2\u0154\u0155\7*\2\2\u0155-\3\2\2\2\u0156\u0157"+
		"\7\5\2\2\u0157\u0158\5V,\2\u0158\u0159\7\24\2\2\u0159\u015a\5P)\2\u015a"+
		"\u015b\7*\2\2\u015b/\3\2\2\2\u015c\u015d\7 \2\2\u015d\u015e\5\62\32\2"+
		"\u015e\u015f\7/\2\2\u015f\u0160\5P)\2\u0160\u0161\7!\2\2\u0161\61\3\2"+
		"\2\2\u0162\u0163\5P)\2\u0163\u0164\7$\2\2\u0164\u0166\3\2\2\2\u0165\u0162"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5P)\2\u016b\63\3\2\2\2"+
		"\u016c\u016d\7\34\2\2\u016d\u016e\5:\36\2\u016e\u016f\7\35\2\2\u016f\65"+
		"\3\2\2\2\u0170\u0171\7\25\2\2\u0171\u0172\7\32\2\2\u0172\u0173\5\32\16"+
		"\2\u0173\u0174\7\33\2\2\u0174\u0175\7\22\2\2\u0175\u0176\5P)\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0178\b\34\1\2\u0178\u0181\3\2\2\2\u0179\u017a\7\r\2\2"+
		"\u017a\u017b\7\32\2\2\u017b\u017c\5\32\16\2\u017c\u017d\7\33\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\b\34\1\2\u017f\u0181\3\2\2\2\u0180\u0170\3"+
		"\2\2\2\u0180\u0179\3\2\2\2\u0181\67\3\2\2\2\u0182\u0185\5\64\33\2\u0183"+
		"\u0185\5\66\34\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u01859\3\2\2"+
		"\2\u0186\u0187\5<\37\2\u0187\u0188\7+\2\2\u0188\u018a\3\2\2\2\u0189\u0186"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\5<\37\2\u018f;\3\2\2\2"+
		"\u0190\u0195\5P)\2\u0191\u0192\7\63\2\2\u0192\u0193\7)\2\2\u0193\u0195"+
		"\5P)\2\u0194\u0190\3\2\2\2\u0194\u0191\3\2\2\2\u0195=\3\2\2\2\u0196\u0197"+
		"\5D#\2\u0197\u0198\7*\2\2\u0198?\3\2\2\2\u0199\u019a\5B\"\2\u019a\u019b"+
		"\5F$\2\u019bA\3\2\2\2\u019c\u019d\5P)\2\u019d\u019e\5T+\2\u019e\u01a0"+
		"\7\32\2\2\u019f\u01a1\5H%\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\7\33\2\2\u01a3C\3\2\2\2\u01a4\u01a5\5P)\2\u01a5"+
		"\u01a6\5T+\2\u01a6\u01a8\7\32\2\2\u01a7\u01a9\5L\'\2\u01a8\u01a7\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7\33\2\2\u01ab"+
		"E\3\2\2\2\u01ac\u01ad\5^\60\2\u01adG\3\2\2\2\u01ae\u01af\5J&\2\u01af\u01b0"+
		"\7+\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b7\5J&\2\u01b7I\3\2\2\2\u01b8\u01ba\7\31\2\2\u01b9\u01b8"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7\63\2\2"+
		"\u01bc\u01bd\7)\2\2\u01bd\u01be\5P)\2\u01beK\3\2\2\2\u01bf\u01c0\5N(\2"+
		"\u01c0\u01c1\7+\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\5N(\2\u01c8M\3\2\2\2\u01c9\u01cb\7\31\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\63"+
		"\2\2\u01cd\u01cf\7)\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\5P)\2\u01d1O\3\2\2\2\u01d2\u01d7\5R*\2\u01d3"+
		"\u01d7\5V,\2\u01d4\u01d7\58\35\2\u01d5\u01d7\5\60\31\2\u01d6\u01d2\3\2"+
		"\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"Q\3\2\2\2\u01d8\u01d9\7\n\2\2\u01d9\u01df\b*\1\2\u01da\u01db\7\f\2\2\u01db"+
		"\u01df\b*\1\2\u01dc\u01dd\7\13\2\2\u01dd\u01df\b*\1\2\u01de\u01d8\3\2"+
		"\2\2\u01de\u01da\3\2\2\2\u01de\u01dc\3\2\2\2\u01dfS\3\2\2\2\u01e0\u01e1"+
		"\7\63\2\2\u01e1U\3\2\2\2\u01e2\u01e3\7\63\2\2\u01e3W\3\2\2\2\u01e4\u01e5"+
		"\5Z.\2\u01e5\u01e6\b-\1\2\u01e6\u01ee\3\2\2\2\u01e7\u01e8\5`\61\2\u01e8"+
		"\u01e9\b-\1\2\u01e9\u01ee\3\2\2\2\u01ea\u01eb\5^\60\2\u01eb\u01ec\b-\1"+
		"\2\u01ec\u01ee\3\2\2\2\u01ed\u01e4\3\2\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01ea"+
		"\3\2\2\2\u01eeY\3\2\2\2\u01ef\u01f0\5\n\6\2\u01f0\u01f1\7*\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\b.\1\2\u01f3\u020b\3\2\2\2\u01f4\u01f5\5\6\4\2\u01f5"+
		"\u01f6\b.\1\2\u01f6\u020b\3\2\2\2\u01f7\u01f8\5f\64\2\u01f8\u01f9\b.\1"+
		"\2\u01f9\u020b\3\2\2\2\u01fa\u01fb\5h\65\2\u01fb\u01fc\b.\1\2\u01fc\u020b"+
		"\3\2\2\2\u01fd\u01ff\7\6\2\2\u01fe\u0200\5\n\6\2\u01ff\u01fe\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7*\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u020b\b.\1\2\u0204\u0205\7*\2\2\u0205\u020b\b.\1\2\u0206\u0207"+
		"\7\17\2\2\u0207\u0208\7*\2\2\u0208\u0209\3\2\2\2\u0209\u020b\b.\1\2\u020a"+
		"\u01ef\3\2\2\2\u020a\u01f4\3\2\2\2\u020a\u01f7\3\2\2\2\u020a\u01fa\3\2"+
		"\2\2\u020a\u01fd\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0206\3\2\2\2\u020b"+
		"[\3\2\2\2\u020c\u020d\5Z.\2\u020d\u020e\b/\1\2\u020e\u0216\3\2\2\2\u020f"+
		"\u0210\5b\62\2\u0210\u0211\b/\1\2\u0211\u0216\3\2\2\2\u0212\u0213\5^\60"+
		"\2\u0213\u0214\b/\1\2\u0214\u0216\3\2\2\2\u0215\u020c\3\2\2\2\u0215\u020f"+
		"\3\2\2\2\u0215\u0212\3\2\2\2\u0216]\3\2\2\2\u0217\u021b\7\36\2\2\u0218"+
		"\u021a\5X-\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2"+
		"\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f"+
		"\7\37\2\2\u021f_\3\2\2\2\u0220\u0221\5b\62\2\u0221\u0222\b\61\1\2\u0222"+
		"\u0227\3\2\2\2\u0223\u0224\5d\63\2\u0224\u0225\b\61\1\2\u0225\u0227\3"+
		"\2\2\2\u0226\u0220\3\2\2\2\u0226\u0223\3\2\2\2\u0227a\3\2\2\2\u0228\u0229"+
		"\7\7\2\2\u0229\u022a\7\32\2\2\u022a\u022b\5\n\6\2\u022b\u022c\7\33\2\2"+
		"\u022c\u022d\5\\/\2\u022d\u022e\7\b\2\2\u022e\u022f\5X-\2\u022fc\3\2\2"+
		"\2\u0230\u0231\7\7\2\2\u0231\u0232\7\32\2\2\u0232\u0233\5\n\6\2\u0233"+
		"\u0234\7\33\2\2\u0234\u0235\5X-\2\u0235e\3\2\2\2\u0236\u0237\7\16\2\2"+
		"\u0237\u0238\7\32\2\2\u0238\u0239\5\n\6\2\u0239\u023a\7\33\2\2\u023a\u023b"+
		"\5X-\2\u023bg\3\2\2\2\u023c\u023d\7\26\2\2\u023d\u023e\7\32\2\2\u023e"+
		"\u023f\5P)\2\u023f\u0240\7\63\2\2\u0240\u0241\7\23\2\2\u0241\u0242\5\n"+
		"\6\2\u0242\u0243\7\33\2\2\u0243\u0244\5X-\2\u0244i\3\2\2\2,mu}\u008a\u0098"+
		"\u00a3\u00ae\u00b9\u00c4\u00cf\u00d9\u00f3\u00f8\u00ff\u010d\u0112\u011b"+
		"\u0126\u0136\u013e\u0142\u014c\u0167\u0180\u0184\u018b\u0194\u01a0\u01a8"+
		"\u01b3\u01b9\u01c4\u01ca\u01ce\u01d6\u01de\u01ed\u01ff\u020a\u0215\u021b"+
		"\u0226";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}