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
        double [] solucao2 = {5,6,0};

        double[][] array3 = {{3,-4,5,-7},{2,-4,5,-1},{3,-1,7,5},{1,2,-4,5}};
        double [] solucao3 = {19,21,10,31};

        double[][] array4 = {{10,2,1},{1,5,1},{2,3,10}};
        double [] solucao4 = {7,-8,6};

        SeidelGenerico seidelGenerico1 = new SeidelGenerico(array2, solucao2, grau);
        //seidelGenerico1.checkConvergenceSassenfeld();
        //seidelGenerico1.show();

        System.out.println();
        System.out.println();

        SeidelGenerico seidelGenerico2 = new SeidelGenerico(array3, solucao3, grau);
        //seidelGenerico2.checkConvergenceSassenfeld();
        //seidelGenerico2.show();

        System.out.println();
        System.out.println();

        SeidelGenerico seidelGenerico3 = new SeidelGenerico(array4, solucao4, grau);
        //seidelGenerico3.checkConvergenceSassenfeld();
        //seidelGenerico3.show();

        System.out.println();
        System.out.println();

        JacobGenerico jacobGenerico1 = new JacobGenerico(array2, solucao2, grau);
        //jacobGenerico1.checkConvergence();
        //jacobGenerico1.show();

        System.out.println();
        System.out.println();

        JacobGenerico jacobGenerico2 = new JacobGenerico(array3, solucao3, grau);
        //jacobGenerico2.checkConvergence();

        System.out.println();
        System.out.println();

        JacobGenerico jacobGenerico3 = new JacobGenerico(array4, solucao4, grau);
        //jacobGenerico3.checkConvergence();
        //jacobGenerico3.show();
    }
}