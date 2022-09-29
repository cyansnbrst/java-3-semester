package ru.mirea.lab2;

public class Reverse {
    public static void main(String[] args) {
        String[] a = new String[]{"1", "2", "3", "4", "5"};
        System.out.print("Initial array:\t");
        for (String s : a) {
            System.out.print(s + "\t");
        }
        String temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println();
        System.out.print("New array:\t");
        for (String s : a) {
            System.out.print(s + "\t");

        }
    }
}