package es.pascual.Activitat15;

import es.pascual.Activitat14.Matematica;

public class Activitat15 {
    public static void main(String[] args) {

        System.out.println("SUMA");
        System.out.println("----");
        int num1 = 2;
        int num2 = 4;
        mostrarSuma(num1, num2);

        num1 = 6;
        num2 = 8;
        mostrarSuma(num1, num2);

        num1 = 3;
        num2 = 2;
        mostrarSuma(num1, num2);

        System.out.println();

        System.out.println("RESTA");
        System.out.println("-----");
        num1 = 2;
        num2 = 4;
        mostrarResta(num1, num2);

        num1 = 6;
        num2 = 8;
        mostrarResta(num1, num2);

        num1 = 3;
        num2 = 2;
        mostrarResta(num1, num2);

        System.out.println();

        System.out.println("MULTIPLICACIÓ");
        System.out.println("-------------");
        num1 = 2;
        num2 = 4;
        mostrarMultiplicacio(num1, num2);

        num1 = 6;
        num2 = 8;
        mostrarMultiplicacio(num1, num2);

        num1 = 3;
        num2 = 2;
        mostrarMultiplicacio(num1, num2);

        System.out.println();

        System.out.println("DIVISIÓ");
        System.out.println("-------");
        num1 = 2;
        num2 = 4;
        mostrarDivisio(num1, num2);

        num1 = 6;
        num2 = 8;
        mostrarDivisio(num1, num2);

        num1 = 3;
        num2 = 2;
        mostrarDivisio(num1, num2);
        System.out.println();

        System.out.println("MÒDUL");
        System.out.println("-----");
        num1 = 2;
        num2 = 4;
        mostrarModul(num1,num2);

        num1 = 6;
        num2 = 8;
        mostrarModul(num1,num2);

        num1 = 3;
        num2 = 2;
        mostrarModul(num1,num2);
        System.out.println();

        System.out.println("ARREL QUADRADA");
        System.out.println("---------------");
        double numeroArrel = 16;
        mostrarArrel(numeroArrel);

        numeroArrel = 4;
        mostrarArrel(numeroArrel);

        numeroArrel = 2;
        mostrarArrel(numeroArrel);

        System.out.println();

        System.out.println("POTÈNCIA");
        System.out.println("--------");
        int base = 2;
        int exponent = 4;
        mostrarPotencia(base,exponent);

        base = 6;
        exponent = 8;
        mostrarPotencia(base,exponent);

        base = 3;
        exponent = 2;
        mostrarPotencia(base,exponent);

        System.out.println();

        System.out.println("AREA RECTANGLE");
        System.out.println("--------------");
        double baseRectangle = 12;
        double alturaRectangle = 34;
        mostrarAreaRectangle(baseRectangle, alturaRectangle);

        baseRectangle = 19.4;
        alturaRectangle = 42.4;
        mostrarAreaRectangle(baseRectangle, alturaRectangle);

        baseRectangle = 27;
        alturaRectangle = 56.4;
        mostrarAreaRectangle(baseRectangle, alturaRectangle);

        System.out.println();

        System.out.println("VOLUM PRISMA");
        System.out.println("------------");
        double ample = 12;
        double alt = 34;
        double profunditat = 10;
        mostrarAreaVolumPrisma(ample,alt,profunditat);

        ample = 19.4;
        alt = 42.4;
        profunditat = 200;
        mostrarAreaVolumPrisma(ample,alt,profunditat);

        ample = 27;
        alt = 56.4;
        profunditat = 50;
        mostrarAreaVolumPrisma(ample,alt,profunditat);

        System.out.println();

        System.out.println("EQUACIÓ DE SEGON GRAU");
        System.out.println("---------------------");
        int a = 12;
        int b = 34;
        int c = 7;
        mostrarEquacioSegonGrau(a,b,c);
        System.out.println();

        System.out.println("EQUACIÓ DE SEGON GRAU");
        System.out.println("---------------------");
        a = 19;
        b = -42;
        c = 23;
        mostrarEquacioSegonGrau(a,b,c);
        System.out.println();

        System.out.println("EQUACIÓ DE SEGON GRAU");
        System.out.println("---------------------");
        a = 27;
        b = 56;
        c = -16;
        mostrarEquacioSegonGrau(a,b,c);

    }
    public static void mostrarArrel (double num1){
        double resultat = es.pascual.Activitat14.Matematica.obtindreArrelQuadrada(num1);
        System.out.printf("√" + num1 + " = %.2f %n",resultat);
    }

    public static void mostrarModul(int num1, int num2) {
        double resultat2 = es.pascual.Activitat14.Matematica.obtindreModul(num1,num2);
        System.out.printf(num1 + " %% " + num2 + " = %.3f %n",resultat2);
    }
    public static void mostrarDivisio(int num1, int num2){
        double resultat2 = es.pascual.Activitat14.Matematica.obtindreDivisio(num1,num2);
        System.out.printf(num1 + " / " + num2 + " = %.3f %n",resultat2);
    }
    public static void mostrarSuma(int num1, int num2){
        int resultat = es.pascual.Activitat14.Matematica.obtindreSuma(num1,num2);
        System.out.println(num1 + " + " + num2 + " = " + resultat);
    }
    public static void mostrarResta(int num1, int num2){
        int resultat = es.pascual.Activitat14.Matematica.obtindreResta(num1,num2);
        System.out.println(num1 + " - " + num2 + " = " + resultat);
    }
    public static void mostrarMultiplicacio(int num1, int num2){
        int resultat = es.pascual.Activitat14.Matematica.obtindreMultiplicacio(num1,num2);
        System.out.println(num1 + " * " + num2 + " = " + resultat);
    }
    public static void mostrarAreaRectangle(double baseRectangle, double alturaRectangle){
        int resultat = es.pascual.Activitat14.Matematica.obtindreAreaRectangle(baseRectangle, alturaRectangle);
        System.out.println(baseRectangle + " x " + alturaRectangle + " = " + resultat);
    }
    public static void mostrarAreaVolumPrisma(double ample, double alt, double profunditat){
        int restultat = es.pascual.Activitat14.Matematica.obtindreVolumPrisma(ample,alt,profunditat);
        System.out.println(ample + " X " + alt + " X " + profunditat + " = " + restultat);
    }
    public static void mostrarPotencia(int base, int exponent){
        int resultat = es.pascual.Activitat14.Matematica.obtindrePotencia(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + resultat);
    }
    public static void mostrarEquacioSegonGrau(int a, int b, int c){
        double resultat = es.pascual.Activitat14.Matematica.obtindreEquacioGrau2(a,b,c,true);
        double resultat2 = Matematica.obtindreEquacioGrau2(a,b,c,false);

        System.out.printf("%+dx^2 %+dx %+d = 0 x1 = %+.3f x2 = %+.3f %n",a,b,c,resultat,resultat2);

    }
}
