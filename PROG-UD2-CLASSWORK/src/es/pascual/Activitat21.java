package es.pascual;

import java.util.Scanner;

public class Activitat21 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner (System.in);

        System.out.println("Dades del punt A");
        System.out.println("x1");
        double x1 = teclat.nextDouble();
        System.out.println("y1");
        double y1 = teclat.nextDouble();

        System.out.println("Dades del punt B");
        System.out.println("x2");
        double x2 = teclat.nextDouble();
        System.out.println("y2");
        double y2 = teclat.nextDouble();

        double aB = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("La distància entre (%.0f,%.0f) i (%.0f,%.0f) és %.2f", x1, y1, x2, y2, aB);

    }
}
