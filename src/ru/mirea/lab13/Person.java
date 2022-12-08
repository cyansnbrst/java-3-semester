package ru.mirea.lab13;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }

    private String getFIO(){
        if (!name.isEmpty() && !patronymic.isEmpty())
            return surname + ' ' + name + ' ' + patronymic;
        else
            return surname;
    }

    public static void main(String[] args) {
        Person person_name = new Person("Goncharova");
        Person person_fio = new Person("Goncharova", "Ekaterina", "Vyacheslavovna");
        System.out.println(person_name.getFIO());
        System.out.println(person_fio.getFIO());
    }
}