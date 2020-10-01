package lesson20200925HwTasksBeginner;

public class TaskCommonEnd {
    public static void main(String[] args) {
        //Даны два массива целых чисел. Вернуть true если у них одинаковый первый или
        // последний элемент.
        // Оба массива длины 1 или более.
        // commonEnd([1, 2, 3], [7, 3]) → true
        // commonEnd([1, 2, 3],[7, 3, 2]) → false
        // commonEnd([1, 2, 3], [1, 3]) → true

        System.out.println(commonEnd(new int[]{1,2,3},new int[] {7,3} ));
        System.out.println(commonEnd(new int[]{1,2,3},new int[] {7,3,2} ));
        System.out.println(commonEnd(new int[]{1,2,3},new int[] {1,3} ));

    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
}