package lesson06_weather;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Main {
    public static void main(String[] args) {
        int[] temperature = {10, 30, 20, 4, 22, 31, 16, -5, 11,40, 27, 1};

        Year[] years = new Year[temperature.length / 4]; // array object
        int index = 0; // index for array object
        for (int i = 0; i < temperature.length -3; i += 4) {
            years[index] = new Year(temperature[i], temperature[i + 1], temperature[i + 2], temperature[i + 3]);
            index++;
        }

        for (Year year : years) {
            System.out.println(year.toString());
        }
    }
}

