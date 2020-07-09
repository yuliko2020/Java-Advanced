package lesson06_weather;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Main {
    public static void main(String[] args) {
        int[] temperature = {3, 27, 11, -22, 10, 27, 5, -9, 8, 9, 8, -2};

        YearTemperature[] years = new YearTemperature[temperature.length / 4];
        int index = 0;

        for (int i = 0; i < temperature.length-3; i += 4) {
            years[index++] = new YearTemperature(
                    temperature[i],
                    temperature[i + 1],
                    temperature[i + 2],
                    temperature[i + 3]);
        }


        for (YearTemperature yearTemperature : years) {
            System.out.println(yearTemperature.toString());
        }

    }
}

