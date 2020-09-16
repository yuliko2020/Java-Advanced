package lesson20200915HwIterateOverMap;

import java.util.HashMap;
import java.util.Map;

/**
 * JavaAdvanced
 * 16/09/2020
 */
public class Main {
    public static void main(String[] args) {
        //Перебрать Map и вывести на экран через цикл
        Map<String, String> map = new HashMap<>();
        map.put("1","Sunday");
        map.put("2","Monday");
        map.put("3","Tuesday");
        map.put("4","Wednesday");
        map.put("5","Thursday");
        map.put("6","Friday");
        map.put("7","Saturday");

        // Map.Entry - описываем пару (ключ - значение) "3=Среда" и т.п.
        // entrySet - возвращает множество со значениями карты, т.е. [3=Среда, 2=Вторник, 1=Понедельник]
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
        }
        System.out.println("---------------");

        // keySet - возвращает множество ключей
        for (String key : map.keySet()) {
            System.out.println("ID = " + key + ", День недели = " +  map.get(key));
        }
        System.out.println();

    }

}
