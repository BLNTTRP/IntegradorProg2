package Entities;

public class Imagen extends Base {
    private String denominacion;
    private Articulo articulo;

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Articulo getArticulo() {return articulo;}

    public void setArticulo(Articulo articulo) {this.articulo = articulo;}
}
