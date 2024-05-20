package org.example;

public class SeidelGenerico {

    private int count;

    private double[] newVlaues;
    
    private double[] oldValues;

    private double[] solucao;

    private double[][] sistema;

    private boolean condition;

    private double grau;
   
    public SeidelGenerico(double[][] sistema, double [] solucao, double grau) {

        this.sistema = sistema;
        this.solucao = solucao;
        this.grau = grau;

        newVlaues = new double[sistema[0].length];
        oldValues = new double[sistema[0].length];
    }


    public void result() {
        double [] aux = new double[newVlaues.length];
        double produto = 0;
        count = 1;

        for(int i =0; i < aux.length; i++){

            produto = 0;
            produto = produto(produto, aux, i);

            aux[i]=(solucao[i] - (produto))/sistema[i][i];

            System.out.println(i +": "+ aux[i]);           
        }
        System.out.println("-------");   
        setNewVlaues(aux);

        do {
            setOldValues(aux);
            count++;


            for(int i =0; i < aux.length; i++){

                produto = 0;
                produto = produto(produto, aux, i);
    
                aux[i]=(solucao[i] - (produto))/sistema[i][i];
                   
                System.out.println(i +": "+ aux[i]);
            }
            System.out.println("-------");
            setNewVlaues(aux);

            condition = condition(newVlaues, oldValues);
            
        } while (condition == true);
    }


    private double produto(double produto, double [] aux, int i) {

         for(int j = 0; j < aux.length; j++){
          if(j != i){
            produto = produto + sistema[i][j] * aux[j];
          }
       }
        return produto; 
    }


    private boolean condition(double[] newValues, double[] oldValues) {
        double [] aux = new double[newVlaues.length];

        for(int i =0; i < newValues.length; i++){
            aux[i] = Math.abs(newValues[i] - oldValues[i]);

            if(Math.abs(aux[i]) >= grau ){
                return true;
            }
        }

        return false;
        
    }

    public void show(){
        result();
        System.out.println("-------");
        System.out.println("Interações: " + count);
        System.out.println("final:");
        for(int i = 0;i<=getNewVlaues().length-1;i++){
            System.out.println(i +"x: "+getNewVlaues()[i]);
        }
    }


    public double[] getNewVlaues() {
        return newVlaues;
    }


    public void setNewVlaues(double[] sistemaNew) {
        this.newVlaues = sistemaNew;
    }


    public double[] getOldValues() {
        return oldValues;
    }


    public void setOldValues(double[] sistemaAnt) {
        for(int i=0;  i < sistemaAnt.length;i++){
            oldValues[i] =+ sistemaAnt[i];
        }
    }


    public double[][] getSistema() {
        return sistema;
    }


    public void setSistema(double[][] sistema) {
        this.sistema = sistema;
    }


    public double getGrau() {
        return grau;
    }


    public void setGrau(double grau) {
        this.grau = grau;
    }

    
} 