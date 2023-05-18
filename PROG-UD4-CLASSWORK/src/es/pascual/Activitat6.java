package es.pascual;

import java.util.Scanner;

public class Activitat6 {

    public static void main(String[] args) {

        Scanner teclat  = new Scanner(System.in);
        System.out.println("Introduïx el primer número: ");
        int num1 = teclat.nextInt();
        System.out.println("Introduïx el segon número: ");
        int num2 = teclat.nextInt();
        System.out.println("Introduïx el tecer número: ");
        int num3 = teclat.nextInt();
        int major = donamElMajor(num1,num2,num3);
        System.out.println(major);

    }

    public static int donamElMajor(int num1, int num2, int num3) {

        int major = num1;

        if (num2 > major){
            major = num2;
        }
        if (num3 > major){
            major = num3;
        }
        return major;

    }

}