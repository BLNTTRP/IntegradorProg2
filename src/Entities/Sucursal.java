package Entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Empresa empresa;
    private List<Categoria> categorias = new ArrayList<>();

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Empresa getEmpresa() {return empresa;}

    public void setEmpresa(Empresa empresa) {this.empresa = empresa;}

    public List<Categoria> getCategorias() {return categorias;}

    public void setCategorias(List<Categoria> categorias) {this.categorias = categorias;}
}
