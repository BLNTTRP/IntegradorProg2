package Entities;

import java.util.ArrayList;
import java.util.List;

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
    private List<Cliente> clientes = new ArrayList<>();


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

    public List<Cliente> getClientes() {return clientes;}

    public void setClientes(List<Cliente> clientes) {this.clientes = clientes;}
}
