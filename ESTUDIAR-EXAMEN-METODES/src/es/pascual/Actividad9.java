package es.pascual;

import java.util.Scanner;

public class Actividad9 {
    public static Scanner teclat;
    public static final double EUROS_LIBRAS = 0.86;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        cabeceraInicio();
        menuOpciones();
    }

    public static void cabeceraInicio(){
        System.out.println("Hola No se que");
    }

    public static void menuOpciones(){
        do {
            switch (pedirEntero()){
                case 1:
                    pasarEurosLibras(pedirEurosLibras());
                    System.out.println();
                    cabeceraInicio();
                    break;
                case 2:
                    System.out.println("Adios");
                    return;
                default:
                    System.out.println("Error");
            }
        }while (true);

    }


    public static int pedirEntero(){
        return obtenerEntero("Introduce un numero del [1-3]: ");
    }

    public static void pasarEurosLibras(double euros){
        System.out.printf("Los %.2f Euros introduciodos son %.2f Libras %n",euros,conversionEurosLibras(euros));
    }

    public static double pedirEurosLibras(){
        return obtenerNumeroAConvertir("Introduce los Euros que quieras converitr a libras: ");
    }

    public static double conversionEurosLibras(double euros){
        return euros * EUROS_LIBRAS;
    }

    public static double obtenerNumeroAConvertir (String missage){
        do {
            System.out.print(missage);
            if (teclat.hasNextDouble()){
                return teclat.nextDouble();
            }else {
                System.out.println("Error, debes de introducir un numero");
                teclat.next();
            }
        }while (true);
    }

    public static int obtenerEntero(String missage){
        do {
            System.out.print(missage);
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                System.out.println("Error, debes de introducir un entrero");
                teclat.next();
            }
        }while (true);
    }
}
