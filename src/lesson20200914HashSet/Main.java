package lesson20200914HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * JavaAdvanced
 * 14/09/2020
 */
public class Main {
    public static void main(String[] args) {
        //список строк -> получить новый список, в котором будут исключены все повторы строк
        //список из уникальных строк исходного списка
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Olga");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Sergey");
        listOfString.add("Vasya");
        listOfString.add("Petya");
        listOfString.add("Vasya");

        System.out.println(getUniqueString(listOfString).toString());

        List<Person> personList = Arrays.asList(
                new Person(" Vasya"),
                new Person(" Masha"),
                new Person(" Vasya"),
                new Person(" Kolya"),
                new Person(" Kostya"),
                new Person(" Kostya"),
                new Person(" Valya"),
                new Person(" Kostya")
        );

        System.out.println(getUniquePerson(personList).toString());
    }

    public static List<String> getUniqueString(List<String> list) {
        if (list == null) return new ArrayList<String>();
        List<String> newList = new ArrayList<>(new HashSet<String>(list));//HashSet не хранит по порядку элементы
        return newList;
    }

    public static List<Person> getUniquePerson(List<Person> list) {
        if (list == null) return new ArrayList<Person>();
        List<Person> newList = new ArrayList<>(new HashSet<Person>(list));//HashCode смотрит на адрес памяти необходимо переопределять для объектов
        return newList;
    }

}
