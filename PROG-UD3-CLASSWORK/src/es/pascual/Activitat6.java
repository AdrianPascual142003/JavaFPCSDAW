package es.pascual;

import java.util.Scanner;

public class Activitat6 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un nombre enter");
        int num1 = teclat.nextInt();
        System.out.println("Introdueix un nombre enter");
        int num2 = teclat.nextInt();

        String messatge = (num1>num2) ? "Num 1 és major" : "Num 2 és major";
        System.out.println(messatge);

    }

}
