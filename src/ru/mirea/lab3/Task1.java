package ru.mirea.lab3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] arr1 = new double[size];
        double[] arr2 = new double[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i) {
            arr1[i] = rand.nextDouble(100);
            arr2[i] = Math.random() * ((100) - 1);
        }
        System.out.print("First array: ");
        for (int i = 0; i < size; ++i) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Second array: ");
        for (int i = 0; i < size; ++i) {
            System.out.print(arr2[i] + " ");
        }

    }
}
