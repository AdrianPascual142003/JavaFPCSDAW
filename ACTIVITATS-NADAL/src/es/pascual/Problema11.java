package es.pascual;

import java.util.Scanner;

public class Problema11 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inicio();
    }

    public static void inicio() {
        String[][] tableroAjerdrez = {
                {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
                {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
                {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
                {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
                {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
                {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
                {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
                {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"},
        };
        System.out.print("Introduzca la posición del alfil: ");
        String posicionIntroducida = teclat.next();
        String [] diagonalIzquierdaSuperior = obtenerDiagonalIzquierdaSuperior(tableroAjerdrez,posicionIntroducida);
        String [] diagonalIzquierdaInferior = obtindreDiagonalIzquierdaInferior(tableroAjerdrez,posicionIntroducida);
        String [] diagonalDerechaSuperior = obtenerDiagonalDerechaSuperior(tableroAjerdrez,posicionIntroducida);
        String [] diagonalInferiorDerecha = obtenerDiagonalInferiorDerecha(tableroAjerdrez,posicionIntroducida);
        System.out.println("El álfil puede moverse a las siguientes posiciones:");
        mostrarArray(diagonalIzquierdaSuperior);
        mostrarArray(diagonalIzquierdaInferior);
        mostrarArray(diagonalDerechaSuperior);
        mostrarArray(diagonalInferiorDerecha);
    }

    public static void mostrarArray(String[] array){
        for (String item : array) {
            System.out.print(item + " ");
        }
    }

    //funciona
    public static String[] obtenerDiagonalIzquierdaSuperior(String [][]array, String posicionIntroducida){
        int columna = obtenerPosicionColumna(array,posicionIntroducida);
        int fila = obtenerPosicionFila(array,posicionIntroducida);
        String [] diagonal = new String[array.length];
        for (int i = fila; i > 0; i--) {
            if (columna == 0){
                break;
            }
            diagonal[i-1] = array[i-1][columna-1];
            columna--;
        }
        diagonal = borradorNulls(diagonal);
        return diagonal;
    }

    public static String [] obtindreDiagonalIzquierdaInferior(String [][]array, String posicionIntroducida){
        int columna = obtenerPosicionColumna(array,posicionIntroducida);
        int fila = obtenerPosicionFila(array,posicionIntroducida);
        String [] diagonal = new String[8];
        for (int i = fila; i < array.length-1; i++) {
            if (i == array.length-1 || columna == 0){
                break;
            }
            diagonal[i] = array[i+1][columna-1];
            columna--;
        }
        diagonal = borradorNulls(diagonal);
        return diagonal;
    }

    public static String[] obtenerDiagonalDerechaSuperior(String [][]array, String posicionIntroducida){
        int columna = obtenerPosicionColumna(array,posicionIntroducida);
        int fila = obtenerPosicionFila(array,posicionIntroducida);
        String [] arrayPrueba = new String[8];
        for (int i = fila; i > 0; i--) {
            if (columna == array.length-1){
                break;
            }
            arrayPrueba[i] = array[i-1][columna+1];
            columna++;
        }
        arrayPrueba = borradorNulls(arrayPrueba);
        return arrayPrueba;
    }
    //funciona
    public static String[] obtenerDiagonalInferiorDerecha(String [][]array, String posicionIntroducida){
        int columna = obtenerPosicionColumna(array,posicionIntroducida);
        int fila = obtenerPosicionFila(array,posicionIntroducida);
        String [] diagonal = new String[8];
        for (int i = fila; i < array.length-1; i++) {
            if (columna == array.length-1){
                break;
            }else {
                diagonal[i-1] = array[i+1][columna+1];
                columna++;
            }
        }
        diagonal = borradorNulls(diagonal);
        return diagonal;
    }

    public static String[] moverNulls(String[]array){
        int j = 0;
        String [] arrayOrdenado = new String[array.length];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null)
            {
                arrayOrdenado[j] = array[i];
                j++;
            }
        }
        return arrayOrdenado;
    }

    public static String[] borradorNulls(String[]array){
        String[] arrayOrdenado = moverNulls(array);
        int contadorNulls = 0;
        for (int i = 0; i < arrayOrdenado.length; i++) {
            if (arrayOrdenado[i] == null){
                contadorNulls++;
            }
        }
        contadorNulls = Math.abs(contadorNulls - array.length);
        String [] arraySinNulls = new String[contadorNulls];
        for (int i = 0; i < arraySinNulls.length; i++) {
            arraySinNulls[i] = arrayOrdenado[i];
        }
        return arraySinNulls;
    }

    public static int obtenerPosicionFila(String [][] array, String posicion){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equalsIgnoreCase(posicion)){
                    return i;
                }
            }
        }
        return 0;
    }

    public static int obtenerPosicionColumna(String [][] array, String posicion){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equalsIgnoreCase(posicion)){
                    return j;
                }
            }
        }
        return 0;
    }

}
