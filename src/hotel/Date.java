package hotel;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   /* public int getDays() {
        return 5;
    }*/

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
