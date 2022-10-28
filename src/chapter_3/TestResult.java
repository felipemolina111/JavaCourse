package chapter_3;

import java.util.Scanner;

public class TestResult {
    public static void main( String [] args){

        System.out.println("Ingrese su calificación");
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();
        scanner.close();

        char grade;


        if(nota < 60){
            grade = 'A';
        }
        else if (nota < 70){
        grade = 'B';
        }
        else if (nota < 80){
            grade = 'C';
        }
        else{
            grade = 'F';
        }


        System.out.println("su calificacion es "+ grade);



    }
}
