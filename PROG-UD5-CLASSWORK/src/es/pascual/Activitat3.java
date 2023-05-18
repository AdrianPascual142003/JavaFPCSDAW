package es.pascual;

public class Activitat3 {
    public static void main(String[] args) {
        System.out.println(obtindreMitadCadena("hola"));
    }

    public static String obtindreMitadCadena (String cadena){
        return cadena.substring(0,(cadena.length())/2);
    }
}
