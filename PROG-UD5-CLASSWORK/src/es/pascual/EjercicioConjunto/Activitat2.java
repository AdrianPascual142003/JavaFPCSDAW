package es.pascual.EjercicioConjunto;

import java.util.Scanner;

public class Activitat2 {

    /**
     * @autor Adrian Pascual
     */
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }

    public static void inici(){
        cartelIntroduccio();
        retornarNumeroVocals();
    }

    public static void cartelIntroduccio(){
        System.out.print("Introduce una palabra o frase: ");
    }

    public static void retornarNumeroVocals(){
        System.out.println("La palabra o frase contiene " + vocalesContenidas() + " vocales");
    }

    public static int vocalesContenidas(){
        String cadena = teclat.nextLine().toLowerCase();
        int contadorVocals = 0;
        for (int i = 0; i < cadena.length() ; i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contadorVocals++;
            }
        }
        return contadorVocals;
    }
}
