package lesson20200925HwTaskCollection.List6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList6 {
    public static void main(String[] args) {
         //Объединить два списка в один.
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        System.out.println(combineTwoList(listOne,listTwo));
    }

    public static List<Integer> combineTwoList(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> newList = new ArrayList<>(listOne);
        newList.addAll(listTwo);
        return newList;
    }
}
