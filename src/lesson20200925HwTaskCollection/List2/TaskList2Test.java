package lesson20200925HwTaskCollection.List2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskList2Test {

    @Test
    public void checkingListLengthNotReturn4(){
        List<String> list = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        List<String> expected = Arrays.asList("Maria", "Stephan", "Amalia");
        assertEquals(expected, TaskList2.NameListCheckingLength4(list));
    }

    @Test
    public void checkingListLengthReturn4(){
        List<String> list = Arrays.asList("Maria", "Stephan", "Amalia");
        List<String> expected = Arrays.asList("Maria", "Stephan", "Amalia");
        assertEquals(expected, TaskList2.NameListCheckingLength4(list));
    }

    @Test
    public void listHandler_NullList_BaseList() {
        List<String> list = null;
        assertNull(TaskList2.NameListCheckingLength4(list));
    }

}