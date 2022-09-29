package ru.mirea.lab3;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>(4);
        for (int i = 0; i < 4; i++)
            arr.add(rand.nextInt(10, 100));
        System.out.println(arr);
        for (int i = 0; i < 4; i++)
            if (arr.get(i) >= arr.get(i + 1)) {
                System.out.println("Regular sequence");
                System.exit(0);
            }
        System.out.println("Increasing sequence");
    }
}