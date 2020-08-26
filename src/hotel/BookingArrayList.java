package hotel;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * JavaAdvanced
 * 26/08/2020
 */
public  class BookingArrayList implements BookingList {
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

    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        return new Booking[0];
    }

    @Override
    public Booking getByIndex(int i) {
        return null;
    }

    @Override
    public int findBookingByIndex(Booking booking) {
        return list.indexOf(booking);
    }


    public Booking[] removeBookingByIndex(Booking booking) {
        return new Booking[0];
    }
}