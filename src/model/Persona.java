package model;

/**
 * Modela a una persona con datos de identificación y contacto.
 * Mantiene una relación de composición con {@link Direccion}.
 */

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private String rut;
    private String correo;
    private String telefono;

    /**
     * Construye una persona completa.
     *
     * @param nombre   nombre de la persona
     * @param edad     edad en años
     * @param direccion dirección de residencia (no nula)
     * @param rut      RUT formateado como texto (p. ej. {@code "12.345.678-9"})
     * @param correo   correo electrónico
     * @param telefono teléfono de contacto (puede incluir prefijo país)
     */

    public Persona(String nombre, int edad, Direccion direccion, String rut, String correo, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Retorna una representación legible de la persona,
     * incluyendo nombre, edad, dirección, RUT, correo y teléfono.
     *
     * @return texto con los datos principales de la persona
     */

    @Override
    public String toString() {
        return nombre +
                "\nEdad: " + edad +
                "\nDireccion:" + direccion +
                "\nRUT: " + rut +
                "\nCorreo: " + correo +
                "\nTeléfono: " + telefono;
    }
}
