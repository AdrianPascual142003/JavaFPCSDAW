package es.pascual;

public class Problema8 {

    public static void main(String[] args) {
        int [][] arrayNumeros = {
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,11},
                {1,2,3,4,5,6,7,8,9,12},
                {1,2,3,4,5,6,7,8,9,13},
                {1,2,3,4,5,6,7,8,9,14},
                {1,2,3,4,5,6,7,8,9,15},
                {1,2,3,4,5,6,7,8,9,16},
                {1,2,3,4,5,6,7,8,9,17},
                {1,2,3,4,5,6,7,8,9,18},
                {1,2,3,4,5,6,7,8,9,19},
        };

        mostrarSumaColumnas(arrayNumeros);
        mostrarSumaFilas(arrayNumeros);
    }

    public static void mostrarSumaColumnas(int[][] array){
        int contadorColumnas = 0;
        for (int i = 0; i < array.length; i++) {
            int suma = 0;
            for (int j = 0; j < array[i].length; j++) {
                suma+= array[i][j];
            }
            contadorColumnas++;
            System.out.println("Columna "+ contadorColumnas + " = " + suma);
        }

    }

    public static void mostrarSumaFilas(int[][] array){
        int contadorFila = 0;
        for (int i = 0; i < array.length; i++) {
            int suma = 0;
            for (int j = 0; j < array[i].length; j++) {
                suma+= array[j][i];
            }
            contadorFila++;
            System.out.println("Fila "+ contadorFila + " = " + suma);
        }

    }


}
