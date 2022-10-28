package ru.mirea.lab6;

public class Test {
    public static void main(String[] args) {
        Printable shop = new Shop(5900, "Perekrestok");
        Printable book = new Book("Psdfgsdfg", "L.F.Fsdfg", 2003);
        shop.print();
        book.print();
    }
}
