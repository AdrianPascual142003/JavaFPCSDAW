package es.pascual;

import java.util.Scanner;

public class Activitat21 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int numeroIntroduit;

        for (int i = 1; i <= 50 ; i++) {
            System.out.println("\nIntroduiex un numero");
            numeroIntroduit = teclat.nextInt();

            if (numeroIntroduit == 100){
                continue;
            }else if (numeroIntroduit == 0){
                break;
            }

            if (numeroIntroduit % 2 == 0){
                System.out.println("Es parrel");
            }else{
                System.out.println("No es parell");
            }

            if (numeroIntroduit % 5 == 0){
                System.out.println("Es multiple de cinc");
            }

        }

    }

}
