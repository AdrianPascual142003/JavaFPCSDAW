package es.pascual;

import java.util.Scanner;

public class Problema2 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inicio();
    }

    public static void inicio(){
        int [] arrayNumeros = obtenerNumeros();
        int sumatorioTotal = sumatorioNumeros(arrayNumeros);
        int numeroSuerte = obtenerNumeroSuerte(sumatorioTotal);
        System.out.print("Su número de la suerte es " + numeroSuerte);
    }

    public static int obtenerNumeroSuerte(int sumatorioTotal){
        int sumatorio = 0;
        for (int i = 0; i < 2; i++) {
            int numero = sumatorioTotal%10;
            sumatorioTotal = sumatorioTotal/10;
            sumatorio += numero;
        }
        return sumatorio;
    }

    public static int sumatorioNumeros(int[] arrayNumeros){
        int sumatorioTotal = 0;
        for (int arrayNumero : arrayNumeros) {
            sumatorioTotal += arrayNumero;
        }
        return sumatorioTotal;
    }

    public static int [] obtenerNumeros(){
        String cadena = obtenerCadena("Introduce tu fecha de nacimiento con el formato dd-mm-aaaa: ");
        int [] arrayNumeros = new int [cadena.length()-2];
        int posicionNumero = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != '-'){
                int numeroActual = Integer.parseInt(String.valueOf(cadena.charAt(i)));
                arrayNumeros[posicionNumero] = numeroActual;
                posicionNumero++;
            }
        }
        return arrayNumeros;
    }

    public static String obtenerCadena(String mensaje){
        do {
            System.out.print(mensaje);
            String cadena = teclat.next();
            if (cadena.length() == 10){
                return cadena;
            }else {
                System.out.println("Error la fecha debe de tener el formato dd-mm-aaaa");
            }

        }while (true);
    }

}
