package lesson5_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public abstract class GeometricFigure {
    private double a;
    private double b;

    public GeometricFigure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract String getName();

    public abstract double getSquare();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
