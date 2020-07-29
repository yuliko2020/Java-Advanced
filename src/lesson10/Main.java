package lesson10;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 28/07/2020
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Иванов Иван Иванович",
                "Петров Пётр  ",
                "Николаев ",
                "Сидоров Джон Иванович"
        };

        Person [] persons = getPersonFromArrayOfString(names);
        System.out.println(Arrays.toString(persons));
        System.out.println("------------------------");
        printPerson(persons);
    }

    public static Person[] getPersonFromArrayOfString(String[] names) {
        Person[] persons = null;
        if (names != null) {
            persons = new Person[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] namesString = names[i].split(" ");
                switch (namesString.length) {
                    case 1:
                        persons[i] = new Person(namesString[0]);
                        break;
                    case 2:
                        persons[i] = new Person(namesString[0], namesString[1]);
                        break;
                    case 3:
                        persons[i] = new Person(namesString[0], namesString[1], namesString[2]);
                        break;
                }

            }

        }

        return persons;
    }

public static void  printPerson(Person[] persons){
    for (Person p :persons) {
        System.out.println(p.toShortString());

    }

}






















        /*String[] client = new String[]{
                "Иванов Иван ",
                "Петров Пётр "
        };

        Person[] people = peopleName(client);
        System.out.println(Arrays.toString(people));

    }

    public static Person[] peopleName(String[] array) {
        Person[] people = new Person[array.length];
        for (int i = 0; i < array.length; i++) {
         array


        }

        return  ;
    }

*/

}