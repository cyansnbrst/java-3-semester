package ru.mirea.lab27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1 { // преобразовать hashset -> treeset
    public static <T> Set<T> getInstance(Set<T> hashSet)
    {
        return new TreeSet<>(hashSet);
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("MARCH");
        hashSet.add("APRIL");
        hashSet.add("MAY");
        hashSet.add("JUNE");
        hashSet.add("JULY");

        Set<String> treeSet = getInstance(hashSet);
        treeSet.stream().sorted();

        System.out.println(treeSet);
    }
}