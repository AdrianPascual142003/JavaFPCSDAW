package es.pascual.tipo;

import java.time.LocalDate;

public class IngredienteSolidoNoPerecedero extends IngredienteSolido {

    public IngredienteSolidoNoPerecedero(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada) {
        super(nombre, precioBase, fechaCaducidad, cantidadAlmacenada);
    }

}
