package lesson20201006Anagram;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 06/10/2020
 */
public class AnagramTest {
    private List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", " annna");
    private Anagram anagram = new Anagram(VOC);

    @Test
    public void testAnagram() {

        String word = "anna";
        List<String> expected = Arrays.asList("anna", "naan");

        Anagram anagram = new Anagram(VOC);

        List<String> actual = anagram.getAnagram(word);

        assertEquals(expected, actual);

        /*anagram.getAnagram("ivan");
        anagram.getAnagram("vani");
        anagram.getAnagram("naan");*/
    }
}
