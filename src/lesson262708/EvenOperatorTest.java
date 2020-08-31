package lesson262708;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 27/08/2020
 */
class EvenOperatorTest {
    @Test
    public void apply_string_evenCharsString() {
        String s = "12345678";
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("2468",operator.apply("12345678"));
    }

    @Test
    public void apply_null_null() {
        UnaryOperator<String> operator = new EvenOperator();
        assertNull(operator.apply(null));
    }

    @Test
    public void apply_emptyString_null() {
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("",operator.apply(""));
    }

    @Test
    public void apply_oneCharString_null() {
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("",operator.apply("1"));
    }

}