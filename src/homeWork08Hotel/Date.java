package homeWork08Hotel;

/**
 * JavaAdvanced
 * 26/07/2020
 */
public class Date {
    int day;
    String month;
    int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
