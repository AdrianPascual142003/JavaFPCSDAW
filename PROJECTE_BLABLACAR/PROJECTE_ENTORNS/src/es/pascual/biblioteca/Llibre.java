package es.pascual.biblioteca;

import es.pascual.biblioteca.enums.Genere;

public class Llibre {

    private String isbn;

    private String titol;

    private Genere genere;

    public Llibre(String isbn, String titol, Genere genere) {
        this.isbn = isbn;
        this.titol = titol;
        this.genere = genere;
    }

}
