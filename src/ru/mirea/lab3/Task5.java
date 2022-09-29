package ru.mirea.lab3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        Double d = Double.valueOf(sc.next());
        byte b = d.byteValue();
        System.out.println("byte: " + b);
        short sh = d.shortValue();
        System.out.println("short: " + sh);
        int i = d.intValue();
        System.out.println("int: " + i);
        long l = d.longValue();
        System.out.println("long: " + l);
        float f = d.floatValue();
        System.out.println("float: " + f);
        String s = Double.toString(d);
        System.out.println("string: " + s);
    }
}