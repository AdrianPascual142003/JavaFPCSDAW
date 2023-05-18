package es.pascual;

import java.util.Scanner;

public class Activitat5_13 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);

        String [] llistat = new String[10];

        for (int i = 0; i < llistat.length; i++) {
            llistat[i] = teclat.next();
        }
        for (int i = 0; i < llistat.length; i++) {
            if (i % 2 == 0){
                System.out.println("La paraula que esta en la posicio " + i + " es "  + llistat[i]);
            }
        }
    }
}
