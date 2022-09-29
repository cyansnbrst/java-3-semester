package ru.mirea.lab2;

import java.util.ArrayList;

public class Shop {
    private static int i = 0;

    public ArrayList<Computer> warehouse = new ArrayList<>();

    public Shop(String title) {
    }

    public void addComputer(int index, String CPU, String GPU, String RAM, String SSD) {
        Computer a = new Computer(index, CPU, GPU, RAM, SSD);
        warehouse.add(i, a);
        i++;
    }

    public void deleteComputer(int index) {
        for (int j = 0; j < warehouse.size(); j++) {
            if (warehouse.get(j).index == index) {
                warehouse.remove(j);
                break;
            }
        }
        System.out.println("Computer has been deleted");
    }

    public void search(int index) {
        for (Computer computer : warehouse)
            if (computer.index == index) {
                System.out.print("Computer is available");
                return;
            }
        System.out.print("Computer is not available");
    }
}