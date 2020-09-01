package lesson20200901ListPalindrome;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 01/09/2020
 */
public class PredicatePalindrome implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s==null) return false;
        return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);

    }
}
