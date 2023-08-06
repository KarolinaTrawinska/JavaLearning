import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Test square = new Test(new Point[]{
                new Point(0, 0),
                new Point(10, 0),
                new Point(10, 10),
                new Point(0, 10),
        });

        Test otherSquare = new Test(new Point[] {
                new Point(2,2),
                new Point(2, 4),
                new Point( 4, 2),
                new Point(4, 4),
        });

        Test rectangle = new Test(new Point[] {
                new Point(0, 0),
                new Point(0, 10),
                new Point(10, 20),
                new Point(20, 10),
        });

        Test otherRectangle = new Test(new Point[] {
                new Point(0, 0),
                new Point(0, 10),
                new Point(10, 20),
                new Point(20, 10),
        });

        System.out.println(square.equals(otherSquare));
        System.out.println(square.equals(rectangle));
        System.out.println(rectangle.equals(otherSquare));
        System.out.println(rectangle.equals(otherRectangle));
        System.out.println(square.equals(null));
    }
}