package lesson20200910HwBrackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BracketsBalancedTest {
private BracketsBalanced bracketsBalanced = new BracketsBalanced();
    @Test
    public void givenNull_whenCheckingForBalance_shouldReturnFalse(){
        boolean result = bracketsBalanced.isBalanced(null);


    }
    public void givenEmpty_whenCheckingForBalance_shouldReturnTrue(){
        boolean result = bracketsBalanced.isBalanced("");


    }

}