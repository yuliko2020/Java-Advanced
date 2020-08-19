package hotel;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JavaAdvanced
 * 04/08/2020
 */
public class ArrayBookingList implements BookingList {
    private Booking[] bookings;
    private int size = 0; // кол эл кот
    private int capacity = 3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }

    @Override
    public void add(Booking booking) { //позволяет добавлять по одному большое количество
        if (size < capacity) {
            bookings[size++] = booking;//если массив расширился, то увеличить size
        } else {
            capacity *= 2;
            Booking[] temp = new Booking[capacity];
            for (int i = 0; i < bookings.length; i++) {
                temp[i] = bookings[i];
            }
            bookings = temp;
            bookings[size++] = booking;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookings[i]);
        }

    }
    /*//___???______________________________________
    public Booking findBooking(Booking booking) {
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i].equals(booking)) {
                System.out.println("Booking : ");
                return bookings[i];
            }
        }
        System.out.println("Booking not found");
        return null;
    }*/

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        Booking[] res = Arrays.copyOf(bookings, bookings.length);
        Arrays.sort(res, comparator);
        return res;
    }

    @Override
    public Booking getByIndex(int i) {
        if (i < 0 || i > size - 1) {
            return null;
        } else {
            return bookings[i];
        }


    }

    @Override
    public int findIndexToRemoveBooking(Booking booking) {
        for (int i = 0; i < bookings.length; i++) {
            if (booking.equals(bookings[i])) {
                return i;
            }


        }


        return -1;
    }

    @Override
    public Booking[] removeBookingByIndex(Booking booking) {
        int bookingIndex = findIndexToRemoveBooking(booking);
        Booking[] res =  new Booking[bookings.length];
        if ((bookingIndex >= 0) && (bookingIndex < bookings.length)) {
            res = new Booking[bookings.length - 1];
            for (int i = 0, j = 0; i < bookings.length; i++) {
                if (i != bookingIndex) {
                    res[j++] = bookings[i];

                }
                bookings = res;
            }

        }
        return res;
    }

}

