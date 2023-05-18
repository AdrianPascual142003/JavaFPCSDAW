package es.pascual;

import java.util.Arrays;

public class Probar {

    public static void main(String[] args) {
        double [] arrayNumeros = new double [10];

        for (int i = 0; i < arrayNumeros.length; i++) {
            if (i == arrayNumeros.length-1){
                arrayNumeros[i] = 5.5;
            }else {
                arrayNumeros[i]  = Math.random () * 100 + 1;

            }
        }
        System.out.printf("%.2f %n", arrayNumeros[0] + arrayNumeros[1]);

        double sumaTotal = 0;

        for (double items : arrayNumeros) {
            sumaTotal += items;
        }

        System.out.printf("Suma total = %.2f %n", sumaTotal);
        System.out.printf("Mediana = %.2f %n",sumaTotal/ arrayNumeros.length);

        Arrays.sort(arrayNumeros);
        System.out.printf("Elemento mas pequeño = %.2f %n",arrayNumeros[0]);
        System.out.printf("Elemento mas grande = %.2f %n", arrayNumeros[arrayNumeros.length-1]);


    }

}
