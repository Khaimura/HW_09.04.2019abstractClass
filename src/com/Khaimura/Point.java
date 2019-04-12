package com.Khaimura;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static double straightline(Point a, Point b) {
        double straightline=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return straightline;
    }

    @Override
    public String toString() {
        return "Point:" + '\n'+
                "x=" + x +'\n'+
                "y=" + y;
    }
}
