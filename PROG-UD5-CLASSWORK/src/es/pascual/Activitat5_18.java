package es.pascual;

public class Activitat5_18 {

    public static void main(String[] args) {
        String[] diasDeLaSemana = {
                "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"
        };

        String[] diasDeLaSemana2 = diasDeLaSemana;
        diasDeLaSemana2[0] = "Monday";

        String[] diasDeLaSemana3 = copiaArray(diasDeLaSemana2);
        diasDeLaSemana3[0] = "Lunes";

    }

    public static String [] copiaArray (String [] elements){
        String [] diesSetmanaCopia = new String [elements.length];
        for (int i = 0; i < elements.length; i++) {
            diesSetmanaCopia[i] = elements[i];
        }
        return diesSetmanaCopia;
    }

}
