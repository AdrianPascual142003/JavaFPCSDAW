package es.pascual;

public class Activitat19 {

    public static void main(String[] args) {

        int contador = 1;
        System.out.println("Els numeros parells son");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
                contador++;
            }
        }
        System.out.println("\nHi han un total de " + contador + " parells");
    }
}
