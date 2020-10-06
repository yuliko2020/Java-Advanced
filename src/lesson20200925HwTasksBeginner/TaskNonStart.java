package lesson20200925HwTasksBeginner;

public class TaskNonStart {
    public static void main(String[] args) {
        //Даны две строки, вернуть их конкатенацию,
        // но без первого символа в каждой. Строки ненулевой длины.
        System.out.println(nonStart("Hello", "There"));// → "ellohere"
        System.out.println(nonStart("java", "code"));// → "avaode"
        System.out.println(nonStart("short", "java"));//"hotlava"

    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

}
