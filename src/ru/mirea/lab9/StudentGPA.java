package ru.mirea.lab9;

public class StudentGPA implements Comparable<StudentGPA> {
    private final Integer id;
    private final Double gpa;

    public StudentGPA(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(StudentGPA o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                '}' + "\n";
    }
}