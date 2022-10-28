package ru.mirea.lab7;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable ex = new MathFunc();
        System.out.println("Length of a circle with radius = 3: " + 2 * ex.PI * 3);
        System.out.println("Module of a complex number 2 + 3i: " + ex.complex_m(2, 3));
    }
}
