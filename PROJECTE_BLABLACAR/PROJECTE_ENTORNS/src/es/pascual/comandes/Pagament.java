package es.pascual.comandes;

import java.time.LocalDateTime;

public abstract class Pagament {

    private double importe;

    private LocalDateTime dataVenciment;

    public Pagament(double importe, LocalDateTime dataVenciment) {
        this.importe = importe;
        this.dataVenciment = dataVenciment;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
