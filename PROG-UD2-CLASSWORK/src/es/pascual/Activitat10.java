package es.pascual;

import java.util.Scanner;

public class Activitat10 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu el primer numero:");
        float primerNumero = teclat.nextFloat();

        System.out.println("Escriu el segon numero:");
        float segonNumero = teclat.nextFloat();

        System.out.println("Escriut el terçer numero:");
        float tercerNumero = teclat.nextFloat();

        float multiplicacio = primerNumero * segonNumero * tercerNumero;
        System.out.println("El resultat de l'operació és: " + multiplicacio);

    }
}
