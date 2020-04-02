package ch.css.booleancalculator;

import java.util.Arrays;
import java.util.List;

import ch.css.booleancalculator.Element.False;

public class BooleanCalculator {
    
    private static final String TRUE = "TRUE";
    private static final String FALSE = "FALSE";
    private static final String NOT = "NOT";
    private static final String AND = "AND";
    private static final String OR = "OR";
    private static final String S = " ";

    public boolean evaluate(String given) {
        Element elementeBaum = null;
       
        List<String> elements = split(given);
        if (elements.contains(OR)) {
            Element leftHandSide = toElement(elements.get(0));
            Element rightHandSide = toElement(elements.get(2));
            elementeBaum = new Element.OR(leftHandSide, rightHandSide);
        }
        if (elements.contains(AND)) {
            Element leftHandSide = toElement(elements.get(0));
            Element rightHandSide = toElement(elements.get(2));
            elementeBaum = new Element.AND(leftHandSide, rightHandSide);
        }
        if ((elements.get(0)).equals(NOT)){
            elementeBaum = new Element.NOT(toElement(elements.get(1)));
        }
        
        if (TRUE.equals(given)) {
            elementeBaum = toElement(given);
        }
        
        if (FALSE.equals(given)) {
            elementeBaum = toElement(given);
        }
        
        return elementeBaum.asBoolean();
    }

    List<String> split(String given) {
        return Arrays.asList(given.split(S));
    }

    public Element toElement(String given) {
        if (FALSE.equals(given)) {
            return new Element.False();
        }
        return new Element.True();
    }
    
    
}


/* **** TPP ******
 ({} → nil) no code at all → code that employs nil
 (nil → constant)
 (constant → constant+) a simple constant to a more complex constant
 (constant → scalar) replacing a constant with a variable or an argument
 (statement → statements) adding more unconditional statements.
 (unconditional → if) splitting the execution path
 (scalar → array)
 (array → container)
 (statement → tail-recursion)
 (if → while)
 (statement → non-tail-recursion)
 (expression → function) replacing an expression with a function or algorithm
 (variable → assignment) replacing the value of a variable.
 (case) adding a case (or else) to an existing switch or if

*/