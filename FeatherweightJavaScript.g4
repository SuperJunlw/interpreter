grammar FeatherweightJavaScript;


@header { package edu.sjsu.fwjs.parser; }

// Reserved words
IF        : 'if' ;
ELSE      : 'else' ;
WHILE     : 'while' ;
FUNCTION  : 'function' ;
VAR       : 'var' ;
PRINT     : 'print' ;

// Literals
INT       : [1-9][0-9]* | '0' ;
BOOL      : 'true' | 'false' ;
NULL      : 'null' ;

// Identifiers
ID : [a-zA-Z_][a-zA-Z0-9_]* ;

// Symbols
MUL       : '*' ;
DIV       : '/' ;
ADD       : '+' ;
SUB       : '-' ;
MOD       : '%' ;
GT        : '>' ;
LT        : '<' ;
GE        : '>=' ;
LE        : '<=' ;
EQ        : '==' ;
ASSIGN    : '=' ;
SEPARATOR : ';' ;

// Whitespace and comments
NEWLINE   : '\r'? '\n' -> skip ;
// can also be .*? pg 77
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT  : '//' ~[\n\r]* -> skip ;
WS            : [ \t]+ -> skip ; // ignore whitespace


// ***Parsing rules ***

/** The start rule */
prog: stat+ ;

stat: expr SEPARATOR                                    # bareExpr
    | IF '(' expr ')' block ELSE block                  # ifThenElse
    | IF '(' expr ')' block                             # ifThen
    | WHILE '(' expr ')' block							# while
    | PRINT '(' expr ')' SEPARATOR?						# print
    | SEPARATOR											# empty
    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # MulDivMod
	| expr op = ( '+' | '-' ) expr						# AddSub
	| expr op = ( '<' | '<=' | '>' | '>=' | '==') expr  # LtLeGtGeEq
	| FUNCTION '(' params ')' block				# FunctionDeclaration
	| expr '(' args ')'					# FunctionApplication
	| VAR ID ASSIGN expr 								# VariableDec
	| VAR ID ASSIGN block								# VariableDec
	| ID												# VariableRef
	| ID ASSIGN expr 									# AssignStatement
    | INT                                               # int
    | BOOL												# bool
    | NULL												# null
    | '(' expr ')'                                      # parens
    ;

block: '{' stat* '}'                                    # fullBlock
     | stat                                             # simpBlock
     ;

params: (ID(',' ID)*)?;

args: (expr(',' expr)*)?;

