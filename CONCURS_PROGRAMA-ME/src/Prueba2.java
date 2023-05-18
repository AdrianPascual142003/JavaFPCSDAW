import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int voltes = teclat.nextInt();
        int files = teclat.nextInt();
        String [] cadena = new String[files];
        for (int i = 0; i < voltes; i++) {
            char [] frase = new char [3*files];
            for (int j = 0; j < files; j++) {
                cadena[j] = teclat.next();
            }

            for (int j = 0; j < cadena.length; j++) {
                String palabra = cadena[j];
                for (int k = 0; k < frase.length; k++) {
                    System.out.println("1");
                }
            }

        }

    }


}
