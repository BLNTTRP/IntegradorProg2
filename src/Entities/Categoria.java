package Entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base{
    private String denominacion;
    private List<Sucursal> sucursales;

    public Categoria (String denominacion){
        this.denominacion = denominacion;
    }

    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public List<Sucursal> getSucursales() {return sucursales;}

    public void setSucursales(List<Sucursal> sucursales) {this.sucursales = sucursales;}
}
