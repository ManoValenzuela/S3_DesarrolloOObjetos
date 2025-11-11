package model;

/**
 * Representa un cliente asociado a la empresa. Se compone de una {@link Persona}
 * y agrega atributos propios del cliente como si es nuevo y su categoría.
 */

public class Cliente {
    private Persona persona;
    private boolean nuevoCliente;
    private String categoria;

    /**
     * Crea un cliente a partir de una persona.
     *
     * @param persona       datos personales del cliente (no nula)
     * @param nuevoCliente  indica si el cliente es nuevo en el sistema
     * @param categoria     categoría comercial (p. ej. "Restaurantes")
     */

    public Cliente(Persona persona, boolean nuevoCliente, String categoria) {
        this.persona = persona;
        this.nuevoCliente = nuevoCliente;
        this.categoria = categoria;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isNuevoCliente() {
        return nuevoCliente;
    }

    public void setNuevoCliente(boolean nuevoCliente) {
        this.nuevoCliente = nuevoCliente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna una representación textual del cliente,
     * mostrando los datos personales, si es nuevo y su categoría.
     *
     * @return texto legible con la información del cliente
     */

    @Override
    public String toString() {
        return "Cliente: " +
                "\n" + persona +
                "\nNuevo Cliente: " + (nuevoCliente? "Sí" : "No") +
                "\nCategoría: " + categoria;
    }
}
