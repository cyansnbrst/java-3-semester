package ru.mirea.lab41;

public class Square extends Rectangle {
    @Override
    public String getType() {
        return "Square";
    }

    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public String getArea() {
        return "a * a";
    }

    @Override
    public String getPerimeter() {
        return "4 * a";
    }


}