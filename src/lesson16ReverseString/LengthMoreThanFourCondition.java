package lesson16ReverseString;

/**
 * JavaAdvanced
 * 18/08/2020
 */
public class LengthMoreThanFourCondition implements Condition {

    @Override
    public boolean test(String str) {
        return (str != null && str.length() > 4);
    }
}
