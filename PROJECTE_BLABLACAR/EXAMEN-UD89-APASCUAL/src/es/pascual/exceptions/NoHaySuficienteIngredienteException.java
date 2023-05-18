package es.pascual.exceptions;

public class NoHaySuficienteIngredienteException extends RuntimeException {

    public NoHaySuficienteIngredienteException() {
        super("No hay suficiente ingrediente para realizar el paso");
    }
}
