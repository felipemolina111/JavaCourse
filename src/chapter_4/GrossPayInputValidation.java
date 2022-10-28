package chapter_4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main( String [] args){

int pago_hora = 15;
int maximo_horas = 40;

        System.out.println("Cuantas horas a la semana trabajo");
        Scanner scanner = new Scanner(System.in);
        double horas_trabajadas = scanner.nextDouble();

        while(horas_trabajadas > maximo_horas ) {

            System.out.println("Cuantas horas a la semana trabajo");
            horas_trabajadas = scanner.nextDouble();
        }



        scanner.close();
        double salario = pago_hora * horas_trabajadas;
        System.out.println("El salario es: "+ salario);



    }

    }
