package com.mycompany.modulo2.biblioteca;

/**
 * Representa un libro de la biblioteca.
 *
 * @author Diego Suero - 2025-2470
 */
public class Libro {

    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    /**
     * Crea un libro. Todo libro nuevo comienza disponible.
     *
     * @param titulo título del libro
     * @param autor  autor del libro
     * @param isbn   código ISBN del libro
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    /**
     * Consulta si el libro está disponible para préstamo.
     *
     * @return true si está disponible, false si está prestado
     */
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    /** @return el título del libro */
    public String getTitulo() {
        return titulo;
    }

    /** @return el autor del libro */
    public String getAutor() {
        return autor;
    }

    /** @return el ISBN del libro */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Cambia el estado de disponibilidad del libro.
     *
     * @param disponible nuevo estado
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor + " (ISBN " + isbn + ")";
    }
}
