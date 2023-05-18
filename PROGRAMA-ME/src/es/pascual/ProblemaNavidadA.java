package es.pascual;

import java.util.Scanner;

public class ProblemaNavidadA {

    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }

    public static void inici(){
        int voltes = teclat.nextInt();
        mostrarResultat(voltes);
    }

    public static void mostrarResultat(int numeroVoltes){
        int [] array = implementarOperacions(numeroVoltes);
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static int [] implementarOperacions(int numeroVoltes){
        int [] array = new int [numeroVoltes];
        for (int i = 0; i < numeroVoltes; i++) {
            array[i] = ferOperacio();
        }
        return array;
    }

    public static int ferOperacio (){
        int pes1 = teclat.nextInt();
        int pes2 = teclat.nextInt();
        if (pes1 > pes2){
            return pes1 -pes2;
        }else {
            return pes2 - pes1;
        }
    }


}
