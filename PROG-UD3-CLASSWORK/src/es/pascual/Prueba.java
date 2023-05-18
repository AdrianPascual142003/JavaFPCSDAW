package es.pascual;

public class Prueba {

    public static void main(String[] args) {

        int bolaB2 = (int) (Math.random() * (7 -4 + 1) + (4));
        int bolaB3 = (int) (Math.random() * (7 -4 + 1) + (4));
        do {
            bolaB3 = (int) (Math.random() * (7 -4 + 1) + (4));
        }while (bolaB2 == bolaB3);

        System.out.println("Bola b2 " + bolaB2);
        System.out.println("Bola b3 " + bolaB3);

    }

}
