package lesson20200915HwIterateOverMap;

import java.security.KeyStore;
import java.util.*;

/**
 * JavaAdvanced
 * 16/09/2020
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 4);
        map.put("d", 7);

        /*double c = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();

            System.out.println(k + "\t" + v);
            c += Double.parseDouble(String.valueOf(v));
        }
        System.out.println("===");
        System.out.println("Total: " + c);*/


    }

}
