package ru.mirea.lab13;

public class task1 {
    public static void anyMethod(String str){
        System.out.println(str.charAt(str.length() - 1));
        System.out.println("Ends with \"!!!\"? " + str.endsWith("!!!"));
        System.out.println("Starts with \"I like\"? " + str.startsWith("I like"));
        System.out.println("Contain \"Java\"? " + str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replaceAll("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String substr = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println(substr);
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        anyMethod(str);
    }
}