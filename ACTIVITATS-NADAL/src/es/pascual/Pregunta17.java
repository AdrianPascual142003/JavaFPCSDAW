package es.pascual;

import java.util.Arrays;

public class Pregunta17 {

    public static void main(String[] args) {

        String[][] tablaAlumnos = {
                {"Pepe García","8","6","9","10","7","6"},
                {"Juan Perez","9","6","4","5","10","9"},
                {"Elena García","9","9","8","7","10","10"}
        };

        double [] mediaTeorica = calcularMediaTeoria(tablaAlumnos);
        mostrarMediaTeorica(tablaAlumnos,mediaTeorica);
        System.out.println();
        double [] mediaPractica = calcularMediaPractica(tablaAlumnos);
        mostrarMediaPractica(tablaAlumnos,mediaPractica);
        System.out.println();
        double [] mediaTotal = calcularMediaTotal(tablaAlumnos);
        mostrarMediaTotal(tablaAlumnos,mediaTotal);

    }

    public static void mostrarMediaTeorica(String[][] tabla, double[] media){
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("La media teorica de %s es de %.2f %n",tabla[i][0],media[i]);
        }
    }

    public static void mostrarMediaPractica(String[][] tabla, double[] media){
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("La media practica de %s es de %.2f %n",tabla[i][0],media[i]);
        }
    }

    public static void mostrarMediaTotal(String[][] tabla, double[] mediaTotal){
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("La media total de %s es de %.2f %n",tabla[i][0],mediaTotal[i]);
        }
    }

    public static double[] calcularMediaTotal(String[][] tabla){
        double [] mediaTeorica = calcularMediaTeoria(tabla);
        double [] mediaTotalAlumnos = new double[3];
        double [] mediaPractica = calcularMediaPractica(tabla);
        for (int i = 0; i < tabla.length; i++) {
            double mediaTotal = 0;
            mediaTotal = mediaPractica[i] + mediaTeorica[i];
            mediaTotal = mediaTotal / 2;
            mediaTotalAlumnos[i] = mediaTotal;
        }
        return mediaTotalAlumnos;
    }

    public static double[] calcularMediaTeoria(String[][] tabla){
        double [] mediasAlumnos = new double [3];
        for (int i = 0; i < tabla.length; i++) {
            double media = 0;
            for (int j = 1; j < tabla[i].length; j+=2) {
                media += Integer.parseInt(tabla[i][j]);
            }
            media = media / 3;
            mediasAlumnos[i] = media;
        }
        return mediasAlumnos;
    }

    public static double[] calcularMediaPractica(String[][] tabla){
        double [] mediasAlumnos = new double [3];
        for (int i = 0; i < tabla.length; i++) {
            double media = 0;
            for (int j = 2; j < tabla[i].length; j+=2) {
                media += Integer.parseInt(tabla[i][j]);
            }
            media = media/3;
            mediasAlumnos[i] = media;
        }
        return mediasAlumnos;
    }

}
