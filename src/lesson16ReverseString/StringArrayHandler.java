package lesson16ReverseString;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 17/08/2020
 */
public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition = condition;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public void stringsHandler() { // void change to StringArrayHandler+return this;
        for (int i = 0; i < strings.length; i++) {
            if (condition.test(strings[i])) {
                strings[i] = action.doAction(strings[i]);
            }

        }

    }

}
