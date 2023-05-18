package es.pascual;

public class Activitat26 {

    public static final int COLUMNA_CICLE = 3;
    public static final int COLUMNA_EDAD = 2;
    public static final String DAW = "DAW";
    public static final String DAM = "DAM";
    public static final String ASIX = "ASIX";

    public static void main(String[] args) {

        String [][] arrayClase = {
                {"Joan", "Perez Aura", "24","ASIX","1"},
                {"Maria", "Sanchez García", "18", "DAW","1"},
                {"Pepa", "Egea Juan", "21", "DAM","1"},
                {"Ana Maria", "Hernandez Julian", "20", "DAW", "2"},
                {"Francesc", "Juan Juan", "28","DAW","1"}
        };

        mostrarTabla(arrayClase);
        System.out.println();
        mostrarTaulaEspecifica(arrayClase, DAW);
        mostrarTaulaEspecifica(arrayClase, ASIX);
        System.out.println();
        mostrarTabla(arrayClase);
        mostrarMitjana(arrayClase);
        System.out.println();
        promocionarAlumnes(arrayClase,1,2);
        mostrarTabla(arrayClase);

        String[][] arrayPromocionados={
                {DAW,""},
                {DAM,""},
                {ASIX,""}
        };

    }

    public static void mostrarTabla(String[][] array){
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.printf("%-20s", string);
            }
            System.out.println();
        }
    }



    public static void mostrarTaulaEspecifica(String[][] array, String parametro){
        for (int i = 0; i < array.length; i++) {
            if (array[i][COLUMNA_CICLE].equalsIgnoreCase(parametro)){
                mostrarFila(array,i);
                System.out.println();
            }
        }
    }

    public static void mostrarFila(String[][] array, int numero){
        for (int j = 0; j < array[numero].length; j++) {
            System.out.printf("%-20s",array[numero][j]);
        }
    }

    public static void mostrarMitjana(String [][] array){
        int edad = 0;
        for (String[] strings : array) {
            int edadArray = Integer.parseInt(strings[COLUMNA_EDAD]);
            edad = edad + edadArray;
        }
        edad = edad / array.length;
        System.out.println("Mitjana de edad = " + edad);
    }

    public static void promocionarAlumnes(String[][] array, int curso, int nuevoCurso){
        for (int i = 0; i < array.length; i++) {
            if (array[i][4].equalsIgnoreCase(String.valueOf(curso))){
                array[i][4] = String.valueOf(nuevoCurso);
            }
        }
    }

  /*  public static void mostrarAlumnesMatriculats(String [][] arrayCurso, String [][] arrayPrococionados){
        int totalEstudiantesDaw = 0;
        int totalEstudiantesDam = 0;
        int totalEstudiantesAsix = 0;
        for (int i = 0; i < arrayCurso.length; i++) {
            if (arrayCurso[i][COLUMNA_CICLE].equalsIgnoreCase(DAM))
        }
    }*/


}
