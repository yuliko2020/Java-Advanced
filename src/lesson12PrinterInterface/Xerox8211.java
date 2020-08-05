package lesson12PrinterInterface;

/**
 * JavaAdvanced
 * 04/08/2020
 */
public class Xerox8211 implements ScannAble, Printer {
    @Override
    public void print(String s) {
        System.out.println("Printed on Xerox ");
        System.out.println(s);
    }

    @Override
    public String scan() {
        return "return Xerox scanner text";
    }
}
