package es.pascual;

import java.util.Scanner;

public class Activitat5_12 {
    public static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        int [] listado = new int [10];
        for (int i = 0; i < listado.length; i++) {
            listado [i] = teclat.nextInt();
        }
        for (int i = 0; i < listado.length; i++) {
            if (i < listado.length-1) {
                System.out.print(listado[i] + ", ");
            }else {
                System.out.println(listado[i]);
            }
        }
        for (int i = 0; i < listado.length ; i++) {
            System.out.println("El elemento de " + i + " es " + listado[i]);
        }
    }
}
