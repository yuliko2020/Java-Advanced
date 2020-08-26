package lesson2508AlList;

import java.util.*;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 25/08/2020
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("qstr2");
        list.add("qstr3");
        list.add("str4");
        list.add("qstr5");
        list.add("str6");
        System.out.println(list);

        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("q")) {
                list.remove(i);
                i--;
            }
        }*/

        /*ListIterator<String> iterator = list.listIterator(); // correct remove-----
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("q")) {
                iterator.remove();
            }
        }*/

        //Predicate <String>predicate= new ConditionForRemove();

        //list.removeIf(new ConditionForRemove());

        //list.removeIf(s -> s.startsWith("q"));

        //System.out.println("----------remove-------");
        //System.out.println(list);

        //List<String> list1 = Arrays.asList("s1", "s2", "s3");
        //System.out.println(list1);

        Integer h = 10;
        Integer h1 = new Integer(10);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(10);
        list2.add(18);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        list2.add(121);
        list2.add(101);
        list2.add(181);



        //list2.addAll(Arrays.asList(1, 2, 3, 4)); or ==1
        //or ==2
        list2.addAll(list3);
        System.out.println(list2);


    }
}
