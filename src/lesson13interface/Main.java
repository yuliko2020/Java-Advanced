package lesson13interface;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 05/08/2020
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "Nick", "John", "Anna"};
        System.out.println(names[0].compareTo(names[0]));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        Person[] people = {new Person("Jack", 67),
                new Person("Nick", 25),
                new Person("John", 80),
                new Person("Anna", 18),
                new Person("Nick", 18),
                new Person("Anna", 23),


        };

       //System.out.println(people[0].compareTo(people[3]));

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));



    }
}
