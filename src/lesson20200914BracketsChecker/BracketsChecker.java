package lesson20200914BracketsChecker;

import java.util.Stack;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 14/09/2020
 */
public class BracketsChecker implements Predicate<String> {
private  char [][] brackets={
        {'(',')'},
        {'[',']'},
        {'{','}'},

};
    @Override
    public boolean test(String s) {
        if (s == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.trim().toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                char oppositeCh = getOpenBracket(ch);//}->{ )->( ]->[ ->' '
                if ((oppositeCh != ' ') &&
                        ((stack.size() == 0) || (!stack.pop().equals(oppositeCh)))) {
                    return false;
                }
            }

        }
        return (stack.size() == 0);
    }

    private char getOpenBracket(char ch) {
        for (char[]bracket:brackets){
            if (ch==bracket[1]){
                return bracket[0];
            }
        }
        return ' ';
    }


    private boolean isOpenBracket(char ch) {
        for (char[]bracket:brackets){
            if (ch==bracket[0]){
                return true;
            }
        }
        return false;
    }
}
