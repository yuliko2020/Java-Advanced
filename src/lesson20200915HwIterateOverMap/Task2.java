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
        map.put("d", 15);

        System.out.println(getSumValuesOfaListElement(list, map));
    }

    public static Map<String, Integer> getSumValuesOfaListElement(List<String> list, Map<String, Integer> map) {
        String lastKey = "" ;
        int lastValue = 0;
        if (!map.isEmpty() && list != null) {
            for (String str : list) {
                if (map.containsKey(str)) {
                    lastKey += str;
                    lastValue += map.get(str);
                }
            }
            map.put(lastKey, lastValue);
        }
        return map;
    }
}

