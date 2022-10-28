package chapter_3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main( String [] args){


        System.out.println("Cuanto es su salario mensual");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        System.out.println("Cuanto lleva trabajando consecutivamente");
        double años = scanner.nextDouble();
        scanner.close();



        if(salario >= 30000 ){

            if(años >= 2){
                System.out.println("Congrats! esta aprobado el prestamo");
            }
            else {
                System.out.println("no esta aprobado el credito ");
            }
        }

        else{
            System.out.println("no esta aprobado el credito ");
        }
    }

}
