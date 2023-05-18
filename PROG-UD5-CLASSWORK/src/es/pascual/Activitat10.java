package es.pascual;

import java.util.Random;
import java.util.Scanner;

public class Activitat10 {

    static final int MAX_INTENTS = 8;

    static final char SIMBOL_LLETRA_ENCARA_NO_ENDEVINADA = '-';

    static Scanner scanner;

    static final String PARAULA_1 = "java";
    static final String PARAULA_2 = "taula";
    static final String PARAULA_3 = "variable";
    static final String PARAULA_4 = "unari";
    static final String PARAULA_5 = "javascript";
    static final String PARAULA_6 = "intellij";
    static final String PARAULA_7 = "entorns";
    static final String PARAULA_8 = "programacio";

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        jugar();
    }

    /*--------------------------------------------- Nivell 1 ------------------------------------------------------*/

    /**
     * Mètode principal, implementa la llógica del joc fent ús dels mètodes
     * de nivell 2
     */
    public static void jugar() {
        String nom = obtindreNomJugador();
        String paraulaAEndevinar = obtindreParaulaAleatoria();
        boolean haGuanyat = iniciarPartida(paraulaAEndevinar);
        veureResultatPartida(haGuanyat, nom);
    }

    /*--------------------------------------------- Nivell 2 -----------------------------------------------------*/

    /**
     * Obté el nom del jugador introduït per teclat
     *
     * @return Nom del jugador
     */
    public static String obtindreNomJugador() {
        System.out.print("Introdueix el teu nom: ");
        return scanner.next();
    }

    /**
     * Obté aleatoriament una de les paraules possibles a endevinar
     *
     * @return la paraula a endevinar triada (sempre serà en minuscula)
     */
    public static String obtindreParaulaAleatoria() {
        Random randomizer = new Random();
        final String[] llistatParaules = {PARAULA_1, PARAULA_2, PARAULA_3, PARAULA_4, PARAULA_5, PARAULA_6, PARAULA_7, PARAULA_8};
        return llistatParaules[randomizer.nextInt(llistatParaules.length)];
    }

    /**
     * Repeteix un màxim de @MAX_INTENTS erronis la petició a l'usuari d'un caràcter, realitza les accions relacionades amb la tirada
     * i mostra el resultat, tot fent us dels métodes de nivell 3.
     *
     * @param paraulaAEndevinar La paraula secreta a endevinar
     */
    public static boolean iniciarPartida(String paraulaAEndevinar) {
        int intents = 1;
        StringBuilder paraulaACompletar = obtindreParaulaBuida(paraulaAEndevinar);
        do {
            char tiradaUsuari = obtindreTiradaUsuari(intents);
            int ocurrencies = realitzarTirada(paraulaACompletar, tiradaUsuari, paraulaAEndevinar);
            if (haGuanyat(paraulaACompletar)) {
                return true;
            } else if (ocurrencies == 0) {
                intents++;
            }
        } while (intents <= MAX_INTENTS);
        return false;
    }

    /**
     * Mostra el missatge:
     * 'El jugador @nomJugador ha guanyat' si s'ha guanyat la partida
     * o el missatge:
     * 'El jugador @nomJugador ha perdut' en cas contrari
     *
     * @param haGuanyat  true determina que la partida s'ha guanyat
     * @param nomJugador
     */
    public static void veureResultatPartida(boolean haGuanyat, String nomJugador) {
        if (haGuanyat){
            System.out.print("El jugador " + nomJugador + " ha guanyat");
        }else {
            System.out.print("El jugador " + nomJugador + " ha perdut");
        }
    }

    /*--------------------------------------------- Nivell 3 -----------------------------------------------------*/

    /**
     * Obté una cadena mutable equivalent @paraulaAEndevinar que representa els acerts actuals de l'usuari.
     * Inicialment Aquesta paraula sols te guions que indiquen que no hi ha cap acert ------.
     *
     * @param paraulaAEndevinar
     * @return Cadena mutable amb tants guions com la mida de la paraula a endevinar
     */
    public static StringBuilder obtindreParaulaBuida(String paraulaAEndevinar) {
        StringBuilder paraulaAmbGuions = new StringBuilder();
        for (int i = 0; i < paraulaAEndevinar.length(); i++) {
            paraulaAmbGuions.append(SIMBOL_LLETRA_ENCARA_NO_ENDEVINADA);
        }
        return paraulaAmbGuions;
    }

    /**
     * Obté el caràcter alfabètic introduit per teclat pel jugador, mostrant el missatge:
     * 'Introdueix el caràcter en el intent @intentActual: '.
     * <p>
     * Si el jugador introdueix més de 1 caràcter o aquest és un número mostrarà el missatge '
     * 'Error. Has de un introduïr només un carácter alfabètic' demanant de nou la dada
     *
     * @param intentActual Número d'intents realitzats
     * @return El caràcter llegit (aquest sempre serà en minúscules independentment del que introduïsca l'usuari)
     */
    public static char obtindreTiradaUsuari(int intentActual) {
        do {
            System.out.print("Introdueix el caràcter en el intent " + intentActual + ": ");
            String tiradaUsuari = scanner.next().toLowerCase();
            if (esUnCaracter(tiradaUsuari)){
                return tiradaUsuari.charAt(0);
            }else{
                System.out.println("Error. Has de un introduïr només un carácter alfabètic");
            }
        }while (true);
    }

    /**
     * Substitueix el caràcter en la paraula a completar, mostrant posteriorment el resultat de la tirada
     *
     * @param paraulaACompletar
     * @param tiradaUsuari
     * @param paraulaAEndevinar
     * @return el número de ocurrencies de @tiradaUsuari que apareixen en @paraulaAEndevinar
     */
    public static int realitzarTirada(StringBuilder paraulaACompletar, char tiradaUsuari, String paraulaAEndevinar) {
        int ocurrencies = substitueixOcurrencies(paraulaACompletar, tiradaUsuari, paraulaAEndevinar);
        veureResultatTirada(ocurrencies, paraulaACompletar);
        return ocurrencies;
    }

    /**
     * Determina si l'usuari ha encertat totes les lletres.
     * Hauràs de comprobar que ningún dels caràcters ha de ser igual al SIMBOL_LLETRA_ENCARA_NO_ENDEVINADA
     *
     * @param paraulaACompletar
     * @return true si la paraula s'ha completat
     */
    public static boolean haGuanyat(StringBuilder paraulaACompletar) {
        for (int i = 0; i < paraulaACompletar.length(); i++) {
            if (paraulaACompletar.charAt(i) == SIMBOL_LLETRA_ENCARA_NO_ENDEVINADA){
                return false;
            }
        }
        return true;
    }

    /*--------------------------------------------- Nivell 4 -----------------------------------------------------*/

    /**
     * Indica si el contingut d'una cadena està composat per només un caràcter alfabètic
     *
     * @param cadena La cadena a analitzar
     * @return true si es un caràcter alfabètic
     */

    public static boolean esUnCaracter(String cadena) {
        cadena = cadena.toLowerCase();
        if (cadena.length() == 1) {
            char tirada = cadena.charAt(0);
            return tirada >= 97 && tirada <= 122;
        }else {
            return false;
        }
    }


        /**
         * Substitueix el caràcter jugat per l'usuari en la paraula a completar i retorna el número de ocurrències que hi han
         *
         * @param paraulaCompletar Paraula a completar
         * @param caracter El caràcter a introduir
         * @param paraulaAEndevinar La paraula secreta a endevinar
         * @return número de ocurrències del caracter introduït en la paraula a endevinar o -1 en cas que el usuari ja haja fet
         * la mateixa tirada anteriorment o en cas que la llargària de la paraula a completar i la paraula a endevinar no sigan
         * la mateixa.
         */
        public static int substitueixOcurrencies (StringBuilder paraulaCompletar,char caracter, String paraulaAEndevinar)
        {
            if (esTiradaRepetida(paraulaCompletar, caracter)) {
                return -1;
            }
            int ocurrencia = 0;
            for (int i = 0; i < paraulaAEndevinar.length(); i++) {
                if (paraulaAEndevinar.charAt(i) == caracter) {
                    paraulaCompletar.setCharAt(i, caracter);
                    ocurrencia++;
                }
            }
            return ocurrencia;
        }

        /**
         * Mostra per pantalla el text:
         *     'Correcte :) @paraulaCompletar (@ocurrencies coincidiència\es)' si hi han hagut coincidiencies
         * el text
         *     'Incorrecte :( @paraulaCompletar (@ocurrencies coincidiència\es)' si no n'hi han hagut
         * o el text
         *     'Lletra ja encontrada :S' si la tirada ja havia sigut feta anteriorment @totalOcurrencies < 0
         *
         * @param totalOcurrencies
         * @param paraulaCompletar
         */
        public static void veureResultatTirada ( int totalOcurrencies, StringBuilder paraulaCompletar){
            if (totalOcurrencies > 0) {
                System.out.println("Correcte :)\n" + paraulaCompletar + " (" + totalOcurrencies + " coincidència\\es)");
            } else if (totalOcurrencies == 0) {
                System.out.println("Incorrecte :(\n" + paraulaCompletar + " (" + totalOcurrencies + " coincidència\\es)");
            } else {
                System.out.println("Lletra ja encontrada :S");
            }

        }

        /*--------------------------------------------- Nivell 5 -----------------------------------------------------*/

        /**
         * Determina si un caràcter es troba en una cadena.
         *
         * @param paraulaCompletar cadena mutable a analitzar
         * @param tiradaUsuari
         *
         * @return true si el caràcter es troba en la cadena
         */
        public static boolean esTiradaRepetida (StringBuilder paraulaCompletar,char tiradaUsuari){
            return paraulaCompletar.indexOf(String.valueOf(tiradaUsuari)) != -1;
        }

    }
