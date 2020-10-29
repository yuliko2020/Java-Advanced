package lesson20200925HwTaskCollection.List2;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 08/10/2020
 */
public class TaskList2 {
    public static void main(String[] args) {
        //Есть список с именами: Ivan, Maria, Stephan, John, Amalia.
        // Написать функцию,которая вернет список,
        // в котором не содержатся имена исходного списка,длиной 4.
        List<String> stringList = new ArrayList<>();
        stringList.add("Ivan");
        stringList.add("Maria");
        stringList.add("Stephan");
        stringList.add("John");
        stringList.add("Amalia");
        System.out.println(NameListCheckingLength4(stringList));
    }

    public static List<String> NameListCheckingLength4(List<String> stringList) {
        if (stringList == null) return stringList;
        List<String> res = new ArrayList<>();
        for (String str : stringList) {
            if (str.length() != 4) {
                res.add(str);
            }

        }
        return res;
    }
}
