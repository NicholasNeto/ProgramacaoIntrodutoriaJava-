package TriangularFourth;

import EntradaDados.EntradaDados;

public class TriangularFourth {

    public static void main(String[] args){

        EntradaDados Dados = new EntradaDados();
        int entrada = Dados.getDados();


        for(int cadaNumero = 1; cadaNumero <= entrada; cadaNumero++){
            System.out.println();
            for(int x = 1; x <= cadaNumero; x++){
                System.out.print("x");
            };
        };
    };
};
