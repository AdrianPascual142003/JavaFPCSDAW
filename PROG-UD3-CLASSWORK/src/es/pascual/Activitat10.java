package es.pascual;

import java.util.Scanner;

public class Activitat10 {

    private static final float CM_A_M = 0.01f;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el teu pes (kg):");

        if (!teclat.hasNextFloat()){
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            return;
        }
        float pes = teclat.nextFloat();

        if (pes <= 0){
            System.out.println("Error! Les dades introduïtes no són correctes");
        }

        System.out.println("Introdueix la teva alçada (cm):");

        if (!teclat.hasNextFloat()){
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            return;
        }
        float altura = teclat.nextFloat();

        if (altura <= 0){
            System.out.println("Error! Les dades introduïtes no són correctes");
        }

        float alturaAMetres = altura * CM_A_M;
        double imcEstandard = pes / Math.pow(alturaAMetres,2);
        double imcOxford = (1.3 * pes) / Math.pow(altura * CM_A_M,2.5);

        double comparacioImc = imcOxford- imcEstandard;
        double compracioImcNeg = imcEstandard -imcOxford;
        String descompensat = "";

        if (comparacioImc > 1 || compracioImcNeg > 1) {
            descompensat = "descompensat";
        }

        System.out.printf("El teu IMC (Oxford2003) és %.3f",imcOxford);

        if (imcOxford >= 30.5){
            System.out.println(" (Obès " + descompensat + ")");
        }else if (imcOxford >= 25.5){
            System.out.println(" (Sobrepès " + descompensat + ")");
        }else if (imcOxford > 15.0){
            System.out.println(" (Normal " + descompensat + ")");
        }else System.out.println(" (Falta de pes " + descompensat + ")");

    }

}
