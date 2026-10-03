package com.mycompany.modulo2.biblioteca;

/**
 * Prueba del Ejercicio 1: Sistema de Biblioteca.
 *
 * @author Diego Suero - 2025-2470
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: SISTEMA DE BIBLIOTECA ===");

        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", "978-0307474728");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8420412146");
        Usuario ana = new Usuario("Ana Perez");
        Usuario luis = new Usuario("Luis Gomez");

        System.out.println("Libro 1 disponible: " + libro1.consultarDisponibilidad());

        // Ana presta el libro 1
        Prestamo p1 = ana.prestarLibro(libro1);
        System.out.println("Prestamo realizado: " + p1);
        System.out.println("Libro 1 disponible: " + libro1.consultarDisponibilidad());

        // Luis intenta prestar el mismo libro (no debe poder)
        Prestamo p2 = luis.prestarLibro(libro1);
        System.out.println("Luis intenta prestar el libro 1: " + (p2 == null ? "NO disponible" : p2));

        // Luis presta el libro 2
        System.out.println("Prestamo realizado: " + luis.prestarLibro(libro2));
        System.out.println("Libros de Ana: " + ana.getLibrosPrestados().size());

        // Ana devuelve el libro 1
        System.out.println("Ana devuelve el libro 1: " + ana.devolverLibro(libro1));
        System.out.println("Libro 1 disponible: " + libro1.consultarDisponibilidad());
        System.out.println("Libros de Ana: " + ana.getLibrosPrestados().size());
    }
}
