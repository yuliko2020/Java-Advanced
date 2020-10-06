package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TaskCountEvensTest {
    @Test
    public void AllNumbersEven() {
        int[] x = {2,2,0};
        int exp = 3;
        assertEquals(exp,TaskCountEvens.countEvens(x));

    }
    @Test
    public void AllNumbersNotEven() {
        int[] x = {1,3,5};
        int exp = 0;
        assertEquals(exp,TaskCountEvens.countEvens(x));

    }
    @Test
    public void countEvenNumbers() {
        int[] x = {2,1,2,3,4};
        int exp = 3;
        assertEquals(exp,TaskCountEvens.countEvens(x));

    }

}