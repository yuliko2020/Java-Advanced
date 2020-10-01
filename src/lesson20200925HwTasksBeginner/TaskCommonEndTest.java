package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskCommonEndTest {
    @Test
    public void LastElementEqual() {
        int a[] = {1, 2, 3};
        int b[] = {7, 3};
        assertTrue(TaskCommonEnd.commonEnd(a, b));
    }

    @Test
    public void FirstElementEqual() {
        int a[] = {1, 2, 3};
        int b[] = {1, 3};
        assertTrue(TaskCommonEnd.commonEnd(a, b));
    }

    @Test
    public void LastElementNotEqual() {
        int a[] = {1, 2, 7};
        int b[] = {7, 3};
        assertFalse(TaskCommonEnd.commonEnd(a, b));
    }

    @Test
    public void FirstNotElementEqual() {
        int a[] = {1, 2, 3};
        int b[] = {2, 3};
        assertTrue(TaskCommonEnd.commonEnd(a, b));
    }
}