package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSum2Test {
    @Test
    public void ArrayLengthSumOfFirstTwoElements() {
        int[] x = {1, 2, 3};
        int exp = 1 + 2;
        assertEquals(exp, TaskSum2.sum2(x));
    }

    @Test
    public void ArrayLengthLessThenTwoElements() {
        int[] x = {1, 1};
        int exp = 1 + 1;
        assertEquals(exp, TaskSum2.sum2(x));
    }
    @Test
    public void ArrayLengthZero() {
        int[] x = {};
        int exp = 0;
        assertEquals(exp, TaskSum2.sum2(x));
    }
}