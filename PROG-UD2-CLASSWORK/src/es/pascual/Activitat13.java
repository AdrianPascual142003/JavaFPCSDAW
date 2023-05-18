package es.pascual;

public class Activitat13 {

    private static final int DIES_ANY = 365;

    private static final int SEGONS_DIA = 86400;

    public static void main(String[] args) {

        float cantitatTiradaAlAny = (10 * SEGONS_DIA / 60f) * DIES_ANY;
        float cantitatRecicladaAlAny = (200 * SEGONS_DIA / 300f) * DIES_ANY;
        float cantitatArreplegadaAny = 43000 * DIES_ANY;

        float cantitatTotalAnual = cantitatRecicladaAlAny - (cantitatArreplegadaAny + cantitatTiradaAlAny);

        float cantitatAnyActual = 500000f;
        float cantitatAny2022 = cantitatAnyActual + cantitatTotalAnual;
        float cantitatAny2023 = cantitatAny2022 + cantitatTotalAnual;
        float cantitatAny2024 = cantitatAny2023 + cantitatTotalAnual;
        float cantitatAny2025 = cantitatAny2024 + cantitatTotalAnual;
        float cantitatAny2026 = cantitatAny2025 + cantitatTotalAnual;

        System.out.println("PROJECCIÓ DEL FEM EN REGNE UNIT");
        System.out.println("-------------------------------");
        System.out.printf("\t Any actual: %.0f kgs \n", cantitatAnyActual);
        System.out.printf("\t Any 2022: %.0f kgs \n", cantitatAny2022);
        System.out.printf("\t Any 2023: %.0f kgs \n", cantitatAny2023);
        System.out.printf("\t Any 2024: %.0f kgs \n", cantitatAny2024);
        System.out.printf("\t Any 2025: %.0f kgs \n", cantitatAny2025);
        System.out.printf("\t Any 2026: %.0f kgs \n", cantitatAny2026);

    }
}
