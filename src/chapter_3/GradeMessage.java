package chapter_3;

import java.util.Scanner;

public class GradeMessage {


    public static void main( String [] args){

        System.out.println("Ingrese su nota en letras");
        Scanner scanner = new Scanner(System.in);
        String nota = scanner.next();
        scanner.close();

        String mensaje;

        switch (nota){

            case  "A":
                mensaje = "Excellent job!";
                break;

                case "B":
                    mensaje = "MUY MAL";
                    break;

            default:
                mensaje = "equivocado";
                break;
        }

        System.out.println(mensaje);



    }
}
