package lesson20200903_TaskForProgrammer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 08/09/2020
 */
class TaskTest {

    @Test
    void compareTo() {
        Task t1 = new Task(1, Status.READY, "1", Priority.HIGH);
        Task t2 = new Task(2, Status.READY, "2", Priority.NORMAL);
        Task t3 = new Task(3, Status.READY, "3", Priority.LOW);
        Task t4 = new Task(4, Status.READY, "4", Priority.LOW);


        assertEquals(0, t3.compareTo(t4));
        assertTrue(t1.compareTo(t2) < 0);
        assertTrue(t1.compareTo(t3) < 0);
        assertTrue(t2.compareTo(t1) > 0);
        assertTrue(t3.compareTo(t1) > 0);
        assertTrue(t3.compareTo(t2) > 0);
        assertTrue(t2.compareTo(t3) < 0);
    }
}