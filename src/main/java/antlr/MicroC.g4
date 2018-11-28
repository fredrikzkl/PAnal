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
statementAssignRecord   : lhs=identifier COLON EQUAL ROUNDOPEN fst=expressionNumeric COMMA snd=expressionNumeric ROUNDCLOSE SEMICOLON ;
statementIf             : IF ROUNDOPEN condition=expressionBoolean ROUNDCLOSE ifBlock=block (ELSE elseBlock=block )? ;
statementWhile          : WHILE ROUNDOPEN condition=expressionBoolean ROUNDCLOSE whileBlock=block ;
statementRead           : READ var=identifier SEMICOLON;
statementWrite          : WRITE ex=expression SEMICOLON;
statementBreak          : BREAK SEMICOLON;
statementContinue       : CONTINUE SEMICOLON;

identifier
    : identifierInt
    | identifierArray
    | identifierRecordFst
    | identifierRecordSND
    ;

identifierInt       : name=IDENT;
identifierArray     : name=IDENT SQUAREOPEN element=expressionNumeric SQUARECLOSE;
identifierRecordFst : name=IDENT DOT FST;
identifierRecordSND : name=IDENT DOT SND;

expression
     : expressionNumeric
     | expressionBoolean
     ;

expressionNumeric
     : expressionIdentifier
     | expressionConstantInteger
     | lhs=expressionNumeric op=operatorNumeric rhs=expressionNumeric
     ;

expressionBoolean
     : TRUE
     | FALSE
     | expressionNumericCompare
     | eblhs=expressionBoolean op=operatorBool ebrhs=expressionBoolean
     | NOT nrhs=expressionBoolean
     ;

expressionIdentifier        : ident=identifier ;
expressionConstantInteger   : value=INT ;
expressionNumericCompare    : lhs=expressionNumeric op=operatorCompare rhs=expressionNumeric;

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
    : typeBasic SQUAREOPEN value=expressionNumeric SQUARECLOSE
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
NOT : '!' ;

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