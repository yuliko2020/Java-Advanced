package lesson12PrinterInterface;

/**
 * JavaAdvanced
 * 04/08/2020
 */
public class Canon5400 implements Printer {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
