package es.cipfpbatoi.ed.adrianpascualsilvestre;

/**
 *
 * Creación de una puerta para su uso
 *
 * <p>
 *     Esta clase sirve para crear una puerta la cual se puede usar
 *     a la hora de hacer una casa
 * </p>
 *
 * @author Adrian Pascual Silvestre
 * @version 1.2 version actual
 * @since 0.2 marzo de 2022
 */

public class Puerta implements Mueble {

    public static final int ALTURA_MINIMA_PUERTA_ALTA = 2;

    Estancia estancia;

    float base, altura;

    /**
     * Contructor con todo pasado
     * @param estancia la estancaia pasada
     * @param altura la altura de la puerta
     * @param base base de la puerta
     */
    public Puerta(Estancia estancia, float altura, float base) {
        this.estancia = estancia;
        this.altura = altura;
        this.base = base;
    }

    /**
     * Constructor con todo por defecto
     * @throws NullPointerException si la estancia no esta
     */
    public Puerta() {
        this(null, 2.11f, 0.925f);
    }

    /**
     * Sirve para obtener el tamaño
     * @return tamaño de la puerta
     */
    @Override
    public float obtenerTamaño()
    {
        return altura * base;
    }

    /**
     * Sirve para saber si si cumple la altura debida
     * @return si la puerta es más alta que la altura minima por puerta
     */
    public boolean esUnaPuertaAlta()
    {
        return altura >= ALTURA_MINIMA_PUERTA_ALTA;
    }

    /**
     * Sirve para obtener la informacion del objeto
     * @return la informacion de cada atributo
     */
    @Override
    public String toString() {
        return "Puerta{" +
                "estancia=" + estancia +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}

