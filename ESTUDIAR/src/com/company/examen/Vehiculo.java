package com.company.examen;

public abstract class Vehiculo implements Alquilable {

    private String matricula;

    private int diasAlquiler;

    private double kmRealizados;

    private boolean isLimpio;

    private boolean isRevisado;

    public Vehiculo(String matricula, int diasAlquiler) {
        this.matricula = matricula;
        this.diasAlquiler = diasAlquiler;
        this.kmRealizados = 0;
        this.isLimpio = true;
        this.isRevisado = true;
    }

    public boolean getIsLimpio() {
        return isLimpio;
    }

    public boolean getIsRevisado() {
        return isLimpio;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    @Override
    public boolean alquilar(int dias) {
        if (dias > 1) {
            diasAlquiler = diasAlquiler + dias;
            return true;
        }
        return false;
    }

    @Override
    public void anyadirKm(int km) {
        kmRealizados += km;
    }

    @Override
    public abstract double obtenerPrecio(int dias, int km);

    @Override
    public void liberar() {
        this.diasAlquiler = 0;

    }

}
