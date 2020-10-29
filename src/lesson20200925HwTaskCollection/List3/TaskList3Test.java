package lesson20200925HwTaskCollection.List3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskList3Test {
    @Test
    public void checkingListForYes() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes");
        assertEquals(expected, TaskList3.compareListWithReturnElements(list1, list2));
    }

    @Test
    public void checkingListForNo() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        List<String> expected = Arrays.asList("No", "No", "No", "No");
        assertEquals(expected, TaskList3.compareListWithReturnElements(list1, list2));
    }
    @Test
    public void checkingListForYesAndNo() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 2, 3, 8);
        List<String> expected = Arrays.asList("No", "Yes", "Yes", "No");
        assertEquals(expected, TaskList3.compareListWithReturnElements(list1, list2));
    }
}