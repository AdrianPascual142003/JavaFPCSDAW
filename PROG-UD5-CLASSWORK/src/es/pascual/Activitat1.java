package es.pascual;

import java.util.Scanner;

public class Activitat1 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        String cadenaIntroduida = teclat.next();
        System.out.println(esUnaSalutacio(cadenaIntroduida));
    }

    public static boolean esUnaSalutacio(String cadena){
        if (cadena.equalsIgnoreCase("Hola")){
            return true;
        }else if (cadena.equalsIgnoreCase("Hello")){
            return true;
        }else{
            return cadena.equalsIgnoreCase("Que tal?");
        }
    }
}
