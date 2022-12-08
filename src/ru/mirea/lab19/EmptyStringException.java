package ru.mirea.lab19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string is not allowed");
    }
}