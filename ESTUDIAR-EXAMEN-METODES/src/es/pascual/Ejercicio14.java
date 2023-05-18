package es.pascual;

public class Ejercicio14 {

    public static void main(String[] args) {
        System.out.println(esCapicua(121));
        System.out.println(esPrimo(13));
        System.out.println(siguientePrimo(16));
        System.out.printf("%.1f %n", potencia(2,2));
        System.out.println(contarDigitos(999999999));
        System.out.println(volteaNumero(789));
        System.out.println(quitarNumeroDetras(79));
        System.out.println(quitarNumeroDelante(7890));
    }

    public static boolean esCapicua(int numero){
        int aux = numero;
        int cifra;
        int inverso = 0;
        do {
            cifra = aux %10;
            inverso = inverso * 10 + cifra;
            aux = aux/10;
        }while (aux!=0);

        return numero == inverso;
    }

    public static boolean esPrimo(int numero){
        int contradorVoltes = 0;
        for (int i = numero; i >= 1 ; i--) {
            if (numero%i == 0){
                contradorVoltes++;
            }
        }
        return contradorVoltes != 2;
    }

    public static int siguientePrimo(int numero){
        int numeroSiguientePrimo = 0;
        for (int i = numero-1; i >=1 ; i--) {
            if (numero%i == 0){
                numeroSiguientePrimo = i;
                break;
            }
        }
        return numeroSiguientePrimo;
    }

    public static double potencia (int base, int exponente){
        return Math.pow(base, exponente);
    }

    public static int contarDigitos(int numero){
        int digitos = 0;
        int operacion = numero;
        do {
             operacion = operacion / 10;
            if (numero/10 != 0){
                digitos++;
            }
        }while (operacion !=0);
        return digitos;
    }

    public static int volteaNumero (int numero){
        int aux = numero;
        int cifra;
        int inverso = 0;
        do {
            cifra = aux %10;
            inverso = inverso * 10 + cifra;
            aux = aux/10;
        }while (aux!=0);
        return inverso;
    }

    public static int quitarNumeroDetras(int numero){
        return numero/10;
    }

    public static int quitarNumeroDelante(int numero){
        int operacion = numero;
        int contadorZeros = 0;
        int primerNumero = 0;
        int aux = numero;
        do {
            aux = aux%10;
            operacion = operacion / 10;
            if (operacion != 0){
                contadorZeros++;
            }
            if (operacion < 10){
                primerNumero += operacion;
            }
            if (operacion != 0){
                contadorZeros++;
            }
        }while (operacion != 0);

        int numeroARestar = 0;
        for (int i = 1; i <= contadorZeros ; i++) {
            numeroARestar = primerNumero * 10;
        }
        return numero-numeroARestar;
    }

}
