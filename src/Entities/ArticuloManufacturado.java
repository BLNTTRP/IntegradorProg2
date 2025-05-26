package Entities;

import java.util.List;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private String preparacion;
    private int tiempoEstimadoEnMinutos;
    private List<ArticuloManufacturadoDetalle> detalles;


    public ArticuloManufacturado(String denominacion, double precioVenta,String descripcion,String preparacion,int tiempoEstimadoEnMinutos  ) {
        super(denominacion, precioVenta);
        this.preparacion = preparacion;
        this.descripcion = descripcion;
        this.tiempoEstimadoEnMinutos = tiempoEstimadoEnMinutos;
    }

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getPreparacion() {return preparacion;}

    public void setPreparacion(String preparacion) {this.preparacion = preparacion;}

    public int getTiempoEstimadoEnMinutos() {return tiempoEstimadoEnMinutos;}

    public void setTiempoEstimadoEnMinutos(int tiempoEstimadoEnMinutos) {this.tiempoEstimadoEnMinutos = tiempoEstimadoEnMinutos;}
}
