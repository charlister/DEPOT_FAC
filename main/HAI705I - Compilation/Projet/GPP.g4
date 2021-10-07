grammar GPP;

type : 'integer' 
| 'boolean' 
| 'array' 'of' type;

constante : integer | 'true' | 'false';

integer : Number 
| '-' Number;

Number : [0-9]+;

uop : '-' 
| 'not';

bop : '+' | '-' | '*' | '/' 
| 'and' | 'or' 
| '<' | '<=' | '=' | '!=' | '>=' | '>';

target : 'read' 
| 'write' 
| f;

f : Name+ '(' expr* ')';

Name : [a-zA-Z_]+;

expr : constante 
| variable 
| uop expr 
| expr bop expr 
| target(expr*) | expr '[' expr ']' 
| 'new' 'array' 'of' type '[' expr ']';

variable : Name;

instruction : variable ':=' expr
| expr '[' expr ']' ':=' expr
| 'if' expr 'then' instruction 'else' instruction
| 'while' expr 'do' instruction
| target '(' expr* ')'
| 'skip'
| instruction ';' instruction;
// a := 15 ; t := new array of integer[3] ; i := 0 ; while i<3 do t[i] := a ;  skip

// function : f '(' (variable ':' type)* ')' (':' type)?
// ('var' (variable ':' type)+)?
// instruction;

// prog : ('var' (variable ':' type)+)?
// function*
// instruction;


WS : [ \t\r\n]+ -> skip ;