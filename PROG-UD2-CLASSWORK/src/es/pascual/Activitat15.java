package es.pascual;

import java.util.Scanner;

public class Activitat15 {


    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix els valors de a,b,c,d,e i f: ");

        float a = teclat.nextFloat();
        float b = teclat.nextFloat();
        float c = teclat.nextFloat();
        float d = teclat.nextFloat();
        float e = teclat.nextFloat();
        float f = teclat.nextFloat();


        float x = ((e*d)-(b*f))/((a*d)-(b*c));
        float y = ((a*f)-(e*c))/((a*d)-(b*c));


        System.out.println("El sistema d’equacions és el següent:");
        System.out.println("(" + a + ")x + (" + b + ")y = " + e);
        System.out.println("(" + c + ")x + (" + d + ")y = " + f);
        System.out.printf("El resultat d’aplicar Cramer és x = %.2f i y = %.2f", x, y);



    }

}
