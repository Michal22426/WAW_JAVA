package com.cichocki.square;

public class Square {
     double side;
     double area;
     double perimeter;

    public void setSide(double side) {
        this.side = side;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Square(double x){
        setSide(x);
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
    public double calculateArea(){
        setArea(getSide() * getSide());
        return area;
    }
    public double calculatePerimeter(){
        setPerimeter(4 * getSide());
        return perimeter;
    }


}
