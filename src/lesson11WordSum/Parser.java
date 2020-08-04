package lesson11WordSum;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 03/08/2020
 */
public class Parser {
    private Word[] words;

    public Parser(int[] array) {
        this.words = parseIntArray(array);
    }

    private Word[] parseIntArray(int[] array) {
        if (array != null) {
            Word[] tempWords = new Word[countWordsInArray(array)];
            int curArrayIndex = array.length - 1;
            int curTempWordsIndex = tempWords.length - 1;

            while (curTempWordsIndex >= 0) {

                boolean isCorrect = true;
                int expectedLen = array[curArrayIndex--];
                int[] securedWord = new int[expectedLen];
                int expectedSum = array[curArrayIndex--];
                if (array[curArrayIndex--] > 0) {
                    isCorrect = false;
                    return null;
                }
                int realSum = 0;
                for (int i = expectedLen - 1; i >= 0; i--) {
                    securedWord[i] = array[curArrayIndex--];
                    realSum += securedWord[i];
                }
                if (realSum != expectedSum) {
                    isCorrect = false;
                    return null;
                }

                if (isCorrect) {
                    tempWords[curTempWordsIndex--] = new Word(securedWord, realSum);
                } else {
                    tempWords[curTempWordsIndex--] = null;
                    System.out.println("error in array");
                }
            }
            return tempWords;
        }
        return null;
    }

    private int countWordsInArray(int[] array) {
        int res = 0;
        for (int i : array) {
            if (i < 0) {
                res++;
            }

        }
        return res;
    }

    @Override
    public String toString() {
        if (words != null) {
            return Arrays.toString(words);
        }else
            return " error array ";

    }

}
