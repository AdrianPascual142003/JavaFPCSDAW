package es.pascual;

import java.util.Scanner;

public class Activitat8a {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un numero enter");
        int num1;
        if (teclat.hasNextInt()){
            num1 = teclat.nextInt();
        }else {
            System.out.println("TENS DE POSAR UN NOMBRE ENTER");
            return;
        }

        System.out.println("Introdueix un 2 numero enter");
        int num2;
        if (teclat.hasNextInt()){
            num2 = teclat.nextInt();
        }else {
            System.out.println("");
        }

    }

}