package es.pascual.comandes.pagaments;

import es.pascual.comandes.Pagament;

import java.time.LocalDateTime;

public class Xec extends Pagament {

    private double numeroXec;

    private String nomEntitatBancaria;

    public Xec(double importe, LocalDateTime dataVenciment, double numeroXec, String nomEntitatBancaria) {
        super(importe, dataVenciment);
        this.numeroXec = numeroXec;
        this.nomEntitatBancaria = nomEntitatBancaria;
    }

}
