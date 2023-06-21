import com.cichocki.square.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of square");
        double side = scanner.nextDouble();
        var S = new Square(side);
        System.out.println(S.getArea());
        System.out.println(S.getPerimeter());

    }
}
