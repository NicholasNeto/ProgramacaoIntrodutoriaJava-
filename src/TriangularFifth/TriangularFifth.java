package TriangularFifth;

import EntradaDados.EntradaDados;

public class TriangularFifth {

    public static void main(String[] args){

        EntradaDados Dados = new EntradaDados();
        int entrada = Dados.getDados();

        int base = entrada + 2;


        for(int i = 1; i <= base ; i = i + 2) {

            for(int j = base; j > i; j = j - 2) {
                System.out.print(" ");
            };

            for(int k = 1; k <= i ; k++ ){
                System.out.print("*");
            };


            System.out.println(" ");
        };
    };
}


