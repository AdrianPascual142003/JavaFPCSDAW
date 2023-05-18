package es.pascual;

import java.util.Arrays;
import java.util.Random;

public class Prova {

    public static final int NUMERO_MINIM_APOSTA = 0;
    public static final int NUMERO_MAXIM_APOSTA = 8;
    public static final int NUMEROS_PER_FILA = 6;
    public static final int NUMERO_MAXIM_A_GENERAR = 50;
    public static final double PREU_MINIM_APOSTA = 1.25;
    public static final double PREU_TABLA_POSICIO_DOS = 1.5;
    public static final int PREU_TABLA_POSICIO_TRES = 2;
    public static final int PREU_TABLA_POSICIO_QUARTA = 12;
    public static final int PREU_MAXIM_BOLET= 18;
    public static final int PRIMER_RANGO_APOSTA = 1;
    public static final int SEGON_RANGO_APOSTA = 3;
    public static final int TERCE_RANGO_APOSTA = 5;
    public static final int QUART_RANGO_APOSTA = 7;
    static Random numeroApostaGenerar= new Random();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generarApuesta()));
    }

    public static int[] generarApuesta(){
        int [] numerosAposta = new int[NUMEROS_PER_FILA];
        for (int i = 0; i < numerosAposta.length; i++) {
            int numeroGenerat = numeroApostaGenerar.nextInt(NUMERO_MAXIM_A_GENERAR);
            do {
                if (estaRepetit2(numerosAposta,numeroGenerat)){
                    int numeroGenerat2 = numeroApostaGenerar.nextInt(50);
                    numerosAposta [i] = numeroGenerat2;
                }else {
                    numerosAposta [i] = numeroGenerat;
                }
            }while (!estaRepetit2(numerosAposta,numeroGenerat));

        }
        return numerosAposta;
    }

    public static boolean estaRepetit2 (int [] apuesta, int numeroGenerat){
        boolean esRepetit = false;
            for (int item : apuesta) {
                if (item == numeroGenerat) {
                    esRepetit = true;
                    break;
                }
            }

        return esRepetit;
    }

    public static int estaRepetit (int [] apuesta, int numeroGenerat){
        int numeroGeneratNoRepetit = 0;
        boolean esRepetit;
        do {
            esRepetit = false;
            for (int item : apuesta) {
                if (item == numeroGenerat) {
                    numeroGeneratNoRepetit = numeroApostaGenerar.nextInt(50);
                    esRepetit = true;
                }
            }
        }while (esRepetit);
        return numeroGeneratNoRepetit;
    }


    public static void mostrarTotalPago(int numeroApuestas){
        System.out.println("---- Total a Pagar ----");
        System.out.println("+----+----+----+----+----+");
        System.out.println("| Apuestas:    | \t" + numeroApuestas + " \t |");
        System.out.println("+----+----+----+----+----+");
        double preuPagar;
        if (numeroApuestas == PRIMER_RANGO_APOSTA){
            preuPagar = numeroApuestas * PREU_MINIM_APOSTA;
        }else if (numeroApuestas <= SEGON_RANGO_APOSTA){
            preuPagar = numeroApuestas * PREU_TABLA_POSICIO_DOS;
        }else if (numeroApuestas <= TERCE_RANGO_APOSTA){
            preuPagar = numeroApuestas * PREU_TABLA_POSICIO_TRES;
        }else if (numeroApuestas <= QUART_RANGO_APOSTA){
            preuPagar = numeroApuestas * PREU_TABLA_POSICIO_QUARTA;
        }else {
            preuPagar = numeroApuestas * PREU_MAXIM_BOLET;
        }
        if (preuPagar % 1 == 0){
            System.out.printf("| A Pagar \t   | \t%.0f€   |%n", preuPagar);
        }else {
            System.out.printf("| A Pagar \t   |   %.1f€  |%n",preuPagar);
        }
        System.out.println("+----+----+----+----+----+");
    }

    public static void mostrarTotalPago2(int numeroApuestas){
        System.out.println("---- Total a Pagar ----");
        System.out.println("+----+----+----+----+----+");
        System.out.println("| Apuestas:    | \t" + numeroApuestas + " \t |");
        System.out.println("+----+----+----+----+----+");
        String preuPagar;
        if (numeroApuestas == PRIMER_RANGO_APOSTA){
            preuPagar = String.valueOf( numeroApuestas * PREU_MINIM_APOSTA);
        }else if (numeroApuestas <= SEGON_RANGO_APOSTA){
            preuPagar = String.valueOf( numeroApuestas * PREU_TABLA_POSICIO_DOS);
        }else if (numeroApuestas <= TERCE_RANGO_APOSTA){
            preuPagar = String.valueOf( numeroApuestas * PREU_TABLA_POSICIO_TRES);
        }else if (numeroApuestas <= QUART_RANGO_APOSTA){
            preuPagar = String.valueOf( numeroApuestas * PREU_TABLA_POSICIO_QUARTA);
        }else {
            preuPagar = String.valueOf( numeroApuestas * PREU_MAXIM_BOLET);
        }
        System.out.println("| A Pagar \t   | \t" + preuPagar + "€ \t |");
        System.out.println("+----+----+----+----+----+");
    }
}
