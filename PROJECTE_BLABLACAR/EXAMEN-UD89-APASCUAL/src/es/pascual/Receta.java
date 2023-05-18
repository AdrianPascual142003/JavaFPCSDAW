package es.pascual;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Receta {

    public static final int GRAMOS_EUROS = 100;
    private int id;

    private String nombre;

    private LocalDateTime fechaCreacion;

    private Set<PasoPreparacion> pasosPreparacion;

    public Receta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = LocalDateTime.now();
        this.pasosPreparacion = new HashSet<>();
    }

    public void anyadirPaso(PasoPreparacion pasoPreparacion) {
        pasosPreparacion.add(pasoPreparacion);
    }

    private double getCosteTotal() {
        double cantidadTotal = 0;
        for (PasoPreparacion pasoPreparacion : pasosPreparacion){
            double costeProducto = pasoPreparacion.getIngrediente().getPrecio();
            cantidadTotal += (costeProducto * pasoPreparacion.getCantidadIngrediente()) / GRAMOS_EUROS;
        }
        return cantidadTotal;
    }

    private int getTiempoRealizacion() {
        int tiempoTotal = 0;
        for (PasoPreparacion pasoPreparacion: pasosPreparacion) {
            tiempoTotal += pasoPreparacion.getTiempoRealizacion();
        }
        return tiempoTotal;
    }

    private boolean isFacilElaborar() {
        return getTiempoRealizacion() < 60;
    }

    private String getLocalDate() {
        return fechaCreacion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:ss"));
    }

    @Override
    public String toString() {
        return String.format("La receta con nombre %s, cuesta un total de %.2f, la creación de esta fue el " + getLocalDate() +  "%s es fácil de elaborar" ,nombre, getCosteTotal(), (!isFacilElaborar() ? " no":""));
    }
}
