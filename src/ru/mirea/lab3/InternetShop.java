package ru.mirea.lab3;

import java.util.Scanner;

public class InternetShop {
    InternetShop()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of roubles: ");
        double rubles = sc.nextDouble();
        Converter amount = new Converter(rubles);
        System.out.println("Choose the currency: ");
        System.out.println("1.Dollars\n2.Euros\n3.Pounds");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> System.out.print("Dollars: " + amount.countDollars());
            case 2 -> System.out.print("Euros: " + amount.countEuros());
            case 3 -> System.out.print("Pounds: " + amount.countPounds());
        }
    }
}
