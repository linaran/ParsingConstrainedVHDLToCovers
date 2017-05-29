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

STD_LOGIC: S T D UNDER L O G I C;

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
fragment UNDER:('-');

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
UNDERSCORE : '-';

BASIC_IDENTIFIER
   :   LETTER ( '_' ( LETTER | DIGIT ) | LETTER | DIGIT )*
   ;

DIGIT
  :  '0'..'9'
  ;

LETTER
  :  'a'..'z' | 'A'..'Z'
  ;

// Rules

file
    : ( unit )* EOF
    ;

unit
    : entity_declaration
    | architecture
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
    : interface_declaration ( SEMI interface_declaration )*
    ;

interface_declaration
    : identifier_list COLON in_out 'std_logic'
    ;

identifier_list
    : identifier ( COMMA identifier )*
    ;

in_out
    : IN
    | OUT
    ;

identifier
    : BASIC_IDENTIFIER
    ;

architecture
    : ARCHITECTURE identifier OF identifier IS
    SIGNAL identifier_list COLON 'std_logic' SEMI
    BEGIN
    architecture_details
    END ( identifier )? SEMI
    ;

architecture_details
    : ( assignment_expression )*
    | ( entity_work )*
    ;

assignment_expression
    : identifier LE expression SEMI;

expression
    : ( unary_operator )? identifier ( dual_operator expression )?
    | LPARENT expression RPARENT
    ;

unary_operator
    : NOT
    ;

dual_operator
    : AND
    | OR
    | NAND
    | NOR
    | XOR
    | XNOR
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