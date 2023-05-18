package es.pascual;

import java.util.Scanner;

public class Actividad2 {

    public static final String SOLAR = "El año es solar";
    public static final String NO_SOLAR = "El año no es solar";

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int anio;

        System.out.println("Introduzca un año");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipo de datos introducido no es válido");
            return;
        }

        anio = teclat.nextInt();
        if (anio % 7 == 0){
            System.out.println(NO_SOLAR);
        }else {
            if (anio % 20 == 0){
                if (anio % 40 == 0){
                    System.out.println(SOLAR);
                }else {
                    if (anio % 30 == 0){
                        System.out.println(SOLAR);
                    }else {
                        System.out.println(NO_SOLAR);
                    }
                }
            }else {
                System.out.println(SOLAR);
            }

        }

    }
}
