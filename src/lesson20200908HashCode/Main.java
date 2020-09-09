package lesson20200908HashCode;

/**
 * JavaAdvanced
 * 08/09/2020
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("qwer",20);
        Person p2 = new Person("qwer",20);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
