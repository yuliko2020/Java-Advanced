package lesson20200915;


import java.util.*;

/**
 * JavaAdvanced
 * 15/09/2020
 */
public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Q", "w", "e","Q");
        List<String> list2 = Arrays.asList("w", "Q", "e","Q");

        System.out.println(list1.equals(list2));

        Set<String> hashSet1 = new HashSet<>(list1);
        Set<String> hashSet2 = new HashSet<>(list2);
        System.out.println(hashSet1.equals(hashSet2)&&(list1.size()==list2.size()));

        Map  <String,Integer> map=new HashMap<>();
        for (String st:list1){
            Integer i = map.get(st);
            if (i==null){
                map.put(st,1);
            }else {
                map.put(st,++i);
            }
        }
        System.out.println(map);

        for (String st:list2){
            Integer i = map.get(st);
            if (i==null){
                System.out.println("list not equal");
            }else {
                i--;
                if (i.equals(0)){
                    map.remove(st);
                }else {
                    map.put(st,i);
                }
            }
        }
        System.out.println(map);

        Map  <String,Boolean> map3=new HashMap<>();
        for (String st:list1){
            if (map3.containsKey(st)){
                map3.put(st,true);
            }else {
                map3.put(st,false);
            }
        }
        System.out.println(map3);


    }
}
