package ch.css.booleancalculator;

import java.util.Arrays;
import java.util.List;

public class BooleanCalculator {
    
    private static final String TRUE = "TRUE";
    private static final String NOT = "NOT";
    private static final String AND = "AND";
    private static final String OR = "OR";
    private static final String S = " ";

    public boolean evaluate(String given) {
        boolean result = false;
       
        List<String> elements = split(given);
        if (given.contains(OR)) {
            Element leftHandSide = toElement(elements.get(0));
            Element rightHandSide = toElement(elements.get(2));
            new Element.OR(leftHandSide, rightHandSide);
            
            result = evaluate(elements.get(0)) || evaluate(elements.get(2)); 
        }
        if (given.contains(AND)) {
            String leftHandSide = elements.get(0);
            String rightHandSide = elements.get(2);
            result = evaluate(leftHandSide) && evaluate(rightHandSide); 
        }
        if ((elements.get(0)).equals(NOT)){
            String rightHandSide = elements.get(1);
            result = ! evaluate(rightHandSide);
        }
        if (TRUE.equals(given)) {
            result = true;
        }
        
        return result;
    }

    List<String> split(String given) {
        return Arrays.asList(given.split(S));
    }

    public Element toElement(String given) {
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