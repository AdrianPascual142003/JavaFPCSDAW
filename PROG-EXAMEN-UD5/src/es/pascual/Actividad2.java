package es.pascual;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

    public static final int CANTIDAD_TOTAL_PALABRAS = 5;
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inicio();
    }

    public static void inicio(){
        String[] palabrasProhibidas ={"loteria","virus","dinero","videojuego","spam","bitcoin"};
        String [] palabrasAnuncio = obtenerPalabrasAnuncio();
        ordenarArrayLexico(palabrasAnuncio);
        System.out.println("Palabras Introducidas :" + Arrays.toString(palabrasAnuncio));
        String [] palabrasPermitidas = obtenerPalabrasPermitidas(palabrasProhibidas,palabrasAnuncio);
        cambiarPalabrasProhibidas(palabrasProhibidas);
        System.out.println("Palabras Prohibidas :" + Arrays.toString(palabrasProhibidas));
        System.out.print("Palabras Permitidas :" + Arrays.toString(palabrasPermitidas));
    }

    public static void cambiarPalabrasProhibidas(String[] palabrasProhibidas){
        for (int i = 0; i < palabrasProhibidas.length; i++) {
            palabrasProhibidas[i] = obtenerPalabraProhibida(palabrasProhibidas[i]);
        }
    }

    public static void ordenarArrayLexico(String [] palabrasAnuncio){
        for (int i = 0; i < palabrasAnuncio.length-1; i++) {
            for (int j = i +1; j < palabrasAnuncio.length; j++) {
                if (palabrasAnuncio[j].charAt(0) > palabrasAnuncio[i].charAt(0)){
                    String aux = palabrasAnuncio[i];
                    palabrasAnuncio[i] = palabrasAnuncio[j];
                    palabrasAnuncio[j] = aux;
                }
            }
        }
    }

    public static String [] obtenerPalabrasAnuncio(){
        String [] palabrasAnuncio = new String [CANTIDAD_TOTAL_PALABRAS];
        for (int i = 0; i < palabrasAnuncio.length; i++) {
            String palabraIntroducida = obtenerPalabra("Introduce la palabra clave " + (i+1) + ": ");
            if (!estaPalabra(palabrasAnuncio,palabraIntroducida)){
                palabrasAnuncio[i] = palabraIntroducida;
            }else {
                System.out.println("Error! La palabra se ha añadido anteriormente");
                i--;
            }
        }
        return palabrasAnuncio;
    }



    public static boolean estaPalabra(String[] arrayAnuncio, String palabraComprobar){
        for (int i = 0; i < arrayAnuncio.length; i++) {
            if (arrayAnuncio[i] != null){
                if (arrayAnuncio[i].equalsIgnoreCase(palabraComprobar)){
                    return true;
                }
            }
        }
        return false;
    }

    public static String [] obtenerPalabrasPermitidas(String[] palabrasProhibidas, String[] palabrasAnuncio){
        String [] palabrasPermitidas = new String [palabrasAnuncio.length];
        int indiceMinimo = 0;
        for (int i = 0; i < palabrasAnuncio.length; i++) {
            if (!estaProhibida(palabrasProhibidas,palabrasAnuncio[i])){
                palabrasPermitidas[indiceMinimo] = palabrasAnuncio[i].toUpperCase();
                indiceMinimo++;
            }
        }
        return palabrasPermitidas;
    }

    public static boolean estaProhibida(String[] palabrasProhibidas, String palabraIntroducida){
        for (int i = 0; i < palabrasProhibidas.length; i++) {
            if (palabraIntroducida.equalsIgnoreCase(palabrasProhibidas[i])){
                return true;
            }
        }
        return false;
    }

    public static String obtenerPalabraProhibida(String palabraProhibida){
        for (int i = 0; i < palabraProhibida.length(); i++) {
            if (palabraProhibida.charAt(i) == 'a' || palabraProhibida.charAt(i) == 'e'
                    || palabraProhibida.charAt(i) == 'i' || palabraProhibida.charAt(i) == 'o'
                    || palabraProhibida.charAt(i) == 'u'){
                palabraProhibida = palabraProhibida.replace(palabraProhibida.charAt(i),'*');
            }
        }
        return palabraProhibida;
    }

    public static String obtenerPalabra(String mensaje){
        System.out.print(mensaje);
        return teclat.next();
    }



}
