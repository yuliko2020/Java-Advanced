package lesson06_figure;

/**
 * JavaAdvanced
 * 07/07/2020
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Square s1 = new Square(5);
        Square s2 = new Square(10);
        Rectangle r1 = new Rectangle(5, 10);


        Shape[] shapes = new Shape[]{
                c1, c2, s1, s2, r1,
                new Rectangle(10, 3),
                new Square(18),

        };

        System.out.println("-------------" + s1.equals(s2));

        for (Shape shape : shapes) {
            System.out.println(shape);

            System.out.println(shape.area());

        }

    }
}
