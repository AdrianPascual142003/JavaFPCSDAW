package es.pascual;

import es.pascual.enums.TipoManipulacion;
import es.pascual.exceptions.NoHaySuficienteIngredienteException;
import es.pascual.tipo.Ingrediente;

import java.util.Objects;

public class PasoPreparacion {

    private TipoManipulacion tipoManipulacion;

    private Ingrediente ingrediente;

    private double cantidadIngrediente;

    private int tiempoRealizacion;

    public PasoPreparacion(TipoManipulacion tipoManipulacion, Ingrediente ingrediente, double cantidadIngrediente, int tiempoRealizacion) {
        this.tipoManipulacion = tipoManipulacion;
        this.ingrediente = ingrediente;
        this.tiempoRealizacion = tiempoRealizacion;
        checkCantidad(cantidadIngrediente);
    }

    private void checkCantidad(double cantidadIngrediente) {
        if (cantidadIngrediente > getIngrediente().getCantidadAlmacenada()) {
            throw new NoHaySuficienteIngredienteException();
        }
        this.cantidadIngrediente = cantidadIngrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasoPreparacion)) return false;
        PasoPreparacion that = (PasoPreparacion) o;
        return tipoManipulacion == that.tipoManipulacion && Objects.equals(ingrediente, that.ingrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoManipulacion, ingrediente);
    }

    public int getTiempoRealizacion() {
        return tiempoRealizacion;
    }

}
