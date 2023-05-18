package es.pascual;

import java.util.Scanner;

public class AAmpliacio1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix els valors x,y del centre del 1er rectangle i la seua amplària i l'alçada:");

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double x1  = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double y1 = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double w1 = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double h1 = teclat.nextFloat();

        System.out.println("Introdueix els valors x,y del centre del 2on rectangle i la seua amplària i l'alçada:");

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double x2 = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double y2 = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double w2 = teclat.nextFloat();

        if (!teclat.hasNextFloat()){
            System.out.println("ERROR");
            return;
        }
        double h2 = teclat.nextFloat();

        double cantoSuperiorEsquerreX1 = x1 - w1/2;
        double cantoSuperiorEsquerreY1 = y1 + h1/2;
        double cantoInferiorEsquerreX1 = x1 - w1/2;
        double cantoInferiroEsquerreY1 = y1 - h1/2;
        double cantoSuperiorDretX1 = x1 + w1/2;
        double cantoSuperiorDretY1 = y1 + h1/2;
        double cantoInferiorDretX1 = x1 + w1/2;
        double cantoInferiorDretY1 = y1 - h1/2;

        double cantoSuperiorEsquerreX2 = x2 - w2/2;
        double cantoSuperiorEsquerreY2 = y2 + h2/2;
        double cantoInferiorEsquerreX2 = x2 - w2/2;
        double cantoInferiroEsquerreY2 = y2 - h2/2;
        double cantoSuperiorDretX2 = x2 + w2/2;
        double cantoSuperiorDretY2 = y2 + h2/2;
        double cantoInferiorDretX2 = x2 + w2/2;
        double cantoInferiorDretY2 = y2 - h2/2;

        int contador = 0;

        if (cantoSuperiorDretX2 >= cantoSuperiorDretX1 && cantoSuperiorDretY2 >= cantoSuperiorDretY1){
            contador++;
        }
        if (cantoInferiorDretX2 >= cantoInferiorDretX1 && cantoInferiorDretY2 >= cantoInferiorDretY1){
            contador++;
        }
        if (cantoSuperiorEsquerreX2 >= cantoSuperiorEsquerreX1 && cantoSuperiorEsquerreY2 >= cantoSuperiorEsquerreY1){
            contador++;
        }
        if (cantoInferiorEsquerreX2 >= cantoInferiorEsquerreX1 && cantoInferiroEsquerreY2 >= cantoInferiroEsquerreY1){
            contador++;
        }

        switch (contador){
            case 0:
                System.out.println("El rectágulo dos esta fuera del primer rectangulo");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("El rectangulo está solopado al primer rectángulo ");
                break;
            case 4:
                System.out.println("el rectángulo está dentro del primer rectángulo");
                break;

        }
    }
}
