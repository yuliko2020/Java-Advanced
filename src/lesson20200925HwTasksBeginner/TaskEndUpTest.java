package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskEndUpTest {
    @Test
    public void StringLess_Than3ToUpperCase() {
        String str = "hi";
        String exp = "HI";
        assertEquals(exp,TaskEndUp.endUp(str));
    }

    @Test
    public void StringLonger_Than3ToUpperCase() {
        String str = "hi there";
        String exp = "hi thERE";
        assertEquals(exp,TaskEndUp.endUp(str));
    }


}