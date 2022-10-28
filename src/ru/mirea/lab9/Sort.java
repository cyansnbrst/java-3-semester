package ru.mirea.lab9;

import java.util.Comparator;

public class Sort implements Comparator<StudentGPA> {

    public int compare(StudentGPA a, StudentGPA b) {
        return a.getGpa().compareTo(b.getGpa());
    }

}