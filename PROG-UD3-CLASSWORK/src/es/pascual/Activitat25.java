package es.pascual;

public class Activitat25 {

    private static final int NUMERO_MAXIMO = 7;
    private static final int GRANDARIA = 6;

    public static void main(String[] args) {

        System.out.println("PATTERN A");
        for (int i = 0; i < GRANDARIA; i++) {

            for (int j = 0; j < i+1 ; j++) {

                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        System.out.println("PATTERN B");
        for (int i = 0; i < GRANDARIA; i++) {

            for (int j = 0; j < GRANDARIA-i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        System.out.println("PATTERN C");
        for (int i = 0; i < GRANDARIA; i++) {
            for (int j = GRANDARIA-1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("PETTERN D");
        for (int i = 0; i < GRANDARIA; i++) {
            for (int j = 0; j < GRANDARIA; j++) {
                if (j >= i) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\t\t\tTRIANGLES DE NUMEROS");

        for (int i = 1; i <= NUMERO_MAXIMO; i++) {
            for (int j = i; j <= NUMERO_MAXIMO ; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k+"  ");
            }
            for (int l = i; l > 0; l--) {
                System.out.print(l+"  ");
            }
            System.out.println();

        }

    }

}
