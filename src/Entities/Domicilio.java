package Entities;

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
    private Provincia provincia;
    private Pais pais;


    public Domicilio(String calle, Integer numero, Integer cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Provincia getProvincia() { return provincia;}

    public void setProvincia(Provincia provincia) {this.provincia = provincia;}

    public Pais getPais() {return pais;}

    public void setPais(Pais pais) {this.pais = pais;}
}
