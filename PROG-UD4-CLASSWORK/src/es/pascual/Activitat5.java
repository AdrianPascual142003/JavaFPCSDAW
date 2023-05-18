package es.pascual;

public class Activitat5 {

    public static void main(String[] args) {

        mostrarTaulaMultiplicar(2);
        mostrarTaulaMultiplicar(5);
        mostrarTaulaMultiplicar(4);


    }

    public static void mostrarTaulaMultiplicar(int multiplicando){

        int resultado;
        System.out.println("\nTAULA DEL: " + multiplicando);
        for (int i = 0; i <= 10; i++) {
            resultado = multiplicando * i;
            System.out.println(multiplicando + " X " + i + " = " + resultado);

        }

    }

}
