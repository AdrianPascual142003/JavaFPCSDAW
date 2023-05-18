package es.pascual;

import java.util.Scanner;

public class Activitat1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix la teua edad:");
        int edad = teclat.nextInt();

        if (edad >= 18) {
            System.out.println("Eres major de edad");
        } else{
            System.out.println("Eres menor de edad");
        }

    }
}
