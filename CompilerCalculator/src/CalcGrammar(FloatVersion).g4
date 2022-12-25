grammar CalcGrammar;

@header {
	package compilercalculator;
	import java.util.HashMap;
}

@members {
	HashMap memory = new HashMap();
}

prog: 	stat+ ;

stat: expr NEWLINE? {System.out.println($expr.value);}
    | ID '=' expr NEWLINE
      {
		memory.put($ID.text, new Float($expr.value));
		//System.out.println("New variable: "+$ID.text+" with value ="+$expr.value);
      }
    | NEWLINE
    ;

expr returns [float value]
    : e=multExpr {$value = $e.value;}
      (  '+' e=multExpr {$value += $e.value;}
      |  '-' e=multExpr {$value -= $e.value;}
	 '/' e=multExpr {$value /= $e.value;}
      )*
    ;

multExpr returns [float value] 
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})* 
    ;

atom returns [float value]
    :   FLOAT {$value = Float.parseFloat($FLOAT.text);} 
    |   ID 
        {
        Float v = (Float)memory.get($ID.text);
        if ( v!=null ) $value = v.floatValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' e=expr ')' {$value = $e.value;}
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
FLOAT : '0'..'9' '.' '0'..'9'+;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;

