package lesson20201006Anagram;

import java.util.Comparator;
import java.util.function.Function;

/**
 * JavaAdvanced
 * 06/10/2020
 */
public class Demo {
    public static void main(String[] args) {
        DemoInterface demo = new DemoInterface() {
            @Override
            public String getString(String input){
                return input.toUpperCase();
            }
        };

        //DemoInterface demoFunctional = (s)->s.toUpperCase();
        DemoInterface demoFunctional = String::toUpperCase;
        String hello_world = demoFunctional.getString("hello World");
        System.out.println(hello_world);





        /*Function  <String ,Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator <String >c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };*/




    }

}
