package ru.mirea.lab41;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(new double[][]{{1, 2}, {3, 4}}, 2, 2);
        Matrix mat2 = new Matrix(new double[][]{{10, 10}, {10, 10}}, 2, 2);
        mat1.sumMatrix(mat2);
        mat1.outputMatrix();
        mat1.multiplyMatrix(2);
        mat1.outputMatrix();
    }
}
