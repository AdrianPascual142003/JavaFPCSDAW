package es.pascual;

import java.util.Scanner;

public class Activitat15 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introdueix un numero:");
            numero = teclat.nextInt();
        }while (numero != 10);


    }

}
