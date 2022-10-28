package Repaso;

public class Rectangulo {

    private double ancho;
    private double largo;


    public Rectangulo(){

        ancho = 0;
        largo = 0;

    }

    public Rectangulo(double largo , double ancho){
        this.largo = largo;
        this.ancho = ancho;

    }

    public double area(){
        return largo * ancho;

    }


    public  double perimetro (){

        return (2*largo) + (2*ancho);
    }
}
