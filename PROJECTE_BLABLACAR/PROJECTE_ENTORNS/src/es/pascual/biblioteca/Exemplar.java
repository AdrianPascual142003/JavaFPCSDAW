package es.pascual.biblioteca;

import es.pascual.biblioteca.enums.Estat;

public class Exemplar {

    private int id;

    private Estat estat;

    public Exemplar(int id, Estat estat) {
        this.id = id;
        this.estat = estat;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

}
