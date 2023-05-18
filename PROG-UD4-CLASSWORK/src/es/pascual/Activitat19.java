package es.pascual;

import java.util.Scanner;

public class Activitat19 {

    public static Scanner teclat = new Scanner(System.in);
    public static final int NUMERO_MINIM = 0;
    public static final int MESOS_ANY = 12;
    public static final int PROPERS_ANYS = 15;
    public static final int PERCENT = 100;
    public static final double MAJOR_QUE_CINCUANTA_MIL = 50000;
    public static final double MAJOR_QUE_DEU_MIL = 10000;
    public static final double AJUDA_MINIMA = 25;
    public static final double AJUDA_MAXIMA = 50;
    public static final String FLETXA_BAIX = "\u2193";
    public static final String FLETXA_DRETA = "\u2192";
    public static final String FLETXA_DIAGONAL = "\u2197";
    public static final String FLETXA_DALT = "\u2191";
    public static final String ROIG = "\u001B[31m";
    public static final String VERD = "\u001B[32m";
    public static final String GROC = "\u001B[33m";
    public static final String CIAN = "\u001B[36m";
    public static final String NORMAL = "\u001B[0m";

    public static void main(String[] args) {
        mostrarInici();
        mostrarPrevisioRendiment();
    }

    //NIVELL 1

    public static void mostrarPrevisioRendiment(){
        double interesAnual = obtenirInteresAnual();
        double capitalInvertit = obtenirCapitalAInvertir();
        mostrarIntroduccioPrevisio();
        for (int i = 1; i <= PROPERS_ANYS ; i++) {
            double valorFuturAXAnys = obtenirValorFuturInversio(capitalInvertit,interesAnual / 12 , i);
            double ajudaGobern = obtenirAjudaGovern(capitalInvertit);
            String obtenirIndicacio = obtenirIndicacio(capitalInvertit, valorFuturAXAnys + ajudaGobern);
            System.out.printf("%d \t\t %.2f€ (%+.2f€) \t %s %n",i,valorFuturAXAnys,ajudaGobern, obtenirIndicacio);
        }
    }


    // Obté el valor de la inversió @capitalInvertit transcorreguts @numAnys a un interés mensual de @interesMensual
    public static double obtenirValorFuturInversio(double capitalInvertit, double interesMensual,int numAnys){
        return capitalInvertit * Math.pow((1 + interesMensual),(numAnys * MESOS_ANY));
    }

    // Nivell 2

    // Obté el total aportat pel govern en funció de @capitalInvertit
    public static double obtenirAjudaGovern(double capitalInvertit){
        if (capitalInvertit > MAJOR_QUE_CINCUANTA_MIL){
            return AJUDA_MAXIMA;
        }else if (capitalInvertit > MAJOR_QUE_DEU_MIL ) {
            return AJUDA_MINIMA;
        }else {
            return 0;
        }
    }

    // Mostra el inici del programa

    public static void mostrarInici(){
        System.out.println("Batoi INVERSIONS 2021");
        System.out.println("=====================");
    }

    // Mostra l'escomençament de les dades

    public static void mostrarIntroduccioPrevisio(){
        System.out.println("Any \t Valor futur(+ajuda) \t Indicació");
        System.out.println("==========================================");
    }


    //nivell 3

    // Demana a l'usuari que inseriu les dades sobre el interés anual i el torna.

    public static double obtenirInteresAnual(){
        return demanarDouble("Interès anual (%): ", NUMERO_MINIM) / PERCENT;
    }

    // Demana a l'usuari que inseriu les dades sobre el interés anual i el torna.

    public static double obtenirCapitalAInvertir(){
        return demanarDouble("Capital a invertir (€): ", NUMERO_MINIM);
    }

    //nivell 4

    // Comprova que el numero introduit per a que no siga menor de 0

    public static double demanarDouble(String missatge, double numero){
        do {
            double numeroIntroduit = demanarDouble(missatge);
            if (numeroIntroduit <= numero){
                System.out.println("Error! Les dades introduïdes no són correctes");
            }else {
                return numeroIntroduit;
            }
        }while (true);
    }

    // Demana un numero per a comprovar-lo i vore que es un double

    public static double demanarDouble(String missatge){
        do {
            System.out.print(missatge);
            if (teclat.hasNextDouble()){
                return teclat.nextDouble();
            }
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            teclat.next();
        }while (true);
    }

    // Obtenir indicació gràfica sobre el rendiment de la inversió

    public static String obtenirIndicacio(double capitalInvertit , double totalObtingut){
        String fletxa;
        double benefici = (totalObtingut - capitalInvertit);
        if (benefici < 0.25 * capitalInvertit){
            fletxa = ROIG + FLETXA_BAIX + NORMAL;
        }else if(benefici < 0.50 * capitalInvertit){
            fletxa = GROC + FLETXA_DRETA + NORMAL;
        }else if (benefici < 0.75 * capitalInvertit){
            fletxa = CIAN + FLETXA_DIAGONAL + NORMAL;
        }else{
            fletxa = VERD + FLETXA_DALT + NORMAL;
        }
        return fletxa;
    }
}

