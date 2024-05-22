package org.example;

public class Main {
    public static void main(String[] args) {

        double[][] array1 = {{5,1,1,5}, {3,4,1,6}, {3,3,6,0}};

        double grau = 0.01;

        GaussJacob jacob =new GaussJacob(array1,grau);
        //jacob.show(jacob);

        System.out.println();
        System.out.println();
        
        GaussSeidel seidel = new GaussSeidel(array1, grau);
        //seidel.show(seidel);

        System.out.println();
        System.out.println();


        double[][] array2 = {{5,1,1}, {3,4,1}, {3,3,6}};
        double [] solucao = {5,6,0};

        double[][] array3 = {{3,-4,5,-7},{2,-4,5,-1},{3,-1,7,5},{1,2,-4,5}};
        double [] solucao3 = {19,21,10,31};

        SeidelGenerico seidelGenerico1 = new SeidelGenerico(array2, solucao, grau);
        //seidelGenerico1.show();

        System.out.println();
        System.out.println();

        SeidelGenerico seidelGenerico2 = new SeidelGenerico(array3, solucao3, grau);
        //seidelGenerico2.show();

        System.out.println();
        System.out.println();

        JacobGenerico jacobGenerico1 = new JacobGenerico(array2, solucao, grau);
        //jacobGenerico1.show();

    }
}