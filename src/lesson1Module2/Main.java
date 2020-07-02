package lesson1Module2;

/**
 * TelRanJavaBasicModulOne
 * 29/06/2020  19:04
 */
public class Main {

    public static void main(String[] args) {
        method(4);
     // Для собеседования - принцип работы
    }

    public static int method(int temp) {
        System.out.println("Start temp =" + temp);
        if (temp > 1) {
            method(temp / 2);
            method(temp / 4);
        }
        System.out.println("Finish  temp =" + temp);
        return 1;
    }

}
