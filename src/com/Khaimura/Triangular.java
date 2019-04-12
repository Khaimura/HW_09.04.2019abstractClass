package com.Khaimura;

public class Triangular extends Shape {
    private Point coordinatesOne;
    private Point coordinatesTwo;
    private Point coordinatesThree;

    public Triangular() {
        super();
    }

    public Triangular(Point coordinatesOne, Point coordinatesTwo, Point coordinatesThree) {
        this.coordinatesOne = coordinatesOne;
        this.coordinatesTwo = coordinatesTwo;
        this.coordinatesThree = coordinatesThree;
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

    public Point getCoordinatesThree() {
        return coordinatesThree;
    }

    public void setCoordinatesThree(Point coordinatesThree) {
        this.coordinatesThree = coordinatesThree;
    }


    @Override
    public double calculatePerimeter() {
        double perimetr = Point.straightline(coordinatesOne, coordinatesTwo) + Point.straightline(coordinatesTwo, coordinatesThree) + Point.straightline(coordinatesThree, coordinatesOne);
        return perimetr;
    }

    @Override
    public double calculateArea() {
        double polP = (Point.straightline(coordinatesOne, coordinatesTwo) + Point.straightline(coordinatesTwo, coordinatesThree)
                + Point.straightline(coordinatesThree, coordinatesOne)) / 2;
        double area = Math.sqrt(polP * (polP - Point.straightline(coordinatesOne, coordinatesTwo))
                * (polP - Point.straightline(coordinatesTwo, coordinatesThree)) * (polP - Point.straightline(coordinatesThree, coordinatesOne)));

        return area;
    }

    @Override
    public String toString() {
        return "Triangular:" + '\n' +
                "coordinatesOne=" + coordinatesOne + '\n' +
                "coordinatesTwo=" + coordinatesTwo + '\n' +
                "coordinatesThree=" + coordinatesThree;
    }
}
