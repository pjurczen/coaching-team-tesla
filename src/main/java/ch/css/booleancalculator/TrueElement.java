package ch.css.booleancalculator;

import ch.css.booleancalculator.BooleanCalculator.Element;

public class TrueElement implements Element {

    @Override
    public boolean asBoolean() {
        return true;
    }

}
