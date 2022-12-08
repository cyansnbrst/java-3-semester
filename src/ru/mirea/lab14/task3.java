package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String text = sc.nextLine();
        String text = "a) 25.98 USD, 3.12 RUB \n" +
                "b) 44 ERR, 0.004 EU, .43 EU";
        Pattern pattern = Pattern.compile("[0-9]+[.,][0-9][0-9]\\s(EU|USD|RUB)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}