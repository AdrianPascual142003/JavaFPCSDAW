package es.pascual.biblioteca;

import es.pascual.biblioteca.enums.Estat;

import java.util.ArrayList;

public class Lector {

    private String nom;

    private String adresa;

    private String telefono;

    private Data sancionatFins;

    public Lector(String nom, String adresa, String telefono, Data sancionatFins) {
        this.nom = nom;
        this.adresa = adresa;
        this.telefono = telefono;
        this.sancionatFins = sancionatFins;
    }

    public boolean prestec(Exemplar exemplar) {
        return exemplar.getEstat() == Estat.ENREPARACIO;
    }

    public void devolucio(Exemplar exemplar) {
        exemplar.setEstat(Estat.DISPONIBLE);
    }

    public ArrayList<Sancio> getSancions() {
        return new ArrayList<>();
    }

}
