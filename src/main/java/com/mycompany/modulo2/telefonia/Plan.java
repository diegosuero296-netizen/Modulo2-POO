package com.mycompany.modulo2.telefonia;

/**
 * Plan de telefonía contratado por un cliente.
 *
 * @author Diego Suero - 2025-2470
 */
public class Plan {

    private int minutosIncluidos;
    private double datosGb;
    private double precioMensual;

    /**
     * Crea un plan.
     *
     * @param minutosIncluidos minutos que incluye el plan cada mes
     * @param datosGb          gigabytes de datos incluidos
     * @param precioMensual    precio base mensual
     */
    public Plan(int minutosIncluidos, double datosGb, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGb = datosGb;
        this.precioMensual = precioMensual;
    }

    /** @return los minutos incluidos */
    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    /** @return los GB de datos incluidos */
    public double getDatosGb() {
        return datosGb;
    }

    /** @return el precio mensual del plan */
    public double getPrecioMensual() {
        return precioMensual;
    }
}
