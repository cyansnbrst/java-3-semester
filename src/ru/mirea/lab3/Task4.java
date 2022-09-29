package ru.mirea.lab3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a length of the array: ");
            n = sc.nextInt();
            if (n < 1)
                System.out.println("Wrong number");
            else break;
        }
        Random rand = new Random();
        int[] arr = new int[n];
        int n1 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
            if (arr[i] % 2 == 0) n1++;
        }
        int[] arr1 = new int[n1];
        System.out.print("First array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        System.out.println();
        System.out.print("Second array: ");
        for (int k : arr1) System.out.print(k + " ");

    }
}

