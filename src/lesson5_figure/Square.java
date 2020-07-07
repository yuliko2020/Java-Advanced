package lesson5_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Square extends GeometricFigure {
    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Square(double a, double b) {
        super(a, b);
        x = Math.min(a, b);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return x * x;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * x;
    }
}

