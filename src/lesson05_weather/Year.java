package lesson05_weather;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Year {
    private int spring;
    private int summer;
    private int autumn;
    private int winter;



    public Year(int spring, int summer, int autumn, int winter) {
        this.spring = spring;
        this.summer = summer;
        this.autumn = autumn;
        this.winter = winter;
    }



    @Override
    public String toString() {
        return "Seasons{" +
                "spring=" + spring +
                ", summer=" + summer +
                ", autumn=" + autumn +
                ", winter=" + winter +
                '}';
    }
}
