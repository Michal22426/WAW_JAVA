public class Square {
    static double width;
    static double height;
    static double area;

    public Square(double x, double y){ //constructor
        width = x;
        height = y;
    }
    public static double getWidth() {
        return width;
    }

    public static double getHeight() {
        return height;
    }

    public static double getArea() {
        return area;
    }
    public static void calculateArea(){
        area = width * height;
    }

}
