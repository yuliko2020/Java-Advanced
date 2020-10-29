package lesson20200925HwTaskCollection.List5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskList5Test {
    @Test
    public void reversedListTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> exp = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(exp, TaskList5.reversedList(list));
    }


}