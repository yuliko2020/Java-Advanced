package lesson20200925HwTasksBeginner;

public class TaskCountEvens {
    public static void main(String[] args) {
        //Вернуть количество четных чисел в массиве целых чисел.
        // Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.

        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));//3
        System.out.println(countEvens(new int[]{2, 2, 0}));//3
        System.out.println(countEvens(new int[]{1, 3, 5}));//0
    }
    public static int countEvens(int [] nums){
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                count++;
        }

        return count;

    }
}
