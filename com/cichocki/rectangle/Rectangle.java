package com.cichocki.rectangle;

public class Rectangle {
    double width;
    double height;
    double area;
    double perimeter;

    /**
     * constructor
     */
    public Rectangle(double x, double y){
        setWidth(x);
        setHeight(y);
        calculateArea();
        calculatePerimeter();
    }
    /**
     * Below we have got many getters and setters to access and modify fields of our class
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
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
    /**
     * calculateArea method calculates area of our rectangle by multiplying width and height
     */
    public double calculateArea(){
        setArea(getHeight() * getWidth());
        return area;
    }
    /**
     * calculatePerimeter method calculates perimeter of our rectangle by adding two times width and two times height
     */
    public double calculatePerimeter(){
        setPerimeter(2 * getWidth() + 2 * getHeight());
        return perimeter;
    }
}
