package es.pascual;

public class Nivell5 {

    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 4;
        int numero3 = 10;
        int numero4 = 2;


        int mcm = 1;
        int i = 2;
        while (i <= numero1 || i <= numero2 || i <= numero3 || i <= numero4){
            if (numero1 % i == 0 || numero2 % i ==0 || numero3 % i == 0 || numero4 % i == 0){
                mcm *= i;
            }

            if (numero1 % i == 0) {
                numero1 /= i;
            }
            if (numero2 % i == 0) {
                numero2 /= i;
            }
            if (numero3 % i == 0){
                numero3 /= i;
            }
            if (numero4 % i == 0){
                numero4 /= i;
            }
            else {
                i++;
            }
        }
        System.out.println(mcm);

    }
}
