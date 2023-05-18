package es.pascual.comandes;

import java.util.ArrayList;

public class Comanda {

    private final static int COSTE_FIX = 9;

    private double importTotal;

    private ArrayList<Producte> productes;

    public Comanda() {
        this.productes = new ArrayList<>();
        this.importTotal = COSTE_FIX;
    }

    public double getImportTotal() {
        double total = importTotal;
        double totalProductes = 0;
        for(Producte producte : productes) {
            if (producte.isDisponible()) {
                totalProductes += producte.getPreu() + producte.getImpost();

            }
        }
        return total + totalProductes;
    }

    public void pagar(Pagament tipuspagament) {
        tipuspagament.setImporte(getImportTotal());
    }

}
