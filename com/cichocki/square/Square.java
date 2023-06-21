package com.cichocki.square;

public class Square {
     double width;
     double area;
     double perimeter;

    public Square(double x){ //constructor
        width = x;
        calculateArea();
        calculatePerimeter();
    }
    public  double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public  double getArea() {
        return area;
    }
    public void calculateArea(){
        area = getWidth() * getWidth();
    }
    public void calculatePerimeter(){
        perimeter = 4 * getWidth();
    }


}
