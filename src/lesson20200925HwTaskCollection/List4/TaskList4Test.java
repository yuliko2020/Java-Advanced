package lesson20200925HwTaskCollection.List4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class  TaskList4Test {
    @Test
    public void checkListOneCircularAnotherTest() {
        List<String> listOne = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        List<String> listTwo = new ArrayList<>(Arrays.asList("cc", "dd", "aa", "bb"));
        assertTrue(TaskList4.determineListOneCircularAnother(listOne,listTwo));
    }

    @Test
    public void checkListOneNotCircularAnotherTest() {
        List<String> listOne = new ArrayList<>(Arrays.asList("dd", "ee", "ff"));
        List<String> listTwo = new ArrayList<>(Arrays.asList("dd", "ff", "ee"));
        assertFalse(TaskList4.determineListOneCircularAnother(listOne,listTwo));
    }

    @Test
    public void checkListOneCircularAnother_NullTest() {
        List<String> listOne = new ArrayList<>(Arrays.asList("dd", "ee", "ff"));
        List<String> listTwo = new ArrayList<>();
        assertFalse(TaskList4.determineListOneCircularAnother(null,listTwo));
    }

}