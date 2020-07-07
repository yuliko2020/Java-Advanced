package lesson04_hw;

/**
 * JavaAdvanced
 * 06/07/2020  16:41
 */
public class Main {
    public static void main(String[] args) {
        Plant[] plants = DBMockPlants.getPlants();

        for (Plant element : plants) {
            element.year();
            element.year(); //second year
        }
        System.out.println("- - - - - -");


    }
}
