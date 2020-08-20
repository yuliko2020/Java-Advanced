package lesson16_18ReverseString;

import lesson16_18ReverseString.conditions.TestCondition;
import lesson16_18ReverseString.actions.TestAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 19/08/2020
 */
class StringArrayHandlerTest {
    @Test
    public void stringsHandler_normalCase() {
        String[] strings = {"123", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"test", "test", "test", "14", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHandler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());


    }

    @Test
    public void stringsHandler_nullAction_nothing() {
        String[] strings = {"123", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"123", "qwerty", "123456", "14", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        null,
                        new TestCondition());
        stringArrayHandler.stringsHandler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());


    }

    @Test
    public void stringsHandler_nullCondition_doActionForAll() {
        String[] strings = {"123", "qwerty", "123456", "14", ""};
        String[] expectedArr =  {"test", "test", "test", "test", "test"};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        new TestAction(),
                        null);
        stringArrayHandler.stringsHandler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());


    }

    @Test
    public void stringsHandler_nullArray_nothing() {
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(null,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHandler();
        assertNull( stringArrayHandler.getStrings());


    }
}