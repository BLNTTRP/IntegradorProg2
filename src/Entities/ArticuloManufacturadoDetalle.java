package Entities;

public class ArticuloManufacturadoDetalle extends Base {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;
    private ArticuloManufacturado articuloManufacturado;

    public ArticuloManufacturadoDetalle(int cantidad, ArticuloInsumo articuloInsumo, ArticuloManufacturado articuloManufacturado) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public ArticuloInsumo getArticuloInsumo() {return articuloInsumo;}

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {this.articuloInsumo = articuloInsumo;}

    public ArticuloManufacturado getArticuloManufacturado() {return articuloManufacturado;}

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {this.articuloManufacturado = articuloManufacturado;}
}

