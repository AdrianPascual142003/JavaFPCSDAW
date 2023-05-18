package es.pascual;

import java.util.Scanner;

public class Activitat5 {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);

        String num1 = obtindrePrimerNumero();
        String num2 = obtindreSegonNumero();

        System.out.println("Suma : " + obtindreSuma(num1,num2));
        System.out.println("Multiplicació : " + obtindreMultiplicacio(num1,num2));

    }

    public static double obtindreSuma(String num1, String num2){
    double num1Double = Double.parseDouble(num1);
    double num2Double = Double.parseDouble(num2);
        return num1Double + num2Double;
    }

    public static double obtindreMultiplicacio(String num1, String num2){
        double num1Double = Double.parseDouble(num1);
        double num2Double = Double.parseDouble(num2);
        return num1Double * num2Double;
    }

    public static String obtindreSegonNumero(){
        return obtindreNumero("Introdueix el segon número");
    }
    public static String obtindrePrimerNumero(){
        return obtindreNumero("Introdueix el primer número");
    }


    public static String obtindreNumero(String missatge){
        do {
            System.out.println(missatge);
            if (teclat.hasNextDouble()){
               return teclat.next();
            }else {
                System.out.println("Error");
                teclat.next();
            }
        }while (true);

    }

}
