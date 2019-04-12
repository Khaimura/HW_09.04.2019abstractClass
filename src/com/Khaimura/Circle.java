package com.Khaimura;

public class Circle extends Shape {
    private Point coordinatesOne;
    private Point coordinatesTwo;


    public Circle() {
        super();
    }

    public Circle(Point coordinatesOne, Point coordinatesTwo) {
        this.coordinatesOne = coordinatesOne;
        this.coordinatesTwo = coordinatesTwo;
    }

    public Point getCoordinatesOne() {
        return coordinatesOne;
    }

    public void setCoordinatesOne(Point coordinatesOne) {
        this.coordinatesOne = coordinatesOne;
    }

    public Point getCoordinatesTwo() {
        return coordinatesTwo;
    }

    public void setCoordinatesTwo(Point coordinatesTwo) {
        this.coordinatesTwo = coordinatesTwo;
    }

    @Override
    public double calculatePerimeter() {
        double perimetr = 2 * Math.PI * Point.straightline(coordinatesOne, coordinatesTwo);
        return perimetr;
    }

    @Override
    public double calculateArea() {

        double area = (Math.PI * Math.pow(Point.straightline(coordinatesOne, coordinatesTwo), 2));
        return area;
    }

    @Override
    public String toString() {
        return "Circle:" + '\n' +
                "coordinatesOne=" + coordinatesOne + '\n' +
                "coordinatesTwo=" + coordinatesTwo;

    }
}


