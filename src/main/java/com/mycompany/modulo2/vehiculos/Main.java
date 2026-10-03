package com.mycompany.modulo2.vehiculos;

/**
 * Prueba del Ejercicio 2: Sistema de Vehículos.
 *
 * @author Diego Suero - 2025-2470
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: SISTEMA DE VEHICULOS ===");

        // Los tres constructores sobrecargados
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("A123456");
        Vehiculo v3 = new Vehiculo("B654321", "Toyota", "Corolla");

        System.out.println("Vehiculo 1 (por defecto): " + v1);
        System.out.println("Vehiculo 2 (solo placa): " + v2);
        System.out.println("Vehiculo 3 (completo): " + v3);

        // Los tres metodos sobrecargados calcularMantenimiento()
        System.out.println();
        System.out.println("Mantenimiento solo km (10000): $" + v3.calcularMantenimiento(10000));
        System.out.println("Mantenimiento km + servicio (10000, frenos): $"
                + v3.calcularMantenimiento(10000, "frenos"));
        System.out.println("Mantenimiento km + servicio + garantia (10000, frenos, true): $"
                + v3.calcularMantenimiento(10000, "frenos", true));
    }
}
