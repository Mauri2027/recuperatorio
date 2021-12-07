package Models;

public class Auto {
    private String patente;
    private String color;
    private String dominio;
    private String radicacion;
    private boolean habilitado;
    private long infracciones;
    private String origen;
    private String seguro;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getRadicacion() {
        return radicacion;
    }

    public void setRadicacion(String radicacion) {
        this.radicacion = radicacion;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public long getInfracciones() {
        return infracciones;
    }

    public void setInfracciones(long infracciones) {
        this.infracciones = infracciones;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
}
