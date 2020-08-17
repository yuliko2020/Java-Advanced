package lesson15RemuveElement;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 13/08/2020
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        ArrayHandler arrayHandler = new ArrayHandler(arr);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("---------------");
        arrayHandler.remove3(3);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
    }
}
