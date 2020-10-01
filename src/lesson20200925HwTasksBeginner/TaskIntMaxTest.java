package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskIntMaxTest {
    @Test
    public void returnTheLargestNumberMiddle() {
        int a = 1, b = 3, c = 2;
        int exp = 3;
        assertEquals(exp,TaskIntMax.intMax(a,b,c));
    }
    @Test
    public void returnTheLargestNumberLast() {
        int a = 2, b = 1, c = 3;
        int exp = 3;
        assertEquals(exp,TaskIntMax.intMax(a,b,c));
    }
}