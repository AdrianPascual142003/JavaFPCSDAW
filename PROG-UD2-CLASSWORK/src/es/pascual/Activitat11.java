package es.pascual;

import java.util.Scanner;

public class Activitat11 {
    private static final float MONEDA_2_CENTS = 0.02F;
    private static final float MONEDA_5_CENTS = 0.05F;
    private static final float MONEDA_10_CENTS = 0.10F;
    private static final float MONEDA_20_CENTS = 0.20F;
    private static final float MONEDA_50_CENTS = 0.50F;
    private static final float MONEDA_1_EURO = 1.00F;
    private static final float MONEDA_2_EURO = 2.00F;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes monedes tens de 2 cèntims:");
        float dosCentimos = (teclat.nextInt() * MONEDA_2_CENTS);

        System.out.println("Quantes monedes tens de 5 cèntims:");
        float cincoCentimos = (teclat.nextInt() * MONEDA_5_CENTS);

        System.out.println("Quantes monedes tens de 10 cèntims:");
        float diezCentimos = (teclat.nextInt() * MONEDA_10_CENTS);

        System.out.println("Quantes monedes tens de 20 cèntims:");
        float veinteCentimos = (teclat.nextInt() * MONEDA_20_CENTS);

        System.out.println("Quantes monedes tens de 50 cèntims:");
        float cincuentaCentimos = (teclat.nextInt() * MONEDA_50_CENTS);

        System.out.println("Quantes monedes tens de 1 Euro:");
        int unEuro = (int) (teclat.nextInt() * MONEDA_1_EURO);

        System.out.println("Quantes monedes tens de 2 Euro:");
        int dosEuros = (int) (teclat.nextInt() * MONEDA_2_EURO);


        float sumaMonedes = dosCentimos + cincoCentimos + diezCentimos + veinteCentimos + cincuentaCentimos + unEuro + dosEuros;

        int euros = (int) (sumaMonedes / 1);
        int centimos = (int) ((sumaMonedes % 1) * 100);

        System.out.println("Tinc " + euros + " Euros y " + centimos + " Centims");


    }

}
