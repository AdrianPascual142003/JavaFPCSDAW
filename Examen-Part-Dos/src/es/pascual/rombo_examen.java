package es.pascual;

import java.util.Scanner;

public class rombo_examen {

    public static Scanner teclat;
    public static final int CALCUL_AREA_FRECUENCIA = 1;
    public static final int CALCUL_AREA = 2;
    public static final int CALCUL_FRECUENCIA = 3;
    public static final int EIXIR = 4;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        comencarPrograma();
    }


    public static void comencarPrograma() {
        capcaleraInicial();
        String obtindreNom = obtindreNom();
        System.out.println();
        mostrarMenu(obtindreNom);
    }

    public static void capcaleraInicial() {
        System.out.println("Benvingut al RomboVerso");
        System.out.println("--------------------------------");
        System.out.println();
    }

    public static void opcionsMenu() {
        System.out.println("1. Realitzar càlcul àrea i freqüència");
        System.out.println("2. Realitzar càlcul àrea");
        System.out.println("3. Realitzar càlcul freqüència");
        System.out.println("4. Eixir");
    }

    public static void mostrarMenu(String nom) {
        opcionsMenu();
        do {
            switch (obtindreEnterAmbNom(nom)) {
                case CALCUL_AREA_FRECUENCIA:
                    System.out.println();
                    mostrarAreaIFrecuencia();
                    opcionsMenu();
                    break;
                case CALCUL_AREA:
                    resultatCalculArea();
                    System.out.println();
                    opcionsMenu();
                    break;
                case CALCUL_FRECUENCIA:
                    resultatCalculFrequencia();
                    System.out.println();
                    opcionsMenu();
                    break;
                case EIXIR:
                    System.out.println("\nAdeu");
                    return;
                default:
                    System.out.println("Error has de introduir una opció entre 1 i 4");
            }
        } while (true);
    }



    public static void mostrarAreaIFrecuencia(){
        double diagonalMajor = obtindreDiagonalMajor();
        double diagonalMenor = obtindreDiagonalMenor();
        mostrarCalculFrequencia(diagonalMajor,diagonalMenor);
        mostrarCalculArea(diagonalMajor,diagonalMenor);
    }
    public static void mostrarCalculArea(double diagonalMajor, double diagonalMenor) {
        System.out.printf("Àrea: %.2f %n", calcularArea(diagonalMajor,diagonalMenor));
    }

    public static void mostrarCalculFrequencia(double diagonalMajor, double diagonalMenor) {

        System.out.printf("Frequència: %.2f %n", calcularFrequencia(diagonalMajor,diagonalMenor));
    }
    public static void resultatCalculFrequencia() {
        double diagonalMajor = obtindreDiagonalMajor();
        double diagonalMenor = obtindreDiagonalMenor();
        mostrarCalculFrequencia(diagonalMajor,diagonalMenor);
    }
    public static void resultatCalculArea() {
        double diagonalMajor = obtindreDiagonalMajor();
        double diagonalMenor = obtindreDiagonalMenor();
        mostrarCalculArea(diagonalMajor,diagonalMenor);
    }

    public static double calcularFrequencia(double diagonalMajor, double diagonalMenor) {
        do {
            if (sonDiagonalsCorrectes(diagonalMajor, diagonalMenor)) {
                return obtenirFrequencia(diagonalMajor, diagonalMenor);
            } else {
                missatgeError();
            }
        } while (true);
    }

    public static double calcularArea(double diagonalMajor, double diagonalMenor) {
        do {
            if (sonDiagonalsCorrectes(diagonalMajor, diagonalMenor)) {
                return obtenirArea(diagonalMajor, diagonalMenor);
            } else {
                missatgeError();
            }
        } while (true);
    }

    public static void missatgeError() {
        System.out.println("Error! Les dades de les diagonals no poden ser negatives");
    }

    public static double obtenirArea(double diagonalMajor, double diagonalMenor) {
        return (diagonalMajor * diagonalMenor) / 2;
    }

    public static double obtenirFrequencia(double diagonalMajor, double diagonalMenor) {
        return Math.sqrt(Math.pow(diagonalMajor, 2) + Math.pow(diagonalMenor, 2));
    }

    //demanar datos, cridar metos
    public static boolean sonDiagonalsCorrectes(double diagonalMajor, double diagonalMenor) {
        return diagonalMenor > 0 && diagonalMajor > 0;
    }

    public static double obtindreDiagonalMajor() {
        return introduirDecimal("Introdueix el valor de la diagonal Major del rombo: ");
    }

    public static double obtindreDiagonalMenor() {
        return introduirDecimal("Introdueix el valor de la diagonal Menor del rombo: ");
    }


    public static String obtindreNom() {
        return introduirNom("Introdueix el teu nom: ");
    }

    public static int obtindreEnterAmbNom(String nom) {
        return introduirEnter(nom + ", Seleccioneu una opció [1-4]: ");
    }

    public static String introduirNom(String missatge) {
        do {
            System.out.print(missatge);
            if (teclat.hasNext()) {
                return teclat.nextLine();
            }
        } while (true);
    }

    public static double introduirDecimal(String missatge) {
        do {
            System.out.print(missatge);
            if (teclat.hasNextDouble()) {
                return teclat.nextDouble();
            } else {
                teclat.next();
            }
        } while (true);
    }

    public static int introduirEnter(String missatge) {
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()) {
                return teclat.nextInt();
            } else {
                System.out.println("Error! ha d'introduir un valor enter");
                teclat.next();
            }
        } while (true);
    }

}

