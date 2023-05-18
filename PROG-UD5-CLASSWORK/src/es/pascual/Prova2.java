package es.pascual;

public class Prova2 {

    public static void main(String[] args) {
        String[][] paco = {
                {"alala", "alalalala", "lalalala"},
                {"Adlasdladl", "lasldasldald", "alsdlaldald"}
        };
        mostrarTabla(paco);
        String [][] clonado = clonarArray(paco);
        mostrarTabla(clonado);

    }

    public static void mostrarTabla(String [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%17s",array[i][j]);
            }
            System.out.println();
        }
    }

    public static String [][] clonarArray(String[][] taulaTasques){
        String[][] taulaClonada = new String[taulaTasques.length][3];
        for (int i = 0; i < taulaTasques.length; i++) {
            for (int j = 0; j < taulaTasques[i].length; j++) {
                taulaClonada[i][j] = taulaTasques[i][j];
            }
        }
        return taulaClonada;
    }
}
