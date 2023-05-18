package es.pascual;

import java.util.Scanner;

public class Problema1 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        comprobarPalindroma();
    }

    public static void comprobarPalindroma(){
        String cadena = obtenerCadena("Introduzca una cadena: ");
        if (esPalindroma(cadena)){
            System.out.print("Es palíndroma");
        }else {
            System.out.print("No es palíndroma");
        }
    }

    public static boolean esPalindroma(String cadena){
        String cadenaInversa = "";
        for (int i = cadena.length()-1; i >= 0 ; i--) {
            cadenaInversa = cadenaInversa.concat(String.valueOf(cadena.charAt(i)));
        }
        return cadenaInversa.equals(cadena);
    }

    public static String obtenerCadena(String mensaje){
        do {
            System.out.print(mensaje);
            String cadena = teclat.next();
            if (comprabarCadena(cadena)){
                return cadena;
            }else {
                System.out.println("Error! la cadena " + cadena + " no es vàlida");
            }
        }while (true);
    }

    public static boolean comprabarCadena(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122 || cadena.charAt(i) >= 65 && cadena.charAt(i) <=90){
                contador++;
            }
        }
        return contador == cadena.length();
    }

}
