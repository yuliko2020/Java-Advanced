package lesson1;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 29/06/2020  20:34
 */
public class MergeSort {
    public static void main(String[] args) {
        // [5,8,20,35,40] ---i
        // [2,4,15,48,70] ----j
        // [2,4,5,8,15,20,35,40,48,70]---Итог

        int[] array = getArray(15, 0, 30);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(" Array is sort " + isArraySort(array));
        System.out.println(Arrays.toString(array));

    }

    private static void sort(int[] array) {
        sort(array, 0, array.length);

    }

    private static void sort(int[] array, int from, int to) {
        if (to - from > 1) {
            int middle = (from + to) / 2;
            sort(array, from, middle);
            sort(array, middle, to);
            merge(array, from, middle, to);
        }
    }
    //from -start index for the first range [from....middle -1]
    // middle  -start index for the second range [middle ...]

    private static void merge(int[] array, int from, int middle, int to) {
        int[] arr1 = Arrays.copyOfRange(array, from, middle);
        int[] arr2 = Arrays.copyOfRange(array, middle, to);

        int x1 = 0, x2 = 0;
        int i = from;
        while (x1 < arr1.length && x2 < arr2.length) {
           /* if (arr1[x1] < arr2[x2]) {
                array[i] = arr1[x1++];
            }else {
                array[i]= arr2[x2++];

            }
            i++;*/
            array[i++] = (arr1[x1] < arr2[x2] ? arr1[x1++] : arr2[x2++]);

        }
        while (x1 < arr1.length) {
            array[i++] = arr1[x1++];
        }
        while (x2 < arr2.length) {
            array[i++] = arr2[x2++];

        }
    }

    public static int[] getArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    public static boolean isArraySort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }

        }
        return true;
    }


}
