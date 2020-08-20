package lesson16_18ReverseString.actions;

import lesson16_18ReverseString.Action;

/**
 * JavaAdvanced
 * 18/08/2020
 */
public class ToUpperCaseAction implements Action {

    @Override
    public String doAction(String str) {
        if (str==null){
            return null;
        }
        return str.toUpperCase();
    }
}
