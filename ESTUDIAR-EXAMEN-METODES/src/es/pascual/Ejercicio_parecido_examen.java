package es.pascual;

import java.util.Scanner;

public class Ejercicio_parecido_examen {
    private static Scanner usuario;

    public static void main(String[] args) {
        /*Solo me funcionan las opciones del menu 2 y 3, la 1 no funciona del todo bien pero funciona mas o menos*/
        usuario = new Scanner(System.in);
        eleccionOpcion();
    }

    public static void textoInicio(){
        System.out.println("Benvingut a Batoi Construccions");
        System.out.println("-------------------------------");
        System.out.println("1. Realitzar calcul de rimbombància");
        System.out.println("2. Realitzar calcul de resistencia i rimbombància");
        System.out.println("3. Eixir");
    }

    public static int eleccionOpcion(){
        textoInicio();

        boolean opcionsCorrectes = false;

        int opcion = 0;

        while(!opcionsCorrectes){
            System.out.print("\nSelecciona una opció [1-3]: ");

            if(usuario.hasNextInt()){
                opcion = usuario.nextInt();

                if(opcion >= 1 && opcion <= 3){
                    if(opcion == 1){
                        double ample = obtindreAmple();
                        double altura = obtindreAltura();
                        double profunditat = obtindreProfunditat();

                        System.out.println("Dimensions del pilar => Ample(" + ample + "m) Altura(" + altura + "m)" +
                                " Profunditat(" + profunditat + "m)");

                        obtindreRimbombancia(altura,ample,profunditat);


                    } else if(opcion == 2){
                        esPilarValid(0,0,0);

                    } else{
                        System.out.println("Adeu");

                        opcionsCorrectes = true;
                    }

                } else{
                    System.out.println("Error. Opció incorrecta");
                }

            } else{
                System.out.println("Error! Tipus incorrecte");

                usuario.next();
            }
        }

        return opcion;
    }

    public static double obtindreAmple(){
        double amplio = 0;

        System.out.print("Introdueix ample (m): ");
        amplio = usuario.nextDouble();

        return amplio;
    }

    public static double obtindreAltura(){
        double altura = 0;

        System.out.print("Introdueix altura (m): ");
        altura = usuario.nextDouble();

        return altura;
    }

    public static double obtindreProfunditat(){
        double profundidad = 0;

        System.out.print("Introdueix profunditat (m): ");
        profundidad = usuario.nextDouble();

        return profundidad;
    }

    public static boolean teFormigo(){
        boolean hormigon = false;

        System.out.print("Té formigó?: ");
        hormigon = usuario.nextBoolean();

        return hormigon;
    }

    public static double obtindreResistencia(double ample, double profunditat, boolean teFormigo){

        double resistencia = 0;

        if(teFormigo == true){
            resistencia = 2 * ample * Math.pow(profunditat, 0.5 * Math.PI);

        } else{
            resistencia = ample * Math.pow(profunditat, 2.1 * Math.PI);
        }

        System.out.println("Resistència --> " + resistencia);

        return resistencia;
    }

    public static double obtindreRimbombancia(double altura, double ample, double profunditat){
        double rimbombancia = Math.sqrt(Math.pow(profunditat, 1.5) + Math.pow(ample, 0.25) - Math.pow(altura, 0.75));

        System.out.println("Rimbombància --> " + rimbombancia);

        return rimbombancia;
    }

    public static boolean esPilarValid(double altura, double ample, double profunditat){
        boolean dimensionCorrecta = false;

        while(!dimensionCorrecta) {
            ample = obtindreAmple();
            altura = obtindreAltura();
            profunditat = obtindreProfunditat();
            boolean tenerhormigon = teFormigo();

            if (ample <= 0 || altura <= 0 || profunditat <= 0) {
                System.out.println("Error. Les dimensions són incorrectes\n");

            } else{
                System.out.println("Dimensions del pilar => Ample(" + ample + "m) Altura(" + altura + "m)" +
                        " Profunditat(" + profunditat + "m)");

                obtindreResistencia(ample, profunditat, tenerhormigon);
                obtindreRimbombancia(altura, ample, profunditat);

                dimensionCorrecta = true;
            }
        }
        return dimensionCorrecta;
    }
}
