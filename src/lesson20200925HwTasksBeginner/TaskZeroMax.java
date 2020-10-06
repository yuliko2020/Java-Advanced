package lesson20200925HwTasksBeginner;

import java.util.Arrays;

public class TaskZeroMax {
    public static void main(String[] args) {
        //Вернуть версию входного массива, где каждое нулевое значение заменено максимальным
        // нечетным значением, справа от нуля.
        // Если нечетных числе справа от нуля нет, то оставляем ноль

        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3}))); // 5,5,3,3
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3}))); // 3,4,3,3
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 1, 0})));// 1,1,0
    }

    public static int[] zeroMax(int[] nums) {
        int i = nums.length - 1;
        while (i >= 0 && nums[i] % 2 == 0)
            i--;
        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] == 0)
                nums[j] = nums[i];
            if (nums[j] % 2 == 1 && nums[j] > nums[i])
                i = j;
        }
        return nums;
    }
}
