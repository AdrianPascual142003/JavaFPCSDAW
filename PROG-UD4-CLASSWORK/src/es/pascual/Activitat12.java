package es.pascual;

public class Activitat12 {

    public static void main(String[] args) {
        impremeixPiramidal('a',5);
    }

    public static void impremeixPiramidal(char caracter, int numLineas){

        for (int i = 1; i <= numLineas ; i++) {
            for (int j = 1; j <= numLineas ; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }

}
