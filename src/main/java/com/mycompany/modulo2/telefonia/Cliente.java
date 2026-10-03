package com.mycompany.modulo2.telefonia;

/**
 * Cliente de la empresa de telefonía. Tiene un {@link Plan} asociado.
 *
 * @author Diego Suero - 2025-2470
 */
public class Cliente {

    private String nombre;
    private String numeroTelefonico;
    private Plan plan;

    /**
     * Crea un cliente.
     *
     * @param nombre           nombre del cliente
     * @param numeroTelefonico número de teléfono del cliente
     * @param plan             plan contratado
     */
    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    /** @return el nombre del cliente */
    public String getNombre() {
        return nombre;
    }

    /** @return el número telefónico del cliente */
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    /** @return el plan del cliente */
    public Plan getPlan() {
        return plan;
    }
}
