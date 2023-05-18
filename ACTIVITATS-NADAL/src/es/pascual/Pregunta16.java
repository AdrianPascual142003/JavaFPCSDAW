package es.pascual;

public class Pregunta16 {

    public static void main(String[] args) {
        String [][] tabla = {
                {"Pepe García", "8", "9", "7"},
                {"Juan Perez", "9", "4", "10"},
                {"Elena García", "9", "8", "10"}
        };

        calcularMedia(tabla);

    }

    public static void calcularMedia(String[][] tabla){
        for (int i = 0; i < tabla.length; i++) {
            double media = 0;
            for (int j = 1; j < tabla[i].length; j++) {
                 media += Integer.parseInt(tabla[i][j]);
            }
            media = media/3;
            System.out.printf("Media de %s es de %.2f %n", tabla[i][0],media);
        }
    }

}
