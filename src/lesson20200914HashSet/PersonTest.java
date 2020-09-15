package lesson20200914HashSet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 15/09/2020
 */
class PersonTest {
    @Test
    public void testEquals_True(){
        Person person =new Person("Svetlana");
        Person person1 = new Person("Svetlana");
        assertTrue(person.equals(person1)&&person1.equals(person));
        assertTrue(person.hashCode()==person1.hashCode());

    }

    @Test
    public void testEquals_False(){
        Person person =new Person("Svetlana");
        Person person1 = new Person("Olga");
        assertFalse(person.equals(person1)&&person1.equals(person));
        assertFalse(person.hashCode()==person1.hashCode());

    }


}