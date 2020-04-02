package ch.css.booleancalculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ElementTest {
    
    @Test
    public void trueElementShouldDeliverTrue() {
        // act
        boolean actual = new Element.True().asBoolean();
        // assert
        assertThat(actual).isEqualTo(true);
    }
    
    @Test
    public void falseElementShouldDeliverFalse() {
        // act
        boolean actual = new Element.False().asBoolean();
        // assert
        assertThat(actual).isEqualTo(false);
    }
    
  
    @ParameterizedTest
    @MethodSource("orData")
    public void or(Element left, Element right, boolean expectedResult) {
        // act
        boolean actual = new Element.OR(left, right).asBoolean();
        // assert
        assertThat(actual).isEqualTo(expectedResult);
    }
    
    static Stream<Arguments> orData(){
        return Stream.of(
                    Arguments.arguments(new Element.False(), new Element.False(), false),
                    Arguments.arguments(new Element.True(), new Element.False(), true),
                    Arguments.arguments(new Element.False(), new Element.True(), true),
                    Arguments.arguments(new Element.True(), new Element.True(), true)
                );
    }
    
    @Test
    public void notFAlseIsTrue() {
        boolean actual = new Element.NOT(new Element.False()).asBoolean();
     // assert
        assertThat(actual).isEqualTo(true);
    }
    
    
    @Test
    public void notTrueIsFalse() {
        boolean actual = new Element.NOT(new Element.True()).asBoolean();
     // assert
        assertThat(actual).isEqualTo(false);
    }

}
