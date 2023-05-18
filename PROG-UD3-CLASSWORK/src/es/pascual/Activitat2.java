package es.pascual;

import java.util.Scanner;

public class Activitat2 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un nombre enter:");
        int numero = teclat.nextInt();

        int esParell = numero % 2;

        if (esParell == 0){
            System.out.println("El numero és parell");
        } else {
            System.out.println("El numero és imparell");
        }

        if (numero >= 0){
            System.out.println("El numero és positiu");
        } else {
            System.out.println("El numero és negatiu");
        }


    }

}
