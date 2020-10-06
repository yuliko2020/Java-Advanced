package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskMiddleTwoTest {
    @Test
    public void evenLengthString_ReturnStringOfTwoCenterCharacter() {
        String a = "string";
        String exp = "ri";
        assertEquals(exp, TaskMiddleTwo.middleTwo(a));
    }

}