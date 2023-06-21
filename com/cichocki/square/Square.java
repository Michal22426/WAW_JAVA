package com.cichocki.square;

public class Square {
     double side;
     double area;
     double perimeter;

    public Square(double x){
        side = x;
        calculateArea();
        calculatePerimeter();
    }
    public  double getSide() {
        return side;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public  double getArea() {
        return area;
    }
    public void calculateArea(){
        area = getSide() * getSide();
    }
    public void calculatePerimeter(){
        perimeter = 4 * getSide();
    }


}
