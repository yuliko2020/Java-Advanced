package lesson2508AlList;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 25/08/2020
 */
public class ConditionForRemove implements Predicate <String> {
    @Override
    public boolean test(String s) {
        return s.startsWith("q");
    }
}
