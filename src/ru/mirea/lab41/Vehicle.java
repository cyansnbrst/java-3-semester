package ru.mirea.lab41;

public abstract class Vehicle {
    protected double speed;
    protected double cost;

    public void ticketCost(int road) {
        System.out.println(getClass().getSimpleName() + ": Ticket costs: " + (road / speed) * cost);
    }

    public void tripTime(int road) {
        System.out.println(getClass().getSimpleName()  + ": Trip time: " + (road / speed));
    }
}
