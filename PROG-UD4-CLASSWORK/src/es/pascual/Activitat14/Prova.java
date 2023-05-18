package es.pascual.Activitat14;

import java.util.Scanner;

public class Prova {

    public static Scanner teclat = new Scanner(System.in);
    public static final int MAXIM_OPCIO = 8;
    public static final int MINIM_OPCIO = 1;
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACIO = 3;
    public static final int DIVISIO = 4;
    public static final int AREA_RECTANGLE = 5;
    public static final int VOLUM_PRISMA = 6;
    public static final int EQUACIO_SEGON_GRAU = 7;
    public static final int EIXIR = 8;

    public static void main(String[] args) {

        mostrarOpcions();
        totesLesOperacions();

    }

    public static void mostrarOpcions(){
        System.out.println("Benvingut a Calculator");
        System.out.println("----------------------");
        System.out.println("Quina operació desitja realitzar?");
        System.out.println(SUMA +". Suma\n" +
                RESTA + ". Resta\n" +
                MULTIPLICACIO + ". Multiplicació\n" +
                DIVISIO + ". Divisió\n" +
                AREA_RECTANGLE + ". Àrea d'un rectangle\n" +
                VOLUM_PRISMA + ". Volum d'un prisma\n" +
                EQUACIO_SEGON_GRAU + ". Equació de segon grau\n" +
                EIXIR + ". Eixir");
    }

    public static int llegirEnter(){
        do {
            if (teclat.hasNextInt()){
                return teclat.nextInt();
            }else {
                teclat.next();
            }
        }while (true);
    }

    public static void totesLesOperacions(){
        boolean repetir = true;
        do {
            System.out.printf("Seleccione una opció [%d-%d]: ",MINIM_OPCIO,MAXIM_OPCIO);
            switch (llegirEnter()){
                case SUMA:
                    casSuma();
                    break;
                case RESTA:
                    casResta();
                    break;
                case MULTIPLICACIO:
                    casMultiplicacio();
                    break;
                case DIVISIO:
                    casDivisio();
                    break;
                case AREA_RECTANGLE:
                    casAreaRecatangle();
                    break;
                case VOLUM_PRISMA:
                    casAreaVolumPrisma();
                    break;
                case EQUACIO_SEGON_GRAU:
                    casEquacioSegonGrau();
                    break;
                case EIXIR:
                    repetir = false;
                    break;
                default:
                    System.out.println("Error! L'opció seleccionada no és vàlida. Introduïx-la de nou");
            }
        }while (repetir);
        System.out.print("Fins altra!");
    }

    public static void casSuma(){
        System.out.print("Introduïsca els operants esquerra i dreta: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        Activitat15.mostrarSuma(op1, op2);
    }
    public static void casResta(){
        System.out.print("Introduïsca els operants esquerra i dreta: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        Activitat15.mostrarResta(op1, op2);
    }
    public static void casMultiplicacio(){
        System.out.print("Introduïsca els operants esquerra i dreta: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        Activitat15.mostrarMultiplicacio(op1, op2);
    }
    public static void casDivisio(){
        System.out.print("Introduïsca els operants esquerra i dreta: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        Activitat15.mostrarDivisio(op1, op2);
    }
    public static void casAreaRecatangle(){
        System.out.print("Introduïsca la base i altura del rectangle: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        Activitat15.mostrarAreaRectangle(op1, op2);
    }
    public static void casAreaVolumPrisma(){
        System.out.print("Introduïsca el valor de les tres dimensions: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        int op3 = llegirEnter();
        Activitat15.mostrarAreaVolumPrisma(op1, op2, op3);
    }
    public static void casEquacioSegonGrau(){
        System.out.print("Introduïsca els valors de a, b i c, respectivament: ");
        int op1 = llegirEnter();
        int op2 = llegirEnter();
        int op3 = llegirEnter();
        Activitat15.mostrarEquacioSegonGrau(op1, op2, op3);
    }

}
