package FizzBuzz;

public class FizzBuzzExercicio {

    public void fizzBuzz(){

        for(int numeros = 1; numeros <= 100; numeros++){

            if(fullFizzBuzz(numeros)) {
                System.out.println("FizzBuzz");

            } else if(fizz(numeros)) {
                System.out.println("Fizz");

            } else if(buzz(numeros)) {
              System.out.println("Buzz");

            } else {
                System.out.println(numeros);
            };
        };
    };


    public boolean fizz(int numeros){
        return numeros % 3 == 0;
    }

    public boolean buzz(int numeros){
        return numeros % 5 == 0;
    }

    public boolean fullFizzBuzz(int numeros){
        return numeros % 3 == 0 && numeros % 5 == 0 ;
    };
};


