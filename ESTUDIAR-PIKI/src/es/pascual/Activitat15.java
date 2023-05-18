package es.pascual;

public class Activitat15 {

    public static void main(String[] args) {
        comprobador("21699247N");
    }

    public static boolean comprobador(String comprobar) {
        if (comprobar.matches("^\\d{8}[A-Z]$")) {
            System.out.println("Tu dni es correcto");
            return true;
        }
        return false;
    }



}
