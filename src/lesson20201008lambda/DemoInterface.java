package lesson20201008lambda;

/**
 * JavaAdvanced
 * 08/10/2020
 */
public interface DemoInterface {
    String SOME_STRING = " Hello";

    String getString(int i);
    //String transform(int i);

    default String transform(int i) {
        return "Hello world";
    }
}
