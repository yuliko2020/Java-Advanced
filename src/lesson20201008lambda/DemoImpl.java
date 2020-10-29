package lesson20201008lambda;

/**
 * JavaAdvanced
 * 08/10/2020
 */
public class DemoImpl implements DemoInterface {
    int anInt;

    @Override
    public String getString(int i) {
        return String.valueOf(i);
    }

    @Override
    public String transform(int i) {
        anInt = 3;
        return "Hello World " + i + anInt;
    }
}
