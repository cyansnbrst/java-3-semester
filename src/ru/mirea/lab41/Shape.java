package ru.mirea.lab41;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public abstract String getType();

    public abstract String getArea();

    public abstract String getPerimeter();

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return getType() + "\n" + getArea()
                + "\n" + getPerimeter();
    }
}