package com.cichocki.circle;

public class Circle {
    double radius;
    double area;
    double perimeter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Circle(double r){
        setRadius(r);
        calculateArea();
        calculatePerimeter();
    }
    public double calculateArea(){
        setArea(Math.PI * getRadius() * getRadius());
        return area;
    }
    public double calculatePerimeter(){
        setPerimeter(2 * Math.PI * getRadius());
        return perimeter;
    }


}
