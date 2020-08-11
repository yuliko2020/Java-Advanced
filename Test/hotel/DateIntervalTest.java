package hotel;

import org.junit.Assert;
import org.junit.Test;

/**
 * JavaAdvanced
 * 10/08/2020
 */
public class DateIntervalTest {

    @Test
    public void dateFinishShouldBeAfterStart() {
        Date d1 = new Date(30, 8, 2020);
        Date d2 = new Date(10, 8, 2020);
        DateInterval dateInterval = new DateInterval(d1, d2);
        boolean res = dateInterval.getStart().equals(d2) &&
                dateInterval.getFinish().equals(d1);

        Assert.assertTrue(res);

    }

    @Test
    public void dateFinishShouldBeAfterStart2() {
        Date d2 = new Date(30, 8, 2020);
        Date d1 = new Date(10, 8, 2020);
        DateInterval dateInterval = new DateInterval(d1, d2);
        boolean res = dateInterval.getStart().equals(d1) &&
                dateInterval.getFinish().equals(d2);

        Assert.assertTrue(res);

    }

    @Test  // na peresechenie interval
    public void isIntersectTrueTest() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval1 = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 8, 2020);
        Date finish2 = new Date(15, 9, 2020);
        DateInterval dateInterval2 = new DateInterval(start2, finish2);

        Assert.assertTrue(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));
    }

    @Test  // na peresechenie interval
    public void isIntersectTrueTest1() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval1 = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 8, 2020);
        Date finish2 = new Date(15, 9, 2020);
        DateInterval dateInterval2 = new DateInterval(start2, finish2);

        Assert.assertTrue(DateInterval.isIntersect(
                dateInterval2,
                dateInterval1
        ));
    }

    @Test  // na peresechenie interval
    public void isIntersectTrueTest2() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval1 = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 9, 2020);
        Date finish2 = new Date(20, 9, 2020);
        DateInterval dateInterval2 = new DateInterval(start2, finish2);

        Assert.assertTrue(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));
    }


    @Test
    public void isIntersectFalseTest() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval1 = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 9, 2020);
        Date finish2 = new Date(20, 9, 2020);
        DateInterval dateInterval2 = new DateInterval(start2, finish2);

        Assert.assertFalse(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));

    }
    @Test
    public void isIntersectFalseTest2() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval1 = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 9, 2020);
        Date finish2 = new Date(20, 9, 2020);
        DateInterval dateInterval2 = new DateInterval(start2, finish2);

        Assert.assertFalse(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));

    }


}