package ch.css.booleancalculator;

public class BooleanCalculator {

    private static final String TRUE = "TRUE";
    private static final String FALSE = "FALSE";
    private static final String NOT = "NOT";
    private static final String AND = "AND";
    private static final String S = " ";

    public boolean evaluate(String given) {
        boolean result = false;
       
        String[] elements = split(given);
        
        if (given.contains(AND)) {
            result = evaluate(elements[0]) && evaluate(elements[2]); 
        }
        if ((elements[0]).equals(NOT)){
            result = ! evaluate(elements[1]);
        }
        if (TRUE.equals(given)) {
            result = true;
        }
        return result;
    }

    String[] split(String given) {
        return given.split(S);
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