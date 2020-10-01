package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskDiff21Test {
    @Test
    public void returnDoubleDifferenceIf_NumberGreaterThan21() {
        int number = 25;
        int exp = (25 - 21) * 2;
        assertEquals(8,TaskDiff21.diff21(number));
    }

    @Test
    public void returnResultIf_NumberLessThan21() {
        int number = 19;
        int exp = 21-19;
        assertEquals(2,TaskDiff21.diff21(number));
    }

    @Test
    public void returnResult0_If_NumberEquals21() {
        int number = 21;
        int exp = 21-21;
        assertEquals(0,TaskDiff21.diff21(number));
    }
}