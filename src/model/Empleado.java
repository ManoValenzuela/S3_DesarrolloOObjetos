package model;

/**
 * Representa un empleado de la empresa. Se compone de una {@link Persona}
 * y agrega datos propios del vínculo laboral como cargo y sueldo.
 */

public class Empleado {
    private Persona persona;
    private String cargo;
    private int sueldo;

    /**
     * Crea un empleado a partir de una persona.
     *
     * @param persona instancia base con los datos personales (no nula)
     * @param cargo   cargo o rol del empleado
     * @param sueldo  sueldo bruto mensual en pesos chilenos
     */

    public Empleado(Persona persona, String cargo, int sueldo) {
        this.persona = persona;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Retorna una representación textual del empleado,
     * incluyendo los datos de la persona, su cargo y sueldo.
     *
     * @return texto legible con la información del empleado
     */

    @Override
    public String toString() {
        return "Empleado: " +
                "\n" + persona +
                "\nCargo: " + cargo +
                "\nSueldo: " + sueldo;
    }
}
