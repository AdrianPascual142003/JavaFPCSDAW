package es.pascual;

public class Actividad5b {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        System.out.println("A\t\t B\t\t A && B");
        System.out.println("========================");
        boolean resultado = a||b;
        System.out.println(a +"\t"+ b +"\t" + resultado);

        a = true;
        b = false;
        resultado = a||b;
        System.out.println(a +"\t"+ b +"\t"+ resultado);

        a = false;
        b = true;
        resultado = a||b;
        System.out.println(a +"\t"+ b +"\t"+ resultado);

        a = true;
        b = true;
        resultado = a||b;
        System.out.println(a +"\t"+ b +"\t"+ resultado);


    }
}
