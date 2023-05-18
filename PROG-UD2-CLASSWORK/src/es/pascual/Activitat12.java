package es.pascual;

import java.util.Scanner;

public class Activitat12 {

    private static final float NUMERO_PI = 3.1415926535898F;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el valor del ‘radi’ d’un cercle:");
        float radiCercle = teclat.nextFloat();

        System.out.println("Ara introdueix el valor de la ‘base’ d’un triangle:");
        float baseTriangle = teclat.nextFloat();

        System.out.println("Y finalment, la seua ‘altura’:");
        float alturaTriangle = teclat.nextFloat();

        double perimetreCercle = 2 * NUMERO_PI * radiCercle;
        double areaCercle = NUMERO_PI * (radiCercle * radiCercle);

        double areaTriangle = (baseTriangle * alturaTriangle) / 2;

        System.out.println("RESULTATS");
        System.out.println("----------");
        System.out.printf("Cercle: Perimetre -> %.2f Àrea -> %.2f \n", perimetreCercle, areaCercle);
        System.out.printf("Triangle: Àrea -> %.2f", areaTriangle);

    }
}
