package lesson16_18ReverseString.actions;

import lesson16_18ReverseString.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 19/08/2020
 */
class ToUpperCaseActionTest {
    @Test
    void doActionNormalStringShouldBeUpperCase() {
        String str = "qweRTyuiIOPйё-.фыв";
        Action action = new ToUpperCaseAction();
        assertEquals("QWERTYUIIOPЙЁ-.ФЫВ", action.doAction(str));

    }

    @Test
    void doActionEmptyStringShouldReturnEmptyString() {
        String str = "";
        Action action = new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    void doActionNullStringShouldReturnNull() {
        String str = null;
        Action action = new ToUpperCaseAction();
        assertNull(null, action.doAction(str));
    }

}