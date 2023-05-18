package es.pascual.progud12classwork;

public class Validador {

    private final static String REGEXP_NUMERIC= "^\\d{1,}$";

    public static boolean isNumeric(String numeroString) {
        return numeroString.matches(REGEXP_NUMERIC);
    }

}
