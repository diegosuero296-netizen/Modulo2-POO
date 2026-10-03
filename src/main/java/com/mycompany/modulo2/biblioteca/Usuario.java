package com.mycompany.modulo2.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Usuario de la biblioteca. Mantiene la colección de libros que tiene prestados.
 *
 * @author Diego Suero - 2025-2470
 */
public class Usuario {

    // Contador compartido para asignar un ID único a cada usuario
    private static int contadorId = 1;

    private String nombre;
    private int id;
    private List<Libro> librosPrestados;

    /**
     * Crea un usuario con un ID único generado automáticamente.
     *
     * @param nombre nombre del usuario
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = contadorId++;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Presta un libro al usuario si el libro está disponible.
     *
     * @param libro libro que se desea prestar
     * @return el {@link Prestamo} creado, o null si el libro no está disponible
     */
    public Prestamo prestarLibro(Libro libro) {
        if (!libro.consultarDisponibilidad()) {
            return null; // el libro ya está prestado
        }
        libro.setDisponible(false);
        librosPrestados.add(libro);
        return new Prestamo(LocalDate.now(), this, libro);
    }

    /**
     * Devuelve un libro que el usuario tenía prestado.
     *
     * @param libro libro que se devuelve
     * @return true si el usuario tenía el libro y se devolvió, false en caso contrario
     */
    public boolean devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setDisponible(true);
            return true;
        }
        return false;
    }

    /** @return el nombre del usuario */
    public String getNombre() {
        return nombre;
    }

    /** @return el ID único del usuario */
    public int getId() {
        return id;
    }

    /** @return una copia de la lista de libros que el usuario tiene prestados */
    public List<Libro> getLibrosPrestados() {
        return new ArrayList<>(librosPrestados);
    }
}
