package es.pascual;

import java.util.Random;

public class Activitat5_17 {

    public static Random generarAtleatori = new Random();

    public static void main(String[] args) {
        int [] myArray = crearArray();
        visualitzarArray(myArray);
        System.out.println("\n" + cercarZero(myArray));
        intercanvia(myArray);
        visualitzarArray(myArray);
    }

    public static int [] crearArray(){
        int [] vector = new int[10];

        for (int i = 0; i < vector.length ; i++) {
            vector[i] = generarAtleatori.nextInt(51);
        }
        return vector;
    }

    public static void visualitzarArray (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (i > 8){
                System.out.print(vector[i]);
            }else {
                System.out.print(vector[i] + ", ");
            }
        }
    }

    public static int cercarZero(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void intercanvia(int [] vector){
        if (vector.length >= 2){
            int primerElement = vector[0];
            int ultimElement = vector[vector.length-1];
            vector[0] = ultimElement;
            vector[vector.length-1] = primerElement;
        }
    }



}
