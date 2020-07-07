package lesson5_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Circle extends GeometricFigure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double a, double b) {
        super(a, b);
        radius = Math.min(a, b) / 2;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}