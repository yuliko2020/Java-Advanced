package homeWork08Hotel;


import java.util.Arrays;

/**
 * JavaAdvanced
 * 26/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Irina Shves", 25);
        Room room1 = new Room(21, 2, "double bad", 90);
        Date dStart = new Date(3, "July", 2020);
        Date dFinish = new Date(10, "July", 2020);

        Person person2 = new Person("Misha Shves", 30);
        Room room2 = new Room(21, 2, "double bad", 90);
        Date dStart2 = new Date(3, "July", 2020);
        Date dFinish2 = new Date(10, "July", 2020);

        Booking booking1 = new Booking(person1, room1, dStart, dFinish);
        System.out.println("Information of " + booking1.toString());
        Booking booking2 = new Booking(person2,room2,dStart2,dFinish2);
        System.out.println("Information of " + booking2.toString());



    }


}
