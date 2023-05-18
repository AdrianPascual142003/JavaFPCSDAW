package es.pascual;

public class Activitat14 {

    private static final float MILLA_A_KM = 1.6f;
    private static final int HORES_DIA = 24;
    private static final int MIN_HORA = 60;
    private static final float DISTANCIA_TERRA_MART = 54600000f;

    public static void main(String[] args) {

    float  distanciaRecorre = 17400f;
    float distanciaRecorreKm = distanciaRecorre * MILLA_A_KM;
    float distanciaRecorreKmDia = distanciaRecorreKm * HORES_DIA;

    float tempsEnArribar = DISTANCIA_TERRA_MART / distanciaRecorreKmDia;

        System.out.println("VELOCITAT DEL COET(mi\\h)");
        System.out.println("------------------------");
        System.out.printf("%.1f milles per cada " + MIN_HORA + "'\n", distanciaRecorre);
        System.out.println("\nTEMPS EN ARRIBAR A MART(en dies)");
        System.out.println("-----------------------------------");
        System.out.printf("%.1f dies", tempsEnArribar);


    }

}
