package es.pascual;

import java.util.Scanner;

public class Problema10 {

    public static final int NUMERO_FILES = 3;
    public static final int NUMERO_COLUMNES = 3;
    public static final int RANG_MINIM = -9;
    public static final int RANG_MAXIM = 99;
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }

    public static void inici(){
        int [][] arrayRandoms = generarArray();
        System.out.println("Matriz generada:\n");
        mostrarArray(arrayRandoms);
        System.out.println();
        int numeroIntroducido = pedirEntero();
        multiplicarArray(arrayRandoms,numeroIntroducido);
        System.out.println("\nMatriz resultado:\n");
        mostrarArrayMultiplicado(arrayRandoms);
    }

    public static void multiplicarArray(int [][]array, int multiplicador){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * multiplicador;
            }
        }
    }

    public static void mostrarArrayMultiplicado(int [][] array){
        for (int[] fila : array) {
            for (int columna : fila) {
                System.out.printf("[ %02d ]", columna);
            }
            System.out.println();
        }
    }

    public static int [][] generarArray(){
        int [][] arrayNumeros = new int[NUMERO_FILES][NUMERO_COLUMNES];
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = (int) (Math.random() * (RANG_MAXIM - (RANG_MINIM) + 1) + RANG_MINIM);
            }
        }
        return arrayNumeros;
    }

    public static void mostrarArray(int [][] array){
        for (int[] fila : array) {
            for (int columna : fila) {
                System.out.print("[ " + columna + " ]");
            }
            System.out.println();
        }
    }

    public static int pedirEntero(){
        return obtenerEntero("Introduzca el multiplicando: ");
    }

    public static int obtenerEntero(String missatge){
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                teclat.next();
                System.out.println("Error, debes introducir un numero entero");
            }
        }while (true);
    }

}
