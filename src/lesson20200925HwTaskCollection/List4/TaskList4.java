package lesson20200925HwTaskCollection.List4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  TaskList4 {
    public static void main(String[] args) {
        //Есть два списка с буквами. Определить, является ли один список циклической версией другого.
        // Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb}результат будет true,
        // а для {dd, ee, ff} и {dd, ff, ee} - false.
        List<String> listOne = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        List<String> listTwo = new ArrayList<>(Arrays.asList("cc", "dd", "aa", "bb"));
        System.out.println(determineListOneCircularAnother(listOne, listTwo));
    }

    public static boolean determineListOneCircularAnother(
            List<String> listOne, List<String> listTwo) {
        if (listOne != null && listTwo != null) {
            if (listOne.size() == listTwo.size()) {
                for (int i = listOne.size(); i >= 0; i++) {
                    Collections.rotate(listOne, 1);
                    if (listOne.equals(listTwo)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
