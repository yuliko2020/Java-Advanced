package hotel;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class DateInterval {
    private MyDate start;
    private MyDate finish;
    //private static Random rnd=new Random(System.currentTimeMillis());
    int days = 0;

    public DateInterval(MyDate start, MyDate finish) {
        if (start.compareTo(finish) > 0) {
            this.start = finish;
            this.finish = start;
        } else {
            this.start = start;
            this.finish = finish;
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DateInterval that = (DateInterval) o;

        if (days != that.days) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        return finish != null ? finish.equals(that.finish) : that.finish == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        result = 31 * result + days;
        return result;
    }

    public static boolean isIntersect(DateInterval interval1, DateInterval interval2) {
        return !((interval1.getStart().compareTo(interval2.getFinish()) > 0) ||
                (interval2.getStart().compareTo(interval1.getFinish()) > 0));


    }

    public MyDate getStart() {
        return start;
    }

    public MyDate getFinish() {
        return finish;
    }

    public boolean checkDatesIntervals(DateInterval dateOne, DateInterval dateTwo) {
        if (dateOne.getStart().equals(dateTwo.start) && dateTwo.getFinish().equals(dateTwo.finish)) {
            System.out.println("Booking dates are intersect");
        } else
            System.out.println("Booking dates are intersect");
        return false;
    }


    public int getDays() {
        /*int min =1;
        int max = 100;
        if (days==0){
            days = min+rnd.nextInt(max-min+1);
        }*/

        if (days == 0) {
            for (int i = start.getYear(); i < finish.getYear(); i++) {
                days += MyDate.getDaysPerYear(i);
            }
            days -= start.daysFromNewYear();
            days += finish.daysFromNewYear();
        }

        return days;
    }


    @Override
    public String toString() {
        return "[" + start + ';' + finish + ']';
    }





    /*public int getDays() {
        int days ;
        if (start.getYear() == finish.getYear()) {
            days = findDaysNumber(getStart().getYear(), start.getMonth(), start.getDay());
        } else {
            days = findDaysNumber( getFinish().getYear(), getFinish().getMonth(), getFinish().getDay());
        }

        return days;
    }


    public int findDaysNumber(int days, int month, int year) {
        int dayTemp = 0;
        for (int i = 0; i <days ; i++) {
            switch (month) {
                case 1:
                    dayTemp = 31;
                    break;
                case 2:
                    if (checkLeapYear(year) == 366) {
                        dayTemp = 29;
                    } else dayTemp = 28;
                    break;
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dayTemp = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dayTemp = 30;
                    break;
            }
        }
            return dayTemp;
        }

    public int checkLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return 366;
        } else
            return 365;
    }*/


}
