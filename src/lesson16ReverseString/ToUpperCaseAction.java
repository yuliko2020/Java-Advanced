package lesson16ReverseString;

/**
 * JavaAdvanced
 * 18/08/2020
 */
public class ToUpperCaseAction implements Action{

    @Override
    public String doAction(String str) {
        return str.toUpperCase();
    }
}
