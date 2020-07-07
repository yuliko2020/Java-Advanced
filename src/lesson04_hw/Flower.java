package lesson04_hw;

public class Flower extends Plant {
    private int springGrowth = 20;
    private int summerGrowth = 10;

    public Flower(String name, int startGrowth) {
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
        return 0;
    }
    @Override
    public int getWinterGrowth() {
        return 0;
    }
}
