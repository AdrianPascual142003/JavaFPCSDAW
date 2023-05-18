package es.pascual;

import java.util.Scanner;

public class Examen_Alex_Prova {

    public static final double PESO_DE_UNA_LIBRA = 0.453;
    public static final double KILOGRAMO_A_LIBRA = 2.204;
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        elegirOpciones();
    }

    public static void elegirOpciones() {
        do {
            mostrarCartellInici();
            switch (preguntarOpcion()) {
                case 1:
                    mostrarTablaConversion();
                    break;
                case 2:
                    conversionAKilogramos();
                    break;
                case 3:
                    conversionALibras();
                    break;
                case 4:
                    System.out.print("Adios");
                    return;
                default:
                    System.out.println("Opción no valida");

            }
        } while (true);

    }

    public static void mostrarCartellInici() {
        System.out.println("\nBienvenidos a la conversión");
        System.out.println("----------------------------");
        System.out.println("1. Mostrar Tabla de Equivalencias");
        System.out.println("2. Convertir Libras a Kilogramos");
        System.out.println("3. Convertir Kilogramos a libras");
        System.out.println("4. Salir");
        System.out.println();

    }

    public static void mostrarTablaConversion(){
        int poundsAKilogramos = 20;
        System.out.println("Kilograms \t Pounds \t | \t\t Pounds \t Kilograms");
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i <= 199; i+=2) {
            if (i < 100) {
                 System.out.printf("%d \t\t\t %.1f \t\t | \t\t %d \t\t %.2f %n", i, obtenerConversionALibras(i), poundsAKilogramos, obtenerConversionAKilogramos(poundsAKilogramos));
            }else {
                System.out.printf("%d \t\t %.1f \t\t | \t\t %d \t\t %.2f %n", i, obtenerConversionALibras(i), poundsAKilogramos, obtenerConversionAKilogramos(poundsAKilogramos));

            }
            poundsAKilogramos += 5;
        }
    }

    public static void conversionAKilogramos() {
        double librasIntroducidas = librasIntroducidas();
        System.out.printf("El valor de las %.2f libras es de %.2f %n", librasIntroducidas, obtenerConversionAKilogramos(librasIntroducidas));
    }

    public static void conversionALibras() {
        double kilogramosIntroducidos = kilogramosIntroducidos();
        System.out.printf("El valor de los %.2f kilogramos es de %.2f %n", kilogramosIntroducidos, obtenerConversionALibras(kilogramosIntroducidos));
    }

    public static double librasIntroducidas() {
        return obtenerNumeroAConvertir("Introduce las libras a convertir: ");
    }

    public static double kilogramosIntroducidos() {
        return obtenerNumeroAConvertir("Introduce los kilogramos a convertir: ");
    }

    public static double obtenerNumeroAConvertir(String mensaje) {
        do {
            System.out.print(mensaje);
            double cantidadIntroducida = teclat.nextDouble();
            if (cantidadIntroducida > 0) {
                return cantidadIntroducida;
            } else {
                System.out.println("Adios");
                teclat.next();
            }
        } while (true);
    }

    public static int preguntarOpcion() {
        return obtenerEntero("Introduce la opción que desees: ");
    }

    public static double obtenerConversionAKilogramos(double libras) {
        return libras * PESO_DE_UNA_LIBRA;
    }

    public static double obtenerConversionALibras(double kilogramos) {
        return kilogramos * KILOGRAMO_A_LIBRA;
    }

    public static int obtenerEntero(String mensaje) {
        do {
            System.out.print(mensaje);
            if (teclat.hasNextInt()) {
                return teclat.nextInt();
            } else {
                System.out.println("Error, debes de introducir un entero");
                teclat.next();
            }
        } while (true);
    }

}
