package es.pascual;

import java.util.Scanner;

public class Activitat11 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el número de la carta [1-12]:");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            return;
        }
        int cartaIntroduida = teclat.nextInt();
        if (cartaIntroduida <= 0 || cartaIntroduida > 12){
            System.out.println("El número de la carta és incorrecte");
            return;
        }

        System.out.println("Introdueix el pal de la carta [1-4]:");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            return;
        }
        int palIntroduit = teclat.nextInt();
        if (palIntroduit <= 0 || palIntroduit > 4){
            System.out.println("El pal de la carta és incorrecte");
            return;
        }

        switch (cartaIntroduida){
            case 1:
                System.out.print("Uno");
                break;
            case 2:
                System.out.print("Dos");
                break;
            case 3:
                System.out.print("Tres");
                break;
            case 4:
                System.out.print("Quatre");
                break;
            case 5:
                System.out.print("Cinc");
                break;
            case 6:
                System.out.print("Sis");
                break;
            case 7:
                System.out.print("Set");
                break;
            case 8 :
                System.out.print("Huit");
                break;
            case 9:
                System.out.print("Nou");
                break;
            case 10:
                System.out.print("Sota");
                break;
            case 11:
                System.out.print("Cavall");
                break;
            case 12:
                System.out.print("Rei");
                break;
        }

        switch (palIntroduit){
            case 1:
                System.out.println(" d'oros");
                break;
            case 2:
                System.out.println(" copes");
                break;
            case 3:
                System.out.println(" bastos");
                break;
            case 4:
                System.out.println(" d'espases");
                break;
        }

    }

}
