package es.pascual;

import java.util.Scanner;

public class Nivell2For {
    public static final String ANSI_ROJO = "\u001B[31m";
    public static final String ANSI_AZUL = "\u001B[34m";
    public static final String ANSI_AMARTILLO = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatori1Nivell2 = (int) (Math.random () * 3 + 1);
        int aleatori2Nivell2 = (int) (Math.random() * (7 - 4 + 1) + 4);
        System.out.println("\n" + ANSI_AZUL +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ██████╗░\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ╚════██╗\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ░░███╔═╝\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ██╔══╝░░\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ███████╗\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ╚══════╝\n" + ANSI_RESET);
        System.out.println(ANSI_ROJO + "Satanàs Cor Petit:" + ANSI_RESET + " Sou uns cracks de les matemàtiques! Pensava\n" +
                "que només sabíeu lluitar. Ací teniu la bola de " + aleatori1Nivell2 + " estelles. Per cert,\n" +
                "tinc el número de telèfon de Ten Shin Han, qui em va enviar un\n" +
                "WhatsApp la setmana passada per contar-me que havia trobat la bola\n" +
                "de " + aleatori2Nivell2 + " esteles en el Desert de l’Oblit. Anem-hi!\n");
        System.out.println("Només arribar, trobaren a Ten Shin Han el qual no tenia el seu millor\n" +
                "dia, i no els van rebre amb bona cara. Estava molt cabrejat perquè\n" +
                "estava intentant resoldre un enigma matemàtic i no veia forma de\n" +
                "fer-ho.\n");
        System.out.println(ANSI_AMARTILLO + "Son Gohan:" + ANSI_RESET + " Hola Ten Shin Han, necessitem que ens dones la teua\n" +
                "bola de drac.\n");
        System.out.println(ANSI_AZUL + "Ten Shin Han:" + ANSI_RESET + " Mireu, porte així com 3 hores per a saber quin és el\n" +
                "productori entre nombre aleatori 1 i nombre aleatori 2. La veritat que les matemàtiques no són lo\n" +
                "meu. Si m’ajudeu vos done la bola, a més, m’està criant pols a casa.\n");

        int respuestaNivell2;
        do {
            System.out.println("El productori de " + aleatori1Nivell2 + " y " + aleatori2Nivell2 + " es?" );
            if (!teclado.hasNextInt()) {
                System.out.print("\nError! El tipus de dades introduït és incorrecte");
                return;
            }
            respuestaNivell2 = teclado.nextInt();
            if (respuestaNivell2 <= 0) {
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        } while (respuestaNivell2 <= 0);

        int resultado = 1;
        for (int i = aleatori1Nivell2; i <= aleatori2Nivell2 ; i++) {
            resultado *= i;
        }

        if (respuestaNivell2 == resultado){
            System.out.println("Has encertat, el resultat del productori de "
                    + aleatori1Nivell2 + " y " + aleatori2Nivell2 + " es " + resultado + ". Pases al nivell 3");
        }else {
            System.out.println("Has perdut");
        }


    }
}
