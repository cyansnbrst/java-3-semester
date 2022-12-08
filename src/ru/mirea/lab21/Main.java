package ru.mirea.lab21;

import javax.sql.rowset.serial.SerialStruct;
import java.io.StringBufferInputStream;

// 2. написать класс который умеет хранить в себе массив любых данных
// 3. добавить метод, который возвр. элемент массива по индексу
// 4. добавить метод, который выводит первые 5 элементов массива

public class Main <N>{
    N array[];

    public Main(N[] array) {
        this.array = array;
    }

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public N getElementByIndex(int index){
        return array[index];
    }

    public void printFirstFive(){
        for (int i = 0; i < 5; i++) {
            if (i >= array.length) return;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        Integer intArray[] = {1, 4, 5, 3, 2, 0, 9, 7, 6, 8};
        Double doubleArray[] = {1.3, 4.3, 4.8, 2.4, 4.0};
        String stringArray[] = {"abc", "def", "o", "who", "what", "l0"};

        Main<Integer> i = new Main<>(intArray);
        Main<Double> d = new Main<>(doubleArray);
        Main<String> s = new Main<>(stringArray);

        System.out.println(i.getElementByIndex(0));
        System.out.println(d.getElementByIndex(0));
        System.out.println(s.getElementByIndex(0));

        System.out.println("-----------------------------------------------");
        i.printFirstFive();
        System.out.println("-----------------------------------------------");
        d.printFirstFive();
        System.out.println("-----------------------------------------------");
        s.printFirstFive();

    }
}