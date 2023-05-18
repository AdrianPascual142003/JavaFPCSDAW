package es.pascual;

import java.util.Random;

public class Activitat5_15 {
    public static void main(String[] args) {

        int [] numeroAtleatoris = new int[20];

        Random numeroGeneradoAtleatorio = new Random();

        for (int i = 0; i < numeroAtleatoris.length; i++) {
            numeroAtleatoris[i] = numeroGeneradoAtleatorio.nextInt(10);
        }

        int contador = 1;

        for (int voltesCreacio: numeroAtleatoris) {
            System.out.print(voltesCreacio);
            if (contador == 4){
                System.out.print(" ");
                contador = 0;
            }
            contador++;
        }

        contador = 0;
        for (int numero: numeroAtleatoris
             ) {
            contador ++;
            System.out.print(numero);
            if (contador == 4){
                System.out.print(" ");
                contador = 0;
            }
        }

    }
}
