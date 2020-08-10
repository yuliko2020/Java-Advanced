package hotelClassWork;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 10/08/2020
 */
public class BookingComparatorByDate  implements Comparator <Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateInterval().getDays() - o2.getDateInterval().getDays();
    }
}
