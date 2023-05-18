package es.pascual;

import java.util.Scanner;

public class Activitat4 {

    public static void main(String[] args) {

        int numeroMajor = donamMajor();
        System.out.println(numeroMajor);

    }

    public static int donamMajor(){

        Scanner teclat  = new Scanner(System.in);
        System.out.println("Introduïx el primer número: ");
        int numero1 = teclat.nextInt();
        System.out.println("Introduïx el segon número: ");
        int numero2 = teclat.nextInt();
        System.out.println("Introduïx el tecer número: ");
        int numero3 = teclat.nextInt();
        int major = numero1;
        if (numero2 > major){
            major = numero2;
        }
        if (numero3 > major){
            major = numero3;
        }
        return major;

    }

}
