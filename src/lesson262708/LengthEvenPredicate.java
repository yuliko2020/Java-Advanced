package lesson262708;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 27/08/2020
 */
public class LengthEvenPredicate implements Predicate  <String> {
    @Override
    public boolean test(String s) {
        if (s==null)return false;
        return s.length()%2==0;
    }
}
