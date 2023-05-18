package es.pascual.comandes;

public class Producte {

    private double preu;

    private double impost;

    private int cantitatStock;

    public Producte(double preu, double impost, int cantitatStock) {
        this.preu = preu;
        this.impost = impost;
        this.cantitatStock = cantitatStock;
    }

    public boolean isDisponible() {
        return cantitatStock >= 1;
    }

    public double getPreu() {
        return preu;
    }

    public double getImpost() {
        return impost;
    }

}
