package es.pascual;

import java.util.Scanner;

public class Activitat27 {

    public static final int MAX_TASQUES = 20;
    public static final int MAX_COLUMNES = 5;
    public static final int COLUMNA_TEMPS = 3;
    public static final int COLUMNA_ESTAT = 5;
    public static final int TEMPS_ESTIMAT_MINIM = 5;
    public static final int TEMPS_ESTIMAT_MAXIM = 1000;
    public static final int AFEGIR_TASCA = 1;
    public static final int MOSTRAR_TASCA = 2;
    public static final int ORDENAR_TASCA = 3;
    public static final int AFGIR_TEMPS_TASCA = 4;
    public static final int FINALITZAR_TASCA = 5;
    public static final int EIXIDA = 6;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String NO_FINALITZADA = "false";


    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        inici();
    }


    public static void inici(){
        String [][] taulaTasques = new String [MAX_TASQUES] [];
        cartellInicial();
        menu(taulaTasques);
    }

    public static void cartellInicial(){
        System.out.println(ANSI_PURPLE + "Benvigut a Batoi To-Do List" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "---------------------------\n" + ANSI_RESET);
    }

    public static void cartellOpcions(){
        System.out.println(ANSI_BLUE + "OPCIONS DISPONIBLES" + ANSI_RESET);
        System.out.println(ANSI_YELLOW +  AFEGIR_TASCA + ". Afegir una tasca" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + MOSTRAR_TASCA + ". Mostrar tasques" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + ORDENAR_TASCA + ". Mostrar tasques ordenades per temps" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + AFGIR_TEMPS_TASCA + ". Afegir temps" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + FINALITZAR_TASCA + ". Marcar tasca com a finalitzad" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + EIXIDA + ". Eixir del programa" + ANSI_RESET);
    }

    public static void menu(String [] [] taulaTasques){
        int numeroOpcio;
        do {
            cartellOpcions();
            numeroOpcio = demanarEnter();
            switch (numeroOpcio){
                case AFEGIR_TASCA:
                    System.out.println();
                    novaTasca(taulaTasques);
                    break;
                case MOSTRAR_TASCA:
                    System.out.println();
                    mostrarTabla(taulaTasques);
                    break;
                case ORDENAR_TASCA:
                    String[][] clonacio = clonarMatriu(taulaTasques);
                    ordenarTemps(clonacio);
                    System.out.println();
                    mostrarTabla(clonacio);
                    break;
                case AFGIR_TEMPS_TASCA:
                    System.out.println();
                    mostrarTabla(taulaTasques);
                    afegirTemps(taulaTasques);
                    break;
                case FINALITZAR_TASCA:
                    System.out.println();
                    mostrarTabla(taulaTasques);
                    marcarFinalitzada(taulaTasques);
                    break;
                case EIXIDA:
                    System.out.println();
                    System.out.println(ANSI_BLUE + "Adéu" + ANSI_RESET);
                    break;
                default:
                    System.out.println("Error! L'opció seleccionada no és vàlida\n");
            }
        }while (numeroOpcio != EIXIDA);

    }

    public static void marcarFinalitzada(String[][] taulaTasques){
        int filesTaula = encontrarFilaBuida(taulaTasques);
        if (filesTaula !=0) {
                int numeroTasca = obtindreEnter("Introdueix el número de la tasca: ");
                if (estaLaTasca(taulaTasques, numeroTasca)){
                    if (!isFinished(taulaTasques, numeroTasca)){
                        taulaTasques[numeroTasca-1][COLUMNA_ESTAT-1] = "true";
                        System.out.println(ANSI_GREEN + "Tasca " + numeroTasca + " finalitzada satisfactòriament\n" + ANSI_RESET);
                    }else {
                        System.out.println(ANSI_YELLOW + "La tasca esta finalitzada\n" + ANSI_RESET);
                    }
                }else {
                    System.out.println(ANSI_RED + "La tasca seleccionada no existeix\n" + ANSI_RESET);
                }
        }
    }

    /**
     * Metode per a canviar el temps de les tasques
     */

    public static void afegirTemps(String[][]taulaTasques){
        int filesTaula = encontrarFilaBuida(taulaTasques);
        if (filesTaula != 0){
                int numeroTasca = obtindreEnter("Introdueix el número de la tasca: ");
                if (estaLaTasca(taulaTasques, numeroTasca)){
                    if (!isFinished(taulaTasques, numeroTasca)){
                        int tempsAnyadit = obtindreTempsAfegir();
                        int temps = Integer.parseInt(taulaTasques[numeroTasca-1][COLUMNA_TEMPS-1]);
                        taulaTasques[numeroTasca-1][COLUMNA_TEMPS-1] = String.valueOf(temps + tempsAnyadit);
                        System.out.println(ANSI_GREEN + "Temps afegit amb èxit\n" + ANSI_RESET);
                    }else {
                        System.out.println(ANSI_YELLOW + "La tasca esta finalitzada\n" + ANSI_RESET);
                    }
                }else {
                    System.out.println(ANSI_RED + "La tasca seleccionada no existeix\n" + ANSI_RESET);
                }
        }
    }

    public static boolean isFinished(String[][]taulaTasques, int numTasca) {
        return Boolean.parseBoolean(taulaTasques[numTasca-1][COLUMNA_ESTAT-1]);
    }

    /**
     * Comprova si esta la tasca o no esta
     */

    public static boolean estaLaTasca(String [][] taulaTasques, int numeroComprovar){
        int filesTotals = encontrarFilaBuida(taulaTasques);
        return numeroComprovar <= filesTotals;
    }

    public static void ordenarTemps(String[][] taulaTasques){
        for (int i = 0; i < taulaTasques.length-1; i++) {
            for (int j = i + 1; j < taulaTasques.length; j++) {
                if (taulaTasques[j] != null){
                    if (Integer.parseInt(taulaTasques[j][COLUMNA_TEMPS-1]) < Integer.parseInt(taulaTasques[i][COLUMNA_TEMPS-1])){
                        intercanviarFiles(taulaTasques,i,j);
                    }
                }
            }
        }
    }

    public static String[][] clonarMatriu(String[][] original) {
        String[][] copia = new String[original.length][];
        for (int i = 0; i < original.length ; i++) {
            if(original[i] != null) {
                copia[i] = new String[MAX_COLUMNES];
                for (int j = 0; j < original[i].length; j++) {
                    copia[i][j] = original[i][j];
                }
            }
        }
        return copia;
    }
    public static void intercanviarFiles(String[][] taulaTasques, int fila, int filaIntercanviar){
        for (int i = 0; i < taulaTasques[fila].length; i++) {
            String elementCanviar = taulaTasques[fila][i];
            taulaTasques[fila][i] = taulaTasques[filaIntercanviar][i];
            taulaTasques[filaIntercanviar][i] = elementCanviar;
        }
    }


    /**
     * Mostrar tabla en les tarees
     */

    public static void mostrarTabla(String[][] taulaTasques){
        int numeroFiles = encontrarFilaBuida(taulaTasques);
        if (numeroFiles == 0){
            System.out.println(ANSI_RED + "No hi han tasques afegides\n" + ANSI_RESET);
        }else {
            System.out.println(ANSI_BLUE + """
                    ==========================================================================================================
                    |       Descripció        |           Tipus        |    Temps(mins)   |   Prioritat   |    Finalitzada   |
                    ==========================================================================================================""" + ANSI_RESET);
            for (int i = 0; i < numeroFiles; i++) {
                System.out.print(ANSI_BLUE + "|  " + ANSI_RESET);
                for (int j = 0; j < taulaTasques[i].length; j++) {
                    if (!taulaTasques[i][j].equalsIgnoreCase(taulaTasques[i][taulaTasques[i].length-1])){
                        System.out.printf(ANSI_YELLOW + "%18s",taulaTasques[i][j]);
                    }else {
                        if (taulaTasques[i][j].equalsIgnoreCase(NO_FINALITZADA)) {
                            System.out.printf(" %17s \t\t" + ANSI_RESET + ANSI_BLUE + " |" + ANSI_RESET,"Pendent");
                        }else {
                            System.out.printf(" %17s \t\t|","Finalitzada");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    /**
     * Afegix al array una nova fila completa si el array esta buit.
     */

    public static void novaTasca(String[][] taulaTasques){
        int encontrarFilaBuida = encontrarFilaBuida(taulaTasques);
        if (encontrarFilaBuida==-1){
            System.out.println(ANSI_RED + "Error! no es poden afegir més tasques pendents" + ANSI_RESET);
        }else {
            taulaTasques[encontrarFilaBuida] = obtindreTasca();
        }
        System.out.printf(ANSI_GREEN + "S'ha afegit la tasca satisfactòriament. La tasca ocupa la posició %d %n%n" + ANSI_RESET, (encontrarFilaBuida + 1));
    }

    /**
     * Obte la tasca total i ho retorna creant un array
     */

    public static String [] obtindreTasca(){
        String descripcioIntroduida = obtindreDescripcio();
        String tipusTasca = obtindreTipusTasca();
        String tempsEstimat = String.valueOf(obtindreTempsEstimat());
        String prioritatIntroduida = obtindrePrioritat();
        String finalitzada = "false";
        return new String[]{
                descripcioIntroduida, tipusTasca, tempsEstimat, prioritatIntroduida, finalitzada
        };
    }

    /**
     * Obte una descripció
     */

    public static String obtindreDescripcio(){
        System.out.print("Descripció de la tasca: ");
        return teclat.nextLine();
    }

    /**
     * Busca si hi ha una fila buida si esta buida retorna la fila i si no -1
     */

    public static int encontrarFilaBuida(String [][] taulaTasques){
        for (int i = 0; i < taulaTasques.length; i++) {
            if (taulaTasques[i] == null){
                return i;
            }
        }
        return -1;
    }

    /**
     * Obte la prioritat de la tasca i la retorna si es correcta
     */

    public static String obtindrePrioritat(){
        do {
            System.out.print("Prioritat[Baixa, Mijta, Alta]: ");
            String prioritatIntroduida = teclat.nextLine();
            if (esPrioritat(prioritatIntroduida)){
                return prioritatIntroduida;
            }
            System.out.println(ANSI_RED + "Error! El valor introduït no és vàlid \n" + ANSI_RESET);
        }while (true);
    }

    /**
     * Comprova si la prioritat es correcta o no
     */

    public static boolean esPrioritat(String prioritatIntroduida){
        String [] llistatPrioritat = {
                "Baixa", "Mitja", "Alta"
        };
        for (String prioritats : llistatPrioritat) {
            if (prioritats.equals(prioritatIntroduida)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obte el temps estimat i el retorna
     */



    public static int obtindreTempsEstimat(){
        return obtindreTemps("Temps estimat[" +  TEMPS_ESTIMAT_MINIM + "-" + TEMPS_ESTIMAT_MAXIM + "]: ");
    }

    public static int obtindreTempsAfegir(){
        return obtindreTemps("Quant de temps vols afegir?: ");
    }

    public static int obtindreTemps(String missatge){
        do {
            int tempsEstimat = obtindreEnter(missatge);
            if (tempsEstimat <= TEMPS_ESTIMAT_MAXIM && tempsEstimat >= TEMPS_ESTIMAT_MINIM){
                return tempsEstimat;
            }else {
                System.out.println(ANSI_RED + "Error! has de introduïr un valor entre " + TEMPS_ESTIMAT_MINIM + " i " + TEMPS_ESTIMAT_MAXIM + " \n" + ANSI_RESET);
            }
        }while (true);
    }

    /**
     * Obté el tipus de tasca si es correcte, si no mostrará un error
     */

    public static String obtindreTipusTasca(){
        do {
            System.out.print("Tipus[Hardware, Xarxa, Programació, Base de dades, Altre]: ");
            String tipusTasca = teclat.nextLine();
            if (esTipusTasca(tipusTasca)){
                return tipusTasca;
            }
            System.out.println(ANSI_RED + "Error! El valor introduït no és vàlid \n" + ANSI_RESET);
        }while (true);
    }

    /**
     * Comprova si la tasca es valida
     */

    public static boolean esTipusTasca(String tipusIntroduit){
        String [] llistatTipus = {
                "Hardware", "Xarxa", "Programació", "Base de dades", "Altre"
        };
        for (String tipus : llistatTipus) {
            if (tipus.equals(tipusIntroduit)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Demana un enter amb un missatge
     */

    public static int demanarEnter(){
        return obtindreEnter("Introdueix l'opció [1-6]: ");
    }

    public static int obtindreEnter(String missatge){
        do {
            System.out.print(missatge);
            if (teclat.hasNextInt()){
                int numeroIntroduit =  teclat.nextInt();
                teclat.nextLine();
                return numeroIntroduit;
            }
            System.out.println(ANSI_RED + "Error! Has d'introduir un valor numéric\n" + ANSI_RESET);
            teclat.next();
        }while (true);
    }



}
