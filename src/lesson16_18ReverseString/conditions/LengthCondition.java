package lesson16_18ReverseString.conditions;

import lesson16_18ReverseString.Condition;

/**
 * JavaAdvanced
 * 18/08/2020
 */
public class LengthCondition implements Condition {
    private int length;

    public LengthCondition(int length) {
        this.length = length;
    }

    @Override
    public boolean test(String str) {
        return (str != null && str.length() > length);
    }
}
