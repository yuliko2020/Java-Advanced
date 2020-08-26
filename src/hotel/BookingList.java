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

    Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);

    int findBookingByIndex(Booking booking);


    Booking[] removeBookingByIndex(Booking booking);
}
