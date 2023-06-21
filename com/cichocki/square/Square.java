package com.cichocki.square;

/**
 * This class represents a square
 */
public class Square {
     double side;
     double area;
     double perimeter;

    /**
     * Below we have got many getters and setters to access and modify fields of our class
     */
    public void setSide(double side) {
        this.side = side;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
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

    /**
     * constructor
     */
    public Square(double x){
        setSide(x);
        calculateArea();
        calculatePerimeter();
    }

    /**
     * calculateArea method just calculates area of our square by multiplying two sides
     */
    public double calculateArea(){
        setArea(getSide() * getSide());
        return area;
    }
    /**
     * calculatePerimeter method calculates perimeter of our square by getting 4 times side of square
     */
    public double calculatePerimeter(){
        setPerimeter(4 * getSide());
        return perimeter;
    }


}
