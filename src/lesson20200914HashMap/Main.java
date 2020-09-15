package lesson20200914HashMap;

import java.util.*;

/**
 * JavaAdvanced
 * 14/09/2020
 */
public class Main {
    public static void main(String[] args) {
        //список строк -> получить Map, в котором будут пары соответствия имя + количество раз,
        //которое встречалось в списке
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Olga");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Sergey");
        listOfString.add("Vasya");
        listOfString.add("Petya");
        listOfString.add("Vasya");

        System.out.println(getMapOfStrings(listOfString).toString());

        List<Person> personList = Arrays.asList(
                new Person("Svetlana"),
                new Person("Alexandr"),
                new Person("Nika"),
                new Person("Svetlana"),
                new Person("Alexandr"),
                new Person("Svetlana"),
                new Person("Sergey")

        );

        System.out.println(getMapWithPersonKey(personList));

    }

    public static Map<String, Integer> getMapOfStrings(List<String> list) {//количество повторов value
        Map<String, Integer> result = new HashMap<>();
        if (list == null) return result;
        for (String string : list) {
            if (result.containsKey(string)) {
                //Integer i = result.get(string); //value from string - Map
                //i++;
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1);
            }
        }
        return result;
    }

    public static Map<Person, Boolean> getMapWithPersonKey(List<Person> list) {
        Map<Person, Boolean> result = new HashMap<>();
        if (list == null) return result;
        for (Person person : list) {
            if (result.containsKey(person)) {
                result.put(person, false);
            } else {
                result.put(person, true);
            }
        }
        return result;
    }
}
