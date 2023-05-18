package es.pascual.EjercicioConjunto;

import java.util.Scanner;

public class Activitat11_7 {

    /**
     * @autor Adrian Pascual
     */

    public static Scanner teclat;
    public static final int CARACTERS_MINIMS_PRIMERA_FRASE = 6;
    public static final int CARACTERS_MINIMS_SEGONA_FRASE = 2;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }

    public static void inici(){
        String primeraCadena = obtindreCadena(CARACTERS_MINIMS_PRIMERA_FRASE, "Introduce cadena 1: ");
        String segonaCadena = obtindreCadena(CARACTERS_MINIMS_SEGONA_FRASE, "Introduce cadena 2: ");
        System.out.println(mostrarCadena2Majuscules(primeraCadena,segonaCadena));
    }

    public static String mostrarCadena2Majuscules(String cadena1, String cadena2){
        String cadena1Comparar = cadena1.toLowerCase();
        String cadena2Comprar = cadena2.toLowerCase();
        int posicioParaulaRepetida = cadena1Comparar.lastIndexOf(cadena2Comprar);
        int llargaria2Cadena = cadena2.length();

        if (posicioParaulaRepetida >= 0){
            String paraulaEncontrada = cadena2Comprar.toUpperCase();
             return  cadena1Comparar.replace(cadena1Comparar.substring(posicioParaulaRepetida,posicioParaulaRepetida + llargaria2Cadena),paraulaEncontrada);
        }else {
            return "Error, no se han encontrado coincidencias";
        }
    }

    public static String obtindreCadena(int numeroDeCarcatersMinims, String missatge){
        do {
            System.out.print(missatge);
            String cadenaIntroduida = teclat.nextLine();
            if (cadenaIntroduida.length() >= numeroDeCarcatersMinims){
                return cadenaIntroduida;
            }else {
                System.out.println("Error, la cadena ha de tindre " + numeroDeCarcatersMinims + " caracters");
            }
        }while (true);
    }
}
