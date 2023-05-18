package es.pascual;

import java.util.Scanner;

public class Activitat23 {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final int NUMERO_MAXIM_RANDOM = 99;
    public static final int NUMERO_MINIM_RANDOM = -99;
    public static final int NUMERO_MAXIM_INTENTS = 10;
    public static final int NUMERO_MINIM_INTENTS = 0;
    public static final int NUMERO_CALENT = 15;
    public static final int NUMERO_TEMPLAT = 30;
    public static final int NUMERO_CREMANT = 5;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("BENVINGUT AL JOC: ENDEVINA EL NÚMERO SECRET");
        System.out.println("-------------------------------------------");

        int contadorAcabar = 0;
        int contadorEndevinar = 0;

        do {
            int numIntents;
            do {
                System.out.print("En quants intents penses que endevinaràs el número? [1-10]: ");
                if (!teclat.hasNextInt()) {
                    System.out.print("\n" + "Error! El tipus de dades introduït és incorrecte");
                    return;
                }
                numIntents = teclat.nextInt();

                if (numIntents == NUMERO_MINIM_INTENTS) {
                    numIntents = (int) (Math.random() * (1 - NUMERO_MAXIM_INTENTS + 1) + (NUMERO_MAXIM_INTENTS));
                }

                if (numIntents > NUMERO_MAXIM_INTENTS || numIntents < NUMERO_MINIM_INTENTS) {
                    System.out.println("Intents incorrectes. Introduïx-los de nou");
                }

            } while (numIntents > NUMERO_MAXIM_INTENTS || numIntents < NUMERO_MINIM_INTENTS);

            int numeroRandom = (int) (Math.random() * (NUMERO_MAXIM_RANDOM - (NUMERO_MINIM_RANDOM) + 1) + (NUMERO_MINIM_RANDOM));
            int numEndivinar;

            for (int i = 1; i < numIntents + 1; i++) {

                do {
                    System.out.print("Intent " + i + " [" + NUMERO_MINIM_RANDOM + " - " + NUMERO_MAXIM_RANDOM + "]: ");

                    if (!teclat.hasNextInt()) {
                        System.out.print("\n" + "Error! El tipus de dades introduït és incorrecte");
                        return;
                    }
                    numEndivinar = teclat.nextInt();
                    if (numEndivinar > NUMERO_MAXIM_RANDOM || numEndivinar < NUMERO_MINIM_RANDOM) {
                        System.out.println("Número incorrecte. Introduïx-lo de nou");
                    }
                } while (numEndivinar > NUMERO_MAXIM_RANDOM || numEndivinar < NUMERO_MINIM_RANDOM);

                int diferenciaNumeros;

                if (numeroRandom > numEndivinar) {
                    diferenciaNumeros = numeroRandom - numEndivinar;
                } else {
                    diferenciaNumeros = numEndivinar - numeroRandom;
                }

                contadorEndevinar++;

                if (diferenciaNumeros == 0) {
                    System.out.print("\n" + "Enhorabona! L'has encertat");
                    contadorAcabar++;
                    break;
                } else if (contadorEndevinar == numIntents) {
                    System.out.print("\n" + "Ho senc. No l'has encertat");
                    contadorAcabar++;
                    break;
                }else{
                    if (diferenciaNumeros < NUMERO_CREMANT) {
                        System.out.println(ANSI_RED + "Cremant" + ANSI_RESET);
                    } else if (diferenciaNumeros < NUMERO_CALENT) {
                        System.out.println(ANSI_PURPLE + "Calent" + ANSI_RESET);
                    } else if (diferenciaNumeros < NUMERO_TEMPLAT) {
                        System.out.println(ANSI_YELLOW + "Templat" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_BLUE + "Fret" + ANSI_RESET);
                    }
                }

            }

        }while (contadorAcabar < 1);
        System.out.print("\n" + "Fi");
    }

}
