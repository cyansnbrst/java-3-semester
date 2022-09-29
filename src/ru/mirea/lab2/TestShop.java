package ru.mirea.lab2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("MVIDEO");
        System.out.println("Enter the amount of computers: ");
        int numberC = scanner.nextInt();
        int currentIndex;
        String currentCPU, currentscreen, currentRAM, currentSSD;
        for (int i = 0; i < numberC; i++) {
            System.out.println("Enter the ID: ");
            currentIndex = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the CPU: ");
            currentCPU = scanner.nextLine();
            System.out.println("Enter the screen: ");
            currentscreen = scanner.nextLine();
            System.out.println("Enter the RAM: ");
            currentRAM = scanner.nextLine();
            System.out.println("Enter the SSD: ");
            currentSSD = scanner.nextLine();
            shop.warehouse.add(i, new Computer(currentIndex, currentCPU, currentscreen, currentRAM, currentSSD));
            if (i == numberC - 1) {
                System.out.println("Added");
            } else {
                System.out.println("\nNext computer\n");
            }
        }
        shop.search(1234);
    }
}