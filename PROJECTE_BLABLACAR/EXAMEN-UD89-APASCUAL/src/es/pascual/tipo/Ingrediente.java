package es.pascual.tipo;

import es.pascual.exceptions.IngredienteNoValidoExcepcion;

import java.time.LocalDate;

import java.util.Objects;

public abstract class Ingrediente {

    private String nombre;

    private double precioBase;

    private LocalDate fechaCaducidad;

    private double cantidadAlmacenada;

    public Ingrediente(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada) {
        checkNombre(nombre);
        checkPrecioBase(precioBase);
        this.fechaCaducidad = fechaCaducidad;
        checkCantidad(cantidadAlmacenada);
    }

    private void checkNombre(String nombre) {
        if (nombre != null && nombre.matches("^([A-Z][a-z])|[A-Z][a-z]+$")) {
            this.nombre = nombre;
        }else {
            throw new IngredienteNoValidoExcepcion("El nombre del ingrediente es incorrecto");
        }
    }

    private void checkPrecioBase(double precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        }else {
            throw new IngredienteNoValidoExcepcion("El precio del ingrediente es incorrecto");
        }
    }

    private void checkCantidad(double cantidadAlmacenada) {
        if (cantidadAlmacenada >= 0) {
            this.cantidadAlmacenada = cantidadAlmacenada;
        }else {
            throw new IngredienteNoValidoExcepcion("La cantidad almazenada del ingrediente es incorrecto");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public double getPrecio() {
        return precioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingrediente)) return false;
        Ingrediente that = (Ingrediente) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public double getCantidadAlmacenada() {
        return cantidadAlmacenada;
    }

}
