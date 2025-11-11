package model;

/**
 * Representa una dirección postal básica compuesta por calle, ciudad y región.
 * Se utiliza por composición dentro de {@link Persona}.
 */

public class Direccion {
    private String calle;
    private String ciudad;
    private String region;

    /**
     * Crea una nueva dirección.
     *
     * @param calle  nombre de la calle (no nulo ni vacío)
     * @param ciudad ciudad o comuna (no nulo ni vacío)
     * @param region región administrativa (no nulo ni vacío)
     */

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Retorna la dirección formateada como texto legible:
     * {@code "calle, ciudad, región"}.
     *
     * @return representación textual de la dirección
     */

    @Override
    public String toString(){
        return " " + calle + ", " + ciudad + ", " + region;
    }
}
