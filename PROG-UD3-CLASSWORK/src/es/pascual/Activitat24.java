package es.pascual;

import java.util.Scanner;

public class Activitat24 {

    private static final float PREU_GELAT_XOC = 1.5f;
    private static final float PREU_GELAT_LLIMA = 1.25f;
    private static final float PREU_GELAT_TORRO = 1.75f;
    private static final float PREU_ORXATA = 2f;
    private static final float PREU_GRANI_LLIMA = 2.1f;
    private static final float PREU_GRANI_CAFE = 2.5f;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Benvingut a la Gelateria de Batoi");

        int numeroClients;
        int comandaClients;
        float conter = 0;
        int numeroRonda = 1;
        boolean altraRonda;

        do {
            System.out.print("Quants clients són? [1-10]: ");
            if (!teclat.hasNextInt()) {
                System.out.print("\n" + "Error! El tipus de dades introduït és incorrecte");
                return;
            }

            numeroClients = teclat.nextInt();

            if (numeroClients > 10 || numeroClients < 1){
                System.out.println("Número de clients incorrecte. Introduïx-lo de nou");
            }
        } while (numeroClients > 10 || numeroClients < 1);

        do {

            System.out.println("Ronda " + numeroRonda);

            numeroRonda++;

            if (numeroRonda == 2) {
                System.out.println("Bon dia a tots, disposem de la següent carta:");
                System.out.println("1. Gelat de xocolata\n2. Gelat de llima\n3. Gelat de torró\n4. Orxata\n5. Granissat de llima\n6. Cafè granissat");
            }

            for (int i = 1; i < numeroClients + 1; i++) {
                do {
                    System.out.print("Què vol prendre el client " + i + "? [1-6]: ");
                    if (!teclat.hasNextInt()) {
                        System.out.print("\n" + "Error! El tipus de dades introduït és incorrecte");
                        return;
                    }
                    comandaClients = teclat.nextInt();
                    if (comandaClients < 1 || comandaClients > 6) {
                        System.out.println("Ho senc, això no està a la nostra carta");
                    }
                } while (comandaClients < 1 || comandaClients > 6);

                if (comandaClients == 1) {
                    conter = conter + PREU_GELAT_XOC;
                } else if (comandaClients == 2) {
                    conter = conter + PREU_GELAT_LLIMA;
                } else if (comandaClients == 3) {
                    conter = conter + PREU_GELAT_TORRO;
                } else if (comandaClients == 4) {
                    conter = conter + PREU_ORXATA;
                } else if (comandaClients == 5) {
                    conter = conter + PREU_GRANI_LLIMA;
                } else {
                    conter = conter + PREU_GRANI_CAFE;
                }
            }

            System.out.print("Altra ronda? [true/false]: ");
            if (!teclat.hasNextBoolean()) {
                System.out.println("Error! El tipus de dades introduït és incorrecte");
            }
            altraRonda = teclat.nextBoolean();

        } while (altraRonda);
        System.out.printf("\n" + "El total a pagar és %.2f€", conter);

    }

}
