package es.pascual;

public class Activitat25 {

    public static void main(String[] args) {

        int [][] arrayMulti = new int [5][7];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                arrayMulti[i][j] = i+1;
            }
        }

        mostrarArrayCompleto(arrayMulti);
        System.out.println();
        mostrarFilaIntroduida(arrayMulti,4);
        System.out.println();
        intercambiarFilaColumnaIndicada(arrayMulti,3,2,4,2);
        mostrarArrayCompleto(arrayMulti);
        intercambiariarColumnes(arrayMulti,2,3);
        System.out.println();
        mostrarArrayCompleto(arrayMulti);


    }

    public static void mostrarArrayCompleto(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarFilaIntroduida(int [][] array, int fila){
        for (int i = 0; i < array[fila].length; i++) {
            System.out.print(array[fila][i] + "\t");
        }
        System.out.println();
    }

    public static void intercambiarFilaColumnaIndicada(int[][] array, int numFila1, int numColumna1, int numFila2, int numColumna2){
        int aux = array[numFila1][numColumna1];
        array[numFila1][numColumna1] = array[numFila2][numColumna2];
        array[numFila2][numColumna2] = aux;
    }

    public static void intercambiariarColumnes(int[][] array, int columna1, int columna2){
        for (int i = 1; i < array.length; i++) {
            intercambiarFilaColumnaIndicada(array, columna1, i, columna2, i);
        }
    }

}
