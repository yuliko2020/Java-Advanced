package lesson20200925HwTasksBeginner;

import java.util.Arrays;

public class TaskShiftLeft {
    public static void main(String[] args) {
        //Вернуть массив,смещенный влево на один индекс.
        // То ест для  {6, 2, 5, 3}вернуть {2,5, 3, 6}.
        // Можно вернуть измененный данный массив, а можно вернуть новый
        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));//→ 2, 5, 3, 6
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2})));// → 2, 1
        System.out.println(Arrays.toString(shiftLeft(new int[]{1})));//→ 1

    }
    public static int[] shiftLeft(int[] nums) {
        if(nums.length <= 1) return nums;

        int tmp = nums[0];
        for(int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = tmp;
        return nums;
    }
}
