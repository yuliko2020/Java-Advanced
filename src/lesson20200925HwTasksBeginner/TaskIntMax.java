package lesson20200925HwTasksBeginner;


public class TaskIntMax {
    public static void main(String[] args) {
        //Даны три целых числa  a b c, вернуть наибольшее.
        // intMax(1, 2, 3) → 3intMax(1, 3, 2) → 3  intMax(3, 2, 1) → 3

        System.out.println(intMax(1, 2, 3)); // → 3
        System.out.println(intMax(3, 2, 1)); // → 3

    }

    public static int intMax(int a, int b, int c) {
        if (a >=b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else return c;
    }

}
