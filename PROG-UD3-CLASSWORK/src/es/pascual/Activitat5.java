package es.pascual;

import java.util.Scanner;

public class Activitat5 {

    private static final int PLASTIC= 1;
    private static final int ORGANIC= 2;
    private static final int PAPER= 3;
    private static final int CARTRO= 4;
    private static final int ALTRES= 5;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Qué tipo de desecho necesitas tirar:");
        System.out.println(PLASTIC + ". Plastic");
        System.out.println(ORGANIC + ". Orgànic");
        System.out.println(PAPER + ". Paper");
        System.out.println(CARTRO + ". Cartró");
        System.out.println(ALTRES + ". Altres");

        System.out.println("Introdueix una opció [1-5]");
        int desfet = teclat.nextInt();

        switch (desfet){
            case PLASTIC:
                System.out.println("Llançau al contenidor groc");
                break;
            case ORGANIC:
                System.out.println("Llançau al contenidor gris");
                break;
            case PAPER:
            case CARTRO:
                System.out.println("Llançau al contenidor blau");
                break;
            case ALTRES:
                System.out.println("Llançau al contenidor verd");
                break;
            default:
                System.out.println("Opció invalida");
                break;

        }

    }

}
