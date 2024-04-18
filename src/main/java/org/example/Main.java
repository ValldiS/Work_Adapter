package org.example;

public class Main {
    public static void main(String[] args) {

        Ints calculator = new IntsCalculator();

        System.out.println(calculator.sum(10, 55));
        System.out.println(calculator.mult(6, 10));
        System.out.println(calculator.mult(4, 3));


        BinOps bins = new BinOps();

        System.out.println(bins.sum("101010", "0010"));
        System.out.println(bins.mult("101010", "0010"));


    }
}