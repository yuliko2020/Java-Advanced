package lesson20200910HwBrackets;


public class Main {
    public static void main(String[] args) {
        BracketsBalanced balanced=new BracketsBalanced();
        System.out.println(balanced.isBalanced(""));//true
        System.out.println(balanced.isBalanced("()"));//true
        System.out.println(balanced.isBalanced("()[]{}"));//true
        System.out.println(balanced.isBalanced("(]"));//false
        System.out.println(balanced.isBalanced("([)]"));//false
        System.out.println(balanced.isBalanced("{[]}"));//true

    }
}
