package es.pascual.tipo;

import es.pascual.exceptions.IngredienteNoValidoExcepcion;

import java.time.LocalDate;

public class IngredienteSolidoPerecedero extends IngredienteSolido {

    public static final int PORCENTAGE_A_SUMAR = 5;
    public static final int CIEN_POR_CIENTO = 100;
    private boolean isImporado;

    private String paisImportacion;

    public IngredienteSolidoPerecedero(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada) {
        super(nombre, precioBase, fechaCaducidad, cantidadAlmacenada);
        this.isImporado = false;
    }

    public IngredienteSolidoPerecedero(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada, String paisImportacion) {
        super(nombre, precioBase, fechaCaducidad, cantidadAlmacenada);
        this.isImporado = true;
        checkPais(paisImportacion);
    }

    private void checkPais(String paisImportacion) {
        if (paisImportacion != null) {
            this.paisImportacion = paisImportacion;
        }else {
            throw new IngredienteNoValidoExcepcion("El pais introducido no puede estar vacio");
        }
    }

    @Override
    public double getPrecio() {
        double precioTotal = super.getPrecio();
        if (!isImporado) {
            return precioTotal;
        }
        return precioTotal + ((PORCENTAGE_A_SUMAR * precioTotal / CIEN_POR_CIENTO));
    }
}
