package es.pascual;

import java.util.Scanner;

public class Activitat7 {

    private static final int QUOTA_GENERAL = 500;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Insereix nom");
        String nom = teclat.next();

        System.out.println("Insereix edad");
        int edad = teclat.nextInt();

        int quotaGeneral = 500;

        if (edad > 65){
            System.out.println("");
        }



    }

}
