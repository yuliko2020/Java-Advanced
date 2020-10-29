package lesson20201006Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 * JavaAdvanced
 * 06/10/2020
 */
public class Anagram {

   private Map<String, List<String>> map;

   public Anagram(List<String> voc){
        map= buildMap(voc);
    }


   // vocabulary = {"anna","ivan","naan","vani","piotr","navi"
    //"anna" ->"naan"
    //"piotr"->{}
    //"anna"->"annna"  <- incorrect

    public List<String> getAnagram(String word) {
        String sortedWord = sortWord(word);
        return map.get(sortedWord);
    }

    private Map<String, List<String>> buildMap(List<String> voc) {
        Map<String, List<String>> ret = new HashMap<>();
        for (String w : voc) {
            String sortedWord = sortWord(w);
            List<String> list = ret.get(sortedWord);
            if (list == null) {
                list = new ArrayList<>();
                list.add(w);
                ret.put(sortedWord, list);
            } else {
                list.add(w);
            }
        }
        return ret;
    }

    private String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}
