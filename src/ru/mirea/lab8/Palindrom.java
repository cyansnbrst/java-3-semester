package ru.mirea.lab8;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String str) {
        if (str.length() > 1 && str.endsWith(String.valueOf(str.charAt(0)))) {
            return isPalindrom(str.substring(1, str.length() - 1));
        }
        if (str.length() <= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        System.out.print("String is a palindrom: ");
        System.out.println(isPalindrom(str));
    }
}
