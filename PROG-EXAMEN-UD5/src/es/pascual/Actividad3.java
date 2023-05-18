package es.pascual;

public class Actividad3 {

    public static final double PAGO_ESTATICO = 1.5;
    public static final double PRECIO_MINIMO_GRANDES_CONSUMIDORES = 500.00;
    public static final int TOTAL_FAMILIAS = 5;

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        double [] []gastosMensuales = {
                {10.23,20.5,8.0,10.6,20.8,10.4},
                {2.0,2.30,5.0,30.7,4.0,5.0},
                {8.0,5.0,4.2,5.8,0.8,0.2},
                {5.0,2.0,5.6,30.0,5.4,14.0},
                {10.0,15.0,0.34,4.5,6.5,15.0}
        };
        double [] precioKwMes = {10.6,11.5,8.001,4.26,11.7,14.9};

        double[] totalPagosFamilias = obtenerTotalPagoFamilias(gastosMensuales,precioKwMes);
        mostrarPagosTotalesFamilias(totalPagosFamilias);
        System.out.printf("Totales: %d/%d familias han pagado más de %.2f€ %n",obtenerGrandesConsumidores(totalPagosFamilias),TOTAL_FAMILIAS,PRECIO_MINIMO_GRANDES_CONSUMIDORES);
        double mayorConsumo = obtenerMayorConsumo(gastosMensuales);
        System.out.printf("Mayor consumo mensual: Familia %d con un total de %.2f kw %n",obtenerFamiliaMayorConsumo(gastosMensuales,mayorConsumo),mayorConsumo);
        System.out.printf("El precio medio del kw en los primeros meses del año es de %.2f€",obtenerPromedioPrimerosMeses(precioKwMes));
    }

    public static double obtenerPromedioPrimerosMeses(double[] precioKwMes){
        double promedioPrimerosMeses = 0;
        for (int i = 0; i < precioKwMes.length; i++) {
            promedioPrimerosMeses += precioKwMes[i];
        }
        return promedioPrimerosMeses/precioKwMes.length;
    }

    public static double obtenerMayorConsumo(double[][] gastosMensuales){
        double mayorConsumo = 0;
        for (int i = 0; i < gastosMensuales.length; i++) {
            for (int j = 0; j < gastosMensuales[i].length; j++) {
                if (gastosMensuales[i][j] > mayorConsumo) {
                    mayorConsumo = gastosMensuales[i][j];
                }
            }
        }
            return mayorConsumo;
    }

    public static int obtenerFamiliaMayorConsumo(double [][] gastosMensuales, double mayorConsumo){
        for (int i = 0; i < gastosMensuales.length; i++) {
            for (int j = 0; j < gastosMensuales[i].length; j++) {
                if (gastosMensuales[i][j] == mayorConsumo){
                    return i + 1;
                }
            }
        }
        return -1;
    }

    public static void mostrarPagosTotalesFamilias(double[] totalPagosFamilias){
        for (int i = 0; i < totalPagosFamilias.length; i++) {
            System.out.printf("Familia %d: Pago Total %.2f€ %n",(i+1),totalPagosFamilias[i]);
        }
    }

    public static int obtenerGrandesConsumidores(double[] totalPagosFamilias){
        int numeroGrandesConsumidores = 0;
        for (int i = 0; i < totalPagosFamilias.length; i++) {
            if (totalPagosFamilias[i] > PRECIO_MINIMO_GRANDES_CONSUMIDORES){
                numeroGrandesConsumidores++;
            }
        }
        return numeroGrandesConsumidores;
    }

    public static double obtenerPagoTotalFamilia(double[] gastosMesFamilia, double[] precioKw){
        double total = 0;
        for (int i = 0; i < gastosMesFamilia.length; i++) {
            total += gastosMesFamilia[i] * precioKw[i] + PAGO_ESTATICO;
        }
        return total;
    }

    public static double[] obtenerTotalPagoFamilias(double[][] gastosFamilies, double[] precioKw){
        double[] totalPagosFamilias = new double[gastosFamilies.length];
        for (int i = 0; i < gastosFamilies.length; i++) {
            double [] precioMesesFamilia = obtenerGastoMesesFamilia(gastosFamilies,i);
            double totalPagar =obtenerPagoTotalFamilia(precioMesesFamilia,precioKw);
            totalPagosFamilias[i] = totalPagar;
        }
        return totalPagosFamilias;
    }

    public static double [] obtenerGastoMesesFamilia(double[][] tablaGastos, int familia){
        double [] gastosMesesFamilia = new double[tablaGastos[familia].length];
        for (int i = 0; i < tablaGastos[familia].length; i++) {
            gastosMesesFamilia[i] = tablaGastos[familia][i];
        }
        return gastosMesesFamilia;
    }

}
