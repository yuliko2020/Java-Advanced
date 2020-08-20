package lesson16_18ReverseString.actions;

import lesson16_18ReverseString.Action;

/**
 * JavaAdvanced
 * 17/08/2020
 */
public class ReverseStringAction implements Action {


    @Override
    public String doAction(String str) {
        if (str == null) return null;
        char[] chars = str.toCharArray();
        char[] res = new char[str.length()];
        for (int i = 0, j = res.length - 1; i < str.length(); i++, j--) {
            res[j] = chars[i];
        }
        return new String(res);
    }
}
