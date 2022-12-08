package ru.mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        Calendar с = new GregorianCalendar();
        с.setTimeInMillis(System.currentTimeMillis()); // получаем текущее время
        с.add(Calendar.MONTH, -1); // получаем месяц назад относительно текущей

        Date date = с.getTime(); // получаем дату получения задания из календаря
        Date dateNow = new Date();
        System.out.println("Developer: Goncharova");
        System.out.println("Task received: " + date);
        System.out.println("Task done: " + dateNow);
    }
}