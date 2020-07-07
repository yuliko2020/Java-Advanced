package lesson04_hw;

/**
 * JavaAdvanced
 * 06/07/2020  16:18
 */
public class Tree extends Plant {
    private int springGrowth = 15; //атрибуты объекта, состояние, в котором находится объект
    private int summerGrowth = 15;
    private int autumnGrowth = 5;
    private int winterGrowth = 5;

    public Tree(String name, int startGrowth) {
        super(name, startGrowth);
    }

    @Override
    public int getSpringGrowth() {
        return springGrowth;
    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    @Override
    public int getWinterGrowth() {
        return winterGrowth;
    }
}
