package com.cichocki.rectangle;

public class Rectangle {
    double width;
    double height;
    double area;
    double perimeter;

    public Rectangle(double x, double y){
        width = x;
        height = y;
        calculateArea();
        calculatePerimeter();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public  double getArea() {
        return area;
    }
    public void calculateArea(){
        area = getHeight() * getWidth();
    }
    public void calculatePerimeter(){
        perimeter = 2 * getWidth() + 2 * getHeight();
    }
}
