package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TaskShiftLeftTest {
    @Test
    public void shiftedLeftByOneIndex() {
        int[] a = {6, 2, 5, 3,};
        int[] exp = {2, 5, 3, 6};
        assertEquals(Arrays.toString(exp), Arrays.toString(TaskShiftLeft.shiftLeft(a)));
    }

}