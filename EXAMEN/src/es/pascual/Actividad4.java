package es.pascual;

import java.util.Scanner;

public class Actividad4 {

    public static final float PRECIO_BASE = 500f;
    public static final int DIAS_POR_SEMANA = 3;
    public static final int SERVICIOS = 4;
    public static final int MENOS_KILOGRAMOS = 1000;
    public static final float POR_KILOGRAMO_MENOS_MIL = 0.50f;
    public static final float POR_KILOGRAMO_MAS_MIL = 0.25f;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int numeroCamiones = 1;
        double kilogramosIntroducidos;
        double dineroDia = 0;
        double dineroTotalDias = 0;
        double pagoSemanal;

        System.out.println("PROGRAMA FACTURACIÓN \"RECILA Batoi\":");
        System.out.println("========================");

        System.out.print("Número de Camiones (N): " + numeroCamiones + "\n\n");

        for (int i = 1; i <= numeroCamiones ; i++) {
            for (int j = 1; j <= DIAS_POR_SEMANA; j++) {
                for (int k = 1; k <= SERVICIOS; k++) {
                    do {
                        System.out.print("Introduce los kg recogidos en el servicio " + k + " del dia " + j + " por el camión " + i + ": ");
                        if (!teclat.hasNextDouble()) {
                            System.out.println("ERROR, caracter invalido");
                            return;
                        }

                        kilogramosIntroducidos = teclat.nextDouble();
                        if (kilogramosIntroducidos <= 0) {
                            System.out.println("Error, kilogramos incorrectos");
                        }
                    } while (kilogramosIntroducidos <= 0);
                    if (kilogramosIntroducidos < MENOS_KILOGRAMOS) {
                        dineroDia = dineroDia + (kilogramosIntroducidos * POR_KILOGRAMO_MENOS_MIL);
                    } else {
                        dineroDia = dineroDia + (kilogramosIntroducidos * POR_KILOGRAMO_MAS_MIL);
                    }
                }
                System.out.printf("Los pagos por el camión " + i + " en el dia " + j + " es de %.2f:\n\n", dineroDia);
                dineroTotalDias = dineroTotalDias + dineroDia;
                dineroDia = 0;
            }
            pagoSemanal = dineroTotalDias + PRECIO_BASE;
            System.out.printf("El total a pagar semanalmente por el camión " + i + " es %.2f\n\n", pagoSemanal);
            dineroTotalDias = 0;

        }

    }

}
