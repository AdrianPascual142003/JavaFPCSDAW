package es.pascual.comandes.pagaments;

import es.pascual.comandes.Pagament;

import java.time.LocalDateTime;

public class CriptoMoneda extends Pagament {

    private int cartera;

    public CriptoMoneda(double importe, LocalDateTime dataVenciment, int cartera) {
        super(importe, dataVenciment);
        this.cartera = cartera;
    }

}
