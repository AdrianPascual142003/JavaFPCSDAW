package es.pascual;

public class Ativitat24 {

    public static void main(String[] args) {

        int [][] arrayMultidimensional = new int[3][6];

        arrayMultidimensional[0][0] = 0;
        arrayMultidimensional[0][1] = 30;
        arrayMultidimensional[0][2] = 2;
        arrayMultidimensional[0][5] = 5;
        arrayMultidimensional[1][0] = 75;
        arrayMultidimensional[1][4] = 0;
        arrayMultidimensional[2][2] = -2;
        arrayMultidimensional[2][3] = 9;
        arrayMultidimensional[2][5] = 11;

        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                System.out.print(arrayMultidimensional[i][j] + "\t");
            }
            System.out.println();
        }

    }



}
