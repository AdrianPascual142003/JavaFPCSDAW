package es.pascual;

import java.util.Random;

public class Problema7 {

    public static final int LIMITE_NUMEROS_GENERAR = 1000;
    static Random generarAtleatori = new Random();

    public static void main(String[] args) {
        int [][] arrayNumeros = new int [6][10];
        llenarArray(arrayNumeros);
        mostrarMatriz(arrayNumeros);
        System.out.println();
        int maximo = obtenerMaximo(arrayNumeros);
        int minimo = obtenerMinimo(arrayNumeros);
        System.out.println("máximo = " + maximo);
        System.out.println("mínimo = " + minimo);
    }

    public static int obtenerMaximo(int[][]array){
        int numeroMaximo = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > numeroMaximo){
                    numeroMaximo = array[i][j];
                }
            }
        }
        return numeroMaximo;
    }

    public static int obtenerMinimo(int[][]array){
        int numeroMinimo = LIMITE_NUMEROS_GENERAR;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < numeroMinimo){
                    numeroMinimo = array[i][j];
                }
            }
        }
        return numeroMinimo;
    }

    public static void llenarArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generarAtleatori.nextInt(LIMITE_NUMEROS_GENERAR+1);
            }
        }
    }

    public static void mostrarMatriz(int [][] array){
        System.out.println("Matriz generada:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
