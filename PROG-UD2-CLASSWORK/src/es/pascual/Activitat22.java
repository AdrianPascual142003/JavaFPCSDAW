package es.pascual;

import java.util.Scanner;

public class Activitat22 {

    private final static int SEGONS_DIA = 86400;
    private final static int SEGONS_HORA = 3600;
    private final static int SEGONS_MIN = 60;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el nombre de segons que han transcorregut?");
        int segonsIntroduits = teclat.nextInt();

        int dies = segonsIntroduits / SEGONS_DIA;
        int hores = segonsIntroduits % SEGONS_DIA / SEGONS_HORA;
        int minuts = segonsIntroduits % SEGONS_HORA / SEGONS_MIN;
        int segons = segonsIntroduits % SEGONS_MIN;

        System.out.println("dies: " + dies);
        System.out.println("hores: " + hores);
        System.out.println("minuts: " + minuts);
        System.out.println("segons: " + segons);

    }
}
