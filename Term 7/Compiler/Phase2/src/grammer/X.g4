grammar X;

program
    :   global*
    ;

global
    :   typeForwardDeclaration
    |   typeDefinition
    |   variableDefinition
    |   functionForwardDeclaration
    |   functionDefinition
    ;

variableDefinition
    :   type
        (variableNaming Comma)*
        variableNaming Semi
    ;

variableNaming returns [boolean haveExpression]
    :   Identifier {$haveExpression = false;}
    |   Identifier Assign expression {$haveExpression = true;}
    ;

expression returns[int path]
    :   assignment {$path = 0;}
    |   (andExpression op=OrOr expression) {$path = 1;}
    |   andExpression {$path = 2;}
    ;

andExpression returns[int path]
    :   (equivalentExpression op=AndAnd andExpression) {$path = 0;}
    |   equivalentExpression {$path = 1;}
    ;

equivalentExpression returns[int path]
    :   (compareExpression op=( Equal | NotEqual ) equivalentExpression) {$path = 0;}
    |   compareExpression {$path = 1;}
    ;

compareExpression returns[int path]
    :   (plusAndMinusExpression op=( Less | Greater ) compareExpression) {$path = 0;}
    |   plusAndMinusExpression {$path = 1;}
    ;

plusAndMinusExpression returns[int path]
    :   (mulAndDivExpression op=( Plus | Minus ) plusAndMinusExpression) {$path = 0;}
    |   mulAndDivExpression {$path = 1;}
    ;

mulAndDivExpression returns[int path]
    :   (unaryExpression op=( Star | Div ) mulAndDivExpression) {$path = 0;}
    |   unaryExpression {$path = 1;}
    ;


unaryExpression returns[int path]
    :   (op=(Minus | Not) unaryExpression) {$path = 0;}
    |   endPointOfExpression {$path = 1;}
    ;

endPointOfExpression returns[int path]
    :   (LeftParen expression RightParen) {$path = 0;}
    |   Identifier {$path = 1;}
    |   listOrFunctionAccess {$path = 2;}
    |   listConstant {$path = 3;}
    |   StringLiteral {$path = 4;}
    |   IntegerConstant {$path = 5;}
    |   CharacterConstant {$path = 6;}
    |   Nil {$path = 7;}
    |   NotPermittedCharacterConstant {$path = 8;}
    ;

arithmeticConstants : (Plus | Minus | Star | Div | IntegerConstant) +
    ;

assignment returns[int path]
    :   (listOrFunctionAccess {$path = 0;} | Identifier {$path = 1;}) Assign expression
    ;

listOrFunctionAccess returns[int path]
    :   ( (LeftParen listOrFunctionAccess RightParen) {$path = 0;} | leftPositionOfAccess {$path = 1;})
        ( rightPositionOfAccess ) +
    ;

leftPositionOfAccess returns[int path]
    :   Identifier {$path = 0;}
    |   StringLiteral {$path = 1;}
    |   listConstant {$path = 2;}
    ;

rightPositionOfAccess returns[int path]
    :   identifierAccess {$path = 0;}
    |   indexAccess {$path = 1;}
    |   functionAccess {$path = 2;}
    ;

identifierAccess
    : Dot Identifier
    ;

indexAccess returns[int path]
    : NumberSign (Identifier {$path = 0;} | IntegerConstant {$path = 1;} | (LeftParen arithmeticConstants RightParen ) {$path = 2;})
    ;

functionAccess
    :   LeftParen ((expression Comma)* expression)? RightParen
    ;

listConstant
    :   LeftBracket (expression Comma) * expression RightBracket
    ;

typeForwardDeclaration
    :   Typedef typedefName Semi
    ;

typeDefinition
    :   Typedef typedefName As type Semi
    ;

pointerToFunction
    :   Less (ptfInputs) Arrow type Greater
    ;

ptfInputs
    :   (type Star)* type
    ;

