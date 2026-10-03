package com.mycompany.modulo2.vehiculos;

/**
 * Representa un automóvil. Incluye constructores y métodos sobrecargados.
 *
 * @author Diego Suero - 2025-2470
 */
public class Vehiculo {

    // Constantes usadas para estimar el costo de mantenimiento
    private static final double COSTO_BASE = 50.0;
    private static final double COSTO_POR_KM = 0.05;
    private static final double DESCUENTO_GARANTIA = 0.20;

    private String placa;
    private String marca;
    private String modelo;

    /**
     * Constructor por defecto: asigna valores genéricos.
     */
    public Vehiculo() {
        this("SIN-PLACA", "Generica", "Generico");
    }

    /**
     * Constructor básico: solo recibe la placa; marca y modelo quedan por defecto.
     *
     * @param placa placa del vehículo
     */
    public Vehiculo(String placa) {
        this(placa, "Generica", "Generico");
    }

    /**
     * Constructor completo.
     *
     * @param placa  placa del vehículo
     * @param marca  marca del vehículo
     * @param modelo modelo del vehículo
     */
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Calcula el costo estimado de mantenimiento según el kilometraje.
     *
     * @param km kilómetros recorridos
     * @return costo estimado
     */
    public double calcularMantenimiento(int km) {
        return COSTO_BASE + km * COSTO_POR_KM;
    }

    /**
     * Calcula el costo estimado según el kilometraje y el tipo de servicio.
     *
     * @param km           kilómetros recorridos
     * @param tipoServicio "aceite", "frenos" o "general" (otro valor usa una tarifa estándar)
     * @return costo estimado
     */
    public double calcularMantenimiento(int km, String tipoServicio) {
        double costoServicio;
        switch (tipoServicio.toLowerCase()) {
            case "aceite":
                costoServicio = 40.0;
                break;
            case "frenos":
                costoServicio = 120.0;
                break;
            case "general":
                costoServicio = 80.0;
                break;
            default:
                costoServicio = 60.0;
        }
        return calcularMantenimiento(km) + costoServicio;
    }

    /**
     * Calcula el costo estimado considerando también si el vehículo tiene garantía.
     * Con garantía se aplica un descuento del 20%.
     *
     * @param km           kilómetros recorridos
     * @param tipoServicio tipo de servicio
     * @param conGarantia  true si el vehículo está en garantía
     * @return costo estimado
     */
    public double calcularMantenimiento(int km, String tipoServicio, boolean conGarantia) {
        double costo = calcularMantenimiento(km, tipoServicio);
        if (conGarantia) {
            costo -= costo * DESCUENTO_GARANTIA;
        }
        return costo;
    }

    /** @return la placa del vehículo */
    public String getPlaca() {
        return placa;
    }

    /** @return la marca del vehículo */
    public String getMarca() {
        return marca;
    }

    /** @return el modelo del vehículo */
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (placa " + placa + ")";
    }
}
