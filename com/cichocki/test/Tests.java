package com.cichocki.test;

import com.cichocki.circle.Circle;
import com.cichocki.rectangle.Rectangle;
import com.cichocki.square.Square;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void squareAreaCalculatingTest(){
        Square S = new Square(5);
        Assert.assertTrue(S.calculateArea() == 25);
    }
    @Test
    public void squarePerimeterCalculatingTest(){
        Square S = new Square(4);
        Assert.assertTrue(S.calculatePerimeter() == 16);
    }
    @Test
    public void rectangleAreaCalculatingTest(){
        Rectangle R = new Rectangle(5, 4);
        Assert.assertTrue(R.calculateArea() == 20);
    }
    @Test
    public void rectanglePerimeterCalculatingTest(){
        Rectangle R = new Rectangle(2, 5);
        Assert.assertTrue(R.calculatePerimeter() == 14);
    }
    @Test
    public void circleAreaCalculatingTest(){
        double delta = 0.1;
        double expected = 113.04;
        Circle C = new Circle(6);
        Assert.assertEquals(expected, C.calculateArea(), delta);
    }
    @Test
    public void circlePerimeterCalculatingTest(){
        double delta = 0.1;
        double expected = 50.24;
        Circle C = new Circle(8);
        Assert.assertEquals(expected, C.calculatePerimeter(), delta);
    }
}
