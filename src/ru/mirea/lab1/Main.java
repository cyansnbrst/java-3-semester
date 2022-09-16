package ru.mirea.lab1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] firstArray = new int[]{15, 25, 6, 8};
        sumandaverage(firstArray);
        int[] newArray = new int[5];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < newArray.length; ++i) {
            newArray[i] = in.nextInt();
        }
        sum(newArray);
        minandmax(newArray);
        output(args);
        harmonic();
        System.out.print("\nEnter the number to get it's factorial: ");
        int number = in.nextInt();
        System.out.print("The factorial of " + number + " is " + factorial(number));
    }

    public static void sumandaverage(int[] array) {
        double s = 0;
        for (int j : array) {
            s += j;
        }
        System.out.println("The sum is: " + s + ", the average is: " + (s / array.length));
    }

    public static void sum(int[] array) {
        int s = 0;
        int n = 0;
        while (n < array.length) {
            s += array[n];
            ++n;
        }
        System.out.println("The sum of the values is " + s);
    }

    public static void minandmax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The min is: " + min + "\nThe max is: " + max);
    }

    public static void output(String[] lines) {
        for (String arg : lines) {
            System.out.println(arg);
        }
    }

    public static void harmonic() {
        System.out.println("The harmonic series: ");
        for (int i = 1; i < 11; ++i) {
            double newNumber = 1.0 / i;
            System.out.printf("%d: %.2f\n", i, newNumber);
        }
    }

    public static long factorial(int n) {
        long fac = 1;
        for (int i = 2; i <= n; ++i) {
            fac *= i;
        }
        return fac;
    }

}
