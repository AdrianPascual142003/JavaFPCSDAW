package es.pascual;

import java.util.Scanner;

public class Opcional3 {

    private static final int DIES_SETAMANA = 7;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el número de la setmana");

        if (!teclat.hasNextInt()){
            System.out.println("Error!!! Introdueix un numero vàlid");
            return;
        }

        int diaIntroduit = teclat.nextInt();
        if (diaIntroduit < 0 || diaIntroduit > DIES_SETAMANA){
            System.out.println("ERROR!! El dia no es valid");
            return;
        }

        switch (diaIntroduit){
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
        }

    }

}
