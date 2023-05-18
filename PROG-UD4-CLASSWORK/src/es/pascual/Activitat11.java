package es.pascual;

public class Activitat11 {

    public static void main(String[] args) {

        imprimeix('b',20,5);

    }

    public static void imprimeix(char caracter, int numVoltes, int numLines){

        for (int i = 1; i <= numLines ; i++) {
            for (int j = 1; j <=numVoltes ; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }

}
