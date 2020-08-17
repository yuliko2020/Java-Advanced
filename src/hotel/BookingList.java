package hotel;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 10/08/2020
 */
public interface BookingList {
    void add(Booking booking);

    int size();

    void print();

    //Booking getBookingByIndex(int index);
    //Booking findBooking(Booking booking);
    Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);

    int findIndexToRemoveBooking(Booking booking);

    Booking[] removeBookingByIndex(Booking booking);
}
