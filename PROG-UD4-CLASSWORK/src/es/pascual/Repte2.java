package es.pascual;

import java.util.Scanner;

public class Repte2 {

    public static final int PES_MAXIM = 1000;
    public static final int PES_MINIM = 1;
    public static final int VOLTES_MINIMES = 1;
    public static final int VOLTES_MAXIMES = 100;
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        ferVoltes();
    }

    public static void ferVoltes(){
        int voltesAtirrar = obtindreVoltes();
        for (int i = 1; i <= voltesAtirrar ; i++) {
            int comparacio = comprarNumerosIntroduits();
            int resultat = diferenciaNumeros(comparacio);
            System.out.println(resultat);
        }
    }



    public static int diferenciaNumeros(int comparacio){
        return Math.abs(comparacio);
    }

    public static int comprarNumerosIntroduits(){
        do {
            int primerNumero = pesIntroduit();
            int segonNumero = pesIntroduit();
            if (primerNumero < segonNumero){
                return primerNumero-segonNumero;
            }else {
                System.out.println("ERROR, el primer numero de de ser menor");
            }
        }while (true);
    }

    public static int pesIntroduit(){
        return introduirEnter(PES_MINIM,PES_MAXIM);
    }

    public static int obtindreVoltes(){
        return introduirEnter(VOLTES_MINIMES, VOLTES_MAXIMES);
    }

    //NIVELL 4 TECLATS

    public static int introduirEnter(int min, int max){
        do {
            int numero = introduirEnter();
            if (numero < min || numero >= max){
                System.out.println("Error! Has de introduïr un numero valid");
            }else {
                return numero;
            }
        }while (true);
    }

    public static int introduirEnter(){
        do {
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }
            System.out.println("Error! El tipus de dades introduït es incorrecte");
            teclat.next();
        }while (true);
    }

}
