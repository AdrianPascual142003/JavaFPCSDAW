package es.pascual;

import java.util.Random;
import java.util.Scanner;

public class Activitat23 {

    public static Scanner teclat;
    public static final int NUMERO_MINIM_APOSTA = 0;
    public static final int NUMERO_MAXIM_APOSTA = 8;
    public static final int NUMEROS_PER_FILA = 6;
    public static final int NUMERO_MAXIM_A_GENERAR = 50;
    public static final double PREU_MINIM_APOSTA = 1.25;
    public static final double PREU_TABLA_POSICIO_DOS = 1.5;
    public static final int PREU_TABLA_POSICIO_TRES = 2;
    public static final int PREU_MINIM_BOLET = 12;
    public static final int PREU_MAXIM_BOLET= 18;
    public static final int PRIMER_RANGO_APOSTA = 1;
    public static final int SEGON_RANGO_APOSTA = 3;
    public static final int TERCE_RANGO_APOSTA = 5;
    public static final int QUART_RANGO_APOSTA = 7;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    static Random numeroApostaGenerar= new Random();

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }

    public static void inici(){
        mostrarInicio();
        int numeroApuestas = demanarEnter();
        System.out.println();
        mostrarTotalApuestas(numeroApuestas);
        mostrarTotalPago(numeroApuestas);
    }

    public static void mostrarInicio (){
        System.out.println("----- GENERADOR DE APUESTAS LOTERIA 2020 -----\n");
    }

    /**
     *  Muestra todas las apuestas ordenas y sin repetir
     */
    public static void mostrarTotalApuestas (int numeroApuestas){
        for (int i = 1; i <= numeroApuestas ; i++) {
            System.out.printf("----- Apuesta %d ---- %n",i);
            mostrarApuesta(ordenarNumeros(generarApuesta()));
            System.out.println();
        }
    }

    /**
     * Comprueba si algún numero esta repetido para cambiarlo
     */

    public static boolean estaRepetit (int [] apuesta, int numeroGenerat){
        for (int item : apuesta) {
            if (item == numeroGenerat) {
                return true;
            }
        }
        return false;
    }

    /**
     *  Ordena los numeros que tiene el array de menor a mayor
     */

    public static int [] ordenarNumeros (int [] apuesta){
        for (int i = 0; i < (apuesta.length-1); i++) {
            for (int j = i + 1; j < apuesta.length; j++) {
                if (apuesta[j] < apuesta[i]){
                    int aux = apuesta[i];
                    apuesta[i] = apuesta[j];
                    apuesta[j] = aux;
                }
            }
        }
        return apuesta;
    }

    /**
     * Genera una apuesta, lo llamaremos tantas veces como apuestas
     * quiera jugar el usuario
     **/

    public static int[] generarApuesta(){
        int [] numerosAposta = new int[NUMEROS_PER_FILA];
        for (int i = 0; i < numerosAposta.length; i++) {
            int numeroGenerat = numeroApostaGenerar.nextInt(NUMERO_MAXIM_A_GENERAR);
                if (estaRepetit(numerosAposta,numeroGenerat)){
                    i--;
                }else {
                    numerosAposta [i] = numeroGenerat;
                }
        }
        return numerosAposta;
    }

    /**
     * Muestra la @apuesta en el formato de salida específico
     **/

    public static void mostrarApuesta(int[] apuesta){
        System.out.println("+----+----+----+----+----+----+");
        for (int i = 0; i < apuesta.length; i++) {
            if (i == 0) {
                System.out.printf("| %02d |", apuesta[i]);
            }else {
                System.out.printf(" %02d |", apuesta[i]);
            }
        }
        System.out.println("\n" + "+----+----+----+----+----+----+");
    }

    /**
     * Muestra el total a pagar por @numeroApuestas
     **/

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
            preuPagar = PREU_MINIM_BOLET;
        }else {
            preuPagar = PREU_MAXIM_BOLET;
        }
        if (preuPagar % 1 == 0){
            System.out.printf("| A Pagar \t   | \t" + ANSI_GREEN + "%.0f€  "  + ANSI_RESET + " |%n", preuPagar);
        }else {
            System.out.printf("| A Pagar \t   |   " + ANSI_GREEN + "%.1f€" + ANSI_RESET + "  |%n",preuPagar);
        }
        System.out.println("+----+----+----+----+----+");
    }

    /**
     * Pñíde el entero con el mensaje indicado
     */

    public static int demanarEnter(){
        return obtenerEntero(NUMERO_MINIM_APOSTA,NUMERO_MAXIM_APOSTA,"Cuantas apuestas quieres realizar: ");
    }

    /**
     * Obtener un entero con un rango maximo y minimo además de un mensaje
     */

    public static int obtenerEntero(int numMinim, int numMax, String missatge){
        do {
            int numeroIntroduit = obtenerEntero(missatge);
            if (numeroIntroduit > numMinim && numeroIntroduit <= numMax){
                return numeroIntroduit;
            }else {
                System.out.println("Debes de introducir un número dentro del limite");
            }
        }while (true);
    }

    /**
     * Obtener un entero con mensaje
     */

    public static int obtenerEntero(String missatge){
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                teclat.next();
                System.out.println("Error has de introducir un número entero");
            }
        }while (true);
    }
}