normalListDefinition
    :   LeftBracket listAttributes RightBracket
    ;

specialListDefinition returns [boolean isString]
    :   (List LeftParen arithmeticConstants RightParen Of type) {$isString = false;}
    |   (String LeftParen arithmeticConstants RightParen) {$isString = true;}
    ;

listDefinition
    :   normalListDefinition
    |   specialListDefinition
    ;

listAttributes
    :   (listAttribute Comma)* listAttribute
    ;

listAttribute
    :   type
    |   Identifier Colon type
    ;

functionForwardDeclaration
    :   functionDeclarationHeader Semi
    ;

functionDefinition
    :   functionHeader  functionBody
    ;

functionHeader
    :   type functionName LeftParen functionInputs? RightParen
    ;

functionDeclarationHeader
    :   type functionName LeftParen functionDeclarationInputs? RightParen
    ;

functionBody
    :   block
    ;

functionInputs
    :   (functionInput Comma)* functionInput
    ;

functionInput
    :   DollarSign? Identifier Colon type
    ;

functionDeclarationInputs
    :   (functionDeclarationInput Comma)* functionDeclarationInput
    ;

functionDeclarationInput
    :   (DollarSign? Identifier Colon)? type
    ;

type
    :   primitive
    |   typedefName
    |   listDefinition
    |   pointerToFunction
    ;

primitive returns[String primitiveType]
    : Void {$primitiveType = "void";}
    | Char {$primitiveType = "char";}
    | Int  {$primitiveType = "int";}
    ;

functionName
    :   Identifier
    ;

typedefName
    :   Identifier
    ;

statement returns[int path]
    :   simpleStatement {$path = 0;}
    |   ifStatement {$path = 1;}
    |   block {$path = 2;}
    ;

simpleStatement returns[int path]
    :   (expression Semi) {$path = 0;}
    |   variableDefinition {$path = 1;}
    |   whileStatement {$path = 2;}
    |   foreachStatement {$path = 3;}
    |   (Return (expression)? Semi) {$path = 4;}
    |   Semi {$path = 5;}
    |   (Break Semi) {$path = 6;}
    ;

statementWitIfElseNotIf returns[int path]
    :   simpleStatement {$path = 0;}
    |   ifElse {$path = 1;}
    |   block {$path = 2;}
    ;

block : (LeftBrace (statement)* RightBrace);

ifStatement returns[int path]
    :   ifElse {$path = 0;}
    |   ifGeneral {$path = 1;}
    ;

ifElse
    :   If LeftParen expression RightParen (statementWitIfElseNotIf)
        Else (statement)
    ;

ifGeneral
    :   If LeftParen expression RightParen (statement)
    ;


whileStatement
    :   While LeftParen expression RightParen (statement)
    ;

foreachStatement
    :   Foreach LeftParen
        type Identifier In expression
        RightParen  (statement)
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
IdentifierNondigit
    :   Nondigit
    ;

IntegerConstant
    :   (NonzeroDigit Digit*) | '0'
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Digit
    :   [0-9]
    ;

CharacterConstant
    :   '\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

Typedef : 'typedef';
Return : 'return';
If : 'if';
Else : 'else';
Size : 'size';
Void : 'void';
Int : 'int';
Char : 'char';
String : 'string';
While : 'while';
Break : 'break';
Nil : 'nil';
NumberSign : '#';

Of : 'of';
In : 'in';
As : 'as';
List : 'list';
Foreach : 'foreach';
Head : 'head';
Tail : 'tail';

DollarSign : '$';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
Greater : '>';

Plus : '+';
Minus : '-';
Star : '*';
Div : '/';

AndAnd : '&&';
OrOr : '||';
Not : '!';

Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';

StringLiteral
    :  '"' SCharSequence? '"'
    ;

NotPermittedCharacterConstant
    :  '\'' SCharSequence? '\''
    ;

Identifier
    :
        IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

// Skips
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r'
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;