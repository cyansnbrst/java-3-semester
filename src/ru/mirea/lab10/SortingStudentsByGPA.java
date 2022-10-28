package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getScore() - s2.getScore();
    }

    public ArrayList<Student> s = new ArrayList<Student>();

    public void quicksort(int low, int high)
    {
        if (s.size() == 0) return;

        if (low >= high) return;

        Student pivot = s.get(low + (high - low) / 2);

        int i = low, j = high;
        while (i <= j) {
            while (compare(s.get(i), pivot) > 0) {
                i++;
            }

            while (compare(s.get(j), pivot) < 0) {
                j--;
            }

            if (i <= j) {
                Student temp = s.get(i);
                s.set(i, s.get(j));
                s.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);

        if (high > i)
            quicksort(i, high);
    }

    public void arraySet(int n) {
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            s.add(student);
        }
    }

    public void arrayOut() {
        for (int i = 0; i < s.size(); i++) {
            System.out.println("id: " + s.get(i).getId() + " | score: " + s.get(i).getScore());
        }
    }

    public void merge(int left, int right) {
        int i = left;
        int idx = 0; // индекс res
        int middle = left + (right - left) / 2;
        int j = middle + 1;
        Student[] res = new Student[right - left + 1];
        while (i <= middle && j <= right) {
            if (s.get(i).getId() <= s.get(j).getId()) {
                res[idx] = s.get(i);
                i++;
            } else {
                res[idx] = s.get(j);
                j++;
            }
            idx++;
        }
        while (i <= middle) {
            res[idx] = s.get(i);
            i++;
            idx++;
        }
        while (j <= right) {
            res[idx] = s.get(j);
            j++;
            idx++;
        }
        for (i = 0; i < idx; i++) {
            if (s.get(left + i) != res[i]) {
                s.set((left + i), res[i]);
            }
        }
    }

    public void mergeSort(int left, int right) {
        if (left < right) {
            mergeSort(left, left + (right - left) / 2);
            mergeSort(left + (right - left) / 2 + 1, right);
            merge(left, right);
        }
    }

    public static void main(String[] args) {
        System.out.print("Number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.arraySet(n);
        sort.arrayOut();
        sort.quicksort(0, n - 1);
        System.out.println("-----quicksort(score)-----");
        sort.arrayOut();
        System.out.println("-----merge sort(id)-----");
        sort.mergeSort(0, n - 1);
        sort.arrayOut();
    }
}