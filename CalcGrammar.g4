grammar CalcGrammar;

@header {
  package compilercalculator;
  import java.util.HashMap;
}

@members {
	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
}

prog:   stat+ ;
               
stat:   expr NEWLINE? {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE
        {
            memory.put($ID.text, new Integer($expr.value));
            //System.out.println("New variable: "+$ID.text+" with value ="+$expr.value);
        }
    |   NEWLINE
    ;

expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        |   '/' e=multExpr {$value /= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
    ; 

atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' e=expr ')' {$value = $e.value;}
    ;

ID  :    ('a'..'z'|'A'..'Z')+ ('0'..'9')? ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
