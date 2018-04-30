package FactorsExercise;


import EntradaDados.EntradaDados;

public class testeGenerate {


    public static void main(String[] args){

        EntradaDados Dados = new EntradaDados();
        Generate test = new Generate();

        int entrada = Dados.getDados();
        System.out.println("oi");
        test.generetor(entrada);
        System.out.println("ola");
    };
};
