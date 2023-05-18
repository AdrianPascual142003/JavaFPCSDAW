package es.pascual;

public class Activitat22 {

    private static final int TIRADES_A_TIRAR = 1000000;

    public static void main(String[] args) {

        System.out.println("Nombre de tirades: 1.000.000");
        System.out.println("----------------------------");

        int contadorCara = 0;
        int contadorCreu = 0;

        for (int i = 0; i < TIRADES_A_TIRAR; i++) {

            int numeroRandom = (int) (Math.random() * 2 +1);

            if (numeroRandom ==2){
                contadorCreu++;
            }else{
                contadorCara++;
            }
        }

        System.out.println("Nombre de cares: " + contadorCara);
        System.out.println("Nombre de creus: " + contadorCreu);

    }

}
