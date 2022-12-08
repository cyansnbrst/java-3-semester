package ru.mirea.lab19;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);
        try {
            ui.run();
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}