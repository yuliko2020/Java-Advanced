package lesson20200925HwTasksBeginner;

public class TaskSum2 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Вернуть сумму двух первых элементов массива.
        // Если длина массива меньше двух,
        // вернуть сумму всех элементов. Вернуть 0, если длина массива равна нулю.
        System.out.println(sum2(new int[]{1, 2, 3}));//3
        System.out.println(sum2(new int[]{1, 1}));//2
        System.out.println(sum2(new int[]{1, 1, 1, 1}));//2
    }

    public static int sum2(int[] nums) {
        int x = nums.length;

        if(x == 0){
            return 0;
        }else if(x == 1){
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }

    }

}
