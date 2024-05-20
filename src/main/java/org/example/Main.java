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

        double grau = 0.01;
        
        GaussSeidel sistema = new GaussSeidel(array, grau);

        sistema.result();
        System.out.println("final:");
        System.out.println(sistema.getX1());
        System.out.println(sistema.getX2());
        System.out.println(sistema.getX3());


        System.out.println();
        System.out.println();

        double[][] array2 = {{5,1,1}, {3,4,1}, {3,3,6}};
        double [] solucao = {5,6,0};

        double[][] array3 = {{3,-4,5,-7},{2,-4,5,-1},{3,-1,7,5},{1,2,-4,5}};
        double [] solucao3 = {19,21,10,31};

        SeidelGenerico sistema2 = new SeidelGenerico(array2, solucao, grau);
        sistema2.show();

        SeidelGenerico sistema3 = new SeidelGenerico(array3, solucao3, grau);
        sistema3.show();
    }
}