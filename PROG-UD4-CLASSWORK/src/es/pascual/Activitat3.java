package es.pascual;

public class Activitat3 {

    public static void main(String[] args) {
        mostrarTablasMultiplicar();
    }

    public static void mostrarTablasMultiplicar(){

        for (int i = 0; i < 10; i++) {
            System.out.println("tabla del " + i);
            for (int j = 0; j < 10; j++) {
                int result = j * i;
                System.out.println(j +" X " + i + " = " + result);
            }
        }


    }

}
