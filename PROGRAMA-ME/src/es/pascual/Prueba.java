package es.pascual;

import java.util.Arrays;

public class Prueba {

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        int [] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(array));
        int [] copiaArray = copiarArray(array);
        int [] arrayIntercambiado = intercambiarArray(copiaArray);
        System.out.println(Arrays.toString(arrayIntercambiado));
    }

    public static int[] intercambiarArray(int []array){
        int[] arrayCopiado = copiarArray(array);
        int maximo = arrayCopiado.length -1;
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCopiado[maximo];
            maximo--;
        }
        return array;
    }

    public static int [] copiarArray(int []array){
        int[] copiaArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            copiaArray[i] = array[i];
        }
        return copiaArray;
    }

}
