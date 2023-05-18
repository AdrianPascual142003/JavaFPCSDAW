package es.pascual;

import java.util.Scanner;

public class Opcional2 {

    private static final int HORES_DIA = 24;


    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix l'hora en la que t'encontres:");

        if (!teclat.hasNextInt()){
            System.out.println("ERROR!! Sols es poden introduïr les hores");
            return;
        }

        int horaIntroduida = teclat.nextInt();
        if (horaIntroduida > HORES_DIA || horaIntroduida < 0){
            System.out.println("Error l'hora introduïda no és valida");
            return;
        }

        if (horaIntroduida >= 6 && horaIntroduida <= 12){
            System.out.println("Bon dia");
        }else if (horaIntroduida >= 13  && horaIntroduida <= 20){
            System.out.println("Bona vesprada");
        }else{
            System.out.println("Bona nit");
        }

    }

}
