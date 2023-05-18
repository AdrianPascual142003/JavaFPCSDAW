package es.pascual;

import java.util.Scanner;

public class Activitat16 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu un numero enter");
        int numero = teclat.nextInt();
        int multiplicador = 1;

        System.out.println("Tabla del " + numero);
        System.out.println("-----------");

        do {
            int resultat = numero * multiplicador;
            System.out.println(numero + " * " + multiplicador + " = " + resultat);
            multiplicador++;
        }while (multiplicador <= 10);


        }

    }
