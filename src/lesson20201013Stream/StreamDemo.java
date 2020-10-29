package lesson20201013Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "abc", "efghk", "c", "cb");
//        strings.stream().mapToInt(String::length).sum();
//        strings.stream().filter(s -> s.length() >= 2).forEach(System.out::println);

        Stream<String> stream = strings.stream().filter(s -> s.length() > 2);
        List<String>list = stream.map(s->s.substring(0,2)).collect(Collectors.toList());
        System.out.println(list);

        Set <String> collect = strings.stream()
                .filter(s->s.length() >2)
                .map(s-> s.substring(1,2))
                .collect(Collectors.toSet());
        System.out.println(collect);

//        List<String> collect = stream.collect(Collectors.toList());
//        System.out.println(collect);
//        Stream<String> stream1 = strings.stream().filter(s -> s.length() > 2);
//        Set<String> set = stream1.collect(Collectors.toSet());
//        System.out.println(set);


//        Map<Integer, List<String>> collect1 = strings.stream().collect(Collectors.groupingBy
//                (String::length));
//        collect1.forEach((k, v) -> System.out.println(k + " = " + v));


//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
//        Integer reduce = ints.stream().reduce(5, (x, y) -> x*y);
//                System.out.println(reduce);
       /* {
            System.out.println("x= " + x + " y = " + y); // detailed output of elements for printing
            return x * y;
        });*/

        // int sum = intStream.sum(); can use sum or can use reduce
    }

    public static Integer getStringLength(String input) {
        System.out.println("string = " + input);
        return input.length();
    }

}
