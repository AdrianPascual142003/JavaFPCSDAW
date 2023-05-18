package com.company.examen;

public class Camion extends Vehiculo {

    private int metrosCarga;

    public Camion(String matricula, int diasAlquiler, int metrosCarga) {
        super(matricula, diasAlquiler);
        this.metrosCarga = metrosCarga;
    }

    public Camion(String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler);
        this.metrosCarga = 10;
    }

    @Override
    public double obtenerPrecio(int dias, int km) {
        double precioTotal = dias * 100;
        precioTotal += (0.16 * km);
        if (getIsLimpio()) {
            precioTotal+= 50;
        }
        if (getIsRevisado()) {
            precioTotal += 20;
        }
        if (dias > getDiasAlquiler()) {
            precioTotal += 500;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return String.format();
    }

}
