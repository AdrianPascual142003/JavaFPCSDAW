package es.pascual;

import java.util.Arrays;

public class Problema9 {

    public static final int RANG_MINIM = 500;
    public static final int RANG_MAXIM = 900;
    public static final int NUMERO_COLUMNES = 9;
    public static final int NUMERO_FILES = 9;

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        int[][] arrayNumeros = crearArray();
        System.out.println("TABLA:");
        mostrarArray(arrayNumeros);
        System.out.println();
        int [] diagonal = generarDiagonal(arrayNumeros);
        System.out.println("DIAGONAL: " + Arrays.toString(diagonal));
        int numeroMaximo = obtindreMaxim(diagonal);
        System.out.println("MAXIMO: " + numeroMaximo);
        int numeroMinim = obtindreMinim(diagonal);
        System.out.println("MINIMO: " + numeroMinim);
        int mitjanaNumeros = obtindreMitjana(diagonal);
        System.out.println("MINIMO: " + mitjanaNumeros);
    }

    public static int obtindreMitjana(int[]array){
        int sumaTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumaTotal += array[i];
        }
        return sumaTotal/9;
    }

    public static int obtindreMaxim(int[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static int obtindreMinim(int[]array){
        Arrays.sort(array);
        return array[0];
    }

    public static int[][] crearArray(){
        int [][] arrayNumeros = new int[NUMERO_FILES][NUMERO_COLUMNES];
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros.length; j++) {
                arrayNumeros[i][j] = (int) (Math.random() * (RANG_MAXIM - RANG_MINIM + 1) + RANG_MINIM);
            }
        }
        return arrayNumeros;
    }

    public static void mostrarArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] generarDiagonal(int[][] array){
        int [] diagonal = new int [9];
        int contador = 0;
        for (int i = array.length; i > 0 ; i--) {
            diagonal[contador] = array[i-1][contador];
            contador++;
        }
        return diagonal;
    }




}
