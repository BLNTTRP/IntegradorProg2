package Entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private List<Sucursal> sucursales = new ArrayList<>();

    public Empresa(String nombre, String razonSocial, Integer cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
}
