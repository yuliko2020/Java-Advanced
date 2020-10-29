package lesson20201008lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * JavaAdvanced
 * 08/10/2020
 */
public class Demo {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        DemoInterface demo = new DemoImpl();
        System.out.println(demo.transform(5));

        String someString = DemoInterface.SOME_STRING;

        DemoInterface dia = new DemoInterface() {
            @Override
            public String getString(int i) {
                return String.valueOf(i);
            }
        };

        DemoInterface di = (a) -> String.valueOf(a);
        //"abc"->3

        Function<String, Integer> f1 = (s) -> s.length();
        Integer hello = f1.apply("hello");
        //5->25
        Function<Integer, Integer> f2 = (a) -> a * a;
        System.out.println(f2);
        //"abc"->false
        //"aabc"->true
        Predicate<String> f3 = (s) -> s.length() % 2 == 0;
        System.out.println(f3.test("aaa"));
        Consumer<String> f4 = (s) -> System.out.println(s);
        Supplier<Integer> f5 = () -> (int) (Math.random());

        Function<Integer, Integer> ff1 = (a) -> a * a;
        soSumeMath(ff1, 10);

        Function<Integer, Integer> ff2 = (a) -> a * 10;
        soSumeMath(ff2, 24);

        Function<Integer, Integer> ff3 = (a) -> a % 2 == 0 ? 1 : -1;
        soSumeMath(ff3, 56);

        Function<String, String> getString = Demo::getString;//referents(Здесь операция присваивания)
        getString.apply("qwertz");
        Function<String, String> getStringL = (s) -> s;//lambda
        //transformString((s) -> s, "abc");
        //transformString(Demo::getString, "abc");
        transformString(getString, "abc");
        transformString(getStringL, "abc");

        Function<String, String> type = Person::type;
        Person p = new Person("Ivan");
        Supplier<String> getName = p::getName;
        System.out.println(getName.get());
        Function<Person, String> getName1 = Person::getName;
        System.out.println(getName1.apply(p));

        //Supplier <Person>person = Person::new; ссылка на конструктор

    }

    public static int getInt(int a) {
        return a % 2 == 0 ? 1 : -1;
    }

    public static String transformString(Function<String, String> f, String s) {
        return f.apply(s);
    }


    public static int soSumeMath(Function<Integer, Integer> f, int a) {
        System.out.println(a);
        return f.apply(a);
    }
    /*public static int soSumeMath2(int a) {
        System.out.println(a);
        int i = a * 10;
        return i;
    }
    public static int soSumeMath3(int a) {
        return a % 2 == 0 ? 1 : -1;
    }*/

    public static String getString(String input) {
        return input;
    }
}
