package chapter_4;

import java.util.Scanner;


public class DoWhile {

    public static void main( String [] args){

        boolean again;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese el primer número");

            double primero = scanner.nextDouble();

            System.out.println("Ingrese el segundo número");
            double segundo = scanner.nextDouble();

            double suma = primero + segundo;

            System.out.println("La suma es igual a: " + suma);

            System.out.println("desea repetir otro calculo");
            again = scanner.nextBoolean();

        }
        while(again);

        scanner.close();
    }
}
