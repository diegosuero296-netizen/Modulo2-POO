package com.mycompany.modulo2.telefonia;

/**
 * Prueba del Ejercicio 3: Empresa de Telefonía.
 *
 * @author Diego Suero - 2025-2470
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: EMPRESA DE TELEFONIA ===");

        Plan planBasico = new Plan(300, 5.0, 25.0);
        Plan planPremium = new Plan(1000, 20.0, 60.0);

        Cliente c1 = new Cliente("Ana Perez", "809-555-0101", planBasico);
        Cliente c2 = new Cliente("Luis Gomez", "829-555-0202", planPremium);

        // Ana excede minutos y datos
        Factura f1 = new Factura(c1, 350, 6.5);
        f1.generarFactura();

        // Luis no excede nada
        Factura f2 = new Factura(c2, 800, 12.0);
        f2.generarFactura();
    }
}
