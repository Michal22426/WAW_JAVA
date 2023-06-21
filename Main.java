import com.cichocki.circle.Circle;
import com.cichocki.rectangle.Rectangle;
import com.cichocki.square.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        var S = new Square(side);
        System.out.println("Area of your square is: " + S.getArea());
        System.out.println("Perimeter of your square is: " + S.getPerimeter());
        //--------------------------------------------
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        var R = new Rectangle(width, height);
        System.out.println("Area of your rectangle is: " + R.getArea());
        System.out.println("Perimeter of your rectangle is: " + R.getPerimeter());
        //--------------------------------------------
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        var C = new Circle(radius);
        System.out.println("Area of your circle is: " + C.getArea());
        System.out.println("Perimeter of your circle is: " + C.getPerimeter());

    }
}
