package FactorsExercise;


import java.util.ArrayList;

public class Generate {


    public boolean isPrimo (int numero, int divisor ){
        return  numero % divisor == 0;
    };


    public int generetor(int entrada) {

        int contador = 2;
        int result = entrada;
        ArrayList<Integer> numberList = new ArrayList<Integer>();


        while(contador <= entrada){



            if(isPrimo(result, contador)){

                result = result / contador;
                numberList.add(contador);
                //System.out.println(numberList.get(contador));

            } else {
                contador++;
            }
        };

        System.out.println(numberList);
        return 0;



    };

}
