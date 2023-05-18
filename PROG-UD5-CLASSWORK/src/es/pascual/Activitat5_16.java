package es.pascual;

import java.util.Random;

public class Activitat5_16 {

    public static void main(String[] args) {

        Random generarAtleatori = new Random();

        int [] llistatNumeros = new int[200];

        for (int i = 0; i < llistatNumeros.length ; i++) {
            llistatNumeros[i] = generarAtleatori.nextInt(200);
        }

        int total = 0;

        for (int i = 0; i < llistatNumeros.length; i++) {
            if (llistatNumeros[i] % 2 != 0){
                total += llistatNumeros[i];
            }
        }

        System.out.println(total);

    }

}
