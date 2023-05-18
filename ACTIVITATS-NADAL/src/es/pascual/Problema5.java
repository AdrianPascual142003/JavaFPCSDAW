package es.pascual;

import java.util.Arrays;
import java.util.Scanner;

public class Problema5 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        int [] arrayNumeros = pedirNumeros();
        mostrarMaxMin(arrayNumeros);
    }

    public static void mostrarMaxMin(int [] array){
        invertirArray(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                System.out.print("Máximo = ");
            }else if (i == 9) {
                System.out.println("Minimo = " + array[i]);
            }else {
                System.out.print(array[i] + ", ");
            }

        }
    }

    public static void invertirArray(int [] array){
        Arrays.sort(array);
        int [] copiaArray = clonarArray(array);
        int indexClonacio = 10-1;
        for (int i = 0; i < array.length ; i++) {
            array[i] = copiaArray[indexClonacio];
            indexClonacio--;
        }
    }

    public static int[] clonarArray(int []array){
        int [] arrayClonat = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayClonat[i] = array[i];
        }
        return arrayClonat;
    }

    public static int [] pedirNumeros(){
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
