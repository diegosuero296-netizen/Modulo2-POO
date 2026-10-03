package com.mycompany.modulo2.telefonia;

import java.util.Locale;

/**
 * Factura mensual de un cliente. Registra el consumo real y calcula los cargos
 * extras por exceso sobre lo incluido en el plan.
 *
 * @author Diego Suero - 2025-2470
 */
public class Factura {

    // Tarifas por exceso de consumo
    private static final double TARIFA_MINUTO_EXTRA = 0.50;
    private static final double TARIFA_GB_EXTRA = 2.00;

    private Cliente cliente;
    private int minutosUsados;
    private double datosUsadosGb;

    /**
     * Crea una factura.
     *
     * @param cliente       cliente al que se factura
     * @param minutosUsados minutos consumidos en el mes
     * @param datosUsadosGb gigabytes consumidos en el mes
     */
    public Factura(Cliente cliente, int minutosUsados, double datosUsadosGb) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGb = datosUsadosGb;
    }

    /**
     * Calcula el cargo por minutos que exceden los incluidos en el plan.
     *
     * @return cargo por exceso de minutos (0 si no hay exceso)
     */
    public double calcularCargoMinutos() {
        int exceso = minutosUsados - cliente.getPlan().getMinutosIncluidos();
        return exceso > 0 ? exceso * TARIFA_MINUTO_EXTRA : 0.0;
    }

    /**
     * Calcula el cargo por datos que exceden los incluidos en el plan.
     *
     * @return cargo por exceso de datos (0 si no hay exceso)
     */
    public double calcularCargoDatos() {
        double exceso = datosUsadosGb - cliente.getPlan().getDatosGb();
        return exceso > 0 ? exceso * TARIFA_GB_EXTRA : 0.0;
    }

    /**
     * Calcula el monto total: precio base del plan más los cargos por exceso.
     *
     * @return monto total a pagar
     */
    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + calcularCargoMinutos() + calcularCargoDatos();
    }

    /**
     * Muestra en consola un resumen detallado de la factura.
     */
    public void generarFactura() {
        Plan plan = cliente.getPlan();
        System.out.println("----------- FACTURA -----------");
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getNumeroTelefonico() + ")");
        System.out.println("Plan: " + plan.getMinutosIncluidos() + " min, " + plan.getDatosGb() + " GB");
        System.out.println("Consumo: " + minutosUsados + " min, " + datosUsadosGb + " GB");
        System.out.println(String.format(Locale.US, "Precio base:        $%.2f", plan.getPrecioMensual()));
        System.out.println(String.format(Locale.US, "Exceso minutos:     $%.2f", calcularCargoMinutos()));
        System.out.println(String.format(Locale.US, "Exceso datos:       $%.2f", calcularCargoDatos()));
        System.out.println(String.format(Locale.US, "TOTAL A PAGAR:      $%.2f", calcularTotal()));
        System.out.println("-------------------------------");
    }
}
