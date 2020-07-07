package lesson5_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 1);
        System.out.println(circle.getName() + " " + circle.getRadius());
        Triangle triangle = new Triangle(4, 4);
        System.out.println(triangle.getName() +" "+ triangle.getLeg());
        Square square = new Square(7, 7);
        System.out.println(square.getName() +" "+ square.getSquare());


    }
}