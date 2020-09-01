package lesson20200901ListPalindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 01/09/2020
 */
public class FunctionToString implements BiFunction <List <String >,Predicate <String >,List <String>> {
    @Override
    public List<String> apply(List<String> stringList, Predicate<String> predicate) {
        List<String> res = new ArrayList<>();
        if (stringList == null) return res;
        for (String s : stringList) {
            if (predicate.test(s)) {
                res.add(s);
            }
        }
        return res;
    }
    /*private Predicate predicate;

    @Override
    public List<String> apply(List<String> stringList) {
        List<String> res = new ArrayList<>();
        if (stringList == null) return res;
        for (String s : stringList) {
            if (predicate.test(s)) {
                res.add(s);
            }
        }

        return res;
    }

    public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }*/
}
