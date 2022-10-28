package ru.mirea.lab7;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle();
        rectangle.moveDown(5.55);
        rectangle.moveRight(4.56);
        System.out.println(rectangle.toString());
        System.out.println("Is speed equal? " + rectangle.SpeedTest());
    }
}