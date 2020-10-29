package lesson20201013Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class WordTransformer {
    public static void main(String[] args) {
        //"abc defG ikl" -> "ABC defG IKL"
        //1: if length == 3 -> toUpperCase
        //2:if length == 5 ->*****
        //3:if length == 2 -> toLowerCase
        //Choose functional interfaces and extend method signature
        //Adjust logic in the method to use these functional interfaces

    }

    public static String transform(String s, Predicate<String> p, Function<String, String> f) {
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {

            if (p.test(temp[i])) {
                temp[i] = f.apply(temp[i]);
            }
        }
        return String.join(" ", temp);
    }

    public static String transform(String s) {
        Predicate<String> stringPredicate = (str) -> str.length() == 3;
        Function<String, String> toUpperCaseFunction = String::toUpperCase;
        return transform(s, stringPredicate, toUpperCaseFunction);
    }

}
