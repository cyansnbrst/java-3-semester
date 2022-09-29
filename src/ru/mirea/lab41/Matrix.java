package ru.mirea.lab41;

import ru.mirea.lab2.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    public double[][] numbers;
    public int row;
    public int col;

    public Matrix(double[][] numbers, int row, int col) {
        this.numbers = numbers;
        this.row = row;
        this.col = col;
    }

    public void multiplyMatrix(int num) {
        for (int i = 0; i < this.col; ++i) {
            for (int j = 0; j < this.row; ++j) {
                this.numbers[i][j] *= num;
            }
        }
    }

    public void sumMatrix(Matrix matrix) {
        for (int i = 0; i < this.col; ++i) {
            for (int j = 0; j < this.row; ++j) {
                this.numbers[i][j] += matrix.numbers[i][j];
            }
        }
    }

    public void outputMatrix() {
        for (int i = 0; i < this.col; ++i) {
            for (int j = 0; j < this.row; ++j) {
                System.out.print(numbers[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }
}
