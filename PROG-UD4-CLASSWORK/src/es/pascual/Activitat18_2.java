package es.pascual;

import java.util.Random;
import java.util.Scanner;

public class Activitat18_2 {

    private static final String COLOR_RESET = "\u001B[0m";
    private static final String COLOR_ROJO = "\u001B[31m";
    private static final String COLOR_VIOLETA = "\u001B[35m";
    private static final String COLOR_AMARILLO = "\u001B[33m";
    private static final String COLOR_AZUL = "\u001B[34m";

    private static final int MINIM_INTENTS = 0;
    private static final int MAXIM_INTENTS = 10;
    private static final int OPCIO_INTENTS_ALEATORIS = 0;

    private static final int MINIMO_NUMERO_ADIVINAR = -99;
    private static final int MAXIMO_NUMERO_ADIVINAR = 99;

    private static final int LIMIT_CREMANT = 5;
    private static final int LIMIT_CALENT = 15;
    private static final int LIMIT_TEMPLAT = 30;
    public static Scanner teclat = new Scanner(System.in);


    public static void main(String[] args) {
        jugarPartida();
    }

    public static void jugarPartida() {
        veureIntroducioJoc();
        int numeroAEndevinar = obtindreNumeroAdivinar();
        int intents = obtindreIntentsUsuari();
        boolean resultatPartida = ferIntents(intents, numeroAEndevinar);
        veureFinalPartida(resultatPartida);
    }

    /*---------------------------- Métodes de nivell 1 -----------------------------*/

    /**
     * Mostra per pantalla el missatge de benvinguda del joc
     */
    public static void veureIntroducioJoc() {

    }

    /**
     * Obté el número secret aleatori a endevinar
     * @return El número secret
     */
    public static int obtindreNumeroAdivinar() {
        return -1;
    }

    /**
     * Mostra el missatge En quants intents penses que endevinaràs el número? [MINIM_INTENTS - MAXIM_INTENTS]:
     * Després obté el número de intents que tindrà l'usuari. Si el número d'intents es 0, es generarà
     * aleatoriament el número d'intents
     * @return El número de intents obtingut
     */
    public static int obtindreIntentsUsuari() {
        return -1;
    }

    /**
     * Determina si la partida s'ha guanyat o no
     * @param intents Intents que es disposa per a endevinar el número
     * @param numeroAEndevinar El número secret
     * @return true si la partida s'ha guanyat o false en cas contrari
     */
    public static boolean ferIntents(int intents, int numeroAEndevinar) {
        int intentActual = 1;
        boolean haGuanyat;
        do {
            int tiradaUsuari = obtindreTiradaUsuari(intentActual);
            haGuanyat = obtindreResultatTirada(tiradaUsuari, numeroAEndevinar);
            intentActual++;
        } while (!haGuanyat && intentActual <= intents);
        return haGuanyat;
    }

    /**
     * Mostra el missatge corresponent al fi de la partida
     * Si la partida s'ha guanyat mostra: Enhorabona! L'has encertat
     * Si la partida s'ha perdut mostra: Ho senc. No l'has encertat
     * En qualsevol cas, després mostra el missatge: Fi
     * @param haGuanyat true: la partida s'ha guanyat false: la partida s'ha perdut
     */
    public static void veureFinalPartida(boolean haGuanyat) {
    }

    /*-------------------------------- Nivell 2 ------------------------------------*/

    /**
     * Mostra el missatge "Intent X [MINIMO_NUMERO_ADIVINAR-MAXIMO_NUMERO_ADIVINAR]: " i després obté el número introduit per l'usuari
     * @param intentActual L'intent en el que s'introdueix el número
     * @return El número introduït
     */
    public static int obtindreTiradaUsuari(int intentActual) {
        return -1;
    }

    /**
     * Determina si el número secret i el número del usuari son iguals, mostrant pista corresponent si ho son
     * @param tiradaUsuari El número introduït per l'usuari
     * @param numeroAEndevinar El número secret
     * @return true si són iguals i false si no ho són
     */
    public static boolean obtindreResultatTirada(int tiradaUsuari, int numeroAEndevinar) {
        int numeroRandom = generarEnterAleatori(MINIMO_NUMERO_ADIVINAR,MAXIMO_NUMERO_ADIVINAR);
        int diferenciaNumeros = 0;
        if (numeroAEndevinar == tiradaUsuari){
            return true;
        }else {
            if (numeroRandom > numeroAEndevinar) {
                diferenciaNumeros = numeroRandom - numeroAEndevinar;
            } else {
                diferenciaNumeros = numeroAEndevinar - numeroRandom;
            }
            veurePista(diferenciaNumeros);
            return false;
        }
    }

    /*-------------------------------------Nivell 3 ---------------------------------*/

    /**
     * Genera un número aleatori dins d'un rang
     * @param min El valor mínim del rang
     * @param max El valor máxim del rang
     * @return El número aleatori
     */
    public static int generarEnterAleatori(int min, int max) {
        return (int) (Math.random() * (max - (min) + 1) + (max));
    }

    /**
     * Demana un número enter dins d'un rang. Si el número llegit no es troba
     * dins del rang es mostrarà el missatge: Error! Has de introduir un número entre @min i @max
     * i es tornará a demanar la dada
     * @param missatge El missatge que es mostrarà abans de demanar el número
     * @param min El mínim valor del rang
     * @param max El màxim valor del rang
     * @return El número llegit
     */
    public static int demanarEnterUsuari(String missatge, int min, int max) {
        int numero;
        do {
            numero = demanarEnterUsuari(missatge);
            if (numero < min || numero > max){
                System.out.println("Error! Has de introduir un número entre "+ min + " i " + max);
            }else {
                return numero;
            }
        }while (true);

    }

    /**
     * Demana un número enter vàlid. Si s'introdueix un valor no enter es mostrará el
     * missatge: Error! El tipus de dades introduït és incorrecte i es tornarà a demanar
     * la dada
     * @param missatge El missatge que es mostrarà abans de demanar el número
     * @return El número llegit
     */
    public static int demanarEnterUsuari(String missatge) {
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            teclat.next();
        } while (true);
    }

    /**
     * Mostra per pantalla la pista corresponent al valor donat
     * @param valorAbsolutDiferencia Diferencia respecte al número secret
     */
    public static void veurePista(int valorAbsolutDiferencia) {
        String pista;
        if (valorAbsolutDiferencia < LIMIT_CREMANT) {
            pista = COLOR_ROJO + "Cremant" + COLOR_RESET;
        } else if (valorAbsolutDiferencia < LIMIT_CALENT) {
            pista = COLOR_VIOLETA + "Calent" + COLOR_RESET;
        } else if (valorAbsolutDiferencia < LIMIT_TEMPLAT) {
            pista = COLOR_AMARILLO + "Templat" + COLOR_RESET;
        } else {
            pista = COLOR_AZUL + "Fret" + COLOR_RESET;
        }
        System.out.println(pista);
    }






}



