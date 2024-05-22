package org.example;

public class GaussSeidel {//Apenas para sistemas 3x3


    //Define x e y como 0 para as primeiras interações
    private double x1 = 0;
    private double x2 = 0;
    private double x3 = 0;

    private double y1 = 0;
    private double y2 = 0;
    private double y3 = 0;

    //valores do sistema
    private double[][] sistema;

    //Valor do criterio de parada
    private double grau;
    public GaussSeidel(double[][] sistema, double grau) {
        this.sistema = sistema;
        this.grau = grau;
    }

    public void result() {//Faz a primeria etapa com os valores zerados dando novos valores para x1,x2,x3
        setX1((double)(sistema[0][3]- (sistema[0][1] * 0) - (sistema[0][2] * 0))/sistema[0][0]);
        setX2((double)(sistema[1][3]- (sistema[1][0] * x1) - (sistema[1][2] * 0))/sistema[1][1]);
        setX3((double)(sistema[2][3]- (sistema[2][1] * x2) - (sistema[2][0] * x1))/sistema[2][2]);

        //mostra os valores da interação
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println();

        do {
            //Da os valores de y1,y2,y3 os valores da interação anterior
            y1 = x1;
            y2 = x2;
            y3 = x3;

            //Seta novos valores de X
            setX1((double) (sistema[0][3] - (sistema[0][1] * x2) - (sistema[0][2] * x3)) / sistema[0][0]);
            setX2((double) (sistema[1][3] - (sistema[1][0] * x1) - (sistema[1][2] * x3)) / sistema[1][1]);
            setX3((double) (sistema[2][3] - (sistema[2][1] * x2) - (sistema[2][0] * x1)) / sistema[2][2]);

            //mostra os valores da interação
            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
            System.out.println();

        //Quando todos os valores de Xn - Yn forem menor que o grau o programa para
        } while (Math.abs(x1 - y1) >= grau && Math.abs(x2 - y2) >= grau && Math.abs(x3 - y3) >= grau);
    }

    public double[][] getSistema() {
        return sistema;
    }

    public double getGrau() {
        return grau;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

}
