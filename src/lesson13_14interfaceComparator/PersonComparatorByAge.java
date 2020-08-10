package lesson13_14interfaceComparator;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 06/08/2020
 */
public class PersonComparatorByAge implements Comparator  <Person>{


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
