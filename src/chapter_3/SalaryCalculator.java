package chapter_3;

import java.util.Scanner;


/*

A todos se les pague 1000 y si vende 10 se le suma 250
*/
public class SalaryCalculator {

    public static void main( String [] args){

        int salario = 1000;
        int bono = 250;
        int ventas = 10;

        System.out.println("Cuantas ventas hizo en la semana?");
        Scanner scanner = new Scanner(System.in);
        int venta = scanner.nextInt();
        scanner.close();

        if(venta > ventas){

            salario = salario + bono;

        }

        System.out.println("El salario del empleado es: " + salario);

    }
}
