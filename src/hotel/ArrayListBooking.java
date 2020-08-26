package hotel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * JavaAdvanced
 * 26/08/2020
 */
public class ArrayListBooking implements BookingList {
    List<Booking> list = new ArrayList<>();

    @Override
    public void add(Booking booking) {
        list.add(booking);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void print() {
        for (Booking e : list) {
            System.out.println(e.toString());
        }
    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        Booking[] bookings = list.toArray(new Booking[list.size()]);
        list.sort(comparator);
        return bookings;

    }

    @Override
    public Booking getByIndex(int i) {
        if (i < 0 || i > list.size()) {
            return null;
        } else {
            return list.get(i);
        }

    }

    @Override
    public int findBookingByIndex(Booking booking) {
        for (int i = 0; i < list.size(); i++) {
            if (booking.equals(list.get(i))) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public Booking[] removeBookingByIndex(Booking booking) {
        return (new Booking[list.size()]);
    }
}
