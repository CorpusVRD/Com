package com.example.circle;

import java.awt.geom.Area;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle { public double radius ;

    public Circle(double radius) {
        if (radius < 0){
            throw new RuntimeException("радиус меньше 0");
        }
        this.radius = radius;
    }

    public void setRadius(double setRadius) {
        if (setRadius < 0){
            throw new RuntimeException("радиус меньше 0");
        }
        this.radius = setRadius;
    }

    public double getRadius() {
        return this.radius;
    }//
    public double area;


    public Circle(double radius, double area) {

        if (area < 0){
            throw new RuntimeException("площадь меньше 0");
        }

        this.area = area;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


