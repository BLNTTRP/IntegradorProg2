package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import Enum.TipoPromocion;


public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private List<Sucursal> sucursales;
    private List<Imagen> imagenes;
    private List<Articulo> articulos;

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta,
                     LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento,
                     Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    // Getters y setters
    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public LocalDate getFechaDesde() {return fechaDesde;}

    public void setFechaDesde(LocalDate fechaDesde) {this.fechaDesde = fechaDesde;}

    public LocalDate getFechaHasta() {return fechaHasta;}

    public void setFechaHasta(LocalDate fechaHasta) {this.fechaHasta = fechaHasta;}

    public LocalTime getHoraDesde() {return horaDesde;}

    public void setHoraDesde(LocalTime horaDesde) {this.horaDesde = horaDesde;}

    public LocalTime getHoraHasta() {return horaHasta;}

    public void setHoraHasta(LocalTime horaHasta) {this.horaHasta = horaHasta;}

    public String getDescripcionDescuento() {return descripcionDescuento;}

    public void setDescripcionDescuento(String descripcionDescuento) {this.descripcionDescuento = descripcionDescuento;}

    public Double getPrecioPromocional() {return precioPromocional;}

    public void setPrecioPromocional(Double precioPromocional) {this.precioPromocional = precioPromocional;}

    public TipoPromocion getTipoPromocion() {return tipoPromocion;}

    public void setTipoPromocion(TipoPromocion tipoPromocion) {this.tipoPromocion = tipoPromocion;}

    public List<Sucursal> getSucursales() {return sucursales;}

    public void setSucursales(List<Sucursal> sucursales) {this.sucursales = sucursales;}

    public List<Imagen> getImagenes() {return imagenes;}

    public void setImagenes(List<Imagen> imagenes) {this.imagenes = imagenes;}

    public List<Articulo> getArticulos() {return articulos;}

    public void setArticulos(List<Articulo> articulos) {this.articulos = articulos;}
}

