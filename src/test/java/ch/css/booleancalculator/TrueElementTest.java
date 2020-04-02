package ch.css.booleancalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TrueElementTest {
    
    @Test
    public void shouldDeliverTrue() {
        // arrange
        
        // act
        boolean actual = new Element.True().asBoolean();
        // assert
        assertThat(actual).isEqualTo(true);
    }

}
