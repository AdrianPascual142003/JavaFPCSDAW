package es.pascual;

import java.util.Arrays;
import java.util.Scanner;

public class Problema6 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        int [] arrayNumeros = demanarNumeros();
        int [] arrayClonat = clonarArray(arrayNumeros);
        ordenarArrayPar(arrayClonat);
        System.out.println("Array inicial");
        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println("Array Final");
        System.out.println(Arrays.toString(arrayClonat));

    }

    public static void ordenarArrayPar(int [] array){
        int [] arrayEnteros = new int [obtenerTotalEnteros(array)];
        int [] arrayImpares = new int [10-obtenerTotalEnteros(array)];
        int contador = 0;
        for (int item : array) {
            if (item % 2 == 0) {
                arrayEnteros[contador] = item;
                contador++;
            }
        }
        contador = 0;
        for (int item : array) {
            if (item % 2 != 0) {
                arrayImpares[contador] = item;
                contador++;
            }
        }
        System.arraycopy(arrayImpares, 0, array, 0, arrayImpares.length);
        System.arraycopy(arrayEnteros, 0, array, arrayImpares.length, arrayEnteros.length);
    }

    public static int obtenerTotalEnteros(int [] array){
        int contadorEnteros = 0;
        for (int item : array) {
            if (item % 2 == 0) {
                contadorEnteros++;
            }
        }
        return contadorEnteros;
    }


    public static int[] clonarArray(int []array){
        int [] arrayClonat = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayClonat[i] = array[i];
        }
        return arrayClonat;
    }

    public static int [] demanarNumeros(){
        int [] arrayNumeros = new int [10];
        for (int i = 0; i < arrayNumeros.length; i++) {
            int numero = obtindreEnters("Intoduce un número entero: ");
            arrayNumeros[i] = numero;
        }
        return arrayNumeros;
    }

    public static int obtindreEnters(String missatge){
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                teclat.next();
                System.out.println("Error, debes de introducir un número entero");
            }
        }while (true);
    }

}
