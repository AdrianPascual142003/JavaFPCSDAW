package es.pascual;

import java.util.Scanner;

public class Activitat3 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu un numero entre el 0 i el 10");
        int numeroIntroduit = teclat.nextInt();

        if (numeroIntroduit < 0 || numeroIntroduit > 10){
            System.out.println("ERROR");
        } else if (numeroIntroduit < 3){
            System.out.println("MOLT DEFICIENT");
        }else if (numeroIntroduit < 5){
            System.out.println("INSUFICIENT");
        }else if (numeroIntroduit < 6){
            System.out.println("SUFICIENT");
        }else if (numeroIntroduit < 7){
            System.out.println("BE");
        }else if (numeroIntroduit < 9){
            System.out.println("NOTABLE");
        }else{
            System.out.println("EXCELENT");
        }
    }

}
