package Entities;

import java.util.List;

public class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;
    private List<Promocion> promociones;
    private List<Imagen> imagenes;
    private UnidadMedida unidadMedida;
    private Categoria categoria;

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;

    }

    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Double getPrecioVenta() {return precioVenta;}

    public void setPrecioVenta(Double precioVenta) {this.precioVenta = precioVenta;}

    public List<Promocion> getPromociones() {return promociones;}

    public void setPromociones(List<Promocion> promociones) {this.promociones = promociones;}

    public List<Imagen> getImagenes() {return imagenes;}

    public void setImagenes(List<Imagen> imagenes) {this.imagenes = imagenes;}

    public UnidadMedida getUnidadMedida() {return unidadMedida;}

    public void setUnidadMedida(UnidadMedida unidadMedida) {this.unidadMedida = unidadMedida;}

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}
}
