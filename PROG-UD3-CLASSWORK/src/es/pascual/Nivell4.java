package es.pascual;

import java.util.Scanner;

public class Nivell4 {
    public static final String ANSI_VERDE = "\u001B[32m";
    public static final String ANSI_AZUL = "\u001B[34m";
    public static final String ANSI_AMARTILLO = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_ROJO = "\u001B[31m";
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatori1Nivell4 = (int) (Math.random() * (100 - 10 + 1) + 10);
        System.out.println("\n" + ANSI_AMARTILLO +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ░░██╗██╗\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ░██╔╝██║\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ██╔╝░██║\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ███████║\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ╚════██║\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ░░░░░╚═╝\n" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "Boo:" + ANSI_RESET + " Vaja, vos ho he posat realment fácil. Ací teniu la bola. Ara bé,\n" +
                "vos adelante que encara teniu un os dur de rosegar. Cèl·lula també\n" +
                "les buscava i vaig escoltar en la tele que ja tenia unes quantes\n" +
                "recollides. Si no recorde mal, el vaig sentir a les notícies del canal\n" +
                "número " + ANSI_ROJO + aleatori1Nivell4 + ANSI_RESET + " de la meua televisió.\n");
        System.out.println("Van sintonitzar el canal N i van confirmar que Cèl·lula es trobava en\n" +
                "“Ciutat Nova”. Ràpidament van anar a enfrontar-se amb ell i així\n" +
                "aconseguir les boles que tenia en el seu poder.\n");
        System.out.println(ANSI_AMARTILLO + "Son Gohan:" + ANSI_RESET + " Hola Cèl·lula, no volem problemes amb tu. Per favor,\n" +
                "dona'ns les teues boles de drac i no et farem mal.");
        System.out.println(ANSI_VERDE + "Cèl·lula:" + ANSI_RESET + " Jajaja. He entrenat des de l'última lluita i ara no podreu amb\n" +
                "mi i, per suposat, no podreu llevar-me les boles del drac que tinc\n" +
                "guardades a aquesta caixa. Juguem a un joc, la caixa té un cadenat\n" +
                "amb només la possibilitat d'introduir un 1 o un 2. Si seleccioneu el\n" +
                "número correcte, el cadenat obrirà i vos quedareu les boles, en cas\n" +
                "contrari, em donareu les vostres.. Vos done una pista, haureu\n" +
                "d’introduïr un 1 si " + ANSI_ROJO + aleatori1Nivell4 + ANSI_RESET + " és número primer i un 2 si no ho és. Juguem?\n");

        int divisor = 2;

        boolean isPrimo = true;
        do {
            if (aleatori1Nivell4 % divisor == 0){
                isPrimo = false;
            }
            divisor++;
        } while (isPrimo && divisor < aleatori1Nivell4);

        int respuestaNivell4;
        do {
            System.out.println("Introduix nombre..." );
            if (!teclado.hasNextInt()) {
                System.out.print("\nError! El tipus de dades introduït és incorrecte");
                return;
            }
            respuestaNivell4 = teclado.nextInt();
            if (respuestaNivell4 <= 0 || respuestaNivell4 > 2) {
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        } while (respuestaNivell4 <= 0 || respuestaNivell4 > 2);

        if (respuestaNivell4 == 1 && isPrimo){
            System.out.println("Has encertat, pases al nivell 5");
        }
        else if (respuestaNivell4 == 2 && !isPrimo){
            System.out.println("Has ensertat, pases al nivell 5");
        }else {
            System.out.println("Has perdut!");

        }
    }
}
