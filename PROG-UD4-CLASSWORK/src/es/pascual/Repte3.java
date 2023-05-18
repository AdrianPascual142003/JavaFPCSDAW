package es.pascual;

import java.util.Scanner;

public class Repte3 {
    public static final int NUMERO_MINIM = 0;
    public static final int SEGUNDOS_MINUTO = 60;
    public static final int SEGUNDOS_HORA = 3600;
    public static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {

    }

    /**public static String obtindreTemps(int segons){
        if (segons < SEGUNDOS_MINUTO){
            return segons;
        }else if(segons < SEGUNDOS_HORA){

        }
    }**/

    public static int obtindreSegonsQueNecesita(){
        return demanarEnter(NUMERO_MINIM);
    }
    public static int obtindreDefinicions(){
        return demanarEnter(NUMERO_MINIM);
    }

    public static int demanarEnter(int numero){
        do {
            int numeroIntroduit = demanarEnter();
            if (numeroIntroduit < numero){
                System.out.println("Error el numero ha de ser major de cero");
            }else {
                return numero;
            }
        }while (true);
    }

    public static int demanarEnter(){
        do {
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                System.out.println("Error, numero incorrecte");
                teclat.next();
            }
        }while (true);
    }

}
