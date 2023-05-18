package es.pascual;

import java.util.Scanner;

public class Activitat18 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un numero");
        int numeroIntroduit = teclat.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int resultat = numeroIntroduit * i;
            System.out.println(numeroIntroduit + " * " + i + " = " + resultat);
        }

    }

}
