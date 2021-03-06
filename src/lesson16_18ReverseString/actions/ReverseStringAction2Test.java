package lesson16_18ReverseString.actions;

import lesson16_18ReverseString.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 18/08/2020
 */
class ReverseStringAction2Test {
    @Test
    void doActionNormalStringShouldBeReversed() {
        String str = "1234";
        Action action = new ReverseStringAction();
        assertEquals("4321", action.doAction(str));

    }


    @Test
    void doActionEmptyStringShouldReturnEmptyString() {
        String str = "";
        Action action = new ReverseStringAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    void doActionNullStringShouldReturnNull() {
        String str = null;
        Action action = new ReverseStringAction();
        assertNull(null, action.doAction(str));
    }


}