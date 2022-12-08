package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Email: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println(Pattern.matches("\\w+([\\.-]?\\w+)*@\\w+\\.\\w{2,4}", text));
    }
}