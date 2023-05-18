package es.pascual;

public class Activitat4 {
    public static void main(String[] args) {
        String exemple1 = new String("Hola que tal");
        String exemple2 = new String("Programacio");
        System.out.println(canviarMinusculesPerA(exemple1));
        System.out.println(canviarMinusculesPerA(exemple2));
    }
    public static String canviarMinusculesPerA(String frase){
        String cadenaSubstituida = frase.replace('e','a');
        cadenaSubstituida = cadenaSubstituida.replace('o','a');
        cadenaSubstituida = cadenaSubstituida.replace('i','a');
        cadenaSubstituida = cadenaSubstituida.replace('u','a');
        return cadenaSubstituida;
    }
}
