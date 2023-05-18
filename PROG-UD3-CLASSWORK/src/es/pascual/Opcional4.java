package es.pascual;

import java.util.Scanner;

public class Opcional4 {

    private static final int PREU_HORA_ORDINARIA = 12;
    private static final int HORES_ORDIANLS_SEMANALS = 40;
    private static final int PREU_HORA_EXTRA = 16;
    private static final int HORES_SEMANALS_TOTALS = 168;

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes hores has fet aquesta setmana?");

        if (!teclat.hasNextInt()){
            System.out.println("Error!! Has de introduir les hores que has treballat aquesta setmana");
            return;
        }
        int horesIntroduides = teclat.nextInt();
        if (horesIntroduides < HORES_ORDIANLS_SEMANALS){
            System.out.println("ERROR!! Has fet menys hores de les que et tocava");
            return;
        }else if (horesIntroduides > HORES_SEMANALS_TOTALS){
            System.out.println("ERROR!! Has excedit les hores semanals");
            return;
        }

        int salariHoresFetes = HORES_ORDIANLS_SEMANALS * PREU_HORA_ORDINARIA;
        int salariHoresExtres = ((horesIntroduides - HORES_ORDIANLS_SEMANALS) * PREU_HORA_EXTRA) + salariHoresFetes;

        if (horesIntroduides > HORES_ORDIANLS_SEMANALS){
            System.out.println("Has guanyat " + salariHoresExtres + "€ aquesta setmana");
        }else{
            System.out.println("Has guanyat " + salariHoresFetes + "€ aquesta setmana");
        }

    }

}
