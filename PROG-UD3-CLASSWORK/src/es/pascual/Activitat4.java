package es.pascual;

import java.util.Scanner;

public class Activitat4 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix la teua nota");
        int nota = teclat.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("MOLT DEFICIENT");
                break;
            case 3:
            case 4:
                System.out.println("INSUFICIENT");
                break;
            case 5:
                System.out.println("SUFICIENT");
                break;
            case 6:
                System.out.println("BE");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("EXCEL·LENT");
                break;
            default:
                System.out.println("NO ES VALID");
                break;

        }

    }

}
