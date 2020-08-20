package lesson16_18ReverseString.conditions;

import lesson16_18ReverseString.Condition;

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
