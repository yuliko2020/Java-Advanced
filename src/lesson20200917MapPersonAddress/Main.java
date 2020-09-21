package lesson20200917MapPersonAddress;

import java.util.*;

/**
 * JavaAdvanced
 * 16/09/2020
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person( "Ivan ", Arrays.asList(new Address("adr1 ", " (mail)"),
                new Address("ads2", " (post)")));
        Person p2 = new Person( "Anna ", Arrays.asList(new Address("adr3 ", " (mail)"),
                new Address("adr4 ", "(post)")));
        Person p3 = new Person( "Nick ", Arrays.asList(new Address("address5", " (mail)"),
                new Address("adr6", " post")));
        Person p4 = new Person("Anna", Arrays.asList(new Address("address11", " (mail)"),
                new Address("adr12", " (post)")));


        List<Person> people = new ArrayList<>(Arrays.asList());
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        //System.out.println(people);
        //System.out.println(getPersonWithAddress(people));
        //System.out.println(getPersonWithNamesWithAddress(people));
        System.out.println(getPersonNamesWithAddressesTwo(people));
        System.out.println(getPersonWithAddressTwo(people));


        //изменить икуалс и хешкод ------for  getPersonWithNamesWithAddressTwo

    }

    //добавить адрес у уже *существующего* дабл-персона
    public static Map<String, Set<Address>> getPersonNamesWithAddressesTwo(List<Person> people) {
        Map<String, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            if (result.containsKey(p.getName())) {
                result.get(p.getName()).addAll(p.getAddress());

            } else {
                result.put(p.getName(), addresses);
            }

        }
        return result;
    }


    //----------????
    public static Map<Person, Set<Address>> getPersonWithAddressTwo(List<Person> people) {
        Map<Person, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            if (result.containsKey(p)){
                result.get(p).addAll(p.getAddress());
            }else {
                result.put(p, addresses);
            }
        }

        return result;
    }


    public static Map<Person, Set<Address>> getPersonWithAddress(List<Person> people) {
        Map<Person, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            result.put(p, addresses);
        }

        return result;
    }

    public static Map<String, Set<Address>> getPersonWithNamesWithAddress(List<Person> people) {
        Map<String, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            result.put(p.getName(), addresses);

        }
        return result;
    }

}
