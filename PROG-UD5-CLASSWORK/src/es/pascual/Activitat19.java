package es.pascual;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activitat19 {

    public static void main(String[] args) {

        int [] arrayA = {
                10, 20, 30, 40, 50
        };
        int [] arrayB = {
                60, 70, 80, 90, 100
        };

        int suma = arrayA[3] + arrayB[4];

        int [] arrayC = new int[5];
        arrayC[1] = suma + arrayA[0];

        int multiplicacionTotalA = 1;
        for (int i = 0; i < arrayA.length; i++) {
            multiplicacionTotalA = multiplicacionTotalA * arrayA[i];
        }
        arrayC[0] = multiplicacionTotalA;

        int sumaTotalA = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sumaTotalA = sumaTotalA + arrayA[i];
        }
        arrayC[2] = sumaTotalA;

        arrayC[3] = arrayB[0] / arrayC[0];

        arrayC[4] = Math.max(arrayB[0],arrayA[arrayA.length-1]);

        System.out.println("ArrayA " + Arrays.toString(arrayA));
        System.out.println("ArrayB " + Arrays.toString(arrayB));
        System.out.println("ArrayC " + Arrays.toString(arrayC));

        System.out.println("\nArray For : ");
        visualizarArrayFor(arrayB);

        System.out.println("\n\nArray Foreach: ");
        visualizarArrayForEach(arrayA);

        System.out.println("\n\nExtremos Array");
        visualizarExtremos(arrayC);

        int [] copiaArray = obtenerCopia(arrayC);
        for (int i = 0; i < copiaArray.length; i++) {
            System.out.print(copiaArray[i] + " ");
        }
        System.out.println("\n\nMultiplos: ");
        visualizarMultiplos(arrayC,2);

    }

    /**
     * Crea un método llamado visualizarArrayFor que reciba como
     * argumento un array de entero y visualice todos sus elementos utilizando
     * la estructura for. Prueba su funcionamiento haciendo una llamada
     * desde el main().
     */

    public static void visualizarArrayFor(int [] arrayIntroducido){
        for (int i = 0; i < arrayIntroducido.length; i++) {
            System.out.print(arrayIntroducido[i] + " ");
        }
    }

    /**
     * Crea un método llamado visualizarArrayForEach que reciba como
     * argumento un array de enteros y visualice todos sus elementosutilizando la estructura foreach. Prueba su funcionamiento haciendo una
     * llamada desde el main().
     */

    public static void visualizarArrayForEach(int [] arrayIntroducido){
        for (int items: arrayIntroducido) {
            System.out.print(items + " ");
        }
    }

    /**
     * Crea un método llamado visualizarExtremos que reciba como
     * argumento un array de enteros y visualice el primer y último elemento.
     * Prueba su funcionamiento haciendo una llamada desde el main().ido
     */

    public static void visualizarExtremos(int [] arrayIntroducido){
        System.out.print(arrayIntroducido[0] + " " + arrayIntroducido[arrayIntroducido.length-1]);
    }

    /**
     * Crea un método llamado obtenerCopia que reciba como argumento un
     * array de enteros y retorno otro array exactamente igual al primero.
     * Prueba su funcionamiento haciendo una llamada desde el main().
     */

    public static int [] obtenerCopia(int [] arrayIntroducido){
        int [] arrayClonado = new int[arrayIntroducido.length];
        for (int i = 0; i <arrayIntroducido.length ; i++) {
            arrayClonado[i] = arrayIntroducido[i];
        }
        return arrayClonado;
    }

    /**
     * Crea un método llamado visualizarMultiplos que reciba como
     * argumento un array de enteros y un entero y muestre por pantalla los
     * los elementos del array que sean múltiplos de dicho entero. Prueba su
     * funcionamiento haciendo una llamada desde el main().
     */

    public static void visualizarMultiplos(int [] arrayIntroducido, int numeroIntroducido){
        for (int i = 0; i < arrayIntroducido.length; i++) {
            if (arrayIntroducido[i] % numeroIntroducido == 0) {
                System.out.print(arrayIntroducido[i] + " ");
            }
        }
    }

}
