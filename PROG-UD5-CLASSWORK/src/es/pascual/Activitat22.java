package es.pascual;

import java.util.Arrays;
import java.util.Random;

public class Activitat22 {

    static Random generarAtleatori = new Random();

    public static void main(String[] args) {

        int [] llistat1 = crearArrayElements(10);
        int [] llistat2 = crearArrayElements(10);
        ordenarPerIntercanvi(llistat1);

        int elementABuscar = 60;
        int indexElement = cercarEnVectorNoOrdenat(llistat2,elementABuscar);
        System.out.println(Arrays.toString(llistat2));
        System.out.printf("El element %d esta en el index %d %n", elementABuscar, indexElement);

        indexElement = cercarEnVectorOrdenat(llistat1,elementABuscar);
        System.out.println(Arrays.toString(llistat1));
        System.out.printf("El element %d esta en el index %d %n", elementABuscar, indexElement);

    }

    public static int cercarEnVectorNoOrdenat(int [] numeros, int numBuscar){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar){
                return i;
            }
        }
        return -1;
    }

    public static int cercarEnVectorOrdenat(int [] numeros, int numBuscar){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar){
                return i;
            }else if (numeros[i] > numBuscar){
                break;
            }
        }
        return -1;
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
