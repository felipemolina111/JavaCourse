package chapter_5;

import java.util.Scanner;

public class Greetings {

    public static void main (String [] args){
    System.out.println("Ingrese su nombre");
    Scanner scanner = new Scanner(System.in);
    String nombre =  scanner.next();
    greetUser(nombre);

    }

    public static void greetUser( String nombre){


        System.out.println("Hi there " + nombre);
    }
}







