package ru.mirea.lab2;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = input.nextLine();
        System.out.println("Enter the email:");
        String email = input.nextLine();
        System.out.println("Enter the gender:");
        char gender = input.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println("toString test");
        System.out.println(author);
        author.setEmail("new_email@mail.ru");
        author.setName("Michael");
        System.out.println("getName: " + author.getName());
        System.out.println("getEmail: " + author.getEmail());
        System.out.print("getGender: " + author.getGender());
    }
}
