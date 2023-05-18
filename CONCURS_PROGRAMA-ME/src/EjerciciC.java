import java.util.Scanner;

public class EjerciciC {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int numeroVoltes = teclat.nextInt();

        for (int i = 0; i < numeroVoltes; i++) {

            int numeroEntrades = teclat.nextInt();
            String[] letras = new String[numeroEntrades];

            for (int j = 0; j < letras.length; j++) {
                letras[j] = teclat.next();
            }
            for (int j = 0; j < letras.length ; j++) {
                System.out.print(letras[j].charAt(0));
            }
            for (int j = 0; j < letras.length ; j++) {
                System.out.print(letras[j].charAt(1));
            }
            for (int j = 0; j < letras.length ; j++) {
                System.out.print(letras[j].charAt(2));
            }

        }

    }

}
