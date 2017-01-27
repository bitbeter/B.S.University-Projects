grammar fool;

@header{
    import java.util.Vector;
}

@members{
    void print(String str){
        System.out.println(str);
    }
}

program
    : (statement ';')+
    ;
statement
    : assignment
    | write
    ;
assignment
    : id=VARNAME '=' calculation
    ;
calculation
    : CONST
    | VARNAME
    | calculation ('+' | '-' | '*' | '/') calculation
    | '-' calculation
    | '(' calculation ')'
    ;
write
    : 'write' calculation
    ;

VARNAME:
    [a-zA-Z_][a-zA-Z0-9_]*
    ;
CONST:
    [0-9]+ ('.' [0-9]+)?
    ;
WS:
    [ \r\t\n]+ -> skip
    ;
