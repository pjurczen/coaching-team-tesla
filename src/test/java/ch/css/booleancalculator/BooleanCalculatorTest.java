package ch.css.booleancalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BooleanCalculatorTest {



    @ParameterizedTest
    @CsvSource({
            "T, false",
            "TR, false",
            "TRU, false",
    })
    public void evaluateBooleanFromString(String givenString, boolean expectedBoolean) {
        // given
        // when
        boolean actual = new BooleanCalculator().evaluate(givenString);
        // then
        assertThat(actual).isEqualTo(expectedBoolean);
    }

}

/**
 *
 * ________________________________________________________________________________________________________
 * Boolean Calculator:  Entwickle einen Boolean Calculator. Er bekommt einen String als Input und wertet diesen String zu einem boolean aus.
 *
 * 1.) einzelne Werte:  "TRUE" -> true "FALSE" -> false 
 *
 * 2.) NOT Operator  "NOT TRUE" -> false 
 *
 * 3.) AND Operator  "TRUE AND FALSE" -> false "TRUE AND TRUE" -> true 
 *
 * 4.) OR Operator  "TRUE OR FALSE" -> true "FALSE OR FALSE" -> false 
 *
 * 5.) Beliebige Anzahl von AND und OR Operatoren, NOT hat Vorrang vor AND und OR  "TRUE OR TRUE OR TRUE AND FALSE" -> true "TRUE OR FALSE AND NOT FALSE" -> true 
 *
 * 6.) Klammern  "(TRUE OR TRUE OR TRUE) AND FALSE" -> false "NOT (TRUE AND TRUE)" -> false 
 *
 * 7.) Drucke den abstrakten Syntax Baum aus, der die Berechnung repräsentiert  
 * "(TRUE OR TRUE OR TRUE) AND FALSE" ->  
 * AND 
 * |_OR |
 * |_TRUE
 * ||_OR 
 * | |_TRUE
 * | |_TRUE 
 * |_FALSE  
 *
 * "NOT ((TRUE OR TRUE) OR (TRUE AND FALSE))" ->
 *
 *  NOT
 * |_OR 
 *  |_OR  
 *  |  |_TRUE 
 *  |  |_TRUE 
 *  |_AND 
 *     |_TRUE 
 *     |_FALSE 
 **/