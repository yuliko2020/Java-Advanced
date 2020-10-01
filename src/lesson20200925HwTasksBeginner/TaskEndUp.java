package lesson20200925HwTasksBeginner;


public class TaskEndUp {
    public static void main(String[] args) {
        //Дана строка, вернуть новую строку, где последние 3 символа в верхнем регистре(заглавные).
        // Если строка длины меньше 3, перевести это в заглавные.
        // endUp("Hello") → "HeLLO"
        // endUp("hi there") → "hi thERE"
        // endUp("hi") → "HI"

        System.out.println(endUp("Hello"));// → "HeLLO"
        System.out.println(endUp("hi there")); // → "hi thERE"
        System.out.println(endUp("hi"));// → "HI"

    }
    public static String endUp(String str) {
        if(str.length() < 3)
            return str.toUpperCase();

        return str.substring(0, str.length() - 3) +
                str.substring(str.length() - 3).toUpperCase();
    }
}
