package es.pascual.biblioteca;

public class Prestec {

    private final static int PLAS_MAXIM_DIES = 30;

    private Data dataInicial;

    private Data dataFinal;

    private Data dataDevolucio;

    public Prestec(Data dataInicial, Data dataDevolucio) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataInicial.anyadir(PLAS_MAXIM_DIES);
        this.dataDevolucio = dataDevolucio;
    }

}
