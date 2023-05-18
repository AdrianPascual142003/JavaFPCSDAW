import java.util.Arrays;
import java.util.Scanner;

public class EjercioF {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int tamanoCara = teclat.nextInt();
        int juegos = teclat.nextInt();

        int [] pesoJuegos = new int [juegos];
        for (int i = 0; i < pesoJuegos.length; i++) {
            pesoJuegos[i] = teclat.nextInt();
        }

        for (int i = 0; i < pesoJuegos.length-1; i++) {
            if (pesoJuegos[i] + pesoJuegos[i+1] == tamanoCara){
                pesoJuegos[i] = 0;
                pesoJuegos[i+1] = 0;
                Arrays.sort(pesoJuegos);
            }
        }

        int contador = 0;

        for (int i = 0; i < pesoJuegos.length; i++) {
            if (pesoJuegos[i] == 0){
                contador++;
            }
        }

        if (contador == juegos){
            System.out.print("SI");
        }else {
            System.out.print("NO");
        }

    }

}
