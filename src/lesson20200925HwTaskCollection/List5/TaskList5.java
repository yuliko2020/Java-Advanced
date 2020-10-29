package lesson20200925HwTaskCollection.List5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class TaskList5 {
    public static void main(String[] args) {
        //Написать функцию, которая реверсирует список, возвращает список элементовв обратном порядке.
        // {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reversedList(list));

    }

    public static List<Integer> reversedList(List<Integer> list){
        Collections.reverse(list);
        return list;
    }

}
