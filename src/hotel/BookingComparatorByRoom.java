package hotel;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 10/08/2020
 */
public class BookingComparatorByRoom implements Comparator  <Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getRoom().getNumber().compareTo(o2.getRoom().getNumber());
    }
}
