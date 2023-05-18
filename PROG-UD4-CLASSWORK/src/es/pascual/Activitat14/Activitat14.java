package es.pascual.Activitat14;

public class Activitat14 {

    public static void main(String[] args) {

        int operacio = Matematica.suma(1,2);
        System.out.println(operacio);
        operacio = Matematica.suma(3,2,5);
        System.out.println(operacio);
        double operacio2 = Matematica.obtindreDivisio(3,2);
        System.out.println(operacio2);

        int num1 = 7;
        boolean res3 = Matematica.esPrimo(num1);
        System.out.printf("%d es primo --> %b %n", num1, res3);

        operacio = Matematica.obtindrePotencia(9,-2);
        System.out.println(operacio);
        operacio = Matematica.obtindreAreaRectangle(30,15);
        System.out.println(operacio);

    }

}
