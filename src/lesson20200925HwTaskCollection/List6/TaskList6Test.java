package lesson20200925HwTaskCollection.List6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class  TaskList6Test {
    @Test
    public void CombineListTest() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> exp = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(exp, TaskList6.combineTwoList(listOne, listTwo));
    }
}