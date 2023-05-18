package es.pascual;

import java.util.Scanner;

public class Activitat17 {
    public static final int OPCION_SALUDAR = 1;
    public static final int OPCION_COMER = 2;
    public static final int OPCION_HABLAR = 3;
    public static final int OPCION_SALIR = 4;
    public static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void seleccionarOpcio(){
        boolean salir = false;
        switch (opcionSeleccionada()){
            case OPCION_SALUDAR:
                saludar();
                break;
            case OPCION_COMER:
                comer();
                break;
            case OPCION_HABLAR:
                hablar();
                break;
            case OPCION_SALIR:
                salir();
                salir = true;
                break;
            default:
                porDefector();
        }
    }

    public static int opcionSeleccionada(){
        return teclat.nextInt();
    }

    public static void mostrarPrimerText(){
        System.out.printf("%d. Saludar %n", OPCION_SALUDAR);
        System.out.printf("%d. Comer %n", OPCION_COMER);
        System.out.printf("%d. Hablar %n", OPCION_HABLAR);
        System.out.printf("%d. Salir %n", OPCION_SALIR);
    }

    public static void saludar(){
        System.out.println("Hola a todos");
    }
    public static void comer(){
        System.out.println("Comiendo");
    }
    public static void hablar(){
        System.out.println("En un lugar de la mancha...");
    }
    public static void salir(){
        System.out.println("Adios");
    }
    public static void porDefector(){
        System.out.println("La opción no es válida");
    }

}
