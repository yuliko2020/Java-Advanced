package hotel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * JavaAdvanced
 * 11/08/2020
 */
public class ArrayBookingListTest {
    BookingList bookingList;
    Booking b1;
    Booking b2;
    Booking b3;

    @Before // -  метод будет выполняться перед каждым тестом
    public void initBookingList() {
        b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Nick3"),
                new DateInterval(new MyDate(5, 8, 2020),
                        new MyDate(10, 8, 2020))

        );

        b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick1"),
                new DateInterval(new MyDate(22, 7, 2020),
                        new MyDate(13, 8, 2020))

        );

        b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick2"),
                new DateInterval(new MyDate(16, 7, 2020),
                        new MyDate(13, 8, 2020))

        );

        ArrayList<Booking> list =  new ArrayList<>();
        //bookingList = new ArrayBookingList(3);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
    }

   @Test // test not working
    public void removeBooking() {
        //BookingList bookingList = new ArrayBookingList(3);
        Booking[] resArray = bookingList.removeBookingByIndex(b1);
        Booking[] shouldArray = {b2, b3};
        Assert.assertArrayEquals(resArray, shouldArray);
    }

    @Test
    public void getByIndexCorrectReturnBooking() {
        Assert.assertEquals("the first element fail", b1, bookingList.getByIndex(0));
        Assert.assertEquals("get element fail ", b2, bookingList.getByIndex(1));
        Assert.assertEquals("the last element fail", b3, bookingList.getByIndex(2));
    }

    @Test
    public void getByIndexNotCorrectIndexReturnNull() {
        Assert.assertTrue("negative index not ok", bookingList.getByIndex(-1) == null);
        Assert.assertTrue("bigger index not ok", bookingList.getByIndex(3) == null);
    }

    @Test
    public void addCorrectSizeIncrementAndBookingAdd() {
        Booking booking = new Booking(new SuiteRoom("4", 2),
                new Person("Nick222"),
                new DateInterval(new MyDate(15, 8, 2020),
                        new MyDate(13, 8, 2020)));
        bookingList.add(booking);
        Assert.assertEquals(4, bookingList.size());
        Assert.assertEquals(booking, bookingList.getByIndex(3));

    }

    @Test
    public void addToEmptyBookingListCorrectAdded() {
        //BookingList bookingList = new ArrayBookingList(1);
        bookingList.add(b1);
        Assert.assertEquals(1, bookingList.size());
        bookingList.add(b2);
        Assert.assertEquals(2, bookingList.size());
        Assert.assertEquals(b1, bookingList.getByIndex(0));
        Assert.assertEquals(b2, bookingList.getByIndex(1));
    }


    @Test
    public void getSortedByNameArrayTest() {
        Comparator<Booking> comparator = new BookingComparatorByName();
        Booking[] resArray = bookingList.getSortedArray(comparator);
        Booking[] shouldArray = {b2, b3, b1};
        Assert.assertArrayEquals(shouldArray, resArray);

    }

    @Test
    public void getSortedByDateStartArrayTest() {
        Comparator<Booking> comparator = new BookingComparatorByDateStart();
        Booking[] resArray = bookingList.getSortedArray(comparator);
        Booking[] shouldArray = {b3, b2, b1};
        Assert.assertArrayEquals(shouldArray, resArray);

    }


}
