package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TaskZeroMaxTest {
    @Test
    public void ZeroValueReplacedByMaxOddFromRightOfZero() {
        int[] a = {0, 5, 0, 3};
        int[] exp = {5, 5, 3, 3};
        assertEquals(Arrays.toString(exp), Arrays.toString(TaskZeroMax.zeroMax(a)));

    }

    @Test
    public void ArrayWithoutZero() {
        int[] a = {1, 2, 3, 4};
        int[] exp = {1, 2, 3, 4};
        assertEquals(Arrays.toString(exp), Arrays.toString(TaskZeroMax.zeroMax(a)));

    }

}