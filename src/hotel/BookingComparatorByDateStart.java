package hotel;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 10/08/2020
 */
public class BookingComparatorByDateStart implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateInterval().getStart().compareTo(o2.getDateInterval().getStart());
    }
}
