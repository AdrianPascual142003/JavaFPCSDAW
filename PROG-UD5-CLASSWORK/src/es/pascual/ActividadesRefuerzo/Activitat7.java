package es.pascual.ActividadesRefuerzo;

import java.util.Arrays;

public class Activitat7 {

    public static void main(String[] args) {
        String [] modulosCurso = {
                "LMSG", "INGLES", "PROG", "SI", "BASE DE DATOS", "FOL", "EDD"
        };
        System.out.println(Arrays.toString(ordenacionSeleccion(modulosCurso)));
    }

        public static String [] ordenacionSeleccion(String[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                int indexCadenaMenor = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareTo(array[indexCadenaMenor]) < 0) {
                        indexCadenaMenor = j;
                    }
                }
                if (indexCadenaMenor != i) {
                    String aux = array[indexCadenaMenor];
                    array[indexCadenaMenor] = array[i];
                    array[i] = aux;
                }
            }
            return array;
        }

}
