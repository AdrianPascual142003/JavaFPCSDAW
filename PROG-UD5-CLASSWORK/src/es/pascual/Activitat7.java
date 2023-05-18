package es.pascual;

public class Activitat7 {
    public static void main(String[] args) {
        System.out.println("capicua = " + obtindreCapicua("capicua"));
        System.out.println("radar = " + obtindreCapicua("radar"));
        System.out.println("somos = " + obtindreCapicua("somos"));
        System.out.println("conèixer = " + obtindreCapicua("conèixer"));
        System.out.println("reconocer = " + obtindreCapicua("reconocer"));
        System.out.println(obtindreCapicua2("caca"));
    }

    public static boolean obtindreCapicua(String palabra) {
        for (int i = 0; i <=palabra.length()/2 ; i++) {
            char a = palabra.charAt(i);
            char b = palabra.charAt(palabra.length()-i-1);
            if (a != b){
                return false;
            }
        }
        return true;
    }

    private static boolean obtindreCapicua2(String palabra) {
        int rightIndex = palabra.length() -1;
        int leftIndex = 0;
        while(leftIndex < rightIndex){
            if (palabra.charAt(leftIndex) != palabra.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

}
