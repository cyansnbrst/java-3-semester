package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        ArrayList<Dog> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int amount;
        System.out.println("Enter the amount of dogs: ");
        amount = sc.nextInt();
        sc.nextLine();
        String currentNickname;
        int currentAge;
        for (int i = 0; i <= amount; ++i) {
            if (i == amount) {
                System.out.println("All dogs are in the doghouse");
                break;
            }
            else {
                System.out.println("Enter the next dog:\n");
            }
            System.out.println("Enter the dog's nickname: ");
            currentNickname = sc.nextLine();
            System.out.println("Enter the dog's age: ");
            currentAge = sc.nextInt();
            sc.nextLine();
            arr.add(i, new Dog(currentNickname, currentAge));
        }
        System.out.print(arr.get(0));
    }

}