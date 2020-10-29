package lesson20201008lambda;

/**
 * JavaAdvanced
 * 08/10/2020
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String type(String s) {
        return "HUMAN";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


}
