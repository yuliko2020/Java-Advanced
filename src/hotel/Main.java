package hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new MyDate(30, 7, 2020),
                        new MyDate(10, 8, 2020))

        );

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Jack2"),
                new DateInterval(new MyDate(11, 8, 2020),
                        new MyDate(13, 8, 2020))

        );

        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new MyDate(11, 8, 2020),
                        new MyDate(13, 8, 2020))

        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new MyDate(11, 8, 2020),
                        new MyDate(13, 8, 2020))

        );

        List<Booking> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        System.out.println(list);

        System.out.println("-----remove--------");
        list.remove(2);
        System.out.println(list);



        /*Booking[] bookings = list.toArray(new Booking[list.size()]);
        list.toArray(bookings);
        System.out.println();*/


/*
        BookingList bookingList = new ArrayBookingList(2);
        bookingList.add(b4);
        bookingList.add(b2);
        bookingList.add(b3);
        bookingList.add(b1);
        bookingList.print();
        System.out.println("--------------------");


        Booking[] bookings = bookingList.getSortedArray(new BookingComparatorByName());
        bookingList.print();
        System.out.println();
        System.out.println(Arrays.toString(bookings));

        bookingList.removeBookingByIndex(b2);
        bookingList.print();
*/
    }


}
