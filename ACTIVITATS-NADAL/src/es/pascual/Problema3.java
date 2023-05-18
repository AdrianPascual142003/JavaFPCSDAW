package es.pascual;

import java.util.Scanner;

public class Problema3 {

    public static Scanner teclat;
    public static final char LETRA_A = '1';
    public static final char LETRA_E = '2';
    public static final char LETRA_I = '3';
    public static final char LETRA_O = '4';
    public static final char LETRA_U = '5';

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inicio();
    }

    public static void inicio(){
        System.out.print("Introduzca una frase: ");
        String cadena = teclat.nextLine();
        System.out.println(remplazarVocales(cadena));
        System.out.println();
        carteleta();
        mostrarVocalesAsteriscos(cadena,'a');
        mostrarVocalesAsteriscos(cadena,'e');
        mostrarVocalesAsteriscos(cadena,'i');
        mostrarVocalesAsteriscos(cadena,'o');
        mostrarVocalesAsteriscos(cadena,'u');
    }

    public static void carteleta(){
        System.out.println("VOCALES");
        System.out.println("------------");
    }

    public static void mostrarVocalesAsteriscos(String cadena, char vocal){
        int totalVocal = contadorVocales(cadena,vocal);
        String asteriscos = "";
        for (int i = 0; i < totalVocal; i++) {
            asteriscos = asteriscos.concat("*");
        }
        int numeroVocal = numeroRemplazo(vocal);
        System.out.println("(" + vocal +  ")" +  numeroVocal + " " + asteriscos);
    }

    public static int numeroRemplazo(char vocal){
        int numero;
        if (vocal == 'a'){
            numero = 1;
        }else if (vocal == 'e'){
            numero = 2;
        }else if (vocal == 'i'){
            numero = 3;
        }else if (vocal == 'o'){
            numero = 4;
        }else{
            numero = 5;
        }
        return numero;
    }

    public static String remplazarVocales(String cadena){
        String cadenaRemplazadaA = cadena.replace('a',LETRA_A);
        String cadenaRemplazadaE = cadenaRemplazadaA.replace('e',LETRA_E);
        String cadenaRemplazadaI = cadenaRemplazadaE.replace('i',LETRA_I);
        String cadenaRemplazadaO = cadenaRemplazadaI.replace('o',LETRA_O);
        return cadenaRemplazadaO.replace('u',LETRA_U);
    }

    public static int contadorVocales(String cadena, char vocal){
        int contadorVocal = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == vocal){
                contadorVocal++;
            }
        }
        return contadorVocal;
    }

}
