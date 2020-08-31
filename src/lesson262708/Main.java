package lesson262708;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 26/08/2020
 */
public class Main {
    public static void main(String[] args) {


    }

    public static List<String> listHandler(List<String> list, Predicate <String>predicate,
                                           UnaryOperator  <String> operator) {
        List<String> resList = new ArrayList<>();
        for(String s : list){
            if (predicate.test(s)){
               resList.add(operator.apply(s));
            }

        }
        return resList;

    }



}
