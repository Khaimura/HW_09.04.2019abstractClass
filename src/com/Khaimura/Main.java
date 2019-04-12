package com.Khaimura;

public class Main {

    public static void main(String[] args) {

        Point pointOne =new Point(4.2,7.3);
        Point pointTwo =new Point(6.0,7.3);
        Point pointThree =new Point(6.0,4.2);
        Triangular triangular=new Triangular(pointOne,pointTwo,pointThree);
        System.out.println(triangular.toString()+'\n'+"Perimeter= "+triangular.calculatePerimeter()+'\n'+"Area= "+triangular.calculateArea());
        Circle сircle = new Circle(pointOne,pointTwo);
        System.out.println(сircle.toString()+'\n'+"Perimeter= "+сircle.calculatePerimeter()+'\n'+"Area= "+сircle.calculateArea());

    }
}
