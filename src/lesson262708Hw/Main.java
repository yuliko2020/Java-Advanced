package lesson262708Hw;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        Address address1 = new Address("Munich@123@gmail.com");
        Address address2 = new Address("Munich@124@gmail.com");
        Address address3 = new Address("Munich@125@gmail.com");

        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Ivanov1", "Ivan1", address1);
        Person person2 = new Person("Ivanov2", "Ivan2", address2);
        Person person3 = new Person("Ivanov3", "Ivan3", address3);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
