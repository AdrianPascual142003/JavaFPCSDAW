package es.pascual;

import java.util.Scanner;

public class Nivell3 {

    public static void main(String[] args) {

        int bolab3 = (int) (Math.random() * (7 -4 + 1) + (4));
        int factorial = 1;

        Scanner teclat = new Scanner(System.in);

        System.out.println("Ten Shin Han: Wow! Doncs no se m’hauria ocorregut mai. Per cert,\n" +
                "vaig saber que el nostre enemic Boo va trobar una bola de drac en la\n" +
                "seua mudança a “Muntanya Perduda”. Vos guiaré a la cova de la\n" +
                "muntanya on viu. No és lluny d’ací");

        System.out.println("\nBoo es trobava descansant a la cova. Ja que va tindre molts\n" +
                "problemes en els seus anteriors enfrontaments amb Goku aquest no\n" +
                "tenia intenció de lluitar més amb ell, però al veure’l què anava a per la\n" +
                "seua estimada bola de drac de " + bolab3 + " estelles, no va reaccionar amb\n" +
                "bones maneres.");

        System.out.println("Boo: Què voleu? La meua bola de drac?");

        System.out.println("\nSon Goku: Necessitem reunir-les totes abans que Freezer, el món\n" +
                "corre un gran perill! Sabem que tú ja no vols fer mal al planeta. T’ho\n" +
                "demanem per favor, pel bé de tots.");

        System.out.println("\nBoo: Però és meua! La vaig trobar jo! Encara que pensant-ho millor,\n" +
                "només vos la donaré si em dieu la resposta correcta a la solució de\n" +
                "quin és el factorial de " + bolab3 + ".");

        int endivinarBolab3;
        do {
            System.out.println("\n" + "Introdueix el número:");
            if (!teclat.hasNextInt()){
                System.out.println("\n" + "Error el caràcter que has introduït no és valid");
                return;
            }
            endivinarBolab3 = teclat.nextInt();
            if (endivinarBolab3 <= 0){
                System.out.println("El número introduït no és vàlid");
            }
        }while (endivinarBolab3 < 0);


        for (int i = bolab3; i > 0; i--) {
            factorial = factorial * i;
        }

        if (endivinarBolab3 == factorial){
            System.out.println("Nivell 3");
        }else {
            System.out.println("Has perdut");
        }

    }

}
