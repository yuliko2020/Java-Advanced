package lesson08_compareTo;

/**
 * JavaAdvanced
 * 10/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 20);
        Person p2 = new Person("Jack", 21);

        System.out.println(p2.compareTo(p1));

        System.out.println( PersonComparatorByAge.compare(p2,p1));
    }

}
