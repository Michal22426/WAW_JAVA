package com.cichocki.circle;
/**
 * This class represents a circle
 */
public class Circle {
    double radius;
    double area;
    double perimeter;

    /**
     * Below we have got many getters and setters to access and modify fields of our class
     */
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

    /**
     * constructor
     */
    public Circle(double r){
        setRadius(r);
        calculateArea();
        calculatePerimeter();
    }
    /**
     * calculateArea method calculates area of our circle by multiplying Pi number and squared radius
     */
    public double calculateArea(){
        setArea(Math.PI * getRadius() * getRadius());
        return area;
    }
    /**
     * calculatePerimeter method calculates perimeter of our circle by multiplying 2 times Pi number and radius of circle
     */
    public double calculatePerimeter(){
        setPerimeter(2 * Math.PI * getRadius());
        return perimeter;
    }


}
