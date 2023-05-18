package es.pascual;

import java.util.Scanner;

public class Activitat_5_14 {

    public static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        int [] listado = new int [10];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = teclat.nextInt();
        }
        for (int llistadoN: listado) {
            System.out.println("El elemento es " + llistadoN);
        }
    }

}
