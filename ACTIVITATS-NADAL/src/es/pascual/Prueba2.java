package es.pascual;

public class Prueba2 {

    public static void main(String[] args) {
        int[][] n = {{1, 2}, {2, 3}, {10, 12, 15}};

        int totalFilas = 0;

        for (int i = 0; i < n.length; i++) {
            totalFilas++;
        }

        System.out.println(totalFilas);

        int totalColumnas = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i == 1 || i == 2){
                    totalColumnas++;
                }
            }
        }
        System.out.println(totalColumnas);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i == 0 && j == 3){
                    System.out.println(n[i][j]);
                }
            }
        }

    }

}