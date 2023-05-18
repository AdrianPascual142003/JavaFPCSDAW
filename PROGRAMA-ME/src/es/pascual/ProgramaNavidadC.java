package es.pascual;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaNavidadC {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inicio();
    }

    public static void inicio(){
        int numeroCubos;
        do {
            numeroCubos = teclat.nextInt();
            if (numeroCubos == 0) {
                return;
            }
            int[] arrayGenerado = generarArray(numeroCubos);
            Arrays.sort(arrayGenerado);
            int comprovarDiferencia = comprovarDiferencia(arrayGenerado);
            System.out.println(comprovarDiferencia);
        }while (true);
    }

    public static int comprovarDiferencia(int [] array){
        int diferenciaMayor = 0;
        for (int i = 0; i < array.length - 1; i+=2) {
            int diferenciaActual = array[i+1] - array[i];
            if (diferenciaActual > diferenciaMayor){
               diferenciaMayor = diferenciaActual;
            }
        }
        return diferenciaMayor;
    }

    public static int[] generarArray(int numeroCubos){
        int[] array = new int[numeroCubos];
        for (int i = 0; i < numeroCubos; i++) {
            array[i] = teclat.nextInt();
        }
        return array;
    }

}
