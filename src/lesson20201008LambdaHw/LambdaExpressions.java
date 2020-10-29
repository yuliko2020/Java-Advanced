package lesson20201008LambdaHw;

import java.time.LocalDate;
import java.util.function.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        //1 Given an integer, return a power of integer: 5 -> 25
        Function<Integer, Integer> f1 = (a) -> a * a;
        System.out.println("Task 1 - " + f1.apply(5));

        //2 Given a string, return modulo 2 of string length: "abcde" -> 1
        Function<String, Integer> f2 = (s) -> s.length() % 2;
        System.out.println("Task 2 - " + f2.apply("abcde"));

        //3 Given a string, return its in upper case: "ivan" -> "IVAN"
        Function<String, String> f3 = s -> s.toUpperCase();
        System.out.println("Task 3 - " + f3.apply("ivan"));

        //4Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String, String, Integer> f4 = (s1, s2) -> s1.length() + s2.length();
        System.out.println("Task 4 - " + f4.apply("abc", "de"));

        //5 Given 2 strings, print a sum of their lengths.
        BiConsumer<String, String> f5 = (s1, s2) -> System.out.println("Task 5 - "
                + s1.length() + " and" + " " + s2.length());
        f5.accept("123",
                "1234");

        //6 Return a date of one week prior to today: "2020-05-30"
        UnaryOperator<LocalDate> f6 =
                (d) -> LocalDate.of(2020, 05, 30).minusWeeks(1);
        System.out.println("Task 6 - " + f6.apply(LocalDate.ofEpochDay(2020 - 05 - 30)));

        //7 Given a string, return a string, which consists of a first half of its character,
        // if length is even, returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
        Function<String, String> f7 = s -> (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
        System.out.println("Task 7 length even - " + f7.apply("abcd"));
        System.out.println("Task 7 length odd - " + f7.apply("abcde"));

        //8 Return a random number
        Supplier<Integer> f8 = () -> (int) (Math.random() * (100 - 1) + 1);
        System.out.println("Task 8 - "+f8.get());

        //9 Given a string, return a reversed string: "abc" ->"cba"




    }
}
