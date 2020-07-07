package lesson06_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public String toString() {
        return "Square : side = " + side + "area =" + area();
    }

}
