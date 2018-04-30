package TriangularesThird;
import EntradaDados.EntradaDados;

public class TriangularesThird {

    public static void main(String[] args) {

        EntradaDados Dados = new EntradaDados();
        int valor = Dados.getDados();

        for(int cadaItem = 0; cadaItem < valor; cadaItem++){
            System.out.println("*");
        };
    };
}









