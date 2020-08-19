package hotel;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class MyDate implements Comparable<MyDate> {
    public int compareTo;
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (compareTo != myDate.compareTo) return false;
        if (day != myDate.day) return false;
        if (month != myDate.month) return false;
        return year == myDate.year;
    }

    @Override
    public int hashCode() {
        int result = compareTo;
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);

    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    private static boolean checkMonth(int month) {
        return (month >= 0) && (month <= 12);
    }

    public static int getDayPerMont(int month, int year) {
        if (checkMonth(month)) {
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(year) && (month == 2)) {
                return 29;
            } else {
                return days[month];
            }
        } else {
            return 0;
        }

    }

    public int getDayPerMonth() {
        return getDayPerMont(this.month, this.year);
    }

    public int daysFromNewYear() {
        int rez = 0;
        for (int i = 1; i < this.month; i++) {
            rez += getDayPerMont(i, this.year);
        }
        rez += this.day;
        return rez;
    }

    public int daysToNewYear() {
        return getDaysPerYear() - this.daysFromNewYear();
    }

    public static int getDaysPerYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }

    public int getDaysPerYear() {
        return getDaysPerYear(this.year);
    }


    @Override
    public int compareTo(MyDate date) {
        int checkYears = this.year - date.year;
        int checkMonth = this.month - date.month;
        int checkDays = this.day - date.day;

        if (checkYears!=0){
            return checkYears;
        }else {                    // this.year - date.year;
            if (checkMonth !=0){
                return checkMonth;
            } else {               // this.month - date.month;
                return checkDays;
            }
        }


        /*if (checkYears == 0 && checkMonth == 0 && checkDays == 0) return 0;
        if (checkYears > 0 && checkMonth > 0) return 1;
        return -1;*/
    }
}
