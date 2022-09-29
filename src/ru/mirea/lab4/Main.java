package ru.mirea.lab4;

public class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.spring;
        love(season);
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + ": " + seasons.getDescription() + " (average" +
                    " temperature is " + seasons.getTemperature() + ")");
        }
    }

    public enum Seasons {
        autumn(10.5), winter(-10.5), spring(12.5), summer(20.5) {
            public String getDescription() {
                return "Warm season";
            }
        };

        private final double temperature;

        private Seasons(double temperature) {
            this.temperature = temperature;
        }

        public String getDescription() {
            return "Cold season";
        }

        public double getTemperature() {
            return temperature;
        }
    }

    public static void love(Seasons season) {
        switch (season) {
            case autumn -> System.out.println("I love autumn");
            case spring -> System.out.println("I love spring");
            case summer -> System.out.println("I love summer");
            case winter -> System.out.println("I love winter");
        }
    }
}