package es.pascual;

public class Activitat8 {
    public static void main(String[] args) {
        int x = 150;
        int i = 2000;
        System.out.println("Suma" + "\t" + (x+i));
        System.out.println("Resta" + "\t" + (x-i));
        System.out.println("Multiplicació" + "\t" +(x*i));
        System.out.println("Divisió" + "\t" + (x/i));

        x = 150;
        i = 2000;
        int resultatSuma = x+i;
        int resultatResta = x-i;
        int resultatMultiplicacio = x*i;
        int resultatDivisio = x/i;
        System.out.println( x + " + " + " = " + resultatSuma);
        System.out.println( x + " - " + " = " + resultatResta);
        System.out.println( x + " * " + " + " + resultatMultiplicacio);
        System.out.println( x + " / " + " = " + resultatDivisio);

    }
}
