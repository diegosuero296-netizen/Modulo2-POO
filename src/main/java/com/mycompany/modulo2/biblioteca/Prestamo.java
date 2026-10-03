package com.mycompany.modulo2.biblioteca;

import java.time.LocalDate;

/**
 * Registra un préstamo: la fecha, el usuario y el libro asociado.
 *
 * @author Diego Suero - 2025-2470
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    /**
     * Crea un préstamo.
     *
     * @param fecha   fecha en la que se realizó el préstamo
     * @param usuario usuario que recibe el libro
     * @param libro   libro prestado
     */
    public Prestamo(LocalDate fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    /** @return la fecha del préstamo */
    public LocalDate getFecha() {
        return fecha;
    }

    /** @return el usuario del préstamo */
    public Usuario getUsuario() {
        return usuario;
    }

    /** @return el libro prestado */
    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return "Prestamo[" + fecha + "] " + usuario.getNombre() + " -> " + libro.getTitulo();
    }
}
