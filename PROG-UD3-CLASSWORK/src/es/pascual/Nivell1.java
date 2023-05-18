package es.pascual;

import java.util.Scanner;

public class Nivell1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int numCasaGoku = (int) (Math.random() * (10 + 1));
        int numeroCasaSatan = (int) (Math.random() * (30 - 20 +1) + (20));
        int endevinarAleatoriNivell1;
        int sumatori = 0;

        System.out.println("Son Goku: Molt bé! Anem a buscar les boles de drac abans que\n" +
                "Freezer puga tenir-les. --va dir Son-Goku des de la seua casa en el\n" +
                "número " +  numCasaGoku  + " de Ciutat del Nord\n");

        System.out.println("Goku va recordar que l’última vegada que les boles van ser repartides\n" +
                "pel mon de manera aleatòria, una d’elles va anar a parar a la zona on\n" +
                "actualment viu el seu amic Satanàs Cor Petit i que probablement ell la\n" +
                "tinga en el seu poder. Van marxar doncs cap al número " + numeroCasaSatan + " de la\n" +
                "Ciutat Meravella, que és on ell viu.\n" +
                "Després d’un llarg camí, hem arribat a la casa de Satanàs, i en\n" +
                "efecte, ell té una de les boles. Però no vol donar-nos-la gratuïtament,\n" +
                "ja que li té molta estima. Ens proposa la següent lluita matemática:\n");


        System.out.println("Satanàs Cor Petit: Sabríeu dir-me quin és el sumatori entre el\n" +
                "número de la vostra casa i el número la meua? Si l’endevineu, vos\n" +
                "donaré la bola i m’uniré al vostre equip");

        do {
            System.out.println("\n" + "Introdueix el número:");
            if (!teclat.hasNextInt()) {
                System.out.print("\n" + "Error el caràcter que has introduït no és valid");
                return;
            }

            endevinarAleatoriNivell1 = teclat.nextInt();
            if (endevinarAleatoriNivell1 <= 0){
                System.out.println("Error el número introduït és incorrecte");
            }
        }while (endevinarAleatoriNivell1 < 0);

        for (int i = numCasaGoku; i <= numeroCasaSatan; i++) {
            sumatori = sumatori + i;
        }

        if (endevinarAleatoriNivell1 == sumatori){
            System.out.println("Nivell 2");
        }else{
            System.out.println("Nivell Perdre");
        }

    }

}
