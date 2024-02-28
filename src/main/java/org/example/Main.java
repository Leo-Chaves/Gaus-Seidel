package org.example;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[3][4];
        array[0][0] = 5;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 5;
        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 1;
        array[1][3] = 6;
        array[2][0] = 3;
        array[2][1] = 3;
        array[2][2] = 6;
        array[2][3] = 0;

        double grau = 0.001;
        Sistema sistema = new Sistema(array, grau);

        sistema.result();
        System.out.println("final:");
        System.out.println(sistema.getX1());
        System.out.println(sistema.getX2());
        System.out.println(sistema.getX3());
    }
}