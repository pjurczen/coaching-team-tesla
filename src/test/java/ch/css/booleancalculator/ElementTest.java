package ch.css.booleancalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

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
    
    @Test
    public void falseORfalseElementShouldDeliverFalse() {
        // act
        boolean actual = new Element.OR(new Element.False(), new Element.False()).asBoolean();
        // assert
        assertThat(actual).isEqualTo(false);
    }
    
    @Test
    public void trueORtrueElementsShouldDeliverTrue() {
        // act
        boolean actual = new Element.OR(new Element.True(), new Element.True()).asBoolean();
        // assert
        assertThat(actual).isEqualTo(true);
    }
    
    

}
