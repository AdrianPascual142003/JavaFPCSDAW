package es.pascual.exceptions;

import es.pascual.tipo.Ingrediente;

public class IngredienteCaducadoExcepcion extends Throwable {
    public IngredienteCaducadoExcepcion(Ingrediente ingrediente) {
        super("Ingrediente " + ingrediente.getNombre() + " no se pudo añadir");
    }
}
