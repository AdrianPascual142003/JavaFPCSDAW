package es.pascual;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner teclat;

    public static void main(String[] args) {
	    teclat = new Scanner(System.in);
        System.out.println(esPrimo(16));
        int [] arrayNumeros = obtenerNumeros();
        //int [] primos = obtenerPrimos(arrayNumeros);
        ordenarNumeros(arrayNumeros);
        System.out.println(Arrays.toString(arrayNumeros));
    }

    public static void ordenarNumeros(int [] array){
        int [] arrayClonado = clonarArray(array);
        int indiceMinimo = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])){
                array[indiceMinimo] = array[i];
                indiceMinimo++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (!esPrimo(arrayClonado[i])){
                array[indiceMinimo] = arrayClonado[i];
                indiceMinimo++;
            }
        }

    }
    public static void ordenarNumeros2(int [] array){
        int [] arrayClonado = clonarArray(array);
        int indiceMinimo = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])){
                array[indiceMinimo] = array[i];
                indiceMinimo++;
            }
        }

    }

    public static int [] clonarArray(int [] array){
        int [] arrayClonado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayClonado [i] = array[i];
        }
        return arrayClonado;
    }

    public static int [] obtenerPrimos(int[] array){
        int [] arrayPrimos = new int[10];
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])){
                arrayPrimos[indice] = array[i];
                indice++;
            }
        }
        return arrayPrimos;
    }

    public static boolean esPrimo (int numeroComprobar){
        for (int i = numeroComprobar-1; i > 0 ; i--) {
            if (numeroComprobar % i == 0 && i != 1){
                return false;
            }
        }
        return true;
    }

    public static int [] obtenerNumeros(){
        int [] arrayNumeros = new int[10];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = pedirEntero();
        }
        return arrayNumeros;
    }

    public static int pedirEntero(){
       return obtenerEntero("Introduce un numero entero: ");
    }

    public static int obtenerEntero(String mensaje){
        do {
            System.out.print(mensaje);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                System.out.println("Error!!, debes de introducir un entero");
                teclat.next();
            }
        }while (true);
    }
}
