package lesson20200925HwTasksBeginner;

public class TaskMiddleTwo {
    public static void main(String[] args) {
        //Дана строка четной длины. Вернуть строку из двух центральных символов,
        // например строка "string" превратиться в "ri". Длина входной строки минимум 2
        System.out.println(middleTwo("string"));// → "ri"
        System.out.println(middleTwo("code"));// → "od"
        System.out.println(middleTwo("Practice"));// → "ct"

    }
    public static String middleTwo(String str){
        int mid = str.length() / 2;

        String beforeMid = str.substring(mid-1, mid);
        String afterMid = str.substring(mid, mid+1);

        return beforeMid + afterMid;

    }

}
