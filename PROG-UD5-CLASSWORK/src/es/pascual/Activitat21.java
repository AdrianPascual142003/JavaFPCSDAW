package es.pascual;

import java.util.Arrays;

public class Activitat21 {

    public static void main(String[] args) {

        String [] companysGrup ={
            "Miguel", "Jorge", "Eric", "Ruben", "Alvaro", "Sergi"
        };

        System.out.println("Array desordenat " + Arrays.toString(companysGrup));
        comprarOrdenAlfabetic(companysGrup);
        System.out.println("Array ordenat " + Arrays.toString(companysGrup));
    }

    public static void comprarOrdenAlfabetic (String [] llistat){
        for (int i = 0; i < llistat.length - 1; i++) {
            int indexCadenaMenor = i;
            for (int j = i + 1; j < llistat.length; j++) {
                if (llistat[j].compareTo(llistat[indexCadenaMenor]) < 0){
                    indexCadenaMenor = j;
                }
            }
            if (indexCadenaMenor != i){
                String aux = llistat[indexCadenaMenor];
                llistat[indexCadenaMenor] = llistat[i];
                llistat[i] = aux;
            }
        }
    }

}
