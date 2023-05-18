package es.pascual.tipo;

import java.time.LocalDate;

public class IngredienteLiquido extends Ingrediente {

    public static final int PROCENTAGE_A_SUMAR = 10;

    public static final int CIENN_POR_CIENTO = 100;

    public IngredienteLiquido(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada) {
        super(nombre, precioBase, fechaCaducidad, cantidadAlmacenada);
    }

    @Override
    public double getPrecio() {
        double precioTotal = super.getPrecio();
        return precioTotal + ((PROCENTAGE_A_SUMAR * precioTotal / CIENN_POR_CIENTO));
    }

}
