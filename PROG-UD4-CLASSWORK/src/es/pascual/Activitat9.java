package es.pascual;

public class Activitat9 {

    public static void main(String[] args) {

        int resultat = obtenirElMajor(4,7,2,9);
        System.out.println(resultat);

    }

    public static int obtenirElMajor (int num1, int num2, int num3, int num4){
        int numeroMajor = num1;
        if (numeroMajor < num2){
            numeroMajor = num2;
        }
        if (numeroMajor < num3){
            numeroMajor = num3;
        }
        if (numeroMajor < num4){
            numeroMajor = num4;
        }
        return numeroMajor;
    }

}
