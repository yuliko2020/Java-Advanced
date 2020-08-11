package HwCalculatorUt;

import org.junit.Assert;
import org.junit.Test;

/**
 * JavaAdvanced
 * 11/08/2020
 */
public class CalculatorTest {
    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(7,calculator.addition(5,2));
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(9,calculator.subtraction(12,3));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6,calculator.divide(18,3));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(24,calculator.multiply(6,4));
    }


}
