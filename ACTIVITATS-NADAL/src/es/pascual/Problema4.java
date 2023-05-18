package es.pascual;

import java.util.Arrays;

public class Problema4 {

    public static void main(String[] args) {

        int [] array1 = {10, -30, 13, 77, 20};
        int [] array2 = {20, 10, 10};
        System.out.println("a1 = " + Arrays.toString(array1));
        System.out.println("a2 = " + Arrays.toString(array2));
        System.out.print("resultado = " + Arrays.toString(obtindreRepetits(array1,array2)));
    }

    public static int[] obtindreRepetits(int [] array1, int [] array2){
        int [] arrayRepetits;
        if (array1.length > array2.length){
            arrayRepetits =  new int [array1.length];
        }else {
             arrayRepetits = new int [array2.length];
        }
        int contadorArrayRepetits = 0;
        for (int fila : array2) {
            for (int columna : array1) {
                if (fila == columna) {
                    arrayRepetits[contadorArrayRepetits] = columna;
                    if (estaRepetit(arrayRepetits)) {
                        arrayRepetits[contadorArrayRepetits] = 0;
                    }
                    contadorArrayRepetits++;

                }
            }
        }
        return arrayRepetits;
    }

    public static boolean estaRepetit(int[] arrayRepetits){
        int [] arrayClonat = clonarArray(arrayRepetits);
        Arrays.sort(arrayClonat);
        for (int i = 0; i < arrayClonat.length-1; i++) {
            if (arrayClonat[i] == arrayClonat[i+1] && arrayClonat[i] != 0){
                return true;
            }
        }
        return false;
    }
    
    public static int[] clonarArray(int []array){
        int [] arrayClonat = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayClonat[i] = array[i];
        }
        return arrayClonat;
    }
}
