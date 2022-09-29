package ru.mirea.lab41;

public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return "s = pi * r^2";
    }

    @Override
    public String getPerimeter() {
        return "p = 2 * pi * r";
    }
}