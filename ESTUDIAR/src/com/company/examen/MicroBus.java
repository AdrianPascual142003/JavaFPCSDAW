package com.company.examen;

public class MicroBus extends Vehiculo {

    private Capacidad capacidad;

    private int conductores;

    private Ruedas ruedas;

    private boolean tienenMesas;

    public MicroBus(String matricula, int diasAlquiler, Ruedas ruedas, boolean tienenMesas) {
        super(matricula, diasAlquiler);
        this.capacidad = Capacidad.P30;
        this.conductores = 1;
        this.ruedas = ruedas;
        this.tienenMesas = tienenMesas;
    }


    @Override
    public double obtenerPrecio(int dias, int km) {
        double precioTootal = 200 * dias;
        precioTootal += (km * 0.85);
        if (getIsLimpio()) {
            precioTootal += 200;
        }
        if (getIsRevisado()) {
            precioTootal += 150;
        }
        precioTootal += (conductores * dias) * 98;
        if (dias > getDiasAlquiler()) {
            precioTootal += 200;
        }
        return precioTootal;
    }

    public boolean anyadirConductores() {
        conductores = conductores + 1;
        return true;
    }

    public boolean reducirConductores() {
        if (conductores < 1){
            return false;
        }
        conductores = conductores - 1;
        return true;
    }

    @Override
    public String toString() {
        return String.format();
    }

}
