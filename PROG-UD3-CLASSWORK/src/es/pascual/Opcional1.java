package es.pascual;

import java.util.Scanner;

public class Opcional1 {

    private static final int DILLUNS = 1;
    private static final int DIMARTS = 2;
    private static final int DIMECRES = 3;
    private static final int DIJOUS = 4;
    private static final int DIVENDRES = 5;
    private static final int DISSABTE = 6;
    private static final int DIUMENGE = 7;
    private static final String DILLUNS_PRIMERA_HORA = "Sistemes informàtics";
    private static final String DIMARTS_PRIMERA_HORA = "Llenguatge de màrques";
    private static final String DIMECRES_PRIMERA_HORA = "Àngles";
    private static final String DIJOUS_DIVENDRES_PRIMERA_HORA = "Base de dades";

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un dia de la setamana (1/7):");

        if (!teclat.hasNextInt()){
            System.out.println("Error el número introduit no és valid");
            return;
        }
        int numeroIntroduit = teclat.nextInt();
        if (numeroIntroduit > 7 || numeroIntroduit < 0){
            System.out.println("El dia introduit no està en la setamana");
            return;
        }

        if (numeroIntroduit == DISSABTE || numeroIntroduit == DIUMENGE){
            System.out.println("Els dies festius no es va a escola");
            return;
        }

        switch (numeroIntroduit){
            case DILLUNS:
                System.out.println("El dilluns a primera hora tens " + DILLUNS_PRIMERA_HORA);
                break;
            case DIMARTS:
                System.out.println("El dimarts a primera hora tens " + DIMARTS_PRIMERA_HORA);
                break;
            case DIMECRES:
                System.out.println("El dimecres a primera hora tens " + DIMECRES_PRIMERA_HORA);
                break;
            case DIJOUS:
                System.out.println("El dijous a primera hora tens " + DIJOUS_DIVENDRES_PRIMERA_HORA);
            case DIVENDRES:
                System.out.println("El divendres a primera hora tens " + DIJOUS_DIVENDRES_PRIMERA_HORA);
        }


    }

}
