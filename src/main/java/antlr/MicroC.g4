grammar MicroC;

program : block;

block : CURLYOPEN ( statement )* CURLYCLOSE;


statement
    : block
    | varDeclaration
    | statementAssign
    | statementAssignRecord
    | statementIf
    | statementWhile
    | statementRead
    | statementWrite
    | statementBreak
    | statementContinue
    ;

statementAssign         : lhs=identifier COLON EQUAL rhs=expression SEMICOLON ;
statementAssignRecord   : lhs=identifier COLON EQUAL ROUNDOPEN fst=expression COMMA snd=expression ROUNDCLOSE SEMICOLON ;
statementIf             : IF ROUNDOPEN condition=expression ROUNDCLOSE ifBlock=block (ELSE elseBlock=block )? ;
statementWhile          : WHILE ROUNDOPEN condition=expression ROUNDCLOSE whileBlock=statement ;
statementRead           : READ var=identifier SEMICOLON;
statementWrite          : WRITE ex=expression SEMICOLON;
statementBreak          : BREAK SEMICOLON;
statementContinue       : CONTINUE SEMICOLON;

identifier
    : name=IDENT
    | name=IDENT SQUAREOPEN element=expression SQUARECLOSE
    | name=IDENT DOT FST
    | name=IDENT DOT SND
    ;

expression
     : expressionL
     | expressionA
     | expressionB;

expressionL
     : expressionIdentifier
     | expressionRecordFirst
     | expressionRecordSecond
     ;

expressionA
     : expressionL
     | expressionConstantInteger
     | lhs=expressionA op=operatorNumeric rhs=expressionA
     ;

expressionB
     : TRUE
     | FALSE
     | expressionCompare
     | lhs=expressionB op=operatorBool rhs=expressionB
     | NOT expressionB
     ;

expressionIdentifier      : ident=identifier ;
expressionRecordFirst     : ident=identifier DOT FST ;
expressionRecordSecond    : ident=identifier DOT SND ;
expressionConstantInteger : value=INT ;
expressionCompare : lhs=expressionA op=operatorCompare rhs=expressionA;

operatorNumeric
     : PLUS
     | MINUS
     | TIMES
     | DIVIDE
     | MODULU
     ;

operatorCompare
     : LESSTHAN
     | GREATERTHAN
     | LESSTHANOREQUAL
     | GREATERTHANOREQUAL
     | EQUALS
     | NOTEQUALS
     ;

operatorBool
     : AND
     | OR
     ;

varDeclaration : var=variable SEMICOLON;

variable : type variableName=IDENT
  ;

type
   : typeBasic
   | typeArray
   ;

typeBasic
  : typeInt
  | typeRecord
  ;

typeArray
    : typeBasic SQUAREOPEN value=expressionA SQUARECLOSE
    ;

typeInt : TYPEINT ;

typeRecord : CURLYOPEN TYPEINT FST SEMICOLON TYPEINT SND CURLYCLOSE ;


TYPEINT : 'int' ;
FST : 'fst';
SND : 'snd';

//Operators
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIVIDE : '/';
MODULU : '%';

LESSTHAN : '<' ;
GREATERTHAN : '>';
LESSTHANOREQUAL : LESSTHAN EQUAL;
GREATERTHANOREQUAL : GREATERTHAN EQUAL;
EQUALS : '==' ;
NOTEQUALS : '!=';
NOT : 'not' ;

AND : '&' ;
OR : '|';

SEMICOLON : ';' ;
COLON : ':';
EQUAL : '=' ;
DOT : '.' ;
COMMA : ',';

ROUNDOPEN : '(' ;
ROUNDCLOSE : ')' ;
SQUAREOPEN : '[' ;
SQUARECLOSE : ']' ;
CURLYOPEN : '{' ;
CURLYCLOSE : '}' ;

TRUE : 'true' ;
FALSE : 'false' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
READ : 'read' ;
WRITE : 'write' ;
BREAK : 'break' ;
CONTINUE : 'continue' ;

fragment LOWER : ('a'..'z');
fragment UPPER : ('A'..'Z');
fragment NONNULL : ('1'..'9');
fragment NUMBER : ('0' | NONNULL);
IDENT : ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )*;
INT : '0' | ( NONNULL NUMBER* );
WHITESPACE  :   [ \t\n\r]+ -> skip;