package lesson04_hw;

/**
 * JavaAdvanced
 * 06/07/2020  18:44
 */
public class DBMockPlants {
    private static Plant[] plants = {
            new Bush("Dogrose", 20),
            new Flower("Tulip", 0),
            new Tree("Apple tree", 140)};


    public static Plant[] getPlants() {
        return plants;
    }

}


