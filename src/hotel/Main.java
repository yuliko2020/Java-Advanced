package hotel;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30, 7, 2020),
                        new Date(10, 8, 2020))

        );

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Jack2"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))

        );

        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))

        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))

        );

        BookingList bookingList = new ArrayBookingList(2);
        //        bookingList.add(b1);
        //        bookingList.add(b2);
        //        bookingList.add(b3);
        //        bookingList.add(b4);
        //      bookingList.print();

        Booking [] bookings = new Booking []{ b1,b2,b3,b4 };
        Comparator <Booking > typeOfSorting;

        int key =4;
        switch (key){
            case 1:
                System.out.println("Sorting by date ");
                typeOfSorting = new BookingComparatorByDate();
                Arrays.sort(bookings,typeOfSorting);
            case 2:
                System.out.println("Sorting by name ");
                typeOfSorting = new BookingComparatorByName();
                Arrays.sort(bookings,typeOfSorting);

        }


    }


}
