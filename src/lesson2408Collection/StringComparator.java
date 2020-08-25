package lesson2408Collection;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 24/08/2020
 */
public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
