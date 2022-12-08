package ru.mirea.lab13;

public class Number {
    private String code;
    private String first3;
    private String second3;
    private String four;

    public Number(String number) {
        this.code = number.substring(1, number.length() - 10);
        this.first3 = number.substring(number.length() - 10, number.length() - 7);
        this.second3 = number.substring(number.length() - 7, number.length() - 4);
        this.four = number.substring(number.length() - 4, number.length());
    }

    @Override
    public String toString() {
        return "number: " +
                "+" + code + '-' +
                first3 + '-' +
                second3 + '-' +
                four;
    }

    public static void main(String[] args) {
        String num1 = "+104289652211";
        Number numm1 = new Number(num1);
        System.out.println(numm1.toString());
    }
}