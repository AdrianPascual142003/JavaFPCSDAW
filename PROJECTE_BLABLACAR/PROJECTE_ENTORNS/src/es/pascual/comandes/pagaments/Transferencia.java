package es.pascual.comandes.pagaments;

import es.pascual.comandes.Pagament;

import java.time.LocalDateTime;

public class Transferencia extends Pagament {

    private double divisa;

    public Transferencia(double importe, LocalDateTime dataVenciment, double divisa) {
        super(importe, dataVenciment);
        this.divisa = divisa;
    }

}
