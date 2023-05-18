package es.pascual.tipo;

import java.time.LocalDate;

public abstract class IngredienteSolido extends Ingrediente {

    public IngredienteSolido(String nombre, double precioBase, LocalDate fechaCaducidad, double cantidadAlmacenada) {
        super(nombre, precioBase, fechaCaducidad, cantidadAlmacenada);
    }

}
