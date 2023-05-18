package es.pascual;

import java.util.Scanner;

public class Activitat6 {
    public static Scanner teclat;
    public static char BLANC = ' ';

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String nom = demanarNom();
        String cognom1 = demanarPrimerCognom();
        String cognom2 = demanarSegonCognom();
        String nomComplet = nom + BLANC + cognom1 + BLANC + cognom2;

        System.out.println("Minúsculas: " + obtindreNomCompletMinuscula(nomComplet));
        System.out.println("Mayúsculas: " + obtindreNomCompletMajuscula(nomComplet));
        System.out.println("Longitud: " + obtindreLongitudNomComplet(nomComplet));
        System.out.println("Dos primeros caracteres: " + obtindreDosPrimeresLletres(nomComplet));
        System.out.println("Número de ocurrencias de " + obtindreLletraFinal(nomComplet) + " es");
        System.out.println("Camelcase: " + (nomComplet));
        System.out.println("Asteriscos: " + obtindreNomAmbAsteriscs(nomComplet));
        System.out.println("Majuscules(mutables): " + obtindreMajusculesMutables(nomComplet));
        obtindreCadenaInvertida(nomComplet);
    }


    public static String obtindreNomCompletMinuscula(String cadena){
        return cadena.toLowerCase();
    }
    public static String obtindreNomCompletMajuscula(String cadena){
        return cadena.toUpperCase();
    }
    public static int obtindreLongitudNomComplet(String cadena){
        return cadena.length();
    }
    public static String obtindreDosPrimeresLletres(String cadena){
        return cadena.substring(0,2);
    }
    public static String obtindreLletraFinal(String cadena){
        int lletresNom = obtindreLongitudNomComplet(cadena);
        return cadena.substring(lletresNom-1,lletresNom);
    }
    public static String obtindreNomAmbAsteriscs(String cadena){
        return "***" + cadena + "***";
    }
    //public static String obtindreCamelcase(String nom, String cognom1, String cognom2){
      //  String nomPrimeraLleta = nom.charAt(1);
        //String nomUp = nomPrimeraLleta.toUpperCase();

    //}
    public static String obtindreMajusculesMutables(String cadena){
        String primeraLletra = String.valueOf(cadena.toLowerCase().charAt(0));
        return cadena.replaceAll(primeraLletra, primeraLletra.toUpperCase());
    }
    public static void obtindreCadenaInvertida(String cadena){
        for (int i = cadena.length() -1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }


    public static String demanarNom(){
        return obtindreCadena("Introduce tu nombre");
    }
    public static String demanarPrimerCognom(){
        return obtindreCadena("Introduce tu 1 apellido");
    }
    public static String demanarSegonCognom(){
        return obtindreCadena("Introduce tu 2 apellido");
    }

    public static String obtindreCadena(String missatge){
            System.out.println(missatge);
            return teclat.next();
    }
}
