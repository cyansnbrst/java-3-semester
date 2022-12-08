package ru.mirea.lab14;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String text;
        System.out.println("Введите текст, который нужно разделить на составные части: ");
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        String[] results = text.split("\\W+"); // \W любой символ, кроме буквенного, цифрового или знака подчёркивания
        System.out.println(Arrays.toString(results));
    }
}