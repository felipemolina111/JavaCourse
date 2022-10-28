package chapter_5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int salariorequerido = 25000;
    static int puntajerequerido = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int puntaje = obtenerPuntaje();
        double salario = obtenerSalario();
        scanner.close();

        boolean calificado = esCalificado(salario, puntaje);
        notifyUser(calificado);
    }


    public static double obtenerSalario() {
        System.out.println("Ingrese su salario anual");
        double salario = scanner.nextDouble();
        return salario;
    }

    public static int obtenerPuntaje() {
        System.out.println("Ingrese puntuación de crédito");
        int puntaje = scanner.nextInt();
        return puntaje;
    }


    public static boolean esCalificado(double s, int p) {
        if (s >= salariorequerido && p >= puntajerequerido) {
            return true;
        } else {
            return false;
        }
    }



    public static void notifyUser(boolean calificacion){
        if(calificacion){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }

}