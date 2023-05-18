package es.pascual;

import es.pascual.exceptions.IngredienteCaducadoExcepcion;
import es.pascual.tipo.Ingrediente;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Despensa {

    private Set<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new HashSet<>();
    }

    public void anyadirIngrediente(Ingrediente ingrediente) throws IngredienteCaducadoExcepcion {
        if (ingrediente.getFechaCaducidad().isBefore(LocalDate.now())) {
            throw new IngredienteCaducadoExcepcion(ingrediente);
        }
        ingredientes.add(ingrediente);
    }

}
