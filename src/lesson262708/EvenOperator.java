package lesson262708;

import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 27/08/2020
 */
public class EvenOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        if (s == null) return null;
        StringBuilder sRes=new StringBuilder(s.length());
        for (int i = 1; i <s.length();i+=2){
            sRes.append(s.charAt(i));

        }
        return sRes.toString();
    }
}
