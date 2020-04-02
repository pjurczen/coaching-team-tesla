package ch.css.booleancalculator;

public class BooleanCalculator {

    private static final String TRUE = "TRUE";
    private static final String FALSE = "FALSE";
    private static final String NOT = "NOT";
    private static final String S = " ";

    public boolean evaluate(String given) {
        boolean result = false;
        if ((NOT + S + FALSE).equals(given)){
            result = true;
        }
        if (TRUE.equals(given)) {
            result = true;
        }
        return result;
    }
}
