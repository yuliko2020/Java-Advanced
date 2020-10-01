package lesson20200925HwTasksBeginner;


public class TaskDiff21 {
    public static void main(String[] args) {
        //Дано целое число n​, вернуть абсолютную разницу между n и 21,
        // но вернуть удвоенную разницу, если n больше 21.
        // Например:diff21(19) → 2diff21(10) → 11diff21(21) → 0diff21(25) → 8
        System.out.println(diff21(19)); //2
        System.out.println(diff21(10)); //11
        System.out.println(diff21(21)); //0
        System.out.println(diff21(25)); //8

    }
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
