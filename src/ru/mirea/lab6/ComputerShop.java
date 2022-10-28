package ru.mirea.lab6;

import java.util.ArrayList;

public class ComputerShop {
    ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer){
        computers.add(computer);
    }

    public void deleteComputer(Computer computer){
        computers.remove(computer);
    }

    public boolean findComputer(Computer computer){
        return computers.contains(computer);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}