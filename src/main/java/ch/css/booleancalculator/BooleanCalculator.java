package ch.css.booleancalculator;

public class BooleanCalculator {

    public boolean evaluate(String given) {
        if ("TRUE".equals(given)) {
            return true;
        }
        return false;
    }
}
