package lesson20200925HwTaskCollection.List1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1PersonTest {
    @Test
    public void getPersonAddress() {
        Address address1 = new Address("First", 1);
        Address address2 = new Address("Second", 2);
        Address address3 = new Address("Third", 3);
        List<Address> addresses = Arrays.asList(address1, address2, address3);

        Person person1 = new Person("Oleg", address1);
        Person person2 = new Person("Jack", address2);
        Person person3 = new Person("Pavel", address3);
        List<Person> person = Arrays.asList(person1, person2, person3);
        assertEquals(addresses, Task1Person.getAddress(person));
    }

    @Test
    public void getAddress_ListPersonIsNull() {
        List<Person> person =null;
        assertNull(Task1Person.getAddress(person));
    }

}