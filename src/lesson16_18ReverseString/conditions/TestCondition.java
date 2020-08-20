package lesson16_18ReverseString.conditions;

import lesson16_18ReverseString.Condition;

/**
 * JavaAdvanced
 * 19/08/2020
 */
public class TestCondition implements Condition {
    @Override
    public boolean test(String str) {
        return str != null && str.length() > 2;
    }
}
