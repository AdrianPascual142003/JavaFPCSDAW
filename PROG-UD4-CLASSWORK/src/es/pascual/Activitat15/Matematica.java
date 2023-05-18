package es.pascual.Activitat15;

public class Matematica {

    public static int suma(int a, int b){
        return a + b;
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    public static boolean esPrimo(long primo){
        for (int i = 2; i < primo; i++) {
            if (primo % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int obtindreSuma(int num1, int num2){
        return num1 + num2;
    }
    public static int obtindreResta(int num1, int num2){
        return num1 - num2;
    }
    public static int obtindreMultiplicacio(int num1, int num2){
        return num1 * num2;
    }
    public static double obtindreDivisio(int num1, int num2){
        return (double) num1 / num2;
    }
    public static int obtindreModul(int num1, int num2){
        return num1 % num2;
    }
    public static double obtindreArrelQuadrada(double num1){
        return Math.sqrt(num1);
    }
    public static int obtindrePotencia(int base, int exponent){
        return (int) Math.pow(base, exponent);
    }
    public static int obtindreAreaRectangle(double base, double altura){
        return obtindreMultiplicacio((int) base, (int) altura);
    }
    public static int obtindreVolumPrisma(double ample, double alt, double profunditat){
        int resultat = obtindreAreaRectangle(ample,alt);
        return obtindreMultiplicacio(resultat, (int) profunditat);
    }
    public static double obtindreEquacioGrau2(int a, int b, int c, boolean solucio1){
        double resultat;
        int multiplicacioAC = Matematica.obtindreMultiplicacio(a,c);
        int potenciaB = Matematica.obtindrePotencia(b,2);
        int multiplicacio4A = Matematica.obtindreMultiplicacio(4,multiplicacioAC);
        int restaPotenciaMultiplicacio = Matematica.obtindreResta(potenciaB,multiplicacio4A);
        double arrel = Matematica.obtindreArrelQuadrada(restaPotenciaMultiplicacio);
        int multiplicacio2A = Matematica.obtindreMultiplicacio(2,a);

        if (solucio1){
            double suma = Matematica.suma(-b, (int) arrel);
            resultat = Matematica.obtindreDivisio((int) suma,multiplicacio2A);
        }else {
            double resta = Matematica.obtindreResta(-b,(int) arrel);
            resultat = Matematica.obtindreDivisio((int) resta,multiplicacio2A);
        }
        return resultat;
    }

}
