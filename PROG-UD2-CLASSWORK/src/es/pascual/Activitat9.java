package es.pascual;

public class Activitat9 {

    private static final int RATE_MB_TO_KB = 1024;
    public static void main(String[] args) {
        int cantitatMb1 = 40000;
        int cantitatMb2 = 36000;

        long conversioMb1 = cantitatMb1 * RATE_MB_TO_KB;
        long conversioMb2 = cantitatMb2 * RATE_MB_TO_KB;

        System.out.println("La quantitat " + cantitatMb1 + " Mb es " + conversioMb1 + " Kb");
        System.out.println("La quantitat " + cantitatMb2 + " Mb es " + conversioMb2 + " Kb");
    }
}
