package lesson20200925HwTaskCollection.List3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList3 {
    public static void main(String[] args) {
        //Есть два списка одинаковой длины с числами.
        // Написать функцию, которая вернет список с элементами Yes или No,
        // где значение на i-том месте зависит оттого,
        // равны ли элементы двух списков под номером i.
        // Например, {1, 2, 3, 4} и {5,2, 3, 8} вернет {No, Yes, Yes, No}

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 3, 8));

        System.out.println(compareListWithReturnElements(list1,list2));
    }

    public static List<String> compareListWithReturnElements
            (List<Integer> list1, List<Integer> list2) {
        List<String> result = new ArrayList<>();
        if (list1 == null || list2 == null) return new ArrayList<>();
        for (Integer integer1 : list1) {
            if (list2.contains(integer1)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result;
    }

}



