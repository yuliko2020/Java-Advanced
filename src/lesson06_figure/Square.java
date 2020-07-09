package lesson06_figure;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
