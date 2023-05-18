package com.company.examen;

public interface Alquilable {

    boolean alquilar(int dias);

    void anyadirKm(int km);

    double obtenerPrecio(int dias, int km);

    void liberar();

}
