grammar VHDL;

// Tokens

ENTITY : E N T I T Y;
IS : I S;
PORT : P O R T;
BEGIN: B E G I N;
END : E N D;
ARCHITECTURE : A R C H I T E C T U R E;
OF : O F;
SIGNAL : S I G N A L;
IN : I N;
OUT: O U T;
MAP : M A P;
STDLOGIC: S T D '_' L O G I C;

XOR : X O R;
AND : A N D;
NAND : N A N D;
OR : O R;
NOT : N O T;
XNOR : X N O R;
NOR : N O R;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

COMMA : ',';
LPARENT : '(';
RPARENT : ')';
COLON : ':';
EQ : '=';
MUL : '*';
DIV : '/';
LE : '<=';
GE : '=>';
SEMI : ';';

BASIC_IDENTIFIER
   :   LETTER ( '_' ( LETTER | DIGIT ) | LETTER | DIGIT )*
   ;

DIGIT
  :  '0'..'9'
  ;

LETTER
  :  'a'..'z' | 'A'..'Z'
  ;

BOOLEAN_CONST
    : '\'0\''
    | '\'1\''
    ;

// Rules

file
    : entity_declaration architecture
    | EOF
    ;

entity_declaration
    : ENTITY identifier IS port_declaration
    END ( identifier )? SEMI
    ;

port_declaration
    : PORT LPARENT port_list RPARENT SEMI
    ;

port_list
    : interface_declarations
    ;

interface_declarations
    : input_declaration SEMI output_declaration
    | output_declaration SEMI input_declaration
    ;

input_declaration
    : identifier_list COLON IN STDLOGIC
    ;

output_declaration
    : identifier_list COLON OUT STDLOGIC
    ;

identifier_list
    : identifier ( COMMA identifier )*
    ;

identifier
    : BASIC_IDENTIFIER
    ;

architecture
    : ARCHITECTURE identifier OF identifier IS
    SIGNAL identifier_list COLON STDLOGIC SEMI
    BEGIN
    architecture_details
    END ( identifier )? SEMI
    | ARCHITECTURE identifier OF identifier IS
    BEGIN
    architecture_details
    END ( identifier )? SEMI
    ;

architecture_details
    : ( assignment_expression )*
    ;

assignment_expression
    : identifier LE expression SEMI;

expression
    : identifier                            #expressionIdentifier
    | unary_operator expression             #expressionUnaryOperator
    | expression binary_operator expression #expressionBinaryOperator
    | LPARENT expression RPARENT            #expressionParentheses
    | BOOLEAN_CONST                         #expressionBooleanConst
    ;

unary_operator
    : NOT
    ;

binary_operator
    : AND   #andOp
    | OR    #orOp
    | NAND  #nandOp
    | NOR   #norOp
    | XOR   #xorOp
    ;

entity_work
    : identifier COLON ENTITY 'work.'identifier PORT MAP LPARENT port_spec RPARENT SEMI
    ;

port_spec
    : identifier_list
    | assignment_list
    ;

assignment_list
    : assignment ( COMMA assignment )*
    ;

assignment
    : identifier GE identifier
    ;

WS : [ \t\r\n]+ -> skip ;