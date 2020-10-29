package lesson20200925HwTaskCollection.List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1Person {
    public static void main(String[] args) {
        //Есть два класса: Address с полями улица и номер дома и Person с полями имя иAddress.
        // Нужно написать функцию:List<Address> getAddresses(List<Person> persons)
        List<Address> addresses = new ArrayList<>();
        Address address1 = new Address("First", 1);
        Address address2 = new Address("Second", 2);
        Address address3 = new Address("Third", 3);

        List<Person> persons = Arrays.asList(
                new Person("Oleg", address1),
                new Person("Jack", address2),
                new Person("Pavel", address3));

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(getAddress(persons));
    }

    public static List<Address> getAddress(List<Person> personList) {
        List<Address> list = new ArrayList<>();
        if (personList == null) return null;
        for (Person person : personList) {
            list.add(person.getAddress());
        }
        return list;

    }

}
