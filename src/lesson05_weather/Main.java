package lesson05_weather;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Main {
    public static void main(String[] args) {
        int[] temperature = {10, 5, 3, 0, 22, 13, 16, 18};

        Year[] seasons = new Year[temperature.length / 4];
        for (int i = 0; i < temperature.length - 1; i++) {
// доработать
        }
        for (Year season : seasons) {
            System.out.println(season.toString());
        }
    }
}
