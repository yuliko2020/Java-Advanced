package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskNonStartTest {
    @Test
    public void concatenationWithoutFirstCharacterInEach() {
       String a = "Hello";
       String b = "There";
       String exp = "ellohere";
       assertEquals(exp,TaskNonStart.nonStart(a,b));

    }
}