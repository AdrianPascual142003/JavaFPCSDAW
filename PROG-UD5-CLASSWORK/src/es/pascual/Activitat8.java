package es.pascual;

import java.util.Scanner;

public class Activitat8 {
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        obtindreCadenesAlReves();
        StringBuilder cadenaMutable = new StringBuilder();
        cadenaMutable.append(obtindreCadenesAlReves());
        cadenaMutable.append(" ");
        cadenaMutable.append(obtindreCadenesAlReves());
        cadenaMutable.append(" ");
        cadenaMutable.append(obtindreCadenesAlReves());
        cadenaMutable.reverse();
        System.out.println(cadenaMutable);
    }

    private static String obtindreCadenesAlReves() {
            System.out.println("Introdueix 1 cadena");
            return teclat.next();
    }

}
