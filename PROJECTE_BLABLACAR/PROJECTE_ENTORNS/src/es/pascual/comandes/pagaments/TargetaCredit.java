package es.pascual.comandes.pagaments;

import es.pascual.comandes.Pagament;

import java.time.LocalDateTime;

public class TargetaCredit extends Pagament {

    private int numero;

    private LocalDateTime dataCaducitat;

    public TargetaCredit(double importe, LocalDateTime dataVenciment, int numero, LocalDateTime dataCaducitat) {
        super(importe, dataVenciment);
        this.numero = numero;
        this.dataCaducitat = dataCaducitat;
    }

}
