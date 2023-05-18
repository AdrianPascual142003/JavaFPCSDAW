package es.pascual;

import java.util.Scanner;

public class Activitat9 {

    private static final float PREU_AIGUA = 0.75f;
    private static final float PREU_BEGUDA_ENSUCRADA = 1.5f;
    private static final float PREU_BEGUDA_ALCOHOL = 3f;
    private static final int MESOS_ANY = 12;
    private static final float ANUALS_250 = 0.15f;
    private static final float ANUALS_ENTRE_100_150 = 0.16f;
    private static final float ANUALS_MES_100 = 0.17f;
    private static final float DEVOLUCIO_BOTELLES = 0.15f;
    private static final float VALE_DESCUENTO = 10f;


    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes botelles d'aigua has comprat enguany?:");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduïtés incorrecte");
            return;
        }
        int botellesAigua = teclat.nextInt();
        if(botellesAigua < 0) {
            System.out.println("Error!Número de botelles incorrecte");
            return;
        }

        System.out.println("Quantes botelles de begudes ensucrades has comprat enguany?:");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduïtés incorrecte");
            return;
        }
        int botellesEnsucrades = teclat.nextInt();
        if(botellesEnsucrades < 0) {
            System.out.println("Error!Número de botelles incorrecte");
            return;
        }

        System.out.println("Quantes botelles de begudes alcohòliques has comprat enguany?:");

        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduïtés incorrecte");
            return;
        }
        int botellesAlcoholiques = teclat.nextInt();
        if(botellesAlcoholiques < 0) {
            System.out.println("Error!Número de botelles incorrecte");
            return;
        }

        double botellesAiguaPreu = botellesAigua * PREU_AIGUA;
        double botellesEnsucradesPreu = botellesEnsucrades * PREU_BEGUDA_ENSUCRADA;
        double botellesAlcoholiquesPreu = botellesAlcoholiques * PREU_BEGUDA_ALCOHOL;

        double totalBotelles = botellesAigua + botellesEnsucrades + botellesAlcoholiques;
        double totalPreu = botellesAiguaPreu + botellesEnsucradesPreu + botellesAlcoholiquesPreu;
        double totalRetorno = totalBotelles * DEVOLUCIO_BOTELLES;
        double mitjanaMes = totalPreu / MESOS_ANY;

        System.out.printf("Has gastat una mitjana de %.2f€ cada mes\n", mitjanaMes);

        System.out.printf("Al reciclar les botelles has obtingut  %.2f€" ,totalRetorno);

        if (totalPreu >= 250){
            System.out.printf(" i un val/descompte de %.2f€", (totalPreu * ANUALS_250));
        }else if (totalPreu >= 150){
            System.out.printf(" i un val/descompte de %.2f€", (ANUALS_MES_100 - DEVOLUCIO_BOTELLES));
        }else if (totalPreu > 100){
            System.out.printf(" i un val/descompte de %.2f€", (ANUALS_ENTRE_100_150 - DEVOLUCIO_BOTELLES));
        }else if (totalPreu >= 10 && totalPreu <= 20){
            System.out.printf(" i un val/descompte de %.2f€", (VALE_DESCUENTO));
        }else {
            System.out.println(" i no reps cap bonificació");
        }

    }

}
