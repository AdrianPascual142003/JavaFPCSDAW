package es.pascual;

import java.util.Arrays;
import java.util.Random;

public class Activitat20 {

    static Random generarAtleatori = new Random();


    public static void main(String[] args) {

        int [] llistat1 = crearArrayElements(10);
        int [] llistat2 = crearArrayElements(10);
        System.out.println(Arrays.toString(llistat1));
        System.out.println(Arrays.toString(llistat2));
        ordenarPerIntercanvi(llistat1);
        ordenarPerIntercanvi(llistat2);
        System.out.println(Arrays.toString(llistat1));
        System.out.println(Arrays.toString(llistat2));

    }

    public static void ordenarPerIntercanvi(int [] arrayIntroduit){
        for (int i = 0; i < (arrayIntroduit.length-1); i++) {
            for (int j = i + 1; j < arrayIntroduit.length; j++) {
                if (arrayIntroduit[j] < arrayIntroduit[i]){
                    int aux = arrayIntroduit[i];
                    arrayIntroduit[i] = arrayIntroduit[j];
                    arrayIntroduit[j] = aux;
                }
            }
        }
    }

    public static int [] crearArrayElements(int numeroElements){
        int [] array  = new int [numeroElements];

        for (int i = 0; i < array.length; i++) {
            array[i]  = generarAtleatori.nextInt(100);
        }
        return array;
    }

}
