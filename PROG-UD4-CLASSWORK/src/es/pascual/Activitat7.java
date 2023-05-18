package es.pascual;

public class Activitat7 {

    public static void main(String[] args) {
        double paco = potencia(10,-2 );
        System.out.println(paco);



    }

    public static double potencia(int base, int exponente){

        int i = 0;
        int resultat = 0;
        int resultat2 = 0;

        if (exponente > 0){
            while (i != exponente){
                resultat = base * base;
                i++;
            }
        }
        if (exponente < 0){
           while (i != exponente){
              resultat2 = (base * Math.abs(exponente));
               i++;
           }
           resultat= 1 /resultat2;
        }
        if (exponente == 0){
            resultat = 1;
        }
        return resultat;

    }

}
